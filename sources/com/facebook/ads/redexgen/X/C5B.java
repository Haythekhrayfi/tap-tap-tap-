package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5B, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5B implements AdViewApi {
    public static byte[] A0D;
    public static String[] A0E = {"of0bzA7MwNGTia9F31tAkieNA09H6OOQ", "TyTQj7xFBxvma6AaZ1TUwVS6lItsexiQ", "kN9yyhhGlFuDqh5wulKzoOOSsFZblOVu", "DXKKP4SSVuW5x9unPZpKCS00jdGSX4q", "ceBkREnsnDPWKQGMERGG6oDocc2kf8dJ", "ULZujO58Hn4sCnlurEwExiI5FfKtYml", "oBzM86F4GMvLYp6iWCqbmyfPVfF4ncm8", "8s2Qgj6JQYkd4IbFNTxV1lfTN5yJUxqm"};
    public long A00;
    public View A01;
    public AdListener A02;
    public C0854Ev A03;
    public NB A04;
    public String A05;
    public String A06;
    public final DisplayMetrics A07;
    public final AdView A08;
    public final AdViewParentApi A09;
    public final C0830Dx A0A;
    public final JG A0B;
    public final String A0C;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-77, -27, -74, -78, -72, -26, -77, -70, 122, 125, -85, 117, 125, 119, 122, -86, -12, 32, 32, -9, -10, -13, -9, -11, -17, 14, Ascii.ESC, Ascii.ESC, 18, Ascii.US, -51, 14, 17, -51, 17, 18, 32, 33, Ascii.US, Ascii.FS, 38, 18, 17, -14, 17, Ascii.RS, Ascii.RS, 21, 34, -48, 17, 20, -48, Ascii.FS, Ascii.US, 17, 20, -48, 34, 21, 33, 37, 21, 35, 36, 21, 20, -118, -88, -75, -75, -74, -69, 103, -83, -80, -75, -85, 103, -88, 103, -69, -84, -76, -73, -77, -88, -69, -84, 103, -69, -81, -88, -69, 103, -77, -74, -88, -85, 103, -87, -80, -85, 103, 110, 108, -70, 110, -77, -74, -91, -69, -52, -73, -20, -19, -5, -4, -6, -9, 1, -40, -37, -51, -48, -83, -48};
        if (A0E[2].charAt(11) != 'D') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[7] = "i0zr3oWhaZ1ZQYjulO9yltnfKtDweGPM";
        strArr[6] = "f16HnFk6V4WfoRTY4RGQrwGHYb77b2mz";
        A0D = bArr;
    }

    static {
        A02();
    }

    public C5B(Context context, String str, AdSize adSize, AdViewParentApi adViewParentApi, AdView adView) {
        this.A00 = -1L;
        if (adSize != null && adSize != AdSize.INTERSTITIAL) {
            this.A07 = adView.getContext().getResources().getDisplayMetrics();
            JG jgA04 = C0984Kb.A04(adSize);
            this.A0B = jgA04;
            this.A0C = str;
            this.A09 = adViewParentApi;
            this.A08 = adView;
            C0830Dx c0830DxA06 = C5O.A06(context);
            this.A0A = c0830DxA06;
            c0830DxA06.A0E().A2n(AdPlacementType.BANNER.toString(), str);
            C05451q c05451q = new C05451q(str, C0984Kb.A05(jgA04), AdPlacementType.BANNER, C0984Kb.A04(adSize), 1);
            c05451q.A06(this.A05);
            c05451q.A07(this.A06);
            C0854Ev c0854Ev = new C0854Ev(c0830DxA06, c05451q);
            this.A03 = c0854Ev;
            c0854Ev.A0O(new YZ(this));
            return;
        }
        throw new IllegalArgumentException(A01(108, 6, 18));
    }

    public C5B(Context context, String str, String str2, AdViewParentApi adViewParentApi, AdView adView) throws JE {
        this(context, str, A00(str2), adViewParentApi, adView);
        this.A0A.A0E().A3i();
    }

    public static AdSize A00(String str) throws JE {
        JI template = JN.A00(str);
        if (template != null) {
            JN.A03(template);
            return C0984Kb.A01(template);
        }
        throw new JE(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A01(67, 41, 7), str));
    }

    private void A03(String str) {
        this.A00 = System.currentTimeMillis();
        if (str == null) {
            this.A0A.A0E().A2k();
        } else {
            this.A0A.A0E().A2j();
        }
        C0854Ev c0854Ev = this.A03;
        String[] strArr = A0E;
        if (strArr[3].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "8EJDtH9EjlwutgZO3WtzB3nx702AY4O";
        strArr2[5] = "dTiKD7UwUCw1SvcKYJrEphBgoR9CLtC";
        if (c0854Ev != null) {
            c0854Ev.A0R(str);
        }
        this.A0A.A0E().A2i();
    }

    public final long A04() {
        return this.A00;
    }

    public final DisplayMetrics A05() {
        return this.A07;
    }

    public final AdListener A06() {
        return this.A02;
    }

    public final AdView A07() {
        return this.A08;
    }

    public final C0854Ev A08() {
        return this.A03;
    }

    public final C0830Dx A09() {
        return this.A0A;
    }

    public final JG A0A() {
        return this.A0B;
    }

    public final void A0B(RelativeLayout relativeLayout, View view) {
        PA paA01;
        this.A0A.A0E().A3v(this.A06 != null);
        String str = this.A06;
        if (str != null && (paA01 = P9.A01(this.A0A, str)) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            relativeLayout.addView(paA01, new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height));
        }
    }

    public final void A0C(AdListener adListener) {
        this.A0A.A0E().A2g(adListener != null);
        this.A02 = adListener;
    }

    public final void A0D(NB nb2) {
        this.A04 = nb2;
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final AdView.AdViewLoadConfigBuilder buildLoadAdConfig() {
        return new C0950Iq(this);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        JR.A05(A01(114, 7, 72), A01(24, 19, 109), A01(8, 8, 5));
        this.A0A.A0E().A2o();
        C0854Ev c0854Ev = this.A03;
        if (c0854Ev != null) {
            c0854Ev.A0T(true);
            this.A03 = null;
        }
        if (Build.VERSION.SDK_INT >= 18 && this.A04 != null && IN.A11(this.A08.getContext())) {
            NB nb2 = this.A04;
            String[] strArr = A0E;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "fmi4ltQko56R0Ot1hIU3uMuoiOam3SD1";
            strArr2[6] = "7H1g3sSDF1cZj7eOXlokIXc1uirRZwhG";
            nb2.A07();
            View view = this.A01;
            if (view != null) {
                view.getOverlay().remove(this.A04);
            }
        }
        this.A08.removeAllViews();
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0C;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        C0854Ev c0854Ev = this.A03;
        boolean z10 = c0854Ev == null || c0854Ev.A0U();
        this.A0A.A0E().A4n(z10);
        return z10;
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        JR.A05(A01(121, 6, 44), A01(43, 24, 112), A01(0, 8, 65));
        A03(null);
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final void loadAd(AdView.AdViewLoadConfig adViewLoadConfig) {
        JR.A05(A01(121, 6, 44), A01(43, 24, 112), A01(16, 8, 127));
        A03(((C0950Iq) adViewLoadConfig).A00());
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.internal.api.AdViewParentApi
    public final void onConfigurationChanged(Configuration configuration) {
        this.A09.onConfigurationChanged(configuration);
        View view = this.A01;
        if (view != null) {
            JK.A01(this.A07, view, this.A0B);
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        C0854Ev c0854Ev;
        this.A05 = extraHints.getHints();
        this.A06 = extraHints.getMediationData();
        if (IN.A0j(this.A0A) && (c0854Ev = this.A03) != null) {
            c0854Ev.A07.A06(this.A05);
            this.A03.A07.A07(this.A06);
        }
    }
}
