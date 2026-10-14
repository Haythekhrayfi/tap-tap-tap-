package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc1<VideoAd> f27332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q40 f27333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gp f27334c = new gp();

    public zh(Context context, w50 w50Var, sc1<VideoAd> sc1Var, eg1 eg1Var, dc1 dc1Var, pe1 pe1Var) {
        this.f27332a = sc1Var;
        this.f27333b = new q40(context, w50Var, sc1Var, eg1Var, dc1Var, pe1Var);
    }

    public final void a(View view) {
        int iA = this.f27334c.a(view.getContext());
        if (!(!TextUtils.isEmpty(this.f27332a.a().b())) || a6.a(3, iA)) {
            view.setVisibility(8);
        } else {
            view.setOnClickListener(this.f27333b);
        }
    }
}
