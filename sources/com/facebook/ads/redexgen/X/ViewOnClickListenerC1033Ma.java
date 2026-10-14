package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1033Ma implements View.OnClickListener {
    public final /* synthetic */ C1035Mc A00;

    public ViewOnClickListenerC1033Ma(C1035Mc c1035Mc) {
        this.A00 = c1035Mc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A02.A8E();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
