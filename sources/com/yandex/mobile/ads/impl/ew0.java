package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ew0 implements bd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fl0 f20347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sc1<vl0> f20348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xd1 f20349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f20350d = new a(this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private hd1 f20351e;

    public class a implements qd1 {
        private a() {
        }

        public /* synthetic */ a(ew0 ew0Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.qd1
        public final void a() {
        }

        @Override // com.yandex.mobile.ads.impl.qd1
        public final void a(pd1 pd1Var) {
            ew0.this.f20349c.b();
            ((ft) ew0.this.f20347a).a((qd1) null);
            ((ft) ew0.this.f20347a).f();
        }

        @Override // com.yandex.mobile.ads.impl.qd1
        public final void b() {
        }

        @Override // com.yandex.mobile.ads.impl.qd1
        public final void c() {
            ew0.this.f20349c.a();
            if (ew0.this.f20351e != null) {
                ew0.this.f20351e.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.qd1
        public final void d() {
            ew0.this.f20349c.b();
            ((ft) ew0.this.f20347a).a((qd1) null);
            if (ew0.this.f20351e != null) {
                ew0.this.f20351e.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.qd1
        public final void e() {
            ew0.this.f20349c.b();
            ((ft) ew0.this.f20347a).a((qd1) null);
        }

        @Override // com.yandex.mobile.ads.impl.qd1
        public final void f() {
        }

        @Override // com.yandex.mobile.ads.impl.qd1
        public final void g() {
            ew0.this.f20349c.b();
            ((ft) ew0.this.f20347a).a((qd1) null);
        }

        @Override // com.yandex.mobile.ads.impl.qd1
        public final void h() {
            ((ft) ew0.this.f20347a).j();
        }

        @Override // com.yandex.mobile.ads.impl.qd1
        public final void i() {
        }

        @Override // com.yandex.mobile.ads.impl.qd1
        public final void onVolumeChanged(float f10) {
        }
    }

    public ew0(ft ftVar, sc1 sc1Var, ud1 ud1Var) {
        this.f20347a = ftVar;
        this.f20348b = sc1Var;
        this.f20349c = new xd1(new hl0(ftVar), ud1Var);
    }

    @Override // com.yandex.mobile.ads.impl.bd1
    public final void a(hd1 hd1Var) {
        this.f20351e = hd1Var;
    }

    @Override // com.yandex.mobile.ads.impl.bd1
    public final void play() {
        ((ft) this.f20347a).a(this.f20350d);
        ((ft) this.f20347a).a(this.f20348b.c());
    }

    @Override // com.yandex.mobile.ads.impl.bd1
    public final void stop() {
        this.f20349c.b();
        ((ft) this.f20347a).i();
        ((ft) this.f20347a).l();
    }
}
