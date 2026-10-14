package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class nf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gm0 f23375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts0 f23376b;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final em0 f23377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final gm0 f23378c;

        public a(em0 em0Var, gm0 gm0Var) {
            this.f23377b = em0Var;
            this.f23378c = gm0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f23378c.a(this.f23377b.a().a());
        }
    }

    public static final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final em0 f23379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ts0 f23380c;

        public b(em0 em0Var, ts0 ts0Var) {
            this.f23379b = em0Var;
            this.f23380c = ts0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ef1 ef1VarB = this.f23379b.b();
            Objects.requireNonNull(this.f23380c);
            ef1VarB.a().setVisibility(8);
            this.f23379b.c().setVisibility(0);
        }
    }

    public nf1(gm0 gm0Var, ts0 ts0Var) {
        this.f23375a = gm0Var;
        this.f23376b = ts0Var;
    }

    public final void a(em0 em0Var) {
        TextureView textureViewC = em0Var.c();
        textureViewC.setAlpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        textureViewC.animate().setDuration(500L).alpha(1.0f).withStartAction(new b(em0Var, this.f23376b)).withEndAction(new a(em0Var, this.f23375a)).start();
    }
}
