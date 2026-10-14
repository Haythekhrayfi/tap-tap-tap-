package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class f21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r50 f20503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SkipInfo f20504b;

    public f21(r50 r50Var, VideoAd videoAd) {
        this.f20503a = r50Var;
        this.f20504b = videoAd.getSkipInfo();
    }

    public final void a(View view, a50 a50Var) {
        if (this.f20504b == null) {
            view.setVisibility(8);
            return;
        }
        view.setOnClickListener(new e21(this.f20503a));
        if (!a50Var.c()) {
            view.setEnabled(false);
        } else {
            view.setVisibility(0);
            view.setEnabled(true);
        }
    }
}
