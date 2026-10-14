package com.applovin.exoplayer2.h;

import android.net.Uri;
import com.applovin.exoplayer2.ba;

/* JADX INFO: loaded from: classes.dex */
public final class aa extends ba {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f6487c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.applovin.exoplayer2.ab f6488d = new com.applovin.exoplayer2.ab.b().a("SinglePeriodTimeline").a(Uri.EMPTY).a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f6489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f6490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f6491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f6492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f6493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f6494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f6495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f6496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f6497m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f6498n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f6499o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.applovin.exoplayer2.ab f6500p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.applovin.exoplayer2.ab.e f6501q;

    public aa(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, com.applovin.exoplayer2.ab abVar, com.applovin.exoplayer2.ab.e eVar) {
        this.f6489e = j10;
        this.f6490f = j11;
        this.f6491g = j12;
        this.f6492h = j13;
        this.f6493i = j14;
        this.f6494j = j15;
        this.f6495k = j16;
        this.f6496l = z10;
        this.f6497m = z11;
        this.f6498n = z12;
        this.f6499o = obj;
        this.f6500p = (com.applovin.exoplayer2.ab) com.applovin.exoplayer2.l.a.b(abVar);
        this.f6501q = eVar;
    }

    public aa(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, com.applovin.exoplayer2.ab abVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, abVar, z12 ? abVar.f4049d : null);
    }

    public aa(long j10, boolean z10, boolean z11, boolean z12, Object obj, com.applovin.exoplayer2.ab abVar) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, abVar);
    }

    @Override // com.applovin.exoplayer2.ba
    public ba.a a(int i10, ba.a aVar, boolean z10) {
        com.applovin.exoplayer2.l.a.a(i10, 0, 1);
        return aVar.a(null, z10 ? f6487c : null, 0, this.f6492h, -this.f6494j);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r1
  0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x0012, B:5:0x0016, B:7:0x001c, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.applovin.exoplayer2.ba
    public ba.c a(int i10, ba.c cVar, long j10) {
        long j11;
        com.applovin.exoplayer2.l.a.a(i10, 0, 1);
        long j12 = this.f6495k;
        boolean z10 = this.f6497m;
        if (!z10 || this.f6498n || j10 == 0) {
            j11 = j12;
        } else {
            long j13 = this.f6493i;
            if (j13 != -9223372036854775807L) {
                j12 += j10;
                if (j12 <= j13) {
                    j11 = j12;
                }
            }
            j11 = -9223372036854775807L;
        }
        return cVar.a(ba.c.f4687a, this.f6500p, this.f6499o, this.f6489e, this.f6490f, this.f6491g, this.f6496l, z10, this.f6501q, j11, this.f6493i, 0, 0, this.f6494j);
    }

    @Override // com.applovin.exoplayer2.ba
    public Object a(int i10) {
        com.applovin.exoplayer2.l.a.a(i10, 0, 1);
        return f6487c;
    }

    @Override // com.applovin.exoplayer2.ba
    public int b() {
        return 1;
    }

    @Override // com.applovin.exoplayer2.ba
    public int c() {
        return 1;
    }

    @Override // com.applovin.exoplayer2.ba
    public int c(Object obj) {
        return f6487c.equals(obj) ? 0 : -1;
    }
}
