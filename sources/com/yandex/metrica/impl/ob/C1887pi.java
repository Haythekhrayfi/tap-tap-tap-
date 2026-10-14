package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1887pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17142d;

    public C1887pi(long j10, long j11, long j12, long j13) {
        this.f17139a = j10;
        this.f17140b = j11;
        this.f17141c = j12;
        this.f17142d = j13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1887pi.class != obj.getClass()) {
            return false;
        }
        C1887pi c1887pi = (C1887pi) obj;
        return this.f17139a == c1887pi.f17139a && this.f17140b == c1887pi.f17140b && this.f17141c == c1887pi.f17141c && this.f17142d == c1887pi.f17142d;
    }

    public int hashCode() {
        long j10 = this.f17139a;
        long j11 = this.f17140b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f17141c;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f17142d;
        return i11 + ((int) ((j13 >>> 32) ^ j13));
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("CacheControl{cellsAroundTtl=");
        sbA.append(this.f17139a);
        sbA.append(", wifiNetworksTtl=");
        sbA.append(this.f17140b);
        sbA.append(", lastKnownLocationTtl=");
        sbA.append(this.f17141c);
        sbA.append(", netInterfacesTtl=");
        return o2.a.a(sbA, this.f17142d, '}');
    }
}
