package t;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f35623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f35624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f35625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f35626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f35627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f35628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f35629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f35630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f35631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f35633k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f35634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f35635m;

    @Override // t.m
    public boolean a() {
        return b() < 1.0E-5f && Math.abs(this.f35631i - this.f35635m) < 1.0E-5f;
    }

    @Override // t.m
    public float b() {
        return this.f35633k ? -c(this.f35635m) : c(this.f35635m);
    }

    public float c(float f10) {
        float f11;
        float f12;
        float f13 = this.f35626d;
        if (f10 <= f13) {
            f11 = this.f35623a;
            f12 = this.f35624b;
        } else {
            int i10 = this.f35632j;
            if (i10 == 1) {
                return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            }
            f10 -= f13;
            f13 = this.f35627e;
            if (f10 >= f13) {
                if (i10 == 2) {
                    return this.f35630h;
                }
                float f14 = f10 - f13;
                float f15 = this.f35628f;
                if (f14 >= f15) {
                    return this.f35631i;
                }
                float f16 = this.f35625c;
                return f16 - ((f14 * f16) / f15);
            }
            f11 = this.f35624b;
            f12 = this.f35625c;
        }
        return (((f12 - f11) * f10) / f13) + f11;
    }

    public final void d(float f10, float f11, float f12, float f13, float f14) {
        if (f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            f10 = 1.0E-4f;
        }
        this.f35623a = f10;
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            float fSqrt = (float) Math.sqrt((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12);
            if (fSqrt < f13) {
                this.f35632j = 2;
                this.f35623a = f10;
                this.f35624b = fSqrt;
                this.f35625c = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                float f17 = (fSqrt - f10) / f12;
                this.f35626d = f17;
                this.f35627e = fSqrt / f12;
                this.f35629g = ((f10 + fSqrt) * f17) / 2.0f;
                this.f35630h = f11;
                this.f35631i = f11;
                return;
            }
            this.f35632j = 3;
            this.f35623a = f10;
            this.f35624b = f13;
            this.f35625c = f13;
            float f18 = (f13 - f10) / f12;
            this.f35626d = f18;
            float f19 = f13 / f12;
            this.f35628f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f35627e = ((f11 - f20) - f21) / f13;
            this.f35629g = f20;
            this.f35630h = f11 - f21;
            this.f35631i = f11;
            return;
        }
        if (f16 >= f11) {
            this.f35632j = 1;
            this.f35623a = f10;
            this.f35624b = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f35629g = f11;
            this.f35626d = (2.0f * f11) / f10;
            return;
        }
        float f22 = f11 - f16;
        float f23 = f22 / f10;
        if (f23 + f15 < f14) {
            this.f35632j = 2;
            this.f35623a = f10;
            this.f35624b = f10;
            this.f35625c = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f35629g = f22;
            this.f35630h = f11;
            this.f35626d = f23;
            this.f35627e = f15;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f10 * f10) / 2.0f) + (f12 * f11));
        float f24 = (fSqrt2 - f10) / f12;
        this.f35626d = f24;
        float f25 = fSqrt2 / f12;
        this.f35627e = f25;
        if (fSqrt2 < f13) {
            this.f35632j = 2;
            this.f35623a = f10;
            this.f35624b = fSqrt2;
            this.f35625c = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f35626d = f24;
            this.f35627e = f25;
            this.f35629g = ((f10 + fSqrt2) * f24) / 2.0f;
            this.f35630h = f11;
            return;
        }
        this.f35632j = 3;
        this.f35623a = f10;
        this.f35624b = f13;
        this.f35625c = f13;
        float f26 = (f13 - f10) / f12;
        this.f35626d = f26;
        float f27 = f13 / f12;
        this.f35628f = f27;
        float f28 = ((f10 + f13) * f26) / 2.0f;
        float f29 = (f27 * f13) / 2.0f;
        this.f35627e = ((f11 - f28) - f29) / f13;
        this.f35629g = f28;
        this.f35630h = f11 - f29;
        this.f35631i = f11;
    }

    @Override // t.m
    public float getInterpolation(float f10) {
        float f11;
        float f12 = this.f35626d;
        if (f10 <= f12) {
            float f13 = this.f35623a;
            f11 = ((((this.f35624b - f13) * f10) * f10) / (f12 * 2.0f)) + (f13 * f10);
        } else {
            int i10 = this.f35632j;
            if (i10 == 1) {
                f11 = this.f35629g;
            } else {
                float f14 = f10 - f12;
                float f15 = this.f35627e;
                if (f14 < f15) {
                    float f16 = this.f35629g;
                    float f17 = this.f35624b;
                    f11 = ((((this.f35625c - f17) * f14) * f14) / (f15 * 2.0f)) + (f17 * f14) + f16;
                } else if (i10 == 2) {
                    f11 = this.f35630h;
                } else {
                    float f18 = f14 - f15;
                    float f19 = this.f35628f;
                    if (f18 <= f19) {
                        float f20 = this.f35630h;
                        float f21 = this.f35625c * f18;
                        f11 = (f20 + f21) - ((f21 * f18) / (f19 * 2.0f));
                    } else {
                        f11 = this.f35631i;
                    }
                }
            }
        }
        this.f35635m = f10;
        return this.f35633k ? this.f35634l - f11 : this.f35634l + f11;
    }
}
