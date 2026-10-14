package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1410aJ extends AbstractC05190q {
    public static String[] A05 = {"RwkPFHsv9wotgH8PCqYhpIij5lIi", "drIC7gYxypHASOm9CvVJaHIQeep0", "f0dvIXyq27iv5zRXvkJTu2cqkG", "fzusVvXWPget8SSdASQ7tAMFHi8p37he", "Ar6p", "jDkSEm6Ik6fEWWn08WKTicIvFe3Dtksc", "J7vaKr0jTjoObEFZmlhET1S0K8S4ujA7", "2rimL2d5m8eNJCurq2ysJBza56R6EvG7"};
    public static final String A06 = C1410aJ.class.getSimpleName();
    public C1412aL A00;
    public boolean A01;
    public final C1337Xw A02;
    public final InterfaceC0937Id A03;
    public final N3 A04;

    public C1410aJ(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, N3 n10, QR qr, AbstractC05200r abstractC05200r) {
        super(c1337Xw, abstractC05200r, qr);
        this.A03 = interfaceC0937Id;
        this.A04 = n10;
        this.A02 = c1337Xw;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05190q
    public final void A06(Map<String, String> map) {
        C1412aL c1412aL = this.A00;
        if (c1412aL != null && !TextUtils.isEmpty(c1412aL.A6M())) {
            this.A02.A0E().A2f();
            C2A.A00(this.A00.A05());
            InterfaceC0937Id interfaceC0937Id = this.A03;
            String strA6M = this.A00.A6M();
            String[] strArr = A05;
            if (strArr[7].charAt(31) != strArr[6].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "Tkg0tGhzpCvpbpNuTPjRHtf4b45H";
            strArr2[1] = "dBPpzaB1YNfwJk5banXGE19c57tB";
            interfaceC0937Id.A9P(strA6M, map);
        }
    }

    public final synchronized void A07() {
        C1412aL c1412aL;
        if (!this.A01 && (c1412aL = this.A00) != null) {
            this.A01 = true;
            if (!TextUtils.isEmpty(c1412aL.A03())) {
                LI.A00(new C1411aK(this));
            }
        }
    }

    public final void A08(C1412aL c1412aL) {
        this.A00 = c1412aL;
    }
}
