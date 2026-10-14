package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC0994Kl implements DialogInterface.OnClickListener {
    public final /* synthetic */ DialogInterface.OnClickListener A00;

    public DialogInterfaceOnClickListenerC0994Kl(DialogInterface.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.A00.onClick(dialogInterface, i10);
    }
}
