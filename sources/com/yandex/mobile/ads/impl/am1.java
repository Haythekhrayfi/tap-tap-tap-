package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class am1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gm f18997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jc.e f18998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private KeyStore f18999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private X509TrustManager f19000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f19001e;

    public static final class a extends vc.l implements uc.a<X509TrustManager> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19002a = new a();

        public a() {
            super(0);
        }

        @Override // uc.a
        public final X509TrustManager invoke() {
            X509TrustManager x509TrustManagerA = n81.a((KeyStore) null);
            if (x509TrustManagerA != null) {
                return x509TrustManagerA;
            }
            throw new IllegalArgumentException("Failed to create default TrustManager");
        }
    }

    public am1(gm gmVar) {
        fd.j0.i(gmVar, "customCertificatesProvider");
        this.f18997a = gmVar;
        this.f18998b = jc.f.b(a.f19002a);
        this.f19001e = new Object();
    }

    private final void a() {
        KeyStore keyStore;
        b();
        b();
        if (this.f18999c == null) {
            int i10 = n81.f23305b;
            KeyStore keyStore2 = null;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore == null) {
                Log.w("YandexTrustManager", "Custom KeyStore is null, failed to add certs");
            } else {
                byte[][] bArrA = this.f18997a.a();
                ArrayList arrayList = new ArrayList();
                for (byte[] bArr : bArrA) {
                    X509Certificate x509CertificateA = n81.a(bArr);
                    if (x509CertificateA != null) {
                        arrayList.add(x509CertificateA);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        keyStore.setCertificateEntry("custom_cert_" + keyStore.size(), (X509Certificate) it.next());
                    } catch (KeyStoreException e10) {
                        Log.w("YandexTrustManager", "Failed to store certificate", e10);
                    }
                }
                keyStore2 = keyStore;
            }
            this.f18999c = keyStore2;
        }
        b();
        if (this.f19000d == null) {
            b();
            if (this.f18999c != null) {
                b();
                this.f19000d = n81.a(this.f18999c);
            }
        }
    }

    private final void b() {
        if (!Thread.holdsLock(this.f19001e)) {
            throw new IllegalStateException("Operation should be performed under lock");
        }
    }

    private final X509TrustManager d() {
        return (X509TrustManager) this.f18998b.getValue();
    }

    public final void a(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        d().checkClientTrusted(x509CertificateArr, str);
    }

    public final void a(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        if (n81.a()) {
            m9.a(d(), x509CertificateArr, str, socket);
        } else {
            d().checkClientTrusted(x509CertificateArr, str);
        }
    }

    public final void a(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        if (n81.a()) {
            m9.a(d(), x509CertificateArr, str, sSLEngine);
        } else {
            d().checkClientTrusted(x509CertificateArr, str);
        }
    }

    public final void b(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        jc.w wVar;
        try {
            d().checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e10) {
            synchronized (this.f19001e) {
                a();
                b();
                X509TrustManager x509TrustManager = this.f19000d;
                if (x509TrustManager != null) {
                    x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    wVar = jc.w.f31842a;
                } else {
                    wVar = null;
                }
                if (wVar != null) {
                    return;
                }
                Log.w("YandexTrustManager", "Custom TrustManager is null");
                throw e10;
            }
        }
    }

    public final void b(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        jc.w wVar;
        try {
            X509TrustManager x509TrustManagerD = d();
            if (n81.a()) {
                m9.b(x509TrustManagerD, x509CertificateArr, str, socket);
            } else {
                x509TrustManagerD.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e10) {
            synchronized (this.f19001e) {
                a();
                b();
                X509TrustManager x509TrustManager = this.f19000d;
                if (x509TrustManager != null) {
                    if (n81.a()) {
                        m9.b(x509TrustManager, x509CertificateArr, str, socket);
                    } else {
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    }
                    wVar = jc.w.f31842a;
                } else {
                    wVar = null;
                }
                if (wVar != null) {
                    return;
                }
                Log.w("YandexTrustManager", "Custom TrustManager is null");
                throw e10;
            }
        }
    }

    public final void b(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        jc.w wVar;
        try {
            X509TrustManager x509TrustManagerD = d();
            if (n81.a()) {
                m9.b(x509TrustManagerD, x509CertificateArr, str, sSLEngine);
            } else {
                x509TrustManagerD.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e10) {
            synchronized (this.f19001e) {
                a();
                b();
                X509TrustManager x509TrustManager = this.f19000d;
                if (x509TrustManager != null) {
                    if (n81.a()) {
                        m9.b(x509TrustManager, x509CertificateArr, str, sSLEngine);
                    } else {
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    }
                    wVar = jc.w.f31842a;
                } else {
                    wVar = null;
                }
                if (wVar != null) {
                    return;
                }
                Log.w("YandexTrustManager", "Custom TrustManager is null");
                throw e10;
            }
        }
    }

    public final X509Certificate[] c() {
        X509Certificate[] acceptedIssuers = d().getAcceptedIssuers();
        fd.j0.h(acceptedIssuers, "defaultTrustManager.acceptedIssuers");
        return acceptedIssuers;
    }
}
