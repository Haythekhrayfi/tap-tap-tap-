package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4h, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C4h {
    public static String[] A02 = {"hO0SXlIn7n5HXEBLx", "jESNVpuYnHPlnh4DZ", "CDLwN7DwmtArlNd144q1QIOvLDqs4yZF", "JntNhgZ58kYFXbwiJ6hzeVdvPNGn00kF", "yTsWpbzmHeCmcQEDkb0QkT5J3TV6CkfD", "Lh9pded4Clz2", "gnDNjs3GBImfOnnM5uEQWokXBd1c", "C4tnEN178k9sL9bIxtVolUttiI5dEdE5"};
    public SparseArray<C06114g> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j10, long j11) {
        if (j10 == 0) {
            return j11;
        }
        long j12 = j10 / 4;
        String[] strArr = A02;
        if (strArr[3].charAt(9) != strArr[7].charAt(9)) {
            throw new RuntimeException();
        }
        A02[4] = "GTVZcsVJP0WVKaHbsMtSVk9gu6Gyk4Ss";
        return (j12 * 3) + (j11 / 4);
    }

    private C06114g A01(int i10) {
        C06114g c06114g = this.A00.get(i10);
        if (c06114g == null) {
            C06114g c06114g2 = new C06114g();
            this.A00.put(i10, c06114g2);
            return c06114g2;
        }
        return c06114g;
    }

    private final void A02() {
        for (int i10 = 0; i10 < i; i10++) {
            this.A00.valueAt(i10).A03.clear();
        }
    }

    public final AbstractC06224s A03(int i10) {
        C06114g c06114g = this.A00.get(i10);
        if (c06114g != null && !c06114g.A03.isEmpty()) {
            ArrayList<AbstractC06224s> arrayList = c06114g.A03;
            if (A02[4].charAt(1) != 'T') {
                throw new RuntimeException();
            }
            A02[6] = "6zOEmNGiTAHU1v9SGa3";
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i10, long j10) {
        C06114g c06114gA01 = A01(i10);
        c06114gA01.A01 = A00(c06114gA01.A01, j10);
    }

    public final void A06(int i10, long j10) {
        C06114g c06114gA01 = A01(i10);
        c06114gA01.A02 = A00(c06114gA01.A02, j10);
    }

    public final void A07(C4O c4o) {
        this.A01++;
    }

    public final void A08(C4O c4o, C4O c4o2, boolean z10) {
        if (c4o != null) {
            A04();
        }
        if (!z10 && this.A01 == 0) {
            A02();
        }
        if (c4o2 != null) {
            A07(c4o2);
        }
    }

    public final void A09(AbstractC06224s abstractC06224s) {
        int iA0H = abstractC06224s.A0H();
        ArrayList<AbstractC06224s> arrayList = A01(iA0H).A03;
        int i10 = this.A00.get(iA0H).A00;
        int viewType = arrayList.size();
        if (i10 <= viewType) {
            return;
        }
        abstractC06224s.A0Q();
        String[] strArr = A02;
        String str = strArr[3];
        String str2 = strArr[7];
        int iCharAt = str.charAt(9);
        int viewType2 = str2.charAt(9);
        if (iCharAt != viewType2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "TnDeXYrDbfmyODeGX";
        strArr2[5] = "ziritv0xfrad";
        arrayList.add(abstractC06224s);
    }

    public final boolean A0A(int i10, long j10, long j11) {
        long j12 = A01(i10).A01;
        return j12 == 0 || j10 + j12 < j11;
    }

    public final boolean A0B(int i10, long j10, long j11) {
        long j12 = A01(i10).A02;
        return j12 == 0 || j10 + j12 < j11;
    }
}
