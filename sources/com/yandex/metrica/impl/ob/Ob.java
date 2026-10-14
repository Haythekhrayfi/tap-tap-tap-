package com.yandex.metrica.impl.ob;

import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class Ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2011ui f14630a;

    public Ob(C2011ui c2011ui) {
        this.f14630a = c2011ui;
    }

    public final HttpsURLConnection a() {
        HttpsURLConnection httpsURLConnectionA;
        String strC = this.f14630a.c();
        try {
            P0 p0I = P0.i();
            fd.j0.h(p0I, "GlobalServiceLocator.getInstance()");
            httpsURLConnectionA = p0I.x().a(strC);
        } catch (Throwable unused) {
            httpsURLConnectionA = null;
        }
        if (httpsURLConnectionA == null) {
            return null;
        }
        httpsURLConnectionA.setInstanceFollowRedirects(true);
        int i10 = Vd.a.f15234a;
        httpsURLConnectionA.setConnectTimeout(i10);
        httpsURLConnectionA.setReadTimeout(i10);
        httpsURLConnectionA.setUseCaches(false);
        return httpsURLConnectionA;
    }
}
