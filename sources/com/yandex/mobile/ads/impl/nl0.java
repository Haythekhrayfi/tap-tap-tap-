package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
final class nl0 implements lw, ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private pl0 f23437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zi f23438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f23439c;

    public nl0(AdResponse adResponse, pl0 pl0Var, zi ziVar) {
        this.f23437a = pl0Var;
        this.f23438b = ziVar;
        this.f23439c = adResponse.u();
    }

    @Override // com.yandex.mobile.ads.impl.ul0
    public final void a() {
        this.f23438b.a();
        this.f23437a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.ul0
    public final void a(long j10, long j11) {
        Long l10 = this.f23439c;
        if (l10 == null || j11 < l10.longValue()) {
            return;
        }
        this.f23438b.a();
        this.f23437a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.ul0
    public final void b() {
        this.f23438b.a();
        this.f23437a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void invalidate() {
        this.f23437a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void start() {
        this.f23437a.a(this);
    }
}
