package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SG extends AbstractC1097Om {
    public static String[] A07 = {"itiy11Wl5lP7QtpB3", "v6A5WW2CB", "SYp5FzxPKMl", "MKN0lN1Uug", "IQIXhYysWoH9a5YMZx5hFMUL6lEdxT5q", "FECz3BMfLn4pJfwLFVrIm2wrzlNMsWJ3", "RmVgcuWcoU56A5AXkQhrmgSRFj76ryom", "F5uv5dts8QHAu8Ovw"};
    public static final RelativeLayout.LayoutParams A08 = new RelativeLayout.LayoutParams(-1, -1);
    public C0990Kh A00;
    public AbstractC1072Nn A01;
    public final int A02;
    public final ImageView A03;
    public final AbstractC1018Ll A04;
    public final InterfaceC1101Oq A05;
    public final AtomicBoolean A06;

    public SG(C1337Xw c1337Xw, MF mf, int i10, InterfaceC0937Id interfaceC0937Id, AbstractC1404aD abstractC1404aD, InterfaceC1019Lm interfaceC1019Lm, FullScreenAdToolbar fullScreenAdToolbar, InterfaceC1101Oq interfaceC1101Oq, int i11) {
        super(c1337Xw, mf, interfaceC0937Id, abstractC1404aD, i10, interfaceC1019Lm);
        this.A06 = new AtomicBoolean(false);
        this.A02 = i11;
        this.A05 = interfaceC1101Oq;
        ImageView imageView = new ImageView(getContext());
        this.A03 = imageView;
        this.A04 = fullScreenAdToolbar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        new AsyncTaskC1212Sx(imageView, c1337Xw).A05(abstractC1404aD.A0n().A0D().A00(), abstractC1404aD.A0n().A0D().A01()).A06(new SI(this)).A07(abstractC1404aD.A0n().A0D().A07());
        A06(c1337Xw.getResources().getConfiguration().orientation);
    }

    private AbstractC1072Nn A02(int i10) {
        if (this.A03.getParent() != null) {
            ImageView imageView = this.A03;
            if (A07[4].charAt(16) != 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[3] = "PnJcnL34IR";
            strArr[1] = "4gIzhBkuZ";
            LO.A0J(imageView);
        }
        return C1073No.A00(new C1075Nq(super.A04, super.A05, this.A07, super.A03, this.A03, this.A09, super.A06).A0E(this.A04.getToolbarHeight()).A0H(this.A04).A0D(i10).A0J(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A06.get()) {
            A01();
        }
    }

    private void A06(int i10) {
        LO.A0J(this.A01);
        AbstractC1072Nn abstractC1072NnA02 = A02(i10);
        this.A01 = abstractC1072NnA02;
        addView(abstractC1072NnA02, 0, A08);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public final void A0I() {
        if (IN.A1W(super.A04)) {
            super.A04.A0A().AFo(this.A03);
        }
        AbstractC1072Nn abstractC1072Nn = this.A01;
        if (abstractC1072Nn != null) {
            abstractC1072Nn.A0o();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public final void A0J() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public final void A0K() {
        int i10 = this.A02;
        if (i10 > 0) {
            C0990Kh c0990Kh = new C0990Kh(i10, 100.0f, 100L, new Handler(Looper.getMainLooper()), new SH(this));
            this.A00 = c0990Kh;
            c0990Kh.A08();
            return;
        }
        this.A05.ACl(false);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public final void A0L(boolean z10) {
        C0990Kh c0990Kh = this.A00;
        if (c0990Kh != null && c0990Kh.A06()) {
            this.A00.A07();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public final void A0M(boolean z10) {
        C0990Kh c0990Kh = this.A00;
        if (c0990Kh != null && !c0990Kh.A05()) {
            this.A00.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public final boolean A0N() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public final boolean A0O() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public C1100Op getFullScreenAdStyle() {
        C1M colors = this.A01.getColors();
        return new C1100Op(this.A01.A0u(), C1100Op.A07, colors, ViewOnClickListenerC1207Ss.A08(super.A03), colors.A07(this.A01.A0u() || (this.A01 instanceof AbstractC1202Sn)), null);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A03.A0n().A0N()) {
            A06(configuration.orientation);
        }
    }
}
