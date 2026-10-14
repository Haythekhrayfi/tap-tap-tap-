package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AD extends RN {
    public static byte[] A0F;
    public static final String A0G;
    public Uri A00;
    public NativeAd A01;
    public InterfaceC0937Id A02;
    public InterfaceC1028Lv A03;
    public PQ A04;
    public AnonymousClass74 A05;
    public String A06;
    public String A07;
    public String A08;
    public final AnonymousClass17 A09;
    public final C1337Xw A0A;
    public final OR A0B;
    public final MN A0C;
    public final MB A0D;
    public final String A0E;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{122, -104, -91, 94, -85, 87, -86, -85, -104, -87, -85, 87, 120, -84, -101, -96, -100, -91, -102, -100, -123, -100, -85, -82, -90, -87, -94, 120, -102, -85, -96, -83, -96, -85, -80, 101, 87, -124, -104, -94, -100, 87, -86, -84, -87, -100, 87, -85, -97, -104, -85, 87, -96, -85, 94, -86, 87, -96, -91, 87, -80, -90, -84, -87, 87, 120, -91, -101, -87, -90, -96, -101, -124, -104, -91, -96, -99, -100, -86, -85, 101, -81, -92, -93, 87, -99, -96, -93, -100, 101, -77, -32, -32, -35, -32, -88, -114, 109, 105, 104, -100, -117, -112, -116, -107, -118, -116, 117, -116, -101, -98, -106, -103, -110, 113, -103, -105, -104, 68, -105, -119, -104, 103, -112, -115, -119, -110, -104, 120, -109, -113, -119, -110, 68, -118, -115, -106, -105, -104, 113, -103, -105, -104, 68, -105, -119, -104, 122, -115, -120, -119, -109, 121, 118, 109, 68, -109, -106, 68, -105, -119, -104, 122, -115, -120, -119, -109, 113, 116, 104, 68, -118, -115, -106, -105, -104, -16, -3, -18, -16, -14, 3, -8, 5, -8, 3, 8, -80, -71, -74, -78, -69, -63, -95, -68, -72, -78, -69, -7, -22, -5, -4, -14, -9, -16, -107, -105, -118, -119, -118, -117, -114, -109, -118, -119, 116, -105, -114, -118, -109, -103, -122, -103, -114, -108, -109, 112, -118, -98, -48, -55, -60, -52, -48, -64, -92, -65, -39, -41, -55, -78, -59, -40, -51, -38, -55, -89, -40, -59, -90, -39, -40, -40, -45, -46, -41, -54, -59, -58, -48, -83, -48, -56, -56, -58, -45, -22, -35, -40, -39, -29, -63, -60, -72, -120, 123, 118, 119, -127, 101, 119, 119, 125, 102, 123, Ascii.DEL, 119, -40, -53, -58, -57, -47, -73, -76, -82, -3, -16, -21, -20, -10, -26, -5, -16, -12, -20, -26, -9, -10, -13, -13, -16, -11, -18, -26, -16, -11, -5, -20, -7, -3, -24, -13, -87, -100, -104, -86, -121, -84, -93, -104};
    }

    static {
        A03();
        A0G = AD.class.getSimpleName();
    }

    public AD(C1337Xw c1337Xw) {
        super(c1337Xw);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new AW(this);
        this.A0C = new AF(this);
        this.A0B = new AE(this);
        this.A09 = new AnonymousClass17(this, c1337Xw);
        this.A0A = c1337Xw;
        A02();
    }

    public AD(C1337Xw c1337Xw, AttributeSet attributeSet) {
        super(c1337Xw, attributeSet);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new AW(this);
        this.A0C = new AF(this);
        this.A0B = new AE(this);
        this.A09 = new AnonymousClass17(this, c1337Xw);
        this.A0A = c1337Xw;
        A02();
    }

    public AD(C1337Xw c1337Xw, AttributeSet attributeSet, int i10) {
        super(c1337Xw, attributeSet, i10);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new AW(this);
        this.A0C = new AF(this);
        this.A0B = new AE(this);
        this.A09 = new AnonymousClass17(this, c1337Xw);
        this.A0A = c1337Xw;
        A02();
    }

    private void A02() {
        getEventBus().A03(this.A0D, this.A0C, this.A0B);
    }

    private void A04(Intent intent) {
        if (this.A05 == null) {
            A05(A01(114, 25, 19));
            return;
        }
        if (this.A00 == null && this.A08 == null) {
            A05(A01(139, 37, 19));
            return;
        }
        intent.putExtra(A01(237, 18, 83), this.A07);
        intent.putExtra(A01(322, 8, 34), EnumC0970Jm.A08);
        intent.putExtra(A01(287, 8, 81), this.A00.toString());
        String strA01 = this.A06;
        if (strA01 == null) {
            strA01 = A01(0, 0, 39);
        }
        intent.putExtra(A01(187, 11, 60), strA01);
        intent.putExtra(A01(266, 8, 99), this.A08);
        intent.putExtra(A01(205, 24, 20), Kn.A00(this.A0A));
        intent.putExtra(A01(274, 13, 1), getCurrentPositionInMillis());
        intent.putExtra(A01(229, 8, 74), this.A0E);
        intent.putExtra(A01(255, 11, 80), this.A05.A0W());
        intent.putExtra(A01(295, 27, 118), getVideoProgressReportIntervalMs());
        intent.addFlags(268435456);
    }

    private void A05(String str) {
        this.A0A.A07().A9K(A01(198, 7, 120), C06937v.A27, new C06947w(AdErrorType.PARSER_FAILURE.getDefaultErrorMessage(), A01(90, 7, 93) + str));
        if (AdInternalSettings.isDebugBuild()) {
            Log.w(A0G, str);
        }
    }

    public final void A0m() {
        NativeAd nativeAd = this.A01;
        if (nativeAd != null) {
            nativeAd.onCtaBroadcast();
        }
    }

    public final void A0n() {
        AdActivityIntent adActivityIntentA04 = KJ.A04(this.A0A);
        A04(adActivityIntentA04);
        try {
            A0e(false, 6);
            setVisibility(8);
            KJ.A09(this.A0A, adActivityIntentA04);
        } catch (Exception e10) {
            this.A0A.A07().A9K(A01(SyslogConstants.LOG_LOCAL6, 11, 126), C06937v.A0D, new C06947w(e10));
            Log.e(A01(97, 17, 22), A01(0, 90, 38), e10);
        }
    }

    public InterfaceC1028Lv getListener() {
        return this.A03;
    }

    public String getUniqueId() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.X.RN, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09.A02();
    }

    @Override // com.facebook.ads.redexgen.X.RN, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.A09.A03();
        super.onDetachedFromWindow();
    }

    public void setAdEventManager(InterfaceC0937Id interfaceC0937Id) {
        this.A02 = interfaceC0937Id;
    }

    public void setClientToken(String str) {
        AnonymousClass74 anonymousClass74;
        PQ pq = this.A04;
        if (pq != null) {
            pq.A0A();
        }
        AnonymousClass74 anonymousClass75 = this.A05;
        if (anonymousClass75 != null) {
            anonymousClass75.A0g();
        }
        this.A06 = str;
        PQ pq2 = null;
        if (str != null) {
            anonymousClass74 = new AnonymousClass74(this.A0A, this.A02, this, str);
        } else {
            anonymousClass74 = null;
        }
        this.A05 = anonymousClass74;
        if (IN.A1X(this.A0A)) {
            if (str != null) {
                pq2 = new PQ(this.A0A, this.A02, this, str, null);
            }
            this.A04 = pq2;
            return;
        }
        this.A04 = null;
    }

    public void setEnableBackgroundVideo(boolean z10) {
        super.A0D.setBackgroundPlaybackEnabled(z10);
    }

    public void setListener(InterfaceC1028Lv interfaceC1028Lv) {
        this.A03 = interfaceC1028Lv;
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.A01 = nativeAd;
    }

    public void setVideoCTA(String str) {
        this.A07 = str;
    }

    @Override // com.facebook.ads.redexgen.X.RN
    public void setVideoMPD(String str) {
        if (str != null && this.A05 == null) {
            A05(A01(114, 25, 19));
        } else {
            this.A08 = str;
            super.setVideoMPD(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RN
    public void setVideoURI(Uri uri) {
        if (uri != null && this.A05 == null) {
            A05(A01(114, 25, 19));
        } else {
            this.A00 = uri;
            super.setVideoURI(uri);
        }
    }
}
