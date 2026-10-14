package com.applovin.exoplayer2.m;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public class g extends com.applovin.exoplayer2.f.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7797d;

    public g(Throwable th, com.applovin.exoplayer2.f.i iVar, Surface surface) {
        super(th, iVar);
        this.f7796c = System.identityHashCode(surface);
        this.f7797d = surface == null || surface.isValid();
    }
}
