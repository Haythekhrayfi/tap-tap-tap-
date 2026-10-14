package t;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class k implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f35614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f35615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f35616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f35617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f35618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f35619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f35620h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f35613a = 0.5d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35621i = 0;

    @Override // t.m
    public boolean a() {
        double d10 = ((double) this.f35617e) - this.f35615c;
        double d11 = this.f35614b;
        double d12 = this.f35618f;
        return Math.sqrt((((d11 * d10) * d10) + ((d12 * d12) * ((double) this.f35619g))) / d11) <= ((double) this.f35620h);
    }

    @Override // t.m
    public float b() {
        return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    @Override // t.m
    public float getInterpolation(float f10) {
        k kVar = this;
        double d10 = f10 - kVar.f35616d;
        double d11 = kVar.f35614b;
        double d12 = kVar.f35613a;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d11 / ((double) kVar.f35619g)) * d10) * 4.0d)) + 1.0d);
        double d13 = d10 / ((double) iSqrt);
        int i10 = 0;
        while (i10 < iSqrt) {
            double d14 = kVar.f35617e;
            double d15 = kVar.f35615c;
            int i11 = iSqrt;
            int i12 = i10;
            double d16 = kVar.f35618f;
            double d17 = kVar.f35619g;
            double d18 = ((((((-d11) * (d14 - d15)) - (d16 * d12)) / d17) * d13) / 2.0d) + d16;
            double d19 = ((((-((((d13 * d18) / 2.0d) + d14) - d15)) * d11) - (d18 * d12)) / d17) * d13;
            float f11 = (float) (d16 + d19);
            this.f35618f = f11;
            float f12 = (float) ((((d19 / 2.0d) + d16) * d13) + d14);
            this.f35617e = f12;
            int i13 = this.f35621i;
            if (i13 > 0) {
                if (f12 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && (i13 & 1) == 1) {
                    this.f35617e = -f12;
                    this.f35618f = -f11;
                }
                float f13 = this.f35617e;
                if (f13 > 1.0f && (i13 & 2) == 2) {
                    this.f35617e = 2.0f - f13;
                    this.f35618f = -this.f35618f;
                }
            }
            iSqrt = i11;
            i10 = i12 + 1;
            kVar = this;
        }
        k kVar2 = kVar;
        kVar2.f35616d = f10;
        return kVar2.f35617e;
    }
}
