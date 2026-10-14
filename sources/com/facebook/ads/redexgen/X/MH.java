package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MH implements View.OnClickListener {
    public final /* synthetic */ MJ A00;

    public MH(MJ mj) {
        this.A00 = mj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A04.A97();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
