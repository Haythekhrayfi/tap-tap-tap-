package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public abstract class Vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15233a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f15234a = (int) TimeUnit.SECONDS.toMillis(30);
    }

    public Vd(String str) {
        this.f15233a = str;
    }

    public HttpsURLConnection a() throws IOException {
        HttpsURLConnection httpsURLConnectionA = P0.i().x().a(this.f15233a);
        int i10 = a.f15234a;
        httpsURLConnectionA.setConnectTimeout(i10);
        httpsURLConnectionA.setReadTimeout(i10);
        httpsURLConnectionA.setDoInput(true);
        httpsURLConnectionA.setRequestProperty("Accept", "application/json");
        httpsURLConnectionA.setRequestProperty("User-Agent", B2.c("com.yandex.mobile.metrica.sdk"));
        return httpsURLConnectionA;
    }
}
