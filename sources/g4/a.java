package g4;

/* JADX INFO: loaded from: classes.dex */
public class a extends d4.a {
    public a(float f10) {
        super(f10);
    }

    @Override // d4.a
    public Float a(float f10, float f11, float f12, float f13) {
        float f14 = f10 / f13;
        return Float.valueOf(((((float) Math.sqrt(1.0f - (f14 * f14))) - 1.0f) * (-f12)) + f11);
    }
}
