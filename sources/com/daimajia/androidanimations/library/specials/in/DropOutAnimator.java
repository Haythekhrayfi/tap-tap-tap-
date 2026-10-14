package com.daimajia.androidanimations.library.specials.in;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import d4.b;
import d4.c;

/* JADX INFO: loaded from: classes.dex */
public class DropOutAnimator extends BaseViewAnimator {
    @Override // com.daimajia.androidanimations.library.BaseViewAnimator
    public void prepare(View view) {
        int height = view.getHeight() + view.getTop();
        AnimatorSet animatorAgent = getAnimatorAgent();
        c cVar = c.BounceEaseOut;
        float duration = getDuration();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", -height, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        b.a(cVar, duration, objectAnimatorOfFloat);
        animatorAgent.playTogether(ObjectAnimator.ofFloat(view, "alpha", StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f), objectAnimatorOfFloat);
    }
}
