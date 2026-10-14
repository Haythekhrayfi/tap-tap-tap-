package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC0958Iy implements DialogInterface.OnClickListener {
    public final /* synthetic */ U9 A00;

    public DialogInterfaceOnClickListenerC0958Iy(U9 u10) {
        this.A00 = u10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        if (this.A00.A01.A0a == null) {
            return;
        }
        this.A00.A01.A0a.A0P(this.A00.A01());
    }
}
