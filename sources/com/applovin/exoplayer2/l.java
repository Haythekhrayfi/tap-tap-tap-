package com.applovin.exoplayer2;

import ch.qos.logback.classic.Level;

/* JADX INFO: loaded from: classes.dex */
public class l implements aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.m f7564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f7566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f7567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f7568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f7569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f7570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f7571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f7572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f7573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7574k;

    public l() {
        this(new com.applovin.exoplayer2.k.m(true, 65536), 50000, 50000, 2500, Level.TRACE_INT, -1, false, 0, false);
    }

    public l(com.applovin.exoplayer2.k.m mVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        a(i12, 0, "bufferForPlaybackMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        a(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i11, i10, "maxBufferMs", "minBufferMs");
        a(i15, 0, "backBufferDurationMs", "0");
        this.f7564a = mVar;
        this.f7565b = h.b(i10);
        this.f7566c = h.b(i11);
        this.f7567d = h.b(i12);
        this.f7568e = h.b(i13);
        this.f7569f = i14;
        this.f7573j = i14 == -1 ? 13107200 : i14;
        this.f7570g = z10;
        this.f7571h = h.b(i15);
        this.f7572i = z11;
    }

    private static int a(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private static void a(int i10, int i11, String str, String str2) {
        com.applovin.exoplayer2.l.a.a(i10 >= i11, str + " cannot be less than " + str2);
    }

    private void a(boolean z10) {
        int i10 = this.f7569f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f7573j = i10;
        this.f7574k = false;
        if (z10) {
            this.f7564a.d();
        }
    }

    public int a(ar[] arVarArr, com.applovin.exoplayer2.j.d[] dVarArr) {
        int iA = 0;
        for (int i10 = 0; i10 < arVarArr.length; i10++) {
            if (dVarArr[i10] != null) {
                iA += a(arVarArr[i10].a());
            }
        }
        return Math.max(13107200, iA);
    }

    @Override // com.applovin.exoplayer2.aa
    public void a() {
        a(false);
    }

    @Override // com.applovin.exoplayer2.aa
    public void a(ar[] arVarArr, com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.d[] dVarArr) {
        int iA = this.f7569f;
        if (iA == -1) {
            iA = a(arVarArr, dVarArr);
        }
        this.f7573j = iA;
        this.f7564a.a(iA);
    }

    @Override // com.applovin.exoplayer2.aa
    public boolean a(long j10, float f10, boolean z10, long j11) {
        long jB = com.applovin.exoplayer2.l.ai.b(j10, f10);
        long jMin = z10 ? this.f7568e : this.f7567d;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(j11 / 2, jMin);
        }
        return jMin <= 0 || jB >= jMin || (!this.f7570g && this.f7564a.e() >= this.f7573j);
    }

    @Override // com.applovin.exoplayer2.aa
    public boolean a(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.f7564a.e() >= this.f7573j;
        long jMin = this.f7565b;
        if (f10 > 1.0f) {
            jMin = Math.min(com.applovin.exoplayer2.l.ai.a(jMin, f10), this.f7566c);
        }
        if (j11 < Math.max(jMin, 500000L)) {
            if (!this.f7570g && z11) {
                z10 = false;
            }
            this.f7574k = z10;
            if (!z10 && j11 < 500000) {
                com.applovin.exoplayer2.l.q.c("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f7566c || z11) {
            this.f7574k = false;
        }
        return this.f7574k;
    }

    @Override // com.applovin.exoplayer2.aa
    public void b() {
        a(true);
    }

    @Override // com.applovin.exoplayer2.aa
    public void c() {
        a(true);
    }

    @Override // com.applovin.exoplayer2.aa
    public com.applovin.exoplayer2.k.b d() {
        return this.f7564a;
    }

    @Override // com.applovin.exoplayer2.aa
    public long e() {
        return this.f7571h;
    }

    @Override // com.applovin.exoplayer2.aa
    public boolean f() {
        return this.f7572i;
    }
}
