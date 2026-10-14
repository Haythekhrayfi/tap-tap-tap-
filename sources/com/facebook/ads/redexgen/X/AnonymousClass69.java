package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.69, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass69 {
    public static C6A A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-24, -21, -12, -23, -18, -13, -25, -8, -15};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (AnonymousClass69.class) {
            if (A00 == null) {
                return;
            }
            C06947w c06947w = new C06947w(A00.AET());
            c06947w.A03(1);
            C1336Xv c1336XvA00 = C7P.A00();
            if (c1336XvA00 != null) {
                c1336XvA00.A07().A9K(A00(0, 9, 109), 3401, c06947w);
            }
            A00.reset();
        }
    }

    public static void A03(final long j10) {
        if (j10 > 0) {
            A00 = new Y5();
            new Thread(j10) { // from class: com.facebook.ads.redexgen.X.6B
                public final long A00;

                {
                    this.A00 = j10;
                    start();
                }

                /* JADX WARN: Bottom block not found for handler: all -> 0x0011 */
                @Override // java.lang.Thread, java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() throws java.lang.Throwable {
                    /*
                        r3 = this;
                        boolean r0 = com.facebook.ads.redexgen.X.C0979Jw.A02(r3)
                        if (r0 == 0) goto L7
                        return
                    L7:
                        r2 = r3
                    L8:
                        long r0 = r2.A00     // Catch: java.lang.InterruptedException -> Ld java.lang.Throwable -> L11
                        java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Ld java.lang.Throwable -> L11
                    Ld:
                        com.facebook.ads.redexgen.X.AnonymousClass69.A01()     // Catch: java.lang.Throwable -> L11
                        goto L8
                    L11:
                        r0 = move-exception
                        com.facebook.ads.redexgen.X.C0979Jw.A00(r0, r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C6B.run():void");
                }
            };
        }
    }
}
