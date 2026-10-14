package i9;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends MetricAffectingSpan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Typeface f31507c;

    public c(Typeface typeface) {
        j0.i(typeface, "typeface");
        this.f31507c = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        j0.i(textPaint, "ds");
        textPaint.setTypeface(this.f31507c);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        j0.i(textPaint, "paint");
        textPaint.setTypeface(this.f31507c);
    }
}
