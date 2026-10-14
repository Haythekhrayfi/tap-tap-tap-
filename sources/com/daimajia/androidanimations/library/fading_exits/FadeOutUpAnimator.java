package com.daimajia.androidanimations.library.fading_exits;

import android.animation.ObjectAnimator;
import android.view.View;
import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class FadeOutUpAnimator extends BaseViewAnimator {
    @Override // com.daimajia.androidanimations.library.BaseViewAnimator
    public void prepare(View view) {
        getAnimatorAgent().playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD), ObjectAnimator.ofFloat(view, "translationY", StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, (-view.getHeight()) / 4));
    }
}
