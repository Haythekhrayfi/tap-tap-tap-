package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
final class bm0 implements lw, ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pl0 f19291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ct0 f19292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f19293c;

    public bm0(AdResponse adResponse, pl0 pl0Var, ct0 ct0Var) {
        this.f19291a = pl0Var;
        this.f19292b = ct0Var;
        this.f19293c = adResponse.E();
    }

    @Override // com.yandex.mobile.ads.impl.ul0
    public final void a() {
        this.f19292b.a();
        this.f19291a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.ul0
    public final void a(long j10, long j11) {
        Long l10 = this.f19293c;
        if (l10 != null) {
            j10 = Math.min(j10, l10.longValue());
        }
        if (j11 < j10) {
            this.f19292b.a(j10, j11);
        } else {
            this.f19291a.b(this);
            this.f19292b.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ul0
    public final void b() {
        this.f19292b.a();
        this.f19291a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void invalidate() {
        this.f19291a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void start() {
        this.f19291a.a(this);
    }
}
