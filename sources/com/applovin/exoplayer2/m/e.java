package com.applovin.exoplayer2.m;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7782d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7784f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f7779a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f7780b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f7783e = -9223372036854775807L;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f7785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f7786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f7787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f7788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f7789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f7790f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean[] f7791g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f7792h;

        private static int b(long j10) {
            return (int) (j10 % 15);
        }

        public void a() {
            this.f7788d = 0L;
            this.f7789e = 0L;
            this.f7790f = 0L;
            this.f7792h = 0;
            Arrays.fill(this.f7791g, false);
        }

        public void a(long j10) {
            int i10;
            long j11 = this.f7788d;
            if (j11 == 0) {
                this.f7785a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f7785a;
                this.f7786b = j12;
                this.f7790f = j12;
                this.f7789e = 1L;
            } else {
                long j13 = j10 - this.f7787c;
                int iB = b(j11);
                if (Math.abs(j13 - this.f7786b) <= 1000000) {
                    this.f7789e++;
                    this.f7790f += j13;
                    boolean[] zArr = this.f7791g;
                    if (zArr[iB]) {
                        zArr[iB] = false;
                        i10 = this.f7792h - 1;
                        this.f7792h = i10;
                    }
                } else {
                    boolean[] zArr2 = this.f7791g;
                    if (!zArr2[iB]) {
                        zArr2[iB] = true;
                        i10 = this.f7792h + 1;
                        this.f7792h = i10;
                    }
                }
            }
            this.f7788d++;
            this.f7787c = j10;
        }

        public boolean b() {
            return this.f7788d > 15 && this.f7792h == 0;
        }

        public boolean c() {
            long j10 = this.f7788d;
            if (j10 == 0) {
                return false;
            }
            return this.f7791g[b(j10 - 1)];
        }

        public long d() {
            return this.f7790f;
        }

        public long e() {
            long j10 = this.f7789e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f7790f / j10;
        }
    }

    public void a() {
        this.f7779a.a();
        this.f7780b.a();
        this.f7781c = false;
        this.f7783e = -9223372036854775807L;
        this.f7784f = 0;
    }

    public void a(long j10) {
        this.f7779a.a(j10);
        if (this.f7779a.b() && !this.f7782d) {
            this.f7781c = false;
        } else if (this.f7783e != -9223372036854775807L) {
            if (!this.f7781c || this.f7780b.c()) {
                this.f7780b.a();
                this.f7780b.a(this.f7783e);
            }
            this.f7781c = true;
            this.f7780b.a(j10);
        }
        if (this.f7781c && this.f7780b.b()) {
            a aVar = this.f7779a;
            this.f7779a = this.f7780b;
            this.f7780b = aVar;
            this.f7781c = false;
            this.f7782d = false;
        }
        this.f7783e = j10;
        this.f7784f = this.f7779a.b() ? 0 : this.f7784f + 1;
    }

    public boolean b() {
        return this.f7779a.b();
    }

    public int c() {
        return this.f7784f;
    }

    public long d() {
        if (b()) {
            return this.f7779a.d();
        }
        return -9223372036854775807L;
    }

    public long e() {
        if (b()) {
            return this.f7779a.e();
        }
        return -9223372036854775807L;
    }

    public float f() {
        if (b()) {
            return (float) (1.0E9d / this.f7779a.e());
        }
        return -1.0f;
    }
}
