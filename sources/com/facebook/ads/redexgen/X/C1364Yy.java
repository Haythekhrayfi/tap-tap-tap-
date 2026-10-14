package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1364Yy extends AbstractC06054a implements InterfaceC06164m {
    public static byte[] A0F;
    public static String[] A0G = {"VKH6HNPW", "5SG7ZkmA1SrYT5HpW6e3lHPIEdQjCnoY", "GUFAcNFlkHbDslOxTlAKu2zM5da70L8W", "8EarDdUd0wjX", "ogiAdIZLqFL2ODTGKcli7xbzAuQZVFku", "k0c9canuweazyFazM74f3pFcokchiBr", "yJQv9VjGutzUoxdr6", "vBYUiSK7FkagYmvZS"};
    public int A00;
    public int A01;
    public int A02;
    public LinearLayoutManager$SavedState A03;
    public C4K A04;
    public boolean A05;
    public int A06;
    public C4F A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C4D A0D;
    public final C4E A0E;

    public static String A0T(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0V() {
        A0F = new byte[]{Ascii.RS, Ascii.EM, 1, 22, Ascii.ESC, Ascii.RS, 19, 87, Ascii.CAN, 5, Ascii.RS, 18, Ascii.EM, 3, 22, 3, Ascii.RS, Ascii.CAN, Ascii.EM, 77};
    }

    static {
        A0V();
    }

    public C1364Yy(Context context) {
        this(context, 1, false);
    }

    public C1364Yy(Context context, int i10, boolean z10) {
        this.A0A = false;
        this.A05 = false;
        this.A0C = false;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A03 = null;
        this.A0D = new C4D(this);
        this.A0E = new C4E();
        this.A06 = 2;
        A2E(i10);
        A0h(z10);
        A1V(true);
    }

    private final int A04(int i10, C06124i c06124i, C06194p c06194p) {
        if (A0W() == 0 || i10 == 0) {
            return 0;
        }
        this.A07.A0B = true;
        A2D();
        int absDy = i10 > 0 ? 1 : -1;
        int consumed = Math.abs(i10);
        A0Y(absDy, consumed, true, c06194p);
        int i11 = this.A07.A07;
        int layoutDirection = A08(c06124i, this.A07, c06194p, false);
        int i12 = i11 + layoutDirection;
        if (i12 < 0) {
            return 0;
        }
        int absDy2 = consumed > i12 ? absDy * i12 : i10;
        int layoutDirection2 = -absDy2;
        this.A04.A0J(layoutDirection2);
        this.A07.A04 = absDy2;
        return absDy2;
    }

    private int A05(int i10, C06124i c06124i, C06194p c06194p, boolean z10) {
        int gap = this.A04.A07() - i10;
        if (gap > 0) {
            int i11 = -A04(-gap, c06124i, c06194p);
            int i12 = i10 + i11;
            if (z10) {
                int iA07 = this.A04.A07();
                int fixOffset = A0G[0].length();
                if (fixOffset == 7) {
                    throw new RuntimeException();
                }
                A0G[0] = "DiKLRwr5Jced9h1IWYQQBSe";
                int i13 = iA07 - i12;
                if (i13 > 0) {
                    this.A04.A0J(i13);
                    return i13 + i11;
                }
            }
            return i11;
        }
        return 0;
    }

    private int A06(int i10, C06124i c06124i, C06194p c06194p, boolean z10) {
        int iA0A;
        int gap = i10 - this.A04.A0A();
        if (gap > 0) {
            int i11 = -A04(gap, c06124i, c06194p);
            int i12 = i10 + i11;
            if (z10 && (iA0A = i12 - this.A04.A0A()) > 0) {
                this.A04.A0J(-iA0A);
                return i11 - iA0A;
            }
            return i11;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0033 A[EDGE_INSN: B:47:0x0033->B:16:0x0033 BREAK  A[LOOP:0: B:9:0x001d->B:48:0x001d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x001d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x001d A[SYNTHETIC] */
    private final int A08(C06124i c06124i, C4F c4f, C06194p c06194p, boolean z10) {
        boolean z11;
        int remainingSpace;
        int i10 = c4f.A00;
        int start = c4f.A07;
        if (start != Integer.MIN_VALUE) {
            int start2 = c4f.A00;
            if (start2 < 0) {
                int i11 = c4f.A07;
                int start3 = c4f.A00;
                c4f.A07 = i11 + start3;
            }
            A0e(c06124i, c4f);
        }
        int i12 = c4f.A00;
        int start4 = c4f.A02;
        int i13 = i12 + start4;
        C4E c4e = this.A0E;
        while (true) {
            if ((!c4f.A09 && i13 <= 0) || !c4f.A05(c06194p)) {
                break;
            }
            c4e.A00();
            A2H(c06124i, c06194p, c4f, c4e);
            if (c4e.A01) {
                break;
            }
            int i14 = c4f.A06;
            int remainingSpace2 = c4e.A00;
            int start5 = c4f.A05;
            c4f.A06 = i14 + (remainingSpace2 * start5);
            if (!c4e.A03 || this.A07.A08 != null || !c06194p.A07()) {
                int remainingSpace3 = c4f.A00;
                int start6 = c4e.A00;
                c4f.A00 = remainingSpace3 - start6;
                int start7 = c4e.A00;
                i13 -= start7;
            }
            int start8 = c4f.A07;
            if (start8 != Integer.MIN_VALUE) {
                int remainingSpace4 = c4f.A07;
                int start9 = c4e.A00;
                c4f.A07 = remainingSpace4 + start9;
                int start10 = c4f.A00;
                if (start10 < 0) {
                    int i15 = c4f.A07;
                    int i16 = c4f.A00;
                    int remainingSpace5 = A0G[0].length();
                    if (remainingSpace5 != 7) {
                        A0G[5] = "4Yaap7YPoeEmBfNVznjneaOXF1T3Chf";
                        c4f.A07 = i15 + i16;
                    }
                }
                A0e(c06124i, c4f);
                if (z10) {
                    z11 = c4e.A02;
                    remainingSpace = A0G[0].length();
                    if (remainingSpace != 7) {
                        A0G[1] = "BoRZmQ3r1kYFEVrzuprqJgVQBsgHE2ov";
                        if (z11) {
                            break;
                        }
                    }
                }
            } else if (z10) {
                z11 = c4e.A02;
                remainingSpace = A0G[0].length();
                if (remainingSpace != 7) {
                    A0G[1] = "BoRZmQ3r1kYFEVrzuprqJgVQBsgHE2ov";
                    if (z11) {
                        break;
                        break;
                    }
                }
            }
            throw new RuntimeException();
        }
        int start11 = c4f.A00;
        return i10 - start11;
    }

    private int A09(C06194p c06194p) {
        if (A0W() != 0) {
            A2D();
            return C06234t.A00(c06194p, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
        }
        if (A0G[5].length() != 31) {
            throw new RuntimeException();
        }
        A0G[5] = "JS1EmTokFkofHdCiZDqGUekHou375gK";
        return 0;
    }

    private int A0A(C06194p c06194p) {
        if (A0W() == 0) {
            return 0;
        }
        A2D();
        return C06234t.A02(c06194p, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B, this.A05);
    }

    private int A0B(C06194p c06194p) {
        if (A0W() != 0) {
            A2D();
            return C06234t.A01(c06194p, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
        }
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[2] = "SnDsIEYZVkVP365fclIsQ2wSHS1GnuqA";
        strArr2[4] = "cd1sjhoNq3y2dBxKlbos6To2J3BafTHs";
        return 0;
    }

    private final int A0C(C06194p c06194p) {
        if (c06194p.A06()) {
            return this.A04.A0B();
        }
        return 0;
    }

    private View A0D() {
        return A0H(0, A0W());
    }

    private View A0E() {
        return A0H(A0W() - 1, -1);
    }

    private View A0F() {
        return A0t(this.A05 ? 0 : A0W() - 1);
    }

    private View A0G() {
        return A0t(this.A05 ? A0W() - 1 : 0);
    }

    private final View A0H(int i10, int i11) {
        int next;
        int acceptableBoundsFlag;
        int preferredBoundsFlag;
        A2D();
        if (i11 > i10) {
            next = 1;
        } else {
            next = i11 < i10 ? -1 : 0;
        }
        if (next == 0) {
            View viewA0t = A0t(i10);
            String[] strArr = A0G;
            String str = strArr[6];
            String str2 = strArr[7];
            int length = str.length();
            int next2 = str2.length();
            if (length != next2) {
                throw new RuntimeException();
            }
            A0G[5] = "tEP4S10y6AtQbDA9ff3H424KLTnX0k7";
            return viewA0t;
        }
        int preferredBoundsFlag2 = this.A04.A0F(A0t(i10));
        int next3 = this.A04.A0A();
        if (preferredBoundsFlag2 < next3) {
            acceptableBoundsFlag = 16644;
            preferredBoundsFlag = 16388;
        } else {
            acceptableBoundsFlag = 4161;
            preferredBoundsFlag = 4097;
        }
        int next4 = this.A00;
        if (next4 == 0) {
            return super.A04.A00(i10, i11, acceptableBoundsFlag, preferredBoundsFlag);
        }
        return super.A05.A00(i10, i11, acceptableBoundsFlag, preferredBoundsFlag);
    }

    private final View A0J(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        A2D();
        int i13 = 0;
        if (z10) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (z11) {
            i13 = 320;
        }
        int i14 = this.A00;
        int acceptableBoundsFlag = A0G[1].charAt(30);
        if (acceptableBoundsFlag != 111) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[2] = "NnwW0AnvRBQDKBAe7Vp9NN4SqY6y39Zg";
        strArr[4] = "snWQRfIRwdJNOSPMdDWVpUmegwlUrdsl";
        if (i14 == 0) {
            return super.A04.A00(i10, i11, i12, i13);
        }
        return super.A05.A00(i10, i11, i12, i13);
    }

    private View A0K(C06124i c06124i, C06194p c06194p) {
        return A2C(c06124i, c06194p, 0, A0W(), c06194p.A03());
    }

    private View A0L(C06124i c06124i, C06194p c06194p) {
        return A2C(c06124i, c06194p, A0W() - 1, -1, c06194p.A03());
    }

    private View A0M(C06124i c06124i, C06194p c06194p) {
        return this.A05 ? A0D() : A0E();
    }

    private View A0N(C06124i c06124i, C06194p c06194p) {
        return this.A05 ? A0E() : A0D();
    }

    private View A0O(C06124i c06124i, C06194p c06194p) {
        return this.A05 ? A0K(c06124i, c06194p) : A0L(c06124i, c06194p);
    }

    private View A0P(C06124i c06124i, C06194p c06194p) {
        return this.A05 ? A0L(c06124i, c06194p) : A0K(c06124i, c06194p);
    }

    private View A0Q(boolean z10, boolean z11) {
        if (this.A05) {
            return A0J(0, A0W(), z10, z11);
        }
        return A0J(A0W() - 1, -1, z10, z11);
    }

    private View A0R(boolean z10, boolean z11) {
        if (this.A05) {
            return A0J(A0W() - 1, -1, z10, z11);
        }
        return A0J(0, A0W(), z10, z11);
    }

    private final C4F A0S() {
        return new C4F();
    }

    private void A0U() {
        if (this.A00 == 1 || !A2J()) {
            this.A05 = this.A0A;
            return;
        }
        boolean z10 = !this.A0A;
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[6] = "rvopS3hSB7itRsuyG";
        strArr2[7] = "9RTUShXs4ZXrU4n03";
        this.A05 = z10;
    }

    private void A0W(int i10, int i11) {
        this.A07.A00 = this.A04.A07() - i11;
        this.A07.A03 = this.A05 ? -1 : 1;
        this.A07.A01 = i10;
        this.A07.A05 = 1;
        this.A07.A06 = i11;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0X(int i10, int i11) {
        this.A07.A00 = i11 - this.A04.A0A();
        this.A07.A01 = i10;
        this.A07.A03 = this.A05 ? 1 : -1;
        this.A07.A05 = -1;
        this.A07.A06 = i11;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0Y(int i10, int i11, boolean z10, C06194p c06194p) {
        int iA0A;
        this.A07.A09 = A0i();
        this.A07.A02 = A0C(c06194p);
        this.A07.A05 = i10;
        int i12 = -1;
        if (i10 == 1) {
            this.A07.A02 += this.A04.A08();
            View viewA0F = A0F();
            C4F c4f = this.A07;
            if (!this.A05) {
                i12 = 1;
            }
            c4f.A03 = i12;
            this.A07.A01 = A0p(viewA0F) + this.A07.A03;
            this.A07.A06 = this.A04.A0C(viewA0F);
            iA0A = this.A04.A0C(viewA0F) - this.A04.A07();
        } else {
            View viewA0G = A0G();
            this.A07.A02 += this.A04.A0A();
            this.A07.A03 = this.A05 ? 1 : -1;
            this.A07.A01 = A0p(viewA0G) + this.A07.A03;
            this.A07.A06 = this.A04.A0F(viewA0G);
            iA0A = (-this.A04.A0F(viewA0G)) + this.A04.A0A();
        }
        this.A07.A00 = i11;
        if (z10) {
            C4F c4f2 = this.A07;
            int scrollingOffset = c4f2.A00;
            c4f2.A00 = scrollingOffset - iA0A;
        }
        this.A07.A07 = iA0A;
        if (A0G[0].length() == 7) {
            throw new RuntimeException();
        }
        A0G[1] = "rmKnvh8FAT7bzRdUkYGsCRYa1fX1DRoz";
    }

    private void A0Z(C4D c4d) {
        A0W(c4d.A01, c4d.A00);
    }

    private void A0a(C4D c4d) {
        A0X(c4d.A01, c4d.A00);
    }

    private void A0b(C06124i c06124i, int i10) {
        int iA0W = A0W();
        if (i10 < 0) {
            return;
        }
        int iA06 = this.A04.A06() - i10;
        if (this.A05) {
            for (int i11 = 0; i11 < iA0W; i11++) {
                View viewA0t = A0t(i11);
                int childCount = this.A04.A0F(viewA0t);
                if (childCount >= iA06) {
                    int childCount2 = this.A04.A0H(viewA0t);
                    if (childCount2 >= iA06) {
                    }
                }
                A0d(c06124i, 0, i11);
                return;
            }
            return;
        }
        for (int i12 = iA0W - 1; i12 >= 0; i12--) {
            View viewA0t2 = A0t(i12);
            int childCount3 = this.A04.A0F(viewA0t2);
            if (childCount3 >= iA06) {
                int childCount4 = this.A04.A0H(viewA0t2);
                if (childCount4 >= iA06) {
                }
            }
            int childCount5 = iA0W - 1;
            A0d(c06124i, childCount5, i12);
            return;
        }
    }

    private void A0c(C06124i c06124i, int i10) {
        if (i10 < 0) {
            return;
        }
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[0] = "66";
        int iA0W = A0W();
        if (this.A05) {
            for (int i11 = iA0W - 1; i11 >= 0; i11--) {
                View viewA0t = A0t(i11);
                int limit = this.A04.A0C(viewA0t);
                if (limit <= i10) {
                    C4K c4k = this.A04;
                    String[] strArr2 = A0G;
                    String str = strArr2[6];
                    String str2 = strArr2[7];
                    int childCount = str.length();
                    int limit2 = str2.length();
                    if (childCount != limit2) {
                        int limit3 = c4k.A0G(viewA0t);
                        if (limit3 <= i10) {
                        }
                    } else {
                        A0G[3] = "uDZbJl3GZvnd0";
                        int limit4 = c4k.A0G(viewA0t);
                        if (limit4 <= i10) {
                        }
                    }
                }
                int limit5 = iA0W - 1;
                A0d(c06124i, limit5, i11);
                return;
            }
            return;
        }
        for (int i12 = 0; i12 < iA0W; i12++) {
            View viewA0t2 = A0t(i12);
            int iA0C = this.A04.A0C(viewA0t2);
            int childCount2 = A0G[3].length();
            if (childCount2 == 28) {
                throw new RuntimeException();
            }
            A0G[1] = "ET87P0AumYMcjI6vylu4qFXoEmTHeXod";
            if (iA0C <= i10) {
                int limit6 = this.A04.A0G(viewA0t2);
                if (limit6 <= i10) {
                }
            }
            A0d(c06124i, 0, i12);
            return;
        }
    }

    private void A0d(C06124i c06124i, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 > i10) {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                A14(i12, c06124i);
            }
            return;
        }
        while (i10 > i11) {
            A14(i10, c06124i);
            i10--;
        }
    }

    private void A0e(C06124i c06124i, C4F c4f) {
        if (!c4f.A0B || c4f.A09) {
            return;
        }
        int i10 = c4f.A05;
        String[] strArr = A0G;
        if (strArr[6].length() == strArr[7].length()) {
            String[] strArr2 = A0G;
            strArr2[2] = "M7iaeQoExhHh03f7x1XNzmreS2Lq1zJK";
            strArr2[4] = "3weclwG7n9RXAySrMV3Jn51LrKgutG4n";
            if (i10 == -1) {
                int i11 = c4f.A07;
                if (A0G[1].charAt(30) == 'o') {
                    A0G[3] = "CiNTyTfZO3PW6tP";
                    A0b(c06124i, i11);
                    return;
                }
            } else {
                A0c(c06124i, c4f.A07);
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A0f(C06124i c06124i, C06194p c06194p, int scrapExtraEnd, int scrapExtraEnd2) {
        if (!c06194p.A08() || A0W() == 0 || c06194p.A07() || !A26()) {
            return;
        }
        int iA0D = 0;
        int scrapExtraStart = 0;
        List<AbstractC06224s> listA0J = c06124i.A0J();
        int i10 = listA0J.size();
        int iA0p = A0p(A0t(0));
        for (int scrapSize = 0; scrapSize < i10; scrapSize++) {
            AbstractC06224s abstractC06224s = listA0J.get(scrapSize);
            if (!abstractC06224s.A0c()) {
                int direction = 1;
                if ((abstractC06224s.A0I() < iA0p) != this.A05) {
                    direction = -1;
                }
                if (direction == -1) {
                    iA0D += this.A04.A0D(abstractC06224s.A0H);
                } else {
                    scrapExtraStart += this.A04.A0D(abstractC06224s.A0H);
                }
            }
        }
        this.A07.A08 = listA0J;
        if (iA0D > 0) {
            A0X(A0p(A0G()), scrapExtraEnd);
            this.A07.A02 = iA0D;
            this.A07.A00 = 0;
            this.A07.A04();
            A08(c06124i, this.A07, c06194p, false);
        }
        if (scrapExtraStart > 0) {
            A0W(A0p(A0F()), scrapExtraEnd2);
            this.A07.A02 = scrapExtraStart;
            this.A07.A00 = 0;
            this.A07.A04();
            A08(c06124i, this.A07, c06194p, false);
        }
        this.A07.A08 = null;
    }

    private void A0g(C06124i c06124i, C06194p c06194p, C4D c4d) {
        if (A0k(c06194p, c4d)) {
            return;
        }
        boolean zA0j = A0j(c06124i, c06194p, c4d);
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[3] = "XDJ2jDWhUW9a7iN";
        if (zA0j) {
            return;
        }
        c4d.A02();
        c4d.A01 = this.A0C ? c06194p.A03() - 1 : 0;
    }

    private final void A0h(boolean z10) {
        A22(null);
        if (z10 == this.A0A) {
            return;
        }
        this.A0A = z10;
        A0y();
    }

    private final boolean A0i() {
        return this.A04.A09() == 0 && this.A04.A06() == 0;
    }

    private boolean A0j(C06124i c06124i, C06194p c06194p, C4D c4d) {
        View viewA0P;
        int iA0A;
        if (A0W() == 0) {
            return false;
        }
        View viewA0s = A0s();
        if (viewA0s != null && c4d.A06(viewA0s, c06194p)) {
            c4d.A05(viewA0s);
            return true;
        }
        if (this.A08 != this.A0C) {
            return false;
        }
        if (c4d.A02) {
            viewA0P = A0O(c06124i, c06194p);
        } else {
            viewA0P = A0P(c06124i, c06194p);
        }
        if (viewA0P == null) {
            return false;
        }
        c4d.A04(viewA0P);
        if (!c06194p.A07() && A26()) {
            if (this.A04.A0F(viewA0P) >= this.A04.A07() || this.A04.A0C(viewA0P) < this.A04.A0A()) {
                if (c4d.A02) {
                    iA0A = this.A04.A07();
                } else {
                    iA0A = this.A04.A0A();
                }
                c4d.A00 = iA0A;
            }
        }
        return true;
    }

    private boolean A0k(C06194p c06194p, C4D c4d) {
        int i10;
        int startGap;
        if (c06194p.A07() || (i10 = this.A01) == -1) {
            return false;
        }
        if (i10 < 0 || i10 >= c06194p.A03()) {
            this.A01 = -1;
            this.A02 = Integer.MIN_VALUE;
            return false;
        }
        c4d.A01 = this.A01;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState == null || !linearLayoutManager$SavedState.A01()) {
            if (this.A02 == Integer.MIN_VALUE) {
                View viewA1q = A1q(this.A01);
                if (viewA1q != null) {
                    if (this.A04.A0D(viewA1q) > this.A04.A0B()) {
                        c4d.A02();
                        return true;
                    }
                    if (this.A04.A0F(viewA1q) - this.A04.A0A() < 0) {
                        c4d.A00 = this.A04.A0A();
                        c4d.A02 = false;
                        return true;
                    }
                    int endGap = this.A04.A07() - this.A04.A0C(viewA1q);
                    if (endGap < 0) {
                        c4d.A00 = this.A04.A07();
                        c4d.A02 = true;
                        return true;
                    }
                    if (c4d.A02) {
                        int startGap2 = this.A04.A0C(viewA1q);
                        C4K c4k = this.A04;
                        String[] strArr = A0G;
                        String str = strArr[2];
                        String str2 = strArr[4];
                        int endGap2 = str.charAt(4);
                        if (endGap2 == str2.charAt(4)) {
                            throw new RuntimeException();
                        }
                        A0G[3] = "ZbIhQvVoqDIGDPkO0OlvW9zioDplzu";
                        startGap = startGap2 + c4k.A05();
                    } else {
                        startGap = this.A04.A0F(viewA1q);
                    }
                    c4d.A00 = startGap;
                } else {
                    if (A0W() > 0) {
                        View child = A0t(0);
                        int endGap3 = A0p(child);
                        boolean z10 = this.A01 < endGap3;
                        boolean z11 = this.A05;
                        int endGap4 = A0G[1].charAt(30);
                        if (endGap4 != 111) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0G;
                        strArr2[2] = "1tNDA9T9nSDYektAgKE77gOe81bMFJSk";
                        strArr2[4] = "TZYqXNdWGZVKxzfIQyf7YZEk7yb7IRTm";
                        c4d.A02 = z10 == z11;
                    }
                    c4d.A02();
                }
                return true;
            }
            c4d.A02 = this.A05;
            if (this.A05) {
                c4d.A00 = this.A04.A07() - this.A02;
            } else {
                c4d.A00 = this.A04.A0A() + this.A02;
            }
            return true;
        }
        c4d.A02 = this.A03.A02;
        if (c4d.A02) {
            c4d.A00 = this.A04.A07() - this.A03.A00;
        } else {
            c4d.A00 = this.A04.A0A() + this.A03.A00;
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public int A1h(int i10, C06124i c06124i, C06194p c06194p) {
        if (this.A00 == 1) {
            return 0;
        }
        return A04(i10, c06124i, c06194p);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public int A1i(int i10, C06124i c06124i, C06194p c06194p) {
        if (this.A00 == 0) {
            return 0;
        }
        int iA04 = A04(i10, c06124i, c06194p);
        String[] strArr = A0G;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A0G[3] = "CDnF1shpb";
        return iA04;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final int A1j(C06194p c06194p) {
        return A09(c06194p);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final int A1k(C06194p c06194p) {
        return A0A(c06194p);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final int A1l(C06194p c06194p) {
        return A0B(c06194p);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final int A1m(C06194p c06194p) {
        return A09(c06194p);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final int A1n(C06194p c06194p) {
        return A0A(c06194p);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final int A1o(C06194p c06194p) {
        return A0B(c06194p);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final Parcelable A1p() {
        if (this.A03 != null) {
            return new WrappedParcelable(new LinearLayoutManager$SavedState(this.A03));
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = new LinearLayoutManager$SavedState();
        if (A0W() > 0) {
            A2D();
            boolean didLayoutFromEnd = this.A08 ^ this.A05;
            linearLayoutManager$SavedState.A02 = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View refChild = A0F();
                linearLayoutManager$SavedState.A00 = this.A04.A07() - this.A04.A0C(refChild);
                linearLayoutManager$SavedState.A01 = A0p(refChild);
            } else {
                View viewA0G = A0G();
                linearLayoutManager$SavedState.A01 = A0p(viewA0G);
                linearLayoutManager$SavedState.A00 = this.A04.A0F(viewA0G) - this.A04.A0A();
            }
        } else {
            linearLayoutManager$SavedState.A00();
        }
        return new WrappedParcelable(linearLayoutManager$SavedState);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final View A1q(int i10) {
        int firstChild = A0W();
        if (firstChild == 0) {
            return null;
        }
        int childCount = i10 - A0p(A0t(0));
        if (childCount >= 0 && childCount < firstChild) {
            View viewA0t = A0t(childCount);
            if (A0p(viewA0t) == i10) {
                return viewA0t;
            }
        }
        return super.A1q(i10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public View A1r(View view, int i10, C06124i c06124i, C06194p c06194p) {
        int iA2B;
        View viewA0M;
        View nextCandidate;
        A0U();
        if (A0W() == 0 || (iA2B = A2B(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        A2D();
        A2D();
        int layoutDir = this.A04.A0B();
        A0Y(iA2B, (int) (layoutDir * 0.33333334f), false, c06194p);
        this.A07.A07 = Integer.MIN_VALUE;
        this.A07.A0B = false;
        A08(c06124i, this.A07, c06194p, true);
        if (iA2B == -1) {
            viewA0M = A0N(c06124i, c06194p);
        } else {
            viewA0M = A0M(c06124i, c06194p);
        }
        if (iA2B == -1) {
            nextCandidate = A0G();
        } else {
            nextCandidate = A0F();
        }
        boolean zHasFocusable = nextCandidate.hasFocusable();
        if (A0G[0].length() == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[2] = "JGtMOr7ZHjmwUVfbInfaZmEhr0nxGN38";
        strArr[4] = "jCrgpf8bwQbyd1C9u6FfAt5OnK6gBhSa";
        if (zHasFocusable) {
            if (viewA0M == null) {
                return null;
            }
            return nextCandidate;
        }
        return viewA0M;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public C06064b A1s() {
        return new C06064b(-2, -2);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public void A1t(int i10) {
        this.A01 = i10;
        this.A02 = Integer.MIN_VALUE;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.A00();
        }
        A0y();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final void A1u(int i10, int i11, C06194p c06194p, C4Y c4y) {
        if (this.A00 != 0) {
            i10 = i11;
        }
        int delta = A0W();
        if (delta == 0 || i10 == 0) {
            return;
        }
        A2D();
        int i12 = i10 > 0 ? 1 : -1;
        int delta2 = Math.abs(i10);
        A0Y(i12, delta2, true, c06194p);
        A2I(c06194p, this.A07, c4y);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final void A1v(int i10, C4Y c4y) {
        boolean z10;
        int direction;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.A01()) {
            z10 = this.A03.A02;
            direction = this.A03.A01;
        } else {
            A0U();
            z10 = this.A05;
            int i11 = this.A01;
            String[] strArr = A0G;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0G[1] = "j12HxmlCdcFNOCf90EDMVBFIs8rsuaoM";
            if (i11 == -1) {
                direction = z10 ? i10 - 1 : 0;
            } else {
                direction = this.A01;
            }
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.A06 && direction >= 0 && direction < i10; i13++) {
            c4y.A3N(direction, 0);
            direction += i12;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final void A1w(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (A0G[1].charAt(30) == 'o') {
            A0G[1] = "tHEWx5U9TGfOm0s3U2zrO5nR7UMaVIoI";
            if (classLoader == null) {
                return;
            }
            if (A0G[5].length() == 31) {
                A0G[3] = "tm";
                Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
                if (state instanceof LinearLayoutManager$SavedState) {
                    this.A03 = (LinearLayoutManager$SavedState) state;
                    A0y();
                    return;
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final void A1x(AccessibilityEvent accessibilityEvent) {
        super.A1x(accessibilityEvent);
        if (A0W() > 0) {
            accessibilityEvent.setFromIndex(A28());
            int iA29 = A29();
            if (A0G[3].length() == 28) {
                throw new RuntimeException();
            }
            A0G[3] = "9E5bhv9RVKulu";
            accessibilityEvent.setToIndex(iA29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x0208  */
    /* JADX WARN: Code duplicated, block: B:80:0x020b  */
    /* JADX WARN: Code duplicated, block: B:81:0x021c  */
    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public void A1y(C06124i c06124i, C06194p c06194p) {
        int extraForStart;
        int extraForEnd;
        int extraForStart2;
        View viewA1q;
        int current;
        int current2;
        String[] strArr;
        int i10 = -1;
        if ((this.A03 != null || this.A01 != -1) && c06194p.A03() == 0) {
            A1I(c06124i);
            return;
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.A01()) {
            this.A01 = this.A03.A01;
        }
        A2D();
        this.A07.A0B = false;
        A0U();
        View viewA0s = A0s();
        if (!this.A0D.A03 || this.A01 != -1 || this.A03 != null) {
            this.A0D.A03();
            this.A0D.A02 = this.A05 ^ this.A0C;
            A0g(c06124i, c06194p, this.A0D);
            C4D c4d = this.A0D;
            if (A0G[3].length() == 28) {
                throw new RuntimeException();
            }
            A0G[0] = "pP9DXN24lJAGcvrzmJLzNvbz";
            c4d.A03 = true;
        } else if (viewA0s != null && (this.A04.A0F(viewA0s) >= this.A04.A07() || this.A04.A0C(viewA0s) <= this.A04.A0A())) {
            this.A0D.A05(viewA0s);
        }
        int lastElement = A0C(c06194p);
        if (this.A07.A04 >= 0) {
            extraForStart = 0;
        } else {
            extraForStart = lastElement;
            lastElement = 0;
        }
        int extraForStart3 = extraForStart + this.A04.A0A();
        int startOffset = lastElement + this.A04.A08();
        if (c06194p.A07()) {
            int current3 = this.A01;
            String[] strArr2 = A0G;
            if (strArr2[6].length() != strArr2[7].length()) {
                A0G[1] = "HnPzY03honFOjhYT25K5WFAFMhFIclok";
                if (current3 != -1) {
                    if (this.A02 != Integer.MIN_VALUE && (viewA1q = A1q(current3)) != null) {
                        if (this.A05) {
                            current2 = this.A04.A07() - this.A04.A0C(viewA1q);
                            strArr = A0G;
                            if (strArr[2].charAt(4) != strArr[4].charAt(4)) {
                                A0G[5] = "r3FnQil1r32czyLALUutLd0XCkxYZ4G";
                                current = current2 - this.A02;
                            } else {
                                String[] strArr3 = A0G;
                                strArr3[2] = "sdmiyO1ExKOYMO2wbr6XNnW0K6t4WoaH";
                                strArr3[4] = "ty9AfnxQn4ghzZPCSImQPyrccPhuEwJu";
                                current = current2 - this.A02;
                            }
                        } else {
                            current = this.A02 - (this.A04.A0F(viewA1q) - this.A04.A0A());
                        }
                        if (current > 0) {
                            extraForStart3 += current;
                        } else {
                            startOffset -= current;
                        }
                    }
                }
            } else {
                String[] strArr4 = A0G;
                strArr4[2] = "wwbDuuRcKwQkcLvBFtW9wuMbOUuGYFzY";
                strArr4[4] = "YequbpJjhMyIl9uyXvP2gytASLo9xZ7L";
                if (current3 != -1) {
                    if (this.A02 != Integer.MIN_VALUE) {
                        if (this.A05) {
                            current2 = this.A04.A07() - this.A04.A0C(viewA1q);
                            strArr = A0G;
                            if (strArr[2].charAt(4) != strArr[4].charAt(4)) {
                                A0G[5] = "r3FnQil1r32czyLALUutLd0XCkxYZ4G";
                                current = current2 - this.A02;
                            } else {
                                String[] strArr5 = A0G;
                                strArr5[2] = "sdmiyO1ExKOYMO2wbr6XNnW0K6t4WoaH";
                                strArr5[4] = "ty9AfnxQn4ghzZPCSImQPyrccPhuEwJu";
                                current = current2 - this.A02;
                            }
                        } else {
                            current = this.A02 - (this.A04.A0F(viewA1q) - this.A04.A0A());
                        }
                        if (current > 0) {
                            extraForStart3 += current;
                        } else {
                            startOffset -= current;
                        }
                    }
                }
            }
        }
        if (this.A0D.A02) {
            if (this.A05) {
                i10 = 1;
            }
        } else if (!this.A05) {
            i10 = 1;
        }
        A2G(c06124i, c06194p, this.A0D, i10);
        A1H(c06124i);
        this.A07.A09 = A0i();
        this.A07.A0A = c06194p.A07();
        if (this.A0D.A02) {
            A0a(this.A0D);
            this.A07.A02 = extraForStart3;
            A08(c06124i, this.A07, c06194p, false);
            extraForStart2 = this.A07.A06;
            int i11 = this.A07.A01;
            if (this.A07.A00 > 0) {
                startOffset += this.A07.A00;
            }
            A0Z(this.A0D);
            this.A07.A02 = startOffset;
            this.A07.A01 += this.A07.A03;
            A08(c06124i, this.A07, c06194p, false);
            extraForEnd = this.A07.A06;
            if (this.A07.A00 > 0) {
                int i12 = this.A07.A00;
                A0X(i11, extraForStart2);
                this.A07.A02 = i12;
                A08(c06124i, this.A07, c06194p, false);
                extraForStart2 = this.A07.A06;
            }
        } else {
            A0Z(this.A0D);
            this.A07.A02 = startOffset;
            A08(c06124i, this.A07, c06194p, false);
            extraForEnd = this.A07.A06;
            int i13 = this.A07.A01;
            if (this.A07.A00 > 0) {
                extraForStart3 += this.A07.A00;
            }
            A0a(this.A0D);
            this.A07.A02 = extraForStart3;
            this.A07.A01 += this.A07.A03;
            A08(c06124i, this.A07, c06194p, false);
            extraForStart2 = this.A07.A06;
            if (this.A07.A00 > 0) {
                int i14 = this.A07.A00;
                A0W(i13, extraForEnd);
                this.A07.A02 = i14;
                A08(c06124i, this.A07, c06194p, false);
                extraForEnd = this.A07.A06;
            }
        }
        if (A0W() > 0) {
            if (this.A05 ^ this.A0C) {
                int iA05 = A05(extraForEnd, c06124i, c06194p, true);
                int extraForStart4 = extraForStart2 + iA05;
                int extraForEnd2 = extraForEnd + iA05;
                int iA06 = A06(extraForStart4, c06124i, c06194p, false);
                extraForStart2 = extraForStart4 + iA06;
                extraForEnd = extraForEnd2 + iA06;
            } else {
                int iA07 = A06(extraForStart2, c06124i, c06194p, true);
                int extraForStart5 = extraForStart2 + iA07;
                int extraForEnd3 = extraForEnd + iA07;
                int iA08 = A05(extraForEnd3, c06124i, c06194p, false);
                extraForStart2 = extraForStart5 + iA08;
                extraForEnd = extraForEnd3 + iA08;
            }
        }
        A0f(c06124i, c06194p, extraForStart2, extraForEnd);
        if (!c06194p.A07()) {
            this.A04.A0I();
        } else {
            this.A0D.A03();
        }
        this.A08 = this.A0C;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public void A1z(C06194p c06194p) {
        super.A1z(c06194p);
        this.A03 = null;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A0D.A03();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final void A20(EB eb2, C06124i c06124i) {
        super.A20(eb2, c06124i);
        if (this.A09) {
            A1I(c06124i);
            c06124i.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public void A21(EB eb2, C06194p c06194p, int i10) {
        C1363Yx linearSmoothScroller = new C1363Yx(eb2.getContext());
        linearSmoothScroller.A0A(i10);
        A1L(linearSmoothScroller);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final void A22(String str) {
        if (this.A03 == null) {
            super.A22(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final boolean A23() {
        if (A0Y() != 1073741824 && A0i() != 1073741824) {
            boolean zA1W = A1W();
            if (A0G[0].length() == 7) {
                throw new RuntimeException();
            }
            A0G[0] = "ZYU5Lu8KJdo1W8";
            if (zA1W) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final boolean A24() {
        return this.A00 == 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final boolean A25() {
        return this.A00 == 1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public boolean A26() {
        return this.A03 == null && this.A08 == this.A0C;
    }

    public final int A27() {
        View child = A0J(0, A0W(), true, false);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A28() {
        View child = A0J(0, A0W(), false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A29() {
        View child = A0J(A0W() - 1, -1, false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A2A() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r3 == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (A2J() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r3 == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A2B(int r8) {
        /*
            r7 = this;
            r6 = -1
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            switch(r8) {
                case 1: goto L8;
                case 2: goto L31;
                case 17: goto L3e;
                case 33: goto L46;
                case 66: goto L4e;
                case 130: goto L54;
                default: goto L7;
            }
        L7:
            return r5
        L8:
            int r3 = r7.A00
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1364Yy.A0G
            r0 = 6
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L1f
            if (r3 != r4) goto L29
        L1e:
            return r6
        L1f:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1364Yy.A0G
            java.lang.String r1 = "tdW2fzf"
            r0 = 3
            r2[r0] = r1
            if (r3 != r4) goto L29
            goto L1e
        L29:
            boolean r0 = r7.A2J()
            if (r0 == 0) goto L30
            return r4
        L30:
            return r6
        L31:
            int r0 = r7.A00
            if (r0 != r4) goto L36
            return r4
        L36:
            boolean r0 = r7.A2J()
            if (r0 == 0) goto L3d
            return r6
        L3d:
            return r4
        L3e:
            int r0 = r7.A00
            if (r0 != 0) goto L43
        L42:
            return r6
        L43:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L42
        L46:
            int r0 = r7.A00
            if (r0 != r4) goto L4b
        L4a:
            return r6
        L4b:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L4a
        L4e:
            int r0 = r7.A00
            if (r0 != 0) goto L53
            r5 = 1
        L53:
            return r5
        L54:
            int r3 = r7.A00
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1364Yy.A0G
            r0 = 1
            r1 = r1[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            r0 = 111(0x6f, float:1.56E-43)
            if (r1 == r0) goto L6b
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1364Yy.A0G
            java.lang.String r1 = "6DQtaB3lJkGKNvmH8s9QQc68TsOBLDE"
            r0 = 3
            r2[r0] = r1
            if (r3 != r4) goto L75
            r5 = 1
        L75:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1364Yy.A2B(int):int");
    }

    public View A2C(C06124i c06124i, C06194p c06194p, int i10, int i11, int i12) {
        A2D();
        View view = null;
        View view2 = null;
        int iA0A = this.A04.A0A();
        int boundsEnd = this.A04.A07();
        int boundsStart = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View outOfBoundsMatch = A0t(i10);
            int iA0p = A0p(outOfBoundsMatch);
            if (iA0p >= 0 && iA0p < i12) {
                if (((C06064b) outOfBoundsMatch.getLayoutParams()).A02()) {
                    if (view == null) {
                        view = outOfBoundsMatch;
                    }
                } else if (this.A04.A0F(outOfBoundsMatch) >= boundsEnd || this.A04.A0C(outOfBoundsMatch) < iA0A) {
                    if (view2 == null) {
                        view2 = outOfBoundsMatch;
                    }
                } else {
                    return outOfBoundsMatch;
                }
            }
            i10 += boundsStart;
        }
        return view2 != null ? view2 : view;
    }

    public final void A2D() {
        if (this.A07 == null) {
            this.A07 = A0S();
        }
        if (this.A04 == null) {
            this.A04 = C4K.A02(this, this.A00);
        }
    }

    public final void A2E(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(A0T(0, 20, 1) + i10);
        }
        if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        }
        A0G[1] = "wMuOUB68W5cmyVCUMue198JFnL9Wkeot";
        A22(null);
        if (i10 == this.A00) {
            return;
        }
        this.A00 = i10;
        this.A04 = null;
        A0y();
    }

    public final void A2F(int i10, int i11) {
        this.A01 = i10;
        this.A02 = i11;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.A00();
        }
        A0y();
        if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        }
        A0G[3] = "tDl3kZGUKMTs";
    }

    public void A2G(C06124i c06124i, C06194p c06194p, C4D c4d, int i10) {
    }

    public void A2H(C06124i c06124i, C06194p c06194p, C4F c4f, C4E c4e) {
        int iA0g;
        int right;
        int iA0e;
        int iA0E;
        View viewA03 = c4f.A03(c06124i);
        if (viewA03 == null) {
            c4e.A01 = true;
            return;
        }
        C06064b c06064b = (C06064b) viewA03.getLayoutParams();
        if (c4f.A08 == null) {
            if (this.A05 == (c4f.A05 == -1)) {
                A17(viewA03);
            } else {
                A19(viewA03, 0);
            }
        } else {
            boolean z10 = this.A05;
            int bottom = c4f.A05;
            if (z10 == (bottom == -1)) {
                A16(viewA03);
            } else {
                A18(viewA03, 0);
            }
        }
        A1A(viewA03, 0, 0);
        c4e.A00 = this.A04.A0D(viewA03);
        if (this.A00 == 1) {
            if (A2J()) {
                iA0E = A0h() - A0f();
                iA0e = iA0E - this.A04.A0E(viewA03);
            } else {
                iA0e = A0e();
                iA0E = this.A04.A0E(viewA03) + iA0e;
            }
            if (c4f.A05 == -1) {
                right = c4f.A06;
                iA0g = c4f.A06 - c4e.A00;
            } else {
                iA0g = c4f.A06;
                right = c4f.A06 + c4e.A00;
            }
        } else {
            iA0g = A0g();
            right = this.A04.A0E(viewA03) + iA0g;
            int bottom2 = c4f.A05;
            if (bottom2 == -1) {
                iA0E = c4f.A06;
                int i10 = c4f.A06;
                int bottom3 = c4e.A00;
                iA0e = i10 - bottom3;
            } else {
                iA0e = c4f.A06;
                int i11 = c4f.A06;
                int bottom4 = c4e.A00;
                iA0E = i11 + bottom4;
            }
        }
        A1B(viewA03, iA0e, iA0g, iA0E, right);
        if (c06064b.A02() || c06064b.A01()) {
            c4e.A03 = true;
        }
        c4e.A02 = viewA03.hasFocusable();
    }

    public void A2I(C06194p c06194p, C4F c4f, C4Y c4y) {
        int i10 = c4f.A01;
        if (i10 >= 0) {
            int pos = c06194p.A03();
            if (i10 < pos) {
                int pos2 = c4f.A07;
                c4y.A3N(i10, Math.max(0, pos2));
            }
        }
    }

    public final boolean A2J() {
        return A0a() == 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06164m
    public final PointF A4K(int i10) {
        if (A0W() == 0) {
            return null;
        }
        int i11 = (i10 < A0p(A0t(0))) != this.A05 ? -1 : 1;
        int i12 = this.A00;
        int firstChildPos = A0G[0].length();
        if (firstChildPos == 7) {
            throw new RuntimeException();
        }
        A0G[5] = "5EjIyJt0kzQOvAP28HqeuGPqaebz9kN";
        if (i12 == 0) {
            return new PointF(i11, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
        return new PointF(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, i11);
    }
}
