package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1437ak<T> implements C0Y<T> {
    public static byte[] A01;
    public static String[] A02 = {"MK0lJZb1G2RRFZEaFDTiwbPmIpRtYmde", "mY0WYGn7", "KMPGaiIzki7l9AH4HVkge6", "m9KV7hMB", "q4luaSiM5kuOIYzPzCoa1lP4AmyDrsGF", "uYbWOwnO0fDov", "", "4k"};
    public final String A00;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] - i12) - 99;
            if (A02[0].charAt(9) != '2') {
                throw new RuntimeException();
            }
            A02[4] = "xalbLzqPtLNAZMxuuBcoxRjt1J2nAJYQ";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{54, 61, 52, 52};
    }

    static {
        A03();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ak != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    public AbstractC1437ak(String str) {
        this.A00 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ak != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    public C0X A04(T t10) {
        return new C0X(this, t10 == null ? A02(0, 4, 101) : t10.toString());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ak != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    @Override // com.facebook.ads.redexgen.X.C0Y
    public final String getName() {
        return this.A00;
    }
}
