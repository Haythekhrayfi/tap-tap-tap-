package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class nk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ik0 f23413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ql0 f23414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qm0 f23415c = new qm0();

    public interface a {
        void b();
    }

    public static class b implements ik0.a, ql0.a, cl0.b, qm0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f23416a = new AtomicInteger(3);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f23417b;

        public b(rk0 rk0Var) {
            this.f23417b = rk0Var;
        }

        @Override // com.yandex.mobile.ads.impl.cl0.b
        public final void a() {
            if (this.f23416a.decrementAndGet() == 0) {
                this.f23417b.b();
            }
        }

        public final void b() {
            if (this.f23416a.decrementAndGet() == 0) {
                this.f23417b.b();
            }
        }

        public final void c() {
            if (this.f23416a.decrementAndGet() == 0) {
                this.f23417b.b();
            }
        }

        public final void d() {
            if (this.f23416a.decrementAndGet() == 0) {
                this.f23417b.b();
            }
        }
    }

    public nk0(Context context, w3 w3Var) {
        this.f23413a = new ik0(context, w3Var);
        this.f23414b = new ql0(context, w3Var);
    }

    public final void a() {
        this.f23414b.a();
        Objects.requireNonNull(this.f23413a);
        Objects.requireNonNull(this.f23415c);
    }

    public final void a(Context context, wh0 wh0Var, eq0 eq0Var, rk0 rk0Var) {
        b bVar = new b(rk0Var);
        this.f23414b.a(wh0Var, bVar);
        this.f23413a.a(wh0Var, eq0Var, bVar);
        this.f23415c.a(context, wh0Var, bVar);
    }
}
