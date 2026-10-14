package com.yandex.mobile.ads.impl;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes3.dex */
public final class bm1 implements zl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final am1 f19294a;

    public bm1(xk1 xk1Var) {
        fd.j0.i(xk1Var, "customCertificatesProvider");
        this.f19294a = new am1(xk1Var);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.f19294a.a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.f19294a.b(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.f19294a.c();
    }
}
