package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;
import r1.l;
import r1.r;

/* JADX INFO: loaded from: classes2.dex */
public class TextScale extends l {
    private static final String PROPNAME_SCALE = "android:textscale:scale";

    private void captureValues(r rVar) {
        View view = rVar.f35133b;
        if (view instanceof TextView) {
            rVar.f35132a.put(PROPNAME_SCALE, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // r1.l
    public void captureEndValues(r rVar) {
        captureValues(rVar);
    }

    @Override // r1.l
    public void captureStartValues(r rVar) {
        captureValues(rVar);
    }

    @Override // r1.l
    public Animator createAnimator(ViewGroup viewGroup, r rVar, r rVar2) {
        if (rVar == null || rVar2 == null || !(rVar.f35133b instanceof TextView)) {
            return null;
        }
        View view = rVar2.f35133b;
        if (!(view instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) view;
        Map<String, Object> map = rVar.f35132a;
        Map<String, Object> map2 = rVar2.f35132a;
        float fFloatValue = map.get(PROPNAME_SCALE) != null ? ((Float) map.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        float fFloatValue2 = map2.get(PROPNAME_SCALE) != null ? ((Float) map2.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.TextScale.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(fFloatValue3);
                textView.setScaleY(fFloatValue3);
            }
        });
        return valueAnimatorOfFloat;
    }
}
