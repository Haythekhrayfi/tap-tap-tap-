package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZA implements InterfaceC05792z {
    public final Rect A00 = new Rect();
    public final /* synthetic */ C3T A01;

    public ZA(C3T c3t) {
        this.A01 = c3t;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05792z
    public final C3W AAK(View view, C3W c3w) {
        C3W c3wA06 = C3F.A06(view, c3w);
        if (c3wA06.A07()) {
            return c3wA06;
        }
        Rect rect = this.A00;
        rect.left = c3wA06.A03();
        rect.top = c3wA06.A05();
        rect.right = c3wA06.A04();
        rect.bottom = c3wA06.A02();
        int i10 = this.A01.getChildCount();
        for (int count = 0; count < i10; count++) {
            C3W c3wA05 = C3F.A05(this.A01.getChildAt(count), c3wA06);
            rect.left = Math.min(c3wA05.A03(), rect.left);
            rect.top = Math.min(c3wA05.A05(), rect.top);
            rect.right = Math.min(c3wA05.A04(), rect.right);
            rect.bottom = Math.min(c3wA05.A02(), rect.bottom);
        }
        int count2 = rect.left;
        C3W applied = c3wA06.A06(count2, rect.top, rect.right, rect.bottom);
        return applied;
    }
}
