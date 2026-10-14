package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5G, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C5G implements View.OnLongClickListener {
    public final /* synthetic */ C5H A00;

    public C5G(C5H c5h) {
        this.A00 = c5h;
    }

    public /* synthetic */ C5G(C5H c5h, C5D c5d) {
        this(c5h);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.A00.A0A != null && this.A00.A06 != null) {
            this.A00.A0A.setBounds(0, 0, this.A00.A06.getWidth(), this.A00.A06.getHeight());
            this.A00.A0A.A0D(!this.A00.A0A.A0E());
        }
        return true;
    }
}
