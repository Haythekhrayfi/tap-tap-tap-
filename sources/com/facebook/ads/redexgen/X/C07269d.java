package com.facebook.ads.redexgen.X;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C07269d {
    public static final C07269d A04 = new C07269d(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public C07269d(float f10) {
        this(f10, 1.0f, false);
    }

    public C07269d(float f10, float f11, boolean z10) {
        HG.A03(f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        HG.A03(f11 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.A01 = f10;
        this.A00 = f11;
        this.A02 = z10;
        this.A03 = Math.round(1000.0f * f10);
    }

    public final long A00(long j10) {
        return ((long) this.A03) * j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C07269d c07269d = (C07269d) obj;
        return this.A01 == c07269d.A01 && this.A00 == c07269d.A00 && this.A02 == c07269d.A02;
    }

    public final int hashCode() {
        return (((((17 * 31) + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + (this.A02 ? 1 : 0);
    }
}
