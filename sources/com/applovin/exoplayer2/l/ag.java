package com.applovin.exoplayer2.l;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f7591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f7592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f7593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f7594d = new ThreadLocal<>();

    public ag(long j10) {
        a(j10);
    }

    public static long d(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long e(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public synchronized long a() {
        long j10;
        j10 = this.f7591a;
        if (j10 == RecyclerView.FOREVER_NS || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized void a(long j10) {
        this.f7591a = j10;
        this.f7592b = j10 == RecyclerView.FOREVER_NS ? 0L : -9223372036854775807L;
        this.f7593c = -9223372036854775807L;
    }

    public synchronized long b() {
        long j10;
        j10 = this.f7593c;
        return j10 != -9223372036854775807L ? j10 + this.f7592b : a();
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f7593c;
        if (j11 != -9223372036854775807L) {
            long jE = e(j11);
            long j12 = (4294967296L + jE) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j10;
            long j14 = (j12 * 8589934592L) + j10;
            j10 = Math.abs(j13 - jE) < Math.abs(j14 - jE) ? j13 : j14;
        }
        return c(d(j10));
    }

    public synchronized long c() {
        return this.f7592b;
    }

    public synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f7592b == -9223372036854775807L) {
            long jLongValue = this.f7591a;
            if (jLongValue == 9223372036854775806L) {
                jLongValue = ((Long) a.b(this.f7594d.get())).longValue();
            }
            this.f7592b = jLongValue - j10;
            notifyAll();
        }
        this.f7593c = j10;
        return j10 + this.f7592b;
    }
}
