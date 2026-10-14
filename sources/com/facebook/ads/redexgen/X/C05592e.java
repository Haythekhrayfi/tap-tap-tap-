package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05592e<E> implements Cloneable {
    public static byte[] A04;
    public static final Object A05;
    public int A00;
    public boolean A01;
    public long[] A02;
    public Object[] A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final E A02(long j10, E e10) {
        E e11;
        int iA03 = C05582d.A03(this.A02, this.A00, j10);
        return (iA03 < 0 || (e11 = (E) this.A03[iA03]) == A05) ? e10 : e11;
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{19, 79, 83, 82, 72, Ascii.ESC, 118, 90, 75, 18, 91, 87, 51, 53};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A0B(long j10, E e10) {
        int iA03 = C05582d.A03(this.A02, this.A00, j10);
        if (iA03 >= 0) {
            this.A03[iA03] = e10;
            return;
        }
        int iA04 = iA03 ^ (-1);
        int i10 = this.A00;
        if (iA04 < i10) {
            Object[] objArr = this.A03;
            if (objArr[iA04] == A05) {
                this.A02[iA04] = j10;
                objArr[iA04] = e10;
                return;
            }
        }
        if (this.A01 && i10 >= this.A02.length) {
            A04();
            iA04 = C05582d.A03(this.A02, this.A00, j10) ^ (-1);
        }
        int i11 = this.A00;
        if (i11 >= this.A02.length) {
            int iA00 = C05582d.A00(i11 + 1);
            long[] jArr = new long[iA00];
            Object[] objArr2 = new Object[iA00];
            long[] jArr2 = this.A02;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.A03;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.A02 = jArr;
            this.A03 = objArr2;
        }
        int i12 = this.A00;
        if (i12 - iA04 != 0) {
            long[] jArr3 = this.A02;
            System.arraycopy(jArr3, iA04, jArr3, iA04 + 1, i12 - iA04);
            Object[] objArr4 = this.A03;
            System.arraycopy(objArr4, iA04, objArr4, iA04 + 1, this.A00 - iA04);
        }
        this.A02[iA04] = j10;
        this.A03[iA04] = e10;
        this.A00++;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final String toString() {
        if (A06() <= 0) {
            return A03(12, 2, 126);
        }
        StringBuilder sb2 = new StringBuilder(this.A00 * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.A00; i10++) {
            if (i10 > 0) {
                sb2.append(A03(10, 2, 65));
            }
            sb2.append(A00(i10));
            sb2.append('=');
            E eA07 = A07(i10);
            if (eA07 != this) {
                sb2.append(eA07);
            } else {
                sb2.append(A03(0, 10, 13));
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    static {
        A05();
        A05 = new Object();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2e != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C05592e() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2e != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C05592e(int i10) {
        this.A01 = false;
        if (i10 == 0) {
            this.A02 = C05582d.A01;
            this.A03 = C05582d.A02;
        } else {
            int iA00 = C05582d.A00(i10);
            this.A02 = new long[iA00];
            this.A03 = new Object[iA00];
        }
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2e != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final long A00(int i10) {
        if (this.A01) {
            A04();
        }
        return this.A02[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2e != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C05592e<E> clone() {
        C05592e<E> c05592e = null;
        try {
            c05592e = (C05592e) super.clone();
            c05592e.A02 = (long[]) this.A02.clone();
            c05592e.A03 = (Object[]) this.A03.clone();
            return c05592e;
        } catch (CloneNotSupportedException unused) {
            return c05592e;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2e != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private void A04() {
        int i10 = this.A00;
        int i11 = 0;
        long[] jArr = this.A02;
        Object[] objArr = this.A03;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != A05) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.A01 = false;
        this.A00 = i11;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2e != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final int A06() {
        if (this.A01) {
            A04();
        }
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2e != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A07(int i10) {
        if (this.A01) {
            A04();
        }
        return (E) this.A03[i10];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2e != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A08(long j10) {
        return A02(j10, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2e != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A09() {
        int i10 = this.A00;
        Object[] objArr = this.A03;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2e != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0A(int i10) {
        Object[] objArr = this.A03;
        Object obj = objArr[i10];
        Object obj2 = A05;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.A01 = true;
        }
    }
}
