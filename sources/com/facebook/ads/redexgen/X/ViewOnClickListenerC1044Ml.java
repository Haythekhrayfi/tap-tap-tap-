package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1044Ml implements View.OnClickListener {
    public final /* synthetic */ C1048Mp A00;

    public ViewOnClickListenerC1044Ml(C1048Mp c1048Mp) {
        this.A00 = c1048Mp;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A08.canGoBack()) {
                return;
            }
            this.A00.A08.goBack();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
