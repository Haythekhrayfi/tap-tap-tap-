package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;

/* JADX INFO: loaded from: classes3.dex */
public final class nr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ys f23531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Float f23532b;

    public nr0(ys ysVar) {
        this.f23531a = ysVar;
    }

    public final Float a() {
        Player playerA = this.f23531a.a();
        if (playerA != null) {
            return Float.valueOf(playerA.getVolume());
        }
        return null;
    }

    public final void a(float f10) {
        if (this.f23532b == null) {
            this.f23532b = a();
        }
        Player playerA = this.f23531a.a();
        if (playerA != null) {
            playerA.setVolume(f10);
        }
    }

    public final void b() {
        Float f10 = this.f23532b;
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            Player playerA = this.f23531a.a();
            if (playerA != null) {
                playerA.setVolume(fFloatValue);
            }
        }
        this.f23532b = null;
    }
}
