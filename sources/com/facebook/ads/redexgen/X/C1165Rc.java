package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1165Rc implements C5F {
    public final /* synthetic */ C5H A00;
    public final /* synthetic */ C7F A01;

    public C1165Rc(C7F c7f, C5H c5h) {
        this.A01 = c7f;
        this.A00 = c5h;
    }

    @Override // com.facebook.ads.redexgen.X.C5F
    public final boolean A8j() {
        if (!this.A01.A0Y()) {
            if (this.A01.A0Z()) {
                return true;
            }
            return this.A01.A0a();
        }
        this.A01.A0X(this.A00);
        return true;
    }
}
