package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C4X {
    @Deprecated
    private final void A00(Rect rect, int i10, EB eb2) {
        rect.set(0, 0, 0, 0);
    }

    public final void A01(Rect rect, View view, EB eb2, C06194p c06194p) {
        A00(rect, ((C06064b) view.getLayoutParams()).A00(), eb2);
    }
}
