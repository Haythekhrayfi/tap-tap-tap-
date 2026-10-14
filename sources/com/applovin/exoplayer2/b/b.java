package com.applovin.exoplayer2.b;

import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f4388a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f4389b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f4390c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f4391d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f4392e = {32, 40, 48, 56, 64, 80, 96, 112, 128, SyslogConstants.LOG_LOCAL4, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f4393f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f4397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4398e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f4399f;

        private a(String str, int i10, int i11, int i12, int i13, int i14) {
            this.f4394a = str;
            this.f4395b = i10;
            this.f4397d = i11;
            this.f4396c = i12;
            this.f4398e = i13;
            this.f4399f = i14;
        }
    }

    private static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f4389b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f4393f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + iArr2[i12]) * 2;
        }
        int i14 = f4392e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f4388a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int a(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        return a((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    public static a a(com.applovin.exoplayer2.l.x xVar) {
        int iA;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int iC;
        int i14;
        int i15;
        int i16;
        int i17;
        int iB = xVar.b();
        xVar.b(40);
        boolean z10 = xVar.c(5) > 10;
        xVar.a(iB);
        int i18 = -1;
        if (z10) {
            xVar.b(16);
            int iC2 = xVar.c(2);
            if (iC2 == 0) {
                i18 = 0;
            } else if (iC2 == 1) {
                i18 = 1;
            } else if (iC2 == 2) {
                i18 = 2;
            }
            xVar.b(3);
            iA = (xVar.c(11) + 1) * 2;
            int iC3 = xVar.c(2);
            if (iC3 == 3) {
                i10 = f4390c[xVar.c(2)];
                i14 = 6;
                iC = 3;
            } else {
                iC = xVar.c(2);
                i14 = f4388a[iC];
                i10 = f4389b[iC3];
            }
            i11 = i14 * 256;
            int iC4 = xVar.c(3);
            boolean zE = xVar.e();
            i12 = f4391d[iC4] + (zE ? 1 : 0);
            xVar.b(10);
            if (xVar.e()) {
                xVar.b(8);
            }
            if (iC4 == 0) {
                xVar.b(5);
                if (xVar.e()) {
                    xVar.b(8);
                }
            }
            if (i18 == 1 && xVar.e()) {
                xVar.b(16);
            }
            if (xVar.e()) {
                if (iC4 > 2) {
                    xVar.b(2);
                }
                if ((iC4 & 1) == 0 || iC4 <= 2) {
                    i16 = 6;
                } else {
                    i16 = 6;
                    xVar.b(6);
                }
                if ((iC4 & 4) != 0) {
                    xVar.b(i16);
                }
                if (zE && xVar.e()) {
                    xVar.b(5);
                }
                if (i18 == 0) {
                    if (xVar.e()) {
                        i17 = 6;
                        xVar.b(6);
                    } else {
                        i17 = 6;
                    }
                    if (iC4 == 0 && xVar.e()) {
                        xVar.b(i17);
                    }
                    if (xVar.e()) {
                        xVar.b(i17);
                    }
                    int iC5 = xVar.c(2);
                    if (iC5 == 1) {
                        xVar.b(5);
                    } else if (iC5 == 2) {
                        xVar.b(12);
                    } else if (iC5 == 3) {
                        int iC6 = xVar.c(5);
                        if (xVar.e()) {
                            xVar.b(5);
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                if (xVar.e()) {
                                    xVar.b(4);
                                }
                                if (xVar.e()) {
                                    xVar.b(4);
                                }
                            }
                        }
                        if (xVar.e()) {
                            xVar.b(5);
                            if (xVar.e()) {
                                xVar.b(7);
                                if (xVar.e()) {
                                    xVar.b(8);
                                }
                            }
                        }
                        xVar.b((iC6 + 2) * 8);
                        xVar.f();
                    }
                    if (iC4 < 2) {
                        if (xVar.e()) {
                            xVar.b(14);
                        }
                        if (iC4 == 0 && xVar.e()) {
                            xVar.b(14);
                        }
                    }
                    if (xVar.e()) {
                        if (iC == 0) {
                            xVar.b(5);
                        } else {
                            for (int i19 = 0; i19 < i14; i19++) {
                                if (xVar.e()) {
                                    xVar.b(5);
                                }
                            }
                        }
                    }
                }
            }
            if (xVar.e()) {
                xVar.b(5);
                if (iC4 == 2) {
                    xVar.b(4);
                }
                if (iC4 >= 6) {
                    xVar.b(2);
                }
                if (xVar.e()) {
                    xVar.b(8);
                }
                if (iC4 == 0 && xVar.e()) {
                    xVar.b(8);
                }
                if (iC3 < 3) {
                    xVar.d();
                }
            }
            if (i18 == 0 && iC != 3) {
                xVar.d();
            }
            if (i18 == 2 && (iC == 3 || xVar.e())) {
                i15 = 6;
                xVar.b(6);
            } else {
                i15 = 6;
            }
            str = (xVar.e() && xVar.c(i15) == 1 && xVar.c(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = i18;
        } else {
            xVar.b(32);
            int iC7 = xVar.c(2);
            String str2 = iC7 == 3 ? null : "audio/ac3";
            iA = a(iC7, xVar.c(6));
            xVar.b(8);
            int iC8 = xVar.c(3);
            if ((iC8 & 1) != 0 && iC8 != 1) {
                xVar.b(2);
            }
            if ((iC8 & 4) != 0) {
                xVar.b(2);
            }
            if (iC8 == 2) {
                xVar.b(2);
            }
            int[] iArr = f4389b;
            i10 = iC7 < iArr.length ? iArr[iC7] : -1;
            i11 = 1536;
            i12 = f4391d[iC8] + (xVar.e() ? 1 : 0);
            i13 = -1;
            str = str2;
        }
        return new a(str, i13, i12, i10, iA, i11);
    }

    public static com.applovin.exoplayer2.v a(com.applovin.exoplayer2.l.y yVar, String str, String str2, com.applovin.exoplayer2.d.e eVar) {
        int i10 = f4389b[(yVar.h() & 192) >> 6];
        int iH = yVar.h();
        int i11 = f4391d[(iH & 56) >> 3];
        if ((iH & 4) != 0) {
            i11++;
        }
        return new com.applovin.exoplayer2.v.a().a(str).f("audio/ac3").k(i11).l(i10).a(eVar).c(str2).a();
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((ai.a(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    public static int b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    public static com.applovin.exoplayer2.v b(com.applovin.exoplayer2.l.y yVar, String str, String str2, com.applovin.exoplayer2.d.e eVar) {
        yVar.e(2);
        int i10 = f4389b[(yVar.h() & 192) >> 6];
        int iH = yVar.h();
        int i11 = f4391d[(iH & 14) >> 1];
        if ((iH & 1) != 0) {
            i11++;
        }
        if (((yVar.h() & 30) >> 1) > 0 && (2 & yVar.h()) != 0) {
            i11 += 2;
        }
        return new com.applovin.exoplayer2.v.a().a(str).f((yVar.a() <= 0 || (yVar.h() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").k(i11).l(i10).a(eVar).c(str2).a();
    }
}
