package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.viewpager2.adapter.a;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class Shimmer {
    private static final int COMPONENT_COUNT = 4;
    public long repeatDelay;
    public final float[] positions = new float[4];
    public final int[] colors = new int[4];
    public final RectF bounds = new RectF();
    public int direction = 0;
    public int highlightColor = -1;
    public int baseColor = 1291845631;
    public int shape = 0;
    public int fixedWidth = 0;
    public int fixedHeight = 0;
    public float widthRatio = 1.0f;
    public float heightRatio = 1.0f;
    public float intensity = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    public float dropoff = 0.5f;
    public float tilt = 20.0f;
    public boolean clipToChildren = true;
    public boolean autoStart = true;
    public boolean alphaShimmer = true;
    public int repeatCount = -1;
    public int repeatMode = 1;
    public long animationDuration = 1000;

    public static class AlphaHighlightBuilder extends Builder<AlphaHighlightBuilder> {
        public AlphaHighlightBuilder() {
            this.mShimmer.alphaShimmer = true;
        }

        @Override // com.facebook.shimmer.Shimmer.Builder
        public AlphaHighlightBuilder getThis() {
            return this;
        }
    }

    public static abstract class Builder<T extends Builder<T>> {
        public final Shimmer mShimmer = new Shimmer();

        private static float clamp(float f10, float f11, float f12) {
            return Math.min(f11, Math.max(f10, f12));
        }

        public Shimmer build() {
            this.mShimmer.updateColors();
            this.mShimmer.updatePositions();
            return this.mShimmer;
        }

        public T consumeAttributes(Context context, AttributeSet attributeSet) {
            return (T) consumeAttributes(context.obtainStyledAttributes(attributeSet, R.styleable.ShimmerFrameLayout, 0, 0));
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00b7 A[PHI: r1
  0x00b7: PHI (r1v36 int) = (r1v35 int), (r1v37 int) binds: [B:31:0x00ae, B:33:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
        public T consumeAttributes(TypedArray typedArray) {
            int i10 = R.styleable.ShimmerFrameLayout_shimmer_clip_to_children;
            if (typedArray.hasValue(i10)) {
                setClipToChildren(typedArray.getBoolean(i10, this.mShimmer.clipToChildren));
            }
            int i11 = R.styleable.ShimmerFrameLayout_shimmer_auto_start;
            if (typedArray.hasValue(i11)) {
                setAutoStart(typedArray.getBoolean(i11, this.mShimmer.autoStart));
            }
            int i12 = R.styleable.ShimmerFrameLayout_shimmer_base_alpha;
            if (typedArray.hasValue(i12)) {
                setBaseAlpha(typedArray.getFloat(i12, 0.3f));
            }
            int i13 = R.styleable.ShimmerFrameLayout_shimmer_highlight_alpha;
            if (typedArray.hasValue(i13)) {
                setHighlightAlpha(typedArray.getFloat(i13, 1.0f));
            }
            int i14 = R.styleable.ShimmerFrameLayout_shimmer_duration;
            if (typedArray.hasValue(i14)) {
                setDuration(typedArray.getInt(i14, (int) this.mShimmer.animationDuration));
            }
            int i15 = R.styleable.ShimmerFrameLayout_shimmer_repeat_count;
            if (typedArray.hasValue(i15)) {
                setRepeatCount(typedArray.getInt(i15, this.mShimmer.repeatCount));
            }
            int i16 = R.styleable.ShimmerFrameLayout_shimmer_repeat_delay;
            if (typedArray.hasValue(i16)) {
                setRepeatDelay(typedArray.getInt(i16, (int) this.mShimmer.repeatDelay));
            }
            int i17 = R.styleable.ShimmerFrameLayout_shimmer_repeat_mode;
            if (typedArray.hasValue(i17)) {
                setRepeatMode(typedArray.getInt(i17, this.mShimmer.repeatMode));
            }
            int i18 = R.styleable.ShimmerFrameLayout_shimmer_direction;
            if (typedArray.hasValue(i18)) {
                int i19 = typedArray.getInt(i18, this.mShimmer.direction);
                if (i19 != 1) {
                    int i20 = 2;
                    if (i19 != 2) {
                        i20 = 3;
                        if (i19 != 3) {
                            setDirection(0);
                        } else {
                            setDirection(i20);
                        }
                    } else {
                        setDirection(i20);
                    }
                } else {
                    setDirection(1);
                }
            }
            int i21 = R.styleable.ShimmerFrameLayout_shimmer_shape;
            if (typedArray.hasValue(i21)) {
                if (typedArray.getInt(i21, this.mShimmer.shape) != 1) {
                    setShape(0);
                } else {
                    setShape(1);
                }
            }
            int i22 = R.styleable.ShimmerFrameLayout_shimmer_dropoff;
            if (typedArray.hasValue(i22)) {
                setDropoff(typedArray.getFloat(i22, this.mShimmer.dropoff));
            }
            int i23 = R.styleable.ShimmerFrameLayout_shimmer_fixed_width;
            if (typedArray.hasValue(i23)) {
                setFixedWidth(typedArray.getDimensionPixelSize(i23, this.mShimmer.fixedWidth));
            }
            int i24 = R.styleable.ShimmerFrameLayout_shimmer_fixed_height;
            if (typedArray.hasValue(i24)) {
                setFixedHeight(typedArray.getDimensionPixelSize(i24, this.mShimmer.fixedHeight));
            }
            int i25 = R.styleable.ShimmerFrameLayout_shimmer_intensity;
            if (typedArray.hasValue(i25)) {
                setIntensity(typedArray.getFloat(i25, this.mShimmer.intensity));
            }
            int i26 = R.styleable.ShimmerFrameLayout_shimmer_width_ratio;
            if (typedArray.hasValue(i26)) {
                setWidthRatio(typedArray.getFloat(i26, this.mShimmer.widthRatio));
            }
            int i27 = R.styleable.ShimmerFrameLayout_shimmer_height_ratio;
            if (typedArray.hasValue(i27)) {
                setHeightRatio(typedArray.getFloat(i27, this.mShimmer.heightRatio));
            }
            int i28 = R.styleable.ShimmerFrameLayout_shimmer_tilt;
            if (typedArray.hasValue(i28)) {
                setTilt(typedArray.getFloat(i28, this.mShimmer.tilt));
            }
            return (T) getThis();
        }

        public T copyFrom(Shimmer shimmer) {
            setDirection(shimmer.direction);
            setShape(shimmer.shape);
            setFixedWidth(shimmer.fixedWidth);
            setFixedHeight(shimmer.fixedHeight);
            setWidthRatio(shimmer.widthRatio);
            setHeightRatio(shimmer.heightRatio);
            setIntensity(shimmer.intensity);
            setDropoff(shimmer.dropoff);
            setTilt(shimmer.tilt);
            setClipToChildren(shimmer.clipToChildren);
            setAutoStart(shimmer.autoStart);
            setRepeatCount(shimmer.repeatCount);
            setRepeatMode(shimmer.repeatMode);
            setRepeatDelay(shimmer.repeatDelay);
            setDuration(shimmer.animationDuration);
            Shimmer shimmer2 = this.mShimmer;
            shimmer2.baseColor = shimmer.baseColor;
            shimmer2.highlightColor = shimmer.highlightColor;
            return (T) getThis();
        }

        public abstract T getThis();

        public T setAutoStart(boolean z10) {
            this.mShimmer.autoStart = z10;
            return (T) getThis();
        }

        public T setBaseAlpha(float f10) {
            int iClamp = (int) (clamp(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f, f10) * 255.0f);
            Shimmer shimmer = this.mShimmer;
            shimmer.baseColor = (iClamp << 24) | (shimmer.baseColor & 16777215);
            return (T) getThis();
        }

        public T setClipToChildren(boolean z10) {
            this.mShimmer.clipToChildren = z10;
            return (T) getThis();
        }

        public T setDirection(int i10) {
            this.mShimmer.direction = i10;
            return (T) getThis();
        }

        public T setDropoff(float f10) {
            if (f10 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                this.mShimmer.dropoff = f10;
                return (T) getThis();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f10);
        }

        public T setDuration(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException(a.a("Given a negative duration: ", j10));
            }
            this.mShimmer.animationDuration = j10;
            return (T) getThis();
        }

        public T setFixedHeight(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("Given invalid height: ", i10));
            }
            this.mShimmer.fixedHeight = i10;
            return (T) getThis();
        }

        public T setFixedWidth(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("Given invalid width: ", i10));
            }
            this.mShimmer.fixedWidth = i10;
            return (T) getThis();
        }

        public T setHeightRatio(float f10) {
            if (f10 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                this.mShimmer.heightRatio = f10;
                return (T) getThis();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f10);
        }

        public T setHighlightAlpha(float f10) {
            int iClamp = (int) (clamp(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f, f10) * 255.0f);
            Shimmer shimmer = this.mShimmer;
            shimmer.highlightColor = (iClamp << 24) | (shimmer.highlightColor & 16777215);
            return (T) getThis();
        }

        public T setIntensity(float f10) {
            if (f10 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                this.mShimmer.intensity = f10;
                return (T) getThis();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f10);
        }

        public T setRepeatCount(int i10) {
            this.mShimmer.repeatCount = i10;
            return (T) getThis();
        }

        public T setRepeatDelay(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException(a.a("Given a negative repeat delay: ", j10));
            }
            this.mShimmer.repeatDelay = j10;
            return (T) getThis();
        }

        public T setRepeatMode(int i10) {
            this.mShimmer.repeatMode = i10;
            return (T) getThis();
        }

        public T setShape(int i10) {
            this.mShimmer.shape = i10;
            return (T) getThis();
        }

        public T setTilt(float f10) {
            this.mShimmer.tilt = f10;
            return (T) getThis();
        }

        public T setWidthRatio(float f10) {
            if (f10 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                this.mShimmer.widthRatio = f10;
                return (T) getThis();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f10);
        }
    }

    public static class ColorHighlightBuilder extends Builder<ColorHighlightBuilder> {
        public ColorHighlightBuilder() {
            this.mShimmer.alphaShimmer = false;
        }

        @Override // com.facebook.shimmer.Shimmer.Builder
        public ColorHighlightBuilder consumeAttributes(TypedArray typedArray) {
            super.consumeAttributes(typedArray);
            int i10 = R.styleable.ShimmerFrameLayout_shimmer_base_color;
            if (typedArray.hasValue(i10)) {
                setBaseColor(typedArray.getColor(i10, this.mShimmer.baseColor));
            }
            int i11 = R.styleable.ShimmerFrameLayout_shimmer_highlight_color;
            if (typedArray.hasValue(i11)) {
                setHighlightColor(typedArray.getColor(i11, this.mShimmer.highlightColor));
            }
            return getThis();
        }

        @Override // com.facebook.shimmer.Shimmer.Builder
        public ColorHighlightBuilder getThis() {
            return this;
        }

        public ColorHighlightBuilder setBaseColor(int i10) {
            Shimmer shimmer = this.mShimmer;
            shimmer.baseColor = (i10 & 16777215) | (shimmer.baseColor & (-16777216));
            return getThis();
        }

        public ColorHighlightBuilder setHighlightColor(int i10) {
            this.mShimmer.highlightColor = i10;
            return getThis();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Direction {
        public static final int BOTTOM_TO_TOP = 3;
        public static final int LEFT_TO_RIGHT = 0;
        public static final int RIGHT_TO_LEFT = 2;
        public static final int TOP_TO_BOTTOM = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Shape {
        public static final int LINEAR = 0;
        public static final int RADIAL = 1;
    }

    public int height(int i10) {
        int i11 = this.fixedHeight;
        return i11 > 0 ? i11 : Math.round(this.heightRatio * i10);
    }

    public void updateBounds(int i10, int i11) {
        double dMax = Math.max(i10, i11);
        int iRound = Math.round(((float) ((dMax / Math.sin(1.5707963267948966d - Math.toRadians(this.tilt % 90.0f))) - dMax)) / 2.0f) * 3;
        float f10 = -iRound;
        this.bounds.set(f10, f10, width(i10) + iRound, height(i11) + iRound);
    }

    public void updateColors() {
        if (this.shape != 1) {
            int[] iArr = this.colors;
            int i10 = this.baseColor;
            iArr[0] = i10;
            int i11 = this.highlightColor;
            iArr[1] = i11;
            iArr[2] = i11;
            iArr[3] = i10;
            return;
        }
        int[] iArr2 = this.colors;
        int i12 = this.highlightColor;
        iArr2[0] = i12;
        iArr2[1] = i12;
        int i13 = this.baseColor;
        iArr2[2] = i13;
        iArr2[3] = i13;
    }

    public void updatePositions() {
        if (this.shape != 1) {
            this.positions[0] = Math.max(((1.0f - this.intensity) - this.dropoff) / 2.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            this.positions[1] = Math.max(((1.0f - this.intensity) - 0.001f) / 2.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            this.positions[2] = Math.min(((this.intensity + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.positions[3] = Math.min(((this.intensity + 1.0f) + this.dropoff) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.positions;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.intensity, 1.0f);
        this.positions[2] = Math.min(this.intensity + this.dropoff, 1.0f);
        this.positions[3] = 1.0f;
    }

    public int width(int i10) {
        int i11 = this.fixedWidth;
        return i11 > 0 ? i11 : Math.round(this.widthRatio * i10);
    }
}
