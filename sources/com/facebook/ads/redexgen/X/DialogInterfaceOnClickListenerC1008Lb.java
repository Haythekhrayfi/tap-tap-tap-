package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import android.widget.EditText;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC1008Lb implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C1218Td A01;

    public DialogInterfaceOnClickListenerC1008Lb(C1218Td c1218Td, EditText editText) {
        this.A01 = c1218Td;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.A01.A03.execute(new C1219Te(this, dialogInterface));
    }
}
