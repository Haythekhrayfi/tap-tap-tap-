package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class T6 extends C4O<C1170Rh> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC1019Lm A03;
    public QR A04;
    public String A05;
    public List<P2> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC1404aD A08;
    public final C6O A09;
    public final C1337Xw A0A;
    public final InterfaceC0937Id A0B;
    public final U7 A0C;
    public final LG A0D;
    public final C07309h A0E;
    public final JY A0F;

    public T6(C1337Xw c1337Xw, List<P2> list, AbstractC1404aD abstractC1404aD, InterfaceC0937Id interfaceC0937Id, U7 u10, InterfaceC1019Lm interfaceC1019Lm, String str, C07309h c07309h, JY jy) {
        this.A0A = c1337Xw;
        this.A0B = interfaceC0937Id;
        this.A0C = u10;
        this.A09 = u10.A10();
        this.A04 = u10.A1A();
        this.A0D = u10.A19();
        this.A03 = interfaceC1019Lm;
        this.A08 = abstractC1404aD;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c07309h;
        this.A0F = jy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4O
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1170Rh A0C(ViewGroup viewGroup, int i10) {
        return new C1170Rh(NP.A00(new C1075Nq(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0I(this.A0F).A0G(this.A0C).A0J(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4O
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(C1170Rh c1170Rh, int i10) {
        P2 p10 = this.A06.get(i10);
        c1170Rh.A0m(this.A04);
        c1170Rh.A0l(p10, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4O
    public final int A0D() {
        return this.A06.size();
    }

    public final void A0F(int i10, int i11, int i12) {
        boolean needsUpdate = i10 != this.A00;
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
        if (needsUpdate) {
            A06();
        }
    }

    public final void A0G(QR qr) {
        this.A04 = qr;
    }
}
