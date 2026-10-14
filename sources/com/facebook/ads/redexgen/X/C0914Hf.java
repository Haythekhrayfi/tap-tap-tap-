package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0914Hf {
    public static byte[] A03;
    public static String[] A04 = {"oSbtVRwphkTFlAHrFUFfvlQVewHH9uZD", "ke9406sA8vEe4ogcratlCLLRCygX4Y6v", "LkVrMYKeL4j", "rD3J2lWEcQES1OY4rXh7UnGCqOy7njew", "qJRaOB7ViewD6", "qa5huEKLFbsop1eqm4Yriado9DIEiYjV", "GSl3McmMnOZYTOuxGBg0tC3pnH", "ySC3qX4TjccxO5mLdOZ"};
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            String[] strArr = A04;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[5] = "EdmI6fYX5kJGCYPfpqvG1yUufp2PCRFX";
            strArr2[3] = "bDUsxAC2PGUD72vhZpZ7z8M6PcC6y0P6";
            bArrCopyOfRange[i13] = (byte) ((b10 - i12) - 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{50, 87, 95, 74, 85, 82, 77, 9, 62, 61, 47, 22, 33, 9, 92, 78, 90, 94, 78, 87, 76, 78, 9, 76, 88, 87, 93, 82, 87, 94, 74, 93, 82, 88, 87, 9, 75, 98, 93, 78, 35, 9, 41, 78, 86, 65, 76, 73, 68, 0, 53, 52, 38, 13, Ascii.CAN, 0, 83, 69, 81, 85, 69, 78, 67, 69, 0, 70, 73, 82, 83, 84, 0, 66, 89, 84, 69, Ascii.SUB, 0, -35, -8, -7, -87, -21, -14, -3, -87, -9, -8, -3, -87, 3, -18, -5, -8, -61, -87, -32, -33, -47, -72, -61};
    }

    static {
        A01();
    }

    public C0914Hf() {
    }

    public C0914Hf(int i10) {
        this.A00 = new byte[i10];
        this.A01 = i10;
    }

    public C0914Hf(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public C0914Hf(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A01 = i10;
    }

    public final char A02() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public final double A03() {
        return Double.longBitsToDouble(A0L());
    }

    public final int A04() {
        return this.A01 - this.A02;
    }

    public final int A05() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int A06() {
        return this.A02;
    }

    public final int A07() {
        return this.A01;
    }

    public final int A08() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        int i11 = i10 + 1;
        this.A02 = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i11 + 1;
        this.A02 = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 16);
        int i15 = i13 + 1;
        this.A02 = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.A02 = i15 + 1;
        return (bArr[i15] & 255) | i16;
    }

    public final int A09() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        int i11 = i10 + 1;
        this.A02 = i11;
        int i12 = ((bArr[i10] & 255) << 24) >> 8;
        int i13 = i11 + 1;
        this.A02 = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 8);
        this.A02 = i13 + 1;
        return (bArr[i13] & 255) | i14;
    }

    public final int A0A() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        int i11 = i10 + 1;
        this.A02 = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i11 + 1;
        this.A02 = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 8);
        int i15 = i13 + 1;
        this.A02 = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.A02 = i15 + 1;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public final int A0B() {
        int iA0A = A0A();
        if (iA0A >= 0) {
            return iA0A;
        }
        throw new IllegalStateException(A00(77, 18, 21) + iA0A);
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        int i11 = i10 + 1;
        this.A02 = i11;
        int i12 = bArr[i10] & 255;
        this.A02 = i11 + 1;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final int A0D() {
        int b10 = A0E();
        int b11 = A0E();
        int b12 = A0E();
        int b13 = A0E();
        int b14 = (b10 << 21) | (b11 << 14);
        int b15 = b12 << 7;
        return b14 | b15 | b13;
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int A0F() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        int i11 = i10 + 1;
        this.A02 = i11;
        int i12 = (bArr[i10] & 255) << 8;
        int i13 = i11 + 1;
        this.A02 = i13;
        int i14 = (bArr[i11] & 255) | i12;
        int result = i13 + 2;
        this.A02 = result;
        return i14;
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        int i11 = i10 + 1;
        this.A02 = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i11 + 1;
        this.A02 = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 8);
        this.A02 = i13 + 1;
        return (bArr[i13] & 255) | i14;
    }

    public final int A0H() {
        int iA08 = A08();
        if (iA08 >= 0) {
            return iA08;
        }
        throw new IllegalStateException(A00(77, 18, 21) + iA08);
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        int i11 = i10 + 1;
        this.A02 = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.A02 = i11 + 1;
        return (bArr[i11] & 255) | i12;
    }

    public final long A0J() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        int i11 = i10 + 1;
        this.A02 = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        this.A02 = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i12 + 1;
        this.A02 = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i13 + 1;
        this.A02 = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i14 + 1;
        this.A02 = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i15 + 1;
        this.A02 = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i16 + 1;
        this.A02 = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.A02 = i17 + 1;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }

    public final long A0K() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        int i11 = i10 + 1;
        this.A02 = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        this.A02 = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i12 + 1;
        this.A02 = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.A02 = i13 + 1;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public final long A0L() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        int i11 = i10 + 1;
        this.A02 = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i11 + 1;
        this.A02 = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i12 + 1;
        this.A02 = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i13 + 1;
        this.A02 = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i14 + 1;
        this.A02 = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i15 + 1;
        this.A02 = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i16 + 1;
        this.A02 = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.A02 = i17 + 1;
        return (((long) bArr[i17]) & 255) | j16;
    }

    public final long A0M() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        int i11 = i10 + 1;
        this.A02 = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i11 + 1;
        this.A02 = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i12 + 1;
        this.A02 = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.A02 = i13 + 1;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public final long A0N() {
        long jA0L = A0L();
        if (jA0L >= 0) {
            return jA0L;
        }
        throw new IllegalStateException(A00(77, 18, 21) + jA0L);
    }

    public final long A0O() {
        int i10 = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long value = bArr[length];
        for (int i11 = 7; i11 >= 0; i11--) {
            int length2 = 1 << i11;
            if ((((long) length2) & value) == 0) {
                if (i11 < 6) {
                    int length3 = 1 << i11;
                    value &= (long) (length3 - 1);
                    i10 = 7 - i11;
                    break;
                }
                if (i11 != 7) {
                    break;
                }
                i10 = 1;
                break;
            }
        }
        if (i10 != 0) {
            for (int i12 = 1; i12 < i10; i12++) {
                byte[] bArr2 = this.A00;
                int i13 = this.A02;
                int i14 = A04[2].length();
                if (i14 != 11) {
                    throw new RuntimeException();
                }
                A04[2] = "bgE5KGMxqsO";
                int i15 = bArr2[i13 + i12];
                int i16 = i15 & 192;
                if (i16 == 128) {
                    int length4 = i15 & 63;
                    value = (value << 6) | ((long) length4);
                } else {
                    throw new NumberFormatException(A00(0, 42, 117) + value);
                }
            }
            int length5 = this.A02;
            this.A02 = length5 + i10;
            return value;
        }
        throw new NumberFormatException(A00(42, 35, 108) + value);
    }

    public final String A0P() {
        if (A04() == 0) {
            return null;
        }
        int i10 = this.A02;
        while (i10 < lineLimit) {
            int lineLimit = this.A00[i10];
            if (C0930Hv.A0d(lineLimit)) {
                break;
            }
            i10++;
        }
        int i11 = this.A02;
        int lineLimit2 = i10 - i11;
        if (lineLimit2 >= 3) {
            byte[] bArr = this.A00;
            if (bArr[i11] == -17) {
                int lineLimit3 = i11 + 1;
                if (bArr[lineLimit3] == -69) {
                    int lineLimit4 = i11 + 2;
                    if (bArr[lineLimit4] == -65) {
                        this.A02 = i11 + 3;
                    }
                }
            }
        }
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        int lineLimit5 = i10 - i12;
        String strA0R = C0930Hv.A0R(bArr2, i12, lineLimit5);
        this.A02 = i10;
        int i13 = this.A01;
        if (i10 == i13) {
            return strA0R;
        }
        byte[] bArr3 = this.A00;
        if (bArr3[i10] == 13) {
            int lineLimit6 = i10 + 1;
            this.A02 = lineLimit6;
            if (lineLimit6 == i13) {
                return strA0R;
            }
        }
        int i14 = this.A02;
        String line = A04[0];
        if (line.charAt(27) == 'i') {
            throw new RuntimeException();
        }
        A04[7] = "dK52fOK8jWv7xyi3a3n";
        if (bArr3[i14] == 10) {
            int i15 = i14 + 1;
            String line2 = A04[0];
            if (line2.charAt(27) != 'i') {
                String[] strArr = A04;
                strArr[5] = "CzkRNJa9FDUHAtzqy7ViO0FrfGLEXvBM";
                strArr[3] = "L6K2rBVJE7KS5cY2UbZwATPHMS3LrQAX";
                this.A02 = i15;
            } else {
                A04[0] = "fuXjTapUFN2iKU6xFo1uSk4UrCSPBhbp";
                this.A02 = i15;
            }
        }
        return strA0R;
    }

    public final String A0Q() {
        if (A04() == 0) {
            return null;
        }
        int i10 = this.A02;
        while (i10 < stringLimit) {
            int stringLimit = this.A00[i10];
            if (stringLimit == 0) {
                break;
            }
            i10++;
        }
        byte[] bArr = this.A00;
        int i11 = this.A02;
        int stringLimit2 = i10 - i11;
        String string = C0930Hv.A0R(bArr, i11, stringLimit2);
        this.A02 = i10;
        int stringLimit3 = this.A01;
        if (i10 < stringLimit3) {
            int stringLimit4 = i10 + 1;
            this.A02 = stringLimit4;
        }
        return string;
    }

    public final String A0R(int i10) {
        if (i10 == 0) {
            return A00(0, 0, 25);
        }
        int i11 = i10;
        int lastIndex = this.A02;
        int stringLength = lastIndex + i10;
        int i12 = stringLength - 1;
        int stringLength2 = this.A01;
        if (i12 < stringLength2) {
            int stringLength3 = this.A00[i12];
            if (stringLength3 == 0) {
                i11--;
            }
        }
        String strA0R = C0930Hv.A0R(this.A00, lastIndex, i11);
        String[] strArr = A04;
        String str = strArr[6];
        String str2 = strArr[4];
        int length = str.length();
        int stringLength4 = str2.length();
        if (length == stringLength4) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[6] = "dyM2aynMSNvMWhKjh5bvH5o1wH";
        strArr2[4] = "u6o51QVZzHu50";
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i10;
        return strA0R;
    }

    public final String A0S(int i10) {
        return A0T(i10, Charset.forName(A00(95, 5, 23)));
    }

    public final String A0T(int i10, Charset charset) {
        String str = new String(this.A00, this.A02, i10, charset);
        this.A02 += i10;
        return str;
    }

    public final short A0U() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        int i11 = i10 + 1;
        this.A02 = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.A02 = i11 + 1;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final void A0V() {
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0W(int i10) {
        A0b(A05() < i10 ? new byte[i10] : this.A00, i10);
    }

    public final void A0X(int i10) {
        HG.A03(i10 >= 0 && i10 <= this.A00.length);
        this.A01 = i10;
    }

    public final void A0Y(int i10) {
        HG.A03(i10 >= 0 && i10 <= this.A01);
        this.A02 = i10;
    }

    public final void A0Z(int i10) {
        A0Y(this.A02 + i10);
    }

    public final void A0a(C0913He c0913He, int i10) {
        A0c(c0913He.A00, 0, i10);
        c0913He.A07(0);
    }

    public final void A0b(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A01 = i10;
        this.A02 = 0;
    }

    public final void A0c(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.A00, this.A02, bArr, i10, i11);
        this.A02 += i11;
    }
}
