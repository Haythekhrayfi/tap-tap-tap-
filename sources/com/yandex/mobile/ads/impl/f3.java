package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w50 f20506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v1 f20507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g20 f20508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d40 f20509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s40 f20510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dd1<VideoAd> f20511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final hg1 f20512h;

    public f3(Context context, w50 w50Var, v1 v1Var, g20 g20Var, d40 d40Var, s40 s40Var, dd1<VideoAd> dd1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(w50Var, "adBreak");
        fd.j0.i(v1Var, "adBreakPosition");
        fd.j0.i(g20Var, "imageProvider");
        fd.j0.i(d40Var, "adPlayerController");
        fd.j0.i(s40Var, "adViewsHolderManager");
        fd.j0.i(dd1Var, "playbackEventsListener");
        this.f20505a = context;
        this.f20506b = w50Var;
        this.f20507c = v1Var;
        this.f20508d = g20Var;
        this.f20509e = d40Var;
        this.f20510f = s40Var;
        this.f20511g = dd1Var;
        this.f20512h = new hg1();
    }

    public final e3 a(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        hg1 hg1Var = this.f20512h;
        Context context = this.f20505a;
        v1 v1Var = this.f20507c;
        Objects.requireNonNull(hg1Var);
        gg1 gg1VarA = hg1.a(context, sc1Var, v1Var);
        de1 de1Var = new de1();
        return new e3(sc1Var, new s50(this.f20505a, this.f20509e, this.f20510f, this.f20506b, sc1Var, de1Var, gg1VarA, this.f20508d, this.f20511g), this.f20508d, de1Var, gg1VarA);
    }
}
