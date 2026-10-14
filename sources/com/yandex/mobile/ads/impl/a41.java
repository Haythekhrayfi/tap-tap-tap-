package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class a41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sc1<VideoAd> f18791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c8 f18792c;

    public a41(Context context, sc1<VideoAd> sc1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f18790a = context;
        this.f18791b = sc1Var;
        ac1 ac1VarE = sc1Var.e();
        fd.j0.h(ac1VarE, "videoAdInfo.vastVideoAd");
        this.f18792c = new c8(ac1VarE);
    }

    public final mn a() {
        int iA = a6.a(new c41(this.f18792c).a(this.f18791b));
        if (iA == 0) {
            return new oo(this.f18790a);
        }
        if (iA == 1) {
            return new no(this.f18790a);
        }
        if (iA == 2) {
            return new wn();
        }
        throw new jc.g();
    }
}
