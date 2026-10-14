package com.facebook.ads.redexgen.X;

import android.util.Pair;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C07239a {
    public static String[] A0C = {"Lb1", "HAO", "yCHPPE9w0w81YCKuxFE6L9DmrxkJ2tU0", "DWgdxvM8Y7BV8jWWEqdgbbwmU3UKZQmt", "Bgm", "OOw1FrSehBTCipzYy8xUBx5", "Tcr4i3yvYCwS9F", "vvoyvovICPFY35FJOKkJE7b"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C9Y A04;
    public C9Y A05;
    public C9Y A06;
    public AbstractC07459x A07;
    public Object A08;
    public boolean A09;
    public final C07439v A0A = new C07439v();
    public final C07449w A0B = new C07449w();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private C9Z A02(int i10, long j10, long j11) {
        EU eu = new EU(i10, j11);
        this.A07.A09(eu.A02, this.A0A);
        int iA04 = this.A0A.A04(j10);
        long jA09 = iA04 == -1 ? Long.MIN_VALUE : this.A0A.A09(iA04);
        boolean zA0A = A0A(eu, jA09);
        return new C9Z(eu, j10, jA09, -9223372036854775807L, jA09 == Long.MIN_VALUE ? this.A0A.A07() : jA09, zA0A, A0B(eu, zA0A));
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0173  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private C9Z A03(C9Y c9y, long j10) {
        long jLongValue;
        C9Z c9z = c9y.A02;
        if (c9z.A06) {
            int iA03 = this.A07.A03(c9z.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            if (iA03 == -1) {
                return null;
            }
            int i10 = this.A07.A0A(iA03, this.A0A, true).A00;
            Object obj = this.A0A.A03;
            long j11 = c9z.A04.A03;
            if (this.A07.A0B(i10, this.A0B).A00 == iA03) {
                Pair<Integer, Long> pairA08 = this.A07.A08(this.A0B, this.A0A, i10, -9223372036854775807L, Math.max(0L, (c9y.A07() + c9z.A01) - j10));
                if (pairA08 == null) {
                    return null;
                }
                iA03 = ((Integer) pairA08.first).intValue();
                jLongValue = ((Long) pairA08.second).longValue();
                if (c9y.A01 != null) {
                    boolean zEquals = c9y.A01.A09.equals(obj);
                    String[] strArr = A0C;
                    if (strArr[5].length() == strArr[7].length()) {
                        String[] strArr2 = A0C;
                        strArr2[4] = "1Mi";
                        strArr2[1] = "4wM";
                        if (zEquals) {
                            j11 = c9y.A01.A02.A04.A03;
                        } else {
                            j11 = this.A02;
                            this.A02 = j11 + 1;
                        }
                    }
                } else {
                    j11 = this.A02;
                    this.A02 = j11 + 1;
                }
            } else {
                jLongValue = 0;
            }
            return A06(A07(iA03, jLongValue, j11), jLongValue, jLongValue);
        }
        EU eu = c9z.A04;
        this.A07.A09(eu.A02, this.A0A);
        if (eu.A01()) {
            int i11 = eu.A00;
            int iA01 = this.A0A.A01(i11);
            if (iA01 == -1) {
                return null;
            }
            int iA04 = this.A0A.A03(i11, eu.A01);
            if (iA04 >= iA01) {
                return A02(eu.A02, c9z.A00, eu.A03);
            }
            if (this.A0A.A0E(i11, iA04)) {
                return A01(eu.A02, i11, iA04, c9z.A00, eu.A03);
            }
            return null;
        }
        long j12 = c9z.A02;
        String[] strArr3 = A0C;
        if (strArr3[6].length() == strArr3[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0C;
        strArr4[4] = "Mkh";
        strArr4[1] = "LRN";
        if (j12 != Long.MIN_VALUE) {
            int iA05 = this.A0A.A05(c9z.A02);
            if (iA05 == -1) {
                return A02(eu.A02, c9z.A02, eu.A03);
            }
            int iA02 = this.A0A.A02(iA05);
            if (this.A0A.A0E(iA05, iA02)) {
                return A01(eu.A02, iA05, iA02, c9z.A02, eu.A03);
            }
            return null;
        }
        int iA00 = this.A0A.A00();
        if (iA00 == 0) {
            return null;
        }
        int i12 = iA00 - 1;
        if (this.A0A.A09(i12) == Long.MIN_VALUE) {
            C07439v c07439v = this.A0A;
            if (A0C[3].charAt(17) == 'q') {
                String[] strArr5 = A0C;
                strArr5[6] = "v4RqMCCMyohjhj";
                strArr5[0] = "VaJ";
                if (!c07439v.A0D(i12)) {
                    int iA06 = this.A0A.A02(i12);
                    if (!this.A0A.A0E(i12, iA06)) {
                        String[] strArr6 = A0C;
                        if (strArr6[6].length() == strArr6[0].length()) {
                            return null;
                        }
                        A0C[2] = "nHRVyYi6CwR1mKhXGjDN4SEBRB6Sc1lP";
                        return null;
                    }
                    long jA07 = this.A0A.A07();
                    int i13 = eu.A02;
                    String[] strArr7 = A0C;
                    if (strArr7[5].length() != strArr7[7].length()) {
                        throw new RuntimeException();
                    }
                    A0C[2] = "rKR9SUNE0wWlvttO7fw3rD4zdQIUaCm2";
                    return A01(i13, i12, iA06, jA07, eu.A03);
                }
            }
        }
        if (A0C[2].charAt(9) != 'w') {
            return null;
        }
        String[] strArr8 = A0C;
        strArr8[6] = "OaXxy4ZAPPYV9k";
        strArr8[0] = "tU4";
        return null;
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private C9Z A04(C9Z c9z, EU eu) {
        long jA07;
        long j10 = c9z.A03;
        long j11 = c9z.A02;
        boolean zA0A = A0A(eu, j11);
        boolean zA0B = A0B(eu, zA0A);
        this.A07.A09(eu.A02, this.A0A);
        if (eu.A01()) {
            jA07 = this.A0A.A0A(eu.A00, eu.A01);
        } else {
            jA07 = j11 == Long.MIN_VALUE ? this.A0A.A07() : j11;
        }
        return new C9Z(eu, j10, j11, c9z.A00, jA07, zA0A, zA0B);
    }

    private long A00(int i10) {
        int oldFrontPeriodIndex;
        Object obj = this.A07.A0A(i10, this.A0A, true).A03;
        int holderWindowIndex = this.A0A.A00;
        Object obj2 = this.A08;
        if (obj2 != null && (oldFrontPeriodIndex = this.A07.A04(obj2)) != -1 && this.A07.A09(oldFrontPeriodIndex, this.A0A).A00 == holderWindowIndex) {
            return this.A03;
        }
        for (C9Y c9yA0E = A0E(); c9yA0E != null; c9yA0E = c9yA0E.A01) {
            Object periodUid = c9yA0E.A09;
            if (periodUid.equals(obj)) {
                return c9yA0E.A02.A04.A03;
            }
        }
        for (C9Y c9yA0E2 = A0E(); c9yA0E2 != null; c9yA0E2 = c9yA0E2.A01) {
            AbstractC07459x abstractC07459x = this.A07;
            Object periodUid2 = c9yA0E2.A09;
            int iA04 = abstractC07459x.A04(periodUid2);
            if (iA04 != -1 && this.A07.A09(iA04, this.A0A).A00 == holderWindowIndex) {
                return c9yA0E2.A02.A04.A03;
            }
        }
        long j10 = this.A02;
        this.A02 = 1 + j10;
        return j10;
    }

    private C9Z A01(int i10, int i11, int i12, long j10, long j11) {
        long jA06;
        EU eu = new EU(i10, i11, i12, j11);
        boolean zA0A = A0A(eu, Long.MIN_VALUE);
        boolean zA0B = A0B(eu, zA0A);
        long jA0A = this.A07.A09(eu.A02, this.A0A).A0A(eu.A00, eu.A01);
        if (i12 == this.A0A.A02(i11)) {
            jA06 = this.A0A.A06();
        } else {
            jA06 = 0;
        }
        return new C9Z(eu, jA06, Long.MIN_VALUE, j10, jA0A, zA0A, zA0B);
    }

    private C9Z A05(C07259c c07259c) {
        return A06(c07259c.A04, c07259c.A01, c07259c.A02);
    }

    private C9Z A06(EU eu, long j10, long j11) {
        this.A07.A09(eu.A02, this.A0A);
        if (eu.A01()) {
            if (!this.A0A.A0E(eu.A00, eu.A01)) {
                return null;
            }
            return A01(eu.A02, eu.A00, eu.A01, j10, eu.A03);
        }
        return A02(eu.A02, j11, eu.A03);
    }

    private EU A07(int i10, long j10, long j11) {
        this.A07.A09(i10, this.A0A);
        int iA05 = this.A0A.A05(j10);
        if (iA05 == -1) {
            return new EU(i10, j11);
        }
        return new EU(i10, iA05, this.A0A.A02(iA05), j11);
    }

    private boolean A08() {
        C9Y c9yA0E = A0E();
        if (c9yA0E == null) {
            return true;
        }
        while (true) {
            int iA03 = this.A07.A03(c9yA0E.A02.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            while (lastValidPeriodHolder != null && !c9yA0E.A02.A06) {
                c9yA0E = c9yA0E.A01;
            }
            if (iA03 == -1) {
                break;
            }
            C9Y lastValidPeriodHolder = c9yA0E.A01;
            if (lastValidPeriodHolder == null) {
                break;
            }
            C9Y lastValidPeriodHolder2 = c9yA0E.A01;
            int i10 = lastValidPeriodHolder2.A02.A04.A02;
            if (A0C[3].charAt(17) != 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[4] = "04e";
            strArr[1] = "fTm";
            if (i10 != iA03) {
                break;
            }
            c9yA0E = c9yA0E.A01;
        }
        boolean readingPeriodRemoved = A0S(c9yA0E);
        c9yA0E.A02 = A04(c9yA0E.A02, c9yA0E.A02.A04);
        return (readingPeriodRemoved && A0P()) ? false : true;
    }

    private boolean A09(C9Y c9y, C9Z c9z) {
        C9Z c9z2 = c9y.A02;
        return c9z2.A03 == c9z.A03 && c9z2.A02 == c9z.A02 && c9z2.A04.equals(c9z.A04);
    }

    private boolean A0A(EU eu, long j10) {
        int adGroupCount = this.A07.A09(eu.A02, this.A0A).A00();
        if (adGroupCount == 0) {
            return true;
        }
        int i10 = adGroupCount - 1;
        boolean zA01 = eu.A01();
        if (this.A0A.A09(i10) != Long.MIN_VALUE) {
            return !zA01 && j10 == Long.MIN_VALUE;
        }
        int postrollAdCount = this.A0A.A01(i10);
        if (A0C[3].charAt(17) != 'q') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "dZB";
        strArr[1] = "bbK";
        if (postrollAdCount == -1) {
            return false;
        }
        if (((zA01 && eu.A00 == i10 && eu.A01 == postrollAdCount + (-1)) ? 1 : 0) == 0) {
            return !zA01 && this.A0A.A02(i10) == postrollAdCount;
        }
        return true;
    }

    private boolean A0B(EU eu, boolean z10) {
        return !this.A07.A0B(this.A07.A09(eu.A02, this.A0A).A00, this.A0B).A08 && this.A07.A0F(eu.A02, this.A0A, this.A0B, this.A01, this.A09) && z10;
    }

    public final C9Y A0C() {
        C9Y c9y = this.A05;
        if (c9y != null) {
            if (c9y == this.A06) {
                this.A06 = c9y.A01;
            }
            this.A05.A0D();
            int i10 = this.A00 - 1;
            this.A00 = i10;
            if (i10 == 0) {
                this.A04 = null;
                this.A08 = this.A05.A09;
                this.A03 = this.A05.A02.A04.A03;
            }
            C9Y c9y2 = this.A05.A01;
            if (A0C[3].charAt(17) != 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[5] = "umGBE5C5CuHWhY73AVgogVf";
            strArr[7] = "vM8t2ZsrAby17UFg4572Zd2";
            this.A05 = c9y2;
        } else {
            C9Y c9y3 = this.A04;
            this.A05 = c9y3;
            this.A06 = c9y3;
        }
        return this.A05;
    }

    public final C9Y A0D() {
        C9Y c9y = this.A06;
        HG.A04((c9y == null || c9y.A01 == null) ? false : true);
        C9Y c9y2 = this.A06.A01;
        this.A06 = c9y2;
        return c9y2;
    }

    public final C9Y A0E() {
        return A0P() ? this.A05 : this.A04;
    }

    public final C9Y A0F() {
        return this.A04;
    }

    public final C9Y A0G() {
        return this.A05;
    }

    public final C9Y A0H() {
        return this.A06;
    }

    public final C9Z A0I(long j10, C07259c c07259c) {
        C9Y c9y = this.A04;
        if (c9y == null) {
            return A05(c07259c);
        }
        return A03(c9y, j10);
    }

    public final C9Z A0J(C9Z c9z, int i10) {
        return A04(c9z, c9z.A04.A00(i10));
    }

    public final VS A0K(InterfaceC07399q[] interfaceC07399qArr, GP gp, GS gs, EW ew, Object obj, C9Z c9z) {
        long jA07;
        C9Y c9y = this.A04;
        if (c9y != null) {
            jA07 = c9y.A07() + this.A04.A02.A01;
            String[] strArr = A0C;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[5] = "XFCrwzIN7SxWEMf0fznSlHt";
            strArr2[7] = "zDOSpelqL3O1zvPqWZMR4dG";
        } else {
            jA07 = c9z.A03;
        }
        C9Y c9y2 = new C9Y(interfaceC07399qArr, jA07, gp, gs, ew, obj, c9z);
        if (this.A04 != null) {
            HG.A04(A0P());
            this.A04.A01 = c9y2;
        }
        this.A08 = null;
        this.A04 = c9y2;
        this.A00++;
        return c9y2.A08;
    }

    public final EU A0L(int i10, long j10) {
        return A07(i10, j10, A00(i10));
    }

    public final void A0M(long j10) {
        C9Y c9y = this.A04;
        if (c9y != null) {
            c9y.A0G(j10);
        }
    }

    public final void A0N(AbstractC07459x abstractC07459x) {
        this.A07 = abstractC07459x;
    }

    public final void A0O(boolean z10) {
        C9Y c9yA0E = A0E();
        if (c9yA0E != null) {
            this.A08 = z10 ? c9yA0E.A09 : null;
            this.A03 = c9yA0E.A02.A04.A03;
            c9yA0E.A0D();
            A0S(c9yA0E);
        } else if (!z10) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0P() {
        return this.A05 != null;
    }

    public final boolean A0Q() {
        C9Y c9y = this.A04;
        return c9y == null || (!c9y.A02.A05 && this.A04.A0H() && this.A04.A02.A01 != -9223372036854775807L && this.A00 < 100);
    }

    public final boolean A0R(int i10) {
        this.A01 = i10;
        return A08();
    }

    public final boolean A0S(C9Y c9y) {
        HG.A04(c9y != null);
        boolean z10 = false;
        String[] strArr = A0C;
        if (strArr[4].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[4] = "VEc";
        strArr2[1] = "0t0";
        this.A04 = c9y;
        while (c9y.A01 != null) {
            c9y = c9y.A01;
            if (c9y == this.A06) {
                this.A06 = this.A05;
                z10 = true;
            }
            c9y.A0D();
            this.A00--;
        }
        this.A04.A01 = null;
        return z10;
    }

    public final boolean A0T(VS vs) {
        C9Y c9y = this.A04;
        return c9y != null && c9y.A08 == vs;
    }

    public final boolean A0U(EU eu, long j10) {
        int iA03 = eu.A02;
        C9Y c9y = null;
        for (C9Y previousPeriodHolder = A0E(); previousPeriodHolder != null; previousPeriodHolder = previousPeriodHolder.A01) {
            if (c9y == null) {
                C9Z periodInfo = previousPeriodHolder.A02;
                if (A0C[3].charAt(17) != 'q') {
                    throw new RuntimeException();
                }
                String[] strArr = A0C;
                strArr[6] = "pn8srZEQfSJzxw";
                strArr[0] = "zNd";
                previousPeriodHolder.A02 = A0J(periodInfo, iA03);
            } else {
                if (iA03 == -1 || !previousPeriodHolder.A09.equals(this.A07.A0A(iA03, this.A0A, true).A03)) {
                    return true ^ A0S(c9y);
                }
                C9Z c9zA03 = A03(c9y, j10);
                if (c9zA03 == null) {
                    return true ^ A0S(c9y);
                }
                previousPeriodHolder.A02 = A0J(previousPeriodHolder.A02, iA03);
                if (!A09(previousPeriodHolder, c9zA03)) {
                    boolean zA0S = A0S(c9y);
                    String[] strArr2 = A0C;
                    String str = strArr2[4];
                    String str2 = strArr2[1];
                    int length = str.length();
                    int periodIndex = str2.length();
                    if (length != periodIndex) {
                        return true ^ zA0S;
                    }
                    String[] strArr3 = A0C;
                    strArr3[5] = "009NTdXku0rfOoGLKxDbxOM";
                    strArr3[7] = "1WlPwvG5U3NzzyaZC20RJwC";
                    return true ^ zA0S;
                }
            }
            if (previousPeriodHolder.A02.A06) {
                iA03 = this.A07.A03(iA03, this.A0A, this.A0B, this.A01, this.A09);
            }
            c9y = previousPeriodHolder;
        }
        return true;
    }

    public final boolean A0V(boolean z10) {
        this.A09 = z10;
        return A08();
    }
}
