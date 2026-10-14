package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class xs {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f26612c = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xp0 f26613a = new xp0(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dr0.b f26614b;

    public class a implements yp0 {
        private a() {
        }

        public /* synthetic */ a(xs xsVar, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.yp0
        /* JADX INFO: renamed from: a */
        public final void mo3a() {
            xs.this.f26614b.b(ns.a());
        }
    }

    public xs(dr0.b bVar) {
        this.f26614b = bVar;
    }

    public final void a() {
        this.f26613a.a(f26612c, new a(this, 0));
    }

    public final void b() {
        this.f26613a.a();
    }
}
