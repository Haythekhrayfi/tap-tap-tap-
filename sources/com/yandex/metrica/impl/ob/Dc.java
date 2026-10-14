package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13809b;

    public Dc(long j10, long j11) {
        this.f13808a = j10;
        this.f13809b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Dc.class != obj.getClass()) {
            return false;
        }
        Dc dc2 = (Dc) obj;
        return this.f13808a == dc2.f13808a && this.f13809b == dc2.f13809b;
    }

    public int hashCode() {
        long j10 = this.f13808a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f13809b;
        return i10 + ((int) ((j11 >>> 32) ^ j11));
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ForcedCollectingArguments{durationSeconds=");
        sbA.append(this.f13808a);
        sbA.append(", intervalSeconds=");
        return o2.a.a(sbA, this.f13809b, '}');
    }
}
