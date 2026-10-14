package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import ch.qos.logback.core.net.SyslogConstants;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.RewardedAdListener;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZW implements AnonymousClass23 {
    public static byte[] A04;
    public static String[] A05 = {"PyT2XUnl", "3EmvKqRjFYzRkizxlD8eotggUBC8U5J9", "Ib6uyfMRsh5ysHZ3i8ryXk3sO16qq9Ys", "q2kkzr74cnXMazMYxmC9c", "9U931lGThJH7Qz6wctlm6EKEWHFtvDAV", "f15MquYM06llw3BWZWASFwAp5egI2HKX", "yMUgiPhi", "t3xZZPMR"};
    public final AbstractC1373Zi A00;
    public final InterfaceC05511w A01;
    public final AnonymousClass21 A02;
    public final C1337Xw A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-77, -42, -110, -31, -44, -36, -41, -43, -26, -110, -37, -27, -110, -32, -25, -34, -34, -115, -96, -103, -113, -105, -112, -86, -112, -93, -97, -99, -116, -98, -86, -106, -112, -92, -74, -78, -79, -27, -44, -39, -43, -34, -45, -43, -66, -43, -28, -25, -33, -30, -37, -87, -82, -76, -65, -91, -78, -78, -81, -78, -65, -93, -81, -92, -91, -65, -85, -91, -71, 4, 7, 6, -1, 23, 1, 6, 14, -7, 4, 1, -4, -7, 12, 1, 7, 6, 23, 12, 1, 5, -3, 23, 3, -3, 17, -61, -37, -23, -23, -41, -35, -37, -80, -106, -66, -38, -28, -28, -38, -33, -40, -111, -45, -26, -33, -43, -35, -42, -111, -41, -32, -29, -111, -34, -42, -28, -28, -46, -40, -42, -97, -95, -94, -96, -83, -109, -96, -96, -99, -96, -83, -101, -109, -95, -95, -113, -107, -109, -83, -103, -109, -89, 4, 19, 12};
    }

    static {
        A01();
    }

    public ZW(C1337Xw c1337Xw, AnonymousClass21 anonymousClass21, InterfaceC05511w interfaceC05511w, AbstractC1373Zi abstractC1373Zi) {
        this.A03 = c1337Xw;
        this.A02 = anonymousClass21;
        this.A01 = interfaceC05511w;
        this.A00 = abstractC1373Zi;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:31:0x0100 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0101  */
    /* JADX WARN: Code duplicated, block: B:33:0x010b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0115  */
    /* JADX WARN: Code duplicated, block: B:37:0x012a  */
    /* JADX WARN: Code duplicated, block: B:39:0x013a  */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final void A8L(Message message) {
        int i10;
        String[] strArr;
        RewardedAdListener rewardedAdListenerA04;
        InterstitialAd interstitialAdA01 = this.A02.A01();
        String strA00 = A00(SyslogConstants.LOG_LOCAL3, 3, 106);
        if (interstitialAdA01 == null) {
            this.A03.A07().A9K(strA00, C06937v.A0K, new C06947w(A00(0, 17, 57)));
            return;
        }
        int i11 = message.what;
        String strA01 = A00(95, 9, 61);
        String strA02 = A00(104, 27, 56);
        String strA03 = A00(17, 17, 18);
        switch (i11) {
            case 10:
            case 1023:
                Bundle bundle = message.getData().getBundle(strA03);
                if (bundle != null) {
                    int i12 = bundle.getInt(A00(51, 18, 39));
                    String string = bundle.getString(A00(131, 21, 21));
                    AdError adError = new AdError(i12, string);
                    this.A01.AF5(adError);
                    if (this.A02.A02() != null) {
                        this.A02.A02().onError(interstitialAdA01, adError);
                    } else {
                        Log.e(A00(34, 17, 55), string);
                    }
                } else {
                    this.A01.AF1(EnumC05501v.A05);
                    this.A03.A07().A9K(strA00, C06937v.A0V, new C06947w(strA02, strA01 + message));
                }
                this.A02.A0C(null);
                return;
            case 1020:
                this.A01.AF9();
                Bundle bundle2 = message.getData().getBundle(strA03);
                if (bundle2 != null) {
                    this.A02.A0B(bundle2.getLong(A00(69, 26, 127)));
                } else {
                    this.A03.A07().A9K(strA00, C06937v.A0V, new C06947w(strA02, strA01 + message));
                }
                this.A02.A0C(null);
                break;
            case 1022:
                this.A01.AFJ();
                break;
        }
        if (this.A02.A02() == null) {
            return;
        }
        switch (message.what) {
            case 1020:
                this.A02.A02().onAdLoaded(interstitialAdA01);
                return;
            case 1021:
                this.A02.A02().onInterstitialDisplayed(interstitialAdA01);
                if (A05[2].charAt(18) != 'n') {
                    String[] strArr2 = A05;
                    strArr2[1] = "IMuRostxJ5htnzhiOcsxYcu1iidsGUgj";
                    strArr2[5] = "ubJ4M5GxN6FfPval4rtOnbhl8vPUgGKC";
                    return;
                }
                throw new RuntimeException();
            case 1022:
                this.A02.A02().onInterstitialDismissed(interstitialAdA01);
                return;
            case 1023:
            default:
                if (this.A02.A04() == null) {
                    return;
                }
                i10 = message.what;
                strArr = A05;
                if (strArr[3].length() != strArr[7].length()) {
                    A05[4] = "YO9dGq40ZDljeOjTjHA4uB3VVKU9R56I";
                    switch (i10) {
                        case AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS /* 3000 */:
                            this.A02.A04().onRewardedAdCompleted();
                            return;
                        case 3001:
                            rewardedAdListenerA04 = this.A02.A04();
                            if (A05[2].charAt(18) == 'n') {
                                rewardedAdListenerA04.onRewardedAdServerSucceeded();
                                return;
                            }
                            String[] strArr3 = A05;
                            strArr3[1] = "4ubpoteMIucGsWyTMsTtOH4ZOdBl9bHr";
                            strArr3[5] = "Xxx4qDjyhZoijrhiIp4u1mFMOEMCLZoL";
                            rewardedAdListenerA04.onRewardedAdServerSucceeded();
                            return;
                        case AuthApiStatusCodes.AUTH_API_CLIENT_ERROR /* 3002 */:
                            this.A02.A04().onRewardedAdServerFailed();
                            return;
                        default:
                            return;
                    }
                }
                throw new RuntimeException();
            case 1024:
                this.A02.A02().onAdClicked(interstitialAdA01);
                return;
            case 1025:
                this.A02.A02().onLoggingImpression(interstitialAdA01);
                return;
            case 1026:
                if (!(this.A02.A02() instanceof InterstitialAdExtendedListener)) {
                    if (this.A02.A04() == null) {
                        return;
                    }
                    i10 = message.what;
                    strArr = A05;
                    if (strArr[3].length() != strArr[7].length()) {
                        A05[4] = "YO9dGq40ZDljeOjTjHA4uB3VVKU9R56I";
                        switch (i10) {
                            case AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS /* 3000 */:
                                this.A02.A04().onRewardedAdCompleted();
                                return;
                            case 3001:
                                rewardedAdListenerA04 = this.A02.A04();
                                if (A05[2].charAt(18) == 'n') {
                                    rewardedAdListenerA04.onRewardedAdServerSucceeded();
                                    return;
                                }
                                String[] strArr4 = A05;
                                strArr4[1] = "4ubpoteMIucGsWyTMsTtOH4ZOdBl9bHr";
                                strArr4[5] = "Xxx4qDjyhZoijrhiIp4u1mFMOEMCLZoL";
                                rewardedAdListenerA04.onRewardedAdServerSucceeded();
                                return;
                            case AuthApiStatusCodes.AUTH_API_CLIENT_ERROR /* 3002 */:
                                this.A02.A04().onRewardedAdServerFailed();
                                return;
                            default:
                                return;
                        }
                    }
                } else {
                    AnonymousClass21 anonymousClass21 = this.A02;
                    if (A05[2].charAt(18) != 'n') {
                        A05[2] = "QiAUsDkapNh1fTZA9J8Gsz0JLC17Ghy8";
                        ((InterstitialAdExtendedListener) anonymousClass21.A02()).onInterstitialActivityDestroyed();
                        if (this.A02.A04() == null) {
                            return;
                        }
                        i10 = message.what;
                        strArr = A05;
                        if (strArr[3].length() != strArr[7].length()) {
                            A05[4] = "YO9dGq40ZDljeOjTjHA4uB3VVKU9R56I";
                            switch (i10) {
                                case AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS /* 3000 */:
                                    this.A02.A04().onRewardedAdCompleted();
                                    return;
                                case 3001:
                                    rewardedAdListenerA04 = this.A02.A04();
                                    if (A05[2].charAt(18) == 'n') {
                                        rewardedAdListenerA04.onRewardedAdServerSucceeded();
                                        return;
                                    }
                                    String[] strArr5 = A05;
                                    strArr5[1] = "4ubpoteMIucGsWyTMsTtOH4ZOdBl9bHr";
                                    strArr5[5] = "Xxx4qDjyhZoijrhiIp4u1mFMOEMCLZoL";
                                    rewardedAdListenerA04.onRewardedAdServerSucceeded();
                                    return;
                                case AuthApiStatusCodes.AUTH_API_CLIENT_ERROR /* 3002 */:
                                    this.A02.A04().onRewardedAdServerFailed();
                                    return;
                                default:
                                    return;
                            }
                        }
                    }
                }
                throw new RuntimeException();
        }
    }
}
