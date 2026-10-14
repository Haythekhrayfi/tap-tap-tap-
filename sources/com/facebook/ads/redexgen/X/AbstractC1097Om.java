package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1097Om extends RelativeLayout {
    public boolean A00;
    public final int A01;
    public final QQ A02;
    public final AbstractC1404aD A03;
    public final C1337Xw A04;
    public final InterfaceC0937Id A05;
    public final LG A06;
    public final InterfaceC1019Lm A07;
    public final MF A08;
    public final QR A09;

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K();

    public abstract void A0L(boolean z10);

    public abstract void A0M(boolean z10);

    public abstract boolean A0N();

    public abstract boolean A0O();

    public abstract C1100Op getFullScreenAdStyle();

    public AbstractC1097Om(C1337Xw c1337Xw, MF mf, InterfaceC0937Id interfaceC0937Id, AbstractC1404aD abstractC1404aD, int i10, InterfaceC1019Lm interfaceC1019Lm) {
        super(c1337Xw);
        this.A06 = new LG();
        this.A00 = false;
        SJ sj = new SJ(this);
        this.A02 = sj;
        this.A01 = i10;
        this.A04 = c1337Xw;
        this.A07 = interfaceC1019Lm;
        this.A08 = mf;
        this.A03 = abstractC1404aD;
        this.A05 = interfaceC0937Id;
        QR qr = new QR(this, 1, new WeakReference(sj), c1337Xw);
        this.A09 = qr;
        qr.A0W(abstractC1404aD.A09());
        qr.A0X(abstractC1404aD.A0A());
    }

    public final void A01() {
        if (!this.A00) {
            this.A09.A0U();
            this.A00 = true;
        }
    }

    public QR getAdViewabilityChecker() {
        return this.A09;
    }

    public LG getTouchDataRecorder() {
        return this.A06;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
