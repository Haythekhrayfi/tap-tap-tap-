package com.yandex.mobile.ads.impl;

import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class n81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final jc.e f23304a = jc.f.b(a.f23306a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f23305b = 0;

    public static final class a extends vc.l implements uc.a<CertificateFactory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23306a = new a();

        public a() {
            super(0);
        }

        @Override // uc.a
        public final CertificateFactory invoke() {
            try {
                return CertificateFactory.getInstance("X.509");
            } catch (CertificateException unused) {
                return null;
            }
        }
    }

    public static final X509Certificate a(byte[] bArr) {
        fd.j0.i(bArr, "certBytes");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            CertificateFactory certificateFactory = (CertificateFactory) f23304a.getValue();
            return (X509Certificate) (certificateFactory != null ? certificateFactory.generateCertificate(byteArrayInputStream) : null);
        } catch (CertificateException unused) {
            return null;
        }
    }

    public static final X509TrustManager a(KeyStore keyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            fd.j0.h(trustManagers, "trustManagers");
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) kc.t.s(arrayList);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static final boolean a() {
        return true;
    }
}
