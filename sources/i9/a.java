package i9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.style.ReplacementSpan;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends ReplacementSpan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f31505e;

    public a(int i10, int i11, float f10) {
        this.f31503c = i10;
        this.f31504d = i11;
        this.f31505e = f10;
    }

    public /* synthetic */ a(int i10, int i11, float f10, int i12, g gVar) {
        this(i10, i11, (i12 & 4) != 0 ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : f10);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        j0.i(canvas, "canvas");
        j0.i(charSequence, "text");
        j0.i(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
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
            int i12 = -((int) Math.ceil(this.f31504d - this.f31505e));
            fontMetricsInt.ascent = Math.min(i12, fontMetricsInt.ascent);
            fontMetricsInt.top = Math.min(i12, fontMetricsInt.top);
            int iCeil = (int) Math.ceil(this.f31505e);
            fontMetricsInt.descent = Math.max(iCeil, fontMetricsInt.descent);
            fontMetricsInt.bottom = Math.max(iCeil, fontMetricsInt.bottom);
            fontMetricsInt.leading = fontMetricsInt.descent - fontMetricsInt.ascent;
        }
        return this.f31503c;
    }
}
