package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1396a5 implements InterfaceC06435n {
    public static String[] A05 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ AbstractC1404aD A00;
    public final /* synthetic */ InterfaceC05321d A01;
    public final /* synthetic */ C05331e A02;
    public final /* synthetic */ C1337Xw A03;
    public final /* synthetic */ boolean A04;

    public C1396a5(C05331e c05331e, C1337Xw c1337Xw, boolean z10, AbstractC1404aD abstractC1404aD, InterfaceC05321d interfaceC05321d) {
        this.A02 = c05331e;
        this.A03 = c1337Xw;
        this.A04 = z10;
        this.A00 = abstractC1404aD;
        this.A01 = interfaceC05321d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06435n
    public final void AAL() {
        if (IN.A1O(this.A03) && this.A04) {
            this.A02.A02.add(OY.A01(this.A03, this.A00, 1, new C1397a6(this)));
            return;
        }
        InterfaceC05321d interfaceC05321d = this.A01;
        if (A05[2].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[5] = "X6BBoGIR5wPjpoFUlFYz";
        strArr[3] = "SlUPa0nBeexeGnx3tyWk";
        interfaceC05321d.AAF();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06435n
    public final void AAM() {
        this.A01.AAE(AdError.CACHE_ERROR);
    }
}
