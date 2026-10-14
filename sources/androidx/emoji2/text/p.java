package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class p extends j {
    public p(h hVar) {
        super(hVar);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Objects.requireNonNull(e.a());
        h hVar = this.f1815d;
        Typeface typeface = hVar.f1803b.f1834d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(hVar.f1803b.f1832b, hVar.f1802a * 2, 2, f10, i13, paint);
        paint.setTypeface(typeface2);
    }
}
