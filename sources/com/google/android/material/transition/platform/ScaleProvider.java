package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class ScaleProvider implements VisibilityAnimatorProvider {
    private boolean growing;
    private float incomingEndScale;
    private float incomingStartScale;
    private float outgoingEndScale;
    private float outgoingStartScale;
    private boolean scaleOnDisappear;

    public ScaleProvider() {
        this(true);
    }

    public ScaleProvider(boolean z10) {
        this.outgoingStartScale = 1.0f;
        this.outgoingEndScale = 1.1f;
        this.incomingStartScale = 0.8f;
        this.incomingEndScale = 1.0f;
        this.scaleOnDisappear = true;
        this.growing = z10;
    }

    private static Animator createScaleAnimator(final View view, float f10, float f11) {
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f10, scaleX * f11), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f10 * scaleY, f11 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.ScaleProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
            }
        });
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public Animator createAppear(ViewGroup viewGroup, View view) {
        float f10;
        float f11;
        if (this.growing) {
            f10 = this.incomingStartScale;
            f11 = this.incomingEndScale;
        } else {
            f10 = this.outgoingEndScale;
            f11 = this.outgoingStartScale;
        }
        return createScaleAnimator(view, f10, f11);
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public Animator createDisappear(ViewGroup viewGroup, View view) {
        float f10;
        float f11;
        if (!this.scaleOnDisappear) {
            return null;
        }
        if (this.growing) {
            f10 = this.outgoingStartScale;
            f11 = this.outgoingEndScale;
        } else {
            f10 = this.incomingEndScale;
            f11 = this.incomingStartScale;
        }
        return createScaleAnimator(view, f10, f11);
    }

    public float getIncomingEndScale() {
        return this.incomingEndScale;
    }

    public float getIncomingStartScale() {
        return this.incomingStartScale;
    }

    public float getOutgoingEndScale() {
        return this.outgoingEndScale;
    }

    public float getOutgoingStartScale() {
        return this.outgoingStartScale;
    }

    public boolean isGrowing() {
        return this.growing;
    }

    public boolean isScaleOnDisappear() {
        return this.scaleOnDisappear;
    }

    public void setGrowing(boolean z10) {
        this.growing = z10;
    }

    public void setIncomingEndScale(float f10) {
        this.incomingEndScale = f10;
    }

    public void setIncomingStartScale(float f10) {
        this.incomingStartScale = f10;
    }

    public void setOutgoingEndScale(float f10) {
        this.outgoingEndScale = f10;
    }

    public void setOutgoingStartScale(float f10) {
        this.outgoingStartScale = f10;
    }

    public void setScaleOnDisappear(boolean z10) {
        this.scaleOnDisappear = z10;
    }
}
