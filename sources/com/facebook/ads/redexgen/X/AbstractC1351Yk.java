package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1351Yk extends C4W {
    public static String[] A01 = {"ufm8s7LRmOM7", "sIBwdoM05ajejE", "0NxvrnR7UZDHrBy4xVhLU5lsqzWJ5R3x", "FsILnIqpIa8iE3wffvJrO4tNlZdDmpUd", "wKnqjXSh8f61FKWyknAGi8xlXXoDdiLA", "lpMPMGmveEx5YZPPZgDkriuB4nzdouJK", "fQPzW90JHWOApVaaQbndX59CGXgCnXlm", "Pp9SKBa6RS3IfLIGXA9e4oeVKGHa5CsE"};
    public boolean A00 = true;

    public abstract boolean A0R(AbstractC06224s abstractC06224s);

    public abstract boolean A0S(AbstractC06224s abstractC06224s);

    public abstract boolean A0T(AbstractC06224s abstractC06224s, int i10, int i11, int i12, int i13);

    public abstract boolean A0U(AbstractC06224s abstractC06224s, AbstractC06224s abstractC06224s2, int i10, int i11, int i12, int i13);

    @Override // com.facebook.ads.redexgen.X.C4W
    public final boolean A0D(AbstractC06224s abstractC06224s) {
        return !this.A00 || abstractC06224s.A0b();
    }

    @Override // com.facebook.ads.redexgen.X.C4W
    public final boolean A0E(AbstractC06224s abstractC06224s, C4V c4v, C4V c4v2) {
        if (c4v != null && (c4v.A01 != c4v2.A01 || c4v.A03 != c4v2.A03)) {
            return A0T(abstractC06224s, c4v.A01, c4v.A03, c4v2.A01, c4v2.A03);
        }
        return A0R(abstractC06224s);
    }

    @Override // com.facebook.ads.redexgen.X.C4W
    public final boolean A0F(AbstractC06224s abstractC06224s, C4V c4v, C4V c4v2) {
        int i10 = c4v.A01;
        int i11 = c4v.A03;
        View view = abstractC06224s.A0H;
        int oldLeft = c4v2 == null ? view.getLeft() : c4v2.A01;
        int oldTop = c4v2 == null ? view.getTop() : c4v2.A03;
        if (!abstractC06224s.A0c() && (i10 != oldLeft || i11 != oldTop)) {
            view.layout(oldLeft, oldTop, view.getWidth() + oldLeft, view.getHeight() + oldTop);
            return A0T(abstractC06224s, i10, i11, oldLeft, oldTop);
        }
        return A0S(abstractC06224s);
    }

    @Override // com.facebook.ads.redexgen.X.C4W
    public final boolean A0G(AbstractC06224s abstractC06224s, C4V c4v, C4V c4v2) {
        if (c4v.A01 != c4v2.A01 || c4v.A03 != c4v2.A03) {
            return A0T(abstractC06224s, c4v.A01, c4v.A03, c4v2.A01, c4v2.A03);
        }
        A0O(abstractC06224s);
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C4W
    public final boolean A0H(AbstractC06224s abstractC06224s, AbstractC06224s abstractC06224s2, C4V c4v, C4V c4v2) {
        int fromTop;
        int toLeft;
        int i10 = c4v.A01;
        int fromLeft = c4v.A03;
        if (abstractC06224s2.A0h()) {
            fromTop = c4v.A01;
            toLeft = c4v.A03;
        } else {
            fromTop = c4v2.A01;
            toLeft = c4v2.A03;
        }
        int toTop = A01[1].length();
        if (toTop != 14) {
            throw new RuntimeException();
        }
        A01[1] = "7F8ns227Orjao7";
        return A0U(abstractC06224s, abstractC06224s2, i10, fromLeft, fromTop, toLeft);
    }

    public final void A0N(AbstractC06224s abstractC06224s) {
        A0C(abstractC06224s);
    }

    public final void A0O(AbstractC06224s abstractC06224s) {
        A0C(abstractC06224s);
    }

    public final void A0P(AbstractC06224s abstractC06224s) {
        A0C(abstractC06224s);
    }

    public final void A0Q(AbstractC06224s abstractC06224s, boolean z10) {
        A0C(abstractC06224s);
    }
}
