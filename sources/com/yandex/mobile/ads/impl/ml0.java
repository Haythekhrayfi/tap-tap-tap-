package com.yandex.mobile.ads.impl;

import android.view.TextureView;

/* JADX INFO: loaded from: classes3.dex */
public final class ml0 implements rl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fl0 f23107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final em0 f23108b;

    public ml0(ft ftVar, em0 em0Var) {
        fd.j0.i(ftVar, "player");
        fd.j0.i(em0Var, "videoView");
        this.f23107a = ftVar;
        this.f23108b = em0Var;
    }

    public final void a() {
        ((ft) this.f23107a).a(this.f23108b.c());
    }

    public final void b() {
        this.f23108b.b().a().clearAnimation();
        ((ft) this.f23107a).a((TextureView) null);
    }
}
