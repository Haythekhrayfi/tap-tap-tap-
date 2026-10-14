package j4;

/* JADX INFO: loaded from: classes.dex */
public class c extends d4.a {
    public c(float f10) {
        super(f10);
    }

    @Override // d4.a
    public Float a(float f10, float f11, float f12, float f13) {
        return Float.valueOf(f10 == f13 ? f11 + f12 : f11 + (((-((float) Math.pow(2.0d, (f10 * (-10.0f)) / f13))) + 1.0f) * f12));
    }
}
