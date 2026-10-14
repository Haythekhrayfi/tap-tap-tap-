package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class my0<V extends ViewGroup> implements yo<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q0 f23174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z61 f23175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xk0 f23176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r0 f23177d;

    public static class a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final xk0 f23178a;

        public a(xk0 xk0Var) {
            this.f23178a = xk0Var;
        }

        @Override // com.yandex.mobile.ads.impl.r0
        public final void a() {
            this.f23178a.c();
        }

        @Override // com.yandex.mobile.ads.impl.r0
        public final void b() {
            this.f23178a.b();
        }
    }

    public my0(AdResponse<?> adResponse, q0 q0Var, z61 z61Var, lk0 lk0Var) {
        this.f23174a = q0Var;
        this.f23175b = z61Var;
        xk0 xk0Var = new xk0(adResponse, z61Var, lk0Var);
        this.f23176c = xk0Var;
        this.f23177d = new a(xk0Var);
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(V v10) {
        this.f23174a.a(this.f23177d);
        this.f23176c.a(this.f23175b.a(v10));
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
        this.f23174a.b(this.f23177d);
        this.f23176c.a();
    }
}
