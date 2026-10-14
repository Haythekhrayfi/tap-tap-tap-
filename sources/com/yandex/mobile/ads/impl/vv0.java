package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class vv0 {

    public static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final em0 f26089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final yv0 f26090c;

        public a(em0 em0Var, yv0 yv0Var) {
            this.f26089b = em0Var;
            this.f26090c = yv0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26089b.c().setVisibility(4);
            this.f26090c.a().setVisibility(0);
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final yv0 f26091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bitmap f26092c;

        public b(yv0 yv0Var, Bitmap bitmap) {
            this.f26091b = yv0Var;
            this.f26092c = bitmap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26091b.setBackground(new BitmapDrawable(this.f26091b.getResources(), this.f26092c));
            this.f26091b.setVisibility(0);
        }
    }

    public static void a(em0 em0Var, yv0 yv0Var, Bitmap bitmap) {
        yv0Var.setAlpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        yv0Var.animate().alpha(1.0f).setDuration(700L).withStartAction(new b(yv0Var, bitmap)).withEndAction(new a(em0Var, yv0Var)).start();
    }
}
