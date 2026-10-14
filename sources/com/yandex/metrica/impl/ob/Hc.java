package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.yandex.metrica.gpllibrary.a.b f14143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14145c;

    public Hc(com.yandex.metrica.gpllibrary.a.b bVar, long j10, long j11) {
        this.f14143a = bVar;
        this.f14144b = j10;
        this.f14145c = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Hc.class != obj.getClass()) {
            return false;
        }
        Hc hc2 = (Hc) obj;
        return this.f14144b == hc2.f14144b && this.f14145c == hc2.f14145c && this.f14143a == hc2.f14143a;
    }

    public int hashCode() {
        int iHashCode = this.f14143a.hashCode() * 31;
        long j10 = this.f14144b;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f14145c;
        return i10 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("GplArguments{priority=");
        sbA.append(this.f14143a);
        sbA.append(", durationSeconds=");
        sbA.append(this.f14144b);
        sbA.append(", intervalSeconds=");
        return o2.a.a(sbA, this.f14145c, '}');
    }
}
