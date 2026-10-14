package f4;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class b extends d4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f29229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f29230d;

    public b(float f10) {
        super(f10);
        this.f29230d = new a(f10);
        this.f29229c = new c(f10);
    }

    @Override // d4.a
    public Float a(float f10, float f11, float f12, float f13) {
        if (f10 < f13 / 2.0f) {
            return Float.valueOf((this.f29230d.a(f10 * 2.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f12, f13).floatValue() * 0.5f) + f11);
        }
        return Float.valueOf((f12 * 0.5f) + (this.f29229c.a((f10 * 2.0f) - f13, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f12, f13).floatValue() * 0.5f) + f11);
    }
}
