package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class e01 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h01.a f20019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h01 f20020c;

    public class a implements o8 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.o8
        public final void a(h8 h8Var) {
            e01.this.f20020c.f21264c.a(v3.f25799b);
            if (h8Var != null) {
                e01.this.f20020c.f21270i.a(h8Var.a());
                e01.this.f20020c.f21270i.b(h8Var.b());
                e01.this.f20020c.f21270i.a(h8Var.c());
            }
            e01 e01Var = e01.this;
            h01.b(e01Var.f20020c, e01Var.f20019b);
        }
    }

    public e01(h01 h01Var, h01.a aVar) {
        this.f20020c = h01Var;
        this.f20019b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20020c.f21268g.a(this.f20020c.f21262a, new a());
    }
}
