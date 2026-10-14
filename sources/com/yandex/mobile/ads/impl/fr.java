package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class fr {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f20798h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f20799i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f20800j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f20801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f20802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Canvas f20803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f20804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f20805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f20806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f20807g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f20809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f20810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f20811d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f20808a = i10;
            this.f20809b = iArr;
            this.f20810c = iArr2;
            this.f20811d = iArr3;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f20815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f20816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f20817f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f20812a = i10;
            this.f20813b = i11;
            this.f20814c = i12;
            this.f20815d = i13;
            this.f20816e = i14;
            this.f20817f = i15;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f20820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f20821d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f20818a = i10;
            this.f20819b = z10;
            this.f20820c = bArr;
            this.f20821d = bArr2;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<e> f20824c;

        public d(int i10, int i11, SparseArray sparseArray) {
            this.f20822a = i10;
            this.f20823b = i11;
            this.f20824c = sparseArray;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20826b;

        public e(int i10, int i11) {
            this.f20825a = i10;
            this.f20826b = i11;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f20830d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f20831e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f20832f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f20833g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f20834h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f20835i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final SparseArray<g> f20836j;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, SparseArray sparseArray) {
            this.f20827a = i10;
            this.f20828b = z10;
            this.f20829c = i11;
            this.f20830d = i12;
            this.f20831e = i13;
            this.f20832f = i14;
            this.f20833g = i15;
            this.f20834h = i16;
            this.f20835i = i17;
            this.f20836j = sparseArray;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20838b;

        public g(int i10, int i11) {
            this.f20837a = i10;
            this.f20838b = i11;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f20841c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f20842d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f20843e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f20844f = new SparseArray<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f20845g = new SparseArray<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f20846h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f20847i;

        public h(int i10, int i11) {
            this.f20839a = i10;
            this.f20840b = i11;
        }
    }

    public fr(int i10, int i11) {
        Paint paint = new Paint();
        this.f20801a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f20802b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f20803c = new Canvas();
        this.f20804d = new b(719, 575, 0, 719, 0, 575);
        this.f20805e = new a(0, a(), b(), c());
        this.f20806f = new h(i10, i11);
    }

    private static int a(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static a a(lp0 lp0Var, int i10) {
        int[] iArr;
        int iB;
        int i11;
        int iB2;
        int iB3;
        int iB4;
        int i12 = 8;
        int iB5 = lp0Var.b(8);
        lp0Var.d(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrA = a();
        int[] iArrB = b();
        int[] iArrC = c();
        while (i14 > 0) {
            int iB6 = lp0Var.b(i12);
            int iB7 = lp0Var.b(i12);
            int i15 = i14 - 2;
            if ((iB7 & 128) != 0) {
                iArr = iArrA;
            } else {
                iArr = (iB7 & 64) != 0 ? iArrB : iArrC;
            }
            if ((iB7 & 1) != 0) {
                iB3 = lp0Var.b(i12);
                iB4 = lp0Var.b(i12);
                iB = lp0Var.b(i12);
                iB2 = lp0Var.b(i12);
                i11 = i15 - 4;
            } else {
                int iB8 = lp0Var.b(6) << i13;
                int iB9 = lp0Var.b(4) << 4;
                iB = lp0Var.b(4) << 4;
                i11 = i15 - 2;
                iB2 = lp0Var.b(i13) << 6;
                iB3 = iB8;
                iB4 = iB9;
            }
            if (iB3 == 0) {
                iB2 = 255;
                iB4 = 0;
                iB = 0;
            }
            double d10 = iB3;
            int i16 = iB5;
            double d11 = iB4 - 128;
            int i17 = (int) ((1.402d * d11) + d10);
            double d12 = iB - 128;
            int i18 = (int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d));
            int i19 = (int) ((d12 * 1.772d) + d10);
            int i20 = da1.f19803a;
            iArr[iB6] = a((byte) (255 - (iB2 & 255)), Math.max(0, Math.min(i17, 255)), Math.max(0, Math.min(i18, 255)), Math.max(0, Math.min(i19, 255)));
            i14 = i11;
            iB5 = i16;
            i12 = 8;
            i13 = 2;
        }
        return new a(iB5, iArrA, iArrB, iArrC);
    }

    private static c a(lp0 lp0Var) {
        byte[] bArr;
        int iB = lp0Var.b(16);
        lp0Var.d(4);
        int iB2 = lp0Var.b(2);
        boolean zF = lp0Var.f();
        lp0Var.d(1);
        byte[] bArr2 = da1.f19808f;
        if (iB2 != 1) {
            if (iB2 == 0) {
                int iB3 = lp0Var.b(16);
                int iB4 = lp0Var.b(16);
                if (iB3 > 0) {
                    bArr2 = new byte[iB3];
                    lp0Var.b(bArr2, iB3);
                }
                if (iB4 > 0) {
                    bArr = new byte[iB4];
                    lp0Var.b(bArr, iB4);
                }
            }
            return new c(iB, zF, bArr2, bArr);
        }
        lp0Var.d(lp0Var.b(8) * 16);
        bArr = bArr2;
        return new c(iB, zF, bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0231  */
    /* JADX WARN: Code duplicated, block: B:122:0x0240 A[LOOP:3: B:93:0x018c->B:122:0x0240, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x023a A[SYNTHETIC] */
    private static void a(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c10;
        char c11;
        int iB;
        int i13;
        int iB2;
        int i14;
        int i15;
        int iB3;
        lp0 lp0Var = new lp0(bArr.length, bArr);
        int i16 = i11;
        int i17 = i12;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (lp0Var.b() != 0) {
            int i18 = 8;
            int iB4 = lp0Var.b(8);
            if (iB4 != 240) {
                int i19 = 4;
                int i20 = 2;
                int i21 = 1;
                switch (iB4) {
                    case 16:
                        int i22 = 1;
                        if (i10 == 3) {
                            if (bArr4 == null) {
                                bArr3 = f20799i;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr4;
                            }
                        } else if (i10 != 2) {
                            bArr2 = null;
                        } else if (bArr6 == null) {
                            bArr3 = f20798h;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArr6;
                        }
                        int i23 = i16;
                        int i24 = 0;
                        while (true) {
                            int iB5 = lp0Var.b(2);
                            if (iB5 != 0) {
                                iB = i22;
                            } else if (lp0Var.f()) {
                                int iB6 = lp0Var.b(3) + 3;
                                iB5 = lp0Var.b(2);
                                iB = iB6;
                            } else if (lp0Var.f()) {
                                iB = i22;
                                iB5 = 0;
                            } else {
                                int iB7 = lp0Var.b(2);
                                if (iB7 == 0) {
                                    c10 = 4;
                                    c11 = '\b';
                                    i24 = i22;
                                    iB5 = 0;
                                    iB = 0;
                                } else if (iB7 == i22) {
                                    c10 = 4;
                                    c11 = '\b';
                                    i24 = i24;
                                    iB = 2;
                                    iB5 = 0;
                                } else if (iB7 == 2) {
                                    c10 = 4;
                                    c11 = '\b';
                                    iB = lp0Var.b(4) + 12;
                                    iB5 = lp0Var.b(2);
                                    i24 = i24;
                                } else if (iB7 != 3) {
                                    iB5 = 0;
                                    iB = 0;
                                } else {
                                    c11 = '\b';
                                    iB = lp0Var.b(8) + 29;
                                    iB5 = lp0Var.b(2);
                                    i24 = i24;
                                    c10 = 4;
                                }
                                if (iB == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        iB5 = bArr2[iB5];
                                    }
                                    paint.setColor(iArr[iB5]);
                                    canvas.drawRect(i23, i17, i23 + iB, i17 + 1, paint);
                                }
                                i23 += iB;
                                if (i24 != 0) {
                                    lp0Var.c();
                                    i16 = i23;
                                } else {
                                    i24 = i24;
                                    i22 = 1;
                                }
                            }
                            c10 = 4;
                            c11 = '\b';
                            if (iB == 0) {
                            }
                            i23 += iB;
                            if (i24 != 0) {
                                lp0Var.c();
                                i16 = i23;
                            } else {
                                i24 = i24;
                                i22 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr7 = i10 == 3 ? bArr5 == null ? f20800j : bArr5 : null;
                        int i25 = i16;
                        boolean z10 = false;
                        while (true) {
                            int iB8 = lp0Var.b(i19);
                            if (iB8 != 0) {
                                i13 = 1;
                                z10 = z10;
                            } else if (lp0Var.f()) {
                                if (lp0Var.f()) {
                                    int iB9 = lp0Var.b(i20);
                                    if (iB9 == 0) {
                                        i13 = 1;
                                    } else if (iB9 == 1) {
                                        i13 = i20;
                                    } else if (iB9 == i20) {
                                        iB2 = lp0Var.b(i19) + 9;
                                    } else if (iB9 != 3) {
                                        z10 = z10;
                                        iB8 = 0;
                                        i13 = 0;
                                    } else {
                                        iB2 = lp0Var.b(i18) + 25;
                                    }
                                    iB8 = 0;
                                } else {
                                    iB2 = lp0Var.b(i20) + i19;
                                }
                                z10 = z10;
                                i13 = iB2;
                                iB8 = lp0Var.b(i19);
                            } else {
                                int iB10 = lp0Var.b(3);
                                if (iB10 != 0) {
                                    i13 = iB10 + 2;
                                    iB8 = 0;
                                } else {
                                    z10 = true;
                                    iB8 = 0;
                                    i13 = 0;
                                }
                            }
                            if (i13 == 0 || paint == null) {
                                i14 = i20;
                            } else {
                                if (bArr7 != 0) {
                                    iB8 = bArr7[iB8];
                                }
                                paint.setColor(iArr[iB8]);
                                i14 = 2;
                                canvas.drawRect(i25, i17, i25 + i13, i17 + 1, paint);
                            }
                            i25 += i13;
                            if (z10) {
                                lp0Var.c();
                                i16 = i25;
                            } else {
                                i20 = i14;
                                z10 = z10;
                                i19 = 4;
                                i18 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i26 = i16;
                        int i27 = 0;
                        while (true) {
                            int iB11 = lp0Var.b(8);
                            if (iB11 != 0) {
                                i15 = i27;
                                iB3 = i21;
                            } else if (lp0Var.f()) {
                                i15 = i27;
                                iB3 = lp0Var.b(7);
                                iB11 = lp0Var.b(8);
                            } else {
                                int iB12 = lp0Var.b(7);
                                if (iB12 != 0) {
                                    i15 = i27;
                                    iB3 = iB12;
                                    iB11 = 0;
                                } else {
                                    i15 = i21;
                                    iB11 = 0;
                                    iB3 = 0;
                                }
                            }
                            if (iB3 != 0 && paint != null) {
                                paint.setColor(iArr[iB11]);
                                canvas.drawRect(i26, i17, i26 + iB3, i17 + 1, paint);
                            }
                            i26 += iB3;
                            if (i15 != 0) {
                                i16 = i26;
                            } else {
                                i21 = i21;
                                i27 = i15;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iB4) {
                            case 32:
                                bArr6 = new byte[4];
                                for (int i28 = 0; i28 < 4; i28++) {
                                    bArr6[i28] = (byte) lp0Var.b(4);
                                }
                                break;
                            case 33:
                                bArr4 = new byte[4];
                                for (int i29 = 0; i29 < 4; i29++) {
                                    bArr4[i29] = (byte) lp0Var.b(8);
                                }
                                break;
                            case 34:
                                bArr5 = new byte[16];
                                for (int i30 = 0; i30 < 16; i30++) {
                                    bArr5[i30] = (byte) lp0Var.b(8);
                                }
                                break;
                        }
                        break;
                }
            } else {
                i17 += 2;
                i16 = i11;
            }
        }
    }

    private static int[] a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & SyslogConstants.LOG_LOCAL1;
                if (i11 == 0) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = a(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public final List a(int i10, byte[] bArr) {
        char c10;
        int i11;
        SparseArray sparseArray;
        int i12;
        f fVar;
        a aVar;
        Object obj;
        c cVar;
        int iB;
        int iB2;
        int i13;
        int iB3;
        lp0 lp0Var = new lp0(i10, bArr);
        while (lp0Var.b() >= 48 && lp0Var.b(8) == 15) {
            h hVar = this.f20806f;
            int iB4 = lp0Var.b(8);
            int i14 = 16;
            int iB5 = lp0Var.b(16);
            int iB6 = lp0Var.b(16);
            int iD = lp0Var.d() + iB6;
            if (iB6 * 8 > lp0Var.b()) {
                p90.d("DvbParser", "Data field length exceeds limit");
                lp0Var.d(lp0Var.b());
            } else {
                switch (iB4) {
                    case 16:
                        if (iB5 == hVar.f20839a) {
                            d dVar = hVar.f20847i;
                            lp0Var.b(8);
                            int iB7 = lp0Var.b(4);
                            int iB8 = lp0Var.b(2);
                            lp0Var.d(2);
                            int i15 = iB6 - 2;
                            SparseArray sparseArray2 = new SparseArray();
                            while (i15 > 0) {
                                int iB9 = lp0Var.b(8);
                                lp0Var.d(8);
                                i15 -= 6;
                                sparseArray2.put(iB9, new e(lp0Var.b(16), lp0Var.b(16)));
                            }
                            d dVar2 = new d(iB7, iB8, sparseArray2);
                            if (iB8 != 0) {
                                hVar.f20847i = dVar2;
                                hVar.f20841c.clear();
                                hVar.f20842d.clear();
                                hVar.f20843e.clear();
                            } else if (dVar != null && dVar.f20822a != iB7) {
                                hVar.f20847i = dVar2;
                            }
                        }
                        break;
                    case 17:
                        d dVar3 = hVar.f20847i;
                        if (iB5 == hVar.f20839a && dVar3 != null) {
                            int iB10 = lp0Var.b(8);
                            lp0Var.d(4);
                            boolean zF = lp0Var.f();
                            lp0Var.d(3);
                            int iB11 = lp0Var.b(16);
                            int iB12 = lp0Var.b(16);
                            lp0Var.b(3);
                            int iB13 = lp0Var.b(3);
                            lp0Var.d(2);
                            int iB14 = lp0Var.b(8);
                            int iB15 = lp0Var.b(8);
                            int iB16 = lp0Var.b(4);
                            int iB17 = lp0Var.b(2);
                            lp0Var.d(2);
                            int i16 = iB6 - 10;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i16 > 0) {
                                int iB18 = lp0Var.b(i14);
                                int iB19 = lp0Var.b(2);
                                lp0Var.b(2);
                                int iB20 = lp0Var.b(12);
                                lp0Var.d(4);
                                int iB21 = lp0Var.b(12);
                                i16 -= 6;
                                if (iB19 == 1 || iB19 == 2) {
                                    lp0Var.b(8);
                                    lp0Var.b(8);
                                    i16 -= 2;
                                }
                                sparseArray3.put(iB18, new g(iB20, iB21));
                                i14 = 16;
                            }
                            f fVar2 = new f(iB10, zF, iB11, iB12, iB13, iB14, iB15, iB16, iB17, sparseArray3);
                            if (dVar3.f20823b == 0 && (fVar = hVar.f20841c.get(iB10)) != null) {
                                SparseArray<g> sparseArray4 = fVar.f20836j;
                                for (int i17 = 0; i17 < sparseArray4.size(); i17++) {
                                    fVar2.f20836j.put(sparseArray4.keyAt(i17), sparseArray4.valueAt(i17));
                                }
                            }
                            sparseArray = hVar.f20841c;
                            i12 = fVar2.f20827a;
                            obj = fVar2;
                            sparseArray.put(i12, obj);
                        }
                        break;
                    case 18:
                        if (iB5 == hVar.f20839a) {
                            a aVarA = a(lp0Var, iB6);
                            sparseArray = hVar.f20842d;
                            aVar = aVarA;
                        } else if (iB5 == hVar.f20840b) {
                            a aVarA2 = a(lp0Var, iB6);
                            sparseArray = hVar.f20844f;
                            aVar = aVarA2;
                        }
                        i12 = aVar.f20808a;
                        obj = aVar;
                        sparseArray.put(i12, obj);
                        break;
                    case 19:
                        if (iB5 == hVar.f20839a) {
                            c cVarA = a(lp0Var);
                            sparseArray = hVar.f20843e;
                            cVar = cVarA;
                        } else if (iB5 == hVar.f20840b) {
                            c cVarA2 = a(lp0Var);
                            sparseArray = hVar.f20845g;
                            cVar = cVarA2;
                        }
                        i12 = cVar.f20818a;
                        obj = cVar;
                        sparseArray.put(i12, obj);
                        break;
                    case 20:
                        if (iB5 == hVar.f20839a) {
                            lp0Var.d(4);
                            boolean zF2 = lp0Var.f();
                            lp0Var.d(3);
                            int iB22 = lp0Var.b(16);
                            int iB23 = lp0Var.b(16);
                            if (zF2) {
                                int iB24 = lp0Var.b(16);
                                iB = lp0Var.b(16);
                                iB3 = lp0Var.b(16);
                                i13 = iB24;
                                iB2 = lp0Var.b(16);
                            } else {
                                iB = iB22;
                                iB2 = iB23;
                                i13 = 0;
                                iB3 = 0;
                            }
                            hVar.f20846h = new b(iB22, iB23, i13, iB, iB3, iB2);
                        }
                        break;
                }
                lp0Var.e(iD - lp0Var.d());
            }
        }
        h hVar2 = this.f20806f;
        d dVar4 = hVar2.f20847i;
        if (dVar4 == null) {
            return Collections.emptyList();
        }
        b bVar = hVar2.f20846h;
        if (bVar == null) {
            bVar = this.f20804d;
        }
        Bitmap bitmap = this.f20807g;
        if (bitmap == null || bVar.f20812a + 1 != bitmap.getWidth() || bVar.f20813b + 1 != this.f20807g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.f20812a + 1, bVar.f20813b + 1, Bitmap.Config.ARGB_8888);
            this.f20807g = bitmapCreateBitmap;
            this.f20803c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray5 = dVar4.f20824c;
        int i18 = 0;
        while (i18 < sparseArray5.size()) {
            this.f20803c.save();
            e eVarValueAt = sparseArray5.valueAt(i18);
            f fVar3 = this.f20806f.f20841c.get(sparseArray5.keyAt(i18));
            int i19 = eVarValueAt.f20825a + bVar.f20814c;
            int i20 = eVarValueAt.f20826b + bVar.f20816e;
            this.f20803c.clipRect(i19, i20, Math.min(fVar3.f20829c + i19, bVar.f20815d), Math.min(fVar3.f20830d + i20, bVar.f20817f));
            a aVar2 = this.f20806f.f20842d.get(fVar3.f20832f);
            if (aVar2 == null && (aVar2 = this.f20806f.f20844f.get(fVar3.f20832f)) == null) {
                aVar2 = this.f20805e;
            }
            SparseArray<g> sparseArray6 = fVar3.f20836j;
            int i21 = 0;
            while (i21 < sparseArray6.size()) {
                int iKeyAt = sparseArray6.keyAt(i21);
                g gVarValueAt = sparseArray6.valueAt(i21);
                c cVar2 = this.f20806f.f20843e.get(iKeyAt);
                if (cVar2 == null) {
                    cVar2 = this.f20806f.f20845g.get(iKeyAt);
                }
                if (cVar2 != null) {
                    Paint paint = cVar2.f20819b ? null : this.f20801a;
                    int i22 = fVar3.f20831e;
                    int i23 = gVarValueAt.f20837a + i19;
                    int i24 = gVarValueAt.f20838b + i20;
                    Canvas canvas = this.f20803c;
                    int[] iArr = i22 == 3 ? aVar2.f20811d : i22 == 2 ? aVar2.f20810c : aVar2.f20809b;
                    Paint paint2 = paint;
                    a(cVar2.f20820c, iArr, i22, i23, i24, paint2, canvas);
                    a(cVar2.f20821d, iArr, i22, i23, i24 + 1, paint2, canvas);
                }
                i21++;
                sparseArray5 = sparseArray5;
                sparseArray6 = sparseArray6;
                i18 = i18;
            }
            SparseArray<e> sparseArray7 = sparseArray5;
            int i25 = i18;
            if (fVar3.f20828b) {
                int i26 = fVar3.f20831e;
                if (i26 == 3) {
                    i11 = aVar2.f20811d[fVar3.f20833g];
                    c10 = 2;
                } else {
                    c10 = 2;
                    i11 = i26 == 2 ? aVar2.f20810c[fVar3.f20834h] : aVar2.f20809b[fVar3.f20835i];
                }
                this.f20802b.setColor(i11);
                this.f20803c.drawRect(i19, i20, fVar3.f20829c + i19, fVar3.f20830d + i20, this.f20802b);
            } else {
                c10 = 2;
            }
            arrayList.add(new am.a().a(Bitmap.createBitmap(this.f20807g, i19, i20, fVar3.f20829c, fVar3.f20830d)).b(i19 / bVar.f20812a).b(0).a(0, i20 / bVar.f20813b).a(0).d(fVar3.f20829c / bVar.f20812a).a(fVar3.f20830d / bVar.f20813b).a());
            this.f20803c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f20803c.restore();
            i18 = i25 + 1;
            sparseArray5 = sparseArray7;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final void d() {
        h hVar = this.f20806f;
        hVar.f20841c.clear();
        hVar.f20842d.clear();
        hVar.f20843e.clear();
        hVar.f20844f.clear();
        hVar.f20845g.clear();
        hVar.f20846h = null;
        hVar.f20847i = null;
    }
}
