package com.daimajia.androidanimations.library.attention;

import android.animation.ObjectAnimator;
import android.view.View;
import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class SwingAnimator extends BaseViewAnimator {
    @Override // com.daimajia.androidanimations.library.BaseViewAnimator
    public void prepare(View view) {
        getAnimatorAgent().playTogether(ObjectAnimator.ofFloat(view, "rotation", StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 10.0f, -10.0f, 6.0f, -6.0f, 3.0f, -3.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
    }
}
