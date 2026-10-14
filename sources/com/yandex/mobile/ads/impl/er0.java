package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;

/* JADX INFO: loaded from: classes3.dex */
public final class er0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ys f20315a;

    public er0(ys ysVar) {
        this.f20315a = ysVar;
    }

    public final void a() {
        Player playerA = this.f20315a.a();
        if (playerA != null) {
            playerA.setPlayWhenReady(false);
        }
    }

    public final void b() {
        Player playerA = this.f20315a.a();
        if (playerA != null) {
            playerA.setPlayWhenReady(true);
        }
    }
}
