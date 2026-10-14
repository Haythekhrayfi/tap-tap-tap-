package okhttp3.internal.connection;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ed.j;
import ed.q;
import fd.j0;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kc.m;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.CipherSuite;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import qd.b0;
import qd.e;
import qd.f;
import qd.o;
import uc.a;
import vc.g;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    public static final Companion Companion = new Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit;
    private final List<Reference<RealCall>> calls;
    private final RealConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private e sink;
    private Socket socket;
    private f source;
    private int successCount;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final RealConnection newTestConnection(RealConnectionPool realConnectionPool, Route route, Socket socket, long j10) {
            j0.i(realConnectionPool, "connectionPool");
            j0.i(route, "route");
            j0.i(socket, "socket");
            RealConnection realConnection = new RealConnection(realConnectionPool, route);
            realConnection.socket = socket;
            realConnection.setIdleAtNs$okhttp(j10);
            return realConnection;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.RealConnection$connectTls$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l implements a<List<? extends Certificate>> {
        public final /* synthetic */ Address $address;
        public final /* synthetic */ CertificatePinner $certificatePinner;
        public final /* synthetic */ Handshake $unverifiedHandshake;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
            super(0);
            this.$certificatePinner = certificatePinner;
            this.$unverifiedHandshake = handshake;
            this.$address = address;
        }

        @Override // uc.a
        public final List<? extends Certificate> invoke() {
            CertificateChainCleaner certificateChainCleaner$okhttp = this.$certificatePinner.getCertificateChainCleaner$okhttp();
            j0.f(certificateChainCleaner$okhttp);
            return certificateChainCleaner$okhttp.clean(this.$unverifiedHandshake.peerCertificates(), this.$address.url().host());
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.RealConnection$connectTls$2, reason: invalid class name */
    public static final class AnonymousClass2 extends l implements a<List<? extends X509Certificate>> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // uc.a
        public final List<? extends X509Certificate> invoke() {
            Handshake handshake = RealConnection.this.handshake;
            j0.f(handshake);
            List<Certificate> listPeerCertificates = handshake.peerCertificates();
            ArrayList arrayList = new ArrayList(m.j(listPeerCertificates, 10));
            Iterator<T> it = listPeerCertificates.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route) {
        j0.i(realConnectionPool, "connectionPool");
        j0.i(route, "route");
        this.connectionPool = realConnectionPool;
        this.route = route;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = RecyclerView.FOREVER_NS;
    }

    private final boolean certificateSupportHost(HttpUrl httpUrl, Handshake handshake) {
        List<Certificate> listPeerCertificates = handshake.peerCertificates();
        return (listPeerCertificates.isEmpty() ^ true) && OkHostnameVerifier.INSTANCE.verify(httpUrl.host(), (X509Certificate) listPeerCertificates.get(0));
    }

    private final void connectSocket(int i10, int i11, Call call, EventListener eventListener) throws IOException {
        Socket socketCreateSocket;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        Proxy.Type type = proxy.type();
        int i12 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = address.socketFactory().createSocket();
            j0.f(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.rawSocket = socketCreateSocket;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        socketCreateSocket.setSoTimeout(i11);
        try {
            Platform.Companion.get().connectSocket(socketCreateSocket, this.route.socketAddress(), i10);
            try {
                this.source = o.c(o.h(socketCreateSocket));
                this.sink = o.b(o.e(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (j0.d(e10.getMessage(), NPE_THROW_WITH_NULL)) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException(j0.p("Failed to connect to ", this.route.socketAddress()));
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void connectTls(ConnectionSpecSelector connectionSpecSelector) throws Throwable {
        Address address = this.route.address();
        SSLSocketFactory sslSocketFactory = address.sslSocketFactory();
        SSLSocket sSLSocket = null;
        try {
            j0.f(sslSocketFactory);
            Socket socketCreateSocket = sslSocketFactory.createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                ConnectionSpec connectionSpecConfigureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket2);
                if (connectionSpecConfigureSecureSocket.supportsTlsExtensions()) {
                    Platform.Companion.get().configureTlsExtensions(sSLSocket2, address.url().host(), address.protocols());
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                Handshake.Companion companion = Handshake.Companion;
                j0.h(session, "sslSocketSession");
                Handshake handshake = companion.get(session);
                HostnameVerifier hostnameVerifier = address.hostnameVerifier();
                j0.f(hostnameVerifier);
                if (hostnameVerifier.verify(address.url().host(), session)) {
                    CertificatePinner certificatePinner = address.certificatePinner();
                    j0.f(certificatePinner);
                    this.handshake = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new AnonymousClass1(certificatePinner, handshake, address));
                    certificatePinner.check$okhttp(address.url().host(), new AnonymousClass2());
                    String selectedProtocol = connectionSpecConfigureSecureSocket.supportsTlsExtensions() ? Platform.Companion.get().getSelectedProtocol(sSLSocket2) : null;
                    this.socket = sSLSocket2;
                    this.source = o.c(o.h(sSLSocket2));
                    this.sink = o.b(o.e(sSLSocket2));
                    this.protocol = selectedProtocol != null ? Protocol.Companion.get(selectedProtocol) : Protocol.HTTP_1_1;
                    Platform.Companion.get().afterHandshake(sSLSocket2);
                    return;
                }
                List<Certificate> listPeerCertificates = handshake.peerCertificates();
                if (!(!listPeerCertificates.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) listPeerCertificates.get(0);
                throw new SSLPeerUnverifiedException(j.d("\n              |Hostname " + address.url().host() + " not verified:\n              |    certificate: " + CertificatePinner.Companion.pin(x509Certificate) + "\n              |    DN: " + ((Object) x509Certificate.getSubjectDN().getName()) + "\n              |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n              ", null, 1));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Platform.Companion.get().afterHandshake(sSLSocket);
                }
                if (sSLSocket != null) {
                    Util.closeQuietly((Socket) sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void connectTunnel(int i10, int i11, int i12, Call call, EventListener eventListener) throws IOException {
        Request requestCreateTunnelRequest = createTunnelRequest();
        HttpUrl httpUrlUrl = requestCreateTunnelRequest.url();
        int i13 = 0;
        while (i13 < 21) {
            i13++;
            connectSocket(i10, i11, call, eventListener);
            requestCreateTunnelRequest = createTunnel(i11, i12, requestCreateTunnelRequest, httpUrlUrl);
            if (requestCreateTunnelRequest == null) {
                return;
            }
            Socket socket = this.rawSocket;
            if (socket != null) {
                Util.closeQuietly(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
        }
    }

    private final Request createTunnel(int i10, int i11, Request request, HttpUrl httpUrl) throws IOException {
        StringBuilder sbA = defpackage.a.a("CONNECT ");
        sbA.append(Util.toHostHeader(httpUrl, true));
        sbA.append(" HTTP/1.1");
        String string = sbA.toString();
        while (true) {
            f fVar = this.source;
            j0.f(fVar);
            e eVar = this.sink;
            j0.f(eVar);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, fVar, eVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            fVar.timeout().timeout(i10, timeUnit);
            eVar.timeout().timeout(i11, timeUnit);
            http1ExchangeCodec.writeRequest(request.headers(), string);
            http1ExchangeCodec.finishRequest();
            Response.Builder responseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            j0.f(responseHeaders);
            Response responseBuild = responseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(responseBuild);
            int iCode = responseBuild.code();
            if (iCode == 200) {
                if (fVar.r().y() && eVar.r().y()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iCode != 407) {
                throw new IOException(j0.p("Unexpected response code for CONNECT: ", Integer.valueOf(responseBuild.code())));
            }
            Request requestAuthenticate = this.route.address().proxyAuthenticator().authenticate(this.route, responseBuild);
            if (requestAuthenticate == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (q.i("close", Response.header$default(responseBuild, "Connection", null, 2, null), true)) {
                return requestAuthenticate;
            }
            request = requestAuthenticate;
        }
    }

    private final Request createTunnelRequest() throws IOException {
        Request requestBuild = new Request.Builder().url(this.route.address().url()).method("CONNECT", null).header("Host", Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Util.userAgent).build();
        Request requestAuthenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(requestBuild).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        return requestAuthenticate == null ? requestBuild : requestAuthenticate;
    }

    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i10, Call call, EventListener eventListener) throws Throwable {
        if (this.route.address().sslSocketFactory() != null) {
            eventListener.secureConnectStart(call);
            connectTls(connectionSpecSelector);
            eventListener.secureConnectEnd(call, this.handshake);
            if (this.protocol == Protocol.HTTP_2) {
                startHttp2(i10);
                return;
            }
            return;
        }
        List<Protocol> listProtocols = this.route.address().protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!listProtocols.contains(protocol)) {
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
        } else {
            this.socket = this.rawSocket;
            this.protocol = protocol;
            startHttp2(i10);
        }
    }

    private final boolean routeMatchesAny(List<Route> list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Route route : list) {
                if (route.proxy().type() == Proxy.Type.DIRECT && this.route.proxy().type() == Proxy.Type.DIRECT && j0.d(this.route.socketAddress(), route.socketAddress())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void startHttp2(int i10) throws IOException {
        Socket socket = this.socket;
        j0.f(socket);
        f fVar = this.source;
        j0.f(fVar);
        e eVar = this.sink;
        j0.f(eVar);
        socket.setSoTimeout(0);
        Http2Connection http2ConnectionBuild = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket, this.route.address().url().host(), fVar, eVar).listener(this).pingIntervalMillis(i10).build();
        this.http2Connection = http2ConnectionBuild;
        this.allocationLimit = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(http2ConnectionBuild, false, null, 3, null);
    }

    private final boolean supportsUrl(HttpUrl httpUrl) {
        Handshake handshake;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sbA = defpackage.a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        HttpUrl httpUrlUrl = this.route.address().url();
        if (httpUrl.port() != httpUrlUrl.port()) {
            return false;
        }
        if (j0.d(httpUrl.host(), httpUrlUrl.host())) {
            return true;
        }
        if (this.noCoalescedConnections || (handshake = this.handshake) == null) {
            return false;
        }
        j0.f(handshake);
        return certificateSupportHost(httpUrl, handshake);
    }

    public final void cancel() {
        Socket socket = this.rawSocket;
        if (socket == null) {
            return;
        }
        Util.closeQuietly(socket);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0134  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[LOOP:0: B:67:0x008c->B:77:?, LOOP_END, SYNTHETIC] */
    public final void connect(int i10, int i11, int i12, int i13, boolean z10, Call call, EventListener eventListener) throws Throwable {
        Socket socket;
        Socket socket2;
        j0.i(call, "call");
        j0.i(eventListener, "eventListener");
        if (!(this.protocol == null)) {
            throw new IllegalStateException("already connected".toString());
        }
        List<ConnectionSpec> listConnectionSpecs = this.route.address().connectionSpecs();
        ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(listConnectionSpecs);
        if (this.route.address().sslSocketFactory() == null) {
            if (!listConnectionSpecs.contains(ConnectionSpec.CLEARTEXT)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strHost = this.route.address().url().host();
            if (!Platform.Companion.get().isCleartextTrafficPermitted(strHost)) {
                throw new RouteException(new UnknownServiceException(androidx.activity.j.a("CLEARTEXT communication to ", strHost, " not permitted by network security policy")));
            }
        } else if (this.route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                if (this.route.requiresTunnel()) {
                    connectTunnel(i10, i11, i12, call, eventListener);
                    if (this.rawSocket == null) {
                        break;
                    }
                } else {
                    try {
                        connectSocket(i10, i11, call, eventListener);
                    } catch (IOException e10) {
                        e = e10;
                        socket = this.socket;
                        if (socket != null) {
                            Util.closeQuietly(socket);
                        }
                        socket2 = this.rawSocket;
                        if (socket2 != null) {
                            Util.closeQuietly(socket2);
                        }
                        this.socket = null;
                        this.rawSocket = null;
                        this.source = null;
                        this.sink = null;
                        this.handshake = null;
                        this.protocol = null;
                        this.http2Connection = null;
                        this.allocationLimit = 1;
                        eventListener.connectFailed(call, this.route.socketAddress(), this.route.proxy(), null, e);
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            routeException.addConnectException(e);
                        }
                        if (z10) {
                            throw routeException;
                        }
                        if (connectionSpecSelector.connectionFailed(e)) {
                            throw routeException;
                        }
                    }
                }
                try {
                    establishProtocol(connectionSpecSelector, i13, call, eventListener);
                    eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), this.protocol);
                    break;
                } catch (IOException e11) {
                    e = e11;
                    socket = this.socket;
                    if (socket != null) {
                        Util.closeQuietly(socket);
                    }
                    socket2 = this.rawSocket;
                    if (socket2 != null) {
                        Util.closeQuietly(socket2);
                    }
                    this.socket = null;
                    this.rawSocket = null;
                    this.source = null;
                    this.sink = null;
                    this.handshake = null;
                    this.protocol = null;
                    this.http2Connection = null;
                    this.allocationLimit = 1;
                    eventListener.connectFailed(call, this.route.socketAddress(), this.route.proxy(), null, e);
                    if (routeException == null) {
                        routeException = new RouteException(e);
                    } else {
                        routeException.addConnectException(e);
                    }
                    if (z10) {
                        throw routeException;
                    }
                    if (connectionSpecSelector.connectionFailed(e)) {
                        throw routeException;
                    }
                }
            } catch (IOException e12) {
                e = e12;
            }
        }
        if (this.route.requiresTunnel() && this.rawSocket == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.idleAtNs = System.nanoTime();
    }

    public final void connectFailed$okhttp(OkHttpClient okHttpClient, Route route, IOException iOException) {
        j0.i(okHttpClient, "client");
        j0.i(route, "failedRoute");
        j0.i(iOException, "failure");
        if (route.proxy().type() != Proxy.Type.DIRECT) {
            Address address = route.address();
            address.proxySelector().connectFailed(address.url().uri(), route.proxy().address(), iOException);
        }
        okHttpClient.getRouteDatabase().failed(route);
    }

    public final List<Reference<RealCall>> getCalls() {
        return this.calls;
    }

    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs$okhttp() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    @Override // okhttp3.Connection
    public Handshake handshake() {
        return this.handshake;
    }

    public final synchronized void incrementSuccessCount$okhttp() {
        this.successCount++;
    }

    public final boolean isEligible$okhttp(Address address, List<Route> list) {
        j0.i(address, "address");
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sbA = defpackage.a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address)) {
            return false;
        }
        if (j0.d(address.url().host(), route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || list == null || !routeMatchesAny(list) || address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            CertificatePinner certificatePinner = address.certificatePinner();
            j0.f(certificatePinner);
            String strHost = address.url().host();
            Handshake handshake = handshake();
            j0.f(handshake);
            certificatePinner.check(strHost, handshake.peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean isHealthy(boolean z10) {
        long idleAtNs$okhttp;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sbA = defpackage.a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.rawSocket;
        j0.f(socket);
        Socket socket2 = this.socket;
        j0.f(socket2);
        f fVar = this.source;
        j0.f(fVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return http2Connection.isHealthy(jNanoTime);
        }
        synchronized (this) {
            idleAtNs$okhttp = jNanoTime - getIdleAtNs$okhttp();
        }
        if (idleAtNs$okhttp < IDLE_CONNECTION_HEALTHY_NS || !z10) {
            return true;
        }
        return Util.isHealthy(socket2, fVar);
    }

    public final boolean isMultiplexed$okhttp() {
        return this.http2Connection != null;
    }

    public final ExchangeCodec newCodec$okhttp(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) throws SocketException {
        j0.i(okHttpClient, "client");
        j0.i(realInterceptorChain, "chain");
        Socket socket = this.socket;
        j0.f(socket);
        f fVar = this.source;
        j0.f(fVar);
        e eVar = this.sink;
        j0.f(eVar);
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        socket.setSoTimeout(realInterceptorChain.readTimeoutMillis());
        b0 b0VarTimeout = fVar.timeout();
        long readTimeoutMillis$okhttp = realInterceptorChain.getReadTimeoutMillis$okhttp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b0VarTimeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        eVar.timeout().timeout(realInterceptorChain.getWriteTimeoutMillis$okhttp(), timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, fVar, eVar);
    }

    public final RealWebSocket.Streams newWebSocketStreams$okhttp(final Exchange exchange) throws SocketException {
        j0.i(exchange, "exchange");
        Socket socket = this.socket;
        j0.f(socket);
        final f fVar = this.source;
        j0.f(fVar);
        final e eVar = this.sink;
        j0.f(eVar);
        socket.setSoTimeout(0);
        noNewExchanges$okhttp();
        return new RealWebSocket.Streams(eVar, exchange) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            public final /* synthetic */ Exchange $exchange;
            public final /* synthetic */ e $sink;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true, this.$source, eVar);
                this.$sink = eVar;
                this.$exchange = exchange;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.$exchange.bodyComplete(-1L, true, true, null);
            }
        };
    }

    public final synchronized void noCoalescedConnections$okhttp() {
        this.noCoalescedConnections = true;
    }

    public final synchronized void noNewExchanges$okhttp() {
        this.noNewExchanges = true;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public synchronized void onSettings(Http2Connection http2Connection, Settings settings) {
        j0.i(http2Connection, "connection");
        j0.i(settings, "settings");
        this.allocationLimit = settings.getMaxConcurrentStreams();
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(Http2Stream http2Stream) throws IOException {
        j0.i(http2Stream, "stream");
        http2Stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.Connection
    public Protocol protocol() {
        Protocol protocol = this.protocol;
        j0.f(protocol);
        return protocol;
    }

    @Override // okhttp3.Connection
    public Route route() {
        return this.route;
    }

    public final void setIdleAtNs$okhttp(long j10) {
        this.idleAtNs = j10;
    }

    public final void setNoNewExchanges(boolean z10) {
        this.noNewExchanges = z10;
    }

    public final void setRouteFailureCount$okhttp(int i10) {
        this.routeFailureCount = i10;
    }

    @Override // okhttp3.Connection
    public Socket socket() {
        Socket socket = this.socket;
        j0.f(socket);
        return socket;
    }

    public String toString() {
        CipherSuite cipherSuite;
        StringBuilder sbA = defpackage.a.a("Connection{");
        sbA.append(this.route.address().url().host());
        sbA.append(CoreConstants.COLON_CHAR);
        sbA.append(this.route.address().url().port());
        sbA.append(", proxy=");
        sbA.append(this.route.proxy());
        sbA.append(" hostAddress=");
        sbA.append(this.route.socketAddress());
        sbA.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        Object obj = "none";
        if (handshake != null && (cipherSuite = handshake.cipherSuite()) != null) {
            obj = cipherSuite;
        }
        sbA.append(obj);
        sbA.append(" protocol=");
        sbA.append(this.protocol);
        sbA.append('}');
        return sbA.toString();
    }

    public final synchronized void trackFailure$okhttp(RealCall realCall, IOException iOException) {
        int i10;
        j0.i(realCall, "call");
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                int i11 = this.refusedStreamCount + 1;
                this.refusedStreamCount = i11;
                if (i11 > 1) {
                    this.noNewExchanges = true;
                    i10 = this.routeFailureCount;
                    this.routeFailureCount = i10 + 1;
                }
            } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !realCall.isCanceled()) {
                this.noNewExchanges = true;
                i10 = this.routeFailureCount;
                this.routeFailureCount = i10 + 1;
            }
        } else if (!isMultiplexed$okhttp() || (iOException instanceof ConnectionShutdownException)) {
            this.noNewExchanges = true;
            if (this.successCount == 0) {
                if (iOException != null) {
                    connectFailed$okhttp(realCall.getClient(), this.route, iOException);
                }
                i10 = this.routeFailureCount;
                this.routeFailureCount = i10 + 1;
            }
        }
    }
}
