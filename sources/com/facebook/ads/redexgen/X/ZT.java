package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZT extends AnonymousClass26 implements InterstitialAdExtendedListener {
    public static byte[] A01;
    public final C1368Zc A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-68, -63, -57, -46, -72, -59, -59, -62, -59, -46, -74, -62, -73, -72, -46, -66, -72, -52, -103, -100, -101, -108, -84, -106, -101, -93, -114, -103, -106, -111, -114, -95, -106, -100, -101, -84, -95, -106, -102, -110, -84, -104, -110, -90, 15, 16, 14, Ascii.ESC, 1, 14, 14, 11, 14, Ascii.ESC, 9, 1, 15, 15, -3, 3, 1, Ascii.ESC, 7, 1, 21};
    }

    public ZT(String str, AnonymousClass28 anonymousClass28, C1368Zc c1368Zc) {
        super(str, anonymousClass28);
        this.A00 = c1368Zc;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(com.facebook.ads.Ad ad2) {
        super.A00.ABw(1024, this.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(com.facebook.ads.Ad ad2) {
        Bundle bundle = new Bundle();
        bundle.putLong(A00(18, 26, 0), this.A00.A0E());
        super.A00.ABw(1020, this.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(com.facebook.ads.Ad ad2, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString(A00(44, 21, 111), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, 38), adError.getErrorCode());
        super.A00.ABw(1023, this.A01, bundle);
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        super.A00.ABw(1026, this.A01, null);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(com.facebook.ads.Ad ad2) {
        super.A00.ABw(1022, this.A01, null);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(com.facebook.ads.Ad ad2) {
        super.A00.ABw(1021, this.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(com.facebook.ads.Ad ad2) {
        super.A00.ABw(1025, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdCompleted() {
        super.A00.ABw(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerFailed() {
        super.A00.ABw(AuthApiStatusCodes.AUTH_API_CLIENT_ERROR, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerSucceeded() {
        super.A00.ABw(3001, this.A01, null);
    }
}
