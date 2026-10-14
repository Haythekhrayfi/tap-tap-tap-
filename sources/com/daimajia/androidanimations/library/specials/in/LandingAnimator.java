package com.daimajia.androidanimations.library.specials.in;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import d4.b;
import d4.c;

/* JADX INFO: loaded from: classes.dex */
public class LandingAnimator extends BaseViewAnimator {
    @Override // com.daimajia.androidanimations.library.BaseViewAnimator
    public void prepare(View view) {
        AnimatorSet animatorAgent = getAnimatorAgent();
        c cVar = c.QuintEaseOut;
        float duration = getDuration();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.5f, 1.0f);
        b.a(cVar, duration, objectAnimatorOfFloat);
        float duration2 = getDuration();
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.5f, 1.0f);
        b.a(cVar, duration2, objectAnimatorOfFloat2);
        float duration3 = getDuration();
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "alpha", StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f);
        b.a(cVar, duration3, objectAnimatorOfFloat3);
        animatorAgent.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
    }
}
