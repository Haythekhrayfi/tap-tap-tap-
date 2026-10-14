package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class M8 implements View.OnClickListener {
    public final /* synthetic */ TG A00;

    public M8(TG tg) {
        this.A00 = tg;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A07.ABC();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
