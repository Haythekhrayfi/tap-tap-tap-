package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1219Te extends K4 {
    public static String[] A02 = {"r", "tRYI", "7UJuVMqBcP2QEoAe5I9ReZPElv0qEy55", "leQvAr8Bdm", "IrxDcEzjLLQBxw", "x58zC904VQqUCNnuzCjkyAfM", "58DZzAqOGTGaE", "1xO3"};
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterfaceOnClickListenerC1008Lb A01;

    public C1219Te(DialogInterfaceOnClickListenerC1008Lb dialogInterfaceOnClickListenerC1008Lb, DialogInterface dialogInterface) {
        this.A01 = dialogInterfaceOnClickListenerC1008Lb;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        if (this.A01.A01.A02 != null) {
            this.A01.A01.A02.ADe(C0968Jk.A03(this.A01.A01.A00), new C1148Ql().A05(this.A01.A01.A02(this.A01.A00.getText().toString())).A08());
        }
        DialogInterface dialogInterface = this.A00;
        if (A02[6].length() != 13) {
            throw new RuntimeException();
        }
        A02[6] = "1hADnGgCLejuT";
        dialogInterface.cancel();
    }
}
