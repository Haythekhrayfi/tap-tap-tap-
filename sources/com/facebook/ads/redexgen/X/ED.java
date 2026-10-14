package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ED extends C1363Yx {
    public final /* synthetic */ EC A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ED(EC ec2, Context context) {
        super(context);
        this.A00 = ec2;
    }

    @Override // com.facebook.ads.redexgen.X.C1363Yx, com.facebook.ads.redexgen.X.AbstractC06174n
    public final void A0I(View view, C06194p c06194p, C06154l c06154l) {
        EC ec2 = this.A00;
        int[] iArrA0H = ec2.A0H(((AbstractC1349Yi) ec2).A00.getLayoutManager(), view);
        int time = iArrA0H[0];
        int dy = iArrA0H[1];
        int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
        if (dx > 0) {
            c06154l.A04(time, dy, dx, ((C1363Yx) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1363Yx
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.C1363Yx
    public final int A0L(int i10) {
        return Math.min(100, super.A0L(i10));
    }
}
