package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class ev {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20329c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20331e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f20327a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f20328b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f20330d = -9223372036854775807L;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f20332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f20333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f20334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f20335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f20336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f20337f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean[] f20338g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f20339h;

        public final long a() {
            long j10 = this.f20336e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f20337f / j10;
        }

        public final void a(long j10) {
            int i10;
            long j11 = this.f20335d;
            if (j11 == 0) {
                this.f20332a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f20332a;
                this.f20333b = j12;
                this.f20337f = j12;
                this.f20336e = 1L;
            } else {
                long j13 = j10 - this.f20334c;
                int i11 = (int) (j11 % 15);
                if (Math.abs(j13 - this.f20333b) <= 1000000) {
                    this.f20336e++;
                    this.f20337f += j13;
                    boolean[] zArr = this.f20338g;
                    if (zArr[i11]) {
                        zArr[i11] = false;
                        i10 = this.f20339h - 1;
                        this.f20339h = i10;
                    }
                } else {
                    boolean[] zArr2 = this.f20338g;
                    if (!zArr2[i11]) {
                        zArr2[i11] = true;
                        i10 = this.f20339h + 1;
                        this.f20339h = i10;
                    }
                }
            }
            this.f20335d++;
            this.f20334c = j10;
        }

        public final long b() {
            return this.f20337f;
        }

        public final boolean c() {
            long j10 = this.f20335d;
            if (j10 == 0) {
                return false;
            }
            return this.f20338g[(int) ((j10 - 1) % 15)];
        }

        public final boolean d() {
            return this.f20335d > 15 && this.f20339h == 0;
        }

        public final void e() {
            this.f20335d = 0L;
            this.f20336e = 0L;
            this.f20337f = 0L;
            this.f20339h = 0;
            Arrays.fill(this.f20338g, false);
        }
    }

    public final long a() {
        if (this.f20327a.d()) {
            return this.f20327a.a();
        }
        return -9223372036854775807L;
    }

    public final void a(long j10) {
        this.f20327a.a(j10);
        if (this.f20327a.d()) {
            this.f20329c = false;
        } else if (this.f20330d != -9223372036854775807L) {
            if (!this.f20329c || this.f20328b.c()) {
                this.f20328b.e();
                this.f20328b.a(this.f20330d);
            }
            this.f20329c = true;
            this.f20328b.a(j10);
        }
        if (this.f20329c && this.f20328b.d()) {
            a aVar = this.f20327a;
            this.f20327a = this.f20328b;
            this.f20328b = aVar;
            this.f20329c = false;
        }
        this.f20330d = j10;
        this.f20331e = this.f20327a.d() ? 0 : this.f20331e + 1;
    }

    public final float b() {
        if (this.f20327a.d()) {
            return (float) (1.0E9d / this.f20327a.a());
        }
        return -1.0f;
    }

    public final int c() {
        return this.f20331e;
    }

    public final long d() {
        if (this.f20327a.d()) {
            return this.f20327a.b();
        }
        return -9223372036854775807L;
    }

    public final boolean e() {
        return this.f20327a.d();
    }

    public final void f() {
        this.f20327a.e();
        this.f20328b.e();
        this.f20329c = false;
        this.f20330d = -9223372036854775807L;
        this.f20331e = 0;
    }
}
