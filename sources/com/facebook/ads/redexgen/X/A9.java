package com.facebook.ads.redexgen.X;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class A9 {
    public static final A9 A04 = new A8().A00();
    public AudioAttributes A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public A9(int i10, int i11, int i12) {
        this.A01 = i10;
        this.A02 = i11;
        this.A03 = i12;
    }

    public final AudioAttributes A00() {
        if (this.A00 == null) {
            this.A00 = new AudioAttributes.Builder().setContentType(this.A01).setFlags(this.A02).setUsage(this.A03).build();
        }
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        A9 a10 = (A9) obj;
        return this.A01 == a10.A01 && this.A02 == a10.A02 && this.A03 == a10.A03;
    }

    public final int hashCode() {
        int result = this.A01;
        int result2 = ((((17 * 31) + result) * 31) + this.A02) * 31;
        int result3 = this.A03;
        return result2 + result3;
    }
}
