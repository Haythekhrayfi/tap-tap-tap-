package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class em0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private rl0 f20278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private sa0 f20279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ef1 f20280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextureView f20281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dl0 f20282e;

    public em0(Context context, ef1 ef1Var, TextureView textureView, dl0 dl0Var) {
        super(context);
        this.f20278a = null;
        this.f20280c = ef1Var;
        this.f20281d = textureView;
        this.f20282e = dl0Var;
        this.f20279b = new q11();
    }

    public final dl0 a() {
        return this.f20282e;
    }

    public final ef1 b() {
        return this.f20280c;
    }

    public final TextureView c() {
        return this.f20281d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rl0 rl0Var = this.f20278a;
        if (rl0Var != null) {
            ((ml0) rl0Var).a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rl0 rl0Var = this.f20278a;
        if (rl0Var != null) {
            ((ml0) rl0Var).b();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        sa0.a aVarA = this.f20279b.a(i10, i11);
        super.onMeasure(aVarA.f25006a, aVarA.f25007b);
    }

    public void setAspectRatio(float f10) {
        this.f20279b = new mt0(f10);
    }

    public void setOnAttachStateChangeListener(rl0 rl0Var) {
        this.f20278a = rl0Var;
    }
}
