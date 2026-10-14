package i9;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f31506c;

    public b(float f10) {
        this.f31506c = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        j0.i(textPaint, "paint");
        textPaint.setLetterSpacing(this.f31506c);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        j0.i(textPaint, "paint");
        textPaint.setLetterSpacing(this.f31506c);
    }
}
