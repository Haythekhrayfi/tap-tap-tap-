package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import com.facebook.ads.redexgen.X.AbstractC06224s;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4O, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C4O<VH extends AbstractC06224s> {
    public static byte[] A02;
    public static String[] A03 = {"W324oDAhe3QD27ZyNAxx1dE4409WhTwA", "Ikg10MzvREcGgl38", "tAS262iMJzRr57vvpxPoG7SYxewns3xN", "rCt", "3uu7", "cbDGC8uMMSmc1mSYy17nilWnTwttZfvA", "2T", "U5f6pdP97"};
    public final C4P A01 = new C4P();
    public boolean A00 = false;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[2].charAt(21) != '7') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "WHsKZN6zyncpMK6d";
            strArr[4] = "wlW4";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 32);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-48, -44, -98, -63, -16, -29, -33, -14, -29, -44, -25, -29, -11, -54, -50, -104, -57, -26, -70, -31, -26, -36, -50, -31, -35, -17};
    }

    public abstract VH A0C(ViewGroup viewGroup, int i10);

    public abstract int A0D();

    public abstract void A0E(VH vh, int i10);

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4O != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4s> */
    private final void A02(VH holder, int i10, List<Object> payloads) {
        A0E(holder, i10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4O != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4s> */
    public final int A03(int i10) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4O != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4s> */
    public final long A04(int i10) {
        return -1L;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4O != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4s> */
    public final VH A05(ViewGroup viewGroup, int i10) {
        C05572c.A01(A00(0, 13, 94));
        VH vh = (VH) A0C(viewGroup, i10);
        vh.A00 = i10;
        C05572c.A00();
        return vh;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4O != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4s> */
    public final void A06() {
        this.A01.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4O != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4s> */
    public final void A07(C4Q c4q) {
        this.A01.registerObserver(c4q);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4O != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4s> */
    public final void A08(C4Q c4q) {
        this.A01.unregisterObserver(c4q);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0074  */
    /* JADX WARN: Code duplicated, block: B:9:0x0053  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4O != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4s> */
    public final void A09(VH vh, int i10) {
        ViewGroup.LayoutParams layoutParams;
        String[] strArr;
        vh.A03 = i10;
        if (A0A()) {
            long jA04 = A04(i10);
            String[] strArr2 = A03;
            if (strArr2[7].length() != strArr2[6].length()) {
                String[] strArr3 = A03;
                strArr3[7] = "OgtetI94x";
                strArr3[6] = "QU";
                vh.A05 = jA04;
                vh.A0U(1, 519);
                C05572c.A01(A00(13, 13, 88));
                A02(vh, i10, vh.A0L());
                vh.A0N();
                layoutParams = vh.A0H.getLayoutParams();
                if (layoutParams instanceof C06064b) {
                    ((C06064b) layoutParams).A01 = true;
                }
                C05572c.A00();
                strArr = A03;
                if (strArr[5].charAt(31) == strArr[0].charAt(31)) {
                    String[] strArr4 = A03;
                    strArr4[7] = "GQKIQ0ZEK";
                    strArr4[6] = "Zf";
                    return;
                }
            }
        } else {
            vh.A0U(1, 519);
            C05572c.A01(A00(13, 13, 88));
            A02(vh, i10, vh.A0L());
            vh.A0N();
            layoutParams = vh.A0H.getLayoutParams();
            if (layoutParams instanceof C06064b) {
                ((C06064b) layoutParams).A01 = true;
            }
            C05572c.A00();
            strArr = A03;
            if (strArr[5].charAt(31) == strArr[0].charAt(31)) {
                String[] strArr5 = A03;
                strArr5[7] = "GQKIQ0ZEK";
                strArr5[6] = "Zf";
                return;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4O != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4s> */
    public final boolean A0A() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4O != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4s> */
    public final boolean A0B(VH holder) {
        return false;
    }
}
