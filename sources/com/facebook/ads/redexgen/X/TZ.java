package com.facebook.ads.redexgen.X;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TZ implements InterfaceC1020Ln {
    public static byte[] A0C;
    public static String[] A0D = {"VjNTozFJBHBTAbZvfj55MfAwGP9LBSf6", "Pq0aBOwFzXTv3d8c4kUbGJ29Dl7JaeBe", "6Jh9GB1FdSmhvo4jirjJmKwQUVM2B32M", "TGGBgusTs1FvyAgmLwAY3Gsc6eBuJSRW", "x90wDNv6CtBtNBa5WCDyDNAaFj8t5cCY", "GDNjvFSJPJLifqCEdIwxfegvvEeKItWd", "ZGbO0A4ZRQBBFZeQfXm02pkO19XETszh", "zRbEM6nv1u3uOOYe"};
    public static final String A0E;
    public long A00;
    public long A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final C5F A06;
    public final C5H A07;
    public final InterfaceC0937Id A08;
    public final C1048Mp A09;
    public final C1049Mq A0A;
    public final T8 A0B;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0D;
            if (strArr[1].charAt(18) == strArr[4].charAt(18)) {
                throw new RuntimeException();
            }
            A0D[7] = "WrA4t0RN";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 62);
            i13++;
        }
    }

    public static void A04() {
        A0C = new byte[]{114, -120, -120, -107, -120, -84, -41, -43, -120, -85, -41, -42, -36, -51, -42, -36, -120, -76, -41, -55, -52, -51, -52, -120, -68, -47, -43, -51, -94, -120, -70, -48, -48, -35, -48, -4, Ascii.US, 17, 20, -48, -10, Ascii.EM, Ascii.RS, Ascii.EM, 35, Ascii.CAN, -48, 4, Ascii.EM, Ascii.GS, 21, -22, -48, -98, -76, -76, -63, -76, -32, 3, -11, -8, -76, -25, 8, -11, 6, 8, -76, -24, -3, 1, -7, -50, -76, -101, -79, -79, -66, -79, -29, -10, 4, 1, 0, -1, 4, -10, -79, -42, -1, -11, -79, -27, -6, -2, -10, -53, -79, -57, -35, -35, -22, -35, 16, 32, 47, 44, 41, 41, -35, 15, 34, Ascii.RS, 33, 54, -35, 17, 38, 42, 34, -9, -35, -112, -90, -90, -77, -90, -39, -21, -7, -7, -17, -11, -12, -90, -52, -17, -12, -17, -7, -18, -90, -38, -17, -13, -21, -64, -90, -116, 92, 114, 114, Ascii.DEL, 114, -102, -77, -64, -74, -66, -73, -60, 114, -90, -69, -65, -73, -116, 114, -90, -42, -45, -37, -41, -55, -42, -124, -41, -55, -41, -41, -51, -45, -46, -124, -56, -59, -40, -59, -124, -48, -45, -53, -53, -55, -56, -124, -92, -124, -58, -57, -44, -38, -39, -97, -57, -47, -58, -45, -48, 9, Ascii.EM, 22, Ascii.RS, Ascii.SUB, 12, Ascii.EM, -4, -7, -13, Ascii.CAN, 33, Ascii.RS, Ascii.SUB, 35, 41, 9, 36, 32, Ascii.SUB, 35, -54, -61, -48, -58, -50, -57, -44, -74, -53, -49, -57};
    }

    static {
        A04();
        A0E = TZ.class.getSimpleName();
    }

    public TZ(C5H c5h, C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, InterfaceC1019Lm interfaceC1019Lm) {
        T8 t10;
        C1217Tc c1217Tc = new C1217Tc(this);
        this.A06 = c1217Tc;
        this.A05 = true;
        this.A01 = -1L;
        this.A04 = true;
        this.A07 = c5h;
        this.A08 = interfaceC0937Id;
        int i10 = (int) (Kn.A02 * 2.0f);
        C1216Tb c1216Tb = new C1216Tb(this, interfaceC1019Lm);
        if (c1337Xw.A0D() == null) {
            c1337Xw.A0E().A8T();
        }
        if (IO.A02(c1337Xw) || c1337Xw.A0D() == null) {
            t10 = new T8(c1337Xw, c1216Tb);
        } else {
            t10 = new T8(c1337Xw, c1337Xw.A0D(), c1216Tb);
        }
        this.A0B = t10;
        C1048Mp c1048Mp = new C1048Mp(c1337Xw, t10);
        this.A09 = c1048Mp;
        c1048Mp.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        c1048Mp.setListener(new C1215Ta(this, c5h));
        interfaceC1019Lm.A3P(c1048Mp, layoutParams);
        t10.setBrowserNavigationListener(c1048Mp.getBrowserNavigationListener());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, c1048Mp.getId());
        layoutParams2.addRule(12);
        interfaceC1019Lm.A3P(t10, layoutParams2);
        C1049Mq c1049Mq = new C1049Mq(c1337Xw, null, R.attr.progressBarStyleHorizontal);
        this.A0A = c1049Mq;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, i10);
        layoutParams3.addRule(3, c1048Mp.getId());
        c1049Mq.setProgress(0);
        interfaceC1019Lm.A3P(c1049Mq, layoutParams3);
        c5h.A0N(c1217Tc);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void A9A(Intent intent, Bundle bundle, C5H c5h) {
        if (this.A01 < 0) {
            this.A01 = System.currentTimeMillis();
        }
        String strA03 = A03(231, 11, 36);
        String strA04 = A03(220, 11, 119);
        String strA05 = A03(210, 10, 105);
        if (bundle == null) {
            this.A02 = intent.getStringExtra(strA05);
            this.A03 = intent.getStringExtra(strA04);
            String[] strArr = A0D;
            if (strArr[0].charAt(28) != strArr[2].charAt(28)) {
                throw new RuntimeException();
            }
            A0D[5] = "h34ynCyxETZN0C4DuHOjqZ0ETc7IsjOt";
            this.A00 = intent.getLongExtra(strA03, -1L);
        } else {
            this.A02 = bundle.getString(strA05);
            this.A03 = bundle.getString(strA04);
            this.A00 = bundle.getLong(strA03, -1L);
        }
        String strA06 = this.A02;
        if (strA06 == null) {
            strA06 = A03(199, 11, 39);
        }
        this.A09.setUrl(strA06);
        this.A0B.loadUrl(strA06);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AC8(boolean z10) {
        this.A0B.onPause();
        if (this.A04) {
            this.A04 = false;
            C1052Mt c1052MtA07 = new C1051Ms(this.A0B.getFirstUrl()).A01(this.A00).A03(this.A01).A04(this.A0B.getResponseEndMs()).A00(this.A0B.getDomContentLoadedMs()).A05(this.A0B.getScrollReadyMs()).A02(this.A0B.getLoadFinishMs()).A06(System.currentTimeMillis()).A07();
            this.A08.A9F(this.A03, c1052MtA07.A02());
            if (BuildConfigApi.isDebug()) {
                String str = A03(169, 30, 38) + System.currentTimeMillis() + A03(149, 20, 20) + c1052MtA07.A01 + A03(53, 22, 86) + c1052MtA07.A03 + A03(75, 24, 83) + c1052MtA07.A04 + A03(0, 30, 42) + c1052MtA07.A00 + A03(99, 24, 127) + c1052MtA07.A05 + A03(30, 23, 114) + c1052MtA07.A02 + A03(123, 26, 72) + c1052MtA07.A06;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void ACY(boolean z10) {
        this.A0B.onResume();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AEi(Bundle bundle) {
        bundle.putString(A03(210, 10, 105), this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final String getCurrentClientToken() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void onDestroy() {
        this.A07.A0O(this.A06);
        N9.A03(this.A0B);
        this.A0B.destroy();
    }
}
