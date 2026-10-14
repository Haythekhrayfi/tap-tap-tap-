package com.yandex.mobile.ads.impl;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ss0 extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<ProgressBar> f25181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25183c;

    public ss0(ProgressBar progressBar, int i10, int i11) {
        setInterpolator(new LinearInterpolator());
        this.f25181a = new WeakReference<>(progressBar);
        this.f25182b = i10;
        this.f25183c = i11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        ProgressBar progressBar = this.f25181a.get();
        if (progressBar != null) {
            super.applyTransformation(f10, transformation);
            int i10 = this.f25182b;
            progressBar.setProgress(Math.round(((this.f25183c - i10) * f10) + i10));
        }
    }
}
