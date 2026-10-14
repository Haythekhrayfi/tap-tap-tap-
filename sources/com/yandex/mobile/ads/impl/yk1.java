package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class yk1 extends ao {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final SSLSocketFactory f26871s;

    public yk1(String str, int i10, int i11, boolean z10, s00 s00Var, SSLSocketFactory sSLSocketFactory) {
        super(str, i10, i11, z10, s00Var);
        this.f26871s = sSLSocketFactory;
    }

    @Override // com.yandex.mobile.ads.impl.ao
    public final HttpURLConnection a(URL url) throws IOException {
        fd.j0.i(url, ImagesContract.URL);
        HttpURLConnection httpURLConnectionA = super.a(url);
        SSLSocketFactory sSLSocketFactory = this.f26871s;
        if (sSLSocketFactory != null && (httpURLConnectionA instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnectionA).setSSLSocketFactory(sSLSocketFactory);
        }
        fd.j0.h(httpURLConnectionA, "connection");
        return httpURLConnectionA;
    }
}
