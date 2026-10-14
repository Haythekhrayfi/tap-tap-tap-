package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZL implements C2S {
    private C2T A00(C2R c2r) {
        return (C2T) c2r.A6D();
    }

    public final void A01(C2R c2r) {
        if (!c2r.A86()) {
            c2r.AFI(0, 0, 0, 0);
            return;
        }
        float fA7D = A7D(c2r);
        float fA7d = A7d(c2r);
        float elevation = C2V.A00(fA7D, fA7d, c2r.A7c());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = C2V.A01(fA7D, fA7d, c2r.A7c());
        int iCeil = (int) Math.ceil(elevation2);
        c2r.AFI(vPadding, iCeil, vPadding, iCeil);
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final ColorStateList A60(C2R c2r) {
        return A00(c2r).A05();
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final float A6l(C2R c2r) {
        return c2r.A6E().getElevation();
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final float A7D(C2R c2r) {
        return A00(c2r).A03();
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final float A7I(C2R c2r) {
        return A7d(c2r) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final float A7J(C2R c2r) {
        return A7d(c2r) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final float A7d(C2R c2r) {
        return A00(c2r).A04();
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final void A8g() {
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final void A8h(C2R c2r, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        C2T background = new C2T(colorStateList, f10);
        c2r.AEz(background);
        View view = c2r.A6E();
        view.setClipToOutline(true);
        view.setElevation(f11);
        AFA(c2r, f12);
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final void AAh(C2R c2r) {
        AFA(c2r, A7D(c2r));
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final void ACM(C2R c2r) {
        AFA(c2r, A7D(c2r));
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final void AEy(C2R c2r, ColorStateList colorStateList) {
        A00(c2r).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final void AF4(C2R c2r, float f10) {
        c2r.A6E().setElevation(f10);
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final void AFA(C2R c2r, float f10) {
        A00(c2r).A07(f10, c2r.A86(), c2r.A7c());
        A01(c2r);
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final void AFG(C2R c2r, float f10) {
        A00(c2r).A06(f10);
    }
}
