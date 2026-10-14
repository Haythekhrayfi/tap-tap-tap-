package com.yandex.mobile.ads.impl;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class kq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f22491a;

    public kq(nq0 nq0Var) {
        fd.j0.i(nq0Var, "tracker");
        this.f22491a = nq0Var;
    }

    public final void a(Uri uri) {
        fd.j0.i(uri, "uri");
        String queryParameter = uri.getQueryParameter("trackingUrl");
        if (queryParameter != null) {
            if (queryParameter.length() > 0) {
                this.f22491a.a(queryParameter);
            }
        }
    }
}
