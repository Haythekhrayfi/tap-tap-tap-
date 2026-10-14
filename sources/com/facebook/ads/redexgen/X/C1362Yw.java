package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1362Yw extends C4K {
    public C1362Yw(AbstractC06054a abstractC06054a) {
        super(abstractC06054a, null);
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final int A06() {
        return this.A02.A0h();
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final int A07() {
        return this.A02.A0h() - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final int A08() {
        return this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final int A09() {
        return this.A02.A0i();
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final int A0A() {
        return this.A02.A0e();
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final int A0B() {
        return (this.A02.A0h() - this.A02.A0e()) - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final int A0C(View view) {
        return this.A02.A0n(view) + ((C06064b) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final int A0D(View view) {
        C06064b c06064b = (C06064b) view.getLayoutParams();
        return this.A02.A0m(view) + c06064b.leftMargin + c06064b.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final int A0E(View view) {
        C06064b c06064b = (C06064b) view.getLayoutParams();
        return this.A02.A0l(view) + c06064b.topMargin + c06064b.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final int A0F(View view) {
        return this.A02.A0k(view) - ((C06064b) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.right;
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.left;
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final void A0J(int i10) {
        this.A02.A0z(i10);
    }
}
