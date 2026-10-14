package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C06706u extends AbstractC1001Ku {
    public final /* synthetic */ C0981Jy A00;

    public C06706u(C0981Jy c0981Jy) {
        this.A00 = c0981Jy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8Y
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1002Kv c1002Kv) {
        if (this.A00.A01 == null || this.A00.A03 || c1002Kv.A00().getAction() != 0) {
            return;
        }
        this.A00.A05.removeCallbacksAndMessages(null);
        if (this.A00.A0D(EnumC1132Pv.A05)) {
            this.A00.A03();
            this.A00.A06(true, false);
        }
        if (this.A00.A02) {
            this.A00.A05.postDelayed(new C0982Jz(this), this.A00.A00);
        }
    }
}
