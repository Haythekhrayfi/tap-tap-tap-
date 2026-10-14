package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.RectF;
import android.widget.ImageView;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ap1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19033c = 7;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19036f;

    public /* synthetic */ ap1(Context context, wa0 wa0Var, qg0.a aVar) {
        this.f19034d = context;
        this.f19035e = wa0Var;
        this.f19036f = aVar;
    }

    public /* synthetic */ ap1(ac.a aVar, yv yvVar, cn cnVar) {
        this.f19034d = aVar;
        this.f19035e = yvVar;
        this.f19036f = cnVar;
    }

    public /* synthetic */ ap1(ae aeVar, BiddingSettings biddingSettings, o91 o91Var) {
        this.f19034d = aeVar;
        this.f19035e = biddingSettings;
        this.f19036f = o91Var;
    }

    public /* synthetic */ ap1(cf0 cf0Var, Context context, InitializationListener initializationListener) {
        this.f19034d = cf0Var;
        this.f19035e = context;
        this.f19036f = initializationListener;
    }

    public /* synthetic */ ap1(gd0 gd0Var, bh1 bh1Var, wg1 wg1Var) {
        this.f19034d = gd0Var;
        this.f19035e = bh1Var;
        this.f19036f = wg1Var;
    }

    public /* synthetic */ ap1(lc0 lc0Var, com.yandex.mobile.ads.embedded.guava.collect.p.a aVar, nc0.b bVar) {
        this.f19034d = lc0Var;
        this.f19035e = aVar;
        this.f19036f = bVar;
    }

    public /* synthetic */ ap1(oc0.a aVar, oc0 oc0Var, dc0 dc0Var) {
        this.f19034d = aVar;
        this.f19035e = oc0Var;
        this.f19036f = dc0Var;
    }

    public /* synthetic */ ap1(sf1.a aVar, yv yvVar, cn cnVar) {
        this.f19034d = aVar;
        this.f19035e = yvVar;
        this.f19036f = cnVar;
    }

    public /* synthetic */ ap1(v21 v21Var, RectF rectF, ImageView imageView) {
        this.f19034d = v21Var;
        this.f19035e = rectF;
        this.f19036f = imageView;
    }

    public /* synthetic */ ap1(wk1 wk1Var, Context context, BidderTokenLoadListener bidderTokenLoadListener) {
        this.f19034d = wk1Var;
        this.f19035e = context;
        this.f19036f = bidderTokenLoadListener;
    }

    public /* synthetic */ ap1(Set set, VideoAd videoAd, InstreamAdPlayerError instreamAdPlayerError) {
        this.f19034d = set;
        this.f19035e = videoAd;
        this.f19036f = instreamAdPlayerError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19033c) {
            case 0:
                ((lc0) this.f19034d).a((com.yandex.mobile.ads.embedded.guava.collect.p.a) this.f19035e, (nc0.b) this.f19036f);
                break;
            case 1:
                ((ac.a) this.f19034d).b((yv) this.f19035e, (cn) this.f19036f);
                break;
            case 2:
                ((ae) this.f19034d).a((BiddingSettings) this.f19035e, (o91) this.f19036f);
                break;
            case 3:
                ((cf0) this.f19034d).c((Context) this.f19035e, (InitializationListener) this.f19036f);
                break;
            case 4:
                e40.a((Set) this.f19034d, (VideoAd) this.f19035e, (InstreamAdPlayerError) this.f19036f);
                break;
            case 5:
                gd0.a((gd0) this.f19034d, (bh1) this.f19035e, (wg1) this.f19036f);
                break;
            case 6:
                ((oc0.a) this.f19034d).a((oc0) this.f19035e, (dc0) this.f19036f);
                break;
            case 7:
                qg0.b((Context) this.f19034d, (wa0) this.f19035e, (qg0.a) this.f19036f);
                break;
            case 8:
                ((sf1.a) this.f19034d).b((yv) this.f19035e, (cn) this.f19036f);
                break;
            case 9:
                v21.a((v21) this.f19034d, (RectF) this.f19035e, (ImageView) this.f19036f);
                break;
            default:
                ((wk1) this.f19034d).a((Context) this.f19035e, (BidderTokenLoadListener) this.f19036f);
                break;
        }
    }
}
