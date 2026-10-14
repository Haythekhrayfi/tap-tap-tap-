package com.applovin.impl.sdk.d;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f10456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f10457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f10459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f10460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Throwable f10462g;

    public void a() {
        this.f10458c = true;
    }

    public void a(int i10) {
        this.f10461f = i10;
    }

    public void a(long j10) {
        this.f10456a += j10;
    }

    public void a(Throwable th) {
        this.f10462g = th;
    }

    public void b() {
        this.f10459d++;
    }

    public void b(long j10) {
        this.f10457b += j10;
    }

    public void c() {
        this.f10460e++;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("CacheStatsTracker{totalDownloadedBytes=");
        sbA.append(this.f10456a);
        sbA.append(", totalCachedBytes=");
        sbA.append(this.f10457b);
        sbA.append(", isHTMLCachingCancelled=");
        sbA.append(this.f10458c);
        sbA.append(", htmlResourceCacheSuccessCount=");
        sbA.append(this.f10459d);
        sbA.append(", htmlResourceCacheFailureCount=");
        return o2.a.a(sbA, this.f10460e, '}');
    }
}
