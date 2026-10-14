package d4;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static ValueAnimator a(c cVar, float f10, ValueAnimator valueAnimator) {
        valueAnimator.setEvaluator(cVar.getMethod(f10));
        return valueAnimator;
    }
}
