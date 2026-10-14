package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C06626j extends AbstractC1001Ku {
    public final /* synthetic */ C0973Jq A00;

    public C06626j(C0973Jq c0973Jq) {
        this.A00 = c0973Jq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8Y
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1002Kv c1002Kv) {
        if (this.A00.A01 == null || c1002Kv.A00().getAction() != 0) {
            return;
        }
        this.A00.A04.removeCallbacksAndMessages(null);
        this.A00.A07(new C1121Pk(this));
    }
}
