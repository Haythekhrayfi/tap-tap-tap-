package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1455b9 {
    public final C1466bK A00;
    public final C1464bI A01;

    public C1455b9(AbstractC1471bP abstractC1471bP, C1464bI c1464bI, C1466bK c1466bK) {
        this.A00 = c1466bK;
        this.A01 = c1464bI;
        abstractC1471bP.A02(new FY(c1464bI));
    }

    public static C1455b9 A00(AbstractC1471bP abstractC1471bP, InterfaceC1475bT interfaceC1475bT, InterfaceC0879Fu interfaceC0879Fu) {
        C1466bK c1466bK = new C1466bK();
        C1464bI viewpointScanner = new C1464bI(interfaceC1475bT, new G0(), interfaceC0879Fu, c1466bK, new Handler(Looper.getMainLooper()));
        return new C1455b9(abstractC1471bP, viewpointScanner, c1466bK);
    }

    public final void A01(View view) {
        this.A00.A01(view);
    }

    public final void A02(View view, C1473bR c1473bR) {
        this.A00.A02(view, c1473bR);
    }

    public final void A03(InterfaceC1470bO interfaceC1470bO) {
        this.A01.A09(interfaceC1470bO);
    }

    public final void A04(InterfaceC1468bM interfaceC1468bM) {
        this.A01.A0A(interfaceC1468bM);
    }
}
