package com.applovin.exoplayer2.e;

/* JADX INFO: loaded from: classes.dex */
public class d implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f5296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f5297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f5299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f5300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f5301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f5302g;

    public d(long j10, long j11, int i10, int i11, boolean z10) {
        long jA;
        this.f5296a = j10;
        this.f5297b = j11;
        this.f5298c = i11 == -1 ? 1 : i11;
        this.f5300e = i10;
        this.f5302g = z10;
        if (j10 == -1) {
            this.f5299d = -1L;
            jA = -9223372036854775807L;
        } else {
            this.f5299d = j10 - j11;
            jA = a(j10, j11, i10);
        }
        this.f5301f = jA;
    }

    private static long a(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / ((long) i10);
    }

    private long c(long j10) {
        long j11 = (j10 * ((long) this.f5300e)) / 8000000;
        int i10 = this.f5298c;
        long jMin = (j11 / ((long) i10)) * ((long) i10);
        long j12 = this.f5299d;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - ((long) i10));
        }
        return this.f5297b + Math.max(jMin, 0L);
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        if (this.f5299d == -1 && !this.f5302g) {
            return new v.a(new w(0L, this.f5297b));
        }
        long jC = c(j10);
        long jB = b(jC);
        w wVar = new w(jB, jC);
        if (this.f5299d != -1 && jB < j10) {
            int i10 = this.f5298c;
            if (((long) i10) + jC < this.f5296a) {
                long j11 = jC + ((long) i10);
                return new v.a(wVar, new w(b(j11), j11));
            }
        }
        return new v.a(wVar);
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return this.f5299d != -1 || this.f5302g;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f5301f;
    }

    public long b(long j10) {
        return a(j10, this.f5297b, this.f5300e);
    }
}
