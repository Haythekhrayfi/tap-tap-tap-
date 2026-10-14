package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RQ extends K4 {
    public static String[] A04 = {"pUIboC8CwdUMtM1tPR8iEtPz8p", "ladzvmq", "gZiIZXhhpFNWaRiPv", "vQtAVDGFp8M", "7j30UYRlUEXcM4Kd2wK", "XchzO9Mtzl1GyvdPdWlZd1J0iwZmFx3H", "VTwPVxpRcW0", "YPnzN72MuP4y3lnuBhqZ0NoSyY"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ RN A02;
    public final /* synthetic */ QO A03;

    public RQ(RN rn, QO qo, int i10, int i11) {
        this.A02 = rn;
        this.A03 = qo;
        this.A00 = i10;
        this.A01 = i11;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        if (this.A03 == QO.A07) {
            this.A02.A0L(EnumC0944Ik.A0u);
            this.A02.A0A.A0E().A33();
            this.A02.A0B.A02(RN.A0C());
            return;
        }
        if (this.A03 == QO.A03) {
            this.A02.A0L(EnumC0944Ik.A0p);
            this.A02.A03 = true;
            this.A02.A0B.A02(RN.A0G);
            this.A02.A0K(this.A00);
            return;
        }
        QO qo = this.A03;
        QO qo2 = QO.A06;
        String[] strArr = A04;
        if (strArr[0].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A04[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
        if (qo == qo2) {
            this.A02.A0L(EnumC0944Ik.A0o);
            this.A02.A0A.A0E().A2v();
            this.A02.A03 = true;
            this.A02.A07.removeCallbacksAndMessages(null);
            C8X c8x = this.A02.A0B;
            int i10 = this.A01;
            c8x.A02(new AnonymousClass73(i10, i10));
            this.A02.A0K(this.A01);
            return;
        }
        if (this.A03 == QO.A0A) {
            if (IN.A1W(this.A02.A0A)) {
                this.A02.A0A.A0A().ADL();
            }
            this.A02.A0L(EnumC0944Ik.A0s);
            this.A02.A0A.A0E().A3A();
            this.A02.A0B.A02(RN.A0H);
            this.A02.A07.removeCallbacksAndMessages(null);
            this.A02.A0H();
            return;
        }
        if (this.A03 == QO.A05) {
            this.A02.A0L(EnumC0944Ik.A0r);
            this.A02.A0A.A0E().A2z();
            C8X c8x2 = this.A02.A0B;
            final int i11 = this.A00;
            c8x2.A02(new AbstractC1108Ox(i11) { // from class: com.facebook.ads.redexgen.X.70
            });
            this.A02.A07.removeCallbacksAndMessages(null);
            this.A02.A0K(this.A00);
            return;
        }
        if (this.A03 == QO.A04) {
            this.A02.A0L(EnumC0944Ik.A0q);
            this.A02.A0A.A0E().A2w();
            this.A02.A0B.A02(RN.A0K);
            this.A02.A07.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == QO.A09) {
            this.A02.A0L(EnumC0944Ik.A0o);
            this.A02.A0A.A0E().A35();
            this.A02.A03 = true;
            this.A02.A07.removeCallbacksAndMessages(null);
            this.A02.A0B.A02(new AnonymousClass73(this.A00, this.A01));
            this.A02.A0K(this.A00);
        }
    }
}
