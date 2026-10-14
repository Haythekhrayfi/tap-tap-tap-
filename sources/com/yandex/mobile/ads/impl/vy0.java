package com.yandex.mobile.ads.impl;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class vy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X509TrustManager f26104a;

    public vy0(zl1 zl1Var) {
        fd.j0.i(zl1Var, "trustManager");
        this.f26104a = zl1Var;
    }

    public final SSLContext a() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new X509TrustManager[]{this.f26104a}, null);
            fd.j0.h(sSLContext, "{\n            val sslCon…     sslContext\n        }");
            return sSLContext;
        } catch (KeyManagementException e10) {
            throw new IllegalStateException("Failed to initialize SSLContext", e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new IllegalStateException("No system TLS", e11);
        }
    }
}
