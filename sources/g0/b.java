package g0;

import android.graphics.Color;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f29653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f29654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f29655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f29656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f29657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f29658f;

    public b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f29653a = f10;
        this.f29654b = f11;
        this.f29655c = f12;
        this.f29656d = f16;
        this.f29657e = f17;
        this.f29658f = f18;
    }

    public static b a(int i10) {
        k kVar = k.f29688k;
        float fB = c.b(Color.red(i10));
        float fB2 = c.b(Color.green(i10));
        float fB3 = c.b(Color.blue(i10));
        float[][] fArr = c.f29662d;
        float[] fArr2 = {(fArr[0][2] * fB3) + (fArr[0][1] * fB2) + (fArr[0][0] * fB), (fArr[1][2] * fB3) + (fArr[1][1] * fB2) + (fArr[1][0] * fB), (fB3 * fArr[2][2]) + (fB2 * fArr[2][1]) + (fB * fArr[2][0])};
        float[][] fArr3 = c.f29659a;
        float f10 = (fArr2[2] * fArr3[0][2]) + (fArr2[1] * fArr3[0][1]) + (fArr2[0] * fArr3[0][0]);
        float f11 = (fArr2[2] * fArr3[1][2]) + (fArr2[1] * fArr3[1][1]) + (fArr2[0] * fArr3[1][0]);
        float f12 = (fArr2[2] * fArr3[2][2]) + (fArr2[1] * fArr3[2][1]) + (fArr2[0] * fArr3[2][0]);
        float[] fArr4 = kVar.f29695g;
        float f13 = fArr4[0] * f10;
        float f14 = fArr4[1] * f11;
        float f15 = fArr4[2] * f12;
        float fPow = (float) Math.pow(((double) (Math.abs(f13) * kVar.f29696h)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f14) * kVar.f29696h)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f15) * kVar.f29696h)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f13) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f14) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f15) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f16 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d10)) / 11.0f;
        float f17 = ((float) (((double) (fSignum + fSignum2)) - (d10 * 2.0d))) / 9.0f;
        float f18 = fSignum2 * 20.0f;
        float f19 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f18)) / 20.0f;
        float f20 = (((fSignum * 40.0f) + f18) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (fAtan2 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f21 = fAtan2;
        float f22 = (3.1415927f * f21) / 180.0f;
        float fPow4 = ((float) Math.pow((f20 * kVar.f29690b) / kVar.f29689a, kVar.f29692d * kVar.f29698j)) * 100.0f;
        float fSqrt = (kVar.f29689a + 4.0f) * (4.0f / kVar.f29692d) * ((float) Math.sqrt(fPow4 / 100.0f)) * kVar.f29697i;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, kVar.f29694f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f21) < 20.14d ? 360.0f + f21 : f21)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kVar.f29693e) * kVar.f29691c) * ((float) Math.sqrt((f17 * f17) + (f16 * f16)))) / (f19 + 0.305f), 0.9d));
        float fSqrt2 = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float f23 = fSqrt2 * kVar.f29697i;
        float fSqrt3 = ((float) Math.sqrt((fPow5 * kVar.f29692d) / (kVar.f29689a + 4.0f))) * 50.0f;
        float f24 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * f23) + 1.0f)) * 43.85965f;
        double d11 = f22;
        return new b(f21, fSqrt2, fPow4, fSqrt, f23, fSqrt3, f24, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    public static b b(float f10, float f11, float f12) {
        k kVar = k.f29688k;
        double d10 = ((double) f10) / 100.0d;
        float fSqrt = (kVar.f29689a + 4.0f) * (4.0f / kVar.f29692d) * ((float) Math.sqrt(d10));
        float f13 = kVar.f29697i;
        float f14 = fSqrt * f13;
        float f15 = f11 * f13;
        float fSqrt2 = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(d10))) * kVar.f29692d) / (kVar.f29689a + 4.0f))) * 50.0f;
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((((double) f15) * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (3.1415927f * f12) / 180.0f;
        return new b(f12, f11, f10, f14, f15, fSqrt2, f16, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public int c(k kVar) {
        float fSqrt;
        float f10 = this.f29654b;
        if (f10 != 0.0d) {
            double d10 = this.f29655c;
            if (d10 == 0.0d) {
                fSqrt = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            } else {
                fSqrt = f10 / ((float) Math.sqrt(d10 / 100.0d));
            }
        } else {
            fSqrt = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, kVar.f29694f), 0.73d), 1.1111111111111112d);
        double d11 = (this.f29653a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f;
        float fPow2 = kVar.f29689a * ((float) Math.pow(((double) this.f29655c) / 100.0d, (1.0d / ((double) kVar.f29692d)) / ((double) kVar.f29698j)));
        float f11 = fCos * 3846.1538f * kVar.f29693e * kVar.f29691c;
        float f12 = fPow2 / kVar.f29690b;
        float fSin = (float) Math.sin(d11);
        float fCos2 = (float) Math.cos(d11);
        float f13 = (((0.305f + f12) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f11 * 23.0f)));
        float f14 = fCos2 * f13;
        float f15 = f13 * fSin;
        float f16 = f12 * 460.0f;
        float f17 = ((288.0f * f15) + ((451.0f * f14) + f16)) / 1403.0f;
        float f18 = ((f16 - (891.0f * f14)) - (261.0f * f15)) / 1403.0f;
        float f19 = ((f16 - (f14 * 220.0f)) - (f15 * 6300.0f)) / 1403.0f;
        float fSignum = (100.0f / kVar.f29696h) * Math.signum(f17) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f17)) * 27.13d) / (400.0d - ((double) Math.abs(f17)))), 2.380952380952381d));
        float fSignum2 = (100.0f / kVar.f29696h) * Math.signum(f18) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f18)) * 27.13d) / (400.0d - ((double) Math.abs(f18)))), 2.380952380952381d));
        float fSignum3 = (100.0f / kVar.f29696h) * Math.signum(f19) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f19)) * 27.13d) / (400.0d - ((double) Math.abs(f19)))), 2.380952380952381d));
        float[] fArr = kVar.f29695g;
        float f20 = fSignum / fArr[0];
        float f21 = fSignum2 / fArr[1];
        float f22 = fSignum3 / fArr[2];
        float[][] fArr2 = c.f29660b;
        return h0.e.a((fArr2[0][2] * f22) + (fArr2[0][1] * f21) + (fArr2[0][0] * f20), (fArr2[1][2] * f22) + (fArr2[1][1] * f21) + (fArr2[1][0] * f20), (f22 * fArr2[2][2]) + (f21 * fArr2[2][1]) + (f20 * fArr2[2][0]));
    }
}
