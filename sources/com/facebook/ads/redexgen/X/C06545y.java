package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C06545y {
    public final long A00;
    public final EnumC06535x A01;
    public final String A02;
    public final boolean A03;

    public C06545y(String str, boolean z10, EnumC06535x enumC06535x) {
        this(str, z10, enumC06535x, System.currentTimeMillis());
    }

    public C06545y(String str, boolean z10, EnumC06535x enumC06535x, long j10) {
        this.A02 = str;
        this.A03 = z10;
        this.A01 = enumC06535x;
        this.A00 = j10;
    }

    public static C06545y A00() {
        return new C06545y("", true, EnumC06535x.A06, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC06535x A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
