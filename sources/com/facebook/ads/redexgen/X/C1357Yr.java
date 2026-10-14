package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1357Yr implements C4U {
    public static String[] A01 = {"IP6gXu3Aic9rrZpr", "DSm6OHbiM4aoMyjFh2wy7Spd3inn5axc", "lJd94ygIcpnkIi9oYNWqXg3HQV8t0X4Q", "337I3pVrWHOBtYrFGcdtPHZp8Kpz9VIJ", "vd5lczoeg9gY82TvyWngHoQKFpNC9gt0", "CefcuhKyPhUbDvzsvxPUhaoMgi2Xy5FO", "Qia1n7qQgpdEP2KZeQvga8Xzcvoo51Ij", "UfDKqgBAky8ekVpIbdpaQQPTuf6RISL4"};
    public final /* synthetic */ EB A00;

    public C1357Yr(EB eb2) {
        this.A00 = eb2;
    }

    @Override // com.facebook.ads.redexgen.X.C4U
    public final void AAJ(AbstractC06224s abstractC06224s) {
        abstractC06224s.A0Z(true);
        if (abstractC06224s.A06 != null && abstractC06224s.A07 == null) {
            abstractC06224s.A06 = null;
        }
        abstractC06224s.A07 = null;
        if (!abstractC06224s.A0A() && !this.A00.A20(abstractC06224s.A0H) && abstractC06224s.A0e()) {
            EB eb2 = this.A00;
            if (A01[6].charAt(16) != 'e') {
                throw new RuntimeException();
            }
            A01[0] = "BbBTSQcWyeSpGVnm";
            eb2.removeDetachedView(abstractC06224s.A0H, false);
        }
    }
}
