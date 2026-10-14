package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4K, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C4K {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final AbstractC06054a A02;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{84, 83, 75, 92, 81, 84, 89, Ascii.GS, 82, 79, 84, 88, 83, 73, 92, 73, 84, 82, 83};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i10);

    public C4K(AbstractC06054a abstractC06054a) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = new Rect();
        this.A02 = abstractC06054a;
    }

    public /* synthetic */ C4K(AbstractC06054a abstractC06054a, C1362Yw c1362Yw) {
        this(abstractC06054a);
    }

    public static C1362Yw A00(AbstractC06054a abstractC06054a) {
        return new C1362Yw(abstractC06054a);
    }

    public static C1361Yv A01(AbstractC06054a abstractC06054a) {
        return new C1361Yv(abstractC06054a);
    }

    public static C4K A02(AbstractC06054a abstractC06054a, int i10) {
        switch (i10) {
            case 0:
                return A00(abstractC06054a);
            case 1:
                return A01(abstractC06054a);
            default:
                throw new IllegalArgumentException(A03(0, 19, 11));
        }
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
