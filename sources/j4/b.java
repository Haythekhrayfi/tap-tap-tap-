package j4;

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
        if (f10 == f13) {
            return Float.valueOf(f11 + f12);
        }
        float f14 = f10 / (f13 / 2.0f);
        float f15 = f12 / 2.0f;
        return f14 < 1.0f ? Float.valueOf((f15 * ((float) Math.pow(2.0d, (f14 - 1.0f) * 10.0f))) + f11) : Float.valueOf((((-((float) Math.pow(2.0d, (f14 - 1.0f) * (-10.0f)))) + 2.0f) * f15) + f11);
    }
}
