package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.widget.LinearLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1422aV<NativeViewabilityLogger> implements InterfaceC05170o {
    public static byte[] A0G;
    public static String[] A0H = {"1VlIdrj3fRAASVh0IRQbA", "AKXoeI10d8PJONEXEmQHjWIEkAB2E", "HfXt1ktTFXNYFvURT1ePpe", "VNbNAjzqH3UXN3t9RrTP5z6I5Qa6gPQJ", "DeawL9PzUIlDumNdtXISYTaSpfy6P3Cj", "KNbO6MhxkLbBAZAqlm1H7U8Ouut8mEhI", "i536pd2CEb7n0lc", "TelURl5RBqiFivFSJRRvco6RCKborqoX"};
    public static final String A0I;
    public InterfaceC05250w A00;
    public C1410aJ A01;
    public F4 A02;
    public C0830Dx A03;
    public InterfaceC0937Id A04;
    public N6 A06;
    public C1214Sz A07;
    public AnonymousClass93 A08;
    public QQ A09;
    public QR A0A;
    public String A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public LG A05 = new LG();
    public Boolean A0B = false;

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 19);
            if (A0H[2].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[3] = "viF0h1063r6cbXDqGfnWrC6qPBVBGzAv";
            strArr[7] = "3ywSXssJKLxMazlfVUMLvW6ymO505mlb";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0G = new byte[]{-28, -16, -18, -81, -25, -30, -28, -26, -29, -16, -16, -20, -81, -30, -27, -12, -81, -29, -30, -17, -17, -26, -13, -81, -28, -19, -22, -28, -20, -26, -27, -24, -39, -20, -24, -93, -36, -24, -31, -32, -68, -69, -83, 116, Ascii.DEL};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0E(C8E c8e, C05461r c05461r) {
        C1412aL c1412aLA00 = C1412aL.A00(this.A03, c05461r.A03());
        this.A0C = c1412aLA00.A6M();
        if (C05140k.A06(this.A03, c1412aLA00, this.A04)) {
            this.A03.A0E().A4G();
            this.A00.ABb(this, JD.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A06 = new FC(this, c1412aLA00);
        C1214Sz c1214Sz = new C1214Sz(this.A03, (WeakReference<N6>) new WeakReference(this.A06), c8e.A04(), A6M());
        this.A07 = c1214Sz;
        c1214Sz.A0G(c8e.A07(), c8e.A08());
        C1423aW c1423aW = new C1423aW(this);
        C0830Dx c0830Dx = this.A03;
        InterfaceC0937Id interfaceC0937Id = this.A04;
        C1214Sz c1214Sz2 = this.A07;
        C1410aJ c1410aJ = new C1410aJ(c0830Dx, interfaceC0937Id, c1214Sz2, c1214Sz2.getViewabilityChecker(), c1423aW);
        this.A01 = c1410aJ;
        c1410aJ.A08(c1412aLA00);
        this.A07.loadDataWithBaseURL(N9.A01(AdInternalSettings.getUrlPrefix()), c1412aLA00.A04(), A08(31, 9, 97), A08(40, 5, 52), null);
        this.A0D = true;
        A09();
    }

    static {
        A0A();
        A0I = C1422aV.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aV != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A09() {
        F4 f10;
        if (this.A00 != null && this.A08 != null && (f10 = this.A02) != null && f10.A0c()) {
            this.A00.AAY(this, this.A08);
        }
        InterfaceC05250w interfaceC05250w = this.A00;
        if (interfaceC05250w != null && this.A0D) {
            boolean z10 = this.A0E;
            if (A0H[2].length() == 29) {
                throw new RuntimeException();
            }
            A0H[2] = "DQYu3GBVfiN4Ml";
            if (z10 || !this.A0F) {
                interfaceC05250w.AAY(this, this.A07);
            }
        }
        this.A03.A0E().A3d(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aV != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0B(int i10, C8E c8e) {
        C1425aY c1425aY = new C1425aY(this);
        this.A08 = new AnonymousClass93(this.A03, this.A04, c1425aY, this.A02, A08(0, 31, 110), 2, this.A05);
        this.A09 = new C1424aX(this);
        QR qr = new QR(this.A08, c8e.A04(), c8e.A09(), true, new WeakReference(this.A09), this.A03);
        this.A0A = qr;
        qr.A0W(this.A02.A09());
        this.A0A.A0X(this.A02.A0A());
        this.A08.setVisibility(0);
        this.A03.getResources();
        this.A08.setLayoutParams(new LinearLayout.LayoutParams(-1, i10));
        this.A08.AFc();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aV != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0F(JG jg, C8E c8e) {
        if (this.A02 == null || this.A04 == null) {
            return;
        }
        int iA02 = (int) (jg.A02() * Resources.getSystem().getDisplayMetrics().density);
        int bannerHeight = (IN.A1i(this.A03) && C06445o.A0A(this.A02.A0O())) ? 1 : 0;
        if (bannerHeight == 0) {
            A0B(iA02, c8e);
        } else {
            new C06445o(new C6O(this.A03), this.A02.A0O(), this.A02.A0K(), this.A02.A0M(), true, new C1427aa(this, iA02, c8e, this)).A0B();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aV != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public final void A0I(C0830Dx c0830Dx, InterfaceC0937Id interfaceC0937Id, JG jg, InterfaceC05250w interfaceC05250w, C05461r c05461r) {
        c0830Dx.A0E().A3c();
        this.A03 = c0830Dx;
        this.A04 = interfaceC0937Id;
        this.A00 = interfaceC05250w;
        this.A0F = IN.A1M(c0830Dx.getApplicationContext());
        C8E c8eA01 = c05461r.A01();
        F4 f4A02 = F4.A02(c05461r.A03(), this.A03);
        this.A02 = f4A02;
        if (f4A02.A0c()) {
            A0F(jg, c8eA01);
        } else {
            A0E(c8eA01, c05461r);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aV != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC05170o
    public final String A6M() {
        return this.A0C;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aV != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC05170o
    public final AdPlacementType A7V() {
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aV != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC05170o
    public final boolean AFh() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aV != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC05170o
    public final void onDestroy() {
        this.A03.A0E().A3a(this.A07 != null);
        C1214Sz c1214Sz = this.A07;
        if (c1214Sz != null) {
            c1214Sz.destroy();
            this.A07 = null;
            this.A06 = null;
        }
    }
}
