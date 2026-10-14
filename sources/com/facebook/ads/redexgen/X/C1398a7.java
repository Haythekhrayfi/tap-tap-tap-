package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1398a7 implements InterfaceC05321d {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1404aD A01;
    public final /* synthetic */ C1402aB A02;
    public final /* synthetic */ InterfaceC05321d A03;
    public final /* synthetic */ C05331e A04;
    public final /* synthetic */ C1337Xw A05;
    public final /* synthetic */ EnumSet A06;

    public C1398a7(C05331e c05331e, C1337Xw c1337Xw, AbstractC1404aD abstractC1404aD, C1402aB c1402aB, int i10, InterfaceC05321d interfaceC05321d, EnumSet enumSet) {
        this.A04 = c05331e;
        this.A05 = c1337Xw;
        this.A01 = abstractC1404aD;
        this.A02 = c1402aB;
        this.A00 = i10;
        this.A03 = interfaceC05321d;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 >= this.A02.A0i()) {
            return;
        }
        C05331e c05331e = this.A04;
        C1337Xw c1337Xw = this.A05;
        EnumSet enumSet = this.A06;
        C1402aB c1402aB = this.A02;
        c05331e.A0A(c1337Xw, enumSet, c1402aB, c1402aB.A0l(this.A00 + 1), this.A00 + 1, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05321d
    public final void AAE(AdError adError) {
        if (this.A00 == 0) {
            this.A03.AAE(adError);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05321d
    public final void AAF() {
        this.A05.A00().AEv(this.A01.A0s(), this.A02.A0m());
        if (this.A00 == 0) {
            this.A03.AAF();
        }
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05321d
    public final void AEA() {
        if (this.A00 == 0) {
            this.A03.AEA();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05321d
    public final void AFq() {
        if (this.A00 == 0) {
            this.A03.AFq();
        }
    }
}
