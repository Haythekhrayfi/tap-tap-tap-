package com.yandex.metrica.impl.ob;

import android.location.Location;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1882pd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Wc.a f17071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f17072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f17073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f17074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Location f17075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private M.b.a f17076f;

    public C1882pd(Wc.a aVar, long j10, long j11, Location location, M.b.a aVar2, Long l10) {
        this.f17071a = aVar;
        this.f17072b = l10;
        this.f17073c = j10;
        this.f17074d = j11;
        this.f17075e = location;
        this.f17076f = aVar2;
    }

    public M.b.a a() {
        return this.f17076f;
    }

    public Long b() {
        return this.f17072b;
    }

    public Location c() {
        return this.f17075e;
    }

    public long d() {
        return this.f17074d;
    }

    public long e() {
        return this.f17073c;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("LocationWrapper{collectionMode=");
        sbA.append(this.f17071a);
        sbA.append(", mIncrementalId=");
        sbA.append(this.f17072b);
        sbA.append(", mReceiveTimestamp=");
        sbA.append(this.f17073c);
        sbA.append(", mReceiveElapsedRealtime=");
        sbA.append(this.f17074d);
        sbA.append(", mLocation=");
        sbA.append(this.f17075e);
        sbA.append(", mChargeType=");
        sbA.append(this.f17076f);
        sbA.append('}');
        return sbA.toString();
    }
}
