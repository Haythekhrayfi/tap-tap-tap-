package com.yandex.mobile.ads.impl;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class f61<T extends TextView> implements k9<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArgbEvaluator f20560a = new ArgbEvaluator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ValueAnimator f20561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20562c;

    public static class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f20563a;

        public a(TextView textView) {
            this.f20563a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Integer) {
                this.f20563a.setTextColor(((Integer) animatedValue).intValue());
            }
        }
    }

    public f61(int i10) {
        this.f20562c = i10;
    }

    @Override // com.yandex.mobile.ads.impl.k9
    public final void a(View view) {
        TextView textView = (TextView) view;
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.f20560a, Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(this.f20562c));
        this.f20561b = valueAnimatorOfObject;
        valueAnimatorOfObject.addUpdateListener(new a(textView));
        this.f20561b.setDuration(500);
        this.f20561b.start();
    }

    @Override // com.yandex.mobile.ads.impl.k9
    public final void cancel() {
        ValueAnimator valueAnimator = this.f20561b;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f20561b.cancel();
        }
    }
}
