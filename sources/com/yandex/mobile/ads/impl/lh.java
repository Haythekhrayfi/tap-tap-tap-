package com.yandex.mobile.ads.impl;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lh {

    public static final class a {
        public static lh a(X509TrustManager x509TrustManager) {
            fd.j0.i(x509TrustManager, "trustManager");
            int i10 = qq0.f24561c;
            return qq0.a.b().a(x509TrustManager);
        }
    }

    public abstract List a(String str, List list) throws SSLPeerUnverifiedException;
}
