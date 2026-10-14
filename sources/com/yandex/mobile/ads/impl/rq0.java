package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class rq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j2 f24822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f24823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q3 f24824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cf f24825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lr0 f24826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ys f24827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final xf1 f24828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f24829h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f24830i = -1;

    public rq0(cf cfVar, kr0 kr0Var, g6 g6Var, se1 se1Var, au auVar, j2 j2Var) {
        this.f24825d = cfVar;
        lr0 lr0VarD = kr0Var.d();
        this.f24826e = lr0VarD;
        this.f24827f = kr0Var.c();
        this.f24824c = g6Var.a();
        this.f24822a = j2Var;
        this.f24828g = new xf1(lr0VarD, se1Var);
        this.f24823b = new b4(g6Var, auVar, se1Var);
    }

    public final void a() {
        Player playerA = this.f24827f.a();
        if (!this.f24825d.b() || playerA == null) {
            return;
        }
        this.f24828g.a(playerA);
        boolean zC = this.f24826e.c();
        boolean zIsPlayingAd = playerA.isPlayingAd();
        int currentAdGroupIndex = playerA.getCurrentAdGroupIndex();
        int currentAdIndexInAdGroup = playerA.getCurrentAdIndexInAdGroup();
        this.f24826e.a(zIsPlayingAd);
        int i10 = zIsPlayingAd ? currentAdGroupIndex : this.f24829h;
        int i11 = this.f24830i;
        this.f24830i = currentAdIndexInAdGroup;
        this.f24829h = currentAdGroupIndex;
        n3 n3Var = new n3(i10, i11);
        VideoAd videoAdA = this.f24824c.a(n3Var);
        boolean z10 = zC && (currentAdIndexInAdGroup == -1 || i11 < currentAdIndexInAdGroup);
        if (videoAdA != null && z10) {
            this.f24822a.a(n3Var, videoAdA);
        }
        this.f24823b.a(playerA, zC);
    }
}
