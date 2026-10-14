package e4;

/* JADX INFO: loaded from: classes.dex */
public class c extends d4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f29026c;

    public c(float f10) {
        super(f10);
        this.f29026c = 1.70158f;
    }

    public c(float f10, float f11) {
        this(f10);
        this.f29026c = f11;
    }

    @Override // d4.a
    public Float a(float f10, float f11, float f12, float f13) {
        float f14 = (f10 / f13) - 1.0f;
        float f15 = this.f29026c;
        return Float.valueOf(((((((f15 + 1.0f) * f14) + f15) * f14 * f14) + 1.0f) * f12) + f11);
    }
}
