package com.daimajia.androidanimations.library;

import android.animation.Animator;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public class YoYo {
    public static final float CENTER_PIVOT = Float.MAX_VALUE;
    private static final long DURATION = 1000;
    public static final int INFINITE = -1;
    private static final long NO_DELAY = 0;
    private BaseViewAnimator animator;
    private List<Animator.AnimatorListener> callbacks;
    private long delay;
    private long duration;
    private Interpolator interpolator;
    private float pivotX;
    private float pivotY;
    private boolean repeat;
    private int repeatMode;
    private int repeatTimes;
    private View target;

    public static final class AnimationComposer {
        private BaseViewAnimator animator;
        private List<Animator.AnimatorListener> callbacks;
        private long delay;
        private long duration;
        private Interpolator interpolator;
        private float pivotX;
        private float pivotY;
        private boolean repeat;
        private int repeatMode;
        private int repeatTimes;
        private View target;

        private AnimationComposer(BaseViewAnimator baseViewAnimator) {
            this.callbacks = new ArrayList();
            this.duration = 1000L;
            this.delay = 0L;
            this.repeat = false;
            this.repeatTimes = 0;
            this.repeatMode = 1;
            this.pivotX = Float.MAX_VALUE;
            this.pivotY = Float.MAX_VALUE;
            this.animator = baseViewAnimator;
        }

        private AnimationComposer(Techniques techniques) {
            this.callbacks = new ArrayList();
            this.duration = 1000L;
            this.delay = 0L;
            this.repeat = false;
            this.repeatTimes = 0;
            this.repeatMode = 1;
            this.pivotX = Float.MAX_VALUE;
            this.pivotY = Float.MAX_VALUE;
            this.animator = techniques.getAnimator();
        }

        public AnimationComposer delay(long j10) {
            this.delay = j10;
            return this;
        }

        public AnimationComposer duration(long j10) {
            this.duration = j10;
            return this;
        }

        public AnimationComposer interpolate(Interpolator interpolator) {
            this.interpolator = interpolator;
            return this;
        }

        public AnimationComposer onCancel(final AnimatorCallback animatorCallback) {
            this.callbacks.add(new EmptyAnimatorListener() { // from class: com.daimajia.androidanimations.library.YoYo.AnimationComposer.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.daimajia.androidanimations.library.YoYo.EmptyAnimatorListener, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    animatorCallback.call(animator);
                }
            });
            return this;
        }

        public AnimationComposer onEnd(final AnimatorCallback animatorCallback) {
            this.callbacks.add(new EmptyAnimatorListener() { // from class: com.daimajia.androidanimations.library.YoYo.AnimationComposer.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.daimajia.androidanimations.library.YoYo.EmptyAnimatorListener, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    animatorCallback.call(animator);
                }
            });
            return this;
        }

        public AnimationComposer onRepeat(final AnimatorCallback animatorCallback) {
            this.callbacks.add(new EmptyAnimatorListener() { // from class: com.daimajia.androidanimations.library.YoYo.AnimationComposer.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.daimajia.androidanimations.library.YoYo.EmptyAnimatorListener, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    animatorCallback.call(animator);
                }
            });
            return this;
        }

        public AnimationComposer onStart(final AnimatorCallback animatorCallback) {
            this.callbacks.add(new EmptyAnimatorListener() { // from class: com.daimajia.androidanimations.library.YoYo.AnimationComposer.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.daimajia.androidanimations.library.YoYo.EmptyAnimatorListener, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    animatorCallback.call(animator);
                }
            });
            return this;
        }

        public AnimationComposer pivot(float f10, float f11) {
            this.pivotX = f10;
            this.pivotY = f11;
            return this;
        }

        public AnimationComposer pivotX(float f10) {
            this.pivotX = f10;
            return this;
        }

        public AnimationComposer pivotY(float f10) {
            this.pivotY = f10;
            return this;
        }

        public YoYoString playOn(View view) {
            this.target = view;
            return new YoYoString(new YoYo(this).play(), this.target);
        }

        public AnimationComposer repeat(int i10) {
            if (i10 < -1) {
                throw new RuntimeException("Can not be less than -1, -1 is infinite loop");
            }
            this.repeat = i10 != 0;
            this.repeatTimes = i10;
            return this;
        }

        public AnimationComposer repeatMode(int i10) {
            this.repeatMode = i10;
            return this;
        }

        public AnimationComposer withListener(Animator.AnimatorListener animatorListener) {
            this.callbacks.add(animatorListener);
            return this;
        }
    }

    public interface AnimatorCallback {
        void call(Animator animator);
    }

    public static class EmptyAnimatorListener implements Animator.AnimatorListener {
        private EmptyAnimatorListener() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static final class YoYoString {
        private BaseViewAnimator animator;
        private View target;

        private YoYoString(BaseViewAnimator baseViewAnimator, View view) {
            this.target = view;
            this.animator = baseViewAnimator;
        }

        public boolean isRunning() {
            return this.animator.isRunning();
        }

        public boolean isStarted() {
            return this.animator.isStarted();
        }

        public void stop() {
            stop(true);
        }

        public void stop(boolean z10) {
            this.animator.cancel();
            if (z10) {
                this.animator.reset(this.target);
            }
        }
    }

    private YoYo(AnimationComposer animationComposer) {
        this.animator = animationComposer.animator;
        this.duration = animationComposer.duration;
        this.delay = animationComposer.delay;
        this.repeat = animationComposer.repeat;
        this.repeatTimes = animationComposer.repeatTimes;
        this.repeatMode = animationComposer.repeatMode;
        this.interpolator = animationComposer.interpolator;
        this.pivotX = animationComposer.pivotX;
        this.pivotY = animationComposer.pivotY;
        this.callbacks = animationComposer.callbacks;
        this.target = animationComposer.target;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BaseViewAnimator play() {
        this.animator.setTarget(this.target);
        float f10 = this.pivotX;
        if (f10 == Float.MAX_VALUE) {
            View view = this.target;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            view.setPivotX(measuredWidth);
        } else {
            this.target.setPivotX(f10);
        }
        float f11 = this.pivotY;
        if (f11 == Float.MAX_VALUE) {
            View view2 = this.target;
            float measuredHeight = view2.getMeasuredHeight() / 2.0f;
            WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
            view2.setPivotY(measuredHeight);
        } else {
            this.target.setPivotY(f11);
        }
        this.animator.setDuration(this.duration).setRepeatTimes(this.repeatTimes).setRepeatMode(this.repeatMode).setInterpolator(this.interpolator).setStartDelay(this.delay);
        if (this.callbacks.size() > 0) {
            Iterator<Animator.AnimatorListener> it = this.callbacks.iterator();
            while (it.hasNext()) {
                this.animator.addAnimatorListener(it.next());
            }
        }
        this.animator.animate();
        return this.animator;
    }

    public static AnimationComposer with(BaseViewAnimator baseViewAnimator) {
        return new AnimationComposer(baseViewAnimator);
    }

    public static AnimationComposer with(Techniques techniques) {
        return new AnimationComposer(techniques);
    }
}
