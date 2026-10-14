package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class NJ extends LinearLayout {
    public static byte[] A06;
    public static String[] A07 = {"cmzsI0MqV", "rmZj6bXGr2Mc3k6GGfUNTI8ab", "Oqa2BQOYUIgPEQnUKqUaSgjmS1hAy2aw", "VbR8t651F3u5xAC0yd", "KwIIB1PdAD0xOvkamO3Meu", "6KEr", "QBka00Gf2XeExLF7IYa6e3", ""};
    public static final LinearLayout.LayoutParams A08;
    public final int A00;
    public final View.OnClickListener A01;
    public final RelativeLayout A02;
    public final C1337Xw A03;
    public final ViewOnClickListenerC1207Ss A04;
    public final C1059Na A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {9, 12, 12, 13, Ascii.FS, 9, 17, 20, Ascii.ESC};
        if (A07[1].length() != 25) {
            throw new RuntimeException();
        }
        A07[2] = "W8PIFEgMaUlhByfzvyeLgAFdtcDk8ZOz";
        A06 = bArr;
    }

    public abstract void A0C(int i10);

    static {
        A01();
        A08 = new LinearLayout.LayoutParams(-2, -2);
    }

    public NJ(C1337Xw c1337Xw, int i10, C1M c1m, boolean z10, String str, InterfaceC0937Id interfaceC0937Id, InterfaceC1019Lm interfaceC1019Lm, QR qr, LG lg) {
        super(c1337Xw);
        LO.A0K(this);
        this.A03 = c1337Xw;
        this.A00 = i10;
        C1059Na c1059Na = new C1059Na(c1337Xw);
        this.A05 = c1059Na;
        LO.A0M(c1059Na, 0);
        LO.A0K(c1059Na);
        ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss = new ViewOnClickListenerC1207Ss(c1337Xw, str, c1m, z10, interfaceC0937Id, interfaceC1019Lm, qr, lg);
        this.A04 = viewOnClickListenerC1207Ss;
        LO.A0G(1001, viewOnClickListenerC1207Ss);
        this.A01 = C1070Nl.A03(viewOnClickListenerC1207Ss, A00(0, 9, 119));
        RelativeLayout relativeLayout = new RelativeLayout(c1337Xw);
        this.A02 = relativeLayout;
        relativeLayout.setLayoutParams(A08);
        LO.A0K(relativeLayout);
    }

    public void A09() {
    }

    public void A0A() {
    }

    public void A0B() {
        this.A05.setOnClickListener(this.A01);
    }

    public final ViewOnClickListenerC1207Ss getCTAButton() {
        return this.A04;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A05;
    }

    public void setInfo(C1K c1k, C1N c1n, String str, String str2, NN nn) {
        this.A04.setCta(c1n, str, new HashMap(), nn);
        AsyncTaskC1212Sx asyncTaskC1212Sx = new AsyncTaskC1212Sx(this.A05, this.A03);
        int i10 = this.A00;
        asyncTaskC1212Sx.A05(i10, i10).A07(str2);
    }

    public void setTitleMaxLines(int i10) {
    }
}
