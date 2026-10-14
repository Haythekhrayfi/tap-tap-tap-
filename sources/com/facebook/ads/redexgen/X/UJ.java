package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class UJ extends C5M implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static String[] A0G = {"mcYgxpLQMmIwsDd5yEmcOVEUvqtoI", "GHoJM0N9xHnxy27wJlEicj6316JJBG", "sAgmez8xlBVRjdgohc9cPNZKpCHjl", "UXd4O0RMEZeMz8rPKuZc9Jx8", "lkMSGOb1N9f2znZPpxO7v43dGPgWn", "ZJq7h5cFUWj9FCmvTSQNl6xA6rnC8", "yifDfgH7QVrqMR4w0vNHSMY9h4Ewh", "QZpfE8IVFABXRQwraZ"};
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public C1337Xw A01;
    public InterfaceC0954Iu A02;
    public AD A04;
    public C06606h A05;
    public C6Z A06;
    public QQ A07;
    public QR A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final PV A0C = new UP(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public J6 A03 = J6.A03;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{7, 32, 56, 47, 34, 39, 42, 110, 60, 43, 32, 42, 43, 60, 43, 60, 110, 45, 38, 39, 34, 42, 110, 45, 33, 32, 40, 39, 41, 96, 14, 38, 39, 42, 34, 21, 42, 38, 52, 21, 42, 39, 38, 44, 99, 42, 48, 99, 45, 54, 47, 47, 120, 99, 54, 45, 34, 33, 47, 38, 99, 55, 44, 99, 37, 42, 45, 39, 99, 42, 55, 109, 16, 43, 36, 39, 41, 32, 101, 49, 42, 101, 35, 44, 43, 33, 101, 8, 32, 33, 44, 36, 19, 44, 32, 50, 19, 44, 33, 32, 42, 101, 38, 45, 44, 41, 33, 107};
    }

    static {
        A0E();
        A0H = UJ.class.getSimpleName();
    }

    private UO A00(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new UO(this, mediaViewVideoRendererApi);
    }

    private UN A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new UN(this, mediaViewVideoRendererApi);
    }

    private UL A02() {
        return new UL(this);
    }

    private QR A05() {
        return new QR(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    private void A09() {
        AD ad2 = this.A04;
        if (ad2 != null) {
            PW pw = (PW) ad2.getVideoView();
            if (A0G[3].length() != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[2] = "uL1T6UePNJ7Kw1irCYcqiA1GlgiEZ";
            strArr[0] = "2BZHbySyGqLzqR4K5b7TQMpiAd64K";
            pw.setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        AD ad2 = this.A04;
        if (ad2 != null) {
            ad2.getVideoView().setOnTouchListener(new ViewOnTouchListenerC0953It(this));
        }
    }

    private void A0B() {
        AD ad2 = this.A04;
        if (ad2 != null) {
            PW pw = (PW) ad2.getVideoView();
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0G[7] = "MUEPyY1MJMWvhU3XHu";
            pw.setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09) {
            MediaViewVideoRenderer mediaViewVideoRenderer = this.A00;
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[4] = "vtumVYeB8x7vkBeCNzRl37Vgwgf5m";
            strArr2[1] = "l5c2Nb35iHyego1JNAmcVzJY15xyfp";
            if (mediaViewVideoRenderer.hasWindowFocus()) {
                this.A08.A0U();
                return;
            }
        }
        AD ad2 = this.A04;
        if (ad2 != null && ad2.getState() == QO.A05) {
            this.A0B = true;
        }
        this.A08.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = J6.A03;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    public void A0I(U7 u10, InterfaceC0954Iu interfaceC0954Iu) {
        String url;
        this.A0A = false;
        this.A0B = false;
        this.A02 = interfaceC0954Iu;
        A09();
        C06606h c06606h = this.A05;
        if (u10 != null) {
            J1 adCoverImage = u10.getAdCoverImage();
            String[] strArr = A0G;
            if (strArr[2].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A0G[3] = "zpp3cHPhluFOPvL30kkcY8af";
            if (adCoverImage != null) {
                url = u10.getAdCoverImage().getUrl();
            } else {
                url = null;
            }
        } else {
            url = null;
        }
        c06606h.setImage(url, new UM(this));
        this.A03 = u10.A18();
        this.A06.setPlayAccessibilityLabel(u10.A1E());
        this.A06.setPauseAccessibilityLabel(u10.A1D());
        this.A08.A0U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(PZ pz) {
        AD ad2 = this.A04;
        if (ad2 != null) {
            ad2.A0b(pz, 24);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.e(A0H, A06(30, 42, 60));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0K() {
        AD ad2 = this.A04;
        if (ad2 == null || ad2.getState() == QO.A06) {
            return false;
        }
        return this.A03 == J6.A05 || this.A03 == J6.A03;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:30:0x010d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0113  */
    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i10) {
        InterfaceC0956Iw interfaceC0956IwA00;
        AD ad2;
        String[] strArr;
        AD ad3;
        String[] strArr2;
        ((C5M) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        switch (i10) {
            case 0:
                interfaceC0956IwA00 = A01(mediaViewVideoRendererApi);
                break;
            case 1:
                interfaceC0956IwA00 = A00(mediaViewVideoRendererApi);
                break;
            default:
                throw new IllegalArgumentException(A06(0, 30, 49));
        }
        ((C5T) mediaViewVideoRendererApi).A06(interfaceC0956IwA00);
        this.A01 = C5O.A02(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new C06606h(this.A01);
        this.A07 = A02();
        this.A08 = A05();
        float density = Kn.A02;
        int bigPadding = (int) (2.0f * density);
        int smallPadding = (int) (25.0f * density);
        this.A06 = new C6Z(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(bigPadding, smallPadding, smallPadding, bigPadding);
        this.A06.setLayoutParams(layoutParams);
        for (int i11 = 0; i11 < this.A00.getChildCount(); i11++) {
            View childAt = this.A00.getChildAt(0);
            if (childAt instanceof AD) {
                AD ad4 = (AD) childAt;
                String[] strArr3 = A0G;
                if (strArr3[4].length() != strArr3[1].length()) {
                    A0G[3] = "bzrDqpY4LpZuK9aeaZZijHYv";
                    this.A04 = ad4;
                    ad2 = this.A04;
                    strArr = A0G;
                    if (strArr[2].length() == strArr[0].length()) {
                        String[] strArr4 = A0G;
                        strArr4[6] = "2aK7TrzSKlLOXQMMYyslcv3rZKnIT";
                        strArr4[5] = "rJ0uIs3irNdkufru0tgAA9z3l7YlJ";
                        if (ad2 == null) {
                            if (AdInternalSettings.isDebugBuild()) {
                                Log.e(A0H, A06(72, 36, 58));
                            }
                        } else {
                            ad2.A0c(this.A05);
                            ad3 = this.A04;
                            strArr2 = A0G;
                            if (strArr2[6].length() != strArr2[5].length()) {
                                throw new RuntimeException();
                            }
                            A0G[3] = "N5wNlZvELtjdUjcESL7VUEU7";
                            ad3.A0c(this.A06);
                        }
                        this.A08.A0W(0);
                        this.A08.A0X(BaseTransientBottomBar.ANIMATION_DURATION);
                        interfaceC0956IwA00.AF7();
                        return;
                    }
                }
                throw new RuntimeException();
            }
        }
        ad2 = this.A04;
        strArr = A0G;
        if (strArr[2].length() == strArr[0].length()) {
            String[] strArr5 = A0G;
            strArr5[6] = "2aK7TrzSKlLOXQMMYyslcv3rZKnIT";
            strArr5[5] = "rJ0uIs3irNdkufru0tgAA9z3l7YlJ";
            if (ad2 == null) {
                if (AdInternalSettings.isDebugBuild()) {
                    Log.e(A0H, A06(72, 36, 58));
                }
            } else {
                ad2.A0c(this.A05);
                ad3 = this.A04;
                strArr2 = A0G;
                if (strArr2[6].length() != strArr2[5].length()) {
                    throw new RuntimeException();
                }
                A0G[3] = "N5wNlZvELtjdUjcESL7VUEU7";
                ad3.A0c(this.A06);
            }
            this.A08.A0W(0);
            this.A08.A0X(BaseTransientBottomBar.ANIMATION_DURATION);
            interfaceC0956IwA00.AF7();
            return;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.C5M, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C5M, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        this.A00.setOnTouchListener(new ViewOnTouchListenerC0952Is(this));
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.C5M, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C5M, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        A0C();
    }
}
