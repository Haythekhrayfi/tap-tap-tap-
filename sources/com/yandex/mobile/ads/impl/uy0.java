package com.yandex.mobile.ads.impl;

import android.net.http.SslCertificate;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes3.dex */
public final class uy0 {
    public static final X509Certificate a(SslCertificate sslCertificate, CertificateFactory certificateFactory) {
        byte[] byteArray;
        fd.j0.i(sslCertificate, "<this>");
        fd.j0.i(certificateFactory, "x509CertificateFactory");
        if (!fd.j0.d(certificateFactory.getType(), "X.509")) {
            StringBuilder sbA = v60.a("Wrong certificateFactory.\nExpected type: X.509\nActual type: ");
            sbA.append(certificateFactory.getType());
            x60.c(sbA.toString(), new Object[0]);
            return null;
        }
        Bundle bundleSaveState = SslCertificate.saveState(sslCertificate);
        if (bundleSaveState == null || (byteArray = bundleSaveState.getByteArray("x509-certificate")) == null) {
            return null;
        }
        try {
            Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(byteArray));
            if (certificateGenerateCertificate instanceof X509Certificate) {
                return (X509Certificate) certificateGenerateCertificate;
            }
            return null;
        } catch (CertificateException e10) {
            x60.a(e10, "Can't generate X509Certificate", new Object[0]);
            return null;
        }
    }
}
