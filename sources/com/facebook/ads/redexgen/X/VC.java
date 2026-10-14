package com.facebook.ads.redexgen.X;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VC implements FU {
    public static byte[] A04;
    public final int A00;
    public final List<VD> A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{19};
    }

    public VC(List<VD> list) {
        this.A01 = list;
        int size = list.size();
        this.A00 = size;
        this.A02 = new long[size * 2];
        for (int i10 = 0; i10 < cueIndex; i10++) {
            VD vd2 = list.get(i10);
            int i11 = i10 * 2;
            this.A02[i11] = vd2.A01;
            int arrayIndex = i11 + 1;
            this.A02[arrayIndex] = vd2.A00;
        }
        long[] jArr = this.A02;
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        this.A03 = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final List<FT> A6S(long j10) {
        ArrayList arrayList = null;
        VD vd2 = null;
        SpannableStringBuilder normalCueTextBuilder = null;
        for (int i10 = 0; i10 < this.A00; i10++) {
            long[] jArr = this.A02;
            if (jArr[i10 * 2] <= j10 && j10 < jArr[(i10 * 2) + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                VD vd3 = this.A01.get(i10);
                if (vd3.A00()) {
                    if (vd2 == null) {
                        vd2 = vd3;
                    } else {
                        String strA00 = A00(0, 1, 53);
                        if (normalCueTextBuilder == null) {
                            normalCueTextBuilder = new SpannableStringBuilder();
                            normalCueTextBuilder.append(vd2.A0C).append((CharSequence) strA00).append(vd3.A0C);
                        } else {
                            normalCueTextBuilder.append((CharSequence) strA00).append(vd3.A0C);
                        }
                    }
                } else {
                    arrayList.add(vd3);
                }
            }
        }
        if (normalCueTextBuilder != null) {
            arrayList.add(new VD(normalCueTextBuilder));
        } else if (vd2 != null) {
            arrayList.add(vd2);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final long A6s(int i10) {
        boolean z10 = true;
        HG.A03(i10 >= 0);
        if (i10 >= this.A03.length) {
            z10 = false;
        }
        HG.A03(z10);
        return this.A03[i10];
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final int A6t() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final int A7K(long j10) {
        int iA0A = C0930Hv.A0A(this.A03, j10, false, false);
        int index = this.A03.length;
        if (iA0A < index) {
            return iA0A;
        }
        return -1;
    }
}
