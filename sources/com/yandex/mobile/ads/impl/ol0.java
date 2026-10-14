package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
final class ol0 implements lw, ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pl0 f23847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h2 f23848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f23849c;

    public ol0(AdResponse adResponse, pl0 pl0Var, h2 h2Var) {
        this.f23847a = pl0Var;
        this.f23848b = h2Var;
        this.f23849c = adResponse.E();
    }

    @Override // com.yandex.mobile.ads.impl.ul0
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.ul0
    public final void a(long j10, long j11) {
        Long l10 = this.f23849c;
        if (l10 == null || j11 <= l10.longValue()) {
            return;
        }
        this.f23847a.b(this);
        this.f23848b.a();
    }

    @Override // com.yandex.mobile.ads.impl.ul0
    public final void b() {
        this.f23847a.b(this);
        this.f23848b.a();
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void invalidate() {
        this.f23847a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void start() {
        this.f23847a.a(this);
    }
}
