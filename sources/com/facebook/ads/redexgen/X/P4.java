package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class P4 extends FrameLayout {
    public static final int A08 = (int) (Kn.A02 * 16.0f);
    public AC A00;
    public PQ A01;
    public AnonymousClass74 A02;
    public C0971Jn A03;
    public C06606h A04;
    public C6C A05;
    public final C1337Xw A06;
    public final C0945Il A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A04(InterfaceC0937Id interfaceC0937Id, String str, Map<String, String> map) {
        A02();
        this.A02 = new AnonymousClass74(this.A06, interfaceC0937Id, this.A00, str, map);
        if (IN.A1X(this.A06)) {
            this.A01 = new PQ(this.A06, interfaceC0937Id, this.A00, str, map);
        } else {
            this.A01 = null;
        }
    }

    public P4(C1337Xw c1337Xw, C0945Il c0945Il) {
        super(c1337Xw);
        this.A07 = c0945Il;
        this.A06 = c1337Xw;
        setUpView(c1337Xw);
    }

    public final void A01() {
        this.A00.A0e(true, 10);
    }

    public final void A02() {
        PQ pq = this.A01;
        if (pq != null) {
            pq.A0A();
            this.A01 = null;
        }
        AnonymousClass74 anonymousClass74 = this.A02;
        if (anonymousClass74 != null) {
            anonymousClass74.A0g();
            this.A02 = null;
        }
    }

    public final void A03(C8Y c8y) {
        this.A00.getEventBus().A05(c8y);
    }

    public final void A05(PZ pz) {
        this.A00.A0b(pz, 13);
    }

    public final boolean A06() {
        return this.A00.A0k();
    }

    public RN getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return this.A00.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C1337Xw c1337Xw) {
        this.A00.A0X();
        C06606h c06606h = new C06606h(c1337Xw);
        this.A04 = c06606h;
        this.A00.A0c(c06606h);
        this.A03 = new C0971Jn(c1337Xw, this.A07);
        this.A00.A0c(new C06666p(c1337Xw));
        this.A00.A0c(this.A03);
        C6C c6c = new C6C(c1337Xw, true, this.A07);
        this.A05 = c6c;
        this.A00.A0c(c6c);
        this.A00.A0c(new C0973Jq(this.A05, EnumC1123Pm.A03, true, true));
        if (!this.A00.A0g() && !IN.A2G(c1337Xw)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i10 = A08;
        layoutParams.setMargins(i10, i10, i10, i10);
        this.A03.setLayoutParams(layoutParams);
        this.A00.addView(this.A03);
    }

    private void setUpVideo(C1337Xw c1337Xw) {
        AC ac2 = new AC(c1337Xw);
        this.A00 = ac2;
        ac2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LO.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new P3(this));
    }

    private void setUpView(C1337Xw c1337Xw) {
        setUpVideo(c1337Xw);
        setUpPlugins(c1337Xw);
    }

    public void setVideoURI(String str) {
        this.A00.setVideoURI(str);
    }

    public void setVolume(float f10) {
        this.A00.setVolume(f10);
        this.A03.A09();
    }
}
