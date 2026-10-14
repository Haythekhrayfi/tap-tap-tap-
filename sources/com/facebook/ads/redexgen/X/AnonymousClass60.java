package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.60, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass60 {
    public static byte[] A00;
    public static String[] A01 = {"zJ7sRo3sU3MwvYkxVq5sKXU", "uwqdBBQkb", "sk1pAaPClwmr1DZFuM4XEVJDjMgj4luU", "2DEAuAVf", "LM1sVeBw6DNfIdZzIYsj5hqYQDPEhJFy", "hYSBjzGCwuKpFZFqojmwIwdxMJLMCyYz", "BWOi5Qn34m6VEGTMmYfzcDYeX0GTjOOy", "rscTiGR64sMWr7IEiXLU0M2EjoTwZlLg"};
    public static final AtomicReference<C06545y> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-98, -90, -95, -100, -84, -77, -94, -81, -81, -90, -95, -94, -95, -97, -88, -97, -84, -93, -99, -20, -25, -23, -28, -30, -14, -7, -24, -11, -11, -20, -25, -24};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 68));
    }

    public static C06545y A00() {
        C06545y c06545y = A02.get();
        if (A01[6].charAt(15) == 'M') {
            String[] strArr = A01;
            strArr[3] = "GQnQs3ZS";
            strArr[1] = "yTwJu7KeR";
            C06545y c06545y2 = c06545y;
            if (c06545y2 == null) {
                C06545y c06545yA00 = C06545y.A00();
                String[] strArr2 = A01;
                if (strArr2[3].length() != strArr2[1].length()) {
                    A01[0] = "yvynwBtI7EoQ7kGRkYf58OE";
                    return c06545yA00;
                }
            } else {
                return c06545y2;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C06545y A01(com.facebook.ads.redexgen.X.C7Q r5, com.facebook.ads.redexgen.X.C06545y r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L28
        Lc:
            com.facebook.ads.redexgen.X.5y r0 = com.facebook.ads.redexgen.X.AnonymousClass66.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.7u r5 = r5.A07()
            int r4 = com.facebook.ads.redexgen.X.C06937v.A1Q
            com.facebook.ads.redexgen.X.7w r3 = new com.facebook.ads.redexgen.X.7w
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 6
            java.lang.String r0 = A04(r2, r1, r0)
            r5.A9K(r0, r4, r3)
        L28:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass60.A01(com.facebook.ads.redexgen.X.7Q, com.facebook.ads.redexgen.X.5y):com.facebook.ads.redexgen.X.5y");
    }

    public static C06545y A02(C7Q c7q, C06545y c06545y, C06555z c06555z) {
        AnonymousClass61 anonymousClass61A00 = null;
        try {
            if (IM.A06(c7q) && (c06545y == null || TextUtils.isEmpty(c06545y.A03()))) {
                anonymousClass61A00 = AnonymousClass62.A00(c7q.getContentResolver());
            }
        } catch (Throwable th) {
            c7q.A07().A9K(A04(12, 7, 6), C06937v.A1S, new C06947w(th));
        }
        if (anonymousClass61A00 != null && anonymousClass61A00.A01 != null) {
            A03.set(anonymousClass61A00.A01);
            c06555z.A05(anonymousClass61A00.A01);
        }
        if (c06545y == null && anonymousClass61A00 != null && !TextUtils.isEmpty(anonymousClass61A00.A00)) {
            return new C06545y(anonymousClass61A00.A00, anonymousClass61A00.A02, EnumC06535x.A05);
        }
        return c06545y;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 68);
        }
        return attributionId;
    }

    public static void A06(C06555z c06555z) {
        A02.set(c06555z.A02());
        A03.set(c06555z.A03());
    }

    public static void A07(C7Q c7q) {
        long jA01;
        C06545y c06545yA02;
        try {
            C06555z c06555z = new C06555z(c7q);
            A06(c06555z);
            if (A08()) {
                return;
            }
            AtomicReference<C06545y> atomicReference = A02;
            C06545y c06545y = atomicReference.get();
            if (c06545y != null && !TextUtils.isEmpty(c06545y.A03())) {
                jA01 = c06545y.A01();
            } else {
                jA01 = -1;
            }
            if (jA01 > 0) {
                long cacheTS = System.currentTimeMillis();
                if (cacheTS - jA01 < IM.A00(c7q)) {
                    return;
                }
            }
            if (IM.A07(c7q)) {
                c06545yA02 = A01(c7q, A02(c7q, null, c06555z));
            } else {
                c06545yA02 = A02(c7q, A01(c7q, null), c06555z);
            }
            if (c06545yA02 != null && !TextUtils.isEmpty(c06545yA02.A03())) {
                atomicReference.set(c06545yA02);
                c06555z.A04(c06545yA02);
            }
        } catch (Throwable t10) {
            c7q.A07().A9K(A04(12, 7, 6), C06937v.A1R, new C06947w(t10));
        }
    }

    public static boolean A08() {
        boolean z10 = false;
        boolean updated = KY.A04();
        if (updated) {
            if (A01[0].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "OqjdKmMb";
            strArr[1] = "Sbvi0a9C0";
            String strA04 = A04(0, 12, 9);
            boolean updated2 = KY.A05(strA04);
            if (updated2) {
                A03.set(KY.A01(strA04));
                z10 = true;
            }
        }
        boolean zA04 = KY.A04();
        String[] strArr2 = A01;
        if (strArr2[5].charAt(29) != strArr2[4].charAt(29)) {
            A01[6] = "1QSggKSi3jrfAw1MbHCsavUz8mNGSj1M";
            if (!zA04) {
                return z10;
            }
        } else {
            A01[6] = "SqTb5lTJEle7YRZML8ItyxwGEN07wws1";
            if (!zA04) {
                return z10;
            }
        }
        String strA05 = A04(19, 13, 79);
        boolean updated3 = KY.A05(strA05);
        if (updated3) {
            String strA01 = KY.A01(strA05);
            AtomicReference<C06545y> atomicReference = A02;
            if (strA01 == null) {
                strA01 = A04(0, 0, 68);
            }
            atomicReference.set(new C06545y(strA01, false, EnumC06535x.A04));
            return true;
        }
        return z10;
    }
}
