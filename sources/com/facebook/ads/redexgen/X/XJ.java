package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XJ<T> implements InterfaceC07108n<T> {
    public static byte[] A06;
    public C07038f A00;
    public C07038f A01;
    public List<XJ<T>.RecordFileBasedFetch> A02;
    public boolean A03;
    public final C07028e A04;
    public final C07178u A05;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-28, 2, 15, -63, 16, 15, 13, Ascii.SUB, -63, 5, 6, 13, 6, 21, 6, -63, 4, 22, 19, 20, 16, 19, 20, -63, 17, 16, 10, 15, 21, 10, 15, 8, -63, 2, 21, -63, 21, 9, 6, -63, 5, 2, 21, 2, 3, 2, 20, 6, -63, 20, 21, 2, 19, 21, -38, 12, 9, 10, 6, 9, -73, 7, 6, 10, 0, 11, 0, 6, 5, -73, 0, 10, -73, -8, 11, -73, -65, -68, -5, -61, -68, -5, -64, -61, -73, -8, 5, -5, -73, 9, -4, -6, 6, 9, -5, -73, -3, 0, 3, -4, -73, 10, -4, 8, 12, -4, 5, -6, -4, -73, 10, 11, -8, 9, 11, 10, -73, -8, 11, -73, -65, -68, -5, -61, -68, -5, -64, -47, -73, -5, -8, 11, -8, -73, -1, -8, 10, -73, 7, 9, 6, -7, -8, -7, 3, 16, -73, -7, -4, -4, 5, -73, 3, 6, 10, 11, -78, -28, -31, -30, -34, -31, -113, -33, -34, -30, -40, -29, -40, -34, -35, -113, -40, -30, -113, -48, -29, -113, -105, -108, -45, -101, -108, -45, -104, -101, -113, -47, -28, -29, -113, -31, -44, -46, -34, -31, -45, -113, -43, -40, -37, -44, -113, -30, -44, -32, -28, -44, -35, -46, -44, -113, -34, -35, -37, -24, -113, -41, -48, -30, -113, -43, -40, -37, -44, -113, -108, -45, -87, -113, -45, -48, -29, -48, -113, -41, -48, -30, -113, -33, -31, -34, -47, -48, -47, -37, -24, -113, -47, -44, -44, -35, -113, -37, -34, -30, -29, -27, 0, 8, 11, 4, 3, -65, 19, 14, -65, 0, 3, 3, -65, 3, 0, 19, 0, -65, 19, 14, -65, 11, 14, 6, -72, -45, -37, -34, -41, -42, -110, -26, -31, -110, -43, -34, -41, -45, -28, -110, -42, -45, -26, -45, -44, -45, -27, -41, -9, 18, Ascii.SUB, Ascii.GS, 22, 21, -47, 37, 32, -47, 23, 22, 37, 20, Ascii.EM, -47, 21, 18, 37, 18, -47, 23, 35, 32, Ascii.RS, -47, Ascii.GS, 32, Ascii.CAN, 34, 61, 69, 72, 65, 64, -4, 80, 75, -4, 67, 65, 80, -4, 78, 65, 63, 75, 78, 64, -4, 63, 75, 81, 74, 80, 5, 32, 40, 43, 36, 35, -33, 51, 46, -33, 52, 47, 35, 32, 51, 36, -33, 37, 40, 43, 36, -33, 50, 36, 48, 52, 36, 45, 34, 36, 43, 62, 60, 72, 75, 61, Ascii.US, 66, 69, 62, Ascii.ESC, 58, 76, 62, 61, 43, 62, 60, 72, 75, 61, Ascii.GS, 58, 77, 58, 59, 58, 76, 62, -7, 60, 69, 72, 76, 62, 61, -8, 11, 9, 21, Ascii.CAN, 10, -20, 15, 18, 11, -24, 7, Ascii.EM, 11, 10, -8, 11, 9, 21, Ascii.CAN, 10, -22, 7, Ascii.SUB, 7, 8, 7, Ascii.EM, 11, -58, 15, Ascii.EM, -58, 9, 18, 21, Ascii.EM, 11, 10, -24, 1, -2, 1, 2, 10, 1, -77, -27, -8, -10, 2, 5, -9, -39, -4, -1, -8, -43, -12, 6, -8, -9, -27, -8, -10, 2, 5, -9, -41, -12, 7, -12, -11, -12, 6, -8, -77, -7, -8, 7, -10, -5, 11, Ascii.GS, Ascii.SUB, Ascii.ESC, 23, Ascii.SUB, 5, 2, 21, 2};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/XJ<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(XK xk) {
        if (!this.A02.remove(xk)) {
            return false;
        }
        if (xk.A5a() > 0 && xk.A01().A02.A05(xk.A01().A01).equals(this.A01)) {
            this.A01 = xk.A00().A02;
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XJ != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public XJ(C07078k c07078k, InterfaceC07158s interfaceC07158s) throws IOException {
        this.A05 = new C07178u(c07078k.A04(A00(515, 4, 63)), interfaceC07158s);
        C07028e c07028e = new C07028e(new File(c07078k.A05(), A00(509, 6, 70)));
        this.A04 = c07028e;
        this.A00 = c07028e.A03();
        this.A02 = new ArrayList();
        A05(interfaceC07158s);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XJ != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A02(int i10, int i11) throws IOException {
        C07038f c07038f = new C07038f(i10, i11);
        this.A00 = c07038f;
        this.A04.A04(c07038f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XJ != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XK != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/XJ<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(XK xk) throws C07198w {
        if (!this.A03) {
            if (A06(xk)) {
                if (xk.A5a() == 0) {
                    return;
                }
                if (this.A00.A04(xk.A00().A02) == 0) {
                    try {
                        Iterator<C07148r> it = xk.A00.iterator();
                        while (it.hasNext()) {
                            if (it.next().A00 == this.A05.A07() && this.A05.A0D()) {
                                A02(this.A05.A06(), 0);
                            } else {
                                A02(this.A05.A06(), xk.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A04(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e10) {
                        throw new C07198w(A00(361, 30, 93), e10);
                    }
                }
                throw new C07198w(A00(0, 54, 63));
            }
            throw new C07198w(A00(466, 43, 49));
        }
        throw new C07198w(A00(427, 39, 68));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XJ != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A05(InterfaceC07158s interfaceC07158s) throws IOException {
        C07038f c07038f = new C07038f(this.A05.A06(), 0);
        C07038f recordSequenceStart = this.A00;
        if (c07038f.A04(recordSequenceStart) > 0) {
            Locale locale = Locale.US;
            C07038f recordSequenceStart2 = this.A00;
            C07038f recordSequenceStart3 = this.A00;
            interfaceC07158s.AEU(String.format(locale, A00(54, 102, 53), Integer.valueOf(recordSequenceStart2.A02()), Integer.valueOf(recordSequenceStart3.A03()), Integer.valueOf(c07038f.A02()), Integer.valueOf(c07038f.A03())));
            this.A00 = c07038f;
            return;
        }
        while (iA02 < recordSequenceStart.A02()) {
            if (this.A05.A0D()) {
                c07038f = new C07038f(this.A05.A06(), 0);
            } else {
                Locale locale2 = Locale.US;
                C07038f recordSequenceStart4 = this.A00;
                C07038f recordSequenceStart5 = this.A00;
                interfaceC07158s.AEU(String.format(locale2, A00(156, 101, 13), Integer.valueOf(recordSequenceStart4.A02()), Integer.valueOf(recordSequenceStart5.A03()), Integer.valueOf(c07038f.A02())));
                C07038f c07038f2 = new C07038f(this.A05.A06(), this.A05.A07());
                this.A00 = c07038f2;
                this.A04.A04(c07038f2);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XJ != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XK != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07108n
    public final synchronized InterfaceC07098m A5Z(byte[] bArr, int[] iArr) throws C07198w {
        XJ<T>.RecordFileBasedFetch xk;
        if (!this.A03) {
            int i10 = 0;
            int i11 = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean mayHaveMoreData = true;
                while (true) {
                    C07058i c07058iA0A = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, i10, iArr, i11);
                    int iA00 = c07058iA0A.A01().A00();
                    int storageOffset = c07058iA0A.A01().A01();
                    int i12 = iA00 - storageOffset;
                    int storageOffset2 = c07058iA0A.A01().A02();
                    i10 += storageOffset2;
                    i11 += i12;
                    if (c07058iA0A.A01().A03() == EnumC07048g.A02) {
                        arrayList.add(c07058iA0A);
                    }
                    if (c07058iA0A.A01().A03() == EnumC07048g.A03) {
                        break;
                    }
                    if (c07058iA0A.A01().A03() == EnumC07048g.A04) {
                        int countsOffset = this.A05.A06();
                        int storageOffset3 = this.A05.A08();
                        int countsOffset2 = countsOffset + storageOffset3;
                        int storageOffset4 = this.A01.A02();
                        if (countsOffset2 == storageOffset4 + 1) {
                            mayHaveMoreData = false;
                            break;
                        }
                        int storageOffset5 = this.A01.A02();
                        this.A01 = new C07038f(storageOffset5 + 1, 0);
                    } else {
                        this.A01 = this.A01.A05(i12);
                    }
                }
                xk = new XK(this, arrayList, mayHaveMoreData);
                this.A02.add(xk);
                if (!arrayList.isEmpty()) {
                    C07038f c07038f = xk.A01().A02;
                    int storageOffset6 = xk.A01().A01;
                    this.A01 = c07038f.A05(storageOffset6);
                }
            } catch (IOException e10) {
                throw new C07198w(A00(306, 29, 79), e10);
            }
        } else {
            throw new C07198w(A00(391, 36, 119));
        }
        return xk;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XJ != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07108n
    public final synchronized int A7e() throws C07198w {
        int iA09;
        if (!this.A03) {
            try {
                iA09 = this.A05.A09();
                int iA02 = this.A00.A02();
                int count = this.A05.A06();
                if (iA02 == count) {
                    int count2 = this.A00.A03();
                    iA09 -= count2;
                }
            } catch (IOException e10) {
                throw new C07198w(A00(335, 26, 122), e10);
            }
        } else {
            throw new C07198w(A00(427, 39, 68));
        }
        return iA09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XJ != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07108n
    public final synchronized void AFf(byte[] bArr) throws C07198w {
        if (!this.A03) {
            try {
                this.A05.A0C(bArr);
            } catch (IOException e10) {
                throw new C07198w(A00(257, 25, 61), e10);
            }
        } else {
            throw new C07198w(A00(427, 39, 68));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XJ != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07108n
    public final synchronized void clear() throws C07198w {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (IOException e10) {
            throw new C07198w(A00(282, 24, 16), e10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XJ != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
