package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* JADX INFO: loaded from: classes3.dex */
public final class cr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4 f19619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y80 f19620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jr0 f19621c;

    public cr0(d4 d4Var, es0 es0Var, ue1 ue1Var, jr0 jr0Var) {
        this.f19619a = d4Var;
        this.f19621c = jr0Var;
        this.f19620b = new y80(es0Var, ue1Var);
    }

    private boolean a(Player player, int i10) {
        if (i10 == 2 && !player.isPlayingAd()) {
            AdPlaybackState adPlaybackStateA = this.f19619a.a();
            int iA = this.f19620b.a(adPlaybackStateA);
            if (iA == -1) {
                return false;
            }
            AdPlaybackState.AdGroup adGroup = adPlaybackStateA.getAdGroup(iA);
            int i11 = adGroup.count;
            if (i11 != -1 && i11 != 0 && adGroup.states[0] != 0) {
                return false;
            }
        }
        return true;
    }

    public final void b(Player player, int i10) {
        if (a(player, i10)) {
            this.f19621c.a(player.getPlayWhenReady(), i10);
        }
    }
}
