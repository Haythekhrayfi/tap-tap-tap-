package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class fo implements db0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i41 f20757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f20758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private pv0 f20759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private db0 f20760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20761f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20762g;

    public interface a {
    }

    public fo(a aVar, q51 q51Var) {
        this.f20758c = aVar;
        this.f20757b = new i41(q51Var);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    public final long a(boolean z10) {
        zq0 playbackParameters;
        pv0 pv0Var = this.f20759d;
        if (pv0Var == null || pv0Var.a() || (!this.f20759d.d() && (z10 || this.f20759d.e()))) {
            this.f20761f = true;
            if (this.f20762g) {
                this.f20757b.a();
            }
        } else {
            db0 db0Var = this.f20760e;
            Objects.requireNonNull(db0Var);
            long jO = db0Var.o();
            if (!this.f20761f) {
                this.f20757b.a(jO);
                playbackParameters = db0Var.getPlaybackParameters();
                if (!playbackParameters.equals(this.f20757b.getPlaybackParameters())) {
                    this.f20757b.a(playbackParameters);
                    ((ts) this.f20758c).a(playbackParameters);
                }
            } else if (jO < this.f20757b.o()) {
                this.f20757b.b();
            } else {
                this.f20761f = false;
                if (this.f20762g) {
                    this.f20757b.a();
                }
                this.f20757b.a(jO);
                playbackParameters = db0Var.getPlaybackParameters();
                if (!playbackParameters.equals(this.f20757b.getPlaybackParameters())) {
                    this.f20757b.a(playbackParameters);
                    ((ts) this.f20758c).a(playbackParameters);
                }
            }
        }
        return o();
    }

    public final void a() {
        this.f20762g = true;
        this.f20757b.a();
    }

    public final void a(long j10) {
        this.f20757b.a(j10);
    }

    public final void a(pv0 pv0Var) {
        if (pv0Var == this.f20759d) {
            this.f20760e = null;
            this.f20759d = null;
            this.f20761f = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.db0
    public final void a(zq0 zq0Var) {
        db0 db0Var = this.f20760e;
        if (db0Var != null) {
            db0Var.a(zq0Var);
            zq0Var = this.f20760e.getPlaybackParameters();
        }
        this.f20757b.a(zq0Var);
    }

    public final void b() {
        this.f20762g = false;
        this.f20757b.b();
    }

    public final void b(pv0 pv0Var) throws ns {
        db0 db0Var;
        db0 db0VarL = pv0Var.l();
        if (db0VarL == null || db0VarL == (db0Var = this.f20760e)) {
            return;
        }
        if (db0Var != null) {
            throw ns.a(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f20760e = db0VarL;
        this.f20759d = pv0Var;
        db0VarL.a(this.f20757b.getPlaybackParameters());
    }

    @Override // com.yandex.mobile.ads.impl.db0
    public final zq0 getPlaybackParameters() {
        db0 db0Var = this.f20760e;
        return db0Var != null ? db0Var.getPlaybackParameters() : this.f20757b.getPlaybackParameters();
    }

    @Override // com.yandex.mobile.ads.impl.db0
    public final long o() {
        if (this.f20761f) {
            return this.f20757b.o();
        }
        db0 db0Var = this.f20760e;
        Objects.requireNonNull(db0Var);
        return db0Var.o();
    }
}
