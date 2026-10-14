package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1178Rp extends C4O<C1170Rh> {
    public int A00;
    public int A01;
    public int A02;
    public AbstractC1018Ll A03;
    public InterfaceC1019Lm A04;
    public String A05;
    public List<P2> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC1404aD A08;
    public final C6O A09;
    public final C1337Xw A0A;
    public final InterfaceC0937Id A0B;
    public final LG A0C;
    public final C1179Rq A0D;
    public final JY A0E;
    public final QR A0F;

    public C1178Rp(C1337Xw c1337Xw, List<P2> list, AbstractC1404aD abstractC1404aD, InterfaceC0937Id interfaceC0937Id, C6O c6o, QR qr, LG lg, InterfaceC1019Lm interfaceC1019Lm, String str, C1179Rq c1179Rq, JY jy, AbstractC1018Ll abstractC1018Ll) {
        this.A0A = c1337Xw;
        this.A0B = interfaceC0937Id;
        this.A09 = c6o;
        this.A0F = qr;
        this.A0C = lg;
        this.A04 = interfaceC1019Lm;
        this.A08 = abstractC1404aD;
        this.A06 = list;
        this.A05 = str;
        this.A0D = c1179Rq;
        this.A0E = jy;
        this.A03 = abstractC1018Ll;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4O
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1170Rh A0C(ViewGroup viewGroup, int i10) {
        InterfaceC1019Lm interfaceC1019Lm = this.A04;
        if (interfaceC1019Lm == null || this.A00 == 0) {
            return null;
        }
        return new C1170Rh(NP.A01(new C1075Nq(this.A0A, this.A0B, interfaceC1019Lm, this.A08, null, this.A0F, this.A0C).A0I(this.A0E).A0H(this.A03).A0J(), this.A05, this.A0D), this.A07, this.A0F, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4O
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(C1170Rh c1170Rh, int i10) {
        c1170Rh.A0l(this.A06.get(i10), this.A0B, this.A09, this.A0C, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4O
    public final int A0D() {
        return this.A06.size();
    }

    public final void A0F(int i10, int i11, int i12) {
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
    }
}
