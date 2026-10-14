package com.yandex.div.internal.spannable;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.style.ReplacementSpan;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends ReplacementSpan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC0169a f13433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Drawable f13434e;

    /* JADX INFO: renamed from: com.yandex.div.internal.spannable.a$a, reason: collision with other inner class name */
    public enum EnumC0169a {
        BASELINE,
        LINE_BOTTOM
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13435a;

        static {
            int[] iArr = new int[EnumC0169a.values().length];
            iArr[EnumC0169a.LINE_BOTTOM.ordinal()] = 1;
            iArr[EnumC0169a.BASELINE.ordinal()] = 2;
            f13435a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, Bitmap bitmap, float f10, int i10, int i11) {
        this(context, bitmap, f10, i10, i11, null, null, false, null, 480, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(bitmap, "bitmap");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, Bitmap bitmap, float f10, int i10, int i11, Integer num) {
        this(context, bitmap, f10, i10, i11, num, null, false, null, 448, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(bitmap, "bitmap");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, Bitmap bitmap, float f10, int i10, int i11, Integer num, PorterDuff.Mode mode) {
        this(context, bitmap, f10, i10, i11, num, mode, false, null, 384, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(bitmap, "bitmap");
        j0.i(mode, "tintMode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, Bitmap bitmap, float f10, int i10, int i11, Integer num, PorterDuff.Mode mode, boolean z10) {
        this(context, bitmap, f10, i10, i11, num, mode, z10, null, 256, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(bitmap, "bitmap");
        j0.i(mode, "tintMode");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    public a(Context context, Bitmap bitmap, float f10, int i10, int i11, Integer num, PorterDuff.Mode mode, boolean z10, EnumC0169a enumC0169a) {
        int i12;
        int i13;
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(bitmap, "bitmap");
        j0.i(mode, "tintMode");
        j0.i(enumC0169a, "anchorPoint");
        this.f13432c = f10;
        this.f13433d = enumC0169a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
        this.f13434e = bitmapDrawable;
        if (z10) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float fMax = Math.max(i10 > 0 ? width / i10 : 1.0f, i11 > 0 ? height / i11 : 1.0f);
            if (width <= 0) {
                i12 = 0;
            } else {
                if (fMax == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    i12 = 0;
                } else {
                    i12 = (int) (width / fMax);
                }
            }
            if (height <= 0) {
                i13 = 0;
            } else {
                if (fMax == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    i13 = 0;
                } else {
                    i13 = (int) (height / fMax);
                }
            }
            bitmapDrawable.setBounds(0, 0, i12, i13);
        } else {
            bitmapDrawable.setBounds(0, 0, i10, i11);
        }
        if (num != null) {
            bitmapDrawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), mode));
        }
    }

    public /* synthetic */ a(Context context, Bitmap bitmap, float f10, int i10, int i11, Integer num, PorterDuff.Mode mode, boolean z10, EnumC0169a enumC0169a, int i12, g gVar) {
        this(context, bitmap, (i12 & 4) != 0 ? 0.0f : f10, i10, i11, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? PorterDuff.Mode.SRC_IN : mode, (i12 & 128) != 0 ? true : z10, (i12 & 256) != 0 ? EnumC0169a.LINE_BOTTOM : enumC0169a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, Bitmap bitmap, int i10, int i11) {
        this(context, bitmap, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, i10, i11, null, null, false, null, 484, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(bitmap, "bitmap");
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        j0.i(canvas, "canvas");
        j0.i(charSequence, "text");
        j0.i(paint, "paint");
        canvas.save();
        int i15 = b.f13435a[this.f13433d.ordinal()];
        if (i15 == 1) {
            i13 = i14;
        } else if (i15 != 2) {
            throw new jc.g();
        }
        canvas.translate(f10, (i13 - this.f13434e.getBounds().bottom) + this.f13432c);
        this.f13434e.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float f10;
        float f11;
        int iCeil;
        j0.i(paint, "paint");
        j0.i(charSequence, "text");
        if (fontMetricsInt != null) {
            if (i10 == 0 && Build.VERSION.SDK_INT < 28) {
                fontMetricsInt.top = 0;
                fontMetricsInt.ascent = 0;
                fontMetricsInt.bottom = 0;
                fontMetricsInt.descent = 0;
                fontMetricsInt.leading = 0;
            }
            e9.a.a(null, Long.valueOf(this.f13434e.getBounds().top), Long.valueOf(0));
            int i12 = this.f13434e.getBounds().bottom;
            EnumC0169a enumC0169a = this.f13433d;
            int[] iArr = b.f13435a;
            int i13 = iArr[enumC0169a.ordinal()];
            if (i13 == 1) {
                f10 = i12 - this.f13432c;
                f11 = fontMetricsInt.bottom;
            } else {
                if (i13 != 2) {
                    throw new jc.g();
                }
                f10 = i12;
                f11 = this.f13432c;
            }
            int i14 = -((int) Math.ceil(f10 - f11));
            fontMetricsInt.ascent = Math.min(i14, fontMetricsInt.ascent);
            fontMetricsInt.top = Math.min(i14, fontMetricsInt.top);
            int i15 = iArr[this.f13433d.ordinal()];
            if (i15 == 1) {
                iCeil = fontMetricsInt.bottom;
            } else {
                if (i15 != 2) {
                    throw new jc.g();
                }
                iCeil = (int) Math.ceil(this.f13432c);
            }
            fontMetricsInt.descent = Math.max(iCeil, fontMetricsInt.descent);
            fontMetricsInt.bottom = Math.max(iCeil, fontMetricsInt.bottom);
            fontMetricsInt.leading = fontMetricsInt.descent - fontMetricsInt.ascent;
        }
        return this.f13434e.getBounds().right;
    }
}
