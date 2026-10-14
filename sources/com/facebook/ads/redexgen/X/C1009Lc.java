package com.facebook.ads.redexgen.X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1009Lc {
    public static C1009Lc A02;
    public final C1218Td A00;
    public final C1011Le A01;

    public C1009Lc(C1337Xw c1337Xw, Executor executor, C8D c8d) {
        this.A01 = new C1011Le(c1337Xw);
        this.A00 = new C1218Td(executor, c8d, c1337Xw);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1337Xw c1337Xw, Executor executor, C8D c8d) {
        if (!IN.A1C(c1337Xw)) {
            return;
        }
        C1009Lc c1009Lc = A02;
        if (c1009Lc == null) {
            C1009Lc c1009Lc2 = new C1009Lc(c1337Xw, executor, c8d);
            A02 = c1009Lc2;
            c1009Lc2.A00();
            return;
        }
        c1009Lc.A02(c8d);
    }

    private void A02(C8D c8d) {
        this.A00.A07(c8d);
    }
}
