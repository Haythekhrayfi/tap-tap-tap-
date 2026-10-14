package l4;

/* JADX INFO: loaded from: classes.dex */
public class b extends d4.a {
    public b(float f10) {
        super(f10);
    }

    @Override // d4.a
    public Float a(float f10, float f11, float f12, float f13) {
        float f14 = f10 / (f13 / 2.0f);
        if (f14 < 1.0f) {
            return Float.valueOf(((f12 / 2.0f) * f14 * f14) + f11);
        }
        float f15 = f14 - 1.0f;
        return Float.valueOf(((((f15 - 2.0f) * f15) - 1.0f) * ((-f12) / 2.0f)) + f11);
    }
}
