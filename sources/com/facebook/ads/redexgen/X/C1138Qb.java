package com.facebook.ads.redexgen.X;

import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1138Qb {
    public C1142Qf A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C1138Qb A00(C1142Qf c1142Qf) {
        this.A00 = c1142Qf;
        return this;
    }

    public final C1138Qb A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C1138Qb A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C1138Qb A03(boolean z10) {
        this.A04 = z10;
        return this;
    }

    public final C1138Qb A04(boolean z10) {
        this.A03 = z10;
        return this;
    }

    public final C1139Qc A05() {
        return new C1139Qc(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
