package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1282Vt implements InterfaceC0799Cm {
    public static String[] A02 = {"KDcVXuz53RpoF9UEOZ96l2VZuhVX9ip0", "CKRJ1Pqx0SMvAzHTc14bPVY1Im6KLWKe", "CZRg2SIX1VWZgfyXTOdEl1", "FcRR7mDk42dnDG0ym1pZJ2", "QPo", "3iSkzhZlTwG2jcdx249ci8whKDsXKTKF", "nuc6nRuUqT3GqwIih", "HhkYvD09GQfRAuSaGWngxJEfFHmtitdD"};
    public final C0913He A00 = new C0913He(new byte[4]);
    public final /* synthetic */ C1280Vr A01;

    public C1282Vt(C1280Vr c1280Vr) {
        this.A01 = c1280Vr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Cm
    public final void A4N(C0914Hf c0914Hf) {
        int tableId = c0914Hf.A0E();
        if (tableId != 0) {
            return;
        }
        c0914Hf.A0Z(7);
        int iA04 = c0914Hf.A04() / 4;
        for (int programNumber = 0; programNumber < iA04; programNumber++) {
            c0914Hf.A0a(this.A00, 4);
            int iA05 = this.A00.A04(16);
            this.A00.A08(3);
            if (iA05 == 0) {
                this.A00.A08(13);
            } else {
                int i10 = this.A00.A04(13);
                this.A01.A06.put(i10, new C1285Vw(new C1281Vs(this.A01, i10)));
                C1280Vr.A01(this.A01);
            }
        }
        int i11 = this.A01.A05;
        int programCount = A02[4].length();
        if (programCount == 11) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "4awIAPS5zJKVkKN48BLjJX";
        strArr[2] = "yyhTqQNSKamLuuIUjTGErW";
        if (i11 != 2) {
            this.A01.A06.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Cm
    public final void A8f(C0926Hr c0926Hr, InterfaceC0774Ba interfaceC0774Ba, C0804Cs c0804Cs) {
    }
}
