package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class oh1 implements td1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nd1 f23822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ng1 f23823b;

    public oh1(hl0 hl0Var, im0 im0Var) {
        this.f23822a = hl0Var;
        this.f23823b = tg0.a(im0Var);
    }

    @Override // com.yandex.mobile.ads.impl.td1
    public final void a(long j10, long j11) {
        if (this.f23823b.a()) {
            if (this.f23822a.isPlayingAd()) {
                return;
            }
            this.f23822a.c();
        } else if (this.f23822a.isPlayingAd()) {
            this.f23822a.a();
        }
    }
}
