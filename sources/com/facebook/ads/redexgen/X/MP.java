package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MP implements View.OnClickListener {
    public final /* synthetic */ TC A00;

    public MP(TC tc2) {
        this.A00 = tc2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A4I();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
