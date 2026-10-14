package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class P5 implements View.OnClickListener {
    public final /* synthetic */ P8 A00;

    public P5(P8 p10) {
        this.A00 = p10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A02.ACv(this.A00.A01);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
