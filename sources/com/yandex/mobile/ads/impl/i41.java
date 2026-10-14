package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class i41 implements db0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ki f21592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f21594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f21595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private zq0 f21596f = zq0.f27397d;

    public i41(q51 q51Var) {
        this.f21592b = q51Var;
    }

    public final void a() {
        if (this.f21593c) {
            return;
        }
        this.f21595e = this.f21592b.c();
        this.f21593c = true;
    }

    public final void a(long j10) {
        this.f21594d = j10;
        if (this.f21593c) {
            this.f21595e = this.f21592b.c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.db0
    public final void a(zq0 zq0Var) {
        if (this.f21593c) {
            a(o());
        }
        this.f21596f = zq0Var;
    }

    public final void b() {
        if (this.f21593c) {
            a(o());
            this.f21593c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.db0
    public final zq0 getPlaybackParameters() {
        return this.f21596f;
    }

    @Override // com.yandex.mobile.ads.impl.db0
    public final long o() {
        long j10 = this.f21594d;
        if (!this.f21593c) {
            return j10;
        }
        long jC = this.f21592b.c() - this.f21595e;
        zq0 zq0Var = this.f21596f;
        return j10 + (zq0Var.f27398a == 1.0f ? da1.a(jC) : zq0Var.a(jC));
    }
}
