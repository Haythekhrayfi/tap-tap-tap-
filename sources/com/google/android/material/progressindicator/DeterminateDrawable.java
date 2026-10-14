package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import java.util.ArrayList;
import java.util.Objects;
import x0.a;
import x0.b;
import x0.c;
import x0.e;
import x0.f;

/* JADX INFO: loaded from: classes2.dex */
public final class DeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    private static final c<DeterminateDrawable> INDICATOR_LENGTH_IN_LEVEL = new c<DeterminateDrawable>("indicatorLevel") { // from class: com.google.android.material.progressindicator.DeterminateDrawable.1
        @Override // x0.c
        public float getValue(DeterminateDrawable determinateDrawable) {
            return determinateDrawable.getIndicatorFraction() * 10000.0f;
        }

        @Override // x0.c
        public void setValue(DeterminateDrawable determinateDrawable, float f10) {
            determinateDrawable.setIndicatorFraction(f10 / 10000.0f);
        }
    };
    private static final int MAX_DRAWABLE_LEVEL = 10000;
    private static final float SPRING_FORCE_STIFFNESS = 50.0f;
    private DrawingDelegate<S> drawingDelegate;
    private float indicatorFraction;
    private boolean skipAnimationOnLevelChange;
    private final e springAnimation;
    private final f springForce;

    public DeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, DrawingDelegate<S> drawingDelegate) {
        super(context, baseProgressIndicatorSpec);
        this.skipAnimationOnLevelChange = false;
        setDrawingDelegate(drawingDelegate);
        f fVar = new f();
        this.springForce = fVar;
        Objects.requireNonNull(fVar);
        fVar.f37368b = 1.0f;
        fVar.f37369c = false;
        fVar.a(SPRING_FORCE_STIFFNESS);
        e eVar = new e(this, INDICATOR_LENGTH_IN_LEVEL);
        this.springAnimation = eVar;
        eVar.f37364r = fVar;
        setGrowFraction(1.0f);
    }

    public static DeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new DeterminateDrawable<>(context, circularProgressIndicatorSpec, new CircularDrawingDelegate(circularProgressIndicatorSpec));
    }

    public static DeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new DeterminateDrawable<>(context, linearProgressIndicatorSpec, new LinearDrawingDelegate(linearProgressIndicatorSpec));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getIndicatorFraction() {
        return this.indicatorFraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndicatorFraction(float f10) {
        this.indicatorFraction = f10;
        invalidateSelf();
    }

    public void addSpringAnimationEndListener(b.q qVar) {
        e eVar = this.springAnimation;
        if (eVar.f37357j.contains(qVar)) {
            return;
        }
        eVar.f37357j.add(qVar);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.drawingDelegate.validateSpecAndAdjustCanvas(canvas, getGrowFraction());
            this.drawingDelegate.fillTrack(canvas, this.paint);
            this.drawingDelegate.fillIndicator(canvas, this.paint, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, getIndicatorFraction(), MaterialColors.compositeARGBWithAlpha(this.baseSpec.indicatorColors[0], getAlpha()));
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public DrawingDelegate<S> getDrawingDelegate() {
        return this.drawingDelegate;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawingDelegate.getPreferredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawingDelegate.getPreferredWidth();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.springAnimation.d();
        setIndicatorFraction(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        if (this.skipAnimationOnLevelChange) {
            this.springAnimation.d();
            setIndicatorFraction(i10 / 10000.0f);
        } else {
            e eVar = this.springAnimation;
            eVar.f37349b = getIndicatorFraction() * 10000.0f;
            eVar.f37350c = true;
            e eVar2 = this.springAnimation;
            float f10 = i10;
            if (eVar2.f37353f) {
                eVar2.f37365s = f10;
            } else {
                if (eVar2.f37364r == null) {
                    eVar2.f37364r = new f(f10);
                }
                f fVar = eVar2.f37364r;
                double d10 = f10;
                fVar.f37375i = d10;
                double d11 = (float) d10;
                if (d11 > Float.MAX_VALUE) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
                if (d11 < eVar2.f37354g) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
                double dAbs = Math.abs(eVar2.f37356i * 0.75f);
                fVar.f37370d = dAbs;
                fVar.f37371e = dAbs * 62.5d;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                boolean z10 = eVar2.f37353f;
                if (!z10 && !z10) {
                    eVar2.f37353f = true;
                    if (!eVar2.f37350c) {
                        eVar2.f37349b = eVar2.f37352e.getValue(eVar2.f37351d);
                    }
                    float f11 = eVar2.f37349b;
                    if (f11 > Float.MAX_VALUE || f11 < eVar2.f37354g) {
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    a aVarA = a.a();
                    if (aVarA.f37332b.size() == 0) {
                        if (aVarA.f37334d == null) {
                            aVarA.f37334d = new a.d(aVarA.f37333c);
                        }
                        a.d dVar = (a.d) aVarA.f37334d;
                        dVar.f37339b.postFrameCallback(dVar.f37340c);
                    }
                    if (!aVarA.f37332b.contains(eVar2)) {
                        aVarA.f37332b.add(eVar2);
                    }
                }
            }
        }
        return true;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ void registerAnimationCallback(s1.a aVar) {
        super.registerAnimationCallback(aVar);
    }

    public void removeSpringAnimationEndListener(b.q qVar) {
        ArrayList<b.q> arrayList = this.springAnimation.f37357j;
        int iIndexOf = arrayList.indexOf(qVar);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public void setDrawingDelegate(DrawingDelegate<S> drawingDelegate) {
        this.drawingDelegate = drawingDelegate;
        drawingDelegate.registerDrawable(this);
    }

    public void setLevelByFraction(float f10) {
        setLevel((int) (f10 * 10000.0f));
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11, boolean z12) {
        return super.setVisible(z10, z11, z12);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public boolean setVisibleInternal(boolean z10, boolean z11, boolean z12) {
        boolean visibleInternal = super.setVisibleInternal(z10, z11, z12);
        float systemAnimatorDurationScale = this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver());
        if (systemAnimatorDurationScale == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            this.skipAnimationOnLevelChange = true;
        } else {
            this.skipAnimationOnLevelChange = false;
            this.springForce.a(SPRING_FORCE_STIFFNESS / systemAnimatorDurationScale);
        }
        return visibleInternal;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(s1.a aVar) {
        return super.unregisterAnimationCallback(aVar);
    }
}
