package com.yandex.mobile.ads.impl;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class s31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f24930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f24931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f24932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f24933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f24934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f24935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f24936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f24937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f24938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f24939l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f24940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f24941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f24942o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f24943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f24944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f24945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f24946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f24947t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f24948u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f24949v;

    public s31(int i10, int i11, float f10, float f11, int i12) {
        this.f24928a = i10;
        this.f24929b = i11;
        this.f24930c = f10;
        this.f24931d = f11;
        this.f24932e = i10 / i12;
        this.f24933f = i10 / 400;
        int i13 = i10 / 65;
        this.f24934g = i13;
        int i14 = i13 * 2;
        this.f24935h = i14;
        this.f24936i = new short[i14];
        int i15 = i14 * i11;
        this.f24937j = new short[i15];
        this.f24939l = new short[i15];
        this.f24941n = new short[i15];
    }

    private int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f24929b;
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
        this.f24948u = i14 / i16;
        this.f24949v = i17 / i15;
        return i16;
    }

    private short[] a(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f24929b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private void d() {
        int iA;
        double d10;
        int i10;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f24940m;
        float f11 = this.f24930c;
        float f12 = this.f24931d;
        float f13 = f11 / f12;
        float f14 = this.f24932e * f12;
        double d11 = f13;
        int i17 = 0;
        int i18 = 1;
        if (d11 > 1.00001d || d11 < 0.99999d) {
            int i19 = this.f24938k;
            if (i19 >= this.f24935h) {
                int i20 = 0;
                while (true) {
                    int i21 = this.f24945r;
                    if (i21 > 0) {
                        int iMin = Math.min(this.f24935h, i21);
                        short[] sArr = this.f24937j;
                        short[] sArrA = a(this.f24939l, this.f24940m, iMin);
                        this.f24939l = sArrA;
                        int i22 = this.f24929b;
                        System.arraycopy(sArr, i20 * i22, sArrA, this.f24940m * i22, i22 * iMin);
                        this.f24940m += iMin;
                        this.f24945r -= iMin;
                        i20 += iMin;
                        f10 = f13;
                        d10 = d11;
                    } else {
                        short[] sArr2 = this.f24937j;
                        int i23 = this.f24928a;
                        int i24 = i23 > 4000 ? i23 / 4000 : i18;
                        int i25 = this.f24929b;
                        if (i25 == i18 && i24 == i18) {
                            iA = a(sArr2, i20, this.f24933f, this.f24934g);
                        } else {
                            int i26 = this.f24935h / i24;
                            int i27 = i25 * i24;
                            int i28 = i25 * i20;
                            int i29 = i17;
                            while (i29 < i26) {
                                int i30 = i17;
                                int i31 = i30;
                                while (i30 < i27) {
                                    i31 += sArr2[(i29 * i27) + i28 + i30];
                                    i30++;
                                }
                                this.f24936i[i29] = (short) (i31 / i27);
                                i29++;
                                i17 = 0;
                            }
                            int iA2 = a(this.f24936i, 0, this.f24933f / i24, this.f24934g / i24);
                            if (i24 != 1) {
                                int i32 = iA2 * i24;
                                int i33 = i24 * 4;
                                int i34 = i32 - i33;
                                int i35 = i32 + i33;
                                int i36 = this.f24933f;
                                if (i34 < i36) {
                                    i34 = i36;
                                }
                                int i37 = this.f24934g;
                                if (i35 > i37) {
                                    i35 = i37;
                                }
                                int i38 = this.f24929b;
                                if (i38 == 1) {
                                    iA = a(sArr2, i20, i34, i35);
                                } else {
                                    int i39 = this.f24935h / 1;
                                    int i40 = i38 * 1;
                                    int i41 = i38 * i20;
                                    int i42 = 0;
                                    while (i42 < i39) {
                                        int i43 = 0;
                                        for (int i44 = 0; i44 < i40; i44++) {
                                            i43 += sArr2[(i42 * i40) + i41 + i44];
                                        }
                                        this.f24936i[i42] = (short) (i43 / i40);
                                        i42++;
                                        sArr2 = sArr2;
                                    }
                                    iA = a(this.f24936i, 0, i34, i35);
                                }
                            } else {
                                iA = iA2;
                            }
                        }
                        int i45 = this.f24948u;
                        int i46 = i45 != 0 && this.f24946s != 0 && this.f24949v <= i45 * 3 && i45 * 2 > this.f24947t * 3 ? this.f24946s : iA;
                        this.f24947t = i45;
                        this.f24946s = iA;
                        if (d11 > 1.0d) {
                            short[] sArr3 = this.f24937j;
                            if (f13 >= 2.0f) {
                                i11 = (int) (i46 / (f13 - 1.0f));
                            } else {
                                this.f24945r = (int) (((2.0f - f13) * i46) / (f13 - 1.0f));
                                i11 = i46;
                            }
                            short[] sArrA2 = a(this.f24939l, this.f24940m, i11);
                            this.f24939l = sArrA2;
                            int i47 = this.f24929b;
                            int i48 = this.f24940m;
                            int i49 = i20 + i46;
                            int i50 = 0;
                            while (i50 < i47) {
                                int i51 = (i48 * i47) + i50;
                                int i52 = (i49 * i47) + i50;
                                int i53 = (i20 * i47) + i50;
                                double d12 = d11;
                                for (int i54 = 0; i54 < i11; i54++) {
                                    sArrA2[i51] = (short) (((sArr3[i52] * i54) + ((i11 - i54) * sArr3[i53])) / i11);
                                    i51 += i47;
                                    i53 += i47;
                                    i52 += i47;
                                }
                                i50++;
                                d11 = d12;
                            }
                            d10 = d11;
                            this.f24940m += i11;
                            f10 = f13;
                            i20 = i46 + i11 + i20;
                        } else {
                            d10 = d11;
                            short[] sArr4 = this.f24937j;
                            if (f13 < 0.5f) {
                                i10 = (int) ((i46 * f13) / (1.0f - f13));
                            } else {
                                this.f24945r = (int) ((((2.0f * f13) - 1.0f) * i46) / (1.0f - f13));
                                i10 = i46;
                            }
                            int i55 = i46 + i10;
                            short[] sArrA3 = a(this.f24939l, this.f24940m, i55);
                            this.f24939l = sArrA3;
                            int i56 = this.f24929b;
                            System.arraycopy(sArr4, i20 * i56, sArrA3, this.f24940m * i56, i56 * i46);
                            int i57 = this.f24929b;
                            short[] sArr5 = this.f24939l;
                            int i58 = this.f24940m + i46;
                            int i59 = i46 + i20;
                            int i60 = 0;
                            while (i60 < i57) {
                                int i61 = (i58 * i57) + i60;
                                int i62 = (i20 * i57) + i60;
                                int i63 = (i59 * i57) + i60;
                                float f15 = f13;
                                int i64 = 0;
                                while (i64 < i10) {
                                    sArr5[i61] = (short) (((sArr4[i62] * i64) + ((i10 - i64) * sArr4[i63])) / i10);
                                    i61 += i57;
                                    i63 += i57;
                                    i62 += i57;
                                    i64++;
                                    sArr4 = sArr4;
                                }
                                i60++;
                                f13 = f15;
                            }
                            f10 = f13;
                            this.f24940m += i55;
                            i20 += i10;
                        }
                    }
                    if (this.f24935h + i20 > i19) {
                        break;
                    }
                    f13 = f10;
                    d11 = d10;
                    i17 = 0;
                    i18 = 1;
                }
                int i65 = this.f24938k - i20;
                short[] sArr6 = this.f24937j;
                int i66 = this.f24929b;
                System.arraycopy(sArr6, i20 * i66, sArr6, 0, i66 * i65);
                this.f24938k = i65;
            }
        } else {
            short[] sArr7 = this.f24937j;
            int i67 = this.f24938k;
            short[] sArrA4 = a(this.f24939l, i16, i67);
            this.f24939l = sArrA4;
            int i68 = this.f24929b;
            System.arraycopy(sArr7, i68 * 0, sArrA4, this.f24940m * i68, i68 * i67);
            this.f24940m += i67;
            this.f24938k = 0;
        }
        if (f14 == 1.0f || this.f24940m == i16) {
            return;
        }
        int i69 = this.f24928a;
        int i70 = (int) (i69 / f14);
        while (true) {
            if (i70 <= 16384 && i69 <= 16384) {
                break;
            }
            i70 /= 2;
            i69 /= 2;
        }
        int i71 = this.f24940m - i16;
        short[] sArrA5 = a(this.f24941n, this.f24942o, i71);
        this.f24941n = sArrA5;
        short[] sArr8 = this.f24939l;
        int i72 = this.f24929b;
        System.arraycopy(sArr8, i16 * i72, sArrA5, this.f24942o * i72, i72 * i71);
        this.f24940m = i16;
        this.f24942o += i71;
        int i73 = 0;
        while (true) {
            i12 = this.f24942o;
            i13 = i12 - 1;
            if (i73 >= i13) {
                break;
            }
            while (true) {
                i14 = this.f24943p + 1;
                int i74 = i14 * i70;
                i15 = this.f24944q;
                if (i74 <= i15 * i69) {
                    break;
                }
                this.f24939l = a(this.f24939l, this.f24940m, 1);
                int i75 = 0;
                while (true) {
                    int i76 = this.f24929b;
                    if (i75 < i76) {
                        short[] sArr9 = this.f24939l;
                        int i77 = (this.f24940m * i76) + i75;
                        short[] sArr10 = this.f24941n;
                        int i78 = (i73 * i76) + i75;
                        short s10 = sArr10[i78];
                        short s11 = sArr10[i78 + i76];
                        int i79 = this.f24944q * i69;
                        int i80 = this.f24943p;
                        int i81 = i80 * i70;
                        int i82 = (i80 + 1) * i70;
                        int i83 = i82 - i79;
                        int i84 = i82 - i81;
                        sArr9[i77] = (short) ((((i84 - i83) * s11) + (s10 * i83)) / i84);
                        i75++;
                    }
                }
                this.f24944q++;
                this.f24940m++;
            }
            this.f24943p = i14;
            if (i14 == i69) {
                this.f24943p = 0;
                pa.b(i15 == i70);
                this.f24944q = 0;
            }
            i73++;
        }
        if (i13 == 0) {
            return;
        }
        short[] sArr11 = this.f24941n;
        int i85 = this.f24929b;
        System.arraycopy(sArr11, i13 * i85, sArr11, 0, (i12 - i13) * i85);
        this.f24942o -= i13;
    }

    public final void a() {
        this.f24938k = 0;
        this.f24940m = 0;
        this.f24942o = 0;
        this.f24943p = 0;
        this.f24944q = 0;
        this.f24945r = 0;
        this.f24946s = 0;
        this.f24947t = 0;
        this.f24948u = 0;
        this.f24949v = 0;
    }

    public final void a(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f24929b, this.f24940m);
        shortBuffer.put(this.f24939l, 0, this.f24929b * iMin);
        int i10 = this.f24940m - iMin;
        this.f24940m = i10;
        short[] sArr = this.f24939l;
        int i11 = this.f24929b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public final int b() {
        return this.f24940m * this.f24929b * 2;
    }

    public final void b(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f24929b;
        int i11 = iRemaining / i10;
        short[] sArrA = a(this.f24937j, this.f24938k, i11);
        this.f24937j = sArrA;
        shortBuffer.get(sArrA, this.f24938k * this.f24929b, ((i10 * i11) * 2) / 2);
        this.f24938k += i11;
        d();
    }

    public final int c() {
        return this.f24938k * this.f24929b * 2;
    }

    public final void e() {
        int i10;
        int i11 = this.f24938k;
        float f10 = this.f24930c;
        float f11 = this.f24931d;
        int i12 = this.f24940m + ((int) ((((i11 / (f10 / f11)) + this.f24942o) / (this.f24932e * f11)) + 0.5f));
        this.f24937j = a(this.f24937j, i11, (this.f24935h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f24935h * 2;
            int i14 = this.f24929b;
            if (i13 >= i10 * i14) {
                break;
            }
            this.f24937j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f24938k = i10 + this.f24938k;
        d();
        if (this.f24940m > i12) {
            this.f24940m = i12;
        }
        this.f24938k = 0;
        this.f24945r = 0;
        this.f24942o = 0;
    }
}
