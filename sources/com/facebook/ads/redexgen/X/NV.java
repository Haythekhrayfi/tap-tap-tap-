package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NV implements View.OnClickListener {
    public final /* synthetic */ NY A00;

    public NV(NY ny) {
        this.A00 = ny;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A04.ABo();
            if (this.A00.A00 != null) {
                LO.A0L(this.A00.A00);
            }
            for (View view2 : this.A00.A06) {
                LO.A0N(view2, 0);
            }
            LO.A0J(this.A00);
            if (this.A00.A05 == null) {
                return;
            }
            LO.A0N(this.A00.A05, 0);
            this.A00.A05.A0b(PZ.A02, 14);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
