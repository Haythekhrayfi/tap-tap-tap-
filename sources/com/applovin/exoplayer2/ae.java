package com.applovin.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
final class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.exoplayer2.h.p.a f4179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4187i;

    public ae(com.applovin.exoplayer2.h.p.a aVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        com.applovin.exoplayer2.l.a.a(!z13 || z11);
        com.applovin.exoplayer2.l.a.a(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        com.applovin.exoplayer2.l.a.a(z14);
        this.f4179a = aVar;
        this.f4180b = j10;
        this.f4181c = j11;
        this.f4182d = j12;
        this.f4183e = j13;
        this.f4184f = z10;
        this.f4185g = z11;
        this.f4186h = z12;
        this.f4187i = z13;
    }

    public ae a(long j10) {
        return j10 == this.f4180b ? this : new ae(this.f4179a, j10, this.f4181c, this.f4182d, this.f4183e, this.f4184f, this.f4185g, this.f4186h, this.f4187i);
    }

    public ae b(long j10) {
        return j10 == this.f4181c ? this : new ae(this.f4179a, this.f4180b, j10, this.f4182d, this.f4183e, this.f4184f, this.f4185g, this.f4186h, this.f4187i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ae.class != obj.getClass()) {
            return false;
        }
        ae aeVar = (ae) obj;
        return this.f4180b == aeVar.f4180b && this.f4181c == aeVar.f4181c && this.f4182d == aeVar.f4182d && this.f4183e == aeVar.f4183e && this.f4184f == aeVar.f4184f && this.f4185g == aeVar.f4185g && this.f4186h == aeVar.f4186h && this.f4187i == aeVar.f4187i && com.applovin.exoplayer2.l.ai.a(this.f4179a, aeVar.f4179a);
    }

    public int hashCode() {
        return ((((((((((((((((this.f4179a.hashCode() + 527) * 31) + ((int) this.f4180b)) * 31) + ((int) this.f4181c)) * 31) + ((int) this.f4182d)) * 31) + ((int) this.f4183e)) * 31) + (this.f4184f ? 1 : 0)) * 31) + (this.f4185g ? 1 : 0)) * 31) + (this.f4186h ? 1 : 0)) * 31) + (this.f4187i ? 1 : 0);
    }
}
