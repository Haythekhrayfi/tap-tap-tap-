package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1069Nk implements View.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC1207Ss A00;
    public final /* synthetic */ String A01;

    public ViewOnClickListenerC1069Nk(ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss, String str) {
        this.A00 = viewOnClickListenerC1207Ss;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A09(this.A01);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
