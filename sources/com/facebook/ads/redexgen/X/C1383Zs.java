package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1383Zs implements InterfaceC05270y {
    public static byte[] A02;
    public static String[] A03 = {"CodBKn6Rx4Nd2NCJ9VlYeJoUvBmT0K9p", "5Rf8WjvcJZOUdeEvkpnEyeT6h0OK8cqO", "9H9umRBAwWbsUQsHVAjP1GvoefoGWKiv", "nqryT6E7", "BkgpBj4q", "vUmBCwuwnOwC6wDkIlhiKnb32h6Srhe1", "47HB5bdSxtP74yDXUEGozfNjn4WOkRGN", "xids5JFtyjlo4uGEh5DI8Wwgi7h0jVQM"};
    public final /* synthetic */ C0853Eu A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] ^ i12) ^ 34;
            String[] strArr = A03;
            if (strArr[5].charAt(5) == strArr[1].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "sVZQ6Ml9fBzEITS5ybXWTtwXQoWqWbAN";
            strArr2[1] = "MwEMOJFXQFuJpU8zWQ85tYeWswvxAO3B";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{109, 61, 108, 108, 99, 106, 110, 62, 15, 42, 47, 62, 58, 43, 60, 110, 39, 61, 110, 32, 59, 34, 34, 110, 33, 32, 110, 34, 33, 47, 42, 7, 32, 58, 43, 60, 61, 58, 39, 58, 39, 47, 34, 15, 42, 93, 122, 96, 113, 102, 103, 96, 125, 96, 125, 117, 120, 52, 125, 121, 100, 102, 113, 103, 103, 125, 123, 122, 52, 114, 125, 102, 113, 112, 106, 101, 84, 106, 104, Ascii.DEL, 98, 125, 98, Ascii.DEL, 114, 47, 32, 42, 60, 33, 39, 42, 96, 39, 32, 58, 43, 32, 58, 96, 47, 45, 58, 39, 33, 32, 96, Ascii.CAN, 7, 11, Ascii.EM, 110, Ascii.DEL, 102, 11, 10, 45, 10, 16, 1, 22, 23, 16, 13, 16, 13, 5, 8, 40, 11, 3, 3, 13, 10, 3, 45, 9, 20, 22, 1, 23, 23, 13, 11, 10};
    }

    static {
        A01();
    }

    public C1383Zs(C0853Eu c0853Eu, Runnable runnable) {
        this.A00 = c0853Eu;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05270y
    public final void ABQ(C1421aU c1421aU, String str, boolean z10) {
        this.A00.A06.A0C();
        boolean z11 = !TextUtils.isEmpty(str);
        if (z10 && z11) {
            try {
                Intent intent = new Intent(A00(85, 26, 108));
                intent.setData(KW.A00(str));
                KJ.A0B(this.A00.A0B, intent);
            } catch (KH e10) {
                Throwable cause = e10.getCause();
                KH cause2 = e10;
                if (cause != null) {
                    cause2 = e10.getCause();
                }
                this.A00.A0B.A07().A9K(A00(74, 11, 41), C06937v.A04, new C06947w(cause2));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05270y
    public final void ABR(C1421aU c1421aU) {
        this.A00.A06.A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05270y
    public final void ABS(C1421aU c1421aU) {
        this.A00.A06.A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05270y
    public final void ABT(C1421aU c1421aU) {
        if (c1421aU != this.A00.A00) {
            return;
        }
        if (c1421aU == null) {
            this.A00.A0B.A07().A9K(A00(111, 3, 45), C06937v.A0X, new C06947w(A00(8, 37, 108)));
            ABU(c1421aU, AdError.internalError(AdError.INTERNAL_ERROR_2004));
            return;
        }
        this.A00.A0E().removeCallbacks(this.A01);
        this.A00.A01 = c1421aU;
        this.A00.A0H();
        this.A00.A06.A0F(c1421aU);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05270y
    public final void ABU(C1421aU c1421aU, AdError adError) {
        if (c1421aU != this.A00.A00) {
            return;
        }
        this.A00.A0E().removeCallbacks(this.A01);
        this.A00.A0M(c1421aU);
        this.A00.A0B.A0E().A4o(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A06.A0G(new JD(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05270y
    public final void ABV(C1421aU c1421aU) {
        JR.A05(A00(114, 31, 70), A00(45, 29, 54), A00(0, 8, 121));
        this.A00.A06.A0D();
        this.A00.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05270y
    public final void ABW() {
        this.A00.A06.A08();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05270y
    public final void ABX() {
        this.A00.A06.A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05270y
    public final void ABY() {
        this.A00.A06.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05270y
    public final void onInterstitialActivityDestroyed() {
        this.A00.A06.A02();
    }
}
