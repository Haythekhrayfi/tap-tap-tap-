package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class nm0 implements lw, pm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final om0 f23446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h2 f23447b;

    public nm0(om0 om0Var, h2 h2Var) {
        this.f23446a = om0Var;
        this.f23447b = h2Var;
    }

    @Override // com.yandex.mobile.ads.impl.pm0
    public final void a() {
        this.f23446a.b(this);
        this.f23447b.a();
    }

    @Override // com.yandex.mobile.ads.impl.pm0
    public final void a(boolean z10) {
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void invalidate() {
        this.f23446a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void start() {
        this.f23446a.a(this);
    }
}
