package com.daimajia.androidanimations.library.attention;

import android.animation.ObjectAnimator;
import android.view.View;
import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class WaveAnimator extends BaseViewAnimator {
    @Override // com.daimajia.androidanimations.library.BaseViewAnimator
    public void prepare(View view) {
        float paddingLeft = view.getPaddingLeft() + (((view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight()) / 2);
        float height = view.getHeight() - view.getPaddingBottom();
        getAnimatorAgent().playTogether(ObjectAnimator.ofFloat(view, "rotation", 12.0f, -12.0f, 3.0f, -3.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD), ObjectAnimator.ofFloat(view, "pivotX", paddingLeft, paddingLeft, paddingLeft, paddingLeft, paddingLeft), ObjectAnimator.ofFloat(view, "pivotY", height, height, height, height, height));
    }
}
