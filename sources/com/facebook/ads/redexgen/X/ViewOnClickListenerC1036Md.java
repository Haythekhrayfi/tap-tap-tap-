package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1036Md implements View.OnClickListener {
    public final /* synthetic */ TA A00;

    public ViewOnClickListenerC1036Md(TA ta2) {
        this.A00 = ta2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A8E();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
