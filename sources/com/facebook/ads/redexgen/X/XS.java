package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class XS implements C8N {
    public final /* synthetic */ String[] A00;

    public XS(String[] strArr) {
        this.A00 = strArr;
    }

    @Override // com.facebook.ads.redexgen.X.C8N
    public final boolean A2U(String str) {
        for (String str2 : this.A00) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
