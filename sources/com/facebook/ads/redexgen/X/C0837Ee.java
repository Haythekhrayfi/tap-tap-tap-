package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0837Ee extends AbstractC1221Tg<C1379Zo> {
    public static String[] A00 = {"ByMq6MLqhjUJsdWB3RBIp", "zuOr3", "msyHKBX3wHVeYE5obxbctQprcgEzI02t", "I3sOgeRwcNYGF4oixOV5Q17", "dcB", "ibtCqc8qysdz0E5AMIDmPhuL1XZA", "mNtKCg4kzaH6sXUtb2oDuqx2", "ObFvkEusatMYzjWaq72f4FkWXHrQjerH"};

    public C0837Ee(C1379Zo c1379Zo) {
        super(c1379Zo);
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        C1379Zo c1379ZoA07 = A07();
        if (c1379ZoA07 == null) {
            return;
        }
        C1337Xw c1337Xw = c1379ZoA07.A08;
        String[] strArr = A00;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A00[5] = "SiVLKh";
        if (C1012Lf.A02(c1337Xw)) {
            c1379ZoA07.A07();
        } else {
            c1379ZoA07.A05.postDelayed(c1379ZoA07.A0C, 5000L);
        }
    }
}
