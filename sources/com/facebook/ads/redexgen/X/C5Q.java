package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedAdListener;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5Q implements InterstitialAdApi, Repairable {
    public static byte[] A05;
    public static String[] A06 = {"S822El9zG6GuADGrtluuLX363osWhxiG", "ZFI3hp6NIHNPBZ8p7tKJKM6DxTur89gU", "rKe2xKovfMLHVnc2kJBHIfRtW7KI2joW", "CTsEdbmp9bu3ZhSS7yZH02ALmjP1FNtP", "mPYAOoIIU9PuPwOlU3lFT13mhy9mIxzC", "", "", "HqZNdyzgU2LJRhG9zHJvoyCPzWSUAGCn"};
    public boolean A00;
    public final InterstitialAd A01;
    public final AnonymousClass21 A02;
    public final EN A03;
    public final C1337Xw A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] - i12;
            if (A06[0].charAt(22) != '3') {
                throw new RuntimeException();
            }
            A06[4] = "dLq0XFJawohP2A9uDPm8W8ZKhW9iXRhW";
            bArrCopyOfRange[i13] = (byte) (i14 - 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-31, -28, -29, 18, -31, 17, -24, 20, -69, -26, -68, -25, -72, -21, -68, 38, 37, 35, 38, 33, 32, 40, -49, -12, -6, -21, -8, -12, -25, -14, -90, -21, -8, -8, -11, -8, -76, -112, -29, 8, 14, -1, 12, 13, 14, 3, 14, 3, -5, 6, -70, -5, -2, -70, -2, -1, 13, 14, 12, 9, 19, -1, -2, -56, -19, -13, -28, -15, -14, -13, -24, -13, -24, -32, -21, -97, -32, -29, -97, -21, -18, -32, -29, -97, -15, -28, -16, -12, -28, -14, -13, -28, -29, -18, 19, Ascii.EM, 10, 23, Ascii.CAN, Ascii.EM, 14, Ascii.EM, 14, 6, 17, -59, 6, 9, -59, Ascii.CAN, 13, 20, Ascii.FS, -59, 8, 6, 17, 17, 10, 9, -10, -9, 5, 6, 4, 1, 11, -28, -17, -52, -17, -31, -28, -63, -28, 49, 38, 45, 53};
    }

    static {
        A01();
    }

    public C5Q(Context context, String str, InterstitialAd interstitialAd) {
        this.A01 = interstitialAd;
        C1337Xw c1337XwA03 = C5O.A03(context);
        this.A04 = c1337XwA03;
        c1337XwA03.A0E().A2n(AdPlacementType.INTERSTITIAL.toString(), str);
        AnonymousClass21 anonymousClass21 = new AnonymousClass21(c1337XwA03, interstitialAd, str);
        this.A02 = anonymousClass21;
        c1337XwA03.A0H(this);
        this.A03 = new EN(anonymousClass21);
    }

    public final void A02(InterstitialAdListener interstitialAdListener) {
        this.A04.A0E().A2g(interstitialAdListener != null);
        this.A02.A0D(interstitialAdListener);
        if (A06[0].charAt(22) != '3') {
            throw new RuntimeException();
        }
        A06[4] = "rYQ6gTbtajntBm3fXVm84HcfyQ9ACN8J";
    }

    public final void A03(RewardData rewardData) {
        this.A02.A0E(rewardData);
    }

    public final void A04(RewardedAdListener rewardedAdListener) {
        this.A02.A0F(rewardedAdListener);
    }

    public final void A05(EnumSet<CacheFlag> enumSet, String str, boolean z10) {
        JR.A05(A00(127, 8, 2), A00(63, 30, 1), A00(8, 7, 7));
        if (str == null) {
            this.A04.A0E().A2k();
        } else {
            this.A04.A0E().A2j();
        }
        this.A00 = z10;
        this.A03.A09(this.A01, enumSet, str);
        this.A04.A0E().A2i();
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new C5R(this);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new C5S();
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        JR.A05(A00(120, 7, 20), A00(38, 25, 28), A00(15, 7, 113));
        if (IN.A1n(this.A04)) {
            return;
        }
        this.A03.A05();
        this.A04.A0E().A2o();
    }

    public final void finalize() {
        this.A03.A04();
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A02.A09();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean zA0A = this.A03.A0A();
        this.A04.A0E().A4n(zA0A);
        return zA0A;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A03.A0B();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        A05(CacheFlag.ALL, null, false);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void loadAd(InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig) {
        ((C5R) interstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void registerAdCompanionView(AdCompanionView adCompanionView) {
        if (this.A00 && this.A03.A07() != null) {
            this.A03.A07().A0H(adCompanionView);
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        if (this.A02.A02() != null) {
            this.A02.A02().onError(this.A01, new AdError(AdError.INTERNAL_ERROR_CODE, A00(22, 16, 8) + L6.A03(this.A04, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A02.A0H(extraHints.getHints());
        this.A02.A0I(extraHints.getMediationData());
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        JR.A05(A00(135, 4, 64), A00(93, 27, 39), A00(0, 8, 49));
        this.A04.A0E().A2t();
        boolean zA0C = this.A03.A0C(this.A01, new C5S());
        this.A04.A0E().A2s(zA0C);
        return zA0C;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean show(InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        this.A04.A0E().A2t();
        boolean zA0C = this.A03.A0C(this.A01, interstitialShowAdConfig);
        this.A04.A0E().A2s(zA0C);
        return zA0C;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void unregisterAdCompanionView() {
        if (this.A00 && this.A03.A07() != null) {
            this.A03.A07().A0G();
        }
    }
}
