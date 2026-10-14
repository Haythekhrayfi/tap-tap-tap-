package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7G, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7G extends TR implements P7 {
    public static byte[] A0N;
    public static String[] A0O = {"jpfQHsJU1lQWxp7CXlwdVdxcmzkEjD3g", "zEjz0M8mBGIlVid6uM60nN2wm9TWrUGD", "N1PpSZkKdQQSk7AxXPBdtL04F7CB9SRH", "NsCDsqdLjA318x1fHEY8u0Kcg9miAoAi", "WmIcjMDFfLwNDk", "", "Zb94j8IQkKLdVAKFmXIR3eGQpuAhW41l", "pxOHyfKHQ8aixQeNEjeruqZzDXsiYM9P"};
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public int A00;
    public int A01;
    public int A02;
    public RelativeLayout A03;
    public C0857Ey A04;
    public C6O A05;
    public C2M A06;
    public NJ A07;
    public NZ A08;
    public C1179Rq A09;
    public QQ A0A;
    public QR A0B;
    public String A0C;
    public List<P2> A0D;
    public final int A0E;
    public final C1M A0F;
    public final C1337Xw A0G;
    public final LG A0H;
    public final InterfaceC1019Lm A0I;
    public final C1076Nr A0J;
    public final P8 A0K;
    public final P8 A0L;
    public final JY A0M;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] - i12) - 14;
            if (A0O[0].charAt(17) == 'P') {
                throw new RuntimeException();
            }
            A0O[5] = "";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0A() {
        int iMin;
        int i10;
        int i11;
        int i12 = getResources().getConfiguration().orientation;
        int i13 = Kn.A03.widthPixels;
        int i14 = Kn.A03.heightPixels;
        if (i12 == 1) {
            iMin = Math.min(i13 - (A0Q * 4), i14 / 2);
            i10 = (i13 - iMin) / 8;
            i11 = i10 * 4;
            this.A0K.setVisibility(8);
            this.A0L.setVisibility(8);
        } else {
            iMin = Math.min(i14, i13);
            i10 = (i13 - iMin) / 2;
            i11 = i10;
            A08();
        }
        C2M c2m = this.A06;
        if (c2m == null) {
            Log.e(A06(61, 17, 7), A06(0, 28, 11));
            onDestroy();
            return;
        }
        C1178Rp fullscreenCarouselRecyclerViewAdapter = c2m.getFullscreenCarouselRecyclerViewAdapter();
        if (fullscreenCarouselRecyclerViewAdapter != null) {
            fullscreenCarouselRecyclerViewAdapter.A0F(iMin, i10, i11);
            fullscreenCarouselRecyclerViewAdapter.A06();
        }
    }

    public static void A0B() {
        byte[] bArr = {94, -117, -117, -120, -117, 57, 124, -117, 126, 122, -115, -126, -121, -128, 57, 124, 122, -117, -120, -114, -116, 126, -123, 57, -113, -126, 126, -112, 89, -122, -122, -125, -122, 52, -117, 124, 125, -128, 121, 52, 119, 117, -122, -125, -119, -121, 121, -128, 52, 119, 117, -122, 120, 52, 119, 124, 117, -126, 123, 121, 66, 91, 87, 86, -118, 121, 126, 122, -125, 120, 122, 99, 122, -119, -116, -124, -121, -128, -97, -94, -99, -94, -97, -78, -97, -99, -96, -77, -84, -94, -86, -93, -33, -21, -23, -86, -30, -35, -33, -31, -34, -21, -21, -25, -86, -35, -32, -17, -86, -27, -22, -16, -31, -18, -17, -16, -27, -16, -27, -35, -24, -86, -33, -24, -27, -33, -25, -31, -32};
        if (A0O[0].charAt(17) == 'P') {
            throw new RuntimeException();
        }
        A0O[0] = "0pXVmbGKHAzIVbBBK7Eyv6Mrdc2f0VIY";
        A0N = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A0D(int i10, Bundle bundle) {
        boolean z10 = i10 == 1;
        this.A03 = new RelativeLayout(getContext());
        C1203So c1203So = new C1203So(this.A0G, 0, this.A0D.get(0).A03().A0E().A00() == C1I.A05, this.A0F, super.A0A.A0n().A0F().A06(), A06(92, 37, 110), getAdEventManager(), this.A0I, this.A0B, this.A0H);
        this.A07 = c1203So;
        c1203So.A0C(z10 ? 1 : 0);
        this.A03.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A0A = new C1177Ro(this);
        QR qr = new QR(this, 1, new WeakReference(this.A0A), this.A0G);
        this.A0B = qr;
        qr.A0W(this.A01);
        this.A0B.A0X(this.A02);
        C2M c2m = new C2M(this.A0G);
        this.A06 = c2m;
        LO.A0K(c2m);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.A09 = new C1179Rq(this.A06, i10, this.A0D, this.A0B, bundle);
        if (this.A0C != null) {
            this.A06.setAdapter(new C1178Rp(this.A0G, this.A0D, this.A04, super.A0C, this.A05, this.A0B, this.A0H, getAudienceNetworkListener(), this.A0C, this.A09, this.A0M, super.A0E));
            A0A();
        } else {
            if (A0O[0].charAt(17) == 'P') {
                throw new RuntimeException();
            }
            A0O[5] = "";
            Log.e(A06(61, 17, 7), A06(0, 28, 11));
            onDestroy();
        }
        A0F(this.A09);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        if (IN.A1W(this.A0G)) {
            InterfaceC0949Ip interfaceC0949IpA0A = this.A0G.A0A();
            C2M c2m2 = this.A06;
            String strA0s = super.A0A.A0s();
            if (A0O[4].length() == 17) {
                throw new RuntimeException();
            }
            A0O[5] = "";
            interfaceC0949IpA0A.AFz(c2m2, strA0s, false);
        }
        this.A03.addView(this.A06, layoutParams);
        A09();
        this.A03.addView(this.A08);
        this.A07.setTitleMaxLines(3);
        this.A07.A0A();
        this.A07.A09();
        this.A03.addView(this.A07, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        int i11 = A0P;
        layoutParams3.width = i11;
        layoutParams3.height = i11;
        int i12 = A0Q;
        layoutParams3.setMargins(i12, 0, 0, 0);
        layoutParams4.addRule(11);
        layoutParams4.addRule(15);
        layoutParams4.width = i11;
        layoutParams4.height = i11;
        layoutParams4.setMargins(0, 0, i12, 0);
        this.A03.addView(this.A0K, layoutParams3);
        this.A03.addView(this.A0L, layoutParams4);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(12);
        this.A03.addView(this.A0M, layoutParams5);
        A0V(this.A03, true, i10);
        removeView(findViewById(C1066Nh.A00));
        if (IN.A2G(this.A0G)) {
            LO.A0M(this, -1);
        } else {
            C1066Nh.A00(this.A0J.A05(), this, this.A04.A0n().A0D().A07());
        }
        if (this.A0C != null) {
            this.A07.setInfo(this.A04.A0n().A0E(), this.A04.A0n().A0F(), this.A0C, super.A0A.A0q().A01(), null);
        }
    }

    static {
        A0B();
        A0Q = (int) (Kn.A02 * 8.0f);
        A0R = (int) (Kn.A02 * 8.0f);
        A0S = (int) (Kn.A02 * 12.0f);
        A0P = (int) (Kn.A02 * 42.0f);
    }

    public C7G(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, C6O c6o, InterfaceC1019Lm interfaceC1019Lm, C0857Ey c0857Ey) {
        super(c1337Xw, interfaceC0937Id, interfaceC1019Lm, c0857Ey);
        LG lg = new LG();
        this.A0H = lg;
        this.A00 = -1;
        this.A05 = c6o;
        this.A0G = c1337Xw;
        this.A0I = interfaceC1019Lm;
        this.A0E = super.A0A.A0u().size();
        this.A0M = new JY(c1337Xw);
        this.A0L = new P8(c1337Xw, P6.A04, this);
        this.A0K = new P8(c1337Xw, P6.A03, this);
        this.A0J = new C1075Nq(c1337Xw, interfaceC0937Id, getAudienceNetworkListener(), this.A04, null, this.A0B, lg).A0H(super.A0E).A0J();
        this.A0F = c0857Ey.A0m().A01();
        if (IN.A1l(c1337Xw)) {
            super.A0E.setProgressSpinnerInvisible(true);
        }
    }

    private void A08() {
        if (this.A00 > 0) {
            this.A0K.setVisibility(0);
        } else {
            this.A0K.setVisibility(8);
        }
        if (this.A00 != this.A0E - 1) {
            P8 p10 = this.A0L;
            String[] strArr = A0O;
            if (strArr[7].charAt(14) == strArr[1].charAt(14)) {
                throw new RuntimeException();
            }
            A0O[0] = "6a52QfyEa3IWfhbHGHqjZ8J10HxaoQoC";
            p10.setVisibility(0);
            return;
        }
        this.A0L.setVisibility(8);
    }

    private void A09() {
        if (this.A08 != null && this.A06 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (getResources().getConfiguration().orientation == 1) {
                layoutParams.addRule(3, this.A06.getId());
                layoutParams.setMargins(0, A0Q, 0, 0);
            } else {
                layoutParams.addRule(12);
                layoutParams.setMargins(0, 0, 0, A0Q);
            }
            layoutParams.addRule(14);
            this.A08.setLayoutParams(layoutParams);
        }
    }

    private final void A0C() {
        C2M c2m = this.A06;
        if (c2m != null) {
            c2m.removeAllViews();
            this.A06 = null;
        }
        NZ nz = this.A08;
        if (nz != null) {
            nz.removeAllViews();
            this.A08 = null;
        }
        RelativeLayout relativeLayout = this.A03;
        if (A0O[5].length() != 0) {
            throw new RuntimeException();
        }
        A0O[5] = "";
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
    }

    private void A0E(C0857Ey c0857Ey) {
        this.A04 = c0857Ey;
        this.A0C = c0857Ey.A0s();
        this.A01 = this.A04.A09();
        this.A02 = this.A04.A0A();
        List<C1D> listA0u = this.A04.A0u();
        List<AdInfo> adInfoList = new ArrayList<>(listA0u.size());
        this.A0D = adInfoList;
        for (int i10 = 0; i10 < listA0u.size(); i10++) {
            C1D c1d = listA0u.get(i10);
            List<P2> list = this.A0D;
            int i11 = listA0u.size();
            list.add(new P2(i10, i11, c1d));
        }
    }

    private void A0F(C1179Rq c1179Rq) {
        new EC().A0G(this.A06);
        c1179Rq.A0Z(new C1176Rn(this));
        NZ nz = new NZ(this.A0G, super.A05.A01(), this.A0D.size());
        this.A08 = nz;
        LO.A0K(nz);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0R);
        layoutParams.setMargins(0, A0S, 0, 0);
        this.A08.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.TR
    public final boolean A0b() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void A9A(Intent intent, Bundle bundle, C5H c5h) {
        C0857Ey dataBundle = (C0857Ey) intent.getSerializableExtra(A06(78, 14, 48));
        A0W(c5h);
        if (dataBundle != null) {
            A0E(dataBundle);
        }
        A0D(c5h.A0J().getResources().getConfiguration().orientation, bundle);
        c5h.A0N(new C1175Rm(this, c5h));
        int iA03 = super.A0A.A0n().A0D().A03();
        if (iA03 > 0) {
            A0U(iA03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TR, com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AC8(boolean z10) {
        super.AC8(z10);
        C1179Rq c1179Rq = this.A09;
        if (c1179Rq != null) {
            c1179Rq.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.TR, com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void ACY(boolean z10) {
        super.ACY(z10);
        C1179Rq c1179Rq = this.A09;
        if (c1179Rq != null) {
            c1179Rq.A0R();
        }
    }

    @Override // com.facebook.ads.redexgen.X.P7
    public final void ACv(P6 p10) {
        int i10;
        C2M c2m = this.A06;
        if (c2m != null) {
            C1364Yy layoutManager = c2m.getLayoutManager();
            if (p10 == P6.A03) {
                int i11 = this.A00;
                i10 = i11 <= 0 ? 0 : i11 - 1;
                layoutManager.A21(this.A06, new C06194p(), i10);
            } else {
                int i12 = this.A00;
                int i13 = this.A0E;
                i10 = i12 >= i13 + (-1) ? i13 - 1 : i12 + 1;
                layoutManager.A21(this.A06, new C06194p(), i10);
            }
            setUpLayoutForCardAtIndex(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AEi(Bundle bundle) {
        C1179Rq c1179Rq = this.A09;
        if (c1179Rq != null) {
            c1179Rq.A0X(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TR
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle savedInstanceState = new Bundle();
        AEi(savedInstanceState);
        super.onConfigurationChanged(configuration);
        A0A();
        C2M c2m = this.A06;
        if (c2m != null && this.A09 != null) {
            c2m.getLayoutManager().A1t(Math.max(this.A00, 0));
            this.A09.A0U(Math.max(this.A00, 0));
        }
        A09();
        NJ nj = this.A07;
        if (nj != null) {
            nj.A0C(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TR, com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void onDestroy() {
        super.onDestroy();
        if (IN.A1W(this.A0G)) {
            InterfaceC0949Ip interfaceC0949IpA0A = this.A0G.A0A();
            if (A0O[0].charAt(17) == 'P') {
                throw new RuntimeException();
            }
            A0O[4] = "nCvA44nJ0TVVJ";
            interfaceC0949IpA0A.AFo(this.A06);
        }
        if (!TextUtils.isEmpty(this.A0C)) {
            super.A0C.A9H(this.A0C, new ND().A03(this.A0B).A02(this.A0H).A05());
        }
        A0C();
        this.A0B.A0V();
        this.A0B = null;
        this.A0A = null;
        this.A0D = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0H.A06(this.A0G, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void setAdDetailsToolBarClickListener(int i10) {
        InterfaceC1022Lp interfaceC1022Lp;
        if (this.A06 == null || !IN.A0z(this.A0J.A05()) || i10 < 0 || this.A06.getAdapter() == null) {
            return;
        }
        C2M c2m = this.A06;
        String[] strArr = A0O;
        if (strArr[3].charAt(28) == strArr[2].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[7] = "L2Q99TOJcURMOBK7mibMWk3Gkyoj0cp8";
        strArr2[1] = "bh6RAua9XdYQzRZgXDnYUJ30pnvEuGys";
        if (i10 >= c2m.getAdapter().A0D() || (interfaceC1022Lp = (InterfaceC1022Lp) this.A06.A1F(i10)) == null) {
            return;
        }
        interfaceC1022Lp.AEw();
        interfaceC1022Lp.AEu(this.A07);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    public void setUpLayoutForCardAtIndex(int i10) {
        NZ nz = this.A08;
        if (nz != null) {
            nz.A00(i10);
        }
        C1D c1dA0o = this.A04.A0o(i10);
        if (c1dA0o != null && this.A00 != i10) {
            this.A00 = i10;
            if (getResources().getConfiguration().orientation == 2) {
                A08();
            }
            removeView(findViewById(C1066Nh.A00));
            if (IN.A2G(this.A0G)) {
                LO.A0M(this, -1);
            } else {
                C1066Nh.A00(this.A0J.A05(), this, c1dA0o.A0D().A07());
            }
            if (this.A0C != null) {
                NJ nj = this.A07;
                if (A0O[0].charAt(17) == 'P') {
                    throw new RuntimeException();
                }
                A0O[6] = "kFih28rpO37RepskuaJrvvoNb65qRIkh";
                if (nj == null) {
                    Log.e(A06(61, 17, 7), A06(28, 33, 6));
                } else {
                    nj.setInfo(c1dA0o.A0E(), c1dA0o.A0F(), this.A0C, super.A0A.A0q().A01(), null);
                    setAdDetailsToolBarClickListener(i10);
                }
            } else {
                Log.e(A06(61, 17, 7), A06(28, 33, 6));
            }
            if (!TextUtils.isEmpty(c1dA0o.A0D().A08())) {
                this.A0M.setVisibility(0);
            } else {
                this.A0M.setVisibility(8);
            }
        }
    }
}
