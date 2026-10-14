package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5T implements MediaViewVideoRendererApi {
    public static byte[] A0G;
    public static String[] A0H = {"Ds1OlE9QLNwB", "aoTFD1mdY9qS2iG1b6xBMIzf9BXXSrYm", "osndMvDCAJCV1YpU", "nBivoQhUG9UhcV9idWewaYAmGQw5UcJS", "JB025Vwse6xgHKaH4PdlPsgjNbTaZijW", "Rr8Hg5ZtJOltbAd8rryGswWrdJNm13cq", "EfdUYpEvlCzoAxPYZB8PQhxNy", "DXUiKhR"};
    public static final String A0I;
    public MediaViewVideoRenderer A00;
    public VideoAutoplayBehavior A01;
    public C1337Xw A03;
    public InterfaceC0956Iw A04;
    public AD A05;
    public boolean A06;
    public boolean A07;
    public NativeAd A08;
    public final M3 A0D = new E7(this);
    public final MB A0C = new E6(this);
    public final MN A0B = new E5(this);
    public final M0 A0E = new E4(this);
    public final OR A09 = new E3(this);
    public final KG A0F = new E2(this);
    public final AbstractC1064Nf A0A = new C0832Dz(this);
    public C5M A02 = new C5M();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0G = new byte[]{-30, 7, 15, -6, 5, 2, -3, -71, -17, 2, -2, 16, -71, -4, 8, 7, 12, 13, 11, 14, -4, 13, 8, 11, -71, 9, -6, 11, -6, 6, 12, -71, 13, 18, 9, -2, -57, -34, -16, -16, -10, -12, -7, -14, -85, -8, 0, -2, -1, -85, -19, -16, -85, -5, -3, -16, -18, -16, -17, -16, -17, -85, -19, 4, -85, -20, -85, -18, -20, -9, -9, -85, -1, -6, -85, -16, -7, -14, -20, -14, -16, -34, -16, -16, -10, -73, -85, -20, -7, -17, -85, -15, -6, -9, -9, -6, 2, -16, -17, -85, -19, 4, -85, -20, -85, -18, -20, -9, -9, -85, -1, -6, -85, -17, -12, -2, -16, -7, -14, -20, -14, -16, -34, -16, -16, -10, -71, -27, -22, -12, -26, -17, -24, -30, -24, -26, -44, -26, -26, -20, -95, -28, -30, -19, -19, -26, -27, -95, -8, -22, -11, -23, -16, -10, -11, -95, -26, -17, -24, -30, -24, -26, -44, -26, -26, -20, -81, 74, 83, 76, 70, 76, 74, 56, 74, 74, 80, 5, 72, 70, 81, 81, 74, 73, 5, 92, 78, 89, 77, 84, 90, 89, 5, 73, 78, 88, 74, 83, 76, 70, 76, 74, 56, 74, 74, 80, 19};
    }

    static {
        A02();
        A0I = MediaViewVideoRenderer.class.getSimpleName();
    }

    public final void A03() {
        this.A00.pause(false);
        this.A05.setClientToken(null);
        this.A05.setVideoMPD(null);
        this.A05.setVideoURI((Uri) null);
        this.A05.setVideoCTA(null);
        this.A05.setNativeAd(null);
        this.A01 = VideoAutoplayBehavior.DEFAULT;
        NativeAd nativeAd = this.A08;
        if (nativeAd != null) {
            U7.A0L(nativeAd.getInternalNativeAd()).A1c(false, false);
        }
        this.A08 = null;
        InterfaceC0956Iw interfaceC0956Iw = this.A04;
        if (interfaceC0956Iw != null) {
            interfaceC0956Iw.AFr();
        }
    }

    public final void A04(NativeAd nativeAd) {
        this.A08 = nativeAd;
        C1337Xw c1337XwA11 = ((U7) nativeAd.getInternalNativeAd()).A11();
        C1337Xw adObjectContext = this.A03;
        adObjectContext.A0G(c1337XwA11);
        C5U c5u = (C5U) nativeAd.getNativeAdApi();
        this.A05.setClientToken(U7.A0L(nativeAd.getInternalNativeAd()).A1B());
        this.A05.setVideoMPD(c5u.A01());
        this.A05.setVideoURI(c5u.A02());
        C1419aS c1419aSA0y = U7.A0L(nativeAd.getInternalNativeAd()).A0y();
        if (c1419aSA0y != null) {
            this.A05.setVideoProgressReportIntervalMs(c1419aSA0y.A0B());
        }
        this.A05.setVideoCTA(nativeAd.getAdCallToAction());
        this.A05.setNativeAd(nativeAd);
        this.A01 = c5u.getVideoAutoplayBehavior();
        InterfaceC0956Iw interfaceC0956Iw = this.A04;
        if (interfaceC0956Iw != null) {
            interfaceC0956Iw.AFC(nativeAd);
        }
    }

    public final void A05(InterfaceC0937Id interfaceC0937Id) {
        this.A05.setAdEventManager(interfaceC0937Id);
    }

    public final void A06(InterfaceC0956Iw interfaceC0956Iw) {
        this.A04 = interfaceC0956Iw;
    }

    public final void A07(InterfaceC1028Lv interfaceC1028Lv) {
        this.A05.setListener(interfaceC1028Lv);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void destroy() {
        this.A05.A0V();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void disengageSeek(VideoStartReason videoStartReason) {
        if (!this.A06) {
            boolean zIsDebugBuild = AdInternalSettings.isDebugBuild();
            if (A0H[6].length() != 25) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[0] = "WtsbSHtQErqq";
            strArr[2] = "XLMSbaKAMNULMDv3";
            if (zIsDebugBuild) {
                Log.w(A0I, A01(127, 40, 5));
                return;
            }
            return;
        }
        this.A06 = false;
        if (this.A07) {
            this.A05.A0b(LK.A00(videoStartReason), 3);
        }
        this.A00.onSeekDisengaged();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void engageSeek() {
        if (this.A06) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.w(A0I, A01(167, 40, 105));
            }
        } else {
            this.A06 = true;
            this.A07 = QO.A0A.equals(this.A05.getState());
            this.A05.A0e(false, 1);
            this.A00.onSeekEngaged();
        }
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final int getCurrentTimeMs() {
        return this.A05.getCurrentPositionInMillis();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final int getDuration() {
        return this.A05.getDuration();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final View getVideoView() {
        return this.A05.getVideoView();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final float getVolume() {
        return this.A05.getVolume();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaViewVideoRenderer mediaViewVideoRenderer) {
        C1337Xw c1337XwA02;
        this.A00 = mediaViewVideoRenderer;
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C1337Xw) {
            c1337XwA02 = (C1337Xw) context;
        } else {
            c1337XwA02 = C5O.A02(context);
        }
        this.A03 = c1337XwA02;
        switch (adViewConstructorParams.getInitializationType()) {
            case 0:
                this.A05 = new AD(c1337XwA02);
                break;
            case 1:
                this.A05 = new AD(c1337XwA02, adViewConstructorParams.getAttributeSet());
                break;
            case 2:
                this.A05 = new AD(c1337XwA02, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr());
                break;
            case 3:
                this.A05 = new AD(c1337XwA02, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleRes());
                break;
            default:
                throw new IllegalArgumentException(A01(0, 37, 29));
        }
        this.A05.setEnableBackgroundVideo(mediaViewVideoRenderer.shouldAllowBackgroundPlayback());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.A05.setLayoutParams(layoutParams);
        this.A02.addView(this.A05, -1, layoutParams);
        EnumC0999Ks.A04(this.A05, EnumC0999Ks.A0A);
        this.A05.getEventBus().A03(this.A0D, this.A0C, this.A0B, this.A0E, this.A09, this.A0F, this.A0A);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void pause(boolean z10) {
        this.A05.A0e(z10, 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void play(VideoStartReason videoStartReason) {
        this.A05.A0b(LK.A00(videoStartReason), 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void seekTo(int i10) {
        if (!this.A06) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.w(A0I, A01(37, 90, 15));
                return;
            }
            return;
        }
        this.A05.A0Y(i10);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void setVolume(float f10) {
        this.A05.setVolume(f10);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final boolean shouldAutoplay() {
        AD ad2 = this.A05;
        if (ad2 == null || ad2.getState() == QO.A06) {
            return false;
        }
        return this.A01 == VideoAutoplayBehavior.ON || this.A01 == VideoAutoplayBehavior.DEFAULT;
    }
}
