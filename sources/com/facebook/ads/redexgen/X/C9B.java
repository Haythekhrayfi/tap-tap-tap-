package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9B, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9B extends AbstractC1202Sn implements M4 {
    public static byte[] A0F;
    public static String[] A0G = {"QUFYIN7o4MSHfMbcaqgxGqdg8oING", "Qixa92rp7KQSHPhBId3L5m9SXc6gxNRP", "TUKhftCqFUFv9xNbjbPA3CLhBIkdW", "aNiMBj1VMT3xct4Co4hWzqTsg", "QYSCqyZ4CS", "VjIbmM2G6pRRrYhuKIf6SOzC6eQUF7eo", "KFJXOgKoK7JNlCBWMf", "dachHr6cLZKwbIDqTeRsc0FgbmZCJ"};
    public View A00;
    public View A01;
    public C1337Xw A02;
    public C0990Kh A03;
    public AbstractC1018Ll A04;
    public PI A05;
    public JQ A06;
    public boolean A07;
    public boolean A08;
    public final InterfaceC1019Lm A09;
    public final NX A0A;
    public final NY A0B;
    public final RN A0C;
    public final JY A0D;
    public final AtomicBoolean A0E;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0F = new byte[]{-53, -60, -39, -56, -30, -42, -41, -60, -43, -41, -52, -47, -54, -30, -60, -47, -52, -48, -60, -41, -52, -46, -47, -42, -30, -45, -49, -60, -36, -56, -57, -51, -48, -44, -58, -32, -45, -58, -40, -62, -45, -59, -32, -44, -60, -45, -58, -58, -49, -32, -44, -55, -48, -40, -49, -53, -75, -57, -45, -71, -62, -72, -45, -73, -75, -58, -72, -45, -57, -68, -61, -53, -62};
    }

    static {
        A08();
    }

    public C9B(C1076Nr c1076Nr) {
        super(c1076Nr, false);
        this.A0E = new AtomicBoolean(false);
        this.A08 = false;
        this.A07 = false;
        this.A02 = c1076Nr.A05();
        this.A04 = c1076Nr.A08();
        View view = new View(this.A02);
        this.A01 = view;
        LO.A0K(view);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A05();
        InterfaceC1019Lm interfaceC1019LmA09 = c1076Nr.A09();
        this.A09 = interfaceC1019LmA09;
        C1066Nh.A00(c1076Nr.A05(), this, getAdInfo().A0D().A07());
        RN rnA01 = A01(c1076Nr);
        this.A0C = rnA01;
        getAdDetailsView().bringToFront();
        JY jyA02 = A02(c1076Nr);
        this.A0D = jyA02;
        A0x();
        this.A05 = new PI(this.A02, c1076Nr.A06(), getAdDataBundle());
        C1200Sl c1200Sl = new C1200Sl(this);
        this.A0A = c1200Sl;
        this.A0B = new NY(c1076Nr, getAdDataBundle(), rnA01, jyA02, getAdDetailsView(), interfaceC1019LmA09, c1200Sl);
        if (IN.A18(getAdContextWrapper())) {
            NG.A00(rnA01.getVideoImplView(), IN.A19(getAdContextWrapper()), new ViewOnClickListenerC1078Nt(this));
        }
    }

    private RN A01(C1076Nr c1076Nr) {
        RN rn = (RN) c1076Nr.A02();
        int iA0w = A0w(c1076Nr.A08());
        ImageView imageView = (ImageView) c1076Nr.A03();
        int i10 = AbstractC1202Sn.A0D;
        int i11 = AbstractC1202Sn.A0D;
        int toolbarHeight = AbstractC1202Sn.A0D;
        imageView.setPadding(i10, i11, toolbarHeight, AbstractC1202Sn.A0D);
        int toolbarHeight2 = AbstractC1202Sn.A0E;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(toolbarHeight2, AbstractC1202Sn.A0E);
        int toolbarHeight3 = AbstractC1202Sn.A0C;
        layoutParams.setMargins(0, iA0w, toolbarHeight3, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        addView(rn, layoutParams2);
        rn.addView(imageView, layoutParams);
        return rn;
    }

    private JY A02(C1076Nr c1076Nr) {
        JY jyA0A = c1076Nr.A0A();
        jyA0A.A06(-1, AbstractC1202Sn.A09);
        jyA0A.setPadding(AbstractC1202Sn.A0H, AbstractC1202Sn.A0H, AbstractC1202Sn.A0H, AbstractC1202Sn.A0H);
        RelativeLayout.LayoutParams progressBarLayoutParams = new RelativeLayout.LayoutParams(-1, AbstractC1202Sn.A0G);
        progressBarLayoutParams.addRule(12);
        addView(jyA0A, progressBarLayoutParams);
        return jyA0A;
    }

    private void A04() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0E();
            this.A0C.A0d(getAnimationPlugin());
        }
    }

    private void A05() {
        AbstractC1018Ll abstractC1018Ll = this.A04;
        if (abstractC1018Ll == null) {
            return;
        }
        this.A06 = new JQ(abstractC1018Ll, 400, -abstractC1018Ll.getToolbarHeight(), 0);
    }

    private void A06() {
        new C0945Il(getAdDataBundle().A0s(), getAdEventManager()).A04(EnumC0944Ik.A0v, null);
        if (!getAdInfo().A0O()) {
            return;
        }
        this.A0E.set(true);
        LO.A0T(this);
        LO.A0H(this.A0C);
        LO.A0Z(this.A0C, this.A0D, this.A0B, this.A00);
        LO.A0L(this.A04);
        PI pi = this.A05;
        ViewOnClickListenerC1207Ss ctaButton = getCtaButton();
        String[] strArr = A0G;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0G[3] = "FxfG3zWETYKhpCEsP1aqGpvXk";
        Pair<PH, View> pairA03 = pi.A03(ctaButton);
        this.A00 = (View) pairA03.second;
        switch (C1079Nu.A00[((PH) pairA03.first).ordinal()]) {
            case 1:
                getAdDetailsView().setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, A0w(this.A04), 0, 0);
                layoutParams.addRule(2, getAdDetailsView().getId());
                addView(this.A00, layoutParams);
                break;
            case 2:
                LO.A0Z(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(AbstractC1202Sn.A0F, AbstractC1202Sn.A0F, AbstractC1202Sn.A0F, AbstractC1202Sn.A0F);
                addView(this.A00, layoutParams2);
                break;
        }
        if (getAdInfo().A0G().A00() >= 0) {
            this.A07 = true;
            AbstractC1018Ll abstractC1018Ll = this.A04;
            if (abstractC1018Ll != null) {
                abstractC1018Ll.setToolbarActionMode(2);
                this.A04.setProgressImmediate(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            }
            C0990Kh c0990Kh = new C0990Kh((int) getAdInfo().A0G().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new C1199Sk(this));
            this.A03 = c0990Kh;
            c0990Kh.A08();
        }
    }

    private void A07() {
        JQ jq = this.A06;
        if (jq != null) {
            jq.A3T(true, false);
        }
        if (getAdDetailsAnimation() != null) {
            getAdDetailsAnimation().A3T(true, false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final void A0B(AnonymousClass73 anonymousClass73) {
        super.A0B(anonymousClass73);
        A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final void A0C(C06746z c06746z) {
        super.A0C(c06746z);
        int videoLengthMs = c06746z.A00();
        int duration = this.A0C.getDuration() - videoLengthMs;
        if (getAnimationPlugin() != null) {
            int videoLengthMs2 = A0G[1].charAt(18);
            if (videoLengthMs2 != 51) {
                throw new RuntimeException();
            }
            A0G[5] = "xiBnzSw2W6K3rvYkwdUGMYXv5m3ZqRWR";
            if (duration < 3000 && getAnimationPlugin().A0J()) {
                getAnimationPlugin().A0F();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final void A0o() {
        super.A0o();
        A04();
        this.A04 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1202Sn, com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final void A0t(C1D c1d, String str, double d10, Bundle bundle) {
        super.A0t(c1d, str, d10, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A03(0, 31, 118), false)) {
            A07();
        }
        if (bundle.getBoolean(A03(55, 18, 103), false)) {
            A06();
        }
        if (bundle.getBoolean(A03(31, 24, 116), false)) {
            NY ny = this.A0B;
            if (A0G[1].charAt(18) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[2] = "jjtMTZWEM7Dg1szUnnnmuTjwvMhej";
            strArr[0] = "cexdZia4vusGbXInA5fVVHDcQrSB4";
            ny.A07(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final boolean A0u() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final boolean A0v(boolean z10) {
        boolean zA0O;
        if (!z10 || this.A08) {
            zA0O = getAdInfo().A0O();
            if (A0G[5].charAt(17) != 'k') {
                A0G[1] = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor";
                if (!zA0O && !this.A0E.get()) {
                    this.A0C.A0a(PU.A08);
                    return true;
                }
            }
        } else {
            boolean z11 = this.A0E.get();
            String[] strArr = A0G;
            if (strArr[7].length() != strArr[4].length()) {
                String[] strArr2 = A0G;
                strArr2[2] = "IfEmWBIDBUNw5tL7YhS4lNzldGhzw";
                strArr2[0] = "8CoNQoXVMdzgwU1krh95bRLsSKKH4";
                if (!z11) {
                    this.A0B.A07(this);
                    return true;
                }
                zA0O = getAdInfo().A0O();
                if (A0G[5].charAt(17) != 'k') {
                    A0G[1] = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor";
                    return !zA0O ? false : false;
                }
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1202Sn
    public final void A0x() {
        super.A0x();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A9B(this.A0C);
        }
    }

    public final boolean A0y() {
        return getAdInfo().A0O();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public int getCloseButtonStyle() {
        if (this.A07) {
            return 2;
        }
        if (A0y() && !this.A0E.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1202Sn, com.facebook.ads.redexgen.X.AbstractC1072Nn, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
