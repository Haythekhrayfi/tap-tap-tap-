package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MG implements View.OnClickListener {
    public final /* synthetic */ MJ A00;

    public MG(MJ mj) {
        this.A00 = mj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            if (this.A00.A05) {
                this.A00.A04.A4H();
            } else {
                this.A00.A04.A4I();
            }
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
