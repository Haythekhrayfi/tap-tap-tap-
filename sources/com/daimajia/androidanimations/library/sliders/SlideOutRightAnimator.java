package com.daimajia.androidanimations.library.sliders;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class SlideOutRightAnimator extends BaseViewAnimator {
    @Override // com.daimajia.androidanimations.library.BaseViewAnimator
    public void prepare(View view) {
        getAnimatorAgent().playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD), ObjectAnimator.ofFloat(view, "translationX", StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, ((ViewGroup) view.getParent()).getWidth() - view.getLeft()));
    }
}
