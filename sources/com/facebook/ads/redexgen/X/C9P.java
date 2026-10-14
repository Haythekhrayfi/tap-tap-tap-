package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9P implements Comparable<C9P> {
    public int A00;
    public long A01;
    public Object A02;
    public final C07379o A03;

    public C9P(C07379o c07379o) {
        this.A03 = c07379o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C9P c9p) {
        Object obj = this.A02;
        if ((obj == null) != (c9p.A02 == null)) {
            return obj != null ? -1 : 1;
        }
        if (obj == null) {
            return 0;
        }
        int i10 = this.A00 - c9p.A00;
        if (i10 != 0) {
            return i10;
        }
        int comparePeriodIndex = C0930Hv.A07(this.A01, c9p.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i10, long j10, Object obj) {
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = obj;
    }
}
