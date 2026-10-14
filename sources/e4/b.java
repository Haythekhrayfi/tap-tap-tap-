package e4;

/* JADX INFO: loaded from: classes.dex */
public class b extends d4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f29025c;

    public b(float f10) {
        super(f10);
        this.f29025c = 1.70158f;
    }

    public b(float f10, float f11) {
        this(f10);
        this.f29025c = f11;
    }

    @Override // d4.a
    public Float a(float f10, float f11, float f12, float f13) {
        float f14;
        float f15 = f10 / (f13 / 2.0f);
        float f16 = f12 / 2.0f;
        if (f15 < 1.0f) {
            float f17 = (float) (((double) this.f29025c) * 1.525d);
            this.f29025c = f17;
            f14 = (((1.0f + f17) * f15) - f17) * f15 * f15;
        } else {
            float f18 = f15 - 2.0f;
            float f19 = (float) (((double) this.f29025c) * 1.525d);
            this.f29025c = f19;
            f14 = ((((1.0f + f19) * f18) + f19) * f18 * f18) + 2.0f;
        }
        return Float.valueOf((f14 * f16) + f11);
    }
}
