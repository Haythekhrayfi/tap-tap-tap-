package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZN implements C2R {
    public Drawable A00;
    public final /* synthetic */ C2Q A01;

    public ZN(C2Q c2q) {
        this.A01 = c2q;
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final Drawable A6D() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final C2Q A6E() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final boolean A7c() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final boolean A86() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void AEz(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void AFB(int i10, int i11) {
        if (i10 > this.A01.A01) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(i10);
        }
        if (i11 > this.A01.A00) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(i11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void AFI(int i10, int i11, int i12, int i13) {
        this.A01.A05.set(i10, i11, i12, i13);
        C2Q c2q = this.A01;
        super/*android.widget.FrameLayout*/.setPadding(c2q.A04.left + i10, this.A01.A04.top + i11, this.A01.A04.right + i12, this.A01.A04.bottom + i13);
    }
}
