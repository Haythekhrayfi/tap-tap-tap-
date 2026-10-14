package com.applovin.exoplayer2.l;

import com.applovin.exoplayer2.am;

/* JADX INFO: loaded from: classes.dex */
public final class ac implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f7578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f7580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f7581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private am f7582e = am.f4251a;

    public ac(d dVar) {
        this.f7578a = dVar;
    }

    public void a() {
        if (this.f7579b) {
            return;
        }
        this.f7581d = this.f7578a.a();
        this.f7579b = true;
    }

    public void a(long j10) {
        this.f7580c = j10;
        if (this.f7579b) {
            this.f7581d = this.f7578a.a();
        }
    }

    @Override // com.applovin.exoplayer2.l.s
    public void a(am amVar) {
        if (this.f7579b) {
            a(c_());
        }
        this.f7582e = amVar;
    }

    public void b() {
        if (this.f7579b) {
            a(c_());
            this.f7579b = false;
        }
    }

    @Override // com.applovin.exoplayer2.l.s
    public long c_() {
        long j10 = this.f7580c;
        if (!this.f7579b) {
            return j10;
        }
        long jA = this.f7578a.a() - this.f7581d;
        am amVar = this.f7582e;
        return j10 + (amVar.f4253b == 1.0f ? com.applovin.exoplayer2.h.b(jA) : amVar.a(jA));
    }

    @Override // com.applovin.exoplayer2.l.s
    public am d() {
        return this.f7582e;
    }
}
