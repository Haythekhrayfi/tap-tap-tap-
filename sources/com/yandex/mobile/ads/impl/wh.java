package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;

/* JADX INFO: loaded from: classes3.dex */
public final class wh implements e91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q40 f26279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l4 f26280b;

    public wh(Context context, w50 w50Var, r50 r50Var, ec1 ec1Var, sc1 sc1Var, eg1 eg1Var) {
        this.f26279a = new q40(context, w50Var, sc1Var, eg1Var, ec1Var, new d60(new ol()).a(sc1Var.a(), null));
        this.f26280b = new l4(r50Var);
    }

    @Override // com.yandex.mobile.ads.impl.e91
    public final void a(InstreamAdView instreamAdView) {
        instreamAdView.setOnClickListener(null);
        instreamAdView.setClickable(false);
    }

    @Override // com.yandex.mobile.ads.impl.e91
    public final void a(InstreamAdView instreamAdView, a50 a50Var) {
        instreamAdView.setOnClickListener(this.f26279a);
        this.f26280b.a(a50Var.a(), a50Var.d());
    }
}
