package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends ReplacementSpan {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f1815d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint.FontMetricsInt f1814c = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public short f1816e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1817f = 1.0f;

    public j(h hVar) {
        androidx.activity.i.f(hVar, "metadata cannot be null");
        this.f1815d = hVar;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f1814c);
        Paint.FontMetricsInt fontMetricsInt2 = this.f1814c;
        this.f1817f = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f1815d.c();
        this.f1815d.c();
        y0.a aVarE = this.f1815d.e();
        int iA = aVarE.a(12);
        short s10 = (short) ((iA != 0 ? aVarE.f37969b.getShort(iA + aVarE.f37968a) : (short) 0) * this.f1817f);
        this.f1816e = s10;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f1814c;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s10;
    }
}
