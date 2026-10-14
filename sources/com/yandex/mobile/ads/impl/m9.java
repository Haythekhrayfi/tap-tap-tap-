package com.yandex.mobile.ads.impl;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class m9 {
    public static final zl1 a(gm gmVar) throws CertificateException {
        fd.j0.i(gmVar, "customCertificatesProvider");
        return new bl1(gmVar);
    }

    public static final void a(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        fd.j0.i(x509TrustManager, "trustManager");
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkClientTrusted(x509CertificateArr, str, socket);
        } else {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    public static final void a(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        fd.j0.i(x509TrustManager, "trustManager");
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkClientTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    public static final void b(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        fd.j0.i(x509TrustManager, "trustManager");
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkServerTrusted(x509CertificateArr, str, socket);
        } else {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    public static final void b(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        fd.j0.i(x509TrustManager, "trustManager");
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkServerTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }
}
