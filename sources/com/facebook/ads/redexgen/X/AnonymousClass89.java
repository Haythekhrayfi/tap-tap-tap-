package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.89, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass89 extends S7 {
    public AbstractC1072Nn A00;
    public final ImageView A01;
    public final C5F A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;

    public AnonymousClass89(C1337Xw c1337Xw, MF mf, InterfaceC0937Id interfaceC0937Id, AbstractC1404aD abstractC1404aD, C6O c6o, InterfaceC1019Lm interfaceC1019Lm) {
        super(c1337Xw, mf, interfaceC0937Id, abstractC1404aD, c6o, interfaceC1019Lm);
        this.A02 = new S2(this);
        this.A04 = new AtomicBoolean(false);
        this.A03 = new AtomicBoolean(false);
        this.A05 = new AtomicBoolean(false);
        ImageView imageView = new ImageView(getContext());
        this.A01 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        new AsyncTaskC1212Sx(imageView, super.A03).A05(super.A01.A0n().A0D().A00(), super.A01.A0n().A0D().A01()).A06(new S1(this)).A07(super.A01.A0n().A0D().A07());
    }

    private AbstractC1072Nn A01(int i10) {
        if (this.A01.getParent() != null) {
            LO.A0J(this.A01);
        }
        return C1073No.A00(new C1075Nq(super.A03, super.A04, this.A08, super.A01, this.A01, this.A0A, this.A06).A0E(this.A07.getToolbarHeight()).A0H(this.A07).A0D(i10).A0J(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A04.get() && this.A03.get()) {
            A0P();
        }
    }

    private void A06(int i10) {
        LO.A0J(this.A00);
        AbstractC1072Nn abstractC1072NnA01 = A01(i10);
        this.A00 = abstractC1072NnA01;
        C1M colors = abstractC1072NnA01.getColors();
        AbstractC1072Nn abstractC1072Nn = this.A00;
        LO.A0M(this, colors.A07(abstractC1072Nn != null && (abstractC1072Nn.A0u() || (this.A00 instanceof AbstractC1202Sn))));
        this.A07.setFullscreen(this.A00.A0u());
        this.A07.A06(colors, ViewOnClickListenerC1207Ss.A08(super.A01));
        addView(this.A00, 0, S7.A0E);
        AbstractC1072Nn abstractC1072Nn2 = this.A00;
        setUpFullscreenMode(abstractC1072Nn2 != null && abstractC1072Nn2.A0u());
    }

    @Override // com.facebook.ads.redexgen.X.S7
    public final void A0Q() {
        LO.A0L(this.A00);
        LO.A0L(this.A07);
        this.A03.set(true);
        A05();
        int iA03 = super.A01.A0n().A0D().A03();
        if (iA03 > 0) {
            AbstractC1072Nn abstractC1072Nn = this.A00;
            if (abstractC1072Nn != null) {
                abstractC1072Nn.A0s();
            }
            A0R(iA03, new S0(this));
            return;
        }
        this.A05.set(true);
        AbstractC1018Ll abstractC1018Ll = this.A07;
        int unskippableSeconds = getCloseButtonStyle();
        abstractC1018Ll.setToolbarActionMode(unskippableSeconds);
    }

    @Override // com.facebook.ads.redexgen.X.S7
    public final void A0S(C5H c5h) {
        c5h.A0N(this.A02);
        int orientation = c5h.A0J().getResources().getConfiguration().orientation;
        A06(orientation);
        addView(this.A07, new FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        LO.A0H(this.A00);
        LO.A0H(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.S7
    public final boolean A0T() {
        AbstractC1072Nn abstractC1072Nn = this.A00;
        return abstractC1072Nn != null && abstractC1072Nn.A0v(false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AC8(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void ACY(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        AbstractC1072Nn abstractC1072Nn = this.A00;
        if (abstractC1072Nn != null) {
            return abstractC1072Nn.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.S7, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A01.A0n().A0N()) {
            A06(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.X.S7, com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void onDestroy() {
        if (IN.A1W(super.A03)) {
            super.A03.A0A().AFo(this.A01);
        }
        AbstractC1072Nn abstractC1072Nn = this.A00;
        if (abstractC1072Nn != null) {
            abstractC1072Nn.A0o();
        }
        super.onDestroy();
    }
}
