package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZJ implements C2S {
    public final RectF A00 = new RectF();

    private C2V A00(Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        return new C2V(context.getResources(), colorStateList, f10, f11, f12);
    }

    private C2V A01(C2R c2r) {
        return (C2V) c2r.A6D();
    }

    public final void A02(C2R c2r) {
        Rect rect = new Rect();
        A01(c2r).A0K(rect);
        c2r.AFB((int) Math.ceil(A7J(c2r)), (int) Math.ceil(A7I(c2r)));
        c2r.AFI(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final ColorStateList A60(C2R c2r) {
        return A01(c2r).A0F();
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final float A6l(C2R c2r) {
        return A01(c2r).A0E();
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final float A7D(C2R c2r) {
        return A01(c2r).A0B();
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final float A7I(C2R c2r) {
        return A01(c2r).A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final float A7J(C2R c2r) {
        return A01(c2r).A0D();
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final float A7d(C2R c2r) {
        return A01(c2r).A0A();
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public void A8g() {
        C2V.A0G = new ZK(this);
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final void A8h(C2R c2r, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        C2V c2vA00 = A00(context, colorStateList, f10, f11, f12);
        c2vA00.A0L(c2r.A7c());
        c2r.AEz(c2vA00);
        A02(c2r);
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final void AAh(C2R c2r) {
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final void ACM(C2R c2r) {
        A01(c2r).A0L(c2r.A7c());
        A02(c2r);
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final void AEy(C2R c2r, ColorStateList colorStateList) {
        A01(c2r).A0J(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final void AF4(C2R c2r, float f10) {
        A01(c2r).A0I(f10);
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final void AFA(C2R c2r, float f10) {
        A01(c2r).A0H(f10);
        A02(c2r);
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final void AFG(C2R c2r, float f10) {
        A01(c2r).A0G(f10);
        A02(c2r);
    }
}
