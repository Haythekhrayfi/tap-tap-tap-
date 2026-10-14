package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1394a3 implements C6G {
    public static String[] A05 = {"udExhBBZigXHD765", "VCbgsgLtwNII3DWSf3Df", "sJ3cSki5Ts1gkpIy0", "hudoenMQ7OfQJqKUwYviTAHkC5956B", "3GiDDKpH2PPu7", "VAV0OzmNbR17K1ZAu", "eIBPlY8UdwZIA15YBWaPzTw3Re1i6Niv", "w6ShnqqW6c5InpRu2fdQvGfdyx0XiT7r"};
    public final /* synthetic */ AbstractC1404aD A00;
    public final /* synthetic */ InterfaceC05321d A01;
    public final /* synthetic */ C05331e A02;
    public final /* synthetic */ C1337Xw A03;
    public final /* synthetic */ boolean A04;

    public C1394a3(C05331e c05331e, C1337Xw c1337Xw, boolean z10, AbstractC1404aD abstractC1404aD, InterfaceC05321d interfaceC05321d) {
        this.A02 = c05331e;
        this.A03 = c1337Xw;
        this.A04 = z10;
        this.A00 = abstractC1404aD;
        this.A01 = interfaceC05321d;
    }

    private void A00(boolean z10) {
        if (z10) {
            C1337Xw c1337Xw = this.A03;
            String[] strArr = A05;
            if (strArr[7].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ua1Hqbcww3qJrVJ6O";
            strArr2[2] = "2U70GzBDbPON7gkn8";
            if (IN.A1O(c1337Xw) && this.A04) {
                this.A02.A02.add(OY.A01(this.A03, this.A00, 1, new C1395a4(this)));
                return;
            } else {
                this.A01.AAF();
                return;
            }
        }
        this.A01.AAE(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.C6G
    public final void AAc() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.C6G
    public final void AAl() {
        A00(true);
    }
}
