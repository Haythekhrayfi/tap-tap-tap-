package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import w.e;

/* JADX INFO: loaded from: classes.dex */
public final class ShimmerDrawable extends Drawable {
    private final Rect mDrawRect;
    private final Matrix mShaderMatrix;
    private Shimmer mShimmer;
    private final Paint mShimmerPaint;
    private final ValueAnimator.AnimatorUpdateListener mUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.facebook.shimmer.ShimmerDrawable.1
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShimmerDrawable.this.invalidateSelf();
        }
    };
    private ValueAnimator mValueAnimator;

    public ShimmerDrawable() {
        Paint paint = new Paint();
        this.mShimmerPaint = paint;
        this.mDrawRect = new Rect();
        this.mShaderMatrix = new Matrix();
        paint.setAntiAlias(true);
    }

    private float offset(float f10, float f11, float f12) {
        return e.a(f11, f10, f12, f10);
    }

    private void updateShader() {
        Shimmer shimmer;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (shimmer = this.mShimmer) == null) {
            return;
        }
        int iWidth2 = shimmer.width(iWidth);
        int iHeight2 = this.mShimmer.height(iHeight);
        Shimmer shimmer2 = this.mShimmer;
        boolean z10 = true;
        if (shimmer2.shape != 1) {
            int i10 = shimmer2.direction;
            if (i10 != 1 && i10 != 3) {
                z10 = false;
            }
            if (z10) {
                iWidth2 = 0;
            }
            if (!z10) {
                iHeight2 = 0;
            }
            float f10 = iHeight2;
            Shimmer shimmer3 = this.mShimmer;
            radialGradient = new LinearGradient(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, iWidth2, f10, shimmer3.colors, shimmer3.positions, Shader.TileMode.CLAMP);
        } else {
            float f11 = iHeight2 / 2.0f;
            float fMax = (float) (((double) Math.max(iWidth2, iHeight2)) / Math.sqrt(2.0d));
            Shimmer shimmer4 = this.mShimmer;
            radialGradient = new RadialGradient(iWidth2 / 2.0f, f11, fMax, shimmer4.colors, shimmer4.positions, Shader.TileMode.CLAMP);
        }
        this.mShimmerPaint.setShader(radialGradient);
    }

    private void updateValueAnimator() {
        boolean zIsStarted;
        if (this.mShimmer == null) {
            return;
        }
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null) {
            zIsStarted = valueAnimator.isStarted();
            this.mValueAnimator.cancel();
            this.mValueAnimator.removeAllUpdateListeners();
        } else {
            zIsStarted = false;
        }
        Shimmer shimmer = this.mShimmer;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, (shimmer.repeatDelay / shimmer.animationDuration) + 1.0f);
        this.mValueAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setRepeatMode(this.mShimmer.repeatMode);
        this.mValueAnimator.setRepeatCount(this.mShimmer.repeatCount);
        ValueAnimator valueAnimator2 = this.mValueAnimator;
        Shimmer shimmer2 = this.mShimmer;
        valueAnimator2.setDuration(shimmer2.animationDuration + shimmer2.repeatDelay);
        this.mValueAnimator.addUpdateListener(this.mUpdateListener);
        if (zIsStarted) {
            this.mValueAnimator.start();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float fOffset;
        float fOffset2;
        if (this.mShimmer == null || this.mShimmerPaint.getShader() == null) {
            return;
        }
        float fTan = (float) Math.tan(Math.toRadians(this.mShimmer.tilt));
        float fWidth = (this.mDrawRect.width() * fTan) + this.mDrawRect.height();
        float fHeight = (fTan * this.mDrawRect.height()) + this.mDrawRect.width();
        ValueAnimator valueAnimator = this.mValueAnimator;
        float f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        int i10 = this.mShimmer.direction;
        if (i10 != 1) {
            if (i10 == 2) {
                fOffset2 = offset(fHeight, -fHeight, animatedFraction);
            } else if (i10 != 3) {
                fOffset2 = offset(-fHeight, fHeight, animatedFraction);
            } else {
                fOffset = offset(fWidth, -fWidth, animatedFraction);
            }
            f10 = fOffset2;
            fOffset = 0.0f;
        } else {
            fOffset = offset(-fWidth, fWidth, animatedFraction);
        }
        this.mShaderMatrix.reset();
        this.mShaderMatrix.setRotate(this.mShimmer.tilt, this.mDrawRect.width() / 2.0f, this.mDrawRect.height() / 2.0f);
        this.mShaderMatrix.postTranslate(f10, fOffset);
        this.mShimmerPaint.getShader().setLocalMatrix(this.mShaderMatrix);
        canvas.drawRect(this.mDrawRect, this.mShimmerPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Shimmer shimmer = this.mShimmer;
        return (shimmer == null || !(shimmer.clipToChildren || shimmer.alphaShimmer)) ? -1 : -3;
    }

    public boolean isShimmerStarted() {
        ValueAnimator valueAnimator = this.mValueAnimator;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public void maybeStartShimmer() {
        Shimmer shimmer;
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator == null || valueAnimator.isStarted() || (shimmer = this.mShimmer) == null || !shimmer.autoStart || getCallback() == null) {
            return;
        }
        this.mValueAnimator.start();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mDrawRect.set(0, 0, rect.width(), rect.height());
        updateShader();
        maybeStartShimmer();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setShimmer(Shimmer shimmer) {
        this.mShimmer = shimmer;
        if (shimmer != null) {
            this.mShimmerPaint.setXfermode(new PorterDuffXfermode(this.mShimmer.alphaShimmer ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        updateShader();
        updateValueAnimator();
        invalidateSelf();
    }

    public void startShimmer() {
        if (this.mValueAnimator == null || isShimmerStarted() || getCallback() == null) {
            return;
        }
        this.mValueAnimator.start();
    }

    public void stopShimmer() {
        if (this.mValueAnimator == null || !isShimmerStarted()) {
            return;
        }
        this.mValueAnimator.cancel();
    }
}
