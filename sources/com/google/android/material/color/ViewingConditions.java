package com.google.android.material.color;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
final class ViewingConditions {
    public static final ViewingConditions DEFAULT = make(ColorUtils.whitePointD65(), (float) ((((double) ColorUtils.yFromLstar(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float aw;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f11723c;
    private final float fl;
    private final float flRoot;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f11724n;
    private final float nbb;

    /* JADX INFO: renamed from: nc, reason: collision with root package name */
    private final float f11725nc;
    private final float ncb;
    private final float[] rgbD;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final float f11726z;

    private ViewingConditions(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f11724n = f10;
        this.aw = f11;
        this.nbb = f12;
        this.ncb = f13;
        this.f11723c = f14;
        this.f11725nc = f15;
        this.rgbD = fArr;
        this.fl = f16;
        this.flRoot = f17;
        this.f11726z = f18;
    }

    public static ViewingConditions make(float[] fArr, float f10, float f11, float f12, boolean z10) {
        float[][] fArr2 = Cam16.XYZ_TO_CAM16RGB;
        float f13 = (fArr[2] * fArr2[0][2]) + (fArr[1] * fArr2[0][1]) + (fArr[0] * fArr2[0][0]);
        float f14 = (fArr[2] * fArr2[1][2]) + (fArr[1] * fArr2[1][1]) + (fArr[0] * fArr2[1][0]);
        float f15 = (fArr[2] * fArr2[2][2]) + (fArr[1] * fArr2[2][1]) + (fArr[0] * fArr2[2][0]);
        float f16 = (f12 / 10.0f) + 0.8f;
        float fLerp = ((double) f16) >= 0.9d ? MathUtils.lerp(0.59f, 0.69f, (f16 - 0.9f) * 10.0f) : MathUtils.lerp(0.525f, 0.59f, (f16 - 0.8f) * 10.0f);
        float fExp = z10 ? 1.0f : (1.0f - (((float) Math.exp(((-f10) - 42.0f) / 92.0f)) * 0.2777778f)) * f16;
        double d10 = fExp;
        if (d10 > 1.0d) {
            fExp = 1.0f;
        } else if (d10 < 0.0d) {
            fExp = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        float[] fArr3 = {(((100.0f / f13) * fExp) + 1.0f) - fExp, (((100.0f / f14) * fExp) + 1.0f) - fExp, (((100.0f / f15) * fExp) + 1.0f) - fExp};
        float f17 = 1.0f / ((5.0f * f10) + 1.0f);
        float f18 = f17 * f17 * f17 * f17;
        float f19 = 1.0f - f18;
        float fCbrt = (0.1f * f19 * f19 * ((float) Math.cbrt(((double) f10) * 5.0d))) + (f18 * f10);
        float fYFromLstar = ColorUtils.yFromLstar(f11) / fArr[1];
        double d11 = fYFromLstar;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * fCbrt) * f13)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * fCbrt) * f14)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * fCbrt) * f15)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new ViewingConditions(fYFromLstar, ((fArr5[2] * 0.05f) + (fArr5[0] * 2.0f) + fArr5[1]) * fPow, fPow, fPow, fLerp, f16, fArr3, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public float getAw() {
        return this.aw;
    }

    public float getC() {
        return this.f11723c;
    }

    public float getFl() {
        return this.fl;
    }

    public float getFlRoot() {
        return this.flRoot;
    }

    public float getN() {
        return this.f11724n;
    }

    public float getNbb() {
        return this.nbb;
    }

    public float getNc() {
        return this.f11725nc;
    }

    public float getNcb() {
        return this.ncb;
    }

    public float[] getRgbD() {
        return this.rgbD;
    }

    public float getZ() {
        return this.f11726z;
    }
}
