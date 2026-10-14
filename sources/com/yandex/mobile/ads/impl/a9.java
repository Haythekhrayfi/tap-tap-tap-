package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class a9 extends qq0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f18811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f18812f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f18813d;

    public static final class a {
        public static a9 a() {
            if (a9.f18811e) {
                return new a9();
            }
            return null;
        }
    }

    static {
        f18811e = qq0.a.c() && Build.VERSION.SDK_INT >= 29;
    }

    public a9() {
        int i10 = i9.f21637g;
        List listE = kc.l.e(b9.a.a(), new uo(i9.a.b()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listE) {
            if (((r31) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f18813d = arrayList;
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final lh a(X509TrustManager x509TrustManager) {
        fd.j0.i(x509TrustManager, "trustManager");
        c9 c9VarA = c9.a.a(x509TrustManager);
        return c9VarA != null ? c9VarA : super.a(x509TrustManager);
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final void a(SSLSocket sSLSocket, String str, List<? extends nt0> list) {
        Object next;
        fd.j0.i(sSLSocket, "sslSocket");
        fd.j0.i(list, "protocols");
        Iterator it = this.f18813d.iterator();
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
    @SuppressLint({"NewApi"})
    public final boolean a(String str) {
        fd.j0.i(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final String b(SSLSocket sSLSocket) {
        Object next;
        fd.j0.i(sSLSocket, "sslSocket");
        Iterator it = this.f18813d.iterator();
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
