package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class S7 extends FrameLayout implements InterfaceC1020Ln {
    public static String[] A0D = {"2Xyaln6pEv", "U0a3JqFqqkDVhXbmlhDLXicSxteMexx", "xzpI97Jg3aS17fwtqg1jZWsfReheMZxV", "0HUxaz9ggnFIA", "Uunhkc3", "kqN9", "fWeU9xYsODnan54TmlbSL1hNy6Lef7fu", "qbKhPFfRzVPGu"};
    public static final RelativeLayout.LayoutParams A0E = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AbstractC1404aD A01;
    public final C6O A02;
    public final C1337Xw A03;
    public final InterfaceC0937Id A04;
    public final C0945Il A05;
    public final LG A06;
    public final AbstractC1018Ll A07;
    public final InterfaceC1019Lm A08;
    public final MF A09;
    public final QR A0A;
    public final LB A0B;
    public final QQ A0C;

    public abstract void A0Q();

    public abstract void A0S(C5H c5h);

    public abstract boolean A0T();

    public S7(C1337Xw c1337Xw, MF mf, InterfaceC0937Id interfaceC0937Id, AbstractC1404aD abstractC1404aD, C6O c6o, InterfaceC1019Lm interfaceC1019Lm) {
        super(c1337Xw);
        SB sb2 = new SB(this);
        this.A0C = sb2;
        this.A06 = new LG();
        this.A00 = false;
        this.A03 = c1337Xw;
        this.A09 = mf;
        this.A04 = interfaceC0937Id;
        this.A01 = abstractC1404aD;
        this.A02 = c6o;
        this.A08 = interfaceC1019Lm;
        this.A05 = new C0945Il(abstractC1404aD.A0s(), interfaceC0937Id);
        QR qr = new QR(this, 1, new WeakReference(sb2), c1337Xw);
        this.A0A = qr;
        qr.A0W(abstractC1404aD.A09());
        qr.A0X(abstractC1404aD.A0A());
        this.A07 = A0N();
        LB lb2 = new LB(this);
        this.A0B = lb2;
        lb2.A05(LA.A03);
    }

    private FullScreenAdToolbar A0N() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A0h());
        fullScreenAdToolbar.setFullscreen(true);
        int iA03 = this.A01.A0n().A0D().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A0q(), this.A01.A0s(), iA03, this.A01.A0r());
        fullScreenAdToolbar.A06(this.A01.A0m().A01(), ViewOnClickListenerC1207Ss.A08(this.A01));
        if (iA03 < 0) {
            C1D c1dA0n = this.A01.A0n();
            int unskippableSeconds = A0D[4].length();
            if (unskippableSeconds == 31) {
                throw new RuntimeException();
            }
            A0D[5] = "3phQ";
            if (c1dA0n.A0M()) {
                fullScreenAdToolbar.setToolbarActionMode(4);
            }
        }
        fullScreenAdToolbar.setToolbarListener(new S8(this));
        return fullScreenAdToolbar;
    }

    private void A0O() {
        if (this.A01.A0n().A0P()) {
            C1104Ot c1104OtA0B = new C1102Or(this.A03, this.A01.A0n().A0E(), this.A01.A0q()).A08(this.A01.A0m().A01()).A0B();
            C0947In.A04(c1104OtA0B, this.A05, EnumC0944Ik.A0V);
            addView(c1104OtA0B, A0E);
            c1104OtA0B.A04(new S9(this));
            return;
        }
        A0Q();
    }

    public final void A0P() {
        if (!this.A00) {
            this.A0A.A0U();
            this.A00 = true;
        }
    }

    public final void A0R(int i10, K4 k10) {
        new C0990Kh(i10, new SA(this, i10, k10)).A08();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void A9A(Intent intent, Bundle bundle, C5H c5h) {
        this.A08.A3P(this, A0E);
        A0S(c5h);
        A0O();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AEi(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public String getCurrentClientToken() {
        return this.A01.A0s();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.A0B.A03();
        if (!TextUtils.isEmpty(this.A01.A0s())) {
            this.A04.A9H(this.A01.A0s(), new ND().A03(this.A0A).A02(this.A06).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC1019Lm interfaceC1019Lm) {
    }

    public void setUpFullscreenMode(boolean z10) {
        LA la2;
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        if (z10) {
            la2 = LA.A04;
        } else {
            la2 = LA.A03;
        }
        this.A0B.A05(la2);
    }
}
