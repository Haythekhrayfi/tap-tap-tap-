package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
final class uj0 implements lw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zi f25669a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f25672d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f25671c = new a(this, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xp0 f25670b = new xp0(false);

    public class a implements yp0 {
        private a() {
        }

        public /* synthetic */ a(uj0 uj0Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.yp0
        /* JADX INFO: renamed from: a */
        public final void mo3a() {
            uj0.a(uj0.this);
        }
    }

    public uj0(AdResponse adResponse, zi ziVar) {
        this.f25669a = ziVar;
        this.f25672d = vj0.a(adResponse);
    }

    public static void a(uj0 uj0Var) {
        uj0Var.f25669a.a();
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void invalidate() {
        this.f25670b.a();
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void pause() {
        this.f25670b.b();
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void resume() {
        this.f25670b.d();
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void start() {
        this.f25670b.a(this.f25672d, this.f25671c);
    }
}
