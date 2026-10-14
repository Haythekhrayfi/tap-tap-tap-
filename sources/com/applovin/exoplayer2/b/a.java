package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.ai;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f4380a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f4381b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: com.applovin.exoplayer2.b.a$a, reason: collision with other inner class name */
    public static final class C0073a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f4384c;

        private C0073a(int i10, int i11, String str) {
            this.f4382a = i10;
            this.f4383b = i11;
            this.f4384c = str;
        }
    }

    private static int a(com.applovin.exoplayer2.l.x xVar) {
        int iC = xVar.c(5);
        return iC == 31 ? xVar.c(6) + 32 : iC;
    }

    public static C0073a a(com.applovin.exoplayer2.l.x xVar, boolean z10) throws ai {
        int iA = a(xVar);
        int iB = b(xVar);
        int iC = xVar.c(4);
        String strA = android.support.v4.media.a.a("mp4a.40.", iA);
        if (iA == 5 || iA == 29) {
            iB = b(xVar);
            iA = a(xVar);
            if (iA == 22) {
                iC = xVar.c(4);
            }
        }
        if (z10) {
            if (iA != 1 && iA != 2 && iA != 3 && iA != 4 && iA != 6 && iA != 7 && iA != 17) {
                switch (iA) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ai.a("Unsupported audio object type: " + iA);
                }
            }
            a(xVar, iA, iC);
            switch (iA) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iC2 = xVar.c(2);
                    if (iC2 == 2 || iC2 == 3) {
                        throw ai.a("Unsupported epConfig: " + iC2);
                    }
                    break;
            }
        }
        int i10 = f4381b[iC];
        if (i10 != -1) {
            return new C0073a(iB, i10, strA);
        }
        throw ai.b(null, null);
    }

    public static C0073a a(byte[] bArr) throws ai {
        return a(new com.applovin.exoplayer2.l.x(bArr), false);
    }

    private static void a(com.applovin.exoplayer2.l.x xVar, int i10, int i11) {
        if (xVar.e()) {
            com.applovin.exoplayer2.l.q.c("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (xVar.e()) {
            xVar.b(14);
        }
        boolean zE = xVar.e();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            xVar.b(3);
        }
        if (zE) {
            if (i10 == 22) {
                xVar.b(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                xVar.b(3);
            }
            xVar.b(1);
        }
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    private static int b(com.applovin.exoplayer2.l.x xVar) throws ai {
        int iC = xVar.c(4);
        if (iC == 15) {
            return xVar.c(24);
        }
        if (iC < 13) {
            return f4380a[iC];
        }
        throw ai.b(null, null);
    }
}
