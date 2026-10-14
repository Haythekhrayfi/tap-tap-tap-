package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Bw {
    public static String[] A02 = {"ESBDEf5TGpIlPNlaK", "CFy8tTB", "6qe0qu0ibVEcKGfh7EvVwRhtqHBuEa1w", "V1Y5IBnxryXU9mIwJ4bJ5ToLD3C0Yk13", "4NTFTO6GqkeHPDwUARd0ySppWOd6l1dR", "CrEf7MIuMgaulYPqfRythdBqg4S56GJr", "vnXboZq45YJMaiP9ml0KXw1b9fE53h1M", "mdidS6i6KL2UNszMr3NEyBGV7VKvKKkC"};
    public int A00;
    public final C0914Hf A01 = new C0914Hf(8);

    private long A00(BZ bz) throws InterruptedException, IOException {
        bz.ADa(this.A01.A00, 0, 1);
        int i10 = this.A01.A00[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int mask = 128;
        int length = 0;
        while (value == 0) {
            mask >>= 1;
            length++;
        }
        int value = mask ^ (-1);
        int i11 = i10 & value;
        bz.ADa(this.A01.A00, 1, length);
        for (int i12 = 0; i12 < length; i12++) {
            int value2 = i12 + 1;
            i11 = (i11 << 8) + (this.A01.A00[value2] & 255);
        }
        int mask2 = this.A00;
        int value3 = length + 1;
        this.A00 = mask2 + value3;
        return i11;
    }

    public final boolean A01(BZ bz) throws InterruptedException, IOException {
        long jA7A = bz.A7A();
        long j10 = 1024;
        if (jA7A != -1 && jA7A <= 1024) {
            j10 = jA7A;
        }
        int i10 = (int) j10;
        bz.ADa(this.A01.A00, 0, 4);
        long jA0M = this.A01.A0M();
        this.A00 = 4;
        while (jA0M != 440786851) {
            int bytesToSearch = this.A00 + 1;
            this.A00 = bytesToSearch;
            String[] strArr = A02;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "l1PkIDTfiQThV6hLB2tjOKdQnzuVnbjV";
            strArr2[7] = "5y1xvAdDSVehJ56urXHmNFO2pNzfP9GT";
            if (bytesToSearch == i10) {
                return false;
            }
            bz.ADa(this.A01.A00, 0, 1);
            jA0M = ((jA0M << 8) & (-256)) | ((long) (this.A01.A00[0] & 255));
        }
        long jA00 = A00(bz);
        long j11 = this.A00;
        if (jA00 == Long.MIN_VALUE || (jA7A != -1 && j11 + jA00 >= jA7A)) {
            return false;
        }
        while (true) {
            int i11 = this.A00;
            if (i11 >= j11 + jA00) {
                return ((long) i11) == j11 + jA00;
            }
            long jA01 = A00(bz);
            if (A02[2].charAt(30) == 'F') {
                throw new RuntimeException();
            }
            A02[4] = "KE3nQOOCyGcxuS2VNFQSv9Xwlad9oCTx";
            if (jA01 == Long.MIN_VALUE) {
                return false;
            }
            long jA02 = A00(bz);
            if (jA02 >= 0) {
                if (A02[5].charAt(8) != 'M') {
                    throw new RuntimeException();
                }
                A02[4] = "oAhGCMJduqwag2F3qzvWFprzvodLwUMc";
                if (jA02 <= 2147483647L) {
                    if (jA02 != 0) {
                        int i12 = (int) jA02;
                        String[] strArr3 = A02;
                        if (strArr3[0].length() != strArr3[1].length()) {
                            String[] strArr4 = A02;
                            strArr4[3] = "DpgTASio69ZqWxB525eChTWXhoKF6GpR";
                            strArr4[7] = "IdVdUYmR5RRrY4br74pFew5qFgYpPWK6";
                            bz.A3R(i12);
                            this.A00 += i12;
                        } else {
                            A02[4] = "dJss32nVjAcsiV2OBHnTjFQq6mdmK3qb";
                            bz.A3R(i12);
                            this.A00 += i12;
                        }
                    }
                }
            }
            return false;
        }
    }
}
