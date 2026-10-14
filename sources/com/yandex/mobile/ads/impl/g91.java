package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
final class g91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r40 f20984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e91 f20985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sc1<VideoAd> f20986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z50 f20987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y50 f20988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a50 f20989f;

    public g91(r40 r40Var, e91 e91Var, sc1<VideoAd> sc1Var, a60 a60Var, or0 or0Var, r50 r50Var) {
        this.f20984a = r40Var;
        this.f20985b = e91Var;
        this.f20986c = sc1Var;
        this.f20987d = new z50(a60Var, or0Var);
        this.f20988e = new y50(a60Var, r50Var);
    }

    public final void a() {
        InstreamAdView instreamAdViewB = this.f20984a.b();
        if (this.f20989f != null || instreamAdViewB == null) {
            return;
        }
        a50 a50VarA = this.f20987d.a(this.f20986c);
        this.f20989f = a50VarA;
        this.f20985b.a(instreamAdViewB, a50VarA);
    }

    public final void a(sc1<VideoAd> sc1Var) {
        InstreamAdView instreamAdViewB = this.f20984a.b();
        a50 a50Var = this.f20989f;
        if (a50Var == null || instreamAdViewB == null) {
            return;
        }
        this.f20988e.a(sc1Var, instreamAdViewB, a50Var);
    }

    public final void b() {
        InstreamAdView instreamAdViewB = this.f20984a.b();
        a50 a50Var = this.f20989f;
        if (a50Var == null || instreamAdViewB == null) {
            return;
        }
        this.f20988e.b(this.f20986c, instreamAdViewB, a50Var);
        this.f20989f = null;
        this.f20985b.a(instreamAdViewB);
    }
}
