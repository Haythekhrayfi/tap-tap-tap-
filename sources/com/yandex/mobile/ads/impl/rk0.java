package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
final class rk0 implements nk0.a, cl0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sk0.a f24758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g20 f24759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f24760c;

    public rk0(sk0.a aVar, g20 g20Var, int i10) {
        fd.j0.i(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        fd.j0.i(g20Var, "imageProvider");
        this.f24758a = aVar;
        this.f24759b = g20Var;
        this.f24760c = new AtomicInteger(i10);
    }

    @Override // com.yandex.mobile.ads.impl.cl0.b
    public final void a() {
        if (this.f24760c.decrementAndGet() == 0) {
            this.f24758a.a(this.f24759b);
        }
    }

    @Override // com.yandex.mobile.ads.impl.nk0.a
    public final void b() {
        if (this.f24760c.decrementAndGet() == 0) {
            this.f24758a.a(this.f24759b);
        }
    }
}
