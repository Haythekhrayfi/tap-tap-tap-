package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C4F {
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public boolean A09;
    public boolean A0B = true;
    public int A02 = 0;
    public boolean A0A = false;
    public List<AbstractC06224s> A08 = null;

    private View A00() {
        int size = this.A08.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = this.A08.get(i10).A0H;
            C06064b c06064b = (C06064b) view.getLayoutParams();
            if (!c06064b.A02()) {
                int i11 = this.A01;
                int size2 = c06064b.A00();
                if (i11 == size2) {
                    A02(view);
                    return view;
                }
            }
        }
        return null;
    }

    private final View A01(View view) {
        int size = this.A08.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = this.A08.get(i11).A0H;
            C06064b c06064b = (C06064b) view3.getLayoutParams();
            if (view3 != view && !c06064b.A02()) {
                int iA00 = c06064b.A00();
                int size2 = this.A01;
                int i12 = iA00 - size2;
                int size3 = this.A03;
                int i13 = i12 * size3;
                if (i13 >= 0 && i13 < i10) {
                    view2 = view3;
                    i10 = i13;
                    if (i13 == 0) {
                        break;
                    }
                }
            }
        }
        return view2;
    }

    private final void A02(View view) {
        View closest = A01(view);
        if (closest == null) {
            this.A01 = -1;
        } else {
            this.A01 = ((C06064b) closest.getLayoutParams()).A00();
        }
    }

    public final View A03(C06124i c06124i) {
        if (this.A08 != null) {
            return A00();
        }
        View viewA0G = c06124i.A0G(this.A01);
        this.A01 += this.A03;
        return viewA0G;
    }

    public final void A04() {
        A02(null);
    }

    public final boolean A05(C06194p c06194p) {
        int i10 = this.A01;
        return i10 >= 0 && i10 < c06194p.A03();
    }
}
