package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.video.playback.view.VideoAdControlsContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class dv implements sa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f19987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f19988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sa0.a f19989c;

    public dv(VideoAdControlsContainer videoAdControlsContainer) {
        fd.j0.i(videoAdControlsContainer, "container");
        this.f19987a = videoAdControlsContainer;
        this.f19988b = 0.1f;
        this.f19989c = new sa0.a();
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    public final sa0.a a(int i10, int i11) {
        int iC = xc.b.c(this.f19987a.getHeight() * this.f19988b);
        sa0.a aVar = this.f19989c;
        aVar.f25006a = i10;
        aVar.f25007b = View.MeasureSpec.makeMeasureSpec(iC, 1073741824);
        return this.f19989c;
    }
}
