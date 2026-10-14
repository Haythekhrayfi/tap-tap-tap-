package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0889Ge {
    public static byte[] A07;
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final String A05;
    public final byte[] A06;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-125, 119, 105, -122, -103, -122, 120, -107, -118, -120, -128, -50};
    }

    public C0889Ge(Uri uri, long j10, long j11, long j12, String str, int i10) {
        this(uri, null, j10, j11, j12, str, i10);
    }

    public C0889Ge(Uri uri, long j10, long j11, String str) {
        this(uri, j10, j10, j11, str, 0);
    }

    public C0889Ge(Uri uri, long j10, long j11, String str, int i10) {
        this(uri, j10, j10, j11, str, i10);
    }

    public C0889Ge(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        boolean z10 = true;
        HG.A03(j10 >= 0);
        HG.A03(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        HG.A03(z10);
        this.A04 = uri;
        this.A06 = bArr;
        this.A01 = j10;
        this.A03 = j11;
        this.A02 = j12;
        this.A05 = str;
        this.A00 = i10;
    }

    public final boolean A02(int i10) {
        return (this.A00 & i10) == i10;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder().append(A00(2, 9, 16)).append(this.A04);
        String strA00 = A00(0, 2, 66);
        return sbAppend.append(strA00).append(Arrays.toString(this.A06)).append(strA00).append(this.A01).append(strA00).append(this.A03).append(strA00).append(this.A02).append(strA00).append(this.A05).append(strA00).append(this.A00).append(A00(11, 1, 92)).toString();
    }
}
