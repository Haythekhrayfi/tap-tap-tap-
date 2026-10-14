package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public class qq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile qq0 f24559a = a.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f24560b = Logger.getLogger(yn0.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f24561c = 0;

    public static final class a {
        public static final qq0 a() {
            if (!c()) {
                n70 n70Var = n70.f23244d ? new n70() : null;
                if (n70Var != null) {
                    return n70Var;
                }
                int i10 = m70.f22926i;
                m70 m70VarA = m70.b.a();
                return m70VarA != null ? m70VarA : new qq0();
            }
            d9.a();
            int i11 = a9.f18812f;
            a9 a9VarA = a9.a.a();
            if (a9VarA != null) {
                return a9VarA;
            }
            int i12 = g9.f20978g;
            g9 g9VarA = g9.a.a();
            fd.j0.f(g9VarA);
            return g9VarA;
        }

        public static ArrayList a(List list) {
            fd.j0.i(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((nt0) obj) != nt0.f23544b) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(kc.m.j(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((nt0) it.next()).toString());
            }
            return arrayList2;
        }

        public static qq0 b() {
            return qq0.f24559a;
        }

        public static byte[] b(List list) {
            fd.j0.i(list, "protocols");
            qd.c cVar = new qd.c();
            for (String str : a(list)) {
                cVar.R(str.length());
                cVar.e0(str);
            }
            return cVar.x();
        }

        public static boolean c() {
            return fd.j0.d("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    public static void a(int i10, String str, Throwable th) {
        fd.j0.i(str, "message");
        f24560b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public static /* synthetic */ void a(qq0 qq0Var, String str, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        Objects.requireNonNull(qq0Var);
        a(i10, str, (Throwable) null);
    }

    public static SSLSocketFactory c(X509TrustManager x509TrustManager) {
        fd.j0.i(x509TrustManager, "trustManager");
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            fd.j0.h(sSLContext, "getInstance(\"TLS\")");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            fd.j0.h(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public static X509TrustManager c() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        fd.j0.f(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            fd.j0.g(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder sbA = v60.a("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        fd.j0.h(string, "toString(this)");
        sbA.append(string);
        throw new IllegalStateException(sbA.toString().toString());
    }

    public lh a(X509TrustManager x509TrustManager) {
        fd.j0.i(x509TrustManager, "trustManager");
        return new pe(b(x509TrustManager));
    }

    public void a(Object obj, String str) {
        fd.j0.i(str, "message");
        if (obj == null) {
            str = fn1.a(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        a(5, str, (Throwable) obj);
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        fd.j0.i(socket, "socket");
        fd.j0.i(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    public void a(SSLSocket sSLSocket) {
        fd.j0.i(sSLSocket, "sslSocket");
    }

    public void a(SSLSocket sSLSocket, String str, List<nt0> list) {
        fd.j0.i(sSLSocket, "sslSocket");
        fd.j0.i(list, "protocols");
    }

    public boolean a(String str) {
        fd.j0.i(str, "hostname");
        return true;
    }

    public m81 b(X509TrustManager x509TrustManager) {
        fd.j0.i(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        fd.j0.h(acceptedIssuers, "trustManager.acceptedIssuers");
        return new re((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public Object b() {
        if (f24560b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public String b(SSLSocket sSLSocket) {
        fd.j0.i(sSLSocket, "sslSocket");
        return null;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
