package com.yandex.metrica.impl.ob;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class Uc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f15144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f15145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f15146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f15147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f15148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Ec f15149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Ec f15150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Ec f15151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Ec f15152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Jc f15153q;

    public Uc(long j10, float f10, int i10, int i11, long j11, int i12, boolean z10, long j12, boolean z11, boolean z12, boolean z13, boolean z14, Ec ec2, Ec ec3, Ec ec4, Ec ec5, Jc jc2) {
        this.f15137a = j10;
        this.f15138b = f10;
        this.f15139c = i10;
        this.f15140d = i11;
        this.f15141e = j11;
        this.f15142f = i12;
        this.f15143g = z10;
        this.f15144h = j12;
        this.f15145i = z11;
        this.f15146j = z12;
        this.f15147k = z13;
        this.f15148l = z14;
        this.f15149m = ec2;
        this.f15150n = ec3;
        this.f15151o = ec4;
        this.f15152p = ec5;
        this.f15153q = jc2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Uc.class != obj.getClass()) {
            return false;
        }
        Uc uc2 = (Uc) obj;
        if (this.f15137a != uc2.f15137a || Float.compare(uc2.f15138b, this.f15138b) != 0 || this.f15139c != uc2.f15139c || this.f15140d != uc2.f15140d || this.f15141e != uc2.f15141e || this.f15142f != uc2.f15142f || this.f15143g != uc2.f15143g || this.f15144h != uc2.f15144h || this.f15145i != uc2.f15145i || this.f15146j != uc2.f15146j || this.f15147k != uc2.f15147k || this.f15148l != uc2.f15148l) {
            return false;
        }
        Ec ec2 = this.f15149m;
        if (ec2 == null ? uc2.f15149m != null : !ec2.equals(uc2.f15149m)) {
            return false;
        }
        Ec ec3 = this.f15150n;
        if (ec3 == null ? uc2.f15150n != null : !ec3.equals(uc2.f15150n)) {
            return false;
        }
        Ec ec4 = this.f15151o;
        if (ec4 == null ? uc2.f15151o != null : !ec4.equals(uc2.f15151o)) {
            return false;
        }
        Ec ec5 = this.f15152p;
        if (ec5 == null ? uc2.f15152p != null : !ec5.equals(uc2.f15152p)) {
            return false;
        }
        Jc jc2 = this.f15153q;
        Jc jc3 = uc2.f15153q;
        if (jc2 != null) {
            return jc2.equals(jc3);
        }
        return jc3 == null;
    }

    public int hashCode() {
        long j10 = this.f15137a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        float f10 = this.f15138b;
        int iFloatToIntBits = (((((i10 + (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? Float.floatToIntBits(f10) : 0)) * 31) + this.f15139c) * 31) + this.f15140d) * 31;
        long j11 = this.f15141e;
        int i11 = (((((iFloatToIntBits + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f15142f) * 31) + (this.f15143g ? 1 : 0)) * 31;
        long j12 = this.f15144h;
        int i12 = (((((((((i11 + ((int) ((j12 >>> 32) ^ j12))) * 31) + (this.f15145i ? 1 : 0)) * 31) + (this.f15146j ? 1 : 0)) * 31) + (this.f15147k ? 1 : 0)) * 31) + (this.f15148l ? 1 : 0)) * 31;
        Ec ec2 = this.f15149m;
        int iHashCode = (i12 + (ec2 != null ? ec2.hashCode() : 0)) * 31;
        Ec ec3 = this.f15150n;
        int iHashCode2 = (iHashCode + (ec3 != null ? ec3.hashCode() : 0)) * 31;
        Ec ec4 = this.f15151o;
        int iHashCode3 = (iHashCode2 + (ec4 != null ? ec4.hashCode() : 0)) * 31;
        Ec ec5 = this.f15152p;
        int iHashCode4 = (iHashCode3 + (ec5 != null ? ec5.hashCode() : 0)) * 31;
        Jc jc2 = this.f15153q;
        return iHashCode4 + (jc2 != null ? jc2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("LocationArguments{updateTimeInterval=");
        sbA.append(this.f15137a);
        sbA.append(", updateDistanceInterval=");
        sbA.append(this.f15138b);
        sbA.append(", recordsCountToForceFlush=");
        sbA.append(this.f15139c);
        sbA.append(", maxBatchSize=");
        sbA.append(this.f15140d);
        sbA.append(", maxAgeToForceFlush=");
        sbA.append(this.f15141e);
        sbA.append(", maxRecordsToStoreLocally=");
        sbA.append(this.f15142f);
        sbA.append(", collectionEnabled=");
        sbA.append(this.f15143g);
        sbA.append(", lbsUpdateTimeInterval=");
        sbA.append(this.f15144h);
        sbA.append(", lbsCollectionEnabled=");
        sbA.append(this.f15145i);
        sbA.append(", passiveCollectionEnabled=");
        sbA.append(this.f15146j);
        sbA.append(", allCellsCollectingEnabled=");
        sbA.append(this.f15147k);
        sbA.append(", connectedCellCollectingEnabled=");
        sbA.append(this.f15148l);
        sbA.append(", wifiAccessConfig=");
        sbA.append(this.f15149m);
        sbA.append(", lbsAccessConfig=");
        sbA.append(this.f15150n);
        sbA.append(", gpsAccessConfig=");
        sbA.append(this.f15151o);
        sbA.append(", passiveAccessConfig=");
        sbA.append(this.f15152p);
        sbA.append(", gplConfig=");
        sbA.append(this.f15153q);
        sbA.append('}');
        return sbA.toString();
    }
}
