package com.facebook.ads.redexgen.X;

import java.io.Serializable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2D, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2D implements Serializable {
    public C2C A00;
    public C2C A01;

    public C2D() {
        this(0.5d, 0.5d);
    }

    public C2D(double d10) {
        this(d10, 0.5d);
    }

    public C2D(double d10, double d11) {
        this.A00 = new C2C(d10);
        this.A01 = new C2C(d11);
        A02();
    }

    public final C2C A00() {
        return this.A00;
    }

    public final C2C A01() {
        return this.A01;
    }

    public final void A02() {
        this.A00.A06();
        this.A01.A06();
    }

    public final void A03() {
        this.A00.A07();
        this.A01.A07();
    }

    public final void A04(double d10, double d11) {
        this.A00.A08(d10, d11);
    }

    public final void A05(double d10, double d11) {
        this.A01.A08(d10, d11);
    }
}
