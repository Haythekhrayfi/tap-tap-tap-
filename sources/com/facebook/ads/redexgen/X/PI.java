package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PI {
    public ViewOnClickListenerC1207Ss A00;
    public final AnonymousClass19 A01;
    public final C1K A02;
    public final C1O A03;
    public final C1W A04;
    public final C1337Xw A05;
    public final C0945Il A06;
    public static String[] A07 = {"67PC1vS7qkP", "IjFo3BG6VwtzNtFBLMxB3hm7uxcMitzp", "CicRHWg02u8tYTVNboa", "Lc1HqPOOGgkkm0o4iF185HVfJQb2Oy4J", "rfUiy7qGv2cTTJD", "veTQu7RBhk0w6DuY7Y8JViB1PkIKs", "nFnk8VxBkehLa6QhTm5QccOE2IAl", "l0nPd7gOfqjUiTZVoVDHfvPfOU4VPF8e"};
    public static final int A0A = (int) (Kn.A02 * 4.0f);
    public static final int A08 = (int) (Kn.A02 * 72.0f);
    public static final int A09 = (int) (Kn.A02 * 8.0f);

    public PI(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, AbstractC1404aD abstractC1404aD) {
        this.A05 = c1337Xw;
        this.A06 = new C0945Il(abstractC1404aD.A0s(), interfaceC0937Id);
        this.A01 = abstractC1404aD.A0m();
        this.A02 = abstractC1404aD.A0n().A0E();
        this.A04 = abstractC1404aD.A0q();
        this.A03 = abstractC1404aD.A0n().A0G();
    }

    private View A00(ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss) {
        C1065Ng c1065Ng = new C1065Ng(this.A05, this.A01.A01(), true, false, false);
        c1065Ng.A03(this.A02.A06(), this.A02.A01(), null, false, true);
        c1065Ng.setAlignment(17);
        C1059Na c1059Na = new C1059Na(this.A05);
        LO.A0M(c1059Na, 0);
        c1059Na.setRadius(50);
        new AsyncTaskC1212Sx(c1059Na, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i10 = A08;
        linearLayout.addView(c1059Na, new LinearLayout.LayoutParams(i10, i10));
        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(-2, -2);
        int i11 = A09;
        imageParams.setMargins(0, i11, 0, i11);
        linearLayout.addView(c1065Ng, imageParams);
        if (viewOnClickListenerC1207Ss != null) {
            LO.A0J(viewOnClickListenerC1207Ss);
            linearLayout.addView(viewOnClickListenerC1207Ss, imageParams);
            if (TextUtils.isEmpty(viewOnClickListenerC1207Ss.getText())) {
                LO.A0H(viewOnClickListenerC1207Ss);
            }
        }
        return linearLayout;
    }

    private EB A01() {
        EB eb2 = new EB(this.A05);
        eb2.setLayoutManager(new C1364Yy(this.A05, 0, false));
        eb2.setAdapter(new RY(this.A05, this.A03.A01(), A0A, this.A00));
        return eb2;
    }

    private final PH A02() {
        if (!this.A03.A01().isEmpty()) {
            return PH.A04;
        }
        PH ph = PH.A03;
        String[] strArr = A07;
        if (strArr[3].charAt(8) == strArr[7].charAt(8)) {
            throw new RuntimeException();
        }
        A07[4] = "qwlEjiYhEcV8j1J";
        return ph;
    }

    public final Pair<PH, View> A03(ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss) {
        View viewA01;
        this.A00 = viewOnClickListenerC1207Ss;
        PH phA02 = A02();
        switch (PG.A00[phA02.ordinal()]) {
            case 1:
                viewA01 = A01();
                break;
            default:
                ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss2 = this.A00;
                if (A07[4].length() != 15) {
                    throw new RuntimeException();
                }
                String[] strArr = A07;
                strArr[3] = "Oe6IO8Uak3tx5GvHWoKp5mKUb4E2rtDt";
                strArr[7] = "t7tx5cDm578ghKblxCWBuUm65hKnqcQl";
                viewA01 = A00(viewOnClickListenerC1207Ss2);
                break;
        }
        C0947In.A04(viewA01, this.A06, EnumC0944Ik.A0S);
        return new Pair<>(phA02, viewA01);
    }
}
