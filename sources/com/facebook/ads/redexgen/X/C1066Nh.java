package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1066Nh {
    public static final int A00 = LO.A00();

    public static void A00(C1337Xw c1337Xw, ViewGroup viewGroup, String str) {
        new AsyncTaskC1212Sx(viewGroup, c1337Xw).A07(str);
        View view = new View(c1337Xw);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LO.A0R(view, c1337Xw);
        viewGroup.addView(view, 0);
    }
}
