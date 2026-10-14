package g4;

/* JADX INFO: loaded from: classes.dex */
public class b extends d4.a {
    public b(float f10) {
        super(f10);
    }

    @Override // d4.a
    public Float a(float f10, float f11, float f12, float f13) {
        float f14;
        float fSqrt;
        float f15 = f10 / (f13 / 2.0f);
        if (f15 < 1.0f) {
            f14 = (-f12) / 2.0f;
            fSqrt = ((float) Math.sqrt(1.0f - (f15 * f15))) - 1.0f;
        } else {
            f14 = f12 / 2.0f;
            float f16 = f15 - 2.0f;
            fSqrt = ((float) Math.sqrt(1.0f - (f16 * f16))) + 1.0f;
        }
        return Float.valueOf((fSqrt * f14) + f11);
    }
}
