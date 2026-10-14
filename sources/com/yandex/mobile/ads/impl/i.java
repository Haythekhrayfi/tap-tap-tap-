package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.net.SyslogConstants;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f21536a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f21537b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f21538c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f21539d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f21540e = {32, 40, 48, 56, 64, 80, 96, 112, 128, SyslogConstants.LOG_LOCAL4, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f21541f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f21545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f21546e;

        private a(String str, int i10, int i11, int i12, int i13) {
            this.f21542a = str;
            this.f21544c = i10;
            this.f21543b = i11;
            this.f21545d = i12;
            this.f21546e = i13;
        }

        public /* synthetic */ a(String str, int i10, int i11, int i12, int i13, int i14) {
            this(str, i11, i12, i13, i14);
        }
    }

    private static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f21537b;
        if (i10 >= 3 || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f21541f;
        if (i12 >= 19) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + iArr2[i12]) * 2;
        }
        int i14 = f21540e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f21536a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return a((b10 & 192) >> 6, b10 & 63);
    }

    public static a a(lp0 lp0Var) {
        int iA;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int iB;
        int i14;
        int i15;
        int i16;
        int i17;
        int iE = lp0Var.e();
        lp0Var.d(40);
        boolean z10 = lp0Var.b(5) > 10;
        lp0Var.c(iE);
        int i18 = -1;
        if (z10) {
            lp0Var.d(16);
            int iB2 = lp0Var.b(2);
            if (iB2 == 0) {
                i18 = 0;
            } else if (iB2 == 1) {
                i18 = 1;
            } else if (iB2 == 2) {
                i18 = 2;
            }
            lp0Var.d(3);
            iA = (lp0Var.b(11) + 1) * 2;
            int iB3 = lp0Var.b(2);
            if (iB3 == 3) {
                i10 = f21538c[lp0Var.b(2)];
                i14 = 6;
                iB = 3;
            } else {
                iB = lp0Var.b(2);
                i14 = f21536a[iB];
                i10 = f21537b[iB3];
            }
            i11 = i14 * 256;
            int iB4 = lp0Var.b(3);
            boolean zF = lp0Var.f();
            i12 = f21539d[iB4] + (zF ? 1 : 0);
            lp0Var.d(10);
            if (lp0Var.f()) {
                lp0Var.d(8);
            }
            if (iB4 == 0) {
                lp0Var.d(5);
                if (lp0Var.f()) {
                    lp0Var.d(8);
                }
            }
            if (i18 == 1 && lp0Var.f()) {
                lp0Var.d(16);
            }
            if (lp0Var.f()) {
                if (iB4 > 2) {
                    lp0Var.d(2);
                }
                if ((iB4 & 1) == 0 || iB4 <= 2) {
                    i16 = 6;
                } else {
                    i16 = 6;
                    lp0Var.d(6);
                }
                if ((iB4 & 4) != 0) {
                    lp0Var.d(i16);
                }
                if (zF && lp0Var.f()) {
                    lp0Var.d(5);
                }
                if (i18 == 0) {
                    if (lp0Var.f()) {
                        i17 = 6;
                        lp0Var.d(6);
                    } else {
                        i17 = 6;
                    }
                    if (iB4 == 0 && lp0Var.f()) {
                        lp0Var.d(i17);
                    }
                    if (lp0Var.f()) {
                        lp0Var.d(i17);
                    }
                    int iB5 = lp0Var.b(2);
                    if (iB5 == 1) {
                        lp0Var.d(5);
                    } else if (iB5 == 2) {
                        lp0Var.d(12);
                    } else if (iB5 == 3) {
                        int iB6 = lp0Var.b(5);
                        if (lp0Var.f()) {
                            lp0Var.d(5);
                            if (lp0Var.f()) {
                                lp0Var.d(4);
                            }
                            if (lp0Var.f()) {
                                lp0Var.d(4);
                            }
                            if (lp0Var.f()) {
                                lp0Var.d(4);
                            }
                            if (lp0Var.f()) {
                                lp0Var.d(4);
                            }
                            if (lp0Var.f()) {
                                lp0Var.d(4);
                            }
                            if (lp0Var.f()) {
                                lp0Var.d(4);
                            }
                            if (lp0Var.f()) {
                                lp0Var.d(4);
                            }
                            if (lp0Var.f()) {
                                if (lp0Var.f()) {
                                    lp0Var.d(4);
                                }
                                if (lp0Var.f()) {
                                    lp0Var.d(4);
                                }
                            }
                        }
                        if (lp0Var.f()) {
                            lp0Var.d(5);
                            if (lp0Var.f()) {
                                lp0Var.d(7);
                                if (lp0Var.f()) {
                                    lp0Var.d(8);
                                }
                            }
                        }
                        lp0Var.d((iB6 + 2) * 8);
                        lp0Var.c();
                    }
                    if (iB4 < 2) {
                        if (lp0Var.f()) {
                            lp0Var.d(14);
                        }
                        if (iB4 == 0 && lp0Var.f()) {
                            lp0Var.d(14);
                        }
                    }
                    if (lp0Var.f()) {
                        if (iB == 0) {
                            lp0Var.d(5);
                        } else {
                            for (int i19 = 0; i19 < i14; i19++) {
                                if (lp0Var.f()) {
                                    lp0Var.d(5);
                                }
                            }
                        }
                    }
                }
            }
            if (lp0Var.f()) {
                lp0Var.d(5);
                if (iB4 == 2) {
                    lp0Var.d(4);
                }
                if (iB4 >= 6) {
                    lp0Var.d(2);
                }
                if (lp0Var.f()) {
                    lp0Var.d(8);
                }
                if (iB4 == 0 && lp0Var.f()) {
                    lp0Var.d(8);
                }
                if (iB3 < 3) {
                    lp0Var.h();
                }
            }
            if (i18 == 0 && iB != 3) {
                lp0Var.h();
            }
            if (i18 == 2 && (iB == 3 || lp0Var.f())) {
                i15 = 6;
                lp0Var.d(6);
            } else {
                i15 = 6;
            }
            str = (lp0Var.f() && lp0Var.b(i15) == 1 && lp0Var.b(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = i18;
        } else {
            lp0Var.d(32);
            int iB7 = lp0Var.b(2);
            String str2 = iB7 == 3 ? null : "audio/ac3";
            iA = a(iB7, lp0Var.b(6));
            lp0Var.d(8);
            int iB8 = lp0Var.b(3);
            if ((iB8 & 1) != 0 && iB8 != 1) {
                lp0Var.d(2);
            }
            if ((iB8 & 4) != 0) {
                lp0Var.d(2);
            }
            if (iB8 == 2) {
                lp0Var.d(2);
            }
            i10 = iB7 < 3 ? f21537b[iB7] : -1;
            i11 = 1536;
            i12 = f21539d[iB8] + (lp0Var.f() ? 1 : 0);
            i13 = -1;
            str = str2;
        }
        return new a(str, i13, i12, i10, iA, i11);
    }

    public static yv a(mp0 mp0Var, String str, String str2, DrmInitData drmInitData) {
        int i10 = f21537b[(mp0Var.t() & 192) >> 6];
        int iT = mp0Var.t();
        int i11 = f21539d[(iT & 56) >> 3];
        if ((iT & 4) != 0) {
            i11++;
        }
        return new yv.a().c(str).f("audio/ac3").c(i11).n(i10).a(drmInitData).e(str2).a();
    }

    public static yv b(mp0 mp0Var, String str, String str2, DrmInitData drmInitData) {
        mp0Var.f(2);
        int i10 = f21537b[(mp0Var.t() & 192) >> 6];
        int iT = mp0Var.t();
        int i11 = f21539d[(iT & 14) >> 1];
        if ((iT & 1) != 0) {
            i11++;
        }
        if (((mp0Var.t() & 30) >> 1) > 0 && (2 & mp0Var.t()) != 0) {
            i11 += 2;
        }
        return new yv.a().c(str).f((mp0Var.a() <= 0 || (mp0Var.t() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").c(i11).n(i10).a(drmInitData).e(str2).a();
    }
}
