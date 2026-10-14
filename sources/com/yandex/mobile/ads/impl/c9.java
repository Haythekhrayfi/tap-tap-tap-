package com.yandex.mobile.ads.impl;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class c9 extends lh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X509TrustManager f19420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X509TrustManagerExtensions f19421b;

    public static final class a {
        public static c9 a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            fd.j0.i(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new c9(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public c9(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        fd.j0.i(x509TrustManager, "trustManager");
        fd.j0.i(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f19420a = x509TrustManager;
        this.f19421b = x509TrustManagerExtensions;
    }

    @Override // com.yandex.mobile.ads.impl.lh
    public final List a(String str, List list) throws SSLPeerUnverifiedException {
        fd.j0.i(list, "chain");
        fd.j0.i(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        fd.j0.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f19421b.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            fd.j0.h(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c9) && ((c9) obj).f19420a == this.f19420a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f19420a);
    }
}
