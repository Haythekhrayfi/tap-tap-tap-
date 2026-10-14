package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class k60 implements td1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nd1<VideoAd> f22262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ng1 f22263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final de1 f22264c;

    public k60(r50 r50Var, i60 i60Var, de1 de1Var) {
        this.f22262a = r50Var;
        this.f22263b = tg0.a(i60Var);
        this.f22264c = de1Var;
    }

    @Override // com.yandex.mobile.ads.impl.td1
    public final void a(long j10, long j11) {
        boolean zA = this.f22263b.a();
        if (this.f22264c.a() != ce1.f19483h) {
            if (zA) {
                if (this.f22262a.isPlayingAd()) {
                    return;
                }
                this.f22262a.c();
            } else if (this.f22262a.isPlayingAd()) {
                this.f22262a.a();
            }
        }
    }
}
