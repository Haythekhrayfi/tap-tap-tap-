package com.daimajia.androidanimations.library.attention;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class WobbleAnimator extends BaseViewAnimator {
    @Override // com.daimajia.androidanimations.library.BaseViewAnimator
    public void prepare(View view) {
        float width = (float) (((double) view.getWidth()) / 100.0d);
        AnimatorSet animatorAgent = getAnimatorAgent();
        float f10 = width * StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        animatorAgent.playTogether(ObjectAnimator.ofFloat(view, "translationX", f10, (-25.0f) * width, 20.0f * width, (-15.0f) * width, 10.0f * width, width * (-5.0f), f10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD), ObjectAnimator.ofFloat(view, "rotation", StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, -5.0f, 3.0f, -3.0f, 2.0f, -1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
    }
}
