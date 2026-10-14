package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1349Yi extends AbstractC06084d {
    public static byte[] A03;
    public static String[] A04 = {"WP5CpU5dCfM1vj2iCgRczyLeS833jqA7", "f0t6mABNpir4NiI1IJBR", "VMSqLwjWc3fXvu7D9B7JwatTJSWiKmSt", "2kGOlvpEajHcc9JJ5BV7kSrV8Uhb9VDh", "BGGgbgkg4NpzKA2XjpG6Q8iHB2GG9zH0", "ziOTckvigWpUqNYWulExTvMWDfbzI1Sq", "WkLWBkQ13lLgYVln8HDaQ7gYbGPRUWfj", "hZJ2tRP2pGaevCKAXmW2Fr9GhnOGACBf"};
    public EB A00;
    public Scroller A01;
    public final AbstractC06104f A02 = new C1350Yj(this);

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-35, 10, -68, 5, 10, 15, 16, -3, 10, -1, 1, -68, 11, 2, -68, -21, 10, -30, 8, 5, 10, 3, -24, 5, 15, 16, 1, 10, 1, 14, -68, -3, 8, 14, 1, -3, 0, 21, -68, 15, 1, 16, -54};
        if (A04[2].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[3] = "Gfsvb5V6ZkZ1EjPhJmDEOg0wCX37AMGK";
        strArr[5] = "BogmwpJuEiSgKohE6B9VLJKkNQC2pxlX";
        A03 = bArr;
    }

    public abstract int A0C(AbstractC06054a abstractC06054a, int i10, int i11);

    public abstract View A0D(AbstractC06054a abstractC06054a);

    public abstract int[] A0H(AbstractC06054a abstractC06054a, View view);

    static {
        A09();
    }

    private final C1363Yx A05(AbstractC06054a abstractC06054a) {
        return A0E(abstractC06054a);
    }

    private void A07() {
        this.A00.A1l(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1k(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A06(0, 43, 103));
    }

    private boolean A0A(AbstractC06054a abstractC06054a, int i10, int i11) {
        C1363Yx c1363YxA05;
        if (!(abstractC06054a instanceof InterfaceC06164m) || (c1363YxA05 = A05(abstractC06054a)) == null) {
            return false;
        }
        int iA0C = A0C(abstractC06054a, i10, i11);
        String[] strArr = A04;
        if (strArr[0].charAt(25) == strArr[7].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "3QNQgzU1MIdfo8xP0zEWa1SfaSPVi8u7";
        strArr2[7] = "BhxrOivCOMjMD1hwED78TbVHZR3oyoMb";
        if (iA0C == -1) {
            return false;
        }
        c1363YxA05.A0A(iA0C);
        abstractC06054a.A1L(c1363YxA05);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06084d
    public final boolean A0B(int i10, int i11) {
        AbstractC06054a layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && A0A(layoutManager, i10, i11);
    }

    @Deprecated
    public C1363Yx A0E(AbstractC06054a abstractC06054a) {
        if (!(abstractC06054a instanceof InterfaceC06164m)) {
            return null;
        }
        return new EA(this, this.A00.getContext());
    }

    public final void A0F() {
        AbstractC06054a layoutManager;
        View viewA0D;
        EB eb2 = this.A00;
        if (eb2 == null || (layoutManager = eb2.getLayoutManager()) == null || (viewA0D = A0D(layoutManager)) == null) {
            return;
        }
        int[] iArrA0H = A0H(layoutManager, viewA0D);
        if (iArrA0H[0] != 0 || iArrA0H[1] != 0) {
            this.A00.A1f(iArrA0H[0], iArrA0H[1]);
        }
    }

    public final void A0G(EB eb2) throws IllegalStateException {
        EB eb3 = this.A00;
        if (eb3 == eb2) {
            return;
        }
        if (eb3 != null) {
            A07();
        }
        this.A00 = eb2;
        if (eb2 != null) {
            A08();
            this.A01 = new Scroller(this.A00.getContext(), new DecelerateInterpolator());
            A0F();
        }
    }
}
