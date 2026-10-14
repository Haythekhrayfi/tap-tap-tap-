package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class IZ {
    public double A00;
    public EnumC0939If A01;
    public EnumC0940Ig A02;
    public String A03;
    public String A04;
    public Map<String, String> A05;
    public boolean A06;

    public final IZ A00(double d10) {
        this.A00 = d10;
        return this;
    }

    public final IZ A01(EnumC0939If enumC0939If) {
        this.A01 = enumC0939If;
        return this;
    }

    public final IZ A02(EnumC0940Ig enumC0940Ig) {
        this.A02 = enumC0940Ig;
        return this;
    }

    public final IZ A03(String str) {
        this.A03 = str;
        return this;
    }

    public final IZ A04(String str) {
        this.A04 = str;
        return this;
    }

    public final IZ A05(Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final IZ A06(boolean z10) {
        this.A06 = z10;
        return this;
    }

    public final C0934Ia A07(C7Q c7q) {
        return new C0934Ia(c7q, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
