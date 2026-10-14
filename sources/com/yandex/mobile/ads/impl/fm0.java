package com.yandex.mobile.ads.impl;

import android.view.TextureView;

/* JADX INFO: loaded from: classes3.dex */
public final class fm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fl0 f20751a;

    public fm0(ft ftVar) {
        this.f20751a = ftVar;
    }

    public final void a(em0 em0Var) {
        TextureView textureViewC = em0Var.c();
        ((ft) this.f20751a).a(textureViewC);
        textureViewC.setVisibility(4);
        em0Var.a().setVisibility(0);
        em0Var.b().setVisibility(0);
    }

    public final void b(em0 em0Var) {
        TextureView textureViewC = em0Var.c();
        ((ft) this.f20751a).a((TextureView) null);
        textureViewC.setVisibility(8);
        em0Var.a().setVisibility(8);
        em0Var.b().setVisibility(8);
    }
}
