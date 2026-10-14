package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sc1<VideoAd> f21349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w50 f21350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final eg1 f21351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dc1 f21352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g20 f21353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w40 f21354g;

    public hb(Context context, sc1 sc1Var, w50 w50Var, eg1 eg1Var, ec1 ec1Var, eq0 eq0Var, w40 w40Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(w50Var, "adBreak");
        fd.j0.i(eg1Var, "videoTracker");
        fd.j0.i(ec1Var, "playbackListener");
        fd.j0.i(eq0Var, "imageProvider");
        fd.j0.i(w40Var, "assetsWrapper");
        this.f21348a = context;
        this.f21349b = sc1Var;
        this.f21350c = w50Var;
        this.f21351d = eg1Var;
        this.f21352e = ec1Var;
        this.f21353f = eq0Var;
        this.f21354g = w40Var;
    }

    public final List<u40> a() {
        ua uaVarA = va.a(this.f21348a, this.f21349b, this.f21350c, this.f21351d);
        qa<?> qaVarA = this.f21354g.a("call_to_action");
        bh bhVar = new bh(qaVarA, ai.a(this.f21349b, this.f21348a, this.f21350c, this.f21351d, this.f21352e, qaVarA));
        ch chVar = new ch();
        a8 a8VarA = new b8(this.f21349b).a();
        fd.j0.h(a8VarA, "advertiserConfiguratorCreator.createConfigurator()");
        gu guVar = new gu(this.f21353f, this.f21354g.a("favicon"), uaVarA);
        qq qqVar = new qq(this.f21354g.a("domain"), uaVarA);
        b41 b41Var = new b41(this.f21354g.a("sponsored"), uaVarA);
        p4 p4Var = new p4(this.f21349b.c().getAdPodInfo().getAdPosition(), this.f21349b.c().getAdPodInfo().getAdsCount());
        f81 f81Var = new f81(this.f21353f, this.f21354g.a("trademark"), uaVarA);
        x30 x30Var = new x30();
        yo0 yo0VarA = new m50(this.f21348a, this.f21350c, this.f21349b).a();
        fd.j0.h(yo0VarA, "instreamOpenUrlHandlerProvider.openUrlHandler");
        return kc.l.c(bhVar, a8VarA, guVar, qqVar, b41Var, p4Var, f81Var, chVar, new pu(this.f21354g.a("feedback"), uaVarA, this.f21351d, yo0VarA, x30Var), new qi1(this.f21354g.a("warning"), uaVarA));
    }
}
