package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class dl0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yv0 f19894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PlaybackControlsContainer f19895b;

    public dl0(Context context, yv0 yv0Var, PlaybackControlsContainer playbackControlsContainer) {
        super(context);
        this.f19894a = yv0Var;
        this.f19895b = playbackControlsContainer;
    }

    public final PlaybackControlsContainer a() {
        return this.f19895b;
    }

    public final yv0 b() {
        return this.f19894a;
    }
}
