package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f18806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f18807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f18808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f18809d = new ThreadLocal<>();

    public a71(long j10) {
        c(j10);
    }

    public final synchronized long a() {
        long j10;
        j10 = this.f18806a;
        if (j10 == RecyclerView.FOREVER_NS || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f18807b == -9223372036854775807L) {
            long jLongValue = this.f18806a;
            if (jLongValue == 9223372036854775806L) {
                Long l10 = this.f18809d.get();
                Objects.requireNonNull(l10);
                jLongValue = l10.longValue();
            }
            this.f18807b = jLongValue - j10;
            notifyAll();
        }
        this.f18808c = j10;
        return j10 + this.f18807b;
    }

    public final synchronized long b() {
        long j10;
        j10 = this.f18808c;
        return j10 != -9223372036854775807L ? j10 + this.f18807b : a();
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f18808c;
        if (j11 != -9223372036854775807L) {
            long j12 = (j11 * 90000) / 1000000;
            long j13 = (4294967296L + j12) / 8589934592L;
            long j14 = ((j13 - 1) * 8589934592L) + j10;
            j10 += j13 * 8589934592L;
            if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                j10 = j14;
            }
        }
        return a((j10 * 1000000) / 90000);
    }

    public final synchronized long c() {
        return this.f18807b;
    }

    public final synchronized void c(long j10) {
        this.f18806a = j10;
        this.f18807b = j10 == RecyclerView.FOREVER_NS ? 0L : -9223372036854775807L;
        this.f18808c = -9223372036854775807L;
    }
}
