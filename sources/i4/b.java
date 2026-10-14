package i4;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class b extends d4.a {
    public b(float f10) {
        super(f10);
    }

    @Override // d4.a
    public Float a(float f10, float f11, float f12, float f13) {
        if (f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return Float.valueOf(f11);
        }
        float f14 = f10 / f13;
        if (f14 == 1.0f) {
            return Float.valueOf(f11 + f12);
        }
        float f15 = 0.3f * f13;
        return Float.valueOf((((float) Math.pow(2.0d, (-10.0f) * f14)) * f12 * ((float) Math.sin((((f14 * f13) - (f15 / 4.0f)) * 6.2831855f) / f15))) + f12 + f11);
    }
}
