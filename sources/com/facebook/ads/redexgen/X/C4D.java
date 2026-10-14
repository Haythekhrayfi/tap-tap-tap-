package com.facebook.ads.redexgen.X;

import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4D, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C4D {
    public static byte[] A05;
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final /* synthetic */ C1364Yy A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{13, 1, 76, 98, 78, 78, 83, 69, 72, 79, 64, 85, 68, Ascii.FS, 111, 99, 46, 15, 34, 58, 44, 54, 55, 5, 49, 44, 46, 6, 45, 39, 126, 91, 87, Ascii.SUB, 33, 22, Ascii.ESC, Ascii.RS, 19, 74, 116, 91, 86, 93, 90, 71, 124, 91, 83, 90, 78, 88, 101, 90, 70, 92, 65, 92, 90, 91, 8};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A05(View view) {
        int iA05 = this.A04.A04.A05();
        if (iA05 >= 0) {
            A04(view);
            return;
        }
        this.A01 = this.A04.A0p(view);
        if (this.A02) {
            int iA07 = (this.A04.A04.A07() - iA05) - this.A04.A04.A0C(view);
            this.A00 = this.A04.A04.A07() - iA07;
            if (iA07 > 0) {
                int iA0D = this.A00 - this.A04.A04.A0D(view);
                int iA0A = this.A04.A04.A0A();
                int iMin = iA0D - (Math.min(this.A04.A04.A0F(view) - iA0A, 0) + iA0A);
                if (iMin < 0) {
                    this.A00 += Math.min(iA07, -iMin);
                    return;
                }
                return;
            }
            return;
        }
        int iA0F = this.A04.A04.A0F(view);
        int iA0A2 = iA0F - this.A04.A04.A0A();
        this.A00 = iA0F;
        if (iA0A2 > 0) {
            int iA08 = (this.A04.A04.A07() - Math.min(0, (this.A04.A04.A07() - iA05) - this.A04.A04.A0C(view))) - (this.A04.A04.A0D(view) + iA0F);
            if (iA08 < 0) {
                this.A00 -= Math.min(iA0A2, -iA08);
            }
        }
    }

    public C4D(C1364Yy c1364Yy) {
        this.A04 = c1364Yy;
        A03();
    }

    public final void A02() {
        int iA0A;
        if (this.A02) {
            iA0A = this.A04.A04.A07();
        } else {
            iA0A = this.A04.A04.A0A();
        }
        this.A00 = iA0A;
    }

    public final void A03() {
        this.A01 = -1;
        this.A00 = Integer.MIN_VALUE;
        this.A02 = false;
        this.A03 = false;
    }

    public final void A04(View view) {
        if (this.A02) {
            this.A00 = this.A04.A04.A0C(view) + this.A04.A04.A05();
        } else {
            this.A00 = this.A04.A04.A0F(view);
        }
        this.A01 = this.A04.A0p(view);
    }

    public final boolean A06(View view, C06194p c06194p) {
        C06064b c06064b = (C06064b) view.getLayoutParams();
        return !c06064b.A02() && c06064b.A00() >= 0 && c06064b.A00() < c06194p.A03();
    }

    public final String toString() {
        return A00(40, 21, 73) + this.A01 + A00(0, 14, 93) + this.A00 + A00(14, 17, 63) + this.A02 + A00(31, 9, 11) + this.A03 + '}';
    }
}
