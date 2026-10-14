package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class gk0 implements lw {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f21088d = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ct0 f21089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xp0 f21090b = new xp0(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f21091c;

    public class a implements yp0, y61 {
        private a() {
        }

        public /* synthetic */ a(gk0 gk0Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.yp0
        /* JADX INFO: renamed from: a */
        public final void mo3a() {
            gk0.this.f21089a.a();
        }

        @Override // com.yandex.mobile.ads.impl.y61
        public final void a(long j10) {
            gk0.this.f21089a.a(gk0.this.f21091c, gk0.this.f21091c - j10);
        }
    }

    public gk0(AdResponse<?> adResponse, ct0 ct0Var) {
        this.f21089a = ct0Var;
        this.f21091c = a(adResponse);
    }

    private static long a(AdResponse adResponse) {
        Long lE = adResponse.E();
        if (lE == null) {
            lE = Long.valueOf(f21088d);
        }
        return lE.longValue();
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void invalidate() {
        this.f21090b.a();
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void pause() {
        this.f21090b.b();
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void resume() {
        this.f21090b.d();
    }

    @Override // com.yandex.mobile.ads.impl.lw
    public final void start() {
        a aVar = new a(this, 0);
        this.f21090b.a(this.f21091c, aVar);
        this.f21090b.a(aVar);
    }
}
