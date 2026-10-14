package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vn1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set f26047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ VideoAd f26048e;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    public /* synthetic */ vn1(Set set, VideoAd videoAd, int i10) {
        this.f26046c = i10;
        switch (i10) {
        }
        this.f26047d = set;
        this.f26048e = videoAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26046c) {
            case 0:
                e40.b(this.f26047d, this.f26048e);
                break;
            case 1:
                e40.e(this.f26047d, this.f26048e);
                break;
            case 2:
                e40.c(this.f26047d, this.f26048e);
                break;
            case 3:
                e40.g(this.f26047d, this.f26048e);
                break;
            case 4:
                e40.f(this.f26047d, this.f26048e);
                break;
            case 5:
                e40.d(this.f26047d, this.f26048e);
                break;
            case 6:
                e40.h(this.f26047d, this.f26048e);
                break;
            case 7:
                e40.a(this.f26047d, this.f26048e);
                break;
            default:
                e40.i(this.f26047d, this.f26048e);
                break;
        }
    }
}
