package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class jh1<T> implements td1, vd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc1<T> f22043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ng1 f22044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final de1 f22045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final eg1 f22046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dd1<T> f22047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Long f22048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22049g;

    public jh1(sc1<T> sc1Var, lg1 lg1Var, de1 de1Var, eg1 eg1Var, dd1<T> dd1Var) {
        this.f22043a = sc1Var;
        this.f22044b = new ng1(lg1Var);
        this.f22045c = de1Var;
        this.f22046d = eg1Var;
        this.f22047e = dd1Var;
    }

    @Override // com.yandex.mobile.ads.impl.vd1
    public final void a() {
        this.f22048f = null;
    }

    @Override // com.yandex.mobile.ads.impl.td1
    public final void a(long j10, long j11) {
        boolean zA = this.f22044b.a();
        if (this.f22049g) {
            return;
        }
        if (!zA || this.f22045c.a() != ce1.f19479d) {
            this.f22048f = null;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = this.f22048f;
        if (l10 == null) {
            this.f22048f = Long.valueOf(jElapsedRealtime);
            this.f22047e.k(this.f22043a);
        } else if (jElapsedRealtime - l10.longValue() >= 2000) {
            this.f22049g = true;
            this.f22047e.j(this.f22043a);
            this.f22046d.n();
        }
    }

    @Override // com.yandex.mobile.ads.impl.vd1
    public final void b() {
        this.f22048f = null;
    }
}
