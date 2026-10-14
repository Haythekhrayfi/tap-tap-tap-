package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class Zd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f15651a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f15652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Yd f15653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Xd f15654d;

    public Zd(Context context, Yd yd2, Xd xd2) {
        this.f15652b = context;
        this.f15653c = yd2;
        this.f15654d = xd2;
    }

    public final HttpsURLConnection a(String str) throws IOException {
        Objects.requireNonNull(this.f15653c);
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpsURLConnection)) {
            uRLConnectionOpenConnection = null;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        if (httpsURLConnection == null) {
            return null;
        }
        if (this.f15651a) {
            Objects.requireNonNull(this.f15654d);
        }
        return httpsURLConnection;
    }

    public void a(Qi qi) {
        Boolean bool = qi.f().f17360y;
        this.f15651a = bool != null ? bool.booleanValue() : true;
    }
}
