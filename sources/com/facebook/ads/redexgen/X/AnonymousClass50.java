package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.50, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass50 {
    public static byte[] A02;
    public static String[] A03 = {"WXpxlTya5H7kpLIT7UUfzIgXOYds4Vfk", "JVDNa5tAOP", "C1CZfaM4quGDjTOWU4x6KBGTC5pPu33J", "VymAVHyd", "K8p7KG0zsDoAf7GmBTiUCUpdPzk9iS4o", "MydLOSuorekD0WEADrXIrTB2aFx1Ufvf", "1zIVUT6Fxq52O6VZbnoN9TsXnO1jN3fj", "z9Q03TMU5lxkReREt3I6AE4mCa6N3G46"};
    public final ZH<AbstractC06224s, C06284y> A00 = new ZH<>();
    public final C05592e<AbstractC06224s> A01 = new C05592e<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-99, -59, -61, -60, 112, -64, -62, -65, -58, -71, -76, -75, 112, -74, -68, -79, -73, 112, -96, -94, -107, 112, -65, -62, 112, -96, -97, -93, -92};
    }

    static {
        A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r5 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r0 = r9 ^ (-1);
        r3.A00 &= r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r9 != 4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        r5 = r3.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r6 = r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (com.facebook.ads.redexgen.X.AnonymousClass50.A03[5].charAt(20) == 'R') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r2 = com.facebook.ads.redexgen.X.AnonymousClass50.A03;
        r2[0] = "LDlhycQGZBtlD6IMRSONBH11SqKxQWfy";
        r2[6] = "DCgYh9gvbnrpKHe96mnmPCff01xTtOfJ";
        r0 = r6 & 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r0 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        r7.A00.A0A(r4);
        com.facebook.ads.redexgen.X.C06284y.A02(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        r2 = com.facebook.ads.redexgen.X.AnonymousClass50.A03;
        r2[7] = "9mfdPnfY5V3FVy8Q2gQ6uDsmmOIXndsz";
        r2[2] = "ekMjHGebRREBiMI4gT56rHDvbCCByAvd";
        r0 = r6 & 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r0 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        r2 = com.facebook.ads.redexgen.X.AnonymousClass50.A03;
        r1 = r2[7];
        r2 = r2[2];
        r1 = r1.charAt(19);
        r0 = r2.charAt(19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if (r1 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        r2 = com.facebook.ads.redexgen.X.AnonymousClass50.A03;
        r2[1] = "AZoo0ocwP6";
        r2[3] = "Mxzo3dXJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        if (r9 != 8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        r5 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        if (r5 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        throw new java.lang.IllegalArgumentException(A01(0, 29, 9));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.ads.redexgen.X.C4V A00(com.facebook.ads.redexgen.X.AbstractC06224s r8, int r9) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass50.A00(com.facebook.ads.redexgen.X.4s, int):com.facebook.ads.redexgen.X.4V");
    }

    public final C4V A03(AbstractC06224s abstractC06224s) {
        return A00(abstractC06224s, 8);
    }

    public final C4V A04(AbstractC06224s abstractC06224s) {
        return A00(abstractC06224s, 4);
    }

    public final AbstractC06224s A05(long j10) {
        return this.A01.A08(j10);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C06284y.A01();
    }

    public final void A08(long j10, AbstractC06224s abstractC06224s) {
        this.A01.A0B(j10, abstractC06224s);
    }

    public final void A09(AbstractC06224s abstractC06224s) {
        C06284y c06284yA00 = this.A00.get(abstractC06224s);
        if (c06284yA00 == null) {
            c06284yA00 = C06284y.A00();
            this.A00.put(abstractC06224s, c06284yA00);
        }
        c06284yA00.A00 |= 1;
    }

    public final void A0A(AbstractC06224s abstractC06224s) {
        C06284y c06284y = this.A00.get(abstractC06224s);
        if (c06284y == null) {
            return;
        }
        c06284y.A00 &= -2;
    }

    public final void A0B(AbstractC06224s abstractC06224s) {
        for (int iA06 = this.A01.A06() - 1; iA06 >= 0; iA06--) {
            if (abstractC06224s == this.A01.A07(iA06)) {
                this.A01.A0A(iA06);
                break;
            }
        }
        C06284y info = this.A00.remove(abstractC06224s);
        if (info != null) {
            C06284y.A02(info);
        }
    }

    public final void A0C(AbstractC06224s abstractC06224s) {
        A0A(abstractC06224s);
    }

    public final void A0D(AbstractC06224s abstractC06224s, C4V c4v) {
        C06284y c06284yA00 = this.A00.get(abstractC06224s);
        if (c06284yA00 == null) {
            c06284yA00 = C06284y.A00();
            this.A00.put(abstractC06224s, c06284yA00);
        }
        c06284yA00.A00 |= 2;
        c06284yA00.A02 = c4v;
    }

    public final void A0E(AbstractC06224s abstractC06224s, C4V c4v) {
        C06284y c06284yA00 = this.A00.get(abstractC06224s);
        if (c06284yA00 == null) {
            c06284yA00 = C06284y.A00();
            this.A00.put(abstractC06224s, c06284yA00);
        }
        c06284yA00.A01 = c4v;
        c06284yA00.A00 |= 8;
    }

    public final void A0F(AbstractC06224s abstractC06224s, C4V c4v) {
        C06284y c06284yA00 = this.A00.get(abstractC06224s);
        if (c06284yA00 == null) {
            c06284yA00 = C06284y.A00();
            this.A00.put(abstractC06224s, c06284yA00);
        }
        c06284yA00.A02 = c4v;
        c06284yA00.A00 |= 4;
    }

    public final void A0G(InterfaceC06294z interfaceC06294z) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AbstractC06224s abstractC06224sA09 = this.A00.A09(size);
            C06284y record = this.A00.A0A(size);
            if ((record.A00 & 3) == 3) {
                interfaceC06294z.AFs(abstractC06224sA09);
            } else {
                int index = record.A00;
                if ((index & 1) != 0) {
                    if (record.A02 == null) {
                        interfaceC06294z.AFs(abstractC06224sA09);
                    } else {
                        C4V c4v = record.A02;
                        C4V c4v2 = record.A01;
                        if (A03[5].charAt(20) == 'R') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[1] = "fJVAe19tdP";
                        strArr[3] = "3fJsXDGb";
                        interfaceC06294z.ADq(abstractC06224sA09, c4v, c4v2);
                    }
                } else if ((record.A00 & 14) == 14) {
                    interfaceC06294z.ADo(abstractC06224sA09, record.A02, record.A01);
                } else if ((record.A00 & 12) == 12) {
                    interfaceC06294z.ADs(abstractC06224sA09, record.A02, record.A01);
                } else {
                    int index2 = record.A00;
                    if ((index2 & 4) != 0) {
                        interfaceC06294z.ADq(abstractC06224sA09, record.A02, null);
                    } else {
                        int index3 = record.A00;
                        if ((index3 & 8) != 0) {
                            interfaceC06294z.ADo(abstractC06224sA09, record.A02, record.A01);
                        }
                    }
                }
            }
            C06284y.A02(record);
        }
    }

    public final boolean A0H(AbstractC06224s abstractC06224s) {
        C06284y record = this.A00.get(abstractC06224s);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AbstractC06224s abstractC06224s) {
        C06284y record = this.A00.get(abstractC06224s);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
