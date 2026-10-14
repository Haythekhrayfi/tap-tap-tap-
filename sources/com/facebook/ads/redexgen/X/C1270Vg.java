package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.BinaryFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterTocFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.GeobFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.PrivFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.UrlLinkFrame;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1270Vg implements DC {
    public static byte[] A01;
    public static String[] A02 = {"mDpfQ0Mg1qMGU0sRUyB4w0yHI9AflFxL", "HrWFAZbBmLlJHBGWXoy88PVYdiXTIEfW", "ZQEIpFlmPj9dChjEJf3cuXBCToBvQGIn", "RQPpjxLwn1F2LqLyPS6YhTLdMSPVP9VK", "XPMzSAYF2Koz19PEH34p5", "swwfqTWHhic8XQtgs9vSQ", "6JbQXNgGm6Rlu9UTMBxnLLi5Rd7F6qFb", "jePmV9Iz"};
    public static final int A03;
    public static final DO A04;
    public final DO A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static ChapterFrame A06(C0914Hf c0914Hf, int i10, int i11, boolean z10, int i12, DO r19) throws UnsupportedEncodingException {
        int iA06 = c0914Hf.A06();
        int iA02 = A02(c0914Hf.A00, iA06);
        String str = new String(c0914Hf.A00, iA06, iA02 - iA06, A0I(169, 10, 32));
        c0914Hf.A0Y(iA02 + 1);
        int iA08 = c0914Hf.A08();
        int iA09 = c0914Hf.A08();
        long jA0M = c0914Hf.A0M();
        if (jA0M == 4294967295L) {
            jA0M = -1;
        }
        long jA0M2 = c0914Hf.A0M();
        if (jA0M2 == 4294967295L) {
            jA0M2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = iA06 + i10;
        while (c0914Hf.A06() < i13) {
            Id3Frame id3FrameA0B = A0B(i11, c0914Hf, z10, i12, r19);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, iA08, iA09, jA0M, jA0M2, id3FrameArr);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static GeobFrame A09(C0914Hf c0914Hf, int i10) throws UnsupportedEncodingException {
        int iA0E = c0914Hf.A0E();
        String strA0H = A0H(iA0E);
        byte[] bArr = new byte[i10 - 1];
        c0914Hf.A0c(bArr, 0, i10 - 1);
        int iA02 = A02(bArr, 0);
        String str = new String(bArr, 0, iA02, A0I(169, 10, 32));
        int i11 = iA02 + 1;
        int iA03 = A03(bArr, i11, iA0E);
        String strA0K = A0K(bArr, i11, iA03, strA0H);
        int iA00 = A00(iA0E) + iA03;
        int iA04 = A03(bArr, iA00, iA0E);
        return new GeobFrame(str, strA0K, A0K(bArr, iA00, iA04, strA0H), A0N(bArr, A00(iA0E) + iA04, bArr.length));
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0L() {
        A01 = new byte[]{78, 8, 78, 8, 78, 8, 44, 106, 44, 106, 44, 106, 44, 106, 89, 85, 19, 7, 20, Ascii.CAN, 16, 38, Ascii.FS, 15, 16, 72, 91, 126, 107, 126, 63, 107, 112, 112, 63, 108, 119, 112, 109, 107, 63, 107, 112, 63, 125, 122, 63, 126, 113, 63, 86, 91, 44, 63, 107, 126, 120, 22, 49, 57, 60, 53, 52, 112, 36, 63, 112, 52, 53, 51, 63, 52, 53, 112, 54, 34, 49, 61, 53, 106, 112, 57, 52, 109, 119, 80, 88, 93, 84, 85, 17, 69, 94, 17, 71, 80, 93, 88, 85, 80, 69, 84, 17, 120, 117, 2, 17, 69, 80, 86, 17, 70, 88, 69, 89, 17, 92, 80, 91, 94, 67, 103, 84, 67, 66, 88, 94, 95, 12, 4, 48, 35, 47, 39, 98, 49, 43, 56, 39, 98, 39, 58, 33, 39, 39, 38, 49, 98, 48, 39, 47, 35, 43, 44, 43, 44, 37, 98, 54, 35, 37, 98, 38, 35, 54, 35, 71, 74, 61, 107, 113, 109, 15, Ascii.SUB, Ascii.SUB, 23, Ascii.ESC, 15, 19, 88, 117, 34, 85, 116, 114, 126, 117, 116, 99, 97, 89, 91, 66, 66, 87, 86, 18, 123, 118, 1, 18, 70, 83, 85, 18, 69, 91, 70, 90, 18, 95, 83, 88, 93, 64, 100, 87, 64, 65, 91, 93, 92, 15, 0, 18, 83, 92, 86, 18, 71, 92, 86, 87, 84, 91, 92, 87, 86, 18, 81, 93, 95, 66, 64, 87, 65, 65, 91, 93, 92, 18, 65, 81, 90, 87, 95, 87, 116, 76, 78, 87, 87, 66, 67, 7, 110, 99, 20, 7, 83, 70, 64, 7, 80, 78, 83, 79, 7, 82, 73, 84, 82, 87, 87, 72, 85, 83, 66, 67, 7, 74, 70, 77, 72, 85, 113, 66, 85, 84, 78, 72, 73, Ascii.SUB, Ascii.FS, 36, 38, 63, 63, 38, 33, 40, 111, 58, 33, 60, 58, 63, 63, 32, 61, 59, 42, 43, 111, 44, 32, 34, 63, 61, 42, 60, 60, 42, 43, 111, 32, 61, 111, 42, 33, 44, 61, 54, 63, 59, 42, 43, 111, 41, 61, 46, 34, 42, 62, 50, 50, 50, Ascii.US, Ascii.RS, 12, 103, 123, 124, 62, 63, 45, 70, 90, 93, 41, 46, 54, 55, 37, 78, 91, 68, Ascii.DEL, 116, 105, 97, 116, 114, 101, 116, 117, 49, 119, 120, 99, 98, 101, 49, 101, 121, 99, 116, 116, 49, 115, 104, 101, 116, 98, 49, 126, 119, 49, 88, 85, 34, 49, 101, 112, 118, 49, 121, 116, 112, 117, 116, 99, 43, 49, 19, 40, 53, 51, 54, 54, 41, 52, 50, 35, 34, 102, 37, 46, 39, 52, 39, 37, 50, 35, 52, 102, 35, 40, 37, 41, 34, 47, 40, 33, 97, 110, 110, 110, 70, 66, 78, 72, 74, 0, 21, 17, Ascii.GS, Ascii.ESC, Ascii.EM, 83, 22, 12, Ascii.EM, Ascii.ESC, 81, 85, 89, 95, 93, 23, 82, 72, 95};
    }

    static {
        A0L();
        A04 = new C1271Vh();
        A03 = C0930Hv.A08(A0I(166, 3, 12));
    }

    public C1270Vg() {
        this(null);
    }

    public C1270Vg(DO r10) {
        this.A00 = r10;
    }

    public static int A00(int i10) {
        if (i10 == 0 || i10 == 3) {
            return 1;
        }
        return 2;
    }

    public static int A01(C0914Hf c0914Hf, int i10) {
        byte[] bArr = c0914Hf.A00;
        for (int iA06 = c0914Hf.A06(); iA06 + 1 < i10; iA06++) {
            int i11 = bArr[iA06];
            if ((i11 & 255) == 255 && bArr[iA06 + 1] == 0) {
                int i12 = iA06 + 2;
                int i13 = iA06 + 1;
                int i14 = (i10 - iA06) - 2;
                String[] strArr = A02;
                String str = strArr[0];
                String str2 = strArr[6];
                int i15 = str.charAt(4);
                if (i15 == str2.charAt(4)) {
                    throw new RuntimeException();
                }
                A02[1] = "GmDFLtMXmPbGQOJzrAUGcq8JFdShu0kr";
                System.arraycopy(bArr, i12, bArr, i13, i14);
                i10--;
            }
        }
        return i10;
    }

    public static int A02(byte[] bArr, int i10) {
        while (i10 < i) {
            int i11 = bArr[i10];
            if (i11 == 0) {
                return i10;
            }
            i10++;
        }
        int i12 = bArr.length;
        return i12;
    }

    public static int A03(byte[] bArr, int i10, int i11) {
        int iA02 = A02(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iA02;
        }
        while (iA02 < terminationPos - 1) {
            int terminationPos = iA02 % 2;
            if (terminationPos == 0) {
                int terminationPos2 = iA02 + 1;
                if (bArr[terminationPos2] == 0) {
                    return iA02;
                }
            }
            int terminationPos3 = iA02 + 1;
            iA02 = A02(bArr, terminationPos3);
        }
        int terminationPos4 = bArr.length;
        return terminationPos4;
    }

    public static ApicFrame A04(C0914Hf c0914Hf, int i10, int i11) throws UnsupportedEncodingException {
        int iA02;
        String strA0M;
        int mimeTypeEndIndex = c0914Hf.A0E();
        String strA0H = A0H(mimeTypeEndIndex);
        int encoding = i10 - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i10 - 1;
        c0914Hf.A0c(bArr, 0, encoding2);
        String description = A0I(458, 6, 45);
        String strA0I = A0I(169, 10, 32);
        if (i11 == 2) {
            iA02 = 2;
            strA0M = description + C0930Hv.A0M(new String(bArr, 0, 3, strA0I));
            if (A0I(474, 9, 58).equals(strA0M)) {
                strA0M = A0I(464, 10, 126);
            }
        } else {
            iA02 = A02(bArr, 0);
            strA0M = C0930Hv.A0M(new String(bArr, 0, iA02, strA0I));
            if (strA0M.indexOf(47) == -1) {
                strA0M = description + strA0M;
            }
        }
        int encoding3 = iA02 + 1;
        int i12 = bArr[encoding3] & 255;
        int i13 = iA02 + 2;
        int descriptionEndIndex = A03(bArr, i13, mimeTypeEndIndex);
        int encoding4 = descriptionEndIndex - i13;
        String mimeType = new String(bArr, i13, encoding4, strA0H);
        int iA00 = A00(mimeTypeEndIndex) + descriptionEndIndex;
        int encoding5 = bArr.length;
        return new ApicFrame(strA0M, mimeType, i12, A0N(bArr, iA00, encoding5));
    }

    public static BinaryFrame A05(C0914Hf c0914Hf, int i10, String str) {
        byte[] bArr = new byte[i10];
        c0914Hf.A0c(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(C0914Hf c0914Hf, int i10, int i11, boolean z10, int framePosition, DO r18) throws UnsupportedEncodingException {
        int iA06 = c0914Hf.A06();
        int iA02 = A02(c0914Hf.A00, iA06);
        String strA0I = A0I(169, 10, 32);
        String str = new String(c0914Hf.A00, iA06, iA02 - iA06, strA0I);
        c0914Hf.A0Y(iA02 + 1);
        int framePosition2 = c0914Hf.A0E();
        boolean z11 = (framePosition2 & 2) != 0;
        boolean z12 = (framePosition2 & 1) != 0;
        int iA0E = c0914Hf.A0E();
        String[] strArr = new String[iA0E];
        for (int i12 = 0; i12 < iA0E; i12++) {
            int startIndex = c0914Hf.A06();
            int i13 = A02(c0914Hf.A00, startIndex);
            int framePosition3 = i13 - startIndex;
            strArr[i12] = new String(c0914Hf.A00, startIndex, framePosition3, strA0I);
            c0914Hf.A0Y(i13 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iA06 + i10;
        while (c0914Hf.A06() < i14) {
            String[] strArr2 = A02;
            String str2 = strArr2[4];
            String str3 = strArr2[5];
            int framePosition4 = str2.length();
            if (framePosition4 != str3.length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A02;
            strArr3[4] = "YQsr0udxa6AlS4ZOrNFlw";
            strArr3[5] = "dBU8ocTiI6WLc8wZTOIXb";
            Id3Frame id3FrameA0B = A0B(i11, c0914Hf, z10, framePosition, r18);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z11, z12, strArr, id3FrameArr);
    }

    public static CommentFrame A08(C0914Hf c0914Hf, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int textStartIndex = c0914Hf.A0E();
        String strA0H = A0H(textStartIndex);
        byte[] bArr = new byte[3];
        c0914Hf.A0c(bArr, 0, 3);
        String description = new String(bArr, 0, 3);
        int encoding = i10 - 4;
        byte[] data = new byte[encoding];
        int encoding2 = i10 - 4;
        c0914Hf.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, textStartIndex);
        String language = new String(data, 0, encoding3, strA0H);
        int iA00 = A00(textStartIndex) + encoding3;
        int encoding4 = A03(data, iA00, textStartIndex);
        String charset = A0K(data, iA00, encoding4, strA0H);
        return new CommentFrame(description, language, charset);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    public static DP A0A(C0914Hf c0914Hf) {
        int iA04 = c0914Hf.A04();
        String strA0I = A0I(179, 10, 19);
        if (iA04 < 10) {
            Log.w(strA0I, A0I(26, 31, 29));
            return null;
        }
        int iA0G = c0914Hf.A0G();
        int id2 = A03;
        if (iA0G != id2) {
            Log.w(strA0I, A0I(376, 48, 19) + iA0G);
            return null;
        }
        int iA0E = c0914Hf.A0E();
        boolean z10 = true;
        c0914Hf.A0Z(1);
        int framesSize = c0914Hf.A0E();
        int extendedHeaderSize = c0914Hf.A0D();
        if (iA0E == 2) {
            int id3 = framesSize & 64;
            int id4 = id3 != 0 ? 1 : 0;
            if (id4 != 0) {
                Log.w(strA0I, A0I(189, 68, 48));
                return null;
            }
        } else if (iA0E == 3) {
            int id5 = framesSize & 64;
            int id6 = id5 != 0 ? 1 : 0;
            if (id6 != 0) {
                int id7 = c0914Hf.A08();
                c0914Hf.A0Z(id7);
                extendedHeaderSize -= id7 + 4;
            }
        } else if (iA0E == 4) {
            int id8 = framesSize & 64;
            int id9 = id8 != 0 ? 1 : 0;
            if (id9 != 0) {
                int iA0D = c0914Hf.A0D();
                int id10 = iA0D - 4;
                c0914Hf.A0Z(id10);
                extendedHeaderSize -= iA0D;
            }
            int id11 = framesSize & 16;
            int id12 = id11 != 0 ? 1 : 0;
            if (id12 != 0) {
                extendedHeaderSize -= 10;
            }
        } else {
            Log.w(strA0I, A0I(257, 46, 37) + iA0E);
            return null;
        }
        if (iA0E < 4) {
            int id13 = framesSize & 128;
            if (id13 == 0) {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return new DP(iA0E, z10, extendedHeaderSize);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01bc A[Catch: UnsupportedEncodingException -> 0x02c3, all -> 0x02d4, Merged into TryCatch #1 {all -> 0x02d4, UnsupportedEncodingException -> 0x02c3, blocks: (B:95:0x015a, B:166:0x0266, B:173:0x02c3, B:98:0x0164, B:105:0x017a, B:107:0x0182, B:119:0x01bc, B:128:0x01d4, B:142:0x0214, B:149:0x0225, B:157:0x0238, B:163:0x024f, B:164:0x025c), top: B:183:0x0150 }, TRY_ENTER] */
    /* JADX WARN: Code duplicated, block: B:120:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:129:0x01da  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:133:0x0203 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x020a  */
    /* JADX WARN: Code duplicated, block: B:144:0x021b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x022a  */
    /* JADX WARN: Code duplicated, block: B:152:0x022e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x0247  */
    /* JADX WARN: Code duplicated, block: B:164:0x025c A[Catch: UnsupportedEncodingException -> 0x02c3, all -> 0x02d4, Merged into TryCatch #1 {all -> 0x02d4, UnsupportedEncodingException -> 0x02c3, blocks: (B:95:0x015a, B:166:0x0266, B:173:0x02c3, B:98:0x0164, B:105:0x017a, B:107:0x0182, B:119:0x01bc, B:128:0x01d4, B:142:0x0214, B:149:0x0225, B:157:0x0238, B:163:0x024f, B:164:0x025c), top: B:183:0x0150 }] */
    public static Id3Frame A0B(int flags, C0914Hf c0914Hf, boolean z10, int i10, DO r29) {
        int iA0E;
        int flags2;
        int frameSize;
        String str;
        int frameId3;
        Id3Frame id3FrameA05;
        int frameId1 = c0914Hf.A0E();
        int frameId0 = c0914Hf.A0E();
        int iA0E2 = c0914Hf.A0E();
        if (flags >= 3) {
            iA0E = c0914Hf.A0E();
        } else {
            iA0E = 0;
        }
        if (flags == 4) {
            int iA0H = c0914Hf.A0H();
            if (!z10) {
                int frameSize2 = iA0H >> 8;
                int i11 = (iA0H & 255) | ((frameSize2 & 255) << 7);
                int frameSize3 = iA0H >> 16;
                int i12 = i11 | ((frameSize3 & 255) << 14);
                int frameSize4 = iA0H >> 24;
                flags2 = i12 | ((frameSize4 & 255) << 21);
            } else {
                flags2 = iA0H;
            }
        } else if (flags == 3) {
            flags2 = c0914Hf.A0H();
        } else {
            flags2 = c0914Hf.A0G();
        }
        if (flags >= 3) {
            frameSize = c0914Hf.A0I();
        } else {
            frameSize = 0;
        }
        if (frameId1 == 0 && frameId0 == 0 && iA0E2 == 0 && iA0E == 0 && flags2 == 0 && frameSize == 0) {
            c0914Hf.A0Y(c0914Hf.A07());
            return null;
        }
        int nextFramePosition = c0914Hf.A06() + flags2;
        int frameId4 = c0914Hf.A07();
        String strA0I = A0I(179, 10, 19);
        if (nextFramePosition > frameId4) {
            Log.w(strA0I, A0I(129, 37, 64));
            c0914Hf.A0Y(c0914Hf.A07());
            return null;
        }
        if (r29 != null && !r29.A5U(flags, frameId1, frameId0, iA0E2, iA0E)) {
            c0914Hf.A0Y(nextFramePosition);
            return null;
        }
        int i13 = 0;
        int frameSize5 = 0;
        int nextFramePosition2 = 0;
        int frameId5 = 0;
        boolean isCompressed = false;
        if (flags == 3) {
            frameId5 = (frameSize & 128) != 0 ? 1 : 0;
            frameSize5 = (frameSize & 64) != 0 ? 1 : 0;
            isCompressed = (frameSize & 32) != 0;
            i13 = frameId5;
        } else {
            if (flags == 4) {
                isCompressed = (frameSize & 64) != 0;
                int nextFramePosition3 = frameSize & 8;
                if (A02[7].length() != 9) {
                    A02[1] = "HxLFBObUGoObUPku8sA9h7LrWEHKW34t";
                    i13 = nextFramePosition3 != 0 ? 1 : 0;
                    frameSize5 = (frameSize & 4) != 0 ? 1 : 0;
                    nextFramePosition2 = (frameSize & 2) != 0 ? 1 : 0;
                    frameId5 = (frameSize & 1) != 0 ? 1 : 0;
                    if (A02[7].length() == 9) {
                        throw new RuntimeException();
                    }
                    A02[1] = "76YFuh7tw8gcxzUEh5emTmdExIUmXPMQ";
                }
            }
            throw new RuntimeException();
        }
        if (i13 != 0 || frameSize5 != 0) {
            Log.w(strA0I, A0I(303, 50, 77));
            c0914Hf.A0Y(nextFramePosition);
            return null;
        }
        if (isCompressed) {
            flags2--;
            c0914Hf.A0Z(1);
        }
        if (frameId5 != 0) {
            flags2 -= 4;
            c0914Hf.A0Z(4);
        }
        if (nextFramePosition2 != 0) {
            flags2 = A01(c0914Hf, flags2);
        }
        try {
            if (frameId1 == 84 && frameId0 == 88 && iA0E2 == 88 && (flags == 2 || iA0E == 88)) {
                id3FrameA05 = A0D(c0914Hf, flags2);
            } else if (frameId1 == 84) {
                String id2 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                id3FrameA05 = A0E(c0914Hf, flags2, id2);
            } else if (frameId1 == 87 && frameId0 == 88 && iA0E2 == 88 && (flags == 2 || iA0E == 88)) {
                id3FrameA05 = A0F(c0914Hf, flags2);
            } else if (frameId1 == 87) {
                String id3 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                id3FrameA05 = A0G(c0914Hf, flags2, id3);
            } else if (frameId1 == 80 && frameId0 == 82 && iA0E2 == 73) {
                String[] strArr = A02;
                if (strArr[3].charAt(18) != strArr[2].charAt(18)) {
                    A02[7] = "TpWBQOHSHz";
                    if (iA0E == 86) {
                        id3FrameA05 = A0C(c0914Hf, flags2);
                    } else {
                        if (frameId1 == 71) {
                            String[] strArr2 = A02;
                            String str2 = strArr2[3];
                            str = strArr2[2];
                            frameId3 = str2.charAt(18);
                            if (frameId3 != str.charAt(18)) {
                                A02[1] = "1pyFPk3tXqgthrOgLBh9Cc6ujVWwqIgx";
                                if (flags == 2) {
                                    if (frameId1 == 67) {
                                        if (frameId1 != 67) {
                                            if (frameId1 != 67) {
                                                String id4 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                                id3FrameA05 = A05(c0914Hf, flags2, id4);
                                            } else {
                                                String id5 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                                id3FrameA05 = A05(c0914Hf, flags2, id5);
                                            }
                                        } else if (frameId1 != 67) {
                                            String id6 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                            id3FrameA05 = A05(c0914Hf, flags2, id6);
                                        } else {
                                            String id7 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                            id3FrameA05 = A05(c0914Hf, flags2, id7);
                                        }
                                    } else if (frameId1 != 67) {
                                        if (frameId1 != 67) {
                                            String id8 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                            id3FrameA05 = A05(c0914Hf, flags2, id8);
                                        } else {
                                            String id9 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                            id3FrameA05 = A05(c0914Hf, flags2, id9);
                                        }
                                    } else if (frameId1 != 67) {
                                        String id10 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id10);
                                    } else {
                                        String id11 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id11);
                                    }
                                } else if (frameId1 == 67) {
                                    if (frameId1 != 67) {
                                        if (frameId1 != 67) {
                                            String id12 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                            id3FrameA05 = A05(c0914Hf, flags2, id12);
                                        } else {
                                            String id13 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                            id3FrameA05 = A05(c0914Hf, flags2, id13);
                                        }
                                    } else if (frameId1 != 67) {
                                        String id14 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id14);
                                    } else {
                                        String id15 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id15);
                                    }
                                } else if (frameId1 != 67) {
                                    if (frameId1 != 67) {
                                        String id16 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id16);
                                    } else {
                                        String id17 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id17);
                                    }
                                } else if (frameId1 != 67) {
                                    String id18 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id18);
                                } else {
                                    String id19 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id19);
                                }
                            }
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A02;
                        String str3 = strArr3[3];
                        str = strArr3[2];
                        frameId3 = str3.charAt(18);
                        if (frameId3 != str.charAt(18)) {
                            A02[1] = "1pyFPk3tXqgthrOgLBh9Cc6ujVWwqIgx";
                            if (flags == 2) {
                                if (frameId1 == 67) {
                                    if (frameId1 != 67) {
                                        if (frameId1 != 67) {
                                            String id110 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                            id3FrameA05 = A05(c0914Hf, flags2, id110);
                                        } else {
                                            String id111 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                            id3FrameA05 = A05(c0914Hf, flags2, id111);
                                        }
                                    } else if (frameId1 != 67) {
                                        String id112 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id112);
                                    } else {
                                        String id113 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id113);
                                    }
                                } else if (frameId1 != 67) {
                                    if (frameId1 != 67) {
                                        String id114 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id114);
                                    } else {
                                        String id115 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id115);
                                    }
                                } else if (frameId1 != 67) {
                                    String id116 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id116);
                                } else {
                                    String id117 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id117);
                                }
                            } else if (frameId1 == 67) {
                                if (frameId1 != 67) {
                                    if (frameId1 != 67) {
                                        String id118 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id118);
                                    } else {
                                        String id119 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id119);
                                    }
                                } else if (frameId1 != 67) {
                                    String id1110 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id1110);
                                } else {
                                    String id1111 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id1111);
                                }
                            } else if (frameId1 != 67) {
                                if (frameId1 != 67) {
                                    String id1112 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id1112);
                                } else {
                                    String id1113 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id1113);
                                }
                            } else if (frameId1 != 67) {
                                String id1114 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                id3FrameA05 = A05(c0914Hf, flags2, id1114);
                            } else {
                                String id1115 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                id3FrameA05 = A05(c0914Hf, flags2, id1115);
                            }
                        }
                        throw new RuntimeException();
                    }
                } else if (iA0E == 86) {
                    id3FrameA05 = A0C(c0914Hf, flags2);
                } else {
                    if (frameId1 == 71) {
                        String[] strArr4 = A02;
                        String str4 = strArr4[3];
                        str = strArr4[2];
                        frameId3 = str4.charAt(18);
                        if (frameId3 != str.charAt(18)) {
                            A02[1] = "1pyFPk3tXqgthrOgLBh9Cc6ujVWwqIgx";
                            if (flags == 2) {
                                if (frameId1 == 67) {
                                    if (frameId1 != 67) {
                                        if (frameId1 != 67) {
                                            String id1116 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                            id3FrameA05 = A05(c0914Hf, flags2, id1116);
                                        } else {
                                            String id1117 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                            id3FrameA05 = A05(c0914Hf, flags2, id1117);
                                        }
                                    } else if (frameId1 != 67) {
                                        String id1118 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id1118);
                                    } else {
                                        String id1119 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id1119);
                                    }
                                } else if (frameId1 != 67) {
                                    if (frameId1 != 67) {
                                        String id11110 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id11110);
                                    } else {
                                        String id11111 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id11111);
                                    }
                                } else if (frameId1 != 67) {
                                    String id11112 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id11112);
                                } else {
                                    String id11113 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id11113);
                                }
                            } else if (frameId1 == 67) {
                                if (frameId1 != 67) {
                                    if (frameId1 != 67) {
                                        String id11114 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id11114);
                                    } else {
                                        String id11115 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id11115);
                                    }
                                } else if (frameId1 != 67) {
                                    String id11116 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id11116);
                                } else {
                                    String id11117 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id11117);
                                }
                            } else if (frameId1 != 67) {
                                if (frameId1 != 67) {
                                    String id11118 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id11118);
                                } else {
                                    String id11119 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id11119);
                                }
                            } else if (frameId1 != 67) {
                                String id111110 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                id3FrameA05 = A05(c0914Hf, flags2, id111110);
                            } else {
                                String id111111 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                id3FrameA05 = A05(c0914Hf, flags2, id111111);
                            }
                        }
                        throw new RuntimeException();
                    }
                    String[] strArr5 = A02;
                    String str5 = strArr5[3];
                    str = strArr5[2];
                    frameId3 = str5.charAt(18);
                    if (frameId3 != str.charAt(18)) {
                        A02[1] = "1pyFPk3tXqgthrOgLBh9Cc6ujVWwqIgx";
                        if (flags == 2) {
                            if (frameId1 == 67) {
                                if (frameId1 != 67) {
                                    if (frameId1 != 67) {
                                        String id111112 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id111112);
                                    } else {
                                        String id111113 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                        id3FrameA05 = A05(c0914Hf, flags2, id111113);
                                    }
                                } else if (frameId1 != 67) {
                                    String id111114 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id111114);
                                } else {
                                    String id111115 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id111115);
                                }
                            } else if (frameId1 != 67) {
                                if (frameId1 != 67) {
                                    String id111116 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id111116);
                                } else {
                                    String id111117 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id111117);
                                }
                            } else if (frameId1 != 67) {
                                String id111118 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                id3FrameA05 = A05(c0914Hf, flags2, id111118);
                            } else {
                                String id111119 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                id3FrameA05 = A05(c0914Hf, flags2, id111119);
                            }
                        } else if (frameId1 == 67) {
                            if (frameId1 != 67) {
                                if (frameId1 != 67) {
                                    String id1111110 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id1111110);
                                } else {
                                    String id1111111 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                    id3FrameA05 = A05(c0914Hf, flags2, id1111111);
                                }
                            } else if (frameId1 != 67) {
                                String id1111112 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                id3FrameA05 = A05(c0914Hf, flags2, id1111112);
                            } else {
                                String id1111113 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                id3FrameA05 = A05(c0914Hf, flags2, id1111113);
                            }
                        } else if (frameId1 != 67) {
                            if (frameId1 != 67) {
                                String id1111114 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                id3FrameA05 = A05(c0914Hf, flags2, id1111114);
                            } else {
                                String id1111115 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                id3FrameA05 = A05(c0914Hf, flags2, id1111115);
                            }
                        } else if (frameId1 != 67) {
                            String id1111116 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                            id3FrameA05 = A05(c0914Hf, flags2, id1111116);
                        } else {
                            String id1111117 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                            id3FrameA05 = A05(c0914Hf, flags2, id1111117);
                        }
                    }
                    throw new RuntimeException();
                }
            } else {
                if (frameId1 == 71 || frameId0 != 69 || iA0E2 != 79 || (iA0E != 66 && flags != 2)) {
                    String[] strArr6 = A02;
                    String str6 = strArr6[3];
                    str = strArr6[2];
                    frameId3 = str6.charAt(18);
                    if (frameId3 != str.charAt(18)) {
                        A02[1] = "1pyFPk3tXqgthrOgLBh9Cc6ujVWwqIgx";
                        if (flags == 2 ? !(frameId1 != 65 || frameId0 != 80 || iA0E2 != 73 || iA0E != 67) : !(frameId1 != 80 || frameId0 != 73 || iA0E2 != 67)) {
                            id3FrameA05 = A04(c0914Hf, flags2, flags);
                        } else if (frameId1 == 67 || frameId0 != 79 || iA0E2 != 77 || (iA0E != 77 && flags != 2)) {
                            if (frameId1 != 67 && frameId0 == 72 && iA0E2 == 65 && iA0E == 80) {
                                id3FrameA05 = A06(c0914Hf, flags2, flags, z10, i10, r29);
                            } else if (frameId1 != 67 && frameId0 == 84 && iA0E2 == 79 && iA0E == 67) {
                                id3FrameA05 = A07(c0914Hf, flags2, flags, z10, i10, r29);
                            } else {
                                String id1111118 = A0J(flags, frameId1, frameId0, iA0E2, iA0E);
                                id3FrameA05 = A05(c0914Hf, flags2, id1111118);
                            }
                        } else {
                            id3FrameA05 = A08(c0914Hf, flags2);
                        }
                    }
                    throw new RuntimeException();
                }
                id3FrameA05 = A09(c0914Hf, flags2);
            }
            if (id3FrameA05 == null) {
                Log.w(strA0I, A0I(57, 27, 82) + A0J(flags, frameId1, frameId0, iA0E2, iA0E) + A0I(14, 12, 119) + flags2);
            }
            c0914Hf.A0Y(nextFramePosition);
            String[] strArr7 = A02;
            if (strArr7[0].charAt(4) == strArr7[6].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr8 = A02;
            strArr8[0] = "Dtpy20dKfpjr6GTNw3SVg8ra0l6IUEaG";
            strArr8[6] = "adhGTkdPtMJ1tGydAzIftpfQfU5S2oNR";
            return id3FrameA05;
        } catch (UnsupportedEncodingException unused) {
            Log.w(strA0I, A0I(424, 30, 68));
            return null;
        } finally {
            c0914Hf.A0Y(nextFramePosition);
        }
    }

    public static PrivFrame A0C(C0914Hf c0914Hf, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        c0914Hf.A0c(bArr, 0, i10);
        int iA02 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iA02, A0I(169, 10, 32)), A0N(bArr, iA02 + 1, bArr.length));
    }

    public static TextInformationFrame A0D(C0914Hf c0914Hf, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int valueStartIndex = c0914Hf.A0E();
        String strA0H = A0H(valueStartIndex);
        int encoding = i10 - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i10 - 1;
        c0914Hf.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, valueStartIndex);
        String description = new String(data, 0, encoding3, strA0H);
        int iA00 = A00(valueStartIndex) + encoding3;
        int encoding4 = A03(data, iA00, valueStartIndex);
        String strA0K = A0K(data, iA00, encoding4, strA0H);
        String charset = A0I(353, 4, 104);
        return new TextInformationFrame(charset, description, strA0K);
    }

    public static TextInformationFrame A0E(C0914Hf c0914Hf, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int encoding = c0914Hf.A0E();
        String strA0H = A0H(encoding);
        byte[] data = new byte[i10 - 1];
        c0914Hf.A0c(data, 0, i10 - 1);
        return new TextInformationFrame(str, null, new String(data, 0, A03(data, 0, encoding), strA0H));
    }

    public static UrlLinkFrame A0F(C0914Hf c0914Hf, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int descriptionEndIndex = c0914Hf.A0E();
        String strA0H = A0H(descriptionEndIndex);
        int encoding = i10 - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i10 - 1;
        c0914Hf.A0c(bArr, 0, encoding2);
        int encoding3 = A03(bArr, 0, descriptionEndIndex);
        String str = new String(bArr, 0, encoding3, strA0H);
        int iA00 = A00(descriptionEndIndex) + encoding3;
        String strA0K = A0K(bArr, iA00, A02(bArr, iA00), A0I(169, 10, 32));
        String charset = A0I(454, 4, 52);
        return new UrlLinkFrame(charset, str, strA0K);
    }

    public static UrlLinkFrame A0G(C0914Hf c0914Hf, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        c0914Hf.A0c(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), A0I(169, 10, 32)));
    }

    public static String A0H(int i10) {
        String strA0I = A0I(169, 10, 32);
        switch (i10) {
            case 0:
                return strA0I;
            case 1:
                return A0I(357, 6, 72);
            case 2:
                return A0I(363, 8, 105);
            case 3:
                String strA0I2 = A0I(371, 5, 97);
                String[] strArr = A02;
                if (strArr[0].charAt(4) == strArr[6].charAt(4)) {
                    throw new RuntimeException();
                }
                A02[7] = "WB3CnC";
                return strA0I2;
            default:
                return strA0I;
        }
    }

    public static String A0J(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, A0I(0, 6, 105), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, A0I(6, 8, 11), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static String A0K(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, str);
        }
        String[] strArr = A02;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "r4Qi0WBzOYfLLA4UC9s9DAK76ksjAQPp";
        strArr2[6] = "c5jPrSHyFK7RFs6Pjjym9ojkSMFCl1O5";
        return A0I(0, 0, 121);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    public static boolean A0M(C0914Hf c0914Hf, int i10, int i11, boolean z10) throws Throwable {
        int iA08;
        long jA0M;
        int iA0I;
        int iA06 = c0914Hf.A06();
        while (true) {
            try {
                if (c0914Hf.A04() >= i11) {
                    if (i10 >= 3) {
                        try {
                            iA08 = c0914Hf.A08();
                            jA0M = c0914Hf.A0M();
                            iA0I = c0914Hf.A0I();
                        } catch (Throwable th) {
                            th = th;
                            c0914Hf.A0Y(iA06);
                            throw th;
                        }
                    } else {
                        iA08 = c0914Hf.A0G();
                        jA0M = c0914Hf.A0G();
                        iA0I = 0;
                    }
                    if (iA08 == 0 && jA0M == 0 && iA0I == 0) {
                        c0914Hf.A0Y(iA06);
                        return true;
                    }
                    if (i10 == 4 && !z10) {
                        if ((8421504 & jA0M) != 0) {
                            c0914Hf.A0Y(iA06);
                            return false;
                        }
                        long j10 = (jA0M & 255) | (((jA0M >> 8) & 255) << 7);
                        String[] strArr = A02;
                        if (strArr[4].length() != strArr[5].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A02;
                        strArr2[0] = "WW8harr0n1WVcE671SufvW5i3HFI8G3E";
                        strArr2[6] = "cs8JhXohJ41Zu2keAfctBKv0IiLyHEBA";
                        jA0M = (((jA0M >> 24) & 255) << 21) | j10 | (((jA0M >> 16) & 255) << 14);
                    }
                    boolean z11 = false;
                    int flags = 0;
                    if (i10 == 4) {
                        z11 = (iA0I & 64) != 0;
                        flags = (iA0I & 1) == 0 ? 0 : 1;
                    } else if (i10 == 3) {
                        int minimumFrameSize = iA0I & 32;
                        z11 = minimumFrameSize != 0;
                        int minimumFrameSize2 = iA0I & 128;
                        flags = minimumFrameSize2 == 0 ? 0 : 1;
                    }
                    int i12 = 0;
                    String[] strArr3 = A02;
                    if (strArr3[4].length() != strArr3[5].length()) {
                        if (z11) {
                            i12 = 0 + 1;
                        }
                    } else {
                        String[] strArr4 = A02;
                        strArr4[3] = "otGI0hsmNkIa4sbMlKQFq5zev1M8Vgvr";
                        strArr4[2] = "hsxwZKJ37TLGlj6U8xTCexdOCMrqimac";
                        if (z11) {
                            i12 = 0 + 1;
                        }
                    }
                    if (flags != 0) {
                        i12 += 4;
                    }
                    if (jA0M < i12) {
                        c0914Hf.A0Y(iA06);
                        return false;
                    }
                    int minimumFrameSize3 = c0914Hf.A04();
                    if (minimumFrameSize3 >= jA0M) {
                        int minimumFrameSize4 = (int) jA0M;
                        c0914Hf.A0Z(minimumFrameSize4);
                    } else {
                        c0914Hf.A0Y(iA06);
                        return false;
                    }
                } else {
                    c0914Hf.A0Y(iA06);
                    return true;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static byte[] A0N(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return new byte[0];
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    public final Metadata A0O(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        C0914Hf c0914Hf = new C0914Hf(bArr, i10);
        DP dpA0A = A0A(c0914Hf);
        if (dpA0A == null) {
            return null;
        }
        int startPosition = c0914Hf.A06();
        int frameHeaderSize = dpA0A.A01 == 2 ? 6 : 10;
        int iA01 = dpA0A.A00;
        if (dpA0A.A02) {
            iA01 = A01(c0914Hf, dpA0A.A00);
        }
        c0914Hf.A0X(startPosition + iA01);
        boolean z10 = false;
        if (!A0M(c0914Hf, dpA0A.A01, frameHeaderSize, false)) {
            if (dpA0A.A01 != 4 || !A0M(c0914Hf, 4, frameHeaderSize, true)) {
                Log.w(A0I(179, 10, 19), A0I(84, 45, 51) + dpA0A.A01);
                return null;
            }
            z10 = true;
        }
        while (c0914Hf.A04() >= frameHeaderSize) {
            Id3Frame id3FrameA0B = A0B(dpA0A.A01, c0914Hf, z10, frameHeaderSize, this.A00);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.facebook.ads.redexgen.X.DC
    public final Metadata A4w(C0810Cz c0810Cz) {
        ByteBuffer buffer = c0810Cz.A01;
        return A0O(buffer.array(), buffer.limit());
    }
}
