package com.yandex.mobile.ads.impl;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class bl1 extends X509ExtendedTrustManager implements zl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final am1 f19290a;

    public bl1(gm gmVar) {
        fd.j0.i(gmVar, "customCertificatesProvider");
        this.f19290a = new am1(gmVar);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.f19290a.a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        this.f19290a.a(x509CertificateArr, str, socket);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        this.f19290a.a(x509CertificateArr, str, sSLEngine);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.f19290a.b(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        this.f19290a.b(x509CertificateArr, str, socket);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        this.f19290a.b(x509CertificateArr, str, sSLEngine);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.f19290a.c();
    }
}
