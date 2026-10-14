package com.daimajia.androidanimations.library;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseViewAnimator {
    public static final long DURATION = 1000;
    private long mDuration = 1000;
    private int mRepeatTimes = 0;
    private int mRepeatMode = 1;
    private AnimatorSet mAnimatorSet = new AnimatorSet();

    public BaseViewAnimator addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.mAnimatorSet.addListener(animatorListener);
        return this;
    }

    public void animate() {
        start();
    }

    public void cancel() {
        this.mAnimatorSet.cancel();
    }

    public AnimatorSet getAnimatorAgent() {
        return this.mAnimatorSet;
    }

    public long getDuration() {
        return this.mDuration;
    }

    public long getStartDelay() {
        return this.mAnimatorSet.getStartDelay();
    }

    public boolean isRunning() {
        return this.mAnimatorSet.isRunning();
    }

    public boolean isStarted() {
        return this.mAnimatorSet.isStarted();
    }

    public abstract void prepare(View view);

    public void removeAllListener() {
        this.mAnimatorSet.removeAllListeners();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.mAnimatorSet.removeListener(animatorListener);
    }

    public void reset(View view) {
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        view.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        view.setRotation(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        view.setRotationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        view.setRotationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    }

    public void restart() {
        this.mAnimatorSet = this.mAnimatorSet.clone();
        start();
    }

    public BaseViewAnimator setDuration(long j10) {
        this.mDuration = j10;
        return this;
    }

    public BaseViewAnimator setInterpolator(Interpolator interpolator) {
        this.mAnimatorSet.setInterpolator(interpolator);
        return this;
    }

    public BaseViewAnimator setRepeatMode(int i10) {
        this.mRepeatMode = i10;
        return this;
    }

    public BaseViewAnimator setRepeatTimes(int i10) {
        this.mRepeatTimes = i10;
        return this;
    }

    public BaseViewAnimator setStartDelay(long j10) {
        getAnimatorAgent().setStartDelay(j10);
        return this;
    }

    public BaseViewAnimator setTarget(View view) {
        reset(view);
        prepare(view);
        return this;
    }

    public void start() {
        for (Animator animator : this.mAnimatorSet.getChildAnimations()) {
            if (animator instanceof ValueAnimator) {
                ValueAnimator valueAnimator = (ValueAnimator) animator;
                valueAnimator.setRepeatCount(this.mRepeatTimes);
                valueAnimator.setRepeatMode(this.mRepeatMode);
            }
        }
        this.mAnimatorSet.setDuration(this.mDuration);
        this.mAnimatorSet.start();
    }
}
