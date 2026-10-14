package com.applovin.exoplayer2.b;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f4606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f4607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f4608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f4609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f4611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f4612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f4613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f4614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f4615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f4616m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f4617n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f4618o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f4619p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f4620q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f4621r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f4622s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f4623t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f4624u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f4625v;

    public v(int i10, int i11, float f10, float f11, int i12) {
        this.f4604a = i10;
        this.f4605b = i11;
        this.f4606c = f10;
        this.f4607d = f11;
        this.f4608e = i10 / i12;
        this.f4609f = i10 / 400;
        int i13 = i10 / 65;
        this.f4610g = i13;
        int i14 = i13 * 2;
        this.f4611h = i14;
        this.f4612i = new short[i14];
        this.f4613j = new short[i14 * i11];
        this.f4615l = new short[i14 * i11];
        this.f4617n = new short[i14 * i11];
    }

    private int a(short[] sArr, int i10) {
        int iA;
        int i11 = this.f4604a;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        if (this.f4605b == 1 && i12 == 1) {
            iA = a(sArr, i10, this.f4609f, this.f4610g);
        } else {
            c(sArr, i10, i12);
            int iA2 = a(this.f4612i, 0, this.f4609f / i12, this.f4610g / i12);
            if (i12 != 1) {
                int i13 = iA2 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f4609f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f4610g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.f4605b == 1) {
                    iA = a(sArr, i10, i15, i16);
                } else {
                    c(sArr, i10, 1);
                    iA = a(this.f4612i, 0, i15, i16);
                }
            } else {
                iA = iA2;
            }
        }
        int i19 = a(this.f4624u, this.f4625v) ? this.f4622s : iA;
        this.f4623t = this.f4624u;
        this.f4622s = iA;
        return i19;
    }

    private int a(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f4621r = (int) (((2.0f - f10) * i11) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] sArrA = a(this.f4615l, this.f4616m, i12);
        this.f4615l = sArrA;
        a(i12, this.f4605b, sArrA, this.f4616m, sArr, i10, sArr, i10 + i11);
        this.f4616m += i12;
        return i12;
    }

    private int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f4605b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i14 * i11) {
                i16 = i11;
                i14 = iAbs;
            }
            if (iAbs * i15 > i17 * i11) {
                i15 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f4624u = i14 / i16;
        this.f4625v = i17 / i15;
        return i16;
    }

    private void a(float f10) {
        int iB;
        int i10 = this.f4614k;
        if (i10 < this.f4611h) {
            return;
        }
        int iA = 0;
        do {
            if (this.f4621r > 0) {
                iB = b(iA);
            } else {
                int iA2 = a(this.f4613j, iA);
                if (f10 > 1.0d) {
                    iA = iA2 + a(this.f4613j, iA, f10, iA2) + iA;
                } else {
                    iB = b(this.f4613j, iA, f10, iA2);
                }
            }
            iA += iB;
        } while (this.f4611h + iA <= i10);
        a(iA);
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f4616m == i10) {
            return;
        }
        int i13 = this.f4604a;
        int i14 = (int) (i13 / f10);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        c(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f4618o;
            if (i15 >= i16 - 1) {
                d(i16 - 1);
                return;
            }
            while (true) {
                i11 = this.f4619p;
                int i17 = (i11 + 1) * i14;
                i12 = this.f4620q;
                if (i17 <= i12 * i13) {
                    break;
                }
                this.f4615l = a(this.f4615l, this.f4616m, 1);
                int i18 = 0;
                while (true) {
                    int i19 = this.f4605b;
                    if (i18 < i19) {
                        this.f4615l[(this.f4616m * i19) + i18] = b(this.f4617n, (i19 * i15) + i18, i13, i14);
                        i18++;
                    }
                }
                this.f4620q++;
                this.f4616m++;
            }
            int i20 = i11 + 1;
            this.f4619p = i20;
            if (i20 == i13) {
                this.f4619p = 0;
                com.applovin.exoplayer2.l.a.b(i12 == i14);
                this.f4620q = 0;
            }
            i15++;
        }
    }

    private void a(int i10) {
        int i11 = this.f4614k - i10;
        short[] sArr = this.f4613j;
        int i12 = this.f4605b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f4614k = i11;
    }

    private static void a(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean a(int i10, int i11) {
        return i10 != 0 && this.f4622s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f4623t * 3;
    }

    private short[] a(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f4605b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int b(int i10) {
        int iMin = Math.min(this.f4611h, this.f4621r);
        b(this.f4613j, i10, iMin);
        this.f4621r -= iMin;
        return iMin;
    }

    private int b(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f4621r = (int) ((((2.0f * f10) - 1.0f) * i11) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] sArrA = a(this.f4615l, this.f4616m, i13);
        this.f4615l = sArrA;
        int i14 = this.f4605b;
        System.arraycopy(sArr, i10 * i14, sArrA, this.f4616m * i14, i14 * i11);
        a(i12, this.f4605b, this.f4615l, this.f4616m + i11, sArr, i10 + i11, sArr, i10);
        this.f4616m += i13;
        return i12;
    }

    private short b(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f4605b];
        int i13 = this.f4620q * i11;
        int i14 = this.f4619p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) ((((i18 - i17) * s11) + (s10 * i17)) / i18);
    }

    private void b(short[] sArr, int i10, int i11) {
        short[] sArrA = a(this.f4615l, this.f4616m, i11);
        this.f4615l = sArrA;
        int i12 = this.f4605b;
        System.arraycopy(sArr, i10 * i12, sArrA, this.f4616m * i12, i12 * i11);
        this.f4616m += i11;
    }

    private void c(int i10) {
        int i11 = this.f4616m - i10;
        short[] sArrA = a(this.f4617n, this.f4618o, i11);
        this.f4617n = sArrA;
        short[] sArr = this.f4615l;
        int i12 = this.f4605b;
        System.arraycopy(sArr, i10 * i12, sArrA, this.f4618o * i12, i12 * i11);
        this.f4616m = i10;
        this.f4618o += i11;
    }

    private void c(short[] sArr, int i10, int i11) {
        int i12 = this.f4611h / i11;
        int i13 = this.f4605b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f4612i[i16] = (short) (i17 / i14);
        }
    }

    private void d(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f4617n;
        int i11 = this.f4605b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f4618o - i10) * i11);
        this.f4618o -= i10;
    }

    private void e() {
        int i10 = this.f4616m;
        float f10 = this.f4606c;
        float f11 = this.f4607d;
        float f12 = f10 / f11;
        float f13 = this.f4608e * f11;
        double d10 = f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            a(f12);
        } else {
            b(this.f4613j, 0, this.f4614k);
            this.f4614k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    public int a() {
        return this.f4614k * this.f4605b * 2;
    }

    public void a(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f4605b;
        int i11 = iRemaining / i10;
        short[] sArrA = a(this.f4613j, this.f4614k, i11);
        this.f4613j = sArrA;
        shortBuffer.get(sArrA, this.f4614k * this.f4605b, ((i10 * i11) * 2) / 2);
        this.f4614k += i11;
        e();
    }

    public void b() {
        int i10;
        int i11 = this.f4614k;
        float f10 = this.f4606c;
        float f11 = this.f4607d;
        int i12 = this.f4616m + ((int) ((((i11 / (f10 / f11)) + this.f4618o) / (this.f4608e * f11)) + 0.5f));
        this.f4613j = a(this.f4613j, i11, (this.f4611h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f4611h;
            int i14 = this.f4605b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f4613j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f4614k = (i10 * 2) + this.f4614k;
        e();
        if (this.f4616m > i12) {
            this.f4616m = i12;
        }
        this.f4614k = 0;
        this.f4621r = 0;
        this.f4618o = 0;
    }

    public void b(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f4605b, this.f4616m);
        shortBuffer.put(this.f4615l, 0, this.f4605b * iMin);
        int i10 = this.f4616m - iMin;
        this.f4616m = i10;
        short[] sArr = this.f4615l;
        int i11 = this.f4605b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public void c() {
        this.f4614k = 0;
        this.f4616m = 0;
        this.f4618o = 0;
        this.f4619p = 0;
        this.f4620q = 0;
        this.f4621r = 0;
        this.f4622s = 0;
        this.f4623t = 0;
        this.f4624u = 0;
        this.f4625v = 0;
    }

    public int d() {
        return this.f4616m * this.f4605b * 2;
    }
}
