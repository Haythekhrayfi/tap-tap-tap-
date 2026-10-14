package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h6 f19109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d4 f19110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final au f19111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final se1 f19112d;

    public b4(g6 g6Var, au auVar, se1 se1Var) {
        this.f19111c = auVar;
        this.f19112d = se1Var;
        this.f19109a = g6Var.b();
        this.f19110b = g6Var.c();
    }

    public final void a(Player player, boolean z10) {
        boolean zB = this.f19112d.b();
        int currentAdGroupIndex = player.getCurrentAdGroupIndex();
        if (currentAdGroupIndex == -1) {
            AdPlaybackState adPlaybackStateA = this.f19110b.a();
            long contentPosition = player.getContentPosition();
            long contentDuration = player.getContentDuration();
            if (contentDuration == -9223372036854775807L || contentPosition == -9223372036854775807L) {
                currentAdGroupIndex = -1;
            } else {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                currentAdGroupIndex = adPlaybackStateA.getAdGroupIndexForPositionUs(timeUnit.toMicros(contentPosition), timeUnit.toMicros(contentDuration));
            }
        }
        boolean zC = this.f19109a.c();
        if (zB || z10 || currentAdGroupIndex == -1 || zC) {
            return;
        }
        AdPlaybackState adPlaybackStateA2 = this.f19110b.a();
        if (adPlaybackStateA2.getAdGroup(currentAdGroupIndex).timeUs == Long.MIN_VALUE) {
            this.f19112d.a();
        } else {
            this.f19111c.a(adPlaybackStateA2, currentAdGroupIndex);
        }
    }
}
