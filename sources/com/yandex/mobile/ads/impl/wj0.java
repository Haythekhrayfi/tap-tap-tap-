package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
final class wj0 implements lw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h2 f26294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xp0 f26295b = new xp0(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26296c;

    public class a implements yp0 {
        private a() {
        }

        public /* synthetic */ a(wj0 wj0Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.yp0
        /* JADX INFO: renamed from: a */
        public final void mo3a() {
            wj0.a(wj0.this);
        }
    }

    public wj0(AdResponse adResponse, h2 h2Var) {
        this.f26294a = h2Var;
        this.f26296c = a(adResponse);
    }

    private static long a(AdResponse adResponse) {
        Long lE = adResponse.E();
        if (lE == null) {
            lE = 5000L;
        }
        return lE.longValue();
    }

    public static void a(wj0 wj0Var) {
        wj0Var.f26294a.a();
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void invalidate() {
        this.f26295b.a();
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void pause() {
        this.f26295b.b();
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void resume() {
        this.f26295b.d();
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void start() {
        this.f26295b.a(this.f26296c, new a(this, 0));
    }
}
