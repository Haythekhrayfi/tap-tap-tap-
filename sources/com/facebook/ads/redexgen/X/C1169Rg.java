package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1169Rg extends C4O<RZ> {
    public static String[] A0H = {"U2dBX20JaeRgS8KUkn4U", "4wbYdEjd6EY1wYpAHERmBQ5UbLFk3rIE", "poCzv8x7tLJqIV5ZIWq", "9iyDRDGf0xWQ70I4mtfqA0IQycZfZ47C", "v2glKkwlOEfR0MfsI3TqmdNecXONmhZ3", "6XdF3RdtkhprEZiVEVCq65KOMzsBziM7", "2OiOSmaAlP7OTnmHwLOjTjXlL7jeDPuL", "nkMLdycTxYcJ5galJfvG8bjM9rVBse8i"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC1018Ll A04;
    public InterfaceC1019Lm A05;
    public String A06;
    public List<P2> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC1404aD A0A;
    public final C6O A0B;
    public final C1337Xw A0C;
    public final InterfaceC0937Id A0D;
    public final LG A0E;
    public final C1179Rq A0F;
    public final QR A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C1169Rg(C1337Xw c1337Xw, List<P2> list, AbstractC1404aD abstractC1404aD, InterfaceC0937Id interfaceC0937Id, C6O c6o, QR qr, LG lg, InterfaceC1019Lm interfaceC1019Lm, String str, int i10, int i11, int i12, int i13, C1179Rq c1179Rq, AbstractC1018Ll abstractC1018Ll) {
        this.A0C = c1337Xw;
        this.A0D = interfaceC0937Id;
        this.A0B = c6o;
        this.A0G = qr;
        this.A0E = lg;
        this.A05 = interfaceC1019Lm;
        this.A0A = abstractC1404aD;
        this.A07 = list;
        this.A00 = i10;
        this.A03 = i13;
        this.A06 = str;
        this.A01 = i12;
        this.A02 = i11;
        this.A0F = c1179Rq;
        this.A04 = abstractC1018Ll;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4O
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final RZ A0C(ViewGroup viewGroup, int i10) {
        return new RZ(OJ.A00(new C1075Nq(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0H(this.A04).A0J(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4O
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(RZ rz, int i10) {
        rz.A0l(this.A07.get(i10), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i10 == 0) {
            rz.AEw();
            String[] strArr = A0H;
            if (strArr[3].charAt(29) == strArr[6].charAt(29)) {
                throw new RuntimeException();
            }
            A0H[1] = "f5MkbcX2dFxcVTBDK6f4VKhLC7wzzoeI";
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4O
    public final int A0D() {
        return this.A07.size();
    }
}
