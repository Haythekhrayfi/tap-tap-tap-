package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.No, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1073No {
    public static byte[] A00;
    public static String[] A01 = {"zHQaRI8Z04iZfuq60cOZ3MtOUQtnyLXk", "Py81lTfXTPvOohagzwztlFMwKgIeaa04", "ZBx", "ff4Sljy7OS0rEQC0yVPpTgSrr8dBXGgO", "WJ7E7dTZMlxiqC9ofw7stZL7dYzOgEyn", "lEp0yqe8iFuZgqtiF5MEL7dQIxoaDf7o", "1LQBU", "K3MGC9Pem9CSlPJADsZARPOkTW1wXgVW"};

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{8, 97, 91, 8, 97, 70, 91, 92, 73, 70, 92, 8, 79, 73, 69, 77, 91, 8, 73, 68, 68, 71, 95, 77, 76, 18, 8, 64, 41, 19, 64, 41, 14, 19, 20, 1, 14, 20, 64, 7, 1, 13, 5, 19, 90, 64, 77, 11, 12, 1, 1, 15, 12, 14, 6, 77, Ascii.CAN, Ascii.US, 1, 77, 12, Ascii.ESC, 12, 4, 1, 12, 15, 1, 8, 87, 77, 119, 62, 36, 4, 35, 56, 37, 50, 109, 119, 124, 108, 58, 37, 40, 41, 35, 108, 57, 62, 32, 108, 37, 63, 108, 34, 57, 32, 32, 118, 108, 92, 72, 73, 85, 82, 79, 84, 73, 68, Ascii.GS, 84, 78, Ascii.GS, 83, 72, 81, 81, Ascii.GS, 82, 79, Ascii.GS, 88, 80, 77, 73, 68, 90, 86, 84, 23, 95, 88, 90, 92, 91, 86, 86, 82, 23, 82, 88, 77, 88, 87, 88, 120, Ascii.DEL, 100, 121, 110, 64, 71, 92, 65, 86, 108, 70, 65, 95, 108, 68, 86, 81, 108, 85, 82, 95, 95, 81, 82, 80, 88, 97, 126, 115, 114, 120, 72, 98, 101, 123, 118, 96, 117, 98, 105, 94, 96, 111, 101, 94, 104, 111, 114, 117, 96, 109, 109, 94, 98, 105, 100, 98, 106};
    }

    static {
        A02();
    }

    public static AbstractC1072Nn A00(final C1076Nr c1076Nr, Bundle bundle, boolean z10) {
        AbstractC1072Nn c1198Sj;
        C1D c1dA0n = c1076Nr.A04().A0n();
        double dA00 = C1070Nl.A00(c1dA0n);
        boolean zA0N = c1076Nr.A04().A0n().A0N();
        final boolean zA06 = C1070Nl.A06(c1076Nr.A00(), c1076Nr.A01(), dA00);
        AbstractC05100g abstractC05100gA00 = C05110h.A00(c1076Nr.A05(), c1076Nr.A06(), A01(0, 0, 67), KW.A00(c1076Nr.A04().A0n().A0F().A05()), new HashMap());
        boolean z11 = !TextUtils.isEmpty(c1dA0n.A0D().A08());
        if (IN.A1W(c1076Nr.A05())) {
            c1076Nr.A05().A0A().AFz(c1076Nr.A02(), c1076Nr.A04().A0s(), z11);
        }
        boolean zA03 = A03(c1076Nr, z11);
        if ((zA0N && (abstractC05100gA00 instanceof FE)) || zA03) {
            c1198Sj = new C1190Sb(c1076Nr, zA03);
        } else if (z11) {
            c1198Sj = new C9B(c1076Nr);
        } else if (!z11 && IN.A25(c1076Nr.A05())) {
            c1198Sj = new AbstractC1202Sn(c1076Nr, zA06) { // from class: com.facebook.ads.redexgen.X.9D
                public static final int A02 = Resources.getSystem().getDisplayMetrics().widthPixels;
                public final View A00;
                public final boolean A01;

                {
                    super(c1076Nr, true);
                    this.A01 = zA06;
                    View viewA02 = c1076Nr.A02();
                    this.A00 = viewA02;
                    A0x();
                    if (zA06) {
                        addView(c1076Nr.A02(), new RelativeLayout.LayoutParams(-1, -1));
                    } else {
                        FrameLayout frameLayout = new FrameLayout(c1076Nr.A05());
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams.addRule(2, getAdDetailsView().getId());
                        frameLayout.setLayoutParams(layoutParams);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams2.gravity = 17;
                        layoutParams2.setMargins(AbstractC1072Nn.A07, 0, AbstractC1072Nn.A07, 0);
                        frameLayout.addView(viewA02, layoutParams2);
                        addView(frameLayout);
                    }
                    if (viewA02 != null && IN.A16(getAdContextWrapper())) {
                        NG.A00(viewA02, IN.A17(getAdContextWrapper()), new ViewOnClickListenerC1077Ns(this));
                    }
                    getAdDetailsView().bringToFront();
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
                public final boolean A02() {
                    return this.A01 && super.A02();
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
                public final boolean A0D() {
                    return this.A01 && super.A02();
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC1202Sn, com.facebook.ads.redexgen.X.AbstractC1072Nn
                public final void A0t(C1D c1d, String str, double d10, Bundle bundle2) {
                    super.A0t(c1d, str, d10, bundle2);
                    if (!this.A01 && d10 > 0.0d) {
                        int mediaHeight = (int) (((double) (A02 - (AbstractC1072Nn.A07 * 2))) / d10);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, mediaHeight);
                        layoutParams.gravity = 17;
                        int i10 = AbstractC1072Nn.A07;
                        int mediaHeight2 = AbstractC1072Nn.A07;
                        layoutParams.setMargins(i10, 0, mediaHeight2, 0);
                        this.A00.setLayoutParams(layoutParams);
                    }
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
                public final boolean A0u() {
                    return this.A01;
                }
            };
        } else if (zA06) {
            int iA00 = c1076Nr.A00();
            if (A01[2].length() != 3) {
                throw new RuntimeException();
            }
            A01[6] = "JelR9";
            c1198Sj = new C1201Sm(c1076Nr, iA00 == 2);
        } else {
            c1198Sj = new C1198Sj(c1076Nr, C1070Nl.A04(dA00));
        }
        if (z10) {
            c1198Sj.A0t(c1dA0n, c1076Nr.A04().A0s(), dA00, bundle);
        }
        return c1198Sj;
    }

    public static boolean A03(C1076Nr c1076Nr, boolean z10) {
        boolean z11 = false;
        if (!c1076Nr.A04().A0f() || !z10) {
            return false;
        }
        Uri uriA00 = KW.A00(c1076Nr.A04().A0n().A0F().A05());
        String authority = uriA00.getAuthority();
        C0945Il c0945Il = new C0945Il(c1076Nr.A04().A0s(), c1076Nr.A06());
        HashMap map = new HashMap();
        boolean zIsEmpty = TextUtils.isEmpty(authority);
        String strA01 = A01(183, 23, 70);
        if (zIsEmpty) {
            map.put(strA01, A01(102, 26, 122));
            c0945Il.A05(strA01, map);
            return false;
        }
        boolean isInstantGamesEnabled = authority.equals(A01(147, 5, 76));
        boolean isInstantGames = uriA00.getQueryParameter(A01(174, 9, 80)) == null;
        boolean isFallBackUrlAvailable = !TextUtils.isEmpty(uriA00.getQueryParameter(A01(SyslogConstants.LOG_LOCAL3, 22, 116)));
        boolean zEquals = c1076Nr.A05().getPackageName().equals(A01(128, 19, 126));
        boolean isVideoUrlNull = c1076Nr.A04().A0g();
        if (isInstantGamesEnabled && isInstantGames && isFallBackUrlAvailable && (!zEquals || isVideoUrlNull)) {
            z11 = true;
        }
        if (!z11) {
            int i10 = Build.VERSION.SDK_INT;
            if (A01[6].length() != 5) {
                throw new RuntimeException();
            }
            A01[2] = "75P";
            if (i10 >= 24) {
                map.put(strA01, map.getOrDefault(strA01, A01(0, 0, 67)) + A01(71, 11, 16) + isInstantGamesEnabled + A01(82, 20, 11) + isInstantGames + A01(46, 25, 42) + isFallBackUrlAvailable + A01(27, 19, 39) + zEquals + A01(0, 27, 111) + isVideoUrlNull);
                c0945Il.A05(strA01, map);
            }
        }
        return z11;
    }
}
