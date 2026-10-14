package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UM implements NC {
    public static String[] A01 = {"PnhhxO44eyGR", "6RYeLXmAClA1SiGKn201px", "WqNcg2MFF", "kFMGwY5yNNV", "mQRpAL1oxGJgw", "Eqf6jMIzeI3tCjJb", "9imsVe3tjkVzhTosgYrmf1lKW7QE2MSM", "NRYl8cTHkwcGHXULnCD2cakkWnkUWd4e"};
    public final /* synthetic */ UJ A00;

    public UM(UJ uj) {
        this.A00 = uj;
    }

    @Override // com.facebook.ads.redexgen.X.NC
    public final void ABM(boolean z10) {
        this.A00.A0D.set(z10);
        if (this.A00.A0E.get() && this.A00.A02 != null) {
            UJ uj = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A01[2] = "moHDWw2Q1";
            uj.A02.AC9(z10);
        }
    }
}
