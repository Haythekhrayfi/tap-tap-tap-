package com.applovin.exoplayer2;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final av f4296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final av f4297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final av f4298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final av f4299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final av f4300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f4302g;

    static {
        av avVar = new av(0L, 0L);
        f4296a = avVar;
        f4297b = new av(RecyclerView.FOREVER_NS, RecyclerView.FOREVER_NS);
        f4298c = new av(RecyclerView.FOREVER_NS, 0L);
        f4299d = new av(0L, RecyclerView.FOREVER_NS);
        f4300e = avVar;
    }

    public av(long j10, long j11) {
        com.applovin.exoplayer2.l.a.a(j10 >= 0);
        com.applovin.exoplayer2.l.a.a(j11 >= 0);
        this.f4301f = j10;
        this.f4302g = j11;
    }

    public long a(long j10, long j11, long j12) {
        long j13 = this.f4301f;
        if (j13 == 0 && this.f4302g == 0) {
            return j10;
        }
        long jC = com.applovin.exoplayer2.l.ai.c(j10, j13, Long.MIN_VALUE);
        long jB = com.applovin.exoplayer2.l.ai.b(j10, this.f4302g, RecyclerView.FOREVER_NS);
        boolean z10 = jC <= j11 && j11 <= jB;
        boolean z11 = jC <= j12 && j12 <= jB;
        if (z10 && z11) {
            return Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12;
        }
        if (z10) {
            return j11;
        }
        return z11 ? j12 : jC;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || av.class != obj.getClass()) {
            return false;
        }
        av avVar = (av) obj;
        return this.f4301f == avVar.f4301f && this.f4302g == avVar.f4302g;
    }

    public int hashCode() {
        return (((int) this.f4301f) * 31) + ((int) this.f4302g);
    }
}
