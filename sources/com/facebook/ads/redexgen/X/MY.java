package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MY implements View.OnClickListener {
    public final /* synthetic */ C2I A00;
    public final /* synthetic */ MO A01;
    public final /* synthetic */ TB A02;

    public MY(TB tb2, MO mo, C2I c2i) {
        this.A02 = tb2;
        this.A01 = mo;
        this.A00 = c2i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.AC4(this.A00);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
