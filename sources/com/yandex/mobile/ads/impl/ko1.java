package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ko1 implements h4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j4 f22474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VideoAd f22475c;

    public /* synthetic */ ko1(j4 j4Var, VideoAd videoAd, int i10) {
        this.f22473a = i10;
        this.f22474b = j4Var;
        this.f22475c = videoAd;
    }

    @Override // com.yandex.mobile.ads.impl.h4.a
    public final void a() {
        switch (this.f22473a) {
            case 0:
                this.f22474b.b(this.f22475c);
                break;
            default:
                this.f22474b.a(this.f22475c);
                break;
        }
    }
}
