package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class mm0 implements lw, pm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final om0 f23112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zi f23113b;

    public mm0(om0 om0Var, zi ziVar) {
        this.f23112a = om0Var;
        this.f23113b = ziVar;
    }

    @Override // com.yandex.mobile.ads.impl.pm0
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.pm0
    public final void a(boolean z10) {
        if (z10) {
            return;
        }
        this.f23113b.a();
        this.f23112a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void invalidate() {
        this.f23112a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void start() {
        this.f23112a.a(this);
    }
}
