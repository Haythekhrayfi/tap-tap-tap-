package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1211Sw extends C2Q {
    public static byte[] A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public final LinearLayout A00;
    public final RelativeLayout A01;
    public final AbstractC1404aD A02;
    public final C1337Xw A03;
    public final InterfaceC0937Id A04;
    public final LG A05;
    public final InterfaceC1019Lm A06;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A05() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A03);
        C1059Na c1059Na = new C1059Na(this.A03);
        AsyncTaskC1212Sx asyncTaskC1212Sx = new AsyncTaskC1212Sx(c1059Na, this.A03);
        int i10 = A0C;
        asyncTaskC1212Sx.A05(i10, i10).A07(this.A02.A0q().A01());
        c1059Na.setFullCircleCorners(true);
        LO.A0M(c1059Na, 0);
        LO.A0K(c1059Na);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        int i11 = A0B;
        layoutParams.setMargins(i11, i11, i11, i11);
        layoutParams.addRule(14);
        relativeLayout.addView(c1059Na, layoutParams);
        TextView textView = new TextView(this.A03);
        LO.A0K(textView);
        textView.setTextColor(this.A02.A0m().A01().A06(true));
        textView.setText(this.A02.A0n().A0E().A06());
        textView.setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(3, c1059Na.getId());
        relativeLayout.addView(textView, layoutParams2);
        LinearLayout linearLayout = new LinearLayout(this.A03);
        LO.A0K(linearLayout);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(i11, 0, i11, i11);
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, textView.getId());
        relativeLayout.addView(linearLayout, layoutParams3);
        C1061Nc c1061Nc = new C1061Nc(this.A03, A0A, 5, A09, -1);
        c1061Nc.setGravity(16);
        linearLayout.addView(c1061Nc, new LinearLayout.LayoutParams(-2, -1));
        TextView textView2 = new TextView(this.A03);
        textView2.setTextColor(this.A02.A0m().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        LO.A0X(textView2, false, 14);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams4.leftMargin = A08;
        linearLayout.addView(textView2, layoutParams4);
        if (TextUtils.isEmpty(this.A02.A0n().A0E().A03())) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            c1061Nc.setRating(Float.parseFloat(this.A02.A0n().A0E().A03()));
            if (this.A02.A0n().A0E().A02() != null) {
                textView2.setText(A03(0, 1, 20) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A02.A0n().A0E().A02())) + A03(1, 1, 41));
            }
        }
        TextView textView3 = new TextView(this.A03);
        textView3.setTextColor(this.A02.A0m().A01().A06(true));
        textView3.setText(this.A02.A0n().A0E().A01());
        textView3.setGravity(17);
        textView3.setPadding(i11, i11, i11, i11);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, linearLayout.getId());
        relativeLayout.addView(textView3, layoutParams5);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 4;
        layoutParams6.weight = 0.8f;
        this.A00.addView(relativeLayout, layoutParams6);
    }

    public static void A06() {
        A07 = new byte[]{110, -124};
    }

    static {
        A06();
        A0B = (int) (C2Q.A08 * 12.0f);
        A0C = (int) (C2Q.A08 * 84.0f);
        A0A = (int) (C2Q.A08 * 14.0f);
        A08 = (int) (C2Q.A08 * 8.0f);
        A09 = C05562b.A01(-1, 77);
    }

    public C1211Sw(C1337Xw c1337Xw, AbstractC1404aD abstractC1404aD, InterfaceC0937Id interfaceC0937Id, InterfaceC1019Lm interfaceC1019Lm) {
        super(c1337Xw);
        LG lg = new LG();
        this.A05 = lg;
        this.A03 = c1337Xw;
        this.A02 = abstractC1404aD;
        this.A04 = interfaceC0937Id;
        this.A06 = interfaceC1019Lm;
        lg.A05();
        setRadius(20.0f);
        setMaxCardElevation(75.0f);
        RelativeLayout relativeLayout = new RelativeLayout(c1337Xw);
        this.A01 = relativeLayout;
        C1066Nh.A00(c1337Xw, relativeLayout, abstractC1404aD.A0n().A0D().A07());
        LinearLayout linearLayout = new LinearLayout(c1337Xw);
        this.A00 = linearLayout;
        linearLayout.setOrientation(1);
        A05();
        A04();
        relativeLayout.addView(linearLayout, new RelativeLayout.LayoutParams(-1, -1));
        addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A04() {
        ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss = new ViewOnClickListenerC1207Ss(this.A03, EnumC1113Pc.A04.A02(), this.A02.A0m().A01(), this.A02.A0n().A0F().A06(), this.A04, this.A06, null, this.A05);
        viewOnClickListenerC1207Ss.setViewShowsOverMedia(true);
        LO.A0G(1001, viewOnClickListenerC1207Ss);
        viewOnClickListenerC1207Ss.setCta(this.A02.A0n().A0F(), this.A02.A0s(), new HashMap(), null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i10 = A0B;
        viewOnClickListenerC1207Ss.setPadding(i10, i10, i10, i10);
        layoutParams.setMargins(i10, i10, i10, i10 * 2);
        this.A00.addView(viewOnClickListenerC1207Ss, layoutParams);
    }
}
