package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class P3 implements View.OnClickListener {
    public final /* synthetic */ P4 A00;

    public P3(P4 p10) {
        this.A00 = p10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A05.performClick();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
