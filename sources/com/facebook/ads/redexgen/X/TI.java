package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TI extends RelativeLayout implements InterfaceC1020Ln {
    public static byte[] A0Z;
    public static String[] A0a = {"57rzzR6raHrat8cHk0n2c9utIvWN6OL8", "vZo4DQACnHxpUIABCEPhLIrXR", "3pKkUgRnbq5D8", "3oPHUcYdGBLGT6sjvwgTS6nCZs8dHXKK", "yMOWmEDq6oq3Yf8aoY", "BRjJ0geTmUVj6Aeo1VqVThKYcHpwhF7A", "bCnfD5Zsza6fNT9UI62TNCVdI9Gt63Qd", "0XbQU4AacrxlEwxF12eBigHvJ8"};
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public static final int A0i;
    public static final int A0j;
    public static final RelativeLayout.LayoutParams A0k;
    public View A00;
    public RelativeLayout A01;
    public RelativeLayout A02;
    public Toast A03;
    public C5H A04;
    public C0990Kh A05;
    public ViewOnClickListenerC1207Ss A06;
    public PD A07;
    public PK A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final AbstractC1404aD A0G;
    public final C1Y A0H;
    public final C5F A0I;
    public final C1337Xw A0J;
    public final InterfaceC0937Id A0K;
    public final C0945Il A0L;
    public final C0990Kh A0M;
    public final LB A0N;
    public final InterfaceC1019Lm A0O;
    public final MF A0P;
    public final NX A0Q;
    public final NY A0R;
    public final PI A0S;
    public final AtomicBoolean A0T;
    public final AtomicBoolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final AbstractC1018Ll A0Y;

    public static String A0E(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Z, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A0Z = new byte[]{-110, -97, -94, -70, -84, -86, -70, -92, 4, 13, 10, 4, 12, 0, 16, 19, 10, 8, 10, 15, -77, -68, -71, -77, -69, -81, -61, -65, -59, -62, -77, -75, -11, -6, 0, -15, -2, -1, 0, -11, 0, -11, -19, -8, -55, -68, -49, -60, -47, -64, -70, -66, -57, -60, -66, -58, -43, -47, -58, -56, -54, -46, -54, -45, -39, -65, -78, -60, -82, -65, -79, -78, -79, -84, -61, -74, -79, -78, -68, -80, -98, -101, -81, -94, -98, -80, -104, -100, -91, -94, -100, -92};
    }

    static {
        A0P();
        A0i = (int) (Kn.A02 * 64.0f);
        A0d = (int) (Kn.A02 * 16.0f);
        A0j = (int) (Kn.A02 * 12.0f);
        A0b = (int) (Kn.A02 * 10.0f);
        A0k = new RelativeLayout.LayoutParams(-1, -1);
        A0e = (int) (Kn.A02 * 48.0f);
        A0f = (int) (Kn.A02 * 16.0f);
        A0h = (int) (Kn.A02 * 14.0f);
        A0g = C05562b.A01(-1, 77);
        A0c = (int) (Kn.A02 * 8.0f);
    }

    public TI(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, InterfaceC1019Lm interfaceC1019Lm, AbstractC1404aD abstractC1404aD, String str, MF mf) {
        int iA07;
        super(c1337Xw);
        this.A0I = new TQ(this);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.A0U = atomicBoolean;
        this.A0T = new AtomicBoolean(false);
        this.A0D = false;
        this.A0F = true;
        this.A0B = false;
        this.A09 = false;
        this.A0J = c1337Xw;
        this.A0O = interfaceC1019Lm;
        this.A0K = interfaceC0937Id;
        this.A0G = abstractC1404aD;
        C1Y c1yA06 = abstractC1404aD.A0n().A0D().A06();
        this.A0H = c1yA06;
        this.A0L = new C0945Il(abstractC1404aD.A0s(), interfaceC0937Id);
        this.A0P = mf;
        this.A08 = new PK(c1337Xw, mf, str, interfaceC1019Lm);
        this.A0C = abstractC1404aD.A0n().A0M() && abstractC1404aD.A0n().A0D().A02() > 0;
        boolean zA0A = abstractC1404aD.A0n().A0D().A0A();
        this.A0X = zA0A;
        if (c1yA06 == null) {
            interfaceC1019Lm.A3y(mf.A6q());
            interfaceC1019Lm.A3y(mf.A6m());
        }
        if (this.A0C && zA0A) {
            iA07 = abstractC1404aD.A0n().A0D().A02();
        } else {
            iA07 = c1yA06.A07();
        }
        atomicBoolean.set(!c1yA06.A0I());
        TQ tq = null;
        this.A0M = new C0990Kh(iA07, new TK(this, tq));
        boolean zA2I = IN.A2I(c1337Xw);
        this.A0W = zA2I;
        this.A0V = IN.A0l(c1337Xw);
        FullScreenAdToolbar fullScreenAdToolbarA07 = A07();
        this.A0Y = fullScreenAdToolbarA07;
        this.A0S = new PI(c1337Xw, interfaceC0937Id, abstractC1404aD);
        if (!zA2I) {
            LO.A0M(this, -14473425);
        } else {
            C1066Nh.A00(c1337Xw, this, abstractC1404aD.A0n().A0D().A07());
        }
        LB lb2 = new LB(this);
        this.A0N = lb2;
        lb2.A05(LA.A03);
        if (IN.A1l(c1337Xw)) {
            fullScreenAdToolbarA07.setProgressSpinnerInvisible(true);
        }
        HashMap map = new HashMap();
        map.put(A0E(56, 9, 61), mf.A7W());
        this.A07 = new PD(c1337Xw, abstractC1404aD, c1yA06, interfaceC0937Id, new TJ(this, tq), map);
        A0L();
        interfaceC1019Lm.A3P(this, new RelativeLayout.LayoutParams(-1, -1));
        A0I();
        TP tp = new TP(this);
        this.A0Q = tp;
        this.A0R = new NY(c1337Xw, fullScreenAdToolbarA07, abstractC1404aD, (RN) null, interfaceC1019Lm, tp, this.A06, this.A01, this.A07);
    }

    private FullScreenAdToolbar A07() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0J, this.A0O, this.A0L, 0, this.A0G.A0h());
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.A06(this.A0G.A0m().A01(), ViewOnClickListenerC1207Ss.A08(this.A0G));
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A0G.A0q(), this.A0G.A0s(), this.A0H.A07(), this.A0G.A0r());
        fullScreenAdToolbar.setToolbarListener(new TM(this));
        return fullScreenAdToolbar;
    }

    private ViewOnClickListenerC1207Ss A09() {
        PD pd2 = this.A07;
        if (pd2 == null || pd2.getViewabilityChecker() == null || this.A07.getTouchDataRecorder() == null) {
            return null;
        }
        ViewOnClickListenerC1207Ss button = new ViewOnClickListenerC1207Ss(this.A0J, this.A0P.A6L(), this.A0G.A0m().A01(), this.A0K, this.A0O, this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder());
        LO.A0K(button);
        button.setText(this.A0G.A0n().A0F().A04());
        button.setTextSize(14.0f);
        button.setIncludeFontPadding(false);
        int i10 = A0b;
        button.setPadding(i10, i10, i10, i10);
        if (!this.A0W) {
            LO.A0N(button, 8);
        }
        button.setOnClickListener(new ViewOnClickListenerC1031Ly(this));
        return button;
    }

    private C1065Ng A0C() {
        C1065Ng c1065Ng = new C1065Ng(this.A0J, this.A0G.A0m().A01(), true, 16, 14, 0);
        c1065Ng.A03(this.A0G.A0n().A0E().A06(), this.A0G.A0n().A0E().A05(), null, false, true);
        TextView descriptionTv = c1065Ng.getDescriptionTextView();
        descriptionTv.setAlpha(0.8f);
        descriptionTv.setMaxLines(1);
        descriptionTv.setEllipsize(TextUtils.TruncateAt.END);
        TextView descriptionTv2 = c1065Ng.getTitleTextView();
        descriptionTv2.setMaxLines(1);
        descriptionTv2.setEllipsize(TextUtils.TruncateAt.END);
        return c1065Ng;
    }

    private void A0H() {
        int i10 = A0e;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        C1059Na c1059Na = new C1059Na(this.A0J);
        LO.A0M(c1059Na, 0);
        LO.A0K(c1059Na);
        new AsyncTaskC1212Sx(c1059Na, this.A0J).A05(i10, i10).A07(this.A0G.A0q().A01());
        TextView textView = new TextView(this.A0J);
        LO.A0K(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(this.A0G.A0m().A01().A06(true));
        textView.setText(this.A0G.A0n().A0E().A06());
        textView.setTextSize(16.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        C1061Nc c1061Nc = new C1061Nc(this.A0J, A0h, 5, A0g, -1);
        c1061Nc.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A0J);
        textView2.setTextColor(this.A0G.A0m().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        LinearLayout.LayoutParams starRatingContainerParams = new LinearLayout.LayoutParams(-2, -1);
        int i11 = A0c;
        starRatingContainerParams.leftMargin = i11;
        LinearLayout linearLayout = new LinearLayout(this.A0J);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, A0f);
        layoutParams3.topMargin = i11 / 2;
        layoutParams3.addRule(3, textView.getId());
        linearLayout.addView(c1061Nc, layoutParams2);
        linearLayout.addView(textView2, starRatingContainerParams);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = i11;
        layoutParams4.addRule(1, c1059Na.getId());
        layoutParams4.addRule(15);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams3);
        relativeLayout.addView(textView);
        RelativeLayout relativeLayout2 = this.A02;
        if (relativeLayout2 != null) {
            relativeLayout2.removeAllViews();
            RelativeLayout relativeLayout3 = this.A02;
            if (A0a[4].length() != 18) {
                throw new RuntimeException();
            }
            A0a[4] = "bsFsSO04IJ4eZVQxRT";
            relativeLayout3.addView(relativeLayout, layoutParams4);
            this.A02.addView(c1059Na, layoutParams);
        }
        if (TextUtils.isEmpty(this.A0G.A0n().A0E().A03())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        c1061Nc.setRating(Float.parseFloat(this.A0G.A0n().A0E().A03()));
        if (this.A0G.A0n().A0E().A02() == null) {
            return;
        }
        textView2.setText(A0E(0, 1, 66) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A0G.A0n().A0E().A02())) + A0E(1, 1, 78));
    }

    private void A0I() {
        if (this.A0H.A0I()) {
            A0K();
        } else {
            A0N();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0N.A05(LA.A04);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J() {
        this.A0E = true;
        if (this.A0G.A0n().A0M()) {
            this.A08.A05();
            this.A0O.A3z(this.A0P.A5n(), new AnonymousClass73(0, 0));
            if (this.A0A) {
                boolean z10 = this.A0W;
                if (A0a[4].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A0a;
                strArr[1] = "I0JtICznoezMzS0InHXj65Cim";
                strArr[2] = "YxqOCBuXvZfwM";
                if (!z10) {
                    NO.A03(this.A0J, this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0K, this.A0G.A0n().A0F(), this.A0G.A0s());
                }
            }
        }
    }

    private void A0K() {
        C1104Ot c1104OtA0B = new C1102Or(this.A0J, this.A0G.A0n().A0E(), this.A0G.A0q()).A08(this.A0G.A0m().A01()).A0A(this.A0H.A0G()).A09(this.A0H.A0D()).A07(2000).A0B();
        C0947In.A04(c1104OtA0B, this.A0L, EnumC0944Ik.A0V);
        addView(c1104OtA0B, A0k);
        c1104OtA0B.A04(new TO(this));
    }

    private void A0L() {
        this.A06 = A09();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.A01 = relativeLayout;
        LO.A0K(relativeLayout);
        RelativeLayout.LayoutParams iconAndMetaDataContainerParams = new RelativeLayout.LayoutParams(-2, -2);
        int i10 = A0d;
        int i11 = A0j;
        iconAndMetaDataContainerParams.setMargins(i10, i11, i10, i11);
        iconAndMetaDataContainerParams.addRule(12);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        this.A02 = relativeLayout2;
        LO.A0K(relativeLayout2);
        if (this.A0V) {
            A0H();
        } else {
            RelativeLayout relativeLayout3 = this.A02;
            C1065Ng c1065NgA0C = A0C();
            RelativeLayout.LayoutParams appMetadataLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout3.addView(c1065NgA0C, appMetadataLayoutParams);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, i10, 0);
        this.A01.addView(this.A02, layoutParams);
        ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss = this.A06;
        if (viewOnClickListenerC1207Ss != null) {
            layoutParams.addRule(0, viewOnClickListenerC1207Ss.getId());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(11);
            layoutParams2.addRule(6, this.A02.getId());
            layoutParams2.addRule(8, this.A02.getId());
            this.A01.addView(this.A06, layoutParams2);
        }
        LO.A0K(this.A0Y);
        RelativeLayout.LayoutParams adWebViewParams = new RelativeLayout.LayoutParams(-1, -2);
        adWebViewParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.setMargins(i10, 0, i10, 0);
        layoutParams3.addRule(3, this.A0Y.getId());
        layoutParams3.addRule(2, this.A01.getId());
        this.A0Y.setVisibility(4);
        this.A07.setVisibility(4);
        this.A01.setVisibility(4);
        addView(this.A0Y, adWebViewParams);
        addView(this.A07, layoutParams3);
        addView(this.A01, iconAndMetaDataContainerParams);
        if (this.A0H.A0J()) {
            this.A07.A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M() {
        new C0945Il(this.A0G.A0s(), this.A0K).A04(EnumC0944Ik.A0v, null);
        this.A0T.set(true);
        LO.A0T(this);
        LO.A0H(this.A07);
        LO.A0Z(this.A0R, this.A00, this.A07);
        LO.A0L(this.A0Y);
        LO.A0L(this.A06);
        Pair<PH, View> pairA03 = this.A0S.A03(this.A06);
        this.A00 = (View) pairA03.second;
        switch (C1032Lz.A00[((PH) pairA03.first).ordinal()]) {
            case 1:
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, this.A0Y.getToolbarHeight(), 0, 0);
                LO.A0L(this.A01);
                RelativeLayout relativeLayout = this.A01;
                if (relativeLayout != null) {
                    int id2 = relativeLayout.getId();
                    if (A0a[5].charAt(2) == 'm') {
                        throw new RuntimeException();
                    }
                    A0a[0] = "6k4i0rLafWNu6HrnPvo1bAEbeaagXJGg";
                    layoutParams.addRule(2, id2);
                }
                addView(this.A00, layoutParams);
                return;
            case 2:
                RelativeLayout relativeLayout2 = this.A01;
                if (relativeLayout2 != null) {
                    LO.A0Z(relativeLayout2);
                }
                addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        LO.A0T(this);
        if (!this.A0H.A0J()) {
            PD pd2 = this.A07;
            if (A0a[4].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[1] = "xj34PAIXy0BC0JvFurkBkOtWc";
            strArr[2] = "hWQrQPNffHRqy";
            pd2.A0B();
        }
        this.A0Y.setVisibility(0);
        this.A07.setVisibility(0);
        RelativeLayout relativeLayout = this.A01;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        if (this.A06 != null && this.A0G.A0k() > 0 && this.A05 == null) {
            C0990Kh c0990Kh = new C0990Kh(this.A0G.A0k(), new TN(this));
            this.A05 = c0990Kh;
            c0990Kh.A08();
        }
        this.A0M.A08();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O() {
        Toast toast = this.A03;
        if (toast != null && toast.getView().getWindowVisibility() == 0) {
            return;
        }
        this.A03 = Toast.makeText(getContext(), this.A0H.A0C(), 1);
        A0Q((int) this.A0M.A04());
        this.A03.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(int i10) {
        String strValueOf = String.valueOf(i10);
        Toast toast = this.A03;
        String strA0C = this.A0H.A0C();
        String progress = A0E(2, 6, 31);
        LO.A0Y(toast, strA0C.replace(progress, strValueOf), 49, 0, A0i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(boolean z10, String str) {
        this.A0B = true;
        HashMap map = new HashMap();
        map.put(A0E(8, 12, 121), z10 ? A0E(79, 13, 17) : A0E(44, 12, 51));
        map.put(A0E(20, 12, 40), str);
        NO no = new NO(this.A0J, this.A0P.A6L(), this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0K, this.A0O);
        if (!this.A0W) {
            boolean z11 = !this.A0M.A05();
            no.A0A(!z11);
            no.A08(this.A0G.A0s(), this.A0G.A0n().A0F().A05(), map);
            if (z11) {
                new Handler(Looper.getMainLooper()).post(new TL(this));
            }
            this.A0A = true;
            return;
        }
        no.A08(this.A0G.A0s(), this.A0G.A0n().A0F().A05(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0Y() {
        if (!this.A0G.A0K().equals(A0E(65, 14, 37))) {
            if (this.A0G.A0K().equals(A0E(32, 12, 100))) {
                AbstractC1404aD abstractC1404aD = this.A0G;
                if (A0a[4].length() != 18) {
                    throw new RuntimeException();
                }
                A0a[0] = "r5y7OBqhAYVA47bIfl4AlIWKO2XfiX80";
                if (abstractC1404aD.A0n().A0O()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0Z() {
        return this.A0X && !this.A0D && !this.A0F && this.A0H.A07() < this.A0G.A0n().A0D().A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void A9A(Intent intent, Bundle bundle, C5H c5h) {
        this.A04 = c5h;
        c5h.A0N(this.A0I);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AC8(boolean z10) {
        this.A0M.A07();
        this.A09 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void ACY(boolean z10) {
        if (this.A0X && this.A0F) {
            return;
        }
        boolean z11 = this.A0D;
        if (A0a[5].charAt(2) == 'm') {
            throw new RuntimeException();
        }
        A0a[0] = "UQp6GtSKm4mkcrS1rXAjxFqYQJcA6U4M";
        if (!z11 && this.A0U.get() && !this.A0M.A06()) {
            this.A0M.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AEi(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public String getCurrentClientToken() {
        return this.A0G.A0s();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void onDestroy() {
        this.A0N.A03();
        C5H c5h = this.A04;
        if (c5h != null) {
            c5h.A0O(this.A0I);
        }
        if (this.A07 != null) {
            AbstractC1404aD abstractC1404aD = this.A0G;
            if (A0a[0].charAt(29) == 'D') {
                throw new RuntimeException();
            }
            A0a[0] = "voPpcOtL9PQSCLq1wYvqOCQr8JaLbGKq";
            if (!TextUtils.isEmpty(abstractC1404aD.A0s())) {
                this.A0K.A9H(this.A0G.A0s(), new ND().A03(this.A07.getViewabilityChecker()).A02(this.A07.getTouchDataRecorder()).A05());
            }
            this.A07.A0C();
        }
        this.A0M.A07();
        this.A0Y.setToolbarListener(null);
        this.A03 = null;
        this.A04 = null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            ACY(false);
        } else {
            AC8(false);
        }
    }

    public void setListener(InterfaceC1019Lm interfaceC1019Lm) {
    }

    public void setServerSideRewardHandler(PK pk) {
        this.A08 = pk;
    }
}
