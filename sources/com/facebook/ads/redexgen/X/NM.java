package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NM implements DialogInterface.OnClickListener {
    public final /* synthetic */ NO A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public NM(NO no, String str, Map map) {
        this.A00 = no;
        this.A01 = str;
        this.A02 = map;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.A00.A04.A9h(this.A01, this.A02);
    }
}
