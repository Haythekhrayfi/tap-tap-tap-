package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class O<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1760kg.c f14598e = new C1760kg.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile long f14599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile long f14600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f14601c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T f14602d = null;

    public O(long j10, long j11) {
        this.f14599a = j10;
        this.f14600b = j11;
    }

    public T a() {
        return this.f14602d;
    }

    public void a(long j10, long j11) {
        this.f14599a = j10;
        this.f14600b = j11;
    }

    public void a(T t10) {
        this.f14602d = t10;
        this.f14601c = System.currentTimeMillis();
    }

    public final boolean b() {
        return this.f14602d == null;
    }

    public final boolean c() {
        if (this.f14601c == 0) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f14601c;
        return jCurrentTimeMillis > this.f14600b || jCurrentTimeMillis < 0;
    }

    public final boolean d() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f14601c;
        return jCurrentTimeMillis > this.f14599a || jCurrentTimeMillis < 0;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("CachedData{refreshTime=");
        sbA.append(this.f14599a);
        sbA.append(", mCachedTime=");
        sbA.append(this.f14601c);
        sbA.append(", expiryTime=");
        sbA.append(this.f14600b);
        sbA.append(", mCachedData=");
        sbA.append(this.f14602d);
        sbA.append('}');
        return sbA.toString();
    }
}
