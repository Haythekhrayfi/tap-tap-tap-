package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class A0 {
    public final int A00;
    public final EU A01;

    public A0(int i10, EU eu) {
        this.A00 = i10;
        this.A01 = eu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        A0 a10 = (A0) obj;
        return this.A00 == a10.A00 && this.A01.equals(a10.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }
}
