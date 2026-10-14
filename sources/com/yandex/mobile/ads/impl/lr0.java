package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Timeline;

/* JADX INFO: loaded from: classes3.dex */
public final class lr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Timeline.Period f22765a = new Timeline.Period();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timeline f22766b = Timeline.EMPTY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22767c;

    public final Timeline.Period a() {
        return this.f22765a;
    }

    public final void a(Timeline timeline) {
        this.f22766b = timeline;
    }

    public final void a(boolean z10) {
        this.f22767c = z10;
    }

    public final Timeline b() {
        return this.f22766b;
    }

    public final boolean c() {
        return this.f22767c;
    }
}
