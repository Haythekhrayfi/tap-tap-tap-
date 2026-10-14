package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NG {
    public static void A00(View view, boolean z10, View.OnClickListener onClickListener) {
        if (!z10) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z10) {
                return;
            }
            NF nf = new NF(onClickListener);
            view.setOnClickListener(nf);
            view.setOnTouchListener(new NE(nf));
        }
    }
}
