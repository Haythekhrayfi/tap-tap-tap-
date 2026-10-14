package e4;

/* JADX INFO: loaded from: classes.dex */
public class a extends d4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f29024c;

    public a(float f10) {
        super(f10);
        this.f29024c = 1.70158f;
    }

    public a(float f10, float f11) {
        this(f10);
        this.f29024c = f11;
    }

    @Override // d4.a
    public Float a(float f10, float f11, float f12, float f13) {
        float f14 = f10 / f13;
        float f15 = this.f29024c;
        return Float.valueOf(((((1.0f + f15) * f14) - f15) * f12 * f14 * f14) + f11);
    }
}
