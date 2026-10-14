package j4;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class a extends d4.a {
    public a(float f10) {
        super(f10);
    }

    @Override // d4.a
    public Float a(float f10, float f11, float f12, float f13) {
        if (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            f11 += f12 * ((float) Math.pow(2.0d, ((f10 / f13) - 1.0f) * 10.0f));
        }
        return Float.valueOf(f11);
    }
}
