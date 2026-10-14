package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14540b;

    public Nc(long j10, long j11) {
        this.f14539a = j10;
        this.f14540b = j11;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("IntervalRange{minInterval=");
        sbA.append(this.f14539a);
        sbA.append(", maxInterval=");
        return o2.a.a(sbA, this.f14540b, '}');
    }
}
