package f4;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class a extends d4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f29228c;

    public a(float f10) {
        super(f10);
        this.f29228c = new c(f10);
    }

    @Override // d4.a
    public Float a(float f10, float f11, float f12, float f13) {
        return Float.valueOf((f12 - this.f29228c.a(f13 - f10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f12, f13).floatValue()) + f11);
    }
}
