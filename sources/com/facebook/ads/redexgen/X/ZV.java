package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZV implements AnonymousClass23 {
    public static byte[] A04;
    public static String[] A05 = {"l1o30ubgNMqwIxdsvAhdwl", "uEolzpc8zYF03u8DLAeDfs0A9wQx2vsd", "zKwy", "mFz9Za5MD8BXE4Lkxv", "Wms6Ep20", "", "s6yiLC", "izOiniaIEQHycLDhhOkzL"};
    public final AbstractC1373Zi A00;
    public final InterfaceC05511w A01;
    public final AnonymousClass25 A02;
    public final C1337Xw A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{57, Ascii.FS, 88, 23, Ascii.SUB, 18, Ascii.GS, Ascii.ESC, 12, 88, 17, 11, 88, 22, 13, 20, 20, 56, 47, 52, 62, 54, 63, 37, 63, 34, 46, 40, 59, 41, 37, 49, 63, 35, 9, 13, 14, 58, 43, 38, 42, 33, 44, 42, 1, 42, 59, 56, 32, 61, 36, 98, 101, Ascii.DEL, 116, 110, 121, 121, 100, 121, 116, 104, 100, 111, 110, 116, 96, 110, 114, 14, 9, 19, Ascii.CAN, 21, 17, Ascii.CAN, 17, 14, 3, 2, 8, Ascii.CAN, 3, 18, 21, 6, 19, 14, 8, 9, Ascii.CAN, 12, 2, Ascii.RS, 111, 108, 109, 100, 124, 106, 109, 117, 98, 111, 106, 103, 98, 119, 106, 108, 109, 124, 119, 106, 110, 102, 124, 104, 102, 122, 59, 19, 5, 5, 23, 17, 19, 76, 86, 96, 68, 94, 94, 68, 67, 74, 13, 79, 88, 67, 73, 65, 72, 13, 75, 66, 95, 13, 64, 72, 94, 94, 76, 74, 72, 8, 44, 54, 54, 44, 43, 34, 101, 39, 48, 43, 33, 41, 32, 101, 35, 42, 55, 101, 40, 32, 54, 54, 36, 34, 32, 107, 90, 93, 91, 86, 76, 91, 91, 70, 91, 86, 68, 76, 90, 90, 72, 78, 76, 86, 66, 76, 80, 5, 20, 13};
        String[] strArr = A05;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[1] = "11z8nLjTbJ8kXGgkHyQ0qsLYj80GB6ec";
        strArr2[2] = "E5wc";
    }

    static {
        A01();
    }

    public ZV(C1337Xw c1337Xw, AnonymousClass25 anonymousClass25, InterfaceC05511w interfaceC05511w, AbstractC1373Zi abstractC1373Zi) {
        this.A03 = c1337Xw;
        this.A02 = anonymousClass25;
        this.A01 = interfaceC05511w;
        this.A00 = abstractC1373Zi;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final void A8L(Message message) {
        com.facebook.ads.Ad adA00 = this.A02.A00();
        String strA00 = A00(203, 3, 16);
        if (adA00 == null) {
            this.A03.A07().A9K(strA00, C06937v.A0K, new C06947w(A00(0, 17, 12)));
            return;
        }
        int i10 = message.what;
        String strA01 = A00(120, 9, 2);
        String strA02 = A00(17, 17, 14);
        switch (i10) {
            case 10:
            case 2103:
                Bundle bundle = message.getData().getBundle(strA02);
                if (bundle != null) {
                    int i11 = bundle.getInt(A00(51, 18, 95));
                    String errorMessage = bundle.getString(A00(182, 21, 125));
                    AdError adError = new AdError(i11, errorMessage);
                    this.A01.AF5(adError);
                    if (this.A02.A04 != null) {
                        this.A02.A04.onError(adA00, adError);
                    } else {
                        Log.e(A00(34, 17, 59), errorMessage);
                    }
                } else {
                    this.A01.AF1(EnumC05501v.A05);
                    this.A03.A07().A9K(strA00, C06937v.A0V, new C06947w(A00(155, 27, 49), strA01 + message));
                }
                this.A02.A01(null);
                return;
            case AdError.BROKEN_MEDIA_ERROR_CODE /* 2100 */:
                this.A01.AF9();
                Bundle bundle2 = message.getData().getBundle(strA02);
                if (bundle2 != null) {
                    this.A02.A01 = bundle2.getLong(A00(94, 26, 87));
                    AnonymousClass25 anonymousClass25 = this.A02;
                    int i12 = bundle2.getInt(A00(69, 25, 51));
                    String[] strArr = A05;
                    if (strArr[6].length() == strArr[7].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A05;
                    strArr2[6] = "eimvHB";
                    strArr2[7] = "9nAYjps8XJWkdVKe7ORqJ";
                    anonymousClass25.A00 = i12;
                } else {
                    this.A03.A07().A9K(strA00, C06937v.A0V, new C06947w(A00(129, 26, 89), strA01 + message));
                }
                this.A02.A01(null);
                break;
            case 2106:
                this.A02.A01(null);
                break;
            case 2110:
                this.A01.AFJ();
                break;
        }
        if (this.A02.A04 == null) {
            return;
        }
        switch (message.what) {
            case AdError.BROKEN_MEDIA_ERROR_CODE /* 2100 */:
                this.A02.A04.onAdLoaded(adA00);
                return;
            case 2104:
                this.A02.A04.onAdClicked(adA00);
                return;
            case 2105:
                this.A02.A04.onLoggingImpression(adA00);
                return;
            case 2106:
                if (this.A02.A04 instanceof RewardedVideoAdExtendedListener) {
                    ((RewardedVideoAdExtendedListener) this.A02.A04).onRewardedVideoActivityDestroyed();
                    return;
                }
                return;
            case 2110:
                this.A02.A04.onRewardedVideoClosed();
                return;
            case AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS /* 3000 */:
                this.A02.A04.onRewardedVideoCompleted();
                return;
            case 3001:
                if (this.A02.A04 instanceof S2SRewardedVideoAdListener) {
                    ((S2SRewardedVideoAdListener) this.A02.A04).onRewardServerSuccess();
                    return;
                }
                return;
            case AuthApiStatusCodes.AUTH_API_CLIENT_ERROR /* 3002 */:
                if (this.A02.A04 instanceof S2SRewardedVideoAdListener) {
                    ((S2SRewardedVideoAdListener) this.A02.A04).onRewardServerFailed();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
