package com.applovin.exoplayer2.g.e;

import com.applovin.exoplayer2.a.p;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class g extends com.applovin.exoplayer2.g.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6372a = p.f4007w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f6373b;

    public interface a {
        boolean evaluate(int i10, int i11, int i12, int i13, int i14);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f6375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6376c;

        public b(int i10, boolean z10, int i11) {
            this.f6374a = i10;
            this.f6375b = z10;
            this.f6376c = i11;
        }
    }

    public g() {
        this(null);
    }

    public g(a aVar) {
        this.f6373b = aVar;
    }

    private static int a(byte[] bArr, int i10, int i11) {
        int iB = b(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iB;
        }
        while (iB < bArr.length - 1) {
            if ((iB - i10) % 2 == 0 && bArr[iB + 1] == 0) {
                return iB;
            }
            iB = b(bArr, iB + 1);
        }
        return bArr.length;
    }

    private static com.applovin.exoplayer2.g.e.a a(y yVar, int i10, int i11) throws UnsupportedEncodingException {
        int iB;
        String strA;
        int iH = yVar.h();
        String strA2 = a(iH);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        yVar.a(bArr, 0, i12);
        if (i11 == 2) {
            StringBuilder sbA = defpackage.a.a("image/");
            sbA.append(Ascii.toLowerCase(new String(bArr, 0, 3, "ISO-8859-1")));
            strA = sbA.toString();
            if ("image/jpg".equals(strA)) {
                strA = "image/jpeg";
            }
            iB = 2;
        } else {
            iB = b(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, iB, "ISO-8859-1"));
            strA = lowerCase.indexOf(47) == -1 ? i.f.a("image/", lowerCase) : lowerCase;
        }
        int i13 = bArr[iB + 1] & 255;
        int i14 = iB + 2;
        int iA = a(bArr, i14, iH);
        return new com.applovin.exoplayer2.g.e.a(strA, new String(bArr, i14, iA - i14, strA2), i13, b(bArr, iA + b(iH), i12));
    }

    private static c a(y yVar, int i10, int i11, boolean z10, int i12, a aVar) throws UnsupportedEncodingException {
        int iC = yVar.c();
        int iB = b(yVar.d(), iC);
        String str = new String(yVar.d(), iC, iB - iC, "ISO-8859-1");
        yVar.d(iB + 1);
        int iQ = yVar.q();
        int iQ2 = yVar.q();
        long jO = yVar.o();
        long j10 = jO == 4294967295L ? -1L : jO;
        long jO2 = yVar.o();
        long j11 = jO2 == 4294967295L ? -1L : jO2;
        ArrayList arrayList = new ArrayList();
        int i13 = iC + i10;
        while (yVar.c() < i13) {
            h hVarA = a(i11, yVar, z10, i12, aVar);
            if (hVarA != null) {
                arrayList.add(hVarA);
            }
        }
        return new c(str, iQ, iQ2, j10, j11, (h[]) arrayList.toArray(new h[0]));
    }

    private static b a(y yVar) {
        StringBuilder sb2;
        String string;
        if (yVar.a() < 10) {
            string = "Data too short to be an ID3 tag";
        } else {
            int iM = yVar.m();
            boolean z10 = false;
            if (iM == 4801587) {
                int iH = yVar.h();
                yVar.e(1);
                int iH2 = yVar.h();
                int iV = yVar.v();
                if (iH == 2) {
                    if ((iH2 & 64) != 0) {
                        string = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (iH == 3) {
                    if ((iH2 & 64) != 0) {
                        int iQ = yVar.q();
                        yVar.e(iQ);
                        iV -= iQ + 4;
                    }
                } else if (iH == 4) {
                    if ((iH2 & 64) != 0) {
                        int iV2 = yVar.v();
                        yVar.e(iV2 - 4);
                        iV -= iV2;
                    }
                    if ((iH2 & 16) != 0) {
                        iV -= 10;
                    }
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("Skipped ID3 tag with unsupported majorVersion=");
                    sb2.append(iH);
                }
                if (iH < 4 && (iH2 & 128) != 0) {
                    z10 = true;
                }
                return new b(iH, z10, iV);
            }
            sb2 = defpackage.a.a("Unexpected first three bytes of ID3 tag header: 0x");
            sb2.append(String.format("%06X", Integer.valueOf(iM)));
            string = sb2.toString();
        }
        q.c("Id3Decoder", string);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0198  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x01db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ea A[Catch: all -> 0x012e, UnsupportedEncodingException -> 0x0218, Merged into TryCatch #1 {all -> 0x012e, UnsupportedEncodingException -> 0x0218, blocks: (B:91:0x011c, B:159:0x01f4, B:162:0x0218, B:93:0x0124, B:102:0x013d, B:104:0x0145, B:112:0x015f, B:121:0x0177, B:132:0x0192, B:139:0x01a4, B:145:0x01b3, B:150:0x01cb, B:156:0x01e5, B:157:0x01ea), top: B:169:0x0112 }] */
    private static h a(int i10, y yVar, boolean z10, int i11, a aVar) {
        int iW;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        h hVarC;
        int iH = yVar.h();
        int iH2 = yVar.h();
        int iH3 = yVar.h();
        int iH4 = i10 >= 3 ? yVar.h() : 0;
        if (i10 == 4) {
            iW = yVar.w();
            if (!z10) {
                iW = (((iW >> 24) & 255) << 21) | (iW & 255) | (((iW >> 8) & 255) << 7) | (((iW >> 16) & 255) << 14);
            }
        } else {
            iW = i10 == 3 ? yVar.w() : yVar.m();
        }
        int iG = iW;
        int i13 = i10 >= 3 ? yVar.i() : 0;
        if (iH == 0 && iH2 == 0 && iH3 == 0 && iH4 == 0 && iG == 0 && i13 == 0) {
            yVar.d(yVar.b());
            return null;
        }
        int iC = yVar.c() + iG;
        if (iC > yVar.b()) {
            q.c("Id3Decoder", "Frame size exceeds remaining tag data");
            yVar.d(yVar.b());
            return null;
        }
        if (aVar != null) {
            i12 = iC;
            if (!aVar.evaluate(i10, iH, iH2, iH3, iH4)) {
                yVar.d(i12);
                return null;
            }
        } else {
            i12 = iC;
        }
        if (i10 == 3) {
            int i14 = i13;
            z12 = (i14 & 128) != 0;
            z13 = (i14 & 64) != 0;
            z11 = (i14 & 32) != 0;
            z15 = z12;
            z14 = false;
        } else {
            int i15 = i13;
            if (i10 == 4) {
                boolean z16 = (i15 & 64) != 0;
                boolean z17 = (i15 & 8) != 0;
                boolean z18 = (i15 & 4) != 0;
                z14 = (i15 & 2) != 0;
                boolean z19 = (i15 & 1) != 0;
                z11 = z16;
                z12 = z19;
                z15 = z17;
                z13 = z18;
            } else {
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
                z15 = false;
            }
        }
        if (z15 || z13) {
            q.c(r4, "Skipping unsupported compressed or encrypted frame");
            yVar.d(i12);
            return null;
        }
        if (z11) {
            iG--;
            yVar.e(1);
        }
        if (z12) {
            iG -= 4;
            yVar.e(4);
        }
        if (z14) {
            iG = g(yVar, iG);
        }
        try {
            if (iH == 84 && iH2 == 88 && iH3 == 88 && (i10 == 2 || iH4 == 88)) {
                hVarC = a(yVar, iG);
            } else if (iH == 84) {
                hVarC = a(yVar, iG, a(i10, iH, iH2, iH3, iH4));
            } else if (iH == 87 && iH2 == 88 && iH3 == 88 && (i10 == 2 || iH4 == 88)) {
                hVarC = b(yVar, iG);
            } else if (iH == 87) {
                hVarC = b(yVar, iG, a(i10, iH, iH2, iH3, iH4));
            } else if (iH == 80 && iH2 == 82 && iH3 == 73 && iH4 == 86) {
                hVarC = c(yVar, iG);
            } else if (iH == 71 && iH2 == 69 && iH3 == 79 && (iH4 == 66 || i10 == 2)) {
                hVarC = d(yVar, iG);
            } else if (i10 == 2) {
                if (iH == 80 && iH2 == 73 && iH3 == 67) {
                    hVarC = a(yVar, iG, i10);
                } else if (iH != 67 && iH2 == 79 && iH3 == 77 && (iH4 == 77 || i10 == 2)) {
                    hVarC = e(yVar, iG);
                } else if (iH != 67 && iH2 == 72 && iH3 == 65 && iH4 == 80) {
                    hVarC = a(yVar, iG, i10, z10, i11, aVar);
                } else if (iH != 67 && iH2 == 84 && iH3 == 79 && iH4 == 67) {
                    hVarC = b(yVar, iG, i10, z10, i11, aVar);
                } else if (iH != 77 && iH2 == 76 && iH3 == 76 && iH4 == 84) {
                    hVarC = f(yVar, iG);
                } else {
                    hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
                }
            } else if (iH == 65 && iH2 == 80 && iH3 == 73 && iH4 == 67) {
                hVarC = a(yVar, iG, i10);
            } else if (iH != 67) {
                if (iH != 67) {
                    if (iH != 67) {
                        if (iH != 77) {
                            hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
                        } else {
                            hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
                        }
                    } else if (iH != 77) {
                        hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
                    } else {
                        hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
                    }
                } else if (iH != 67) {
                    if (iH != 77) {
                        hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
                    } else {
                        hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
                    }
                } else if (iH != 77) {
                    hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
                } else {
                    hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
                }
            } else if (iH != 67) {
                if (iH != 67) {
                    if (iH != 77) {
                        hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
                    } else {
                        hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
                    }
                } else if (iH != 77) {
                    hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
                } else {
                    hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
                }
            } else if (iH != 67) {
                if (iH != 77) {
                    hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
                } else {
                    hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
                }
            } else if (iH != 77) {
                hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
            } else {
                hVarC = c(yVar, iG, a(i10, iH, iH2, iH3, iH4));
            }
            if (hVarC == null) {
                q.c("Id3Decoder", "Failed to decode frame: id=" + a(i10, iH, iH2, iH3, iH4) + ", frameSize=" + iG);
            }
            yVar.d(i12);
            return hVarC;
        } catch (UnsupportedEncodingException unused) {
            q.c(r4, "Unsupported character encoding");
            return null;
        } finally {
            yVar.d(i12);
        }
    }

    private static l a(y yVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iH = yVar.h();
        String strA = a(iH);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        yVar.a(bArr, 0, i11);
        int iA = a(bArr, 0, iH);
        String str = new String(bArr, 0, iA, strA);
        int iB = iA + b(iH);
        return new l("TXXX", str, a(bArr, iB, a(bArr, iB, iH), strA));
    }

    private static l a(y yVar, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iH = yVar.h();
        String strA = a(iH);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        yVar.a(bArr, 0, i11);
        return new l(str, null, new String(bArr, 0, a(bArr, 0, iH), strA));
    }

    private static String a(int i10) {
        if (i10 == 1) {
            return "UTF-16";
        }
        if (i10 != 2) {
            return i10 != 3 ? "ISO-8859-1" : "UTF-8";
        }
        return "UTF-16BE";
    }

    private static String a(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static String a(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0079 A[PHI: r3
  0x0079: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:40:0x0086, B:31:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean a(y yVar, int i10, int i11, boolean z10) {
        int iM;
        long jM;
        int i12;
        int i13;
        int iC = yVar.c();
        while (true) {
            try {
                boolean z11 = true;
                if (yVar.a() < i11) {
                    yVar.d(iC);
                    return true;
                }
                if (i10 >= 3) {
                    iM = yVar.q();
                    jM = yVar.o();
                    i12 = yVar.i();
                } else {
                    iM = yVar.m();
                    jM = yVar.m();
                    i12 = 0;
                }
                if (iM == 0 && jM == 0 && i12 == 0) {
                    yVar.d(iC);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jM) != 0) {
                        yVar.d(iC);
                        return false;
                    }
                    jM = (((jM >> 24) & 255) << 21) | (jM & 255) | (((jM >> 8) & 255) << 7) | (((jM >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i13 = (i12 & 64) != 0 ? 1 : 0;
                    if ((i12 & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i13 = (i12 & 32) != 0 ? 1 : 0;
                    if ((i12 & 128) == 0) {
                        z11 = false;
                    }
                } else {
                    i13 = 0;
                    z11 = false;
                }
                if (z11) {
                    i13 += 4;
                }
                if (jM < i13) {
                    yVar.d(iC);
                    return false;
                }
                if (yVar.a() < jM) {
                    yVar.d(iC);
                    return false;
                }
                yVar.e((int) jM);
            } catch (Throwable th) {
                yVar.d(iC);
                throw th;
            }
        }
    }

    private static int b(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static int b(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    private static d b(y yVar, int i10, int i11, boolean z10, int i12, a aVar) throws UnsupportedEncodingException {
        int iC = yVar.c();
        int iB = b(yVar.d(), iC);
        String str = new String(yVar.d(), iC, iB - iC, "ISO-8859-1");
        yVar.d(iB + 1);
        int iH = yVar.h();
        boolean z11 = (iH & 2) != 0;
        boolean z12 = (iH & 1) != 0;
        int iH2 = yVar.h();
        String[] strArr = new String[iH2];
        for (int i13 = 0; i13 < iH2; i13++) {
            int iC2 = yVar.c();
            int iB2 = b(yVar.d(), iC2);
            strArr[i13] = new String(yVar.d(), iC2, iB2 - iC2, "ISO-8859-1");
            yVar.d(iB2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iC + i10;
        while (yVar.c() < i14) {
            h hVarA = a(i11, yVar, z10, i12, aVar);
            if (hVarA != null) {
                arrayList.add(hVarA);
            }
        }
        return new d(str, z11, z12, strArr, (h[]) arrayList.toArray(new h[0]));
    }

    private static m b(y yVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iH = yVar.h();
        String strA = a(iH);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        yVar.a(bArr, 0, i11);
        int iA = a(bArr, 0, iH);
        String str = new String(bArr, 0, iA, strA);
        int iB = iA + b(iH);
        return new m("WXXX", str, a(bArr, iB, b(bArr, iB), "ISO-8859-1"));
    }

    private static m b(y yVar, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        yVar.a(bArr, 0, i10);
        return new m(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static byte[] b(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? ai.f7600f : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static com.applovin.exoplayer2.g.e.b c(y yVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        yVar.a(bArr, 0, i10);
        return new com.applovin.exoplayer2.g.e.b(str, bArr);
    }

    private static k c(y yVar, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        yVar.a(bArr, 0, i10);
        int iB = b(bArr, 0);
        return new k(new String(bArr, 0, iB, "ISO-8859-1"), b(bArr, iB + 1, i10));
    }

    private static f d(y yVar, int i10) throws UnsupportedEncodingException {
        int iH = yVar.h();
        String strA = a(iH);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        yVar.a(bArr, 0, i11);
        int iB = b(bArr, 0);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i12 = iB + 1;
        int iA = a(bArr, i12, iH);
        String strA2 = a(bArr, i12, iA, strA);
        int iB2 = iA + b(iH);
        int iA2 = a(bArr, iB2, iH);
        return new f(str, strA2, a(bArr, iB2, iA2, strA), b(bArr, iA2 + b(iH), i11));
    }

    private static e e(y yVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int iH = yVar.h();
        String strA = a(iH);
        byte[] bArr = new byte[3];
        yVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        yVar.a(bArr2, 0, i11);
        int iA = a(bArr2, 0, iH);
        String str2 = new String(bArr2, 0, iA, strA);
        int iB = iA + b(iH);
        return new e(str, str2, a(bArr2, iB, a(bArr2, iB, iH), strA));
    }

    private static j f(y yVar, int i10) {
        int i11 = yVar.i();
        int iM = yVar.m();
        int iM2 = yVar.m();
        int iH = yVar.h();
        int iH2 = yVar.h();
        x xVar = new x();
        xVar.a(yVar);
        int i12 = ((i10 - 10) * 8) / (iH + iH2);
        int[] iArr = new int[i12];
        int[] iArr2 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int iC = xVar.c(iH);
            int iC2 = xVar.c(iH2);
            iArr[i13] = iC;
            iArr2[i13] = iC2;
        }
        return new j(i11, iM, iM2, iArr, iArr2);
    }

    private static int g(y yVar, int i10) {
        byte[] bArrD = yVar.d();
        int iC = yVar.c();
        int i11 = iC;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iC + i10) {
                return i10;
            }
            if ((bArrD[i11] & 255) == 255 && bArrD[i12] == 0) {
                System.arraycopy(bArrD, i11 + 2, bArrD, i12, (i10 - (i11 - iC)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    @Override // com.applovin.exoplayer2.g.g
    public com.applovin.exoplayer2.g.a a(com.applovin.exoplayer2.g.d dVar, ByteBuffer byteBuffer) {
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    public com.applovin.exoplayer2.g.a a(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        y yVar = new y(bArr, i10);
        b bVarA = a(yVar);
        if (bVarA == null) {
            return null;
        }
        int iC = yVar.c();
        int i11 = bVarA.f6374a == 2 ? 6 : 10;
        int iG = bVarA.f6376c;
        if (bVarA.f6375b) {
            iG = g(yVar, bVarA.f6376c);
        }
        yVar.c(iC + iG);
        boolean z10 = false;
        if (!a(yVar, bVarA.f6374a, i11, false)) {
            if (bVarA.f6374a != 4 || !a(yVar, 4, i11, true)) {
                StringBuilder sbA = defpackage.a.a("Failed to validate ID3 tag with majorVersion=");
                sbA.append(bVarA.f6374a);
                q.c("Id3Decoder", sbA.toString());
                return null;
            }
            z10 = true;
        }
        while (yVar.a() >= i11) {
            h hVarA = a(bVarA.f6374a, yVar, z10, i11, this.f6373b);
            if (hVarA != null) {
                arrayList.add(hVarA);
            }
        }
        return new com.applovin.exoplayer2.g.a(arrayList);
    }
}
