package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import com.google.android.material.R;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import e0.a;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class ShadowDrawableWrapper extends DrawableWrapper {
    public static final double COS_45 = Math.cos(Math.toRadians(45.0d));
    public static final float SHADOW_BOTTOM_SCALE = 1.0f;
    public static final float SHADOW_HORIZ_SCALE = 0.5f;
    public static final float SHADOW_MULTIPLIER = 1.5f;
    public static final float SHADOW_TOP_SCALE = 0.25f;
    private boolean addPaddingForCorners;
    public final RectF contentBounds;
    public float cornerRadius;
    public final Paint cornerShadowPaint;
    public Path cornerShadowPath;
    private boolean dirty;
    public final Paint edgeShadowPaint;
    public float maxShadowSize;
    private boolean printedShadowClipWarning;
    public float rawMaxShadowSize;
    public float rawShadowSize;
    private float rotation;
    private final int shadowEndColor;
    private final int shadowMiddleColor;
    public float shadowSize;
    private final int shadowStartColor;

    public ShadowDrawableWrapper(Context context, Drawable drawable, float f10, float f11, float f12) {
        super(drawable);
        this.dirty = true;
        this.addPaddingForCorners = true;
        this.printedShadowClipWarning = false;
        int i10 = R.color.design_fab_shadow_start_color;
        Object obj = a.f28964a;
        this.shadowStartColor = a.d.a(context, i10);
        this.shadowMiddleColor = a.d.a(context, R.color.design_fab_shadow_mid_color);
        this.shadowEndColor = a.d.a(context, R.color.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.cornerShadowPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.cornerRadius = Math.round(f10);
        this.contentBounds = new RectF();
        Paint paint2 = new Paint(paint);
        this.edgeShadowPaint = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f11, f12);
    }

    private void buildComponents(Rect rect) {
        float f10 = this.rawMaxShadowSize;
        float f11 = 1.5f * f10;
        this.contentBounds.set(rect.left + f10, rect.top + f11, rect.right - f10, rect.bottom - f11);
        Drawable wrappedDrawable = getWrappedDrawable();
        RectF rectF = this.contentBounds;
        wrappedDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        buildShadowCorners();
    }

    private void buildShadowCorners() {
        float f10 = this.cornerRadius;
        RectF rectF = new RectF(-f10, -f10, f10, f10);
        RectF rectF2 = new RectF(rectF);
        float f11 = this.shadowSize;
        rectF2.inset(-f11, -f11);
        Path path = this.cornerShadowPath;
        if (path == null) {
            this.cornerShadowPath = new Path();
        } else {
            path.reset();
        }
        this.cornerShadowPath.setFillType(Path.FillType.EVEN_ODD);
        this.cornerShadowPath.moveTo(-this.cornerRadius, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.cornerShadowPath.rLineTo(-this.shadowSize, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.cornerShadowPath.arcTo(rectF2, 180.0f, 90.0f, false);
        this.cornerShadowPath.arcTo(rectF, 270.0f, -90.0f, false);
        this.cornerShadowPath.close();
        float f12 = -rectF2.top;
        if (f12 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            float f13 = this.cornerRadius / f12;
            this.cornerShadowPaint.setShader(new RadialGradient(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f12, new int[]{0, this.shadowStartColor, this.shadowMiddleColor, this.shadowEndColor}, new float[]{StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f13, g0.a.a(1.0f, f13, 2.0f, f13), 1.0f}, Shader.TileMode.CLAMP));
        }
        this.edgeShadowPaint.setShader(new LinearGradient(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, rectF.top, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, rectF2.top, new int[]{this.shadowStartColor, this.shadowMiddleColor, this.shadowEndColor}, new float[]{StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.edgeShadowPaint.setAntiAlias(false);
    }

    public static float calculateHorizontalPadding(float f10, float f11, boolean z10) {
        if (!z10) {
            return f10;
        }
        return (float) (((1.0d - COS_45) * ((double) f11)) + ((double) f10));
    }

    public static float calculateVerticalPadding(float f10, float f11, boolean z10) {
        float f12 = f10 * 1.5f;
        if (!z10) {
            return f12;
        }
        return (float) (((1.0d - COS_45) * ((double) f11)) + ((double) f12));
    }

    private void drawShadow(Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(this.rotation, this.contentBounds.centerX(), this.contentBounds.centerY());
        float f10 = this.cornerRadius;
        float f11 = (-f10) - this.shadowSize;
        float f12 = f10 * 2.0f;
        boolean z10 = this.contentBounds.width() - f12 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        boolean z11 = this.contentBounds.height() - f12 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        float f13 = this.rawShadowSize;
        float f14 = f10 / ((f13 - (0.5f * f13)) + f10);
        float f15 = f10 / ((f13 - (0.25f * f13)) + f10);
        float f16 = f10 / ((f13 - (f13 * 1.0f)) + f10);
        int iSave2 = canvas.save();
        RectF rectF = this.contentBounds;
        canvas.translate(rectF.left + f10, rectF.top + f10);
        canvas.scale(f14, f15);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z10) {
            canvas.scale(1.0f / f14, 1.0f);
            canvas.drawRect(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f11, this.contentBounds.width() - f12, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        RectF rectF2 = this.contentBounds;
        canvas.translate(rectF2.right - f10, rectF2.bottom - f10);
        canvas.scale(f14, f16);
        canvas.rotate(180.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z10) {
            canvas.scale(1.0f / f14, 1.0f);
            canvas.drawRect(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f11, this.contentBounds.width() - f12, (-this.cornerRadius) + this.shadowSize, this.edgeShadowPaint);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF3 = this.contentBounds;
        canvas.translate(rectF3.left + f10, rectF3.bottom - f10);
        canvas.scale(f14, r6);
        canvas.rotate(270.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z11) {
            canvas.scale(1.0f / f16, 1.0f);
            canvas.drawRect(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f11, this.contentBounds.height() - f12, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(iSave4);
        int iSave5 = canvas.save();
        RectF rectF4 = this.contentBounds;
        canvas.translate(rectF4.right - f10, rectF4.top + f10);
        canvas.scale(f14, f15);
        canvas.rotate(90.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z11) {
            canvas.scale(1.0f / f15, 1.0f);
            canvas.drawRect(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f11, this.contentBounds.height() - f12, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(iSave5);
        canvas.restoreToCount(iSave);
    }

    private static int toEven(float f10) {
        int iRound = Math.round(f10);
        return iRound % 2 == 1 ? iRound - 1 : iRound;
    }

    public void draw(Canvas canvas) {
        if (this.dirty) {
            buildComponents(getBounds());
            this.dirty = false;
        }
        drawShadow(canvas);
        super.draw(canvas);
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public float getMaxShadowSize() {
        return this.rawMaxShadowSize;
    }

    public float getMinHeight() {
        float f10 = this.rawMaxShadowSize;
        return (this.rawMaxShadowSize * 1.5f * 2.0f) + (Math.max(f10, ((f10 * 1.5f) / 2.0f) + this.cornerRadius) * 2.0f);
    }

    public float getMinWidth() {
        float f10 = this.rawMaxShadowSize;
        return (this.rawMaxShadowSize * 2.0f) + (Math.max(f10, (f10 / 2.0f) + this.cornerRadius) * 2.0f);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(calculateVerticalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        int iCeil2 = (int) Math.ceil(calculateHorizontalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    public float getShadowSize() {
        return this.rawShadowSize;
    }

    public void onBoundsChange(Rect rect) {
        this.dirty = true;
    }

    public void setAddPaddingForCorners(boolean z10) {
        this.addPaddingForCorners = z10;
        invalidateSelf();
    }

    public void setAlpha(int i10) {
        super.setAlpha(i10);
        this.cornerShadowPaint.setAlpha(i10);
        this.edgeShadowPaint.setAlpha(i10);
    }

    public void setCornerRadius(float f10) {
        float fRound = Math.round(f10);
        if (this.cornerRadius == fRound) {
            return;
        }
        this.cornerRadius = fRound;
        this.dirty = true;
        invalidateSelf();
    }

    public void setMaxShadowSize(float f10) {
        setShadowSize(this.rawShadowSize, f10);
    }

    public final void setRotation(float f10) {
        if (this.rotation != f10) {
            this.rotation = f10;
            invalidateSelf();
        }
    }

    public void setShadowSize(float f10) {
        setShadowSize(f10, this.rawMaxShadowSize);
    }

    public void setShadowSize(float f10, float f11) {
        if (f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f11 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float even = toEven(f10);
        float even2 = toEven(f11);
        if (even > even2) {
            if (!this.printedShadowClipWarning) {
                this.printedShadowClipWarning = true;
            }
            even = even2;
        }
        if (this.rawShadowSize == even && this.rawMaxShadowSize == even2) {
            return;
        }
        this.rawShadowSize = even;
        this.rawMaxShadowSize = even2;
        this.shadowSize = Math.round(even * 1.5f);
        this.maxShadowSize = even2;
        this.dirty = true;
        invalidateSelf();
    }
}
