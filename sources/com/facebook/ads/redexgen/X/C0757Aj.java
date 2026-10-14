package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0757Aj implements U6 {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C0757Aj(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0951Ir
    public final void AAC() {
        C0978Jv.A00(new U2(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0951Ir
    public final void AAG() {
        C0978Jv.A00(new U3(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0951Ir
    public final void AB6(JD jd2) {
        C0978Jv.A00(new U5(this, jd2));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0951Ir
    public final void ABn() {
        C0978Jv.A00(new U1(this));
    }

    @Override // com.facebook.ads.redexgen.X.U6
    public final void ABs() {
        C0978Jv.A00(new U4(this));
    }
}
