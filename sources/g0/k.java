package g0;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k f29688k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f29689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f29690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f29691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f29692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f29693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f29694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f29695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f29696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f29697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f29698j;

    static {
        float[] fArr = c.f29661c;
        float fC = (float) ((((double) c.c(50.0f)) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = c.f29659a;
        float f10 = (fArr[2] * fArr2[0][2]) + (fArr[1] * fArr2[0][1]) + (fArr[0] * fArr2[0][0]);
        float f11 = (fArr[2] * fArr2[1][2]) + (fArr[1] * fArr2[1][1]) + (fArr[0] * fArr2[1][0]);
        float f12 = (fArr[2] * fArr2[2][2]) + (fArr[1] * fArr2[2][1]) + (fArr[0] * fArr2[2][0]);
        float f13 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fC) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = fExp;
        if (d10 > 1.0d) {
            fExp = 1.0f;
        } else if (d10 < 0.0d) {
            fExp = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        float[] fArr3 = {(((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp, (((100.0f / f12) * fExp) + 1.0f) - fExp};
        float f14 = 1.0f / ((5.0f * fC) + 1.0f);
        float f15 = f14 * f14 * f14 * f14;
        float f16 = 1.0f - f15;
        float fCbrt = (0.1f * f16 * f16 * ((float) Math.cbrt(((double) fC) * 5.0d))) + (f15 * fC);
        float fC2 = c.c(50.0f) / fArr[1];
        double d11 = fC2;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * fCbrt) * f10)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * fCbrt) * f11)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * fCbrt) * f12)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        f29688k = new k(fC2, ((fArr5[2] * 0.05f) + (fArr5[0] * 2.0f) + fArr5[1]) * fPow, fPow, fPow, f13, 1.0f, fArr3, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public k(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f29694f = f10;
        this.f29689a = f11;
        this.f29690b = f12;
        this.f29691c = f13;
        this.f29692d = f14;
        this.f29693e = f15;
        this.f29695g = fArr;
        this.f29696h = f16;
        this.f29697i = f17;
        this.f29698j = f18;
    }
}
