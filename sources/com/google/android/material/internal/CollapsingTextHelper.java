package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import androidx.activity.i;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TypefaceUtils;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.f;
import p0.e0;
import p0.m0;
import w.e;

/* JADX INFO: loaded from: classes2.dex */
public final class CollapsingTextHelper {
    private static final boolean DEBUG_DRAW = false;
    private static final String ELLIPSIS_NORMAL = "…";
    private static final float FADE_MODE_THRESHOLD_FRACTION_RELATIVE = 0.5f;
    private static final String TAG = "CollapsingTextHelper";
    private boolean boundsChanged;
    private final Rect collapsedBounds;
    private float collapsedDrawX;
    private float collapsedDrawY;
    private CancelableFontCallback collapsedFontCallback;
    private float collapsedLetterSpacing;
    private ColorStateList collapsedShadowColor;
    private float collapsedShadowDx;
    private float collapsedShadowDy;
    private float collapsedShadowRadius;
    private float collapsedTextBlend;
    private ColorStateList collapsedTextColor;
    private float collapsedTextWidth;
    private Typeface collapsedTypeface;
    private Typeface collapsedTypefaceBold;
    private Typeface collapsedTypefaceDefault;
    private final RectF currentBounds;
    private float currentDrawX;
    private float currentDrawY;
    private float currentLetterSpacing;
    private int currentOffsetY;
    private int currentShadowColor;
    private float currentShadowDx;
    private float currentShadowDy;
    private float currentShadowRadius;
    private float currentTextSize;
    private Typeface currentTypeface;
    private boolean drawTitle;
    private final Rect expandedBounds;
    private float expandedDrawX;
    private float expandedDrawY;
    private CancelableFontCallback expandedFontCallback;
    private float expandedFraction;
    private float expandedLetterSpacing;
    private int expandedLineCount;
    private ColorStateList expandedShadowColor;
    private float expandedShadowDx;
    private float expandedShadowDy;
    private float expandedShadowRadius;
    private float expandedTextBlend;
    private ColorStateList expandedTextColor;
    private Bitmap expandedTitleTexture;
    private Typeface expandedTypeface;
    private Typeface expandedTypefaceBold;
    private Typeface expandedTypefaceDefault;
    private boolean fadeModeEnabled;
    private float fadeModeStartFraction;
    private float fadeModeThresholdFraction;
    private boolean isRtl;
    private TimeInterpolator positionInterpolator;
    private float scale;
    private int[] state;
    private CharSequence text;
    private StaticLayout textLayout;
    private final TextPaint textPaint;
    private TimeInterpolator textSizeInterpolator;
    private CharSequence textToDraw;
    private CharSequence textToDrawCollapsed;
    private Paint texturePaint;
    private final TextPaint tmpPaint;
    private boolean useTexture;
    private final View view;
    private static final boolean USE_SCALING_TEXTURE = false;
    private static final Paint DEBUG_DRAW_PAINT = null;
    private int expandedTextGravity = 16;
    private int collapsedTextGravity = 16;
    private float expandedTextSize = 15.0f;
    private float collapsedTextSize = 15.0f;
    private boolean isRtlTextDirectionHeuristicsEnabled = true;
    private int maxLines = 1;
    private float lineSpacingAdd = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    private float lineSpacingMultiplier = 1.0f;
    private int hyphenationFrequency = StaticLayoutBuilderCompat.DEFAULT_HYPHENATION_FREQUENCY;

    public CollapsingTextHelper(View view) {
        this.view = view;
        TextPaint textPaint = new TextPaint(129);
        this.textPaint = textPaint;
        this.tmpPaint = new TextPaint(textPaint);
        this.collapsedBounds = new Rect();
        this.expandedBounds = new Rect();
        this.currentBounds = new RectF();
        this.fadeModeThresholdFraction = calculateFadeModeThresholdFraction();
        maybeUpdateFontWeightAdjustment(view.getContext().getResources().getConfiguration());
    }

    private static int blendARGB(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), Math.round((Color.red(i11) * f10) + (Color.red(i10) * f11)), Math.round((Color.green(i11) * f10) + (Color.green(i10) * f11)), Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0099  */
    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    private void calculateBaseOffsets(boolean z10) {
        float fCenterX;
        float f10;
        float f11;
        StaticLayout staticLayout;
        float height;
        StaticLayout staticLayout2;
        CharSequence charSequence;
        StaticLayout staticLayout3;
        int lineCount;
        int i10;
        float fDescent;
        int i11;
        float fCenterX2;
        float f12;
        StaticLayout staticLayout4;
        calculateUsingTextSize(1.0f, z10);
        CharSequence charSequence2 = this.textToDraw;
        if (charSequence2 != null && (staticLayout4 = this.textLayout) != null) {
            this.textToDrawCollapsed = TextUtils.ellipsize(charSequence2, this.textPaint, staticLayout4.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence3 = this.textToDrawCollapsed;
        float fMeasureTextWidth = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (charSequence3 != null) {
            this.collapsedTextWidth = measureTextWidth(this.textPaint, charSequence3);
        } else {
            this.collapsedTextWidth = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.collapsedTextGravity, this.isRtl ? 1 : 0);
        int i12 = absoluteGravity & 112;
        if (i12 != 48) {
            this.collapsedDrawY = i12 != 80 ? this.collapsedBounds.centerY() - ((this.textPaint.descent() - this.textPaint.ascent()) / 2.0f) : this.textPaint.ascent() + this.collapsedBounds.bottom;
        } else {
            this.collapsedDrawY = this.collapsedBounds.top;
        }
        int i13 = absoluteGravity & 8388615;
        if (i13 != 1) {
            if (i13 != 5) {
                f11 = this.collapsedBounds.left;
            } else {
                fCenterX = this.collapsedBounds.right;
                f10 = this.collapsedTextWidth;
            }
            this.collapsedDrawX = f11;
            calculateUsingTextSize(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, z10);
            staticLayout = this.textLayout;
            if (staticLayout != null) {
                height = staticLayout.getHeight();
            } else {
                height = 0.0f;
            }
            staticLayout2 = this.textLayout;
            if (staticLayout2 != null || this.maxLines <= 1) {
                charSequence = this.textToDraw;
                if (charSequence != null) {
                    fMeasureTextWidth = measureTextWidth(this.textPaint, charSequence);
                }
            } else {
                fMeasureTextWidth = staticLayout2.getWidth();
            }
            staticLayout3 = this.textLayout;
            if (staticLayout3 != null) {
                lineCount = staticLayout3.getLineCount();
            } else {
                lineCount = 0;
            }
            this.expandedLineCount = lineCount;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.expandedTextGravity, this.isRtl ? 1 : 0);
            i10 = absoluteGravity2 & 112;
            if (i10 != 48) {
                if (i10 != 80) {
                    this.expandedDrawY = this.expandedBounds.centerY() - (height / 2.0f);
                } else {
                    fDescent = this.textPaint.descent() + (this.expandedBounds.bottom - height);
                }
                i11 = absoluteGravity2 & 8388615;
                if (i11 != 1) {
                    if (i11 != 5) {
                        f12 = this.expandedBounds.left;
                    } else {
                        fCenterX2 = this.expandedBounds.right;
                    }
                    this.expandedDrawX = f12;
                    clearTexture();
                    setInterpolatedTextSize(this.expandedFraction);
                }
                fCenterX2 = this.expandedBounds.centerX();
                fMeasureTextWidth /= 2.0f;
                f12 = fCenterX2 - fMeasureTextWidth;
                this.expandedDrawX = f12;
                clearTexture();
                setInterpolatedTextSize(this.expandedFraction);
            }
            fDescent = this.expandedBounds.top;
            this.expandedDrawY = fDescent;
            i11 = absoluteGravity2 & 8388615;
            if (i11 != 1) {
                if (i11 != 5) {
                    f12 = this.expandedBounds.left;
                } else {
                    fCenterX2 = this.expandedBounds.right;
                }
                this.expandedDrawX = f12;
                clearTexture();
                setInterpolatedTextSize(this.expandedFraction);
            }
            fCenterX2 = this.expandedBounds.centerX();
            fMeasureTextWidth /= 2.0f;
            f12 = fCenterX2 - fMeasureTextWidth;
            this.expandedDrawX = f12;
            clearTexture();
            setInterpolatedTextSize(this.expandedFraction);
        }
        fCenterX = this.collapsedBounds.centerX();
        f10 = this.collapsedTextWidth / 2.0f;
        f11 = fCenterX - f10;
        this.collapsedDrawX = f11;
        calculateUsingTextSize(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, z10);
        staticLayout = this.textLayout;
        if (staticLayout != null) {
            height = staticLayout.getHeight();
        } else {
            height = 0.0f;
        }
        staticLayout2 = this.textLayout;
        if (staticLayout2 != null) {
            charSequence = this.textToDraw;
            if (charSequence != null) {
                fMeasureTextWidth = measureTextWidth(this.textPaint, charSequence);
            }
        } else {
            charSequence = this.textToDraw;
            if (charSequence != null) {
                fMeasureTextWidth = measureTextWidth(this.textPaint, charSequence);
            }
        }
        staticLayout3 = this.textLayout;
        if (staticLayout3 != null) {
            lineCount = staticLayout3.getLineCount();
        } else {
            lineCount = 0;
        }
        this.expandedLineCount = lineCount;
        int absoluteGravity3 = Gravity.getAbsoluteGravity(this.expandedTextGravity, this.isRtl ? 1 : 0);
        i10 = absoluteGravity3 & 112;
        if (i10 != 48) {
            if (i10 != 80) {
                this.expandedDrawY = this.expandedBounds.centerY() - (height / 2.0f);
            } else {
                fDescent = this.textPaint.descent() + (this.expandedBounds.bottom - height);
            }
            i11 = absoluteGravity3 & 8388615;
            if (i11 != 1) {
                if (i11 != 5) {
                    f12 = this.expandedBounds.left;
                } else {
                    fCenterX2 = this.expandedBounds.right;
                }
                this.expandedDrawX = f12;
                clearTexture();
                setInterpolatedTextSize(this.expandedFraction);
            }
            fCenterX2 = this.expandedBounds.centerX();
            fMeasureTextWidth /= 2.0f;
            f12 = fCenterX2 - fMeasureTextWidth;
            this.expandedDrawX = f12;
            clearTexture();
            setInterpolatedTextSize(this.expandedFraction);
        }
        fDescent = this.expandedBounds.top;
        this.expandedDrawY = fDescent;
        i11 = absoluteGravity3 & 8388615;
        if (i11 != 1) {
            if (i11 != 5) {
                f12 = this.expandedBounds.left;
            } else {
                fCenterX2 = this.expandedBounds.right;
            }
            this.expandedDrawX = f12;
            clearTexture();
            setInterpolatedTextSize(this.expandedFraction);
        }
        fCenterX2 = this.expandedBounds.centerX();
        fMeasureTextWidth /= 2.0f;
        f12 = fCenterX2 - fMeasureTextWidth;
        this.expandedDrawX = f12;
        clearTexture();
        setInterpolatedTextSize(this.expandedFraction);
    }

    private void calculateCurrentOffsets() {
        calculateOffsets(this.expandedFraction);
    }

    private float calculateFadeModeTextAlpha(float f10) {
        float f11 = this.fadeModeThresholdFraction;
        return f10 <= f11 ? AnimationUtils.lerp(1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, this.fadeModeStartFraction, f11, f10) : AnimationUtils.lerp(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f, f11, 1.0f, f10);
    }

    private float calculateFadeModeThresholdFraction() {
        float f10 = this.fadeModeStartFraction;
        return e.a(1.0f, f10, 0.5f, f10);
    }

    private boolean calculateIsRtl(CharSequence charSequence) {
        boolean zIsDefaultIsRtl = isDefaultIsRtl();
        return this.isRtlTextDirectionHeuristicsEnabled ? isTextDirectionHeuristicsIsRtl(charSequence, zIsDefaultIsRtl) : zIsDefaultIsRtl;
    }

    private void calculateOffsets(float f10) {
        float f11;
        interpolateBounds(f10);
        if (!this.fadeModeEnabled) {
            this.currentDrawX = lerp(this.expandedDrawX, this.collapsedDrawX, f10, this.positionInterpolator);
            this.currentDrawY = lerp(this.expandedDrawY, this.collapsedDrawY, f10, this.positionInterpolator);
            setInterpolatedTextSize(f10);
            f11 = f10;
        } else if (f10 < this.fadeModeThresholdFraction) {
            this.currentDrawX = this.expandedDrawX;
            this.currentDrawY = this.expandedDrawY;
            setInterpolatedTextSize(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            f11 = 0.0f;
        } else {
            this.currentDrawX = this.collapsedDrawX;
            this.currentDrawY = this.collapsedDrawY - Math.max(0, this.currentOffsetY);
            setInterpolatedTextSize(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        setCollapsedTextBlend(1.0f - lerp(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f, 1.0f - f10, timeInterpolator));
        setExpandedTextBlend(lerp(1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f10, timeInterpolator));
        if (this.collapsedTextColor != this.expandedTextColor) {
            this.textPaint.setColor(blendARGB(getCurrentExpandedTextColor(), getCurrentCollapsedTextColor(), f11));
        } else {
            this.textPaint.setColor(getCurrentCollapsedTextColor());
        }
        float f12 = this.collapsedLetterSpacing;
        float f13 = this.expandedLetterSpacing;
        if (f12 != f13) {
            this.textPaint.setLetterSpacing(lerp(f13, f12, f10, timeInterpolator));
        } else {
            this.textPaint.setLetterSpacing(f12);
        }
        this.currentShadowRadius = lerp(this.expandedShadowRadius, this.collapsedShadowRadius, f10, null);
        this.currentShadowDx = lerp(this.expandedShadowDx, this.collapsedShadowDx, f10, null);
        this.currentShadowDy = lerp(this.expandedShadowDy, this.collapsedShadowDy, f10, null);
        int iBlendARGB = blendARGB(getCurrentColor(this.expandedShadowColor), getCurrentColor(this.collapsedShadowColor), f10);
        this.currentShadowColor = iBlendARGB;
        this.textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, iBlendARGB);
        if (this.fadeModeEnabled) {
            this.textPaint.setAlpha((int) (calculateFadeModeTextAlpha(f10) * this.textPaint.getAlpha()));
        }
        View view = this.view;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.d.k(view);
    }

    private void calculateUsingTextSize(float f10) {
        calculateUsingTextSize(f10, false);
    }

    private void calculateUsingTextSize(float f10, boolean z10) {
        boolean z11;
        float f11;
        float f12;
        boolean z12;
        if (this.text == null) {
            return;
        }
        float fWidth = this.collapsedBounds.width();
        float fWidth2 = this.expandedBounds.width();
        if (isClose(f10, 1.0f)) {
            f11 = this.collapsedTextSize;
            f12 = this.collapsedLetterSpacing;
            this.scale = 1.0f;
            Typeface typeface = this.currentTypeface;
            Typeface typeface2 = this.collapsedTypeface;
            if (typeface != typeface2) {
                this.currentTypeface = typeface2;
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            float f13 = this.expandedTextSize;
            float f14 = this.expandedLetterSpacing;
            Typeface typeface3 = this.currentTypeface;
            Typeface typeface4 = this.expandedTypeface;
            if (typeface3 != typeface4) {
                this.currentTypeface = typeface4;
                z11 = true;
            } else {
                z11 = false;
            }
            if (isClose(f10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) {
                this.scale = 1.0f;
            } else {
                this.scale = lerp(this.expandedTextSize, this.collapsedTextSize, f10, this.textSizeInterpolator) / this.expandedTextSize;
            }
            float f15 = this.collapsedTextSize / this.expandedTextSize;
            fWidth = (!z10 && fWidth2 * f15 > fWidth) ? Math.min(fWidth / f15, fWidth2) : fWidth2;
            f11 = f13;
            f12 = f14;
            z12 = z11;
        }
        if (fWidth > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            z12 = ((this.currentTextSize > f11 ? 1 : (this.currentTextSize == f11 ? 0 : -1)) != 0) || ((this.currentLetterSpacing > f12 ? 1 : (this.currentLetterSpacing == f12 ? 0 : -1)) != 0) || this.boundsChanged || z12;
            this.currentTextSize = f11;
            this.currentLetterSpacing = f12;
            this.boundsChanged = false;
        }
        if (this.textToDraw == null || z12) {
            this.textPaint.setTextSize(this.currentTextSize);
            this.textPaint.setTypeface(this.currentTypeface);
            this.textPaint.setLetterSpacing(this.currentLetterSpacing);
            this.textPaint.setLinearText(this.scale != 1.0f);
            this.isRtl = calculateIsRtl(this.text);
            StaticLayout staticLayoutCreateStaticLayout = createStaticLayout(shouldDrawMultiline() ? this.maxLines : 1, fWidth, this.isRtl);
            this.textLayout = staticLayoutCreateStaticLayout;
            this.textToDraw = staticLayoutCreateStaticLayout.getText();
        }
    }

    private void clearTexture() {
        Bitmap bitmap = this.expandedTitleTexture;
        if (bitmap != null) {
            bitmap.recycle();
            this.expandedTitleTexture = null;
        }
    }

    private StaticLayout createStaticLayout(int i10, float f10, boolean z10) {
        StaticLayout staticLayoutBuild;
        try {
            staticLayoutBuild = StaticLayoutBuilderCompat.obtain(this.text, this.textPaint, (int) f10).setEllipsize(TextUtils.TruncateAt.END).setIsRtl(z10).setAlignment(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : getMultilineTextLayoutAlignment()).setIncludePad(false).setMaxLines(i10).setLineSpacing(this.lineSpacingAdd, this.lineSpacingMultiplier).setHyphenationFrequency(this.hyphenationFrequency).build();
        } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e10) {
            Log.e(TAG, e10.getCause().getMessage(), e10);
            staticLayoutBuild = null;
        }
        Objects.requireNonNull(staticLayoutBuild);
        return staticLayoutBuild;
    }

    private void drawMultilineTransition(Canvas canvas, float f10, float f11) {
        int alpha = this.textPaint.getAlpha();
        canvas.translate(f10, f11);
        float f12 = alpha;
        this.textPaint.setAlpha((int) (this.expandedTextBlend * f12));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint = this.textPaint;
            textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint.getAlpha()));
        }
        this.textLayout.draw(canvas);
        this.textPaint.setAlpha((int) (this.collapsedTextBlend * f12));
        if (i10 >= 31) {
            TextPaint textPaint2 = this.textPaint;
            textPaint2.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint2.getAlpha()));
        }
        int lineBaseline = this.textLayout.getLineBaseline(0);
        CharSequence charSequence = this.textToDrawCollapsed;
        float f13 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f13, this.textPaint);
        if (i10 >= 31) {
            this.textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, this.currentShadowColor);
        }
        if (this.fadeModeEnabled) {
            return;
        }
        String strTrim = this.textToDrawCollapsed.toString().trim();
        if (strTrim.endsWith(ELLIPSIS_NORMAL)) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.textPaint.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.textLayout.getLineEnd(0), str.length()), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f13, (Paint) this.textPaint);
    }

    private void ensureExpandedTexture() {
        if (this.expandedTitleTexture != null || this.expandedBounds.isEmpty() || TextUtils.isEmpty(this.textToDraw)) {
            return;
        }
        calculateOffsets(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        int width = this.textLayout.getWidth();
        int height = this.textLayout.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.expandedTitleTexture = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.textLayout.draw(new Canvas(this.expandedTitleTexture));
        if (this.texturePaint == null) {
            this.texturePaint = new Paint(3);
        }
    }

    private float getCollapsedTextLeftBound(int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) - (this.collapsedTextWidth / 2.0f);
        }
        if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            return this.isRtl ? this.collapsedBounds.left : this.collapsedBounds.right - this.collapsedTextWidth;
        }
        return this.isRtl ? this.collapsedBounds.right - this.collapsedTextWidth : this.collapsedBounds.left;
    }

    private float getCollapsedTextRightBound(RectF rectF, int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (this.collapsedTextWidth / 2.0f) + (i10 / 2.0f);
        }
        if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            return this.isRtl ? rectF.left + this.collapsedTextWidth : this.collapsedBounds.right;
        }
        return this.isRtl ? this.collapsedBounds.right : rectF.left + this.collapsedTextWidth;
    }

    private int getCurrentColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.state;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int getCurrentExpandedTextColor() {
        return getCurrentColor(this.expandedTextColor);
    }

    private Layout.Alignment getMultilineTextLayoutAlignment() {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.expandedTextGravity, this.isRtl ? 1 : 0) & 7;
        if (absoluteGravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (absoluteGravity != 5) {
            return this.isRtl ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return this.isRtl ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
    }

    private void getTextPaintCollapsed(TextPaint textPaint) {
        textPaint.setTextSize(this.collapsedTextSize);
        textPaint.setTypeface(this.collapsedTypeface);
        textPaint.setLetterSpacing(this.collapsedLetterSpacing);
    }

    private void getTextPaintExpanded(TextPaint textPaint) {
        textPaint.setTextSize(this.expandedTextSize);
        textPaint.setTypeface(this.expandedTypeface);
        textPaint.setLetterSpacing(this.expandedLetterSpacing);
    }

    private void interpolateBounds(float f10) {
        if (this.fadeModeEnabled) {
            this.currentBounds.set(f10 < this.fadeModeThresholdFraction ? this.expandedBounds : this.collapsedBounds);
            return;
        }
        this.currentBounds.left = lerp(this.expandedBounds.left, this.collapsedBounds.left, f10, this.positionInterpolator);
        this.currentBounds.top = lerp(this.expandedDrawY, this.collapsedDrawY, f10, this.positionInterpolator);
        this.currentBounds.right = lerp(this.expandedBounds.right, this.collapsedBounds.right, f10, this.positionInterpolator);
        this.currentBounds.bottom = lerp(this.expandedBounds.bottom, this.collapsedBounds.bottom, f10, this.positionInterpolator);
    }

    private static boolean isClose(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean isDefaultIsRtl() {
        View view = this.view;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        return e0.e.d(view) == 1;
    }

    private boolean isTextDirectionHeuristicsIsRtl(CharSequence charSequence, boolean z10) {
        return ((f.c) (z10 ? f.f33602d : f.f33601c)).b(charSequence, 0, charSequence.length());
    }

    private static float lerp(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return AnimationUtils.lerp(f10, f11, f12);
    }

    private float measureTextWidth(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean rectEquals(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private void setCollapsedTextBlend(float f10) {
        this.collapsedTextBlend = f10;
        View view = this.view;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.d.k(view);
    }

    private boolean setCollapsedTypefaceInternal(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.collapsedTypefaceDefault == typeface) {
            return false;
        }
        this.collapsedTypefaceDefault = typeface;
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.view.getContext().getResources().getConfiguration(), typeface);
        this.collapsedTypefaceBold = typefaceMaybeCopyWithFontWeightAdjustment;
        if (typefaceMaybeCopyWithFontWeightAdjustment == null) {
            typefaceMaybeCopyWithFontWeightAdjustment = this.collapsedTypefaceDefault;
        }
        this.collapsedTypeface = typefaceMaybeCopyWithFontWeightAdjustment;
        return true;
    }

    private void setExpandedTextBlend(float f10) {
        this.expandedTextBlend = f10;
        View view = this.view;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.d.k(view);
    }

    private boolean setExpandedTypefaceInternal(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.expandedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.expandedTypefaceDefault == typeface) {
            return false;
        }
        this.expandedTypefaceDefault = typeface;
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.view.getContext().getResources().getConfiguration(), typeface);
        this.expandedTypefaceBold = typefaceMaybeCopyWithFontWeightAdjustment;
        if (typefaceMaybeCopyWithFontWeightAdjustment == null) {
            typefaceMaybeCopyWithFontWeightAdjustment = this.expandedTypefaceDefault;
        }
        this.expandedTypeface = typefaceMaybeCopyWithFontWeightAdjustment;
        return true;
    }

    private void setInterpolatedTextSize(float f10) {
        calculateUsingTextSize(f10);
        boolean z10 = USE_SCALING_TEXTURE && this.scale != 1.0f;
        this.useTexture = z10;
        if (z10) {
            ensureExpandedTexture();
        }
        View view = this.view;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.d.k(view);
    }

    private boolean shouldDrawMultiline() {
        return this.maxLines > 1 && (!this.isRtl || this.fadeModeEnabled) && !this.useTexture;
    }

    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        if (this.textToDraw == null || !this.drawTitle) {
            return;
        }
        this.textPaint.setTextSize(this.currentTextSize);
        float f10 = this.currentDrawX;
        float f11 = this.currentDrawY;
        boolean z10 = this.useTexture && this.expandedTitleTexture != null;
        float f12 = this.scale;
        if (f12 != 1.0f && !this.fadeModeEnabled) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (z10) {
            canvas.drawBitmap(this.expandedTitleTexture, f10, f11, this.texturePaint);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!shouldDrawMultiline() || (this.fadeModeEnabled && this.expandedFraction <= this.fadeModeThresholdFraction)) {
            canvas.translate(f10, f11);
            this.textLayout.draw(canvas);
        } else {
            drawMultilineTransition(canvas, this.currentDrawX - this.textLayout.getLineStart(0), f11);
        }
        canvas.restoreToCount(iSave);
    }

    public void getCollapsedTextActualBounds(RectF rectF, int i10, int i11) {
        this.isRtl = calculateIsRtl(this.text);
        rectF.left = getCollapsedTextLeftBound(i10, i11);
        rectF.top = this.collapsedBounds.top;
        rectF.right = getCollapsedTextRightBound(rectF, i10, i11);
        rectF.bottom = getCollapsedTextHeight() + this.collapsedBounds.top;
    }

    public ColorStateList getCollapsedTextColor() {
        return this.collapsedTextColor;
    }

    public int getCollapsedTextGravity() {
        return this.collapsedTextGravity;
    }

    public float getCollapsedTextHeight() {
        getTextPaintCollapsed(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public float getCollapsedTextSize() {
        return this.collapsedTextSize;
    }

    public Typeface getCollapsedTypeface() {
        Typeface typeface = this.collapsedTypeface;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getCurrentCollapsedTextColor() {
        return getCurrentColor(this.collapsedTextColor);
    }

    public int getExpandedLineCount() {
        return this.expandedLineCount;
    }

    public ColorStateList getExpandedTextColor() {
        return this.expandedTextColor;
    }

    public float getExpandedTextFullHeight() {
        getTextPaintExpanded(this.tmpPaint);
        return this.tmpPaint.descent() + (-this.tmpPaint.ascent());
    }

    public int getExpandedTextGravity() {
        return this.expandedTextGravity;
    }

    public float getExpandedTextHeight() {
        getTextPaintExpanded(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public float getExpandedTextSize() {
        return this.expandedTextSize;
    }

    public Typeface getExpandedTypeface() {
        Typeface typeface = this.expandedTypeface;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float getExpansionFraction() {
        return this.expandedFraction;
    }

    public float getFadeModeThresholdFraction() {
        return this.fadeModeThresholdFraction;
    }

    public int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.textLayout.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.textLayout.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.maxLines;
    }

    public TimeInterpolator getPositionInterpolator() {
        return this.positionInterpolator;
    }

    public CharSequence getText() {
        return this.text;
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.isRtlTextDirectionHeuristicsEnabled;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.collapsedTextColor;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.expandedTextColor) != null && colorStateList.isStateful());
    }

    public void maybeUpdateFontWeightAdjustment(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.collapsedTypefaceDefault;
            if (typeface != null) {
                this.collapsedTypefaceBold = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface);
            }
            Typeface typeface2 = this.expandedTypefaceDefault;
            if (typeface2 != null) {
                this.expandedTypefaceBold = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface2);
            }
            Typeface typeface3 = this.collapsedTypefaceBold;
            if (typeface3 == null) {
                typeface3 = this.collapsedTypefaceDefault;
            }
            this.collapsedTypeface = typeface3;
            Typeface typeface4 = this.expandedTypefaceBold;
            if (typeface4 == null) {
                typeface4 = this.expandedTypefaceDefault;
            }
            this.expandedTypeface = typeface4;
            recalculate(true);
        }
    }

    public void onBoundsChanged() {
        this.drawTitle = this.collapsedBounds.width() > 0 && this.collapsedBounds.height() > 0 && this.expandedBounds.width() > 0 && this.expandedBounds.height() > 0;
    }

    public void recalculate() {
        recalculate(false);
    }

    public void recalculate(boolean z10) {
        if ((this.view.getHeight() <= 0 || this.view.getWidth() <= 0) && !z10) {
            return;
        }
        calculateBaseOffsets(z10);
        calculateCurrentOffsets();
    }

    public void setCollapsedBounds(int i10, int i11, int i12, int i13) {
        if (rectEquals(this.collapsedBounds, i10, i11, i12, i13)) {
            return;
        }
        this.collapsedBounds.set(i10, i11, i12, i13);
        this.boundsChanged = true;
        onBoundsChanged();
    }

    public void setCollapsedBounds(Rect rect) {
        setCollapsedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setCollapsedTextAppearance(int i10) {
        TextAppearance textAppearance = new TextAppearance(this.view.getContext(), i10);
        if (textAppearance.getTextColor() != null) {
            this.collapsedTextColor = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            this.collapsedTextSize = textAppearance.getTextSize();
        }
        ColorStateList colorStateList = textAppearance.shadowColor;
        if (colorStateList != null) {
            this.collapsedShadowColor = colorStateList;
        }
        this.collapsedShadowDx = textAppearance.shadowDx;
        this.collapsedShadowDy = textAppearance.shadowDy;
        this.collapsedShadowRadius = textAppearance.shadowRadius;
        this.collapsedLetterSpacing = textAppearance.letterSpacing;
        CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.collapsedFontCallback = new CancelableFontCallback(new CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.1
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public void apply(Typeface typeface) {
                CollapsingTextHelper.this.setCollapsedTypeface(typeface);
            }
        }, textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.view.getContext(), this.collapsedFontCallback);
        recalculate();
    }

    public void setCollapsedTextColor(ColorStateList colorStateList) {
        if (this.collapsedTextColor != colorStateList) {
            this.collapsedTextColor = colorStateList;
            recalculate();
        }
    }

    public void setCollapsedTextGravity(int i10) {
        if (this.collapsedTextGravity != i10) {
            this.collapsedTextGravity = i10;
            recalculate();
        }
    }

    public void setCollapsedTextSize(float f10) {
        if (this.collapsedTextSize != f10) {
            this.collapsedTextSize = f10;
            recalculate();
        }
    }

    public void setCollapsedTypeface(Typeface typeface) {
        if (setCollapsedTypefaceInternal(typeface)) {
            recalculate();
        }
    }

    public void setCurrentOffsetY(int i10) {
        this.currentOffsetY = i10;
    }

    public void setExpandedBounds(int i10, int i11, int i12, int i13) {
        if (rectEquals(this.expandedBounds, i10, i11, i12, i13)) {
            return;
        }
        this.expandedBounds.set(i10, i11, i12, i13);
        this.boundsChanged = true;
        onBoundsChanged();
    }

    public void setExpandedBounds(Rect rect) {
        setExpandedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setExpandedLetterSpacing(float f10) {
        if (this.expandedLetterSpacing != f10) {
            this.expandedLetterSpacing = f10;
            recalculate();
        }
    }

    public void setExpandedTextAppearance(int i10) {
        TextAppearance textAppearance = new TextAppearance(this.view.getContext(), i10);
        if (textAppearance.getTextColor() != null) {
            this.expandedTextColor = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            this.expandedTextSize = textAppearance.getTextSize();
        }
        ColorStateList colorStateList = textAppearance.shadowColor;
        if (colorStateList != null) {
            this.expandedShadowColor = colorStateList;
        }
        this.expandedShadowDx = textAppearance.shadowDx;
        this.expandedShadowDy = textAppearance.shadowDy;
        this.expandedShadowRadius = textAppearance.shadowRadius;
        this.expandedLetterSpacing = textAppearance.letterSpacing;
        CancelableFontCallback cancelableFontCallback = this.expandedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.expandedFontCallback = new CancelableFontCallback(new CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.2
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public void apply(Typeface typeface) {
                CollapsingTextHelper.this.setExpandedTypeface(typeface);
            }
        }, textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.view.getContext(), this.expandedFontCallback);
        recalculate();
    }

    public void setExpandedTextColor(ColorStateList colorStateList) {
        if (this.expandedTextColor != colorStateList) {
            this.expandedTextColor = colorStateList;
            recalculate();
        }
    }

    public void setExpandedTextGravity(int i10) {
        if (this.expandedTextGravity != i10) {
            this.expandedTextGravity = i10;
            recalculate();
        }
    }

    public void setExpandedTextSize(float f10) {
        if (this.expandedTextSize != f10) {
            this.expandedTextSize = f10;
            recalculate();
        }
    }

    public void setExpandedTypeface(Typeface typeface) {
        if (setExpandedTypefaceInternal(typeface)) {
            recalculate();
        }
    }

    public void setExpansionFraction(float f10) {
        float fI = i.i(f10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f);
        if (fI != this.expandedFraction) {
            this.expandedFraction = fI;
            calculateCurrentOffsets();
        }
    }

    public void setFadeModeEnabled(boolean z10) {
        this.fadeModeEnabled = z10;
    }

    public void setFadeModeStartFraction(float f10) {
        this.fadeModeStartFraction = f10;
        this.fadeModeThresholdFraction = calculateFadeModeThresholdFraction();
    }

    public void setHyphenationFrequency(int i10) {
        this.hyphenationFrequency = i10;
    }

    public void setLineSpacingAdd(float f10) {
        this.lineSpacingAdd = f10;
    }

    public void setLineSpacingMultiplier(float f10) {
        this.lineSpacingMultiplier = f10;
    }

    public void setMaxLines(int i10) {
        if (i10 != this.maxLines) {
            this.maxLines = i10;
            clearTexture();
            recalculate();
        }
    }

    public void setPositionInterpolator(TimeInterpolator timeInterpolator) {
        this.positionInterpolator = timeInterpolator;
        recalculate();
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.isRtlTextDirectionHeuristicsEnabled = z10;
    }

    public final boolean setState(int[] iArr) {
        this.state = iArr;
        if (!isStateful()) {
            return false;
        }
        recalculate();
        return true;
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.text, charSequence)) {
            this.text = charSequence;
            this.textToDraw = null;
            clearTexture();
            recalculate();
        }
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
        this.textSizeInterpolator = timeInterpolator;
        recalculate();
    }

    public void setTypefaces(Typeface typeface) {
        boolean collapsedTypefaceInternal = setCollapsedTypefaceInternal(typeface);
        boolean expandedTypefaceInternal = setExpandedTypefaceInternal(typeface);
        if (collapsedTypefaceInternal || expandedTypefaceInternal) {
            recalculate();
        }
    }
}
