package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TY extends AbstractC06104f {
    public static String[] A01 = {"8Yn2PgyedH1iX", "R67HljoZMbsPm0e6EtybvG", "", "R8Pp2uuVTku92bGxcvFWCvwfHASfPd1y", "2y5E80sPhAjkTDK", "Itturke", "abRBLy2wdT4xlnoMDCf2vtSzdY3x1mV2", "QG421Xj1ReSIzqeVHucrcoJTP843GzsJ"};
    public final /* synthetic */ C2M A00;

    public TY(C2M c2m) {
        this.A00 = c2m;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06104f
    public final void A0L(EB eb2, int i10) {
        int scrollPosition;
        super.A0L(eb2, i10);
        C1364Yy linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager == null || (scrollPosition = linearLayoutManager.A27()) < 0 || this.A00.getAdapter() == null || scrollPosition >= this.A00.getAdapter().A0D()) {
            return;
        }
        InterfaceC1022Lp interfaceC1022Lp = (InterfaceC1022Lp) eb2.A1F(scrollPosition);
        if (A01[1].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "EBOsosi";
        strArr[2] = "";
        if (interfaceC1022Lp == null) {
            return;
        }
        interfaceC1022Lp.AEw();
    }
}
