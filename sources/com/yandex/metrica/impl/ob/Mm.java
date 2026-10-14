package com.yandex.metrica.impl.ob;

import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class Mm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Nm f14522a;

    public Mm() {
        this(new Nm());
    }

    public Mm(Nm nm) {
        this.f14522a = nm;
    }

    public long a(long j10, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long millis = timeUnit.toMillis(j10);
        Objects.requireNonNull(this.f14522a);
        return timeUnit2.toSeconds(SystemClock.elapsedRealtime() - millis);
    }

    public long b(long j10, TimeUnit timeUnit) {
        if (j10 == 0) {
            return 0L;
        }
        return this.f14522a.b() - timeUnit.toSeconds(j10);
    }

    public long c(long j10, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        Objects.requireNonNull(this.f14522a);
        return timeUnit2.toSeconds(System.nanoTime() - timeUnit.toNanos(j10));
    }
}
