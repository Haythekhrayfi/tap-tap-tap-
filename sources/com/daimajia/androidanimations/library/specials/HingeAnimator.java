package com.daimajia.androidanimations.library.specials;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import d4.b;
import d4.c;

/* JADX INFO: loaded from: classes.dex */
public class HingeAnimator extends BaseViewAnimator {
    @Override // com.daimajia.androidanimations.library.BaseViewAnimator
    public void prepare(View view) {
        float paddingLeft = view.getPaddingLeft();
        float paddingTop = view.getPaddingTop();
        AnimatorSet animatorAgent = getAnimatorAgent();
        c cVar = c.SineEaseInOut;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotation", StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 80.0f, 60.0f, 80.0f, 60.0f, 60.0f);
        b.a(cVar, 1300.0f, objectAnimatorOfFloat);
        animatorAgent.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(view, "translationY", StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 700.0f), ObjectAnimator.ofFloat(view, "alpha", 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD), ObjectAnimator.ofFloat(view, "pivotX", paddingLeft, paddingLeft, paddingLeft, paddingLeft, paddingLeft, paddingLeft), ObjectAnimator.ofFloat(view, "pivotY", paddingTop, paddingTop, paddingTop, paddingTop, paddingTop, paddingTop));
        setDuration(1300L);
    }
}
