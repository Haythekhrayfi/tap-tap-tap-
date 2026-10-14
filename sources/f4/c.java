package f4;

/* JADX INFO: loaded from: classes.dex */
public class c extends d4.a {
    public c(float f10) {
        super(f10);
    }

    @Override // d4.a
    public Float a(float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        float f16;
        float f17 = f10 / f13;
        if (f17 < 0.36363637f) {
            f16 = 7.5625f * f17 * f17;
        } else {
            if (f17 < 0.72727275f) {
                float f18 = f17 - 0.54545456f;
                f14 = 7.5625f * f18 * f18;
                f15 = 0.75f;
            } else if (f17 < 0.9090909090909091d) {
                float f19 = f17 - 0.8181818f;
                f14 = 7.5625f * f19 * f19;
                f15 = 0.9375f;
            } else {
                float f20 = f17 - 0.95454544f;
                f14 = 7.5625f * f20 * f20;
                f15 = 0.984375f;
            }
            f16 = f14 + f15;
        }
        return Float.valueOf((f16 * f12) + f11);
    }
}
