package com.facebook.ads.redexgen.X;

import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import java.util.EnumSet;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EN extends AbstractC1373Zi {
    public static String[] A02 = {"Wdifh5HSN4RyvogFUrIVqQJQULlKdEei", "S34yOHPbjBOZXrhEKXqsFwPvtnd1qciy", "vu9eRI", "x0OqZ", "VYF0eZRg0jpnLcLhIoRoBnoO3djZf6SI", "33GTCt01Ki3rQT8tpwoWMPFpMqFvVQrj", "pa13jV0ykdfTm6Oo414mEZE7qu5xzGka", "tj8XsVszyFe6dIsjKXzcwTwgC3z6jHVp"};
    public static final AnonymousClass22 A03 = new ZX();
    public C1368Zc A00;
    public final AnonymousClass21 A01;

    public EN(AnonymousClass21 anonymousClass21) {
        super(anonymousClass21.A05(), A03.A4c(anonymousClass21));
        this.A01 = anonymousClass21;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1373Zi
    public final void A05() {
        C1368Zc c1368Zc = this.A00;
        if (c1368Zc != null) {
            c1368Zc.A0F();
        }
        InterfaceC05511w interfaceC05511w = super.A00;
        EnumC05501v enumC05501v = EnumC05501v.A04;
        if (A02[1].charAt(8) == 'f') {
            throw new RuntimeException();
        }
        A02[4] = "bjBCaQy28rNQq0pISHtZZouKJ3cbndZJ";
        interfaceC05511w.AF1(enumC05501v);
    }

    public final C1368Zc A07() {
        return this.A00;
    }

    public final void A08() {
        C1368Zc c1368Zc = new C1368Zc(this.A01, this, this.A02);
        this.A00 = c1368Zc;
        c1368Zc.A0I(this.A01.A0A(), this.A01.A06());
    }

    public final void A09(InterstitialAd interstitialAd, EnumSet<CacheFlag> cacheFlags, String str) {
        if (super.A00.A5X()) {
            return;
        }
        this.A01.A0C(interstitialAd);
        C1368Zc c1368Zc = this.A00;
        if (c1368Zc != null) {
            c1368Zc.A0I(cacheFlags, str);
            return;
        }
        this.A01.A0J(cacheFlags);
        this.A01.A0G(str);
        A08();
    }

    public final boolean A0A() {
        C1368Zc c1368Zc = this.A00;
        if (c1368Zc != null) {
            return c1368Zc.A0J();
        }
        if (this.A01.A00() > 0) {
            long jA00 = LF.A00();
            long jA01 = this.A01.A00();
            if (A02[0].charAt(6) == 'y') {
                throw new RuntimeException();
            }
            A02[4] = "spPOKGUnJm6foAMMjUQWH3rPbfiGZlB3";
            if (jA00 > jA01) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0B() {
        C1368Zc c1368Zc = this.A00;
        if (c1368Zc != null) {
            return c1368Zc.A0K();
        }
        return super.A00.A5q() == EnumC05501v.A06;
    }

    public final boolean A0C(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A5Y()) {
            return false;
        }
        this.A01.A0C(interstitialAd);
        C1368Zc c1368Zc = this.A00;
        if (c1368Zc != null) {
            return c1368Zc.A0L();
        }
        C1368Zc c1368Zc2 = new C1368Zc(this.A01, this, this.A02);
        this.A00 = c1368Zc2;
        c1368Zc2.A0L();
        return false;
    }
}
