package n4;

/* JADX INFO: loaded from: classes.dex */
public class b extends d4.a {
    public b(float f10) {
        super(f10);
    }

    @Override // d4.a
    public Float a(float f10, float f11, float f12, float f13) {
        return Float.valueOf(((((float) Math.cos((((double) f10) * 3.141592653589793d) / ((double) f13))) - 1.0f) * ((-f12) / 2.0f)) + f11);
    }
}
