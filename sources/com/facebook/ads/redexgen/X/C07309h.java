package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C07309h extends C1179Rq {
    public static String[] A00 = {"4DJOkXe9rib7uWc4nLa4kcuSPdxs7gf4", "Dyxr4XzeXsq4jjw5BU630cyoQdL32ISv", "MScpZjpz", "3XC0FNsyX3k6WX9dbHhU9IwCEOagJZ1X", "JEKgPGdFYfe9RoD8dW0t8x0Mvi1GtEmi", "N5tdloXdcly7PUtxD1ZshZXdUDk2Lr2A", "5elKCHWntj6O1Wqi1faAvLWvEV4yzp2T", "JBMx9492vmjOwkRP6"};

    public C07309h(C2M c2m, int i10, List<P2> list, QR qr, Bundle bundle) {
        super(c2m, i10, list, qr, bundle);
        c2m.A1k(this);
        this.A03 = new T7(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int iA27 = this.A0C.A27();
        if (this.A05 == null || iA27 == -1) {
            return;
        }
        int curPos = this.A05.size();
        if (iA27 < curPos - 1) {
            int curPos2 = iA27 + 1;
            A0V(curPos2);
        }
    }

    private void A01(int i10) {
        int visibleItem = this.A0C.A28();
        int lastVisibleItem = this.A0C.A29();
        int firstVisibleItem = this.A0C.A27();
        if (firstVisibleItem != visibleItem) {
            A0S(visibleItem);
        }
        if (firstVisibleItem != lastVisibleItem) {
            A0S(lastVisibleItem);
        }
        A0T(firstVisibleItem);
        A0W(visibleItem, lastVisibleItem, i10);
    }

    @Override // com.facebook.ads.redexgen.X.C1179Rq, com.facebook.ads.redexgen.X.AbstractC06104f
    public final void A0L(EB eb2, int i10) {
    }

    @Override // com.facebook.ads.redexgen.X.C1179Rq, com.facebook.ads.redexgen.X.AbstractC06104f
    public final void A0M(EB eb2, int i10, int i11) {
        if (this.A0C.A27() != -1) {
            AbstractC1189Sa abstractC1189Sa = (AbstractC1189Sa) this.A0C.A1q(this.A0C.A27());
            if (A00[2].length() == 4) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[3] = "IxYVUA16uQkbjXwNztolao4gyOA0tKzF";
            strArr[6] = "jcO9EzcXxFOxyF2BSjZiD0vteRj0mA5y";
            if (abstractC1189Sa != null && abstractC1189Sa.A11() && !abstractC1189Sa.A10()) {
                abstractC1189Sa.A0y();
            }
            A01(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1179Rq
    public final void A0Y(View view, boolean z10) {
        view.setAlpha(z10 ? 1.0f : 0.8f);
    }

    @Override // com.facebook.ads.redexgen.X.C1179Rq
    public final void A0a(AbstractC1189Sa abstractC1189Sa, boolean z10) {
        A0Y(abstractC1189Sa, z10);
        if (!z10 && abstractC1189Sa.A10()) {
            abstractC1189Sa.A0x();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1179Rq
    public final boolean A0b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final QR A0c() {
        return this.A04;
    }

    public final void A0d(QR qr) {
        this.A04 = qr;
    }

    public final void A0e(List<P2> list) {
        this.A05 = list;
    }
}
