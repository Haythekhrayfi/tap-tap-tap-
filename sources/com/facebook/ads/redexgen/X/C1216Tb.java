package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1216Tb implements InterfaceC1056Mx {
    public final /* synthetic */ InterfaceC1019Lm A00;
    public final /* synthetic */ TZ A01;

    public C1216Tb(TZ tz, InterfaceC1019Lm interfaceC1019Lm) {
        this.A01 = tz;
        this.A00 = interfaceC1019Lm;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1056Mx
    public final void AC5(String str) {
        this.A01.A0A.setProgress(100);
        this.A01.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1056Mx
    public final void AC7(String str) {
        this.A01.A05 = true;
        this.A01.A09.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1056Mx
    public final void ACP(int i10) {
        if (this.A01.A05) {
            this.A01.A0A.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1056Mx
    public final void ACU(String str) {
        this.A01.A09.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1056Mx
    public final void ACW() {
        this.A00.AAa(14);
    }
}
