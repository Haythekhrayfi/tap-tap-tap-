package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.id3.ApicFrame;
import com.yandex.mobile.ads.exo.metadata.id3.BinaryFrame;
import com.yandex.mobile.ads.exo.metadata.id3.ChapterFrame;
import com.yandex.mobile.ads.exo.metadata.id3.ChapterTocFrame;
import com.yandex.mobile.ads.exo.metadata.id3.CommentFrame;
import com.yandex.mobile.ads.exo.metadata.id3.GeobFrame;
import com.yandex.mobile.ads.exo.metadata.id3.Id3Frame;
import com.yandex.mobile.ads.exo.metadata.id3.MlltFrame;
import com.yandex.mobile.ads.exo.metadata.id3.PrivFrame;
import com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame;
import com.yandex.mobile.ads.exo.metadata.id3.UrlLinkFrame;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class n10 extends r11 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f23196b = yn1.f26961u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f23197a;

    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f23199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23200c;

        public b(int i10, int i11, boolean z10) {
            this.f23198a = i10;
            this.f23199b = z10;
            this.f23200c = i11;
        }
    }

    public n10(a aVar) {
        this.f23197a = aVar;
    }

    private static int a(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static int a(byte[] bArr, int i10, int i11) {
        int iB = b(i10, bArr);
        if (i11 == 0 || i11 == 3) {
            return iB;
        }
        while (iB < bArr.length - 1) {
            if ((iB - i10) % 2 == 0 && bArr[iB + 1] == 0) {
                return iB;
            }
            iB = b(iB + 1, bArr);
        }
        return bArr.length;
    }

    private static ApicFrame a(int i10, int i11, mp0 mp0Var) throws UnsupportedEncodingException {
        int iB;
        String strA;
        int iT = mp0Var.t();
        String strB = b(iT);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        mp0Var.a(bArr, 0, i12);
        if (i11 == 2) {
            StringBuilder sbA = v60.a("image/");
            sbA.append(na.b(new String(bArr, 0, 3, "ISO-8859-1")));
            String string = sbA.toString();
            if ("image/jpg".equals(string)) {
                string = "image/jpeg";
            }
            strA = string;
            iB = 2;
        } else {
            iB = b(0, bArr);
            String strB2 = na.b(new String(bArr, 0, iB, "ISO-8859-1"));
            strA = strB2.indexOf(47) == -1 ? fn1.a("image/", strB2) : strB2;
        }
        int i13 = bArr[iB + 1] & 255;
        int i14 = iB + 2;
        int iA = a(bArr, i14, iT);
        String str = new String(bArr, i14, iA - i14, strB);
        int iA2 = iA + a(iT);
        return new ApicFrame(strA, str, i13, i12 <= iA2 ? da1.f19808f : Arrays.copyOfRange(bArr, iA2, i12));
    }

    private static ChapterFrame a(mp0 mp0Var, int i10, int i11, boolean z10, int i12, a aVar) throws UnsupportedEncodingException {
        int iD = mp0Var.d();
        int iB = b(iD, mp0Var.c());
        String str = new String(mp0Var.c(), iD, iB - iD, "ISO-8859-1");
        mp0Var.e(iB + 1);
        int iH = mp0Var.h();
        int iH2 = mp0Var.h();
        long jV = mp0Var.v();
        long j10 = jV == 4294967295L ? -1L : jV;
        long jV2 = mp0Var.v();
        long j11 = jV2 == 4294967295L ? -1L : jV2;
        ArrayList arrayList = new ArrayList();
        int i13 = iD + i10;
        while (mp0Var.d() < i13) {
            Id3Frame id3FrameA = a(i11, mp0Var, z10, i12, aVar);
            if (id3FrameA != null) {
                arrayList.add(id3FrameA);
            }
        }
        return new ChapterFrame(str, iH, iH2, j10, j11, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static CommentFrame a(int i10, mp0 mp0Var) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int iT = mp0Var.t();
        String strB = b(iT);
        byte[] bArr = new byte[3];
        mp0Var.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        mp0Var.a(bArr2, 0, i11);
        int iA = a(bArr2, 0, iT);
        String str2 = new String(bArr2, 0, iA, strB);
        int iA2 = iA + a(iT);
        int iA3 = a(bArr2, iA2, iT);
        return new CommentFrame(str, str2, (iA3 <= iA2 || iA3 > i11) ? "" : new String(bArr2, iA2, iA3 - iA2, strB));
    }

    /* JADX WARN: Code duplicated, block: B:141:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x01e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x01fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0200  */
    /* JADX WARN: Code duplicated, block: B:165:0x020d A[Catch: all -> 0x014d, UnsupportedEncodingException -> 0x0150, TryCatch #1 {UnsupportedEncodingException -> 0x0150, blocks: (B:98:0x013b, B:167:0x021f, B:100:0x0143, B:110:0x0160, B:112:0x0168, B:120:0x0182, B:129:0x019a, B:140:0x01b5, B:147:0x01c7, B:153:0x01d6, B:158:0x01ee, B:164:0x0208, B:165:0x020d), top: B:182:0x0131 }] */
    private static Id3Frame a(int i10, mp0 mp0Var, boolean z10, int i11, a aVar) {
        int iX;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String str;
        Id3Frame binaryFrame;
        int iT = mp0Var.t();
        int iT2 = mp0Var.t();
        int iT3 = mp0Var.t();
        int iT4 = i10 >= 3 ? mp0Var.t() : 0;
        if (i10 == 4) {
            iX = mp0Var.x();
            if (!z10) {
                iX = (((iX >> 24) & 255) << 21) | (iX & 255) | (((iX >> 8) & 255) << 7) | (((iX >> 16) & 255) << 14);
            }
        } else {
            iX = i10 == 3 ? mp0Var.x() : mp0Var.w();
        }
        int i13 = iX;
        int iZ = i10 >= 3 ? mp0Var.z() : 0;
        if (iT == 0 && iT2 == 0 && iT3 == 0 && iT4 == 0 && i13 == 0 && iZ == 0) {
            mp0Var.e(mp0Var.e());
            return null;
        }
        int iD = mp0Var.d() + i13;
        if (iD > mp0Var.e()) {
            p90.d("Id3Decoder", "Frame size exceeds remaining tag data");
            mp0Var.e(mp0Var.e());
            return null;
        }
        if (aVar != null) {
            i12 = iD;
            if (!aVar.a(i10, iT, iT2, iT3, iT4)) {
                mp0Var.e(i12);
                return null;
            }
        } else {
            i12 = iD;
        }
        if (i10 == 3) {
            z11 = (iZ & 128) != 0;
            boolean z16 = (iZ & 64) != 0;
            z14 = (iZ & 32) != 0;
            z15 = false;
            z13 = z16;
            z12 = z11;
        } else if (i10 == 4) {
            boolean z17 = (iZ & 64) != 0;
            z11 = (iZ & 8) != 0;
            boolean z18 = (iZ & 4) != 0;
            boolean z19 = (iZ & 2) != 0;
            if ((iZ & 1) != 0) {
                z15 = z19;
                z14 = z17;
                z13 = z18;
                z12 = true;
            } else {
                z15 = z19;
                z14 = z17;
                z13 = z18;
                z12 = false;
            }
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
        }
        if (z11 || z13) {
            p90.d("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            mp0Var.e(i12);
            return null;
        }
        if (z14) {
            i13--;
            mp0Var.f(1);
        }
        if (z12) {
            i13 -= 4;
            mp0Var.f(4);
        }
        if (z15) {
            byte[] bArrC = mp0Var.c();
            int iD2 = mp0Var.d();
            int i14 = iD2;
            while (true) {
                int i15 = i14 + 1;
                if (i15 >= iD2 + i13) {
                    break;
                }
                if ((bArrC[i14] & 255) == 255 && bArrC[i15] == 0) {
                    System.arraycopy(bArrC, i14 + 2, bArrC, i15, (i13 - (i14 - iD2)) - 2);
                    i13--;
                }
                i14 = i15;
            }
        }
        int i16 = i13;
        try {
            try {
                if (iT == 84 && iT2 == 88 && iT3 == 88 && (i10 == 2 || iT4 == 88)) {
                    binaryFrame = e(i16, mp0Var);
                } else if (iT == 84) {
                    binaryFrame = a(i16, mp0Var, a(i10, iT, iT2, iT3, iT4));
                } else if (iT == 87 && iT2 == 88 && iT3 == 88 && (i10 == 2 || iT4 == 88)) {
                    binaryFrame = f(i16, mp0Var);
                } else if (iT == 87) {
                    binaryFrame = b(i16, mp0Var, a(i10, iT, iT2, iT3, iT4));
                } else if (iT == 80 && iT2 == 82 && iT3 == 73 && iT4 == 86) {
                    binaryFrame = d(i16, mp0Var);
                } else if (iT == 71 && iT2 == 69 && iT3 == 79 && (iT4 == 66 || i10 == 2)) {
                    binaryFrame = b(i16, mp0Var);
                } else if (i10 == 2) {
                    if (iT == 80 && iT2 == 73 && iT3 == 67) {
                        binaryFrame = a(i16, i10, mp0Var);
                    } else if (iT != 67 && iT2 == 79 && iT3 == 77 && (iT4 == 77 || i10 == 2)) {
                        binaryFrame = a(i16, mp0Var);
                    } else if (iT != 67 && iT2 == 72 && iT3 == 65 && iT4 == 80) {
                        binaryFrame = a(mp0Var, i16, i10, z10, i11, aVar);
                    } else if (iT != 67 && iT2 == 84 && iT3 == 79 && iT4 == 67) {
                        binaryFrame = b(mp0Var, i16, i10, z10, i11, aVar);
                    } else if (iT != 77 && iT2 == 76 && iT3 == 76 && iT4 == 84) {
                        binaryFrame = c(i16, mp0Var);
                    } else {
                        String strA = a(i10, iT, iT2, iT3, iT4);
                        byte[] bArr = new byte[i16];
                        mp0Var.a(bArr, 0, i16);
                        binaryFrame = new BinaryFrame(strA, bArr);
                    }
                } else if (iT == 65 && iT2 == 80 && iT3 == 73 && iT4 == 67) {
                    binaryFrame = a(i16, i10, mp0Var);
                } else if (iT != 67) {
                    if (iT != 67) {
                        if (iT != 67) {
                            if (iT != 77) {
                                String strA2 = a(i10, iT, iT2, iT3, iT4);
                                byte[] bArr2 = new byte[i16];
                                mp0Var.a(bArr2, 0, i16);
                                binaryFrame = new BinaryFrame(strA2, bArr2);
                            } else {
                                String strA3 = a(i10, iT, iT2, iT3, iT4);
                                byte[] bArr3 = new byte[i16];
                                mp0Var.a(bArr3, 0, i16);
                                binaryFrame = new BinaryFrame(strA3, bArr3);
                            }
                        } else if (iT != 77) {
                            String strA4 = a(i10, iT, iT2, iT3, iT4);
                            byte[] bArr4 = new byte[i16];
                            mp0Var.a(bArr4, 0, i16);
                            binaryFrame = new BinaryFrame(strA4, bArr4);
                        } else {
                            String strA5 = a(i10, iT, iT2, iT3, iT4);
                            byte[] bArr5 = new byte[i16];
                            mp0Var.a(bArr5, 0, i16);
                            binaryFrame = new BinaryFrame(strA5, bArr5);
                        }
                    } else if (iT != 67) {
                        if (iT != 77) {
                            String strA6 = a(i10, iT, iT2, iT3, iT4);
                            byte[] bArr6 = new byte[i16];
                            mp0Var.a(bArr6, 0, i16);
                            binaryFrame = new BinaryFrame(strA6, bArr6);
                        } else {
                            String strA7 = a(i10, iT, iT2, iT3, iT4);
                            byte[] bArr7 = new byte[i16];
                            mp0Var.a(bArr7, 0, i16);
                            binaryFrame = new BinaryFrame(strA7, bArr7);
                        }
                    } else if (iT != 77) {
                        String strA8 = a(i10, iT, iT2, iT3, iT4);
                        byte[] bArr8 = new byte[i16];
                        mp0Var.a(bArr8, 0, i16);
                        binaryFrame = new BinaryFrame(strA8, bArr8);
                    } else {
                        String strA9 = a(i10, iT, iT2, iT3, iT4);
                        byte[] bArr9 = new byte[i16];
                        mp0Var.a(bArr9, 0, i16);
                        binaryFrame = new BinaryFrame(strA9, bArr9);
                    }
                } else if (iT != 67) {
                    if (iT != 67) {
                        if (iT != 77) {
                            String strA10 = a(i10, iT, iT2, iT3, iT4);
                            byte[] bArr10 = new byte[i16];
                            mp0Var.a(bArr10, 0, i16);
                            binaryFrame = new BinaryFrame(strA10, bArr10);
                        } else {
                            String strA11 = a(i10, iT, iT2, iT3, iT4);
                            byte[] bArr11 = new byte[i16];
                            mp0Var.a(bArr11, 0, i16);
                            binaryFrame = new BinaryFrame(strA11, bArr11);
                        }
                    } else if (iT != 77) {
                        String strA12 = a(i10, iT, iT2, iT3, iT4);
                        byte[] bArr12 = new byte[i16];
                        mp0Var.a(bArr12, 0, i16);
                        binaryFrame = new BinaryFrame(strA12, bArr12);
                    } else {
                        String strA13 = a(i10, iT, iT2, iT3, iT4);
                        byte[] bArr13 = new byte[i16];
                        mp0Var.a(bArr13, 0, i16);
                        binaryFrame = new BinaryFrame(strA13, bArr13);
                    }
                } else if (iT != 67) {
                    if (iT != 77) {
                        String strA14 = a(i10, iT, iT2, iT3, iT4);
                        byte[] bArr14 = new byte[i16];
                        mp0Var.a(bArr14, 0, i16);
                        binaryFrame = new BinaryFrame(strA14, bArr14);
                    } else {
                        String strA15 = a(i10, iT, iT2, iT3, iT4);
                        byte[] bArr15 = new byte[i16];
                        mp0Var.a(bArr15, 0, i16);
                        binaryFrame = new BinaryFrame(strA15, bArr15);
                    }
                } else if (iT != 77) {
                    String strA16 = a(i10, iT, iT2, iT3, iT4);
                    byte[] bArr16 = new byte[i16];
                    mp0Var.a(bArr16, 0, i16);
                    binaryFrame = new BinaryFrame(strA16, bArr16);
                } else {
                    String strA17 = a(i10, iT, iT2, iT3, iT4);
                    byte[] bArr17 = new byte[i16];
                    mp0Var.a(bArr17, 0, i16);
                    binaryFrame = new BinaryFrame(strA17, bArr17);
                }
                if (binaryFrame == null) {
                    str = r4;
                    try {
                        p90.d(str, "Failed to decode frame: id=" + a(i10, iT, iT2, iT3, iT4) + ", frameSize=" + i16);
                    } catch (UnsupportedEncodingException unused) {
                        p90.d(str, "Unsupported character encoding");
                        mp0Var.e(i12);
                        return null;
                    }
                }
                mp0Var.e(i12);
                return binaryFrame;
            } catch (UnsupportedEncodingException unused2) {
                str = r4;
            }
        } catch (Throwable th) {
            mp0Var.e(i12);
            throw th;
        }
    }

    private static TextInformationFrame a(int i10, mp0 mp0Var, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iT = mp0Var.t();
        String strB = b(iT);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        mp0Var.a(bArr, 0, i11);
        return new TextInformationFrame(str, null, new String(bArr, 0, a(bArr, 0, iT), strB));
    }

    private static String a(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0087 A[PHI: r3
  0x0087: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:39:0x0084, B:31:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean a(mp0 mp0Var, int i10, int i11, boolean z10) {
        int iW;
        long jW;
        int iZ;
        int i12;
        int iD = mp0Var.d();
        while (true) {
            try {
                boolean z11 = true;
                if (mp0Var.a() < i11) {
                    mp0Var.e(iD);
                    return true;
                }
                if (i10 >= 3) {
                    iW = mp0Var.h();
                    jW = mp0Var.v();
                    iZ = mp0Var.z();
                } else {
                    iW = mp0Var.w();
                    jW = mp0Var.w();
                    iZ = 0;
                }
                if (iW == 0 && jW == 0 && iZ == 0) {
                    mp0Var.e(iD);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jW) != 0) {
                        mp0Var.e(iD);
                        return false;
                    }
                    jW = (((jW >> 24) & 255) << 21) | (jW & 255) | (((jW >> 8) & 255) << 7) | (((jW >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iZ & 64) != 0 ? 1 : 0;
                    if ((iZ & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (iZ & 32) != 0 ? 1 : 0;
                    if ((iZ & 128) == 0) {
                        z11 = false;
                    }
                } else {
                    i12 = 0;
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (jW < i12) {
                    mp0Var.e(iD);
                    return false;
                }
                if (mp0Var.a() < jW) {
                    mp0Var.e(iD);
                    return false;
                }
                mp0Var.f((int) jW);
            } catch (Throwable th) {
                mp0Var.e(iD);
                throw th;
            }
        }
    }

    private static int b(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    private static ChapterTocFrame b(mp0 mp0Var, int i10, int i11, boolean z10, int i12, a aVar) throws UnsupportedEncodingException {
        int iD = mp0Var.d();
        int iB = b(iD, mp0Var.c());
        String str = new String(mp0Var.c(), iD, iB - iD, "ISO-8859-1");
        mp0Var.e(iB + 1);
        int iT = mp0Var.t();
        boolean z11 = (iT & 2) != 0;
        boolean z12 = (iT & 1) != 0;
        int iT2 = mp0Var.t();
        String[] strArr = new String[iT2];
        for (int i13 = 0; i13 < iT2; i13++) {
            int iD2 = mp0Var.d();
            int iB2 = b(iD2, mp0Var.c());
            strArr[i13] = new String(mp0Var.c(), iD2, iB2 - iD2, "ISO-8859-1");
            mp0Var.e(iB2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iD + i10;
        while (mp0Var.d() < i14) {
            Id3Frame id3FrameA = a(i11, mp0Var, z10, i12, aVar);
            if (id3FrameA != null) {
                arrayList.add(id3FrameA);
            }
        }
        return new ChapterTocFrame(str, z11, z12, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static GeobFrame b(int i10, mp0 mp0Var) throws UnsupportedEncodingException {
        int iT = mp0Var.t();
        String strB = b(iT);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        mp0Var.a(bArr, 0, i11);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i12 = iB + 1;
        int iA = a(bArr, i12, iT);
        String str2 = "";
        String str3 = (iA <= i12 || iA > i11) ? "" : new String(bArr, i12, iA - i12, strB);
        int iA2 = iA + a(iT);
        int iA3 = a(bArr, iA2, iT);
        if (iA3 > iA2 && iA3 <= i11) {
            str2 = new String(bArr, iA2, iA3 - iA2, strB);
        }
        int iA4 = iA3 + a(iT);
        return new GeobFrame(str, str3, str2, i11 <= iA4 ? da1.f19808f : Arrays.copyOfRange(bArr, iA4, i11));
    }

    private static UrlLinkFrame b(int i10, mp0 mp0Var, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        mp0Var.a(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, b(0, bArr), "ISO-8859-1"));
    }

    private static String b(int i10) {
        if (i10 == 1) {
            return "UTF-16";
        }
        if (i10 != 2) {
            return i10 != 3 ? "ISO-8859-1" : "UTF-8";
        }
        return "UTF-16BE";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static MlltFrame c(int i10, mp0 mp0Var) {
        int iZ = mp0Var.z();
        int iW = mp0Var.w();
        int iW2 = mp0Var.w();
        int iT = mp0Var.t();
        int iT2 = mp0Var.t();
        lp0 lp0Var = new lp0();
        lp0Var.a(mp0Var.e(), mp0Var.c());
        lp0Var.c(mp0Var.d() * 8);
        int i11 = ((i10 - 10) * 8) / (iT + iT2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iB = lp0Var.b(iT);
            int iB2 = lp0Var.b(iT2);
            iArr[i12] = iB;
            iArr2[i12] = iB2;
        }
        return new MlltFrame(iZ, iW, iW2, iArr, iArr2);
    }

    private static PrivFrame d(int i10, mp0 mp0Var) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        mp0Var.a(bArr, 0, i10);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i11 = iB + 1;
        return new PrivFrame(str, i10 <= i11 ? da1.f19808f : Arrays.copyOfRange(bArr, i11, i10));
    }

    private static TextInformationFrame e(int i10, mp0 mp0Var) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iT = mp0Var.t();
        String strB = b(iT);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        mp0Var.a(bArr, 0, i11);
        int iA = a(bArr, 0, iT);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = iA + a(iT);
        int iA3 = a(bArr, iA2, iT);
        return new TextInformationFrame("TXXX", str, (iA3 <= iA2 || iA3 > i11) ? "" : new String(bArr, iA2, iA3 - iA2, strB));
    }

    private static UrlLinkFrame f(int i10, mp0 mp0Var) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iT = mp0Var.t();
        String strB = b(iT);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        mp0Var.a(bArr, 0, i11);
        int iA = a(bArr, 0, iT);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = iA + a(iT);
        int iB = b(iA2, bArr);
        return new UrlLinkFrame("WXXX", str, (iB <= iA2 || iB > i11) ? "" : new String(bArr, iA2, iB - iA2, "ISO-8859-1"));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00de  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0107  */
    /* JADX WARN: Code duplicated, block: B:66:0x010d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0132  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f9 A[EDGE_INSN: B:78:0x00f9->B:62:0x00f9 BREAK  A[LOOP:0: B:54:0x00d8->B:61:0x00f5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x012c A[SYNTHETIC] */
    public final Metadata a(int i10, byte[] bArr) {
        b bVar;
        String string;
        int i11;
        int i12;
        Id3Frame id3FrameA;
        byte[] bArrC;
        int iD;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        mp0 mp0Var = new mp0(i10, bArr);
        boolean z10 = false;
        if (mp0Var.a() < 10) {
            string = "Data too short to be an ID3 tag";
        } else {
            int iW = mp0Var.w();
            if (iW == 4801587) {
                int iT = mp0Var.t();
                mp0Var.f(1);
                int iT2 = mp0Var.t();
                int iS = mp0Var.s();
                if (iT == 2) {
                    if ((iT2 & 64) != 0) {
                        string = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                    if (bVar == null) {
                        return null;
                    }
                    int iD2 = mp0Var.d();
                    i11 = bVar.f23198a == 2 ? 6 : 10;
                    i12 = bVar.f23200c;
                    if (bVar.f23199b) {
                        i12 = bVar.f23200c;
                        bArrC = mp0Var.c();
                        iD = mp0Var.d();
                        i13 = iD;
                        while (true) {
                            i14 = i13 + 1;
                            if (i14 < iD + i12) {
                                break;
                            }
                            if ((bArrC[i13] & 255) != 255 && bArrC[i14] == 0) {
                                System.arraycopy(bArrC, i13 + 2, bArrC, i14, (i12 - (i13 - iD)) - 2);
                                i12--;
                            }
                            i13 = i14;
                        }
                    }
                    mp0Var.d(iD2 + i12);
                    if (!a(mp0Var, bVar.f23198a, i11, false)) {
                        if (bVar.f23198a == 4 || !a(mp0Var, 4, i11, true)) {
                            StringBuilder sbA = v60.a("Failed to validate ID3 tag with majorVersion=");
                            sbA.append(bVar.f23198a);
                            p90.d("Id3Decoder", sbA.toString());
                            return null;
                        }
                        z10 = true;
                    }
                    while (mp0Var.a() >= i11) {
                        id3FrameA = a(bVar.f23198a, mp0Var, z10, i11, this.f23197a);
                        if (id3FrameA != null) {
                            arrayList.add(id3FrameA);
                        }
                    }
                    return new Metadata(arrayList);
                }
                if (iT == 3) {
                    if ((iT2 & 64) != 0) {
                        int iH = mp0Var.h();
                        mp0Var.f(iH);
                        iS -= iH + 4;
                    }
                } else {
                    if (iT != 4) {
                        o80.a("Skipped ID3 tag with unsupported majorVersion=", iT, "Id3Decoder");
                        bVar = null;
                        if (bVar == null) {
                            return null;
                        }
                        int iD3 = mp0Var.d();
                        if (bVar.f23198a == 2) {
                        }
                        i12 = bVar.f23200c;
                        if (bVar.f23199b) {
                            i12 = bVar.f23200c;
                            bArrC = mp0Var.c();
                            iD = mp0Var.d();
                            i13 = iD;
                            while (true) {
                                i14 = i13 + 1;
                                if (i14 < iD + i12) {
                                    break;
                                    break;
                                }
                                if ((bArrC[i13] & 255) != 255) {
                                }
                                i13 = i14;
                            }
                        }
                        mp0Var.d(iD3 + i12);
                        if (!a(mp0Var, bVar.f23198a, i11, false)) {
                            if (bVar.f23198a == 4) {
                            }
                            StringBuilder sbA2 = v60.a("Failed to validate ID3 tag with majorVersion=");
                            sbA2.append(bVar.f23198a);
                            p90.d("Id3Decoder", sbA2.toString());
                            return null;
                        }
                        while (mp0Var.a() >= i11) {
                            id3FrameA = a(bVar.f23198a, mp0Var, z10, i11, this.f23197a);
                            if (id3FrameA != null) {
                                arrayList.add(id3FrameA);
                            }
                        }
                        return new Metadata(arrayList);
                    }
                    if ((iT2 & 64) != 0) {
                        int iS2 = mp0Var.s();
                        mp0Var.f(iS2 - 4);
                        iS -= iS2;
                    }
                    if ((iT2 & 16) != 0) {
                        iS -= 10;
                    }
                }
                bVar = new b(iT, iS, iT < 4 && (iT2 & 128) != 0);
                if (bVar == null) {
                    return null;
                }
                int iD4 = mp0Var.d();
                if (bVar.f23198a == 2) {
                }
                i12 = bVar.f23200c;
                if (bVar.f23199b) {
                    i12 = bVar.f23200c;
                    bArrC = mp0Var.c();
                    iD = mp0Var.d();
                    i13 = iD;
                    while (true) {
                        i14 = i13 + 1;
                        if (i14 < iD + i12) {
                            break;
                            break;
                        }
                        if ((bArrC[i13] & 255) != 255) {
                        }
                        i13 = i14;
                    }
                }
                mp0Var.d(iD4 + i12);
                if (!a(mp0Var, bVar.f23198a, i11, false)) {
                    if (bVar.f23198a == 4) {
                    }
                    StringBuilder sbA3 = v60.a("Failed to validate ID3 tag with majorVersion=");
                    sbA3.append(bVar.f23198a);
                    p90.d("Id3Decoder", sbA3.toString());
                    return null;
                }
                while (mp0Var.a() >= i11) {
                    id3FrameA = a(bVar.f23198a, mp0Var, z10, i11, this.f23197a);
                    if (id3FrameA != null) {
                        arrayList.add(id3FrameA);
                    }
                }
                return new Metadata(arrayList);
            }
            StringBuilder sbA4 = v60.a("Unexpected first three bytes of ID3 tag header: 0x");
            sbA4.append(String.format("%06X", Integer.valueOf(iW)));
            string = sbA4.toString();
        }
        p90.d("Id3Decoder", string);
        bVar = null;
        if (bVar == null) {
            return null;
        }
        int iD5 = mp0Var.d();
        if (bVar.f23198a == 2) {
        }
        i12 = bVar.f23200c;
        if (bVar.f23199b) {
            i12 = bVar.f23200c;
            bArrC = mp0Var.c();
            iD = mp0Var.d();
            i13 = iD;
            while (true) {
                i14 = i13 + 1;
                if (i14 < iD + i12) {
                    break;
                    break;
                }
                if ((bArrC[i13] & 255) != 255) {
                }
                i13 = i14;
            }
        }
        mp0Var.d(iD5 + i12);
        if (!a(mp0Var, bVar.f23198a, i11, false)) {
            if (bVar.f23198a == 4) {
            }
            StringBuilder sbA5 = v60.a("Failed to validate ID3 tag with majorVersion=");
            sbA5.append(bVar.f23198a);
            p90.d("Id3Decoder", sbA5.toString());
            return null;
        }
        while (mp0Var.a() >= i11) {
            id3FrameA = a(bVar.f23198a, mp0Var, z10, i11, this.f23197a);
            if (id3FrameA != null) {
                arrayList.add(id3FrameA);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.yandex.mobile.ads.impl.r11
    public final Metadata a(ke0 ke0Var, ByteBuffer byteBuffer) {
        return a(byteBuffer.limit(), byteBuffer.array());
    }
}
