package s8;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import ed.u;
import fd.j0;
import xc.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35487d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35488e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35489f = -1;

    public a(int i10, int i11) {
        this.f35484a = i10;
        this.f35485b = i11;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14;
        int i15;
        int i16;
        int i17;
        j0.i(fontMetricsInt, "fm");
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        int spanEnd = spanned.getSpanEnd(this);
        if (this.f35486c) {
            fontMetricsInt.ascent = this.f35487d;
            fontMetricsInt.descent = this.f35488e;
            fontMetricsInt.top = this.f35489f;
        } else if (i10 >= spanStart) {
            this.f35486c = true;
            this.f35487d = fontMetricsInt.ascent;
            this.f35488e = fontMetricsInt.descent;
            this.f35489f = fontMetricsInt.top;
        }
        if (i10 >= spanStart && i11 <= spanEnd && (i15 = this.f35485b) > 0 && (i17 = (i16 = fontMetricsInt.descent) - fontMetricsInt.ascent) >= 0) {
            int iC = b.c(i16 * ((i15 * 1.0f) / i17));
            fontMetricsInt.descent = iC;
            fontMetricsInt.ascent = iC - this.f35485b;
        }
        if ((i10 <= spanStart && spanStart <= i11) && (i14 = this.f35484a) > 0) {
            fontMetricsInt.ascent -= i14;
            fontMetricsInt.top -= i14;
        }
        if (u.x(charSequence.subSequence(i10, i11).toString(), "\n", false, 2)) {
            this.f35486c = false;
        }
    }
}
