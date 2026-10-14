package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MU implements View.OnClickListener {
    public final /* synthetic */ MO A00;
    public final /* synthetic */ TB A01;

    public MU(TB tb2, MO mo) {
        this.A01 = tb2;
        this.A00 = mo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.ABv(C2G.A03);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
