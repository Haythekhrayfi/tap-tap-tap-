package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class f01 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h01.a f20475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h01 f20476c;

    public class a implements rz0.a {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.rz0.a
        public final void a() {
            h01.h(f01.this.f20476c);
            wr wrVarA = f01.this.f20476c.f21273l.a();
            if0.a();
            f01 f01Var = f01.this;
            f01Var.f20475b.a(f01Var.f20476c.f21270i, wrVarA);
        }

        @Override // com.yandex.mobile.ads.impl.rz0.a
        public final void a(bi1 bi1Var) {
            Objects.requireNonNull(f01.this.f20476c.f21272k);
            f01.this.f20475b.a(bi1Var instanceof p2 ? u2.a(null, ((p2) bi1Var).a()) : v4.f25820c);
        }
    }

    public f01(h01 h01Var, h01.a aVar) {
        this.f20476c = h01Var;
        this.f20475b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20476c.f21269h.a(this.f20476c.f21271j, new a());
    }
}
