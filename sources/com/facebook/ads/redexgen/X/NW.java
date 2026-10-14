package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NW implements View.OnClickListener {
    public final /* synthetic */ NY A00;

    public NW(NY ny) {
        this.A00 = ny;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A04();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
