package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class q40 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eg1 f24314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sc1<VideoAd> f24315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dc1 f24316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yo0 f24317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pe1 f24318e;

    public q40(Context context, w50 w50Var, sc1<VideoAd> sc1Var, eg1 eg1Var, dc1 dc1Var, pe1 pe1Var) {
        this.f24315b = sc1Var;
        this.f24314a = eg1Var;
        this.f24316c = dc1Var;
        this.f24317d = new m50(context, w50Var, sc1Var).a();
        this.f24318e = pe1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f24314a.m();
        this.f24316c.onAdClicked(this.f24315b.c());
        String strA = this.f24318e.a();
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.f24317d.a(strA);
    }
}
