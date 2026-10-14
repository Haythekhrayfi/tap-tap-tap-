package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1355Yp implements InterfaceC06254v {
    public final /* synthetic */ AbstractC06054a A00;

    public C1355Yp(AbstractC06054a abstractC06054a) {
        this.A00 = abstractC06054a;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06254v
    public final View A6G(int i10) {
        return this.A00.A0t(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06254v
    public final int A6I(View view) {
        return this.A00.A0j(view) + ((C06064b) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06254v
    public final int A6J(View view) {
        return this.A00.A0o(view) - ((C06064b) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06254v
    public final int A7R() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06254v
    public final int A7S() {
        return this.A00.A0g();
    }
}
