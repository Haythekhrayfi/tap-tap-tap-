package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0832Dz extends AbstractC1064Nf {
    public static String[] A01 = {"LKWkJLHWeQBpKWa7UOr", "n3GVMd2hYWvpJPgcK7G8gwhDICX0QRvF", "xWguot5bGbOrngmksJGOGVnUcrOeX8Yq", "Ofa75S47Yg9dCpk5kJ8", "1S7QAm0fWcEMmp0r33MjAmGaqGODAsQ1", "zqFnCLlNx7sTkxdlo9MHaJoU5FTNnDPM", "mLEAh1LmjQI6neJU4JsNwDaurLCI0CwU", "tuKdoZnhl5Xw"};
    public final /* synthetic */ C5T A00;

    public C0832Dz(C5T c5t) {
        this.A00 = c5t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8Y
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(OA oa2) {
        if (this.A00.A08 != null) {
            U7.A0L(this.A00.A08.getInternalNativeAd()).A1c(false, true);
        }
        this.A00.A00.onError();
        String[] strArr = A01;
        if (strArr[6].charAt(12) != strArr[2].charAt(12)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "vYhRUt1P8SC0fadBpCg";
        strArr2[3] = "IJBm98yQ9J9eGhRKk2w";
    }
}
