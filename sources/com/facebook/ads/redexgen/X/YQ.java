package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.DefaultMediaViewVideoRenderer;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YQ extends C5M implements MediaViewApi, Repairable, C7N {
    public static byte[] A0E;
    public static String[] A0F = {"5egxRyJvv3hsImr6xVPVZGZzS", "S92E58UIdGCmPOb4LYA51SRur0tU5vPU", "gB2LJBWgacco1yi3dwEv6yCRJyLib4yq", "IRYDxixZynQ1VjnPzR0JfxvjieAE", "Yx6PPUM30uHFy3rHO75LIsUaVykI", "YSQgGTlHzzB", "fqdcFq1cD4m6uZ0nLvDLKOa7nCA9CaYH", "MqJIv4BM2hfR6AMSoGkEEGT8SPZgcE8o"};
    public static final String A0G;
    public View A00;
    public View A01;
    public ImageView A02;
    public MediaView A03;
    public MediaViewListener A04;
    public MediaViewVideoRenderer A05;
    public AdComponentViewParentApi A06;
    public C1337Xw A07;
    public C05260x A08;
    public NA A09;
    public AnonymousClass93 A0A;
    public PA A0B;
    public boolean A0C;
    public boolean A0D;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 47);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{56, Ascii.SUB, 9, 20, 14, 8, Ascii.RS, 23, 91, 9, Ascii.RS, 21, Ascii.US, Ascii.RS, 9, Ascii.RS, 9, 91, 22, 14, 8, 15, 91, Ascii.EM, Ascii.RS, 91, 8, Ascii.RS, 15, 91, Ascii.EM, Ascii.RS, Ascii.GS, 20, 9, Ascii.RS, 91, 21, Ascii.SUB, 15, 18, 13, Ascii.RS, 58, Ascii.US, 85, Ascii.SUB, Ascii.RS, Ascii.GS, 41, 56, 53, 57, 50, 63, 57, 18, 57, 40, 43, 51, 46, 55, 64, 100, 104, 110, 108, 41, 123, 108, 103, 109, 108, 123, 108, 123, 41, 100, 124, 122, 125, 41, 107, 108, 41, 122, 108, 125, 41, 107, 108, 111, 102, 123, 108, 41, 103, 104, 125, 96, Ascii.DEL, 108, 72, 109, 39, 96, 68, 72, 78, 76, 9, 91, 76, 71, 77, 76, 91, 76, 91, 9, 68, 92, 90, 93, 9, 75, 76, 9, 90, 76, 93, 9, 75, 76, 79, 70, 91, 76, 9, 71, 72, 93, 64, 95, 76, 107, 72, 71, 71, 76, 91, 104, 77, 7, 18, 53, 45, 58, 55, 50, 63, 123, 13, 50, 62, 44, 123, 56, 52, 53, 40, 47, 41, 46, 56, 47, 52, 41, 123, 43, 58, 41, 58, 54, 40, 123, 47, 34, 43, 62, 117, 1, 46, 59, 38, 57, 42, 111, 14, 43, 111, 6, 44, 32, 33, 111, 38, 60, 111, 33, 58, 35, 35, 97, 11, 52, 57, 56, 50, 125, 47, 56, 51, 57, 56, 47, 56, 47, 125, 48, 40, 46, 41, 125, 63, 56, 125, 46, 56, 41, 125, 63, 56, 59, 50, 47, 56, 125, 51, 60, 41, 52, 43, 56, Ascii.FS, 57, 115, Ascii.SUB, 11, 18, 96, 108, 110, 45, 101, 98, 96, 102, 97, 108, 108, 104, 45, 98, 103, 112, 45, 109, 98, 119, 106, 117, 102, 45, 96, 111, 106, 96, 104, 102, 103, 117, 106, 103, 102, 108, 86, 113, 111, 62};
    }

    static {
        A08();
        A0G = MediaView.class.getSimpleName();
    }

    private void A05() {
        AnonymousClass93 anonymousClass93 = this.A0A;
        if (anonymousClass93 != null) {
            anonymousClass93.setVisibility(8);
            C3F.A0A(this.A0A.getDynamicWebViewController().A0O(), new ColorDrawable(0));
            this.A03.removeView(this.A0A);
            this.A0A = null;
        }
    }

    private void A06() {
        if (!this.A0D) {
            View view = this.A01;
            String[] strArr = A0F;
            if (strArr[4].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "HiqmuX4YAHl";
            strArr2[0] = "JtgDxExoVYEb5OmxUIRsQ7gjV";
            if (view != null) {
                LO.A0J(this.A08);
            }
            float f10 = Kn.A02;
            float density = 4.0f * f10;
            int hPadding = Math.round(density);
            float density2 = 12.0f * f10;
            int vPadding = Math.round(density2);
            this.A08.setChildSpacing(hPadding);
            this.A08.setPadding(0, vPadding, 0, vPadding);
            this.A08.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            C05260x c05260x = this.A08;
            this.A01 = c05260x;
            this.A03.addView(c05260x, layoutParams);
            return;
        }
        throw new IllegalStateException(A04(0, 46, 84));
    }

    private void A07() {
        EnumC0999Ks.A04(this.A03, EnumC0999Ks.A0A);
        EnumC0999Ks.A04(this.A09, EnumC0999Ks.A0A);
        EnumC0999Ks.A04(this.A05, EnumC0999Ks.A0A);
        EnumC0999Ks.A04(this.A01, EnumC0999Ks.A0A);
    }

    private final void A09(View view, ViewGroup.LayoutParams layoutParams) {
        A01(false);
        this.A03.addView(view, layoutParams);
        A01(true);
    }

    private void A0A(View view, U7 u10) {
        PA pa2 = this.A0B;
        if (pa2 != null) {
            MediaView mediaView = this.A03;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "tYahJlzELN2bWoIKGOvNb4V2q4om3tal";
            strArr2[2] = "knO8IZUpKtredd0Q2IkvjJrJQGpJW1Qq";
            mediaView.removeView(pa2);
        }
        if (!u10.A1d()) {
            return;
        }
        String strA1C = u10.A1C();
        Context context = this.A03.getContext();
        String[] strArr3 = A0F;
        String str = strArr3[5];
        String mediationData = strArr3[0];
        if (str.length() != mediationData.length()) {
            String[] strArr4 = A0F;
            strArr4[4] = "LedcnhOkj71a4gNr9a9uwwPVwkpS";
            strArr4[3] = "bOPNktfa058vxRDYU7HJ2aiUk3a2";
            if (context == null) {
                return;
            }
        } else if (context == null) {
            return;
        }
        PA paA01 = P9.A01(this.A07, strA1C);
        if (A0F[7].charAt(21) != 'L') {
            A0F[1] = "IBU68ioTGuVBWJ1dkmCJ7UK76Osi7EVF";
            this.A0B = paA01;
            if (paA01 == null) {
                return;
            }
        } else {
            this.A0B = paA01;
            if (paA01 == null) {
                return;
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(5, view.getId());
        layoutParams.addRule(7, view.getId());
        layoutParams.addRule(6, view.getId());
        layoutParams.addRule(8, view.getId());
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(16, view.getId());
            layoutParams.addRule(17, view.getId());
        }
        A09(this.A0B, layoutParams);
        this.A06.bringChildToFront(this.A0B);
    }

    private void A0B(ImageView imageView) {
        if (!this.A0D) {
            ImageView imageView2 = this.A02;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "9onWrVOda1qlu0pAvyXYf5LKITz29A5r";
            strArr2[2] = "G6pev0JETY7bhqmEZOziJsmCoQM1bBBX";
            if (imageView2 != null) {
                LO.A0J(imageView2);
            }
            imageView.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(imageView, layoutParams);
            imageView.setId(LO.A00());
            this.A02 = imageView;
            return;
        }
        throw new IllegalStateException(A04(106, 49, 6));
    }

    private final void A0C(C1337Xw c1337Xw, AttributeSet attributeSet, int i10, int i11, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1337Xw, attributeSet, i10, i11));
        A0H(new NA(c1337Xw, attributeSet, i10, i11));
        this.A08 = new C05260x(c1337Xw, attributeSet, i10);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1337Xw, attributeSet, i10, i11));
        A07();
    }

    private final void A0D(C1337Xw c1337Xw, AttributeSet attributeSet, int i10, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1337Xw, attributeSet, i10));
        A0H(new NA(c1337Xw, attributeSet, i10));
        this.A08 = new C05260x(c1337Xw, attributeSet, i10);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1337Xw, attributeSet, i10));
        A07();
    }

    private final void A0E(C1337Xw c1337Xw, AttributeSet attributeSet, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1337Xw, attributeSet));
        A0H(new NA(c1337Xw, attributeSet));
        this.A08 = new C05260x(c1337Xw, attributeSet);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1337Xw, attributeSet));
        A07();
    }

    private final void A0F(C1337Xw c1337Xw, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1337Xw));
        A0H(new NA(c1337Xw));
        this.A08 = new C05260x(c1337Xw);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1337Xw));
        A07();
    }

    private void A0G(U7 u10, boolean z10, J1 j10) {
        AsyncTaskC1212Sx asyncTaskC1212SxA04 = new AsyncTaskC1212Sx(this.A02, this.A07).A04();
        if (z10) {
            asyncTaskC1212SxA04.A06(new YX(this, u10));
        }
        asyncTaskC1212SxA04.A07(j10.getUrl());
    }

    private void A0H(NA na2) {
        if (!this.A0D) {
            NA na3 = this.A09;
            if (na3 != null) {
                this.A03.removeView(na3);
            }
            na2.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(na2, layoutParams);
            this.A09 = na2;
            return;
        }
        throw new IllegalStateException(A04(63, 43, 38));
    }

    private boolean A0I(NativeAd nativeAd) {
        List<NativeAd> carousel = ((C5U) nativeAd.getNativeAdApi()).A03();
        if (carousel == null) {
            return false;
        }
        Iterator<NativeAd> it = carousel.iterator();
        while (it.hasNext()) {
            if (it.next().getAdCoverImage() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(NativeAd nativeAd) {
        return Build.VERSION.SDK_INT >= 14 && !TextUtils.isEmpty(((C5U) nativeAd.getNativeAdApi()).A02());
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0360 A[PHI: r1
  0x0360: PHI (r1v14 android.view.View) = (r1v11 android.view.View), (r1v17 android.view.View) binds: [B:69:0x03b3, B:65:0x035e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x03b6 A[PHI: r1
  0x03b6: PHI (r1v12 android.view.View) = (r1v11 android.view.View), (r1v17 android.view.View) binds: [B:69:0x03b3, B:65:0x035e] A[DONT_GENERATE, DONT_INLINE]] */
    public final void A0L(NativeAd nativeAd) {
        View view;
        AbstractC1405aE f10;
        C1337Xw adObjectContext = ((U7) nativeAd.getInternalNativeAd()).A11();
        adObjectContext.A0H(this);
        this.A07.A0G(adObjectContext);
        this.A07.A0F(adObjectContext.A0E());
        this.A0D = true;
        U7 u7A0L = U7.A0L(nativeAd.getInternalNativeAd());
        u7A0L.A1Q(this.A03);
        this.A02.setVisibility(8);
        this.A02.setImageDrawable(null);
        if (u7A0L.A0z() != null) {
            boolean zA0c = u7A0L.A0z().A0c();
            if (A0F[7].charAt(21) == 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[4] = "CvXrj9TTP1W52m7bIbynzmDbx8Ql";
            strArr[3] = "OGerX4RrBYJpkLXwbXTHIjvyoHPN";
            if (zA0c) {
                if (!TextUtils.isEmpty(u7A0L.A0z().A0n().A0D().A08())) {
                    u7A0L.A11().A0E().AFK(EnumC05070d.A09);
                } else {
                    u7A0L.A11().A0E().AFK(EnumC05070d.A08);
                }
                A05();
                this.A09.setVisibility(8);
                this.A09.setImage(null, null);
                this.A05.setVisibility(8);
                this.A05.unsetNativeAd();
                ((C5T) this.A05.getMediaViewVideoRendererApi()).A03();
                View view2 = this.A01;
                if (view2 != null) {
                    view2.setVisibility(8);
                    View view3 = this.A01;
                    if (view3 instanceof N1) {
                        N1 n10 = (N1) view3;
                        if (A0F[1].charAt(24) != 't') {
                            String[] strArr2 = A0F;
                            strArr2[4] = "rVZQRbya12lyykx5Eq2uFJ3JGH4l";
                            strArr2[3] = "XRSLHysRpGcYp4QaXPRJ4K4uNDdg";
                            n10.A04();
                        } else {
                            n10.A04();
                        }
                    } else {
                        ((EB) view3).setAdapter(null);
                    }
                }
                A01(false);
                YV yv = new YV(this, u7A0L, nativeAd);
                C1337Xw c1337Xw = this.A07;
                AnonymousClass93 anonymousClass93 = new AnonymousClass93(c1337Xw, c1337Xw.A09(), yv, u7A0L.A0z(), A04(261, 31, 44), 4, u7A0L.A19());
                this.A0A = anonymousClass93;
                EnumC0999Ks.A04(anonymousClass93, EnumC0999Ks.A0A);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(13);
                this.A03.addView(this.A0A, layoutParams);
                AnonymousClass93 anonymousClass94 = this.A0A;
                this.A00 = anonymousClass94;
                bringChildToFront(anonymousClass94);
                this.A0A.setVisibility(0);
                A0A(this.A0A, u7A0L);
                A01(true);
                return;
            }
        }
        if (!A0I(nativeAd)) {
            if (A0J(nativeAd)) {
                u7A0L.A11().A0E().AFK(EnumC05070d.A0C);
                u7A0L.A1b(this.A0C);
                this.A00 = this.A05.getMediaViewVideoRendererApi().getVideoView();
                A05();
                this.A09.setVisibility(8);
                this.A09.setImage(null, null);
                View view4 = this.A01;
                if (view4 != null) {
                    view4.setVisibility(8);
                    View view5 = this.A01;
                    if (view5 instanceof N1) {
                        ((N1) view5).A04();
                    } else {
                        ((EB) view5).setAdapter(null);
                    }
                }
                bringChildToFront(this.A05);
                this.A05.setNativeAd(nativeAd);
                ((C5T) this.A05.getMediaViewVideoRendererApi()).A04(nativeAd);
                this.A05.setVisibility(0);
                if (u7A0L.getAdCoverImage() != null) {
                    new AsyncTaskC1212Sx(this.A03, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new YT(this, u7A0L)).A07(u7A0L.getAdCoverImage().getUrl());
                }
                if (BuildConfigApi.isDebug()) {
                    Log.i(A0G, A04(292, 9, 44) + ((C5U) nativeAd.getNativeAdApi()).A02());
                }
                A0A(this.A05, u7A0L);
                return;
            }
            if (nativeAd.getAdCoverImage() == null) {
                return;
            }
            u7A0L.A11().A0E().AFK(EnumC05070d.A0A);
            this.A00 = this.A09.getBodyImageView();
            A05();
            this.A05.setVisibility(8);
            this.A05.unsetNativeAd();
            ((C5T) this.A05.getMediaViewVideoRendererApi()).A03();
            View view6 = this.A01;
            if (view6 != null) {
                view6.setVisibility(8);
                String[] strArr3 = A0F;
                if (strArr3[6].charAt(12) != strArr3[2].charAt(12)) {
                    A0F[7] = "Dgm0JyWXySbfCdb16XoSe7MN32Vp1QVj";
                    view = this.A01;
                    if (view instanceof N1) {
                        ((N1) view).A04();
                    } else {
                        ((EB) view).setAdapter(null);
                    }
                } else {
                    String[] strArr4 = A0F;
                    strArr4[6] = "D0GPDFfrMR6XieFyYC2vHynCiCjpaNUA";
                    strArr4[2] = "H5HDOQyqBcm6nNekaOStoZQ6HlGjXfWv";
                    view = this.A01;
                    if (view instanceof N1) {
                        ((N1) view).A04();
                    } else {
                        ((EB) view).setAdapter(null);
                    }
                }
            }
            bringChildToFront(this.A09);
            this.A09.setVisibility(0);
            new AsyncTaskC1212Sx(this.A09, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new YS(this, u7A0L)).A07(u7A0L.getAdCoverImage().getUrl());
            A0A(this.A09, u7A0L);
            return;
        }
        u7A0L.A11().A0E().AFK(EnumC05070d.A03);
        boolean z10 = u7A0L.A17() == J4.A0B;
        if (IN.A2H(this.A07) && !z10) {
            A01(false);
            int width = this.A03.getWidth();
            for (ViewGroup viewGroup = (ViewGroup) this.A03.getParent(); width == 0 && viewGroup != null; viewGroup = (ViewGroup) viewGroup.getParent()) {
                width = viewGroup.getWidth();
            }
            LO.A0J(this.A01);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(13);
            N1 n11 = new N1(this.A07);
            this.A01 = n11;
            this.A03.addView(n11, layoutParams2);
            ((N1) this.A01).A05(u7A0L, width);
            LO.A0K(this.A01);
            A01(true);
        } else {
            C05260x c05260x = this.A08;
            this.A01 = c05260x;
            c05260x.setCurrentPosition(0);
            ((C05260x) this.A01).setShowTextInCarousel(z10);
            if (!z10) {
                f10 = new F6((C05260x) this.A01, u7A0L.A1H(), this.A07);
            } else {
                f10 = new F7(this.A07, (C05260x) this.A01, u7A0L.A1H(), u7A0L.A16());
            }
            f10.A0G(new YU(this, u7A0L));
            ((EB) this.A01).setAdapter(f10);
        }
        this.A00 = this.A01;
        A05();
        this.A09.setVisibility(8);
        this.A09.setImage(null, null);
        this.A05.setVisibility(8);
        this.A05.unsetNativeAd();
        ((C5T) this.A05.getMediaViewVideoRendererApi()).A03();
        bringChildToFront(this.A01);
        this.A01.setVisibility(0);
        A0A(this.A01, u7A0L);
    }

    public final void A0M(NativeAdBaseApi nativeAdBaseApi, boolean z10) {
        C1337Xw c1337XwA11 = ((U7) nativeAdBaseApi).A11();
        C1337Xw adObjectContext = this.A07;
        adObjectContext.A0G(c1337XwA11);
        c1337XwA11.A0H(this);
        this.A0D = true;
        U7 u7A0L = U7.A0L(nativeAdBaseApi);
        u7A0L.A1P(this.A03);
        this.A09.setVisibility(8);
        this.A09.setImage(null, null);
        this.A05.setVisibility(8);
        this.A05.unsetNativeAd();
        ((C5T) this.A05.getMediaViewVideoRendererApi()).A03();
        View view = this.A01;
        if (view != null) {
            view.setVisibility(8);
            View view2 = this.A01;
            if (view2 instanceof N1) {
                ((N1) view2).A04();
            } else {
                ((EB) view2).setAdapter(null);
            }
        }
        this.A02.setVisibility(0);
        bringChildToFront(this.A02);
        this.A00 = this.A02;
        J1 adIcon = u7A0L.getAdIcon();
        if (adIcon != null) {
            Bitmap bitmapA0M = u7A0L.A10().A0M(adIcon.getUrl());
            if (bitmapA0M != null) {
                this.A02.setImageBitmap(bitmapA0M);
                if (z10) {
                    this.A03.post(new YY(this, u7A0L));
                }
            } else {
                A0G(u7A0L, z10, adIcon);
            }
        } else {
            U6 u6A15 = u7A0L.A15();
            AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            c1337XwA11.A0E().A2h(u7A0L.A0x(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            if (u6A15 != null) {
                u6A15.AB6(JD.A00(adErrorType));
            }
            Log.e(A04(46, 17, 115), adErrorType.getDefaultErrorMessage());
            if (nativeAdBaseApi.isAdLoaded()) {
                C1337Xw adObjectContext2 = this.A07;
                adObjectContext2.A07().A9K(A04(258, 3, 84), C06937v.A0W, new C06947w(A04(192, 23, 96)));
            }
        }
        A0A(this.A02, u7A0L);
    }

    public final boolean A0N() {
        View view = this.A01;
        return view != null && view.getVisibility() == 0;
    }

    @Override // com.facebook.ads.redexgen.X.C7N
    public final C1337Xw A5o() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C5M, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        if (view == this.A01 || view == this.A05 || view == this.A09 || view == this.A02) {
            this.A06.bringChildToFront(view);
            PA pa2 = this.A0B;
            if (pa2 != null) {
                this.A06.bringChildToFront(pa2);
            }
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void destroy() {
        this.A05.pause(false);
        this.A05.getMediaViewVideoRendererApi().destroy();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final View getAdContentsView() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaHeight() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageHeight();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getHeight();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getHeight();
        }
        if (A0F[1].charAt(24) == 't') {
            throw new RuntimeException();
        }
        A0F[7] = "3C5Zne3gt6SFfa7y1AnuQltffgpI3Oh8";
        return 0;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaWidth() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageWidth();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getWidth();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getWidth();
        }
        String[] strArr = A0F;
        if (strArr[6].charAt(12) == strArr[2].charAt(12)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[5] = "pFreRfYdfw1";
        strArr2[0] = "pVUprXCJsnglf8IlGtX2XFBaJ";
        return 0;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView) {
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C1337Xw) {
            this.A07 = (C1337Xw) context;
        } else {
            this.A07 = C5O.A02(context);
        }
        this.A07.A0H(this);
        switch (adViewConstructorParams.getInitializationType()) {
            case 0:
                A0F(this.A07, mediaView);
                break;
            case 1:
                A0E(this.A07, adViewConstructorParams.getAttributeSet(), mediaView);
                break;
            case 2:
                A0D(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), mediaView);
                break;
            case 3:
                A0C(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView);
                break;
            default:
                throw new IllegalArgumentException(A04(155, 37, 116));
        }
        A01(true);
    }

    @Override // com.facebook.ads.redexgen.X.C5M, com.facebook.ads.internal.api.AdComponentViewApi
    public final void onAttachedToView(AdComponentView adComponentView, AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A06 = adComponentViewParentApi;
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        int currentHeight = this.A03.getWidth();
        int height = this.A03.getHeight();
        if (currentHeight > 0 && height > 0) {
            this.A03.repair(th);
            this.A03.getLayoutParams().width = currentHeight;
            MediaView mediaView = this.A03;
            if (A0F[1].charAt(24) == 116) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[5] = "Mgb6bOJjyiN";
            strArr[0] = "MTEeDXbdwkPsq4eW7ABfM3WBi";
            mediaView.getLayoutParams().height = height;
            this.A03.setBackgroundColor(-3355444);
            return;
        }
        this.A03.repair(th);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setListener(MediaViewListener mediaViewListener) {
        this.A04 = mediaViewListener;
        if (mediaViewListener == null) {
            ((C5T) this.A05.getMediaViewVideoRendererApi()).A07(null);
        } else {
            ((C5T) this.A05.getMediaViewVideoRendererApi()).A07(new YR(this, mediaViewListener));
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (!this.A0D) {
            MediaViewVideoRenderer mediaViewVideoRenderer2 = this.A05;
            if (A0F[7].charAt(21) == 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "ifAS5bhxfK6Gg4eu5Yemnhg9EBEfp9jT";
            strArr[2] = "R5YDbsM1msNnvJcIFydw3DY2O0brJ9d9";
            if (mediaViewVideoRenderer2 != null) {
                this.A03.removeView(mediaViewVideoRenderer2);
                this.A05.getMediaViewVideoRendererApi().destroy();
            }
            ((C5T) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A05(this.A07.A09());
            mediaViewVideoRenderer.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            ((YQ) this.A03.getMediaViewApi()).A09(mediaViewVideoRenderer, layoutParams);
            this.A05 = mediaViewVideoRenderer;
            this.A0C = !(mediaViewVideoRenderer instanceof DefaultMediaViewVideoRenderer);
            mediaViewVideoRenderer.setId(LO.A00());
            return;
        }
        throw new IllegalStateException(A04(215, 43, 114));
    }
}
