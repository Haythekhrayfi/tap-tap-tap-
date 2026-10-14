package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Di {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13843d;

    public Di(long j10, long j11, long j12, long j13) {
        this.f13840a = j10;
        this.f13841b = j11;
        this.f13842c = j12;
        this.f13843d = j13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Di.class != obj.getClass()) {
            return false;
        }
        Di di = (Di) obj;
        return this.f13840a == di.f13840a && this.f13841b == di.f13841b && this.f13842c == di.f13842c && this.f13843d == di.f13843d;
    }

    public int hashCode() {
        long j10 = this.f13840a;
        long j11 = this.f13841b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f13842c;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f13843d;
        return i11 + ((int) ((j13 >>> 32) ^ j13));
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("SdkFingerprintingConfig{minCollectingInterval=");
        sbA.append(this.f13840a);
        sbA.append(", minFirstCollectingDelay=");
        sbA.append(this.f13841b);
        sbA.append(", minCollectingDelayAfterLaunch=");
        sbA.append(this.f13842c);
        sbA.append(", minRequestRetryInterval=");
        return o2.a.a(sbA, this.f13843d, '}');
    }
}
