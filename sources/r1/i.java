package r1;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public class i implements TypeEvaluator<Rect> {
    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f10, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i10 = rect3.left;
        int i11 = i10 + ((int) ((rect4.left - i10) * f10));
        int i12 = rect3.top;
        int i13 = i12 + ((int) ((rect4.top - i12) * f10));
        int i14 = rect3.right;
        int i15 = i14 + ((int) ((rect4.right - i14) * f10));
        int i16 = rect3.bottom;
        return new Rect(i11, i13, i15, i16 + ((int) ((rect4.bottom - i16) * f10)));
    }
}
