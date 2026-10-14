package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.RewardData;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NY extends FrameLayout {
    public static String[] A07 = {"Lu0oG19N", "JNY", "Ev6F9eDhg42RHlCeRuJfEtiFO07AluFn", "qSbaO4FE34QcNqD1YWxCxyT8wr5s9kWw", "hZddA1hSD7Y", "v9TnLSaOxYneacolptRVdRHaZQ0ab06L", "iyW9tyIIQvF7WQz3LOxNHXxa074IcWbN", "vzh"};
    public AbstractC1018Ll A00;
    public final AbstractC1404aD A01;
    public final C1337Xw A02;
    public final InterfaceC1019Lm A03;
    public final NX A04;
    public final RN A05;
    public final View[] A06;

    public NY(C1076Nr c1076Nr, AbstractC1404aD abstractC1404aD, RN rn, JY jy, NJ nj, InterfaceC1019Lm interfaceC1019Lm, NX nx) {
        this(c1076Nr, abstractC1404aD, rn, interfaceC1019Lm, nx, jy, nj);
    }

    public NY(C1076Nr c1076Nr, AbstractC1404aD abstractC1404aD, RN rn, InterfaceC1019Lm interfaceC1019Lm, NX nx, View... viewArr) {
        this(c1076Nr.A05(), c1076Nr.A08(), abstractC1404aD, rn, interfaceC1019Lm, nx, viewArr);
    }

    public NY(C1337Xw c1337Xw, AbstractC1018Ll abstractC1018Ll, AbstractC1404aD abstractC1404aD, RN rn, InterfaceC1019Lm interfaceC1019Lm, NX nx, View... viewArr) {
        super(c1337Xw);
        this.A02 = c1337Xw;
        this.A00 = abstractC1018Ll;
        this.A01 = abstractC1404aD;
        this.A06 = viewArr;
        this.A03 = interfaceC1019Lm;
        this.A05 = rn;
        this.A04 = nx;
        A03();
    }

    private void A03() {
        String title;
        RewardData rewardDataA0F = this.A01.A0F();
        if (rewardDataA0F == null) {
            title = this.A01.A0p().A05();
        } else {
            title = this.A01.A0p().A06(rewardDataA0F.getCurrency(), rewardDataA0F.getQuantity());
        }
        C1029Lw c1029Lw = new C1029Lw(this.A02, -1, -16777216, title, null, this.A01.A0p().A04(), this.A01.A0p().A03(), LX.A01(LW.REWARD_ICON));
        c1029Lw.A02.setOnClickListener(new NV(this));
        c1029Lw.A01.setOnClickListener(new NW(this));
        addView(c1029Lw, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        RN rn = this.A05;
        if (rn != null) {
            rn.A0a(PU.A07);
        }
        this.A04.AAH();
        if (!this.A01.A0n().A0O()) {
            this.A01.A0v(this.A03);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        RN rn = this.A05;
        if (rn != null && !rn.A0j()) {
            this.A05.A0f(false, false, 11);
            LO.A0N(this.A05, 4);
        }
        AbstractC1018Ll abstractC1018Ll = this.A00;
        String[] strArr = A07;
        if (strArr[7].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A07[0] = "vGH3jzSu";
        if (abstractC1018Ll != null) {
            LO.A0H(abstractC1018Ll);
        }
        for (View view : this.A06) {
            view.clearAnimation();
            LO.A0N(view, 4);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        viewGroup.addView(this, layoutParams);
        this.A04.ABp();
    }
}
