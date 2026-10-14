package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z0 implements C4I {
    public static byte[] A08;
    public static String[] A09 = {"X1JWoRd1RTsi5LXg3YfkE890Z0SkAp6s", "8cHG76lMVFwKxBGRg2kgut24eHhxfbd", "G9TzZa55JFGh4eGgvGtqHGY1m3qrW6LM", "T7A4lgHZzGr7V1uQcw7LfDSO4lerGRH7", "wT7nveBXif1G6UL4LkiEJi9kfhK", "XR1Jqmc9zxsTs7lfyBsyi3NvUHLKhP3K", "pVA6ZWYUVwE4UScIoRBBosOqE3FsfWwK", "nWmw"};
    public int A00;
    public InterfaceC05662l<C06003v> A01;
    public final InterfaceC05993u A02;
    public final C4J A03;
    public final Runnable A04;
    public final ArrayList<C06003v> A05;
    public final ArrayList<C06003v> A06;
    public final boolean A07;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-100, -75, -78, -75, -74, -66, -75, 103, -68, -73, -85, -88, -69, -84, 103, -74, -73, 103, -69, -64, -73, -84, 103, -83, -74, -71, 103, -44, -45, -47, -34, -123, -41, -54, -46, -44, -37, -54, -123, -58, -45, -55, -123, -38, -43, -55, -58, -39, -54, -123, -44, -43, -40, -123, -56, -58, -45, -123, -57, -54, -123, -55, -50, -40, -43, -58, -39, -56, -51, -54, -55, -123, -50, -45, -123, -53, -50, -41, -40, -39, -123, -43, -58, -40, -40, -24, -23, -103, -20, -31, -24, -18, -27, -35, -103, -37, -34, -103, -21, -34, -26, -24, -17, -34, -103, -24, -21, -103, -18, -23, -35, -38, -19, -34, -89, Ascii.RS, 19, Ascii.SUB, 32, 23, 15, -53, Ascii.EM, Ascii.SUB, Ascii.US, -53, 15, 20, Ascii.RS, Ascii.ESC, 12, Ascii.US, 14, 19, -53, 12, 15, 15, -53, Ascii.SUB, Ascii.GS, -53, Ascii.CAN, Ascii.SUB, 33, 16, -53, 17, Ascii.SUB, Ascii.GS, -53, Ascii.ESC, Ascii.GS, 16, -53, 23, 12, 36, Ascii.SUB, 32, Ascii.US};
    }

    static {
        A03();
    }

    public Z0(InterfaceC05993u interfaceC05993u) {
        this(interfaceC05993u, false);
    }

    public Z0(InterfaceC05993u interfaceC05993u, boolean z10) {
        this.A01 = new ZG(30);
        this.A05 = new ArrayList<>();
        this.A06 = new ArrayList<>();
        this.A00 = 0;
        this.A02 = interfaceC05993u;
        this.A07 = z10;
        this.A03 = new C4J(this);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    private int A00(int i10, int i11) {
        int i12;
        int count;
        int count2 = this.A06.size();
        for (int i13 = count2 - 1; i13 >= 0; i13--) {
            C06003v c06003v = this.A06.get(i13);
            int count3 = c06003v.A00;
            if (count3 == 8) {
                int i14 = c06003v.A02;
                int count4 = c06003v.A01;
                if (i14 < count4) {
                    i12 = c06003v.A02;
                    count = c06003v.A01;
                } else {
                    i12 = c06003v.A01;
                    count = c06003v.A02;
                }
                if (i10 >= i12 && i10 <= count) {
                    int count5 = c06003v.A02;
                    if (i12 == count5) {
                        if (i11 == 1) {
                            int count6 = c06003v.A01;
                            c06003v.A01 = count6 + 1;
                        } else if (i11 == 2) {
                            int count7 = c06003v.A01;
                            c06003v.A01 = count7 - 1;
                        }
                        i10++;
                    } else {
                        if (i11 == 1) {
                            int count8 = c06003v.A02;
                            c06003v.A02 = count8 + 1;
                        } else if (i11 == 2) {
                            int count9 = c06003v.A02;
                            c06003v.A02 = count9 - 1;
                        }
                        i10--;
                    }
                } else {
                    int count10 = c06003v.A02;
                    if (i10 < count10) {
                        if (i11 == 1) {
                            int count11 = c06003v.A02;
                            c06003v.A02 = count11 + 1;
                            int count12 = c06003v.A01;
                            c06003v.A01 = count12 + 1;
                        } else if (i11 == 2) {
                            int count13 = c06003v.A02;
                            c06003v.A02 = count13 - 1;
                            int count14 = c06003v.A01;
                            c06003v.A01 = count14 - 1;
                        }
                    }
                }
            } else {
                int count15 = c06003v.A02;
                if (count15 <= i10) {
                    int count16 = c06003v.A00;
                    if (count16 == 1) {
                        int i15 = c06003v.A01;
                        int i16 = A09[7].length();
                        if (i16 != 4) {
                            throw new RuntimeException();
                        }
                        A09[7] = "N0sU";
                        i10 -= i15;
                    } else {
                        int count17 = c06003v.A00;
                        if (count17 == 2) {
                            int count18 = c06003v.A01;
                            i10 += count18;
                        }
                    }
                } else if (i11 == 1) {
                    int count19 = c06003v.A02;
                    c06003v.A02 = count19 + 1;
                } else if (i11 == 2) {
                    int count20 = c06003v.A02;
                    c06003v.A02 = count20 - 1;
                }
            }
        }
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            C06003v c06003v2 = this.A06.get(size);
            int count21 = c06003v2.A00;
            if (count21 == 8) {
                int i17 = c06003v2.A01;
                int count22 = c06003v2.A02;
                if (i17 != count22) {
                    int count23 = c06003v2.A01;
                    if (count23 < 0) {
                        this.A06.remove(size);
                        AE8(c06003v2);
                    }
                } else {
                    this.A06.remove(size);
                    AE8(c06003v2);
                }
            } else {
                int count24 = c06003v2.A01;
                if (count24 <= 0) {
                    this.A06.remove(size);
                    AE8(c06003v2);
                }
            }
        }
        return i10;
    }

    private final int A01(int i10, int i11) {
        int size = this.A06.size();
        while (i11 < size) {
            C06003v c06003v = this.A06.get(i11);
            int i12 = c06003v.A00;
            if (i12 == 8) {
                int count = c06003v.A02;
                if (count == i10) {
                    i10 = c06003v.A01;
                } else {
                    int count2 = c06003v.A02;
                    if (count2 < i10) {
                        i10--;
                    }
                    int count3 = c06003v.A01;
                    if (count3 <= i10) {
                        i10++;
                    }
                }
            } else {
                int count4 = c06003v.A02;
                if (count4 <= i10) {
                    int i13 = c06003v.A00;
                    if (i13 == 2) {
                        int i14 = c06003v.A02;
                        int count5 = c06003v.A01;
                        if (i10 < i14 + count5) {
                            return -1;
                        }
                        int count6 = c06003v.A01;
                        i10 -= count6;
                    } else {
                        int i15 = c06003v.A00;
                        String[] strArr = A09;
                        String str = strArr[6];
                        String str2 = strArr[5];
                        int i16 = str.charAt(31);
                        int count7 = str2.charAt(31);
                        if (i16 != count7) {
                            throw new RuntimeException();
                        }
                        A09[1] = "6d2Cvy1MfGwOem3AHh21iiz4RwVuOhP";
                        if (i15 == 1) {
                            int count8 = c06003v.A01;
                            i10 += count8;
                        }
                    }
                } else {
                    continue;
                }
            }
            i11++;
        }
        return i10;
    }

    private void A04(C06003v c06003v) {
        A09(c06003v);
    }

    private void A05(C06003v c06003v) {
        A09(c06003v);
    }

    private void A06(C06003v c06003v) {
        int i10 = c06003v.A02;
        int i11 = 0;
        int i12 = c06003v.A02;
        int tmpStart = c06003v.A01;
        int i13 = i12 + tmpStart;
        byte b10 = -1;
        int i14 = c06003v.A02;
        while (i14 < i13) {
            int tmpEnd = 0;
            if (this.A02.A5d(i14) != null || A0C(i14)) {
                if (b10 == 0) {
                    A08(AA7(2, i10, i11, null));
                    tmpEnd = 1;
                }
                b10 = 1;
            } else {
                if (b10 == 1) {
                    A09(AA7(2, i10, i11, null));
                    tmpEnd = 1;
                }
                b10 = 0;
            }
            if (tmpEnd != 0) {
                i14 -= i11;
                i13 -= i11;
                i11 = 1;
            } else {
                i11++;
            }
            i14++;
        }
        int tmpStart2 = c06003v.A01;
        if (i11 != tmpStart2) {
            AE8(c06003v);
            c06003v = AA7(2, i10, i11, null);
        }
        if (b10 == 0) {
            A08(c06003v);
        } else {
            A09(c06003v);
        }
    }

    private void A07(C06003v c06003v) {
        int i10 = c06003v.A02;
        int i11 = 0;
        int i12 = c06003v.A02;
        int tmpStart = c06003v.A01;
        int position = i12 + tmpStart;
        byte b10 = -1;
        int type = c06003v.A02;
        while (true) {
            String[] strArr = A09;
            String str = strArr[6];
            String str2 = strArr[5];
            int tmpCount = str.charAt(31);
            int tmpStart2 = str2.charAt(31);
            if (tmpCount != tmpStart2) {
                throw new RuntimeException();
            }
            A09[0] = "QVMb2fRXyzWHiAZPpRD1aZXDVthvAAWC";
            if (type < position) {
                if (this.A02.A5d(type) != null || A0C(type)) {
                    if (b10 == 0) {
                        A08(AA7(4, i10, i11, c06003v.A03));
                        i11 = 0;
                        i10 = type;
                    }
                    b10 = 1;
                } else {
                    if (b10 == 1) {
                        A09(AA7(4, i10, i11, c06003v.A03));
                        i11 = 0;
                        i10 = type;
                    }
                    b10 = 0;
                }
                i11++;
                type++;
            } else {
                int tmpStart3 = c06003v.A01;
                if (i11 != tmpStart3) {
                    Object obj = c06003v.A03;
                    AE8(c06003v);
                    c06003v = AA7(4, i10, i11, obj);
                }
                if (b10 == 0) {
                    A08(c06003v);
                    return;
                } else {
                    A09(c06003v);
                    return;
                }
            }
        }
    }

    private void A08(C06003v c06003v) {
        int i10;
        if (c06003v.A00 != 1) {
            int i11 = c06003v.A00;
            if (A09[4].length() == 28) {
                throw new RuntimeException();
            }
            A09[7] = "fuh7";
            if (i11 != 8) {
                int offsetPositionForPartial = A00(c06003v.A02, c06003v.A00);
                int tmpCnt = 1;
                int positionMultiplier = c06003v.A02;
                int tmpStart = c06003v.A00;
                switch (tmpStart) {
                    case 2:
                        i10 = 0;
                        break;
                    case 3:
                    default:
                        throw new IllegalArgumentException(A02(85, 30, 55) + c06003v);
                    case 4:
                        i10 = 1;
                        break;
                }
                for (int p10 = 1; p10 < tmpStart; p10++) {
                    int tmpStart2 = i10 * p10;
                    int i12 = c06003v.A02 + tmpStart2;
                    int tmpStart3 = c06003v.A00;
                    int iA00 = A00(i12, tmpStart3);
                    int pos = 0;
                    int tmpStart4 = c06003v.A00;
                    switch (tmpStart4) {
                        case 2:
                            pos = iA00 == offsetPositionForPartial ? 1 : 0;
                            break;
                        case 4:
                            int tmpStart5 = offsetPositionForPartial + 1;
                            pos = iA00 == tmpStart5 ? 1 : 0;
                            break;
                    }
                    if (pos != 0) {
                        tmpCnt++;
                    } else {
                        C06003v c06003vAA7 = AA7(c06003v.A00, offsetPositionForPartial, tmpCnt, c06003v.A03);
                        A0A(c06003vAA7, positionMultiplier);
                        AE8(c06003vAA7);
                        if (c06003v.A00 == 4) {
                            positionMultiplier += tmpCnt;
                        }
                        offsetPositionForPartial = iA00;
                        String[] strArr = A09;
                        String str = strArr[3];
                        String str2 = strArr[2];
                        int iCharAt = str.charAt(27);
                        int tmpStart6 = str2.charAt(27);
                        if (iCharAt != tmpStart6) {
                            tmpCnt = 1;
                        } else {
                            A09[1] = "yo86shE8ew7ry1OmrvVtBHjQ2wHk5Ec";
                            tmpCnt = 1;
                        }
                    }
                }
                Object payload = c06003v.A03;
                AE8(c06003v);
                if (tmpCnt > 0) {
                    int tmpStart7 = c06003v.A00;
                    C06003v c06003vAA8 = AA7(tmpStart7, offsetPositionForPartial, tmpCnt, payload);
                    if (A09[7].length() != 4) {
                        throw new RuntimeException();
                    }
                    A09[4] = "6SUXoeHtz7oI0Lc";
                    A0A(c06003vAA8, positionMultiplier);
                    AE8(c06003vAA8);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException(A02(115, 46, 105));
    }

    private void A09(C06003v c06003v) {
        this.A06.add(c06003v);
        switch (c06003v.A00) {
            case 1:
                this.A02.AA8(c06003v.A02, c06003v.A01);
                return;
            case 2:
                this.A02.AAB(c06003v.A02, c06003v.A01);
                return;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                throw new IllegalArgumentException(A02(0, 27, 5) + c06003v);
            case 4:
                this.A02.A9o(c06003v.A02, c06003v.A01, c06003v.A03);
                return;
            case 8:
                this.A02.AA9(c06003v.A02, c06003v.A01);
                return;
        }
    }

    private final void A0A(C06003v c06003v, int i10) {
        this.A02.AAt(c06003v);
        switch (c06003v.A00) {
            case 2:
                this.A02.AAA(i10, c06003v.A01);
                return;
            case 3:
            default:
                throw new IllegalArgumentException(A02(27, 58, 35));
            case 4:
                this.A02.A9o(i10, c06003v.A01, c06003v.A03);
                return;
        }
    }

    private final void A0B(List<C06003v> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AE8(list.get(i10));
        }
        list.clear();
    }

    private boolean A0C(int i10) {
        int size = this.A06.size();
        for (int pos = 0; pos < size; pos++) {
            C06003v c06003v = this.A06.get(pos);
            int i11 = c06003v.A00;
            if (i11 == 8) {
                int i12 = c06003v.A01;
                int count = pos + 1;
                if (A01(i12, count) == i10) {
                    return true;
                }
            } else {
                int i13 = c06003v.A00;
                int i14 = A09[4].length();
                if (i14 == 28) {
                    throw new RuntimeException();
                }
                A09[7] = "h3FT";
                if (i13 == 1) {
                    int i15 = c06003v.A02;
                    int count2 = c06003v.A01;
                    int i16 = i15 + count2;
                    for (int i17 = c06003v.A02; i17 < i16; i17++) {
                        int count3 = pos + 1;
                        if (A01(i17, count3) == i10) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final int A0D(int i10) {
        return A01(i10, 0);
    }

    public final int A0E(int i10) {
        int size = this.A05.size();
        for (int i11 = 0; i11 < size; i11++) {
            C06003v op = this.A05.get(i11);
            int size2 = op.A00;
            switch (size2) {
                case 1:
                    int size3 = op.A02;
                    if (size3 <= i10) {
                        int size4 = op.A01;
                        i10 += size4;
                    }
                    break;
                case 2:
                    int size5 = op.A02;
                    if (size5 <= i10) {
                        int i12 = op.A02;
                        int size6 = op.A01;
                        if (i12 + size6 > i10) {
                            return -1;
                        }
                        int size7 = op.A01;
                        i10 -= size7;
                    } else {
                        continue;
                    }
                    break;
                case 8:
                    int size8 = op.A02;
                    if (size8 == i10) {
                        i10 = op.A01;
                    } else {
                        int size9 = op.A02;
                        if (size9 < i10) {
                            i10--;
                        }
                        int size10 = op.A01;
                        if (size10 <= i10) {
                            i10++;
                        }
                    }
                    break;
            }
        }
        return i10;
    }

    public final void A0F() {
        int size = this.A06.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A02.AAv(this.A06.get(i10));
        }
        A0B(this.A06);
        this.A00 = 0;
    }

    public final void A0G() {
        A0F();
        int size = this.A05.size();
        for (int i10 = 0; i10 < size; i10++) {
            C06003v c06003v = this.A05.get(i10);
            int count = c06003v.A00;
            switch (count) {
                case 1:
                    this.A02.AAv(c06003v);
                    InterfaceC05993u interfaceC05993u = this.A02;
                    int i11 = c06003v.A02;
                    int count2 = c06003v.A01;
                    interfaceC05993u.AA8(i11, count2);
                    break;
                case 2:
                    this.A02.AAv(c06003v);
                    InterfaceC05993u interfaceC05993u2 = this.A02;
                    int i12 = c06003v.A02;
                    int count3 = c06003v.A01;
                    interfaceC05993u2.AAA(i12, count3);
                    break;
                case 4:
                    this.A02.AAv(c06003v);
                    InterfaceC05993u interfaceC05993u3 = this.A02;
                    int i13 = c06003v.A02;
                    int i14 = c06003v.A01;
                    interfaceC05993u3.A9o(i13, i14, c06003v.A03);
                    break;
                case 8:
                    this.A02.AAv(c06003v);
                    InterfaceC05993u interfaceC05993u4 = this.A02;
                    int i15 = c06003v.A02;
                    int count4 = c06003v.A01;
                    interfaceC05993u4.AA9(i15, count4);
                    break;
            }
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
        A0B(this.A05);
        this.A00 = 0;
        if (A09[0].charAt(28) != 'A') {
            throw new RuntimeException();
        }
        A09[1] = "6Qpi3zwbHCTXm3nhA4JhLro11ECL3LU";
    }

    public final void A0H() {
        this.A03.A05(this.A05);
        int size = this.A05.size();
        for (int i10 = 0; i10 < size; i10++) {
            C06003v c06003v = this.A05.get(i10);
            int i11 = c06003v.A00;
            String[] strArr = A09;
            String str = strArr[6];
            String str2 = strArr[5];
            int i12 = str.charAt(31);
            int count = str2.charAt(31);
            if (i12 != count) {
                throw new RuntimeException();
            }
            A09[1] = "1BDdKJQJlsgxETOK14Gjs1hC7fjbuKK";
            switch (i11) {
                case 1:
                    A04(c06003v);
                    break;
                case 2:
                    A06(c06003v);
                    break;
                case 4:
                    A07(c06003v);
                    break;
                case 8:
                    A05(c06003v);
                    break;
            }
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.A05.clear();
    }

    public final void A0I() {
        A0B(this.A05);
        A0B(this.A06);
        this.A00 = 0;
    }

    public final boolean A0J() {
        return this.A05.size() > 0;
    }

    public final boolean A0K() {
        return (this.A06.isEmpty() || this.A05.isEmpty()) ? false : true;
    }

    public final boolean A0L(int i10) {
        return (this.A00 & i10) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.C4I
    public final C06003v AA7(int i10, int i11, int i12, Object obj) {
        C06003v op = this.A01.A2V();
        if (op == null) {
            return new C06003v(i10, i11, i12, obj);
        }
        op.A00 = i10;
        op.A02 = i11;
        op.A01 = i12;
        op.A03 = obj;
        return op;
    }

    @Override // com.facebook.ads.redexgen.X.C4I
    public final void AE8(C06003v c06003v) {
        if (!this.A07) {
            c06003v.A03 = null;
            this.A01.AEG(c06003v);
        }
    }
}
