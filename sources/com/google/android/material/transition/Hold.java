package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import r1.b0;
import r1.r;

/* JADX INFO: loaded from: classes2.dex */
public final class Hold extends b0 {
    @Override // r1.b0
    public Animator onAppear(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        return ValueAnimator.ofFloat(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    }

    @Override // r1.b0
    public Animator onDisappear(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        return ValueAnimator.ofFloat(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    }
}
