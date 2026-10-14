package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1171Ri implements OD {
    public static String[] A02 = {"z07VqEjGvJ", "HVUavbLQzawZdZVBJZvs2mdfMmVurwko", "OXCJr9QWCT6iNhGP7b2SKXpA8jzUGtxO", "XfWPaMhvYm", "d0mI5Otk4DkPTVLBqA06pYB2qhxVYO4x", "4lS6eLthtLYEvbxsvILcFz16jeQVP", "9TNy9PrFUeRgfy9Rk5pKZK4U", "r8zM3TRfMT7OJmVxj71ND5jlCBdKG"};
    public final /* synthetic */ P2 A00;
    public final /* synthetic */ C1170Rh A01;

    public C1171Ri(C1170Rh c1170Rh, P2 p10) {
        this.A01 = c1170Rh;
        this.A00 = p10;
    }

    @Override // com.facebook.ads.redexgen.X.OD
    public final void AAN() {
        if (this.A00.A02() == 0) {
            QR qr = this.A01.A01;
            String[] strArr = A02;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "rJocaZsUv9";
            strArr2[6] = "3nzpDtzjz9tePwbisyAfJiul";
            qr.A0U();
        }
        if (this.A01.A02 != null) {
            this.A01.A02.A0U();
        }
    }
}
