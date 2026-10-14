package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0754Ag extends C1363Yx {
    public final /* synthetic */ AZ A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.C1363Yx
    public final int A0O(View view, int i10) {
        AbstractC06054a abstractC06054aA08 = A08();
        if (!abstractC06054aA08.A24()) {
            return 0;
        }
        C06064b c06064b = (C06064b) view.getLayoutParams();
        return A0N(abstractC06054aA08.A0k(view) - c06064b.leftMargin, abstractC06054aA08.A0n(view) + c06064b.rightMargin, abstractC06054aA08.A0e(), abstractC06054aA08.A0h() - abstractC06054aA08.A0f(), i10) + this.A00.A02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0754Ag(AZ az, C1337Xw c1337Xw) {
        super(c1337Xw);
        this.A00 = az;
    }

    @Override // com.facebook.ads.redexgen.X.C1363Yx
    public final float A0J(DisplayMetrics displayMetrics) {
        return this.A00.A00 / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.C1363Yx
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.C1363Yx
    public final PointF A0P(int i10) {
        return this.A00.A4K(i10);
    }
}
