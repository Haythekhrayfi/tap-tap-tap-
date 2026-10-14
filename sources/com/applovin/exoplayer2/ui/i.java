package com.applovin.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import com.applovin.exoplayer2.l.ai;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
final class i {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f8145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f8146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f8147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f8148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextPaint f8149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f8150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f8151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f8152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Layout.Alignment f8153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Bitmap f8154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f8155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f8157n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f8158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f8159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f8160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f8161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f8162s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f8163t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f8164u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f8165v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f8166w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f8167x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f8168y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f8169z;

    public i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f8148e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f8147d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f8144a = fRound;
        this.f8145b = fRound;
        this.f8146c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f8149f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f8150g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f8151h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private void a() {
        int i10;
        int i11;
        int iMax;
        int iMin;
        int iRound;
        int i12;
        CharSequence charSequence = this.f8152i;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.f8152i);
        int i13 = this.C - this.A;
        int i14 = this.D - this.B;
        this.f8149f.setTextSize(this.f8167x);
        int i15 = (int) ((this.f8167x * 0.125f) + 0.5f);
        int i16 = i15 * 2;
        int i17 = i13 - i16;
        float f10 = this.f8160q;
        if (f10 != -3.4028235E38f) {
            i17 = (int) (i17 * f10);
        }
        int i18 = i17;
        if (i18 <= 0) {
            com.applovin.exoplayer2.l.q.c("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.f8168y > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f8168y), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.f8166w == 1) {
            for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class)) {
                spannableStringBuilder2.removeSpan(foregroundColorSpan);
            }
        }
        if (Color.alpha(this.f8163t) > 0) {
            int i19 = this.f8166w;
            if (i19 == 0 || i19 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f8163t), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f8163t), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.f8153j;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.f8149f, i18, alignment2, this.f8147d, this.f8148e, true);
        this.E = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.E.getLineCount();
        int iMax2 = 0;
        for (int i20 = 0; i20 < lineCount; i20++) {
            iMax2 = Math.max((int) Math.ceil(this.E.getLineWidth(i20)), iMax2);
        }
        if (this.f8160q == -3.4028235E38f || iMax2 >= i18) {
            i18 = iMax2;
        }
        int i21 = i18 + i16;
        float f11 = this.f8158o;
        if (f11 != -3.4028235E38f) {
            int iRound2 = Math.round(i13 * f11);
            int i22 = this.A;
            int i23 = iRound2 + i22;
            int i24 = this.f8159p;
            i10 = 1;
            i11 = 2;
            if (i24 == 1) {
                i23 = ((i23 * 2) - i21) / 2;
            } else if (i24 == 2) {
                i23 -= i21;
            }
            iMax = Math.max(i23, i22);
            iMin = Math.min(i21 + iMax, this.C);
        } else {
            i10 = 1;
            i11 = 2;
            iMax = ((i13 - i21) / 2) + this.A;
            iMin = iMax + i21;
        }
        int i25 = iMin - iMax;
        if (i25 <= 0) {
            com.applovin.exoplayer2.l.q.c("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f12 = this.f8155l;
        if (f12 != -3.4028235E38f) {
            if (this.f8156m == 0) {
                iRound = Math.round(i14 * f12) + this.B;
                int i26 = this.f8157n;
                if (i26 == i11) {
                    iRound -= height;
                } else if (i26 == i10) {
                    iRound = ((iRound * 2) - height) / i11;
                }
            } else {
                int lineBottom = this.E.getLineBottom(0) - this.E.getLineTop(0);
                float f13 = this.f8155l;
                if (f13 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    iRound = Math.round(f13 * lineBottom) + this.B;
                } else {
                    iRound = Math.round((f13 + 1.0f) * lineBottom) + this.D;
                    iRound -= height;
                }
            }
            int i27 = iRound + height;
            int i28 = this.D;
            if (i27 <= i28) {
                int i29 = this.B;
                if (iRound < i29) {
                    i12 = i29;
                }
                this.E = new StaticLayout(spannableStringBuilder, this.f8149f, i25, alignment2, this.f8147d, this.f8148e, true);
                this.F = new StaticLayout(spannableStringBuilder2, this.f8149f, i25, alignment2, this.f8147d, this.f8148e, true);
                this.G = iMax;
                this.H = i12;
                this.I = i15;
            }
            iRound = i28 - height;
        } else {
            iRound = (this.D - height) - ((int) (i14 * this.f8169z));
        }
        i12 = iRound;
        this.E = new StaticLayout(spannableStringBuilder, this.f8149f, i25, alignment2, this.f8147d, this.f8148e, true);
        this.F = new StaticLayout(spannableStringBuilder2, this.f8149f, i25, alignment2, this.f8147d, this.f8148e, true);
        this.G = iMax;
        this.H = i12;
        this.I = i15;
    }

    private void a(Canvas canvas) {
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f8164u) > 0) {
            this.f8150g.setColor(this.f8164u);
            canvas.drawRect(-this.I, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f8150g);
        }
        int i10 = this.f8166w;
        if (i10 == 1) {
            this.f8149f.setStrokeJoin(Paint.Join.ROUND);
            this.f8149f.setStrokeWidth(this.f8144a);
            this.f8149f.setColor(this.f8165v);
            this.f8149f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f8149f;
            float f10 = this.f8145b;
            float f11 = this.f8146c;
            textPaint.setShadowLayer(f10, f11, f11, this.f8165v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f8165v;
            int i12 = z10 ? this.f8165v : -1;
            float f12 = this.f8145b / 2.0f;
            this.f8149f.setColor(this.f8162s);
            this.f8149f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f8149f.setShadowLayer(this.f8145b, f13, f13, i11);
            staticLayout2.draw(canvas);
            this.f8149f.setShadowLayer(this.f8145b, f12, f12, i12);
        }
        this.f8149f.setColor(this.f8162s);
        this.f8149f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f8149f.setShadowLayer(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0);
        canvas.restoreToCount(iSave);
    }

    private void a(Canvas canvas, boolean z10) {
        if (z10) {
            a(canvas);
            return;
        }
        com.applovin.exoplayer2.l.a.b(this.J);
        com.applovin.exoplayer2.l.a.b(this.f8154k);
        b(canvas);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051  */
    /* JADX WARN: Code duplicated, block: B:16:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    private void b() {
        float f10;
        int i10;
        float f11;
        Bitmap bitmap = this.f8154k;
        int i11 = this.C;
        int i12 = this.A;
        int i13 = this.D;
        int i14 = this.B;
        float f12 = i11 - i12;
        float f13 = (this.f8158o * f12) + i12;
        float height = i13 - i14;
        float f14 = (this.f8155l * height) + i14;
        int iRound = Math.round(f12 * this.f8160q);
        float f15 = this.f8161r;
        if (f15 == -3.4028235E38f) {
            f15 = iRound;
            height = bitmap.getHeight() / bitmap.getWidth();
        }
        int iRound2 = Math.round(height * f15);
        int i15 = this.f8159p;
        if (i15 != 2) {
            if (i15 == 1) {
                f10 = iRound / 2;
            }
            int iRound3 = Math.round(f13);
            i10 = this.f8157n;
            if (i10 == 2) {
                if (i10 == 1) {
                    f11 = iRound2 / 2;
                }
                int iRound4 = Math.round(f14);
                this.J = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f11 = iRound2;
            f14 -= f11;
            int iRound5 = Math.round(f14);
            this.J = new Rect(iRound3, iRound5, iRound + iRound3, iRound2 + iRound5);
        }
        f10 = iRound;
        f13 -= f10;
        int iRound6 = Math.round(f13);
        i10 = this.f8157n;
        if (i10 == 2) {
            if (i10 == 1) {
                f11 = iRound2 / 2;
            }
            int iRound7 = Math.round(f14);
            this.J = new Rect(iRound6, iRound7, iRound + iRound6, iRound2 + iRound7);
        }
        f11 = iRound2;
        f14 -= f11;
        int iRound8 = Math.round(f14);
        this.J = new Rect(iRound6, iRound8, iRound + iRound6, iRound2 + iRound8);
    }

    private void b(Canvas canvas) {
        canvas.drawBitmap(this.f8154k, (Rect) null, this.J, this.f8151h);
    }

    public void a(com.applovin.exoplayer2.i.a aVar, c cVar, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        boolean z10 = aVar.f6741e == null;
        int i14 = -16777216;
        if (z10) {
            if (TextUtils.isEmpty(aVar.f6738b)) {
                return;
            } else {
                i14 = aVar.f6749m ? aVar.f6750n : cVar.f8042d;
            }
        }
        if (a(this.f8152i, aVar.f6738b) && ai.a(this.f8153j, aVar.f6739c) && this.f8154k == aVar.f6741e && this.f8155l == aVar.f6742f && this.f8156m == aVar.f6743g && ai.a(Integer.valueOf(this.f8157n), Integer.valueOf(aVar.f6744h)) && this.f8158o == aVar.f6745i && ai.a(Integer.valueOf(this.f8159p), Integer.valueOf(aVar.f6746j)) && this.f8160q == aVar.f6747k && this.f8161r == aVar.f6748l && this.f8162s == cVar.f8040b && this.f8163t == cVar.f8041c && this.f8164u == i14 && this.f8166w == cVar.f8043e && this.f8165v == cVar.f8044f && ai.a(this.f8149f.getTypeface(), cVar.f8045g) && this.f8167x == f10 && this.f8168y == f11 && this.f8169z == f12 && this.A == i10 && this.B == i11 && this.C == i12 && this.D == i13) {
            a(canvas, z10);
            return;
        }
        this.f8152i = aVar.f6738b;
        this.f8153j = aVar.f6739c;
        this.f8154k = aVar.f6741e;
        this.f8155l = aVar.f6742f;
        this.f8156m = aVar.f6743g;
        this.f8157n = aVar.f6744h;
        this.f8158o = aVar.f6745i;
        this.f8159p = aVar.f6746j;
        this.f8160q = aVar.f6747k;
        this.f8161r = aVar.f6748l;
        this.f8162s = cVar.f8040b;
        this.f8163t = cVar.f8041c;
        this.f8164u = i14;
        this.f8166w = cVar.f8043e;
        this.f8165v = cVar.f8044f;
        this.f8149f.setTypeface(cVar.f8045g);
        this.f8167x = f10;
        this.f8168y = f11;
        this.f8169z = f12;
        this.A = i10;
        this.B = i11;
        this.C = i12;
        this.D = i13;
        if (z10) {
            com.applovin.exoplayer2.l.a.b(this.f8152i);
            a();
        } else {
            com.applovin.exoplayer2.l.a.b(this.f8154k);
            b();
        }
        a(canvas, z10);
    }
}
