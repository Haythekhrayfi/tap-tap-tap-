package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1043Mk implements View.OnClickListener {
    public final /* synthetic */ C1048Mp A00;

    public ViewOnClickListenerC1043Mk(C1048Mp c1048Mp) {
        this.A00 = c1048Mp;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            if (this.A00.A04 == null) {
                return;
            }
            this.A00.A04.AAg();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
