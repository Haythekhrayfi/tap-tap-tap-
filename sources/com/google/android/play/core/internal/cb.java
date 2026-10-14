package com.google.android.play.core.internal;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class cb extends ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ca f12283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f12285c;

    public cb(ca caVar, long j10, long j11) {
        this.f12283a = caVar;
        long jA = a(j10);
        this.f12284b = jA;
        this.f12285c = a(jA + j11);
    }

    private final long a(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        return j10 > this.f12283a.a() ? this.f12283a.a() : j10;
    }

    @Override // com.google.android.play.core.internal.ca
    public final long a() {
        return this.f12285c - this.f12284b;
    }

    @Override // com.google.android.play.core.internal.ca
    public final InputStream a(long j10, long j11) throws IOException {
        long jA = a(this.f12284b);
        return this.f12283a.a(jA, a(j11 + jA) - jA);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
