package com.yandex.mobile.ads.impl;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class g9 extends qq0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f20977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f20978g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f20979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xi f20980e;

    public static final class a {
        public static g9 a() {
            if (g9.f20977f) {
                return new g9();
            }
            return null;
        }
    }

    public static final class b implements m81 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X509TrustManager f20981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f20982b;

        public b(X509TrustManager x509TrustManager, Method method) {
            fd.j0.i(x509TrustManager, "trustManager");
            fd.j0.i(method, "findByIssuerAndSignatureMethod");
            this.f20981a = x509TrustManager;
            this.f20982b = method;
        }

        @Override // com.yandex.mobile.ads.impl.m81
        public final X509Certificate a(X509Certificate x509Certificate) {
            fd.j0.i(x509Certificate, "cert");
            try {
                Object objInvoke = this.f20982b.invoke(this.f20981a, x509Certificate);
                fd.j0.g(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return fd.j0.d(this.f20981a, bVar.f20981a) && fd.j0.d(this.f20982b, bVar.f20982b);
        }

        public final int hashCode() {
            return this.f20982b.hashCode() + (this.f20981a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sbA = v60.a("CustomTrustRootIndex(trustManager=");
            sbA.append(this.f20981a);
            sbA.append(", findByIssuerAndSignatureMethod=");
            sbA.append(this.f20982b);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    static {
        f20977f = qq0.a.c() && Build.VERSION.SDK_INT < 30;
    }

    public g9() {
        int i10 = j41.f21949h;
        int i11 = i9.f21637g;
        List listE = kc.l.e(j41.a.a(), new uo(i9.a.b()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listE) {
            if (((r31) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f20979d = arrayList;
        this.f20980e = xi.a.a();
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final lh a(X509TrustManager x509TrustManager) {
        fd.j0.i(x509TrustManager, "trustManager");
        c9 c9VarA = c9.a.a(x509TrustManager);
        return c9VarA != null ? c9VarA : super.a(x509TrustManager);
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final void a(Object obj, String str) {
        fd.j0.i(str, "message");
        if (this.f20980e.a(obj)) {
            return;
        }
        qq0.a(this, str, 5, 4);
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final void a(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        fd.j0.i(socket, "socket");
        fd.j0.i(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final void a(SSLSocket sSLSocket, String str, List<nt0> list) {
        Object next;
        fd.j0.i(sSLSocket, "sslSocket");
        fd.j0.i(list, "protocols");
        Iterator it = this.f20979d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((r31) next).a(sSLSocket));
        r31 r31Var = (r31) next;
        if (r31Var != null) {
            r31Var.a(sSLSocket, str, list);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final boolean a(String str) {
        fd.j0.i(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final m81 b(X509TrustManager x509TrustManager) {
        fd.j0.i(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.b(x509TrustManager);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final Object b() {
        return this.f20980e.a();
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final String b(SSLSocket sSLSocket) {
        Object next;
        fd.j0.i(sSLSocket, "sslSocket");
        Iterator it = this.f20979d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((r31) next).a(sSLSocket));
        r31 r31Var = (r31) next;
        if (r31Var != null) {
            return r31Var.b(sSLSocket);
        }
        return null;
    }
}
