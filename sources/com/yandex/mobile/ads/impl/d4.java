package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsLoader;

/* JADX INFO: loaded from: classes3.dex */
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdPlaybackState f19750a = AdPlaybackState.NONE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdsLoader.EventListener f19751b;

    public final AdPlaybackState a() {
        return this.f19750a;
    }

    public final void a(AdPlaybackState adPlaybackState) {
        this.f19750a = adPlaybackState;
        AdsLoader.EventListener eventListener = this.f19751b;
        if (eventListener != null) {
            eventListener.onAdPlaybackState(adPlaybackState);
        }
    }

    public final void a(AdsLoader.EventListener eventListener) {
        this.f19751b = eventListener;
    }

    public final void b() {
        this.f19751b = null;
        this.f19750a = AdPlaybackState.NONE;
    }
}
