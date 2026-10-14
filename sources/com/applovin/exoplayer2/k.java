package com.applovin.exoplayer2;

import android.os.SystemClock;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public final class k implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f7316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f7317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f7318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f7319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f7320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f7321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f7322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f7323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f7324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f7325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f7326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f7327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f7328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f7329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f7330o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f7331p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f7332q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f7333r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f7334s;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f7335a = 0.97f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f7336b = 1.03f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f7337c = 1000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f7338d = 1.0E-7f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f7339e = h.b(20L);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f7340f = h.b(500L);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f7341g = 0.999f;

        public k a() {
            return new k(this.f7335a, this.f7336b, this.f7337c, this.f7338d, this.f7339e, this.f7340f, this.f7341g);
        }
    }

    private k(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f7316a = f10;
        this.f7317b = f11;
        this.f7318c = j10;
        this.f7319d = f12;
        this.f7320e = j11;
        this.f7321f = j12;
        this.f7322g = f13;
        this.f7323h = -9223372036854775807L;
        this.f7324i = -9223372036854775807L;
        this.f7326k = -9223372036854775807L;
        this.f7327l = -9223372036854775807L;
        this.f7330o = f10;
        this.f7329n = f11;
        this.f7331p = 1.0f;
        this.f7332q = -9223372036854775807L;
        this.f7325j = -9223372036854775807L;
        this.f7328m = -9223372036854775807L;
        this.f7333r = -9223372036854775807L;
        this.f7334s = -9223372036854775807L;
    }

    private static long a(long j10, long j11, float f10) {
        return (long) (((1.0f - f10) * j11) + (j10 * f10));
    }

    private void b(long j10) {
        long j11 = (this.f7334s * 3) + this.f7333r;
        if (this.f7328m > j11) {
            float fB = h.b(this.f7318c);
            this.f7328m = com.applovin.exoplayer2.common.b.d.a(j11, this.f7325j, this.f7328m - (((long) ((this.f7331p - 1.0f) * fB)) + ((long) ((this.f7329n - 1.0f) * fB))));
            return;
        }
        long jA = com.applovin.exoplayer2.l.ai.a(j10 - ((long) (Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, this.f7331p - 1.0f) / this.f7319d)), this.f7328m, j11);
        this.f7328m = jA;
        long j12 = this.f7327l;
        if (j12 == -9223372036854775807L || jA <= j12) {
            return;
        }
        this.f7328m = j12;
    }

    private void b(long j10, long j11) {
        long jA;
        long j12 = j10 - j11;
        long j13 = this.f7333r;
        if (j13 == -9223372036854775807L) {
            this.f7333r = j12;
            jA = 0;
        } else {
            long jMax = Math.max(j12, a(j13, j12, this.f7322g));
            this.f7333r = jMax;
            jA = a(this.f7334s, Math.abs(j12 - jMax), this.f7322g);
        }
        this.f7334s = jA;
    }

    private void c() {
        long j10 = this.f7323h;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f7324i;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f7326k;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f7327l;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f7325j == j10) {
            return;
        }
        this.f7325j = j10;
        this.f7328m = j10;
        this.f7333r = -9223372036854775807L;
        this.f7334s = -9223372036854775807L;
        this.f7332q = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.z
    public float a(long j10, long j11) {
        if (this.f7323h == -9223372036854775807L) {
            return 1.0f;
        }
        b(j10, j11);
        if (this.f7332q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f7332q < this.f7318c) {
            return this.f7331p;
        }
        this.f7332q = SystemClock.elapsedRealtime();
        b(j10);
        long j12 = j10 - this.f7328m;
        if (Math.abs(j12) < this.f7320e) {
            this.f7331p = 1.0f;
        } else {
            this.f7331p = com.applovin.exoplayer2.l.ai.a((this.f7319d * j12) + 1.0f, this.f7330o, this.f7329n);
        }
        return this.f7331p;
    }

    @Override // com.applovin.exoplayer2.z
    public void a() {
        long j10 = this.f7328m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f7321f;
        this.f7328m = j11;
        long j12 = this.f7327l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f7328m = j12;
        }
        this.f7332q = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.z
    public void a(long j10) {
        this.f7324i = j10;
        c();
    }

    @Override // com.applovin.exoplayer2.z
    public void a(ab.e eVar) {
        this.f7323h = h.b(eVar.f4094b);
        this.f7326k = h.b(eVar.f4095c);
        this.f7327l = h.b(eVar.f4096d);
        float f10 = eVar.f4097e;
        if (f10 == -3.4028235E38f) {
            f10 = this.f7316a;
        }
        this.f7330o = f10;
        float f11 = eVar.f4098f;
        if (f11 == -3.4028235E38f) {
            f11 = this.f7317b;
        }
        this.f7329n = f11;
        c();
    }

    @Override // com.applovin.exoplayer2.z
    public long b() {
        return this.f7328m;
    }
}
