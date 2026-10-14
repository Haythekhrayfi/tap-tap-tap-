package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f6152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f6153d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f6154e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.f6150a = i10;
            this.f6151b = i11;
            this.f6152c = jArr;
            this.f6153d = i12;
            this.f6154e = z10;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f6156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6157c;

        public b(String str, String[] strArr, int i10) {
            this.f6155a = str;
            this.f6156b = strArr;
            this.f6157c = i10;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f6158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f6161d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f6158a = z10;
            this.f6159b = i10;
            this.f6160c = i11;
            this.f6161d = i12;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f6165d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6166e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f6167f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f6168g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f6169h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f6170i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f6171j;

        public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f6162a = i10;
            this.f6163b = i11;
            this.f6164c = i12;
            this.f6165d = i13;
            this.f6166e = i14;
            this.f6167f = i15;
            this.f6168g = i16;
            this.f6169h = i17;
            this.f6170i = z10;
            this.f6171j = bArr;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long a(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    public static b a(com.applovin.exoplayer2.l.y yVar, boolean z10, boolean z11) throws ai {
        if (z10) {
            a(3, yVar, false);
        }
        String strF = yVar.f((int) yVar.p());
        int length = strF.length() + 11;
        long jP = yVar.p();
        String[] strArr = new String[(int) jP];
        int length2 = length + 4;
        for (int i10 = 0; i10 < jP; i10++) {
            strArr[i10] = yVar.f((int) yVar.p());
            length2 = length2 + 4 + strArr[i10].length();
        }
        if (z11 && (yVar.h() & 1) == 0) {
            throw ai.b("framing bit expected to be set", null);
        }
        return new b(strF, strArr, length2 + 1);
    }

    public static d a(com.applovin.exoplayer2.l.y yVar) throws ai {
        a(1, yVar, false);
        int iX = yVar.x();
        int iH = yVar.h();
        int iX2 = yVar.x();
        int iR = yVar.r();
        if (iR <= 0) {
            iR = -1;
        }
        int iR2 = yVar.r();
        if (iR2 <= 0) {
            iR2 = -1;
        }
        int iR3 = yVar.r();
        if (iR3 <= 0) {
            iR3 = -1;
        }
        int iH2 = yVar.h();
        return new d(iX, iH, iX2, iR, iR2, iR3, (int) Math.pow(2.0d, iH2 & 15), (int) Math.pow(2.0d, (iH2 & 240) >> 4), (yVar.h() & 1) > 0, Arrays.copyOf(yVar.d(), yVar.b()));
    }

    private static void a(int i10, y yVar) throws ai {
        int iA = yVar.a(6) + 1;
        for (int i11 = 0; i11 < iA; i11++) {
            int iA2 = yVar.a(16);
            if (iA2 != 0) {
                com.applovin.exoplayer2.l.q.d("VorbisUtil", "mapping type other than 0 not supported: " + iA2);
            } else {
                int iA3 = yVar.a() ? yVar.a(4) + 1 : 1;
                if (yVar.a()) {
                    int iA4 = yVar.a(8) + 1;
                    for (int i12 = 0; i12 < iA4; i12++) {
                        int i13 = i10 - 1;
                        yVar.b(a(i13));
                        yVar.b(a(i13));
                    }
                }
                if (yVar.a(2) != 0) {
                    throw ai.b("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iA3 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        yVar.b(4);
                    }
                }
                for (int i15 = 0; i15 < iA3; i15++) {
                    yVar.b(8);
                    yVar.b(8);
                    yVar.b(8);
                }
            }
        }
    }

    public static boolean a(int i10, com.applovin.exoplayer2.l.y yVar, boolean z10) throws ai {
        if (yVar.a() < 7) {
            if (z10) {
                return false;
            }
            StringBuilder sbA = defpackage.a.a("too short header: ");
            sbA.append(yVar.a());
            throw ai.b(sbA.toString(), null);
        }
        if (yVar.h() != i10) {
            if (z10) {
                return false;
            }
            StringBuilder sbA2 = defpackage.a.a("expected header type ");
            sbA2.append(Integer.toHexString(i10));
            throw ai.b(sbA2.toString(), null);
        }
        if (yVar.h() == 118 && yVar.h() == 111 && yVar.h() == 114 && yVar.h() == 98 && yVar.h() == 105 && yVar.h() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw ai.b("expected characters 'vorbis'", null);
    }

    private static c[] a(y yVar) {
        int iA = yVar.a(6) + 1;
        c[] cVarArr = new c[iA];
        for (int i10 = 0; i10 < iA; i10++) {
            cVarArr[i10] = new c(yVar.a(), yVar.a(16), yVar.a(16), yVar.a(8));
        }
        return cVarArr;
    }

    public static c[] a(com.applovin.exoplayer2.l.y yVar, int i10) throws ai {
        a(5, yVar, false);
        int iH = yVar.h() + 1;
        y yVar2 = new y(yVar.d());
        yVar2.b(yVar.c() * 8);
        for (int i11 = 0; i11 < iH; i11++) {
            d(yVar2);
        }
        int iA = yVar2.a(6) + 1;
        for (int i12 = 0; i12 < iA; i12++) {
            if (yVar2.a(16) != 0) {
                throw ai.b("placeholder of time domain transforms not zeroed out", null);
            }
        }
        c(yVar2);
        b(yVar2);
        a(i10, yVar2);
        c[] cVarArrA = a(yVar2);
        if (yVar2.a()) {
            return cVarArrA;
        }
        throw ai.b("framing bit after modes not set as expected", null);
    }

    public static b b(com.applovin.exoplayer2.l.y yVar) throws ai {
        return a(yVar, true, true);
    }

    private static void b(y yVar) throws ai {
        int iA = yVar.a(6) + 1;
        for (int i10 = 0; i10 < iA; i10++) {
            if (yVar.a(16) > 2) {
                throw ai.b("residueType greater than 2 is not decodable", null);
            }
            yVar.b(24);
            yVar.b(24);
            yVar.b(24);
            int iA2 = yVar.a(6) + 1;
            yVar.b(8);
            int[] iArr = new int[iA2];
            for (int i11 = 0; i11 < iA2; i11++) {
                iArr[i11] = ((yVar.a() ? yVar.a(5) : 0) * 8) + yVar.a(3);
            }
            for (int i12 = 0; i12 < iA2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        yVar.b(8);
                    }
                }
            }
        }
    }

    private static void c(y yVar) throws ai {
        int iA = yVar.a(6) + 1;
        for (int i10 = 0; i10 < iA; i10++) {
            int iA2 = yVar.a(16);
            if (iA2 == 0) {
                yVar.b(8);
                yVar.b(16);
                yVar.b(16);
                yVar.b(6);
                yVar.b(8);
                int iA3 = yVar.a(4) + 1;
                for (int i11 = 0; i11 < iA3; i11++) {
                    yVar.b(8);
                }
            } else {
                if (iA2 != 1) {
                    throw ai.b("floor type greater than 1 not decodable: " + iA2, null);
                }
                int iA4 = yVar.a(5);
                int i12 = -1;
                int[] iArr = new int[iA4];
                for (int i13 = 0; i13 < iA4; i13++) {
                    iArr[i13] = yVar.a(4);
                    if (iArr[i13] > i12) {
                        i12 = iArr[i13];
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = yVar.a(3) + 1;
                    int iA5 = yVar.a(2);
                    if (iA5 > 0) {
                        yVar.b(8);
                    }
                    for (int i16 = 0; i16 < (1 << iA5); i16++) {
                        yVar.b(8);
                    }
                }
                yVar.b(2);
                int iA6 = yVar.a(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < iA4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        yVar.b(iA6);
                        i18++;
                    }
                }
            }
        }
    }

    private static a d(y yVar) throws ai {
        if (yVar.a(24) != 5653314) {
            StringBuilder sbA = defpackage.a.a("expected code book to start with [0x56, 0x43, 0x42] at ");
            sbA.append(yVar.b());
            throw ai.b(sbA.toString(), null);
        }
        int iA = yVar.a(16);
        int iA2 = yVar.a(24);
        long[] jArr = new long[iA2];
        boolean zA = yVar.a();
        long jA = 0;
        if (zA) {
            int iA3 = yVar.a(5) + 1;
            int i10 = 0;
            while (i10 < iA2) {
                int iA4 = yVar.a(a(iA2 - i10));
                for (int i11 = 0; i11 < iA4 && i10 < iA2; i11++) {
                    jArr[i10] = iA3;
                    i10++;
                }
                iA3++;
            }
        } else {
            boolean zA2 = yVar.a();
            for (int i12 = 0; i12 < iA2; i12++) {
                if (!zA2) {
                    jArr[i12] = yVar.a(5) + 1;
                } else if (yVar.a()) {
                    jArr[i12] = yVar.a(5) + 1;
                } else {
                    jArr[i12] = 0;
                }
            }
        }
        int iA5 = yVar.a(4);
        if (iA5 > 2) {
            throw ai.b("lookup type greater than 2 not decodable: " + iA5, null);
        }
        if (iA5 == 1 || iA5 == 2) {
            yVar.b(32);
            yVar.b(32);
            int iA6 = yVar.a(4) + 1;
            yVar.b(1);
            if (iA5 != 1) {
                jA = ((long) iA2) * ((long) iA);
            } else if (iA != 0) {
                jA = a(iA2, iA);
            }
            yVar.b((int) (jA * ((long) iA6)));
        }
        return new a(iA, iA2, jArr, iA5, zA);
    }
}
