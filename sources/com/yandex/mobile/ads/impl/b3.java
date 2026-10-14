package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w2 f19090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p40 f19091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w50 f19092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d3 f19093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ec1 f19094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a3 f19095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final z2 f19096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final eq0 f19097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o50 f19098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19100k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19101l;

    public final class a implements dm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d3 f19102a;

        private a(d3 d3Var) {
            this.f19102a = d3Var;
        }

        public /* synthetic */ a(b3 b3Var, d3 d3Var, int i10) {
            this(d3Var);
        }

        public final void a() {
            d3 d3Var = b3.this.f19093d;
            Objects.requireNonNull(d3Var);
            if (b3.this.f19090a.e() != null) {
                b3.this.f19096g.a();
            } else {
                b3.this.f19091b.a();
                d3Var.a();
            }
        }

        public final void a(sc1 sc1Var) {
            if (b3.this.f19090a.a((sc1<VideoAd>) sc1Var).b().a() == ce1.f19485j) {
                b3.this.f19095f.c();
                d3 d3Var = b3.this.f19093d;
                Objects.requireNonNull(d3Var);
                b3.this.f19091b.a();
                d3Var.c();
                return;
            }
            d3 d3Var2 = b3.this.f19093d;
            Objects.requireNonNull(d3Var2);
            if (b3.this.f19090a.e() != null) {
                b3.this.f19096g.a();
            } else {
                b3.this.f19091b.a();
                d3Var2.b();
            }
        }

        public final void b() {
            t1.a aVar = (t1.a) this.f19102a;
            if (t1.this.f25223b.a(t1.this.f25222a).equals(w1.f26131h)) {
                t1.this.f25223b.a(t1.this.f25222a, w1.f26130g);
            }
        }

        public final void c() {
            if (!b3.this.f19101l) {
                b3.this.f19101l = true;
                t1.a aVar = (t1.a) this.f19102a;
                boolean z10 = t1.this.f25228g;
                t1.this.f25228g = false;
                if (w1.f26125b.equals(t1.this.f25223b.a(t1.this.f25222a))) {
                    t1.this.f25223b.a(t1.this.f25222a, w1.f26126c);
                    if (z10) {
                        t1.e(t1.this);
                    } else if (t1.this.f25227f != null) {
                        t1.this.f25227f.a();
                    }
                }
            }
            t1.a aVar2 = (t1.a) this.f19102a;
            if (w1.f26125b.equals(t1.this.f25223b.a(t1.this.f25222a))) {
                t1.this.f25223b.a(t1.this.f25222a, w1.f26126c);
            }
            if (b3.this.f19099j) {
                b3.this.f19099j = false;
                b3.this.d();
            }
        }

        public final void d() {
            t1.a aVar = (t1.a) this.f19102a;
            if (t1.this.f25223b.a(t1.this.f25222a).equals(w1.f26130g)) {
                t1.this.f25223b.a(t1.this.f25222a, w1.f26131h);
            }
        }

        public final void e() {
            if (b3.this.f19098i.d()) {
                b3.this.f19095f.c();
                b3.this.f19090a.a();
            }
            d3 d3Var = b3.this.f19093d;
            Objects.requireNonNull(d3Var);
            if (b3.this.f19090a.e() != null) {
                b3.this.f19096g.a();
            } else {
                b3.this.f19091b.a();
                d3Var.a();
            }
        }

        public final void f() {
            if (!b3.this.f19100k) {
                b3.this.f19100k = true;
                t1.a aVar = (t1.a) this.f19102a;
                if (t1.this.f25223b.a(t1.this.f25222a).equals(w1.f26126c)) {
                    t1.this.f25223b.a(t1.this.f25222a, w1.f26131h);
                    t1.this.f25226e.c();
                    if (t1.this.f25227f != null) {
                        t1.this.f25227f.b();
                    }
                }
            }
            b3.this.f19099j = false;
            b3.h(b3.this);
            t1.a aVar2 = (t1.a) this.f19102a;
            if (t1.this.f25223b.a(t1.this.f25222a).equals(w1.f26126c)) {
                t1.this.f25223b.a(t1.this.f25222a, w1.f26131h);
            }
        }

        public final void g() {
            if (b3.this.f19090a.e() != null) {
                b3.this.f19091b.a();
                return;
            }
            d3 d3Var = b3.this.f19093d;
            Objects.requireNonNull(d3Var);
            b3.this.f19091b.a();
            d3Var.a();
        }
    }

    public b3(Context context, w50 w50Var, d40 d40Var, p40 p40Var, s40 s40Var, d3 d3Var) {
        this.f19092c = w50Var;
        this.f19091b = p40Var;
        this.f19093d = d3Var;
        eq0 eq0Var = new eq0();
        this.f19097h = eq0Var;
        ec1 ec1Var = new ec1();
        this.f19094e = ec1Var;
        c3 c3Var = new c3(new l2(p40Var, ec1Var), new a(this, d3Var, 0));
        w2 w2VarA = new x2(context, w50Var, d40Var, eq0Var, s40Var, c3Var).a();
        this.f19090a = w2VarA;
        c3Var.a(w2VarA);
        this.f19095f = new a3(w2VarA);
        this.f19096g = new z2(w2VarA, p40Var, d3Var, this);
        this.f19098i = o50.a();
    }

    public static void h(b3 b3Var) {
        sc1<VideoAd> sc1VarB = b3Var.f19090a.b();
        eg1 eg1VarD = b3Var.f19090a.d();
        if (sc1VarB == null || eg1VarD == null) {
            x60.c("Failed to show UI for ad group item", new Object[0]);
        } else {
            b3Var.f19091b.a(b3Var.f19092c, sc1VarB, eg1VarD, b3Var.f19094e, b3Var.f19097h);
        }
    }

    public final void a() {
        s50 s50VarC = this.f19090a.c();
        if (s50VarC != null) {
            s50VarC.a();
        }
        this.f19095f.a();
        this.f19099j = false;
        this.f19101l = false;
        this.f19100k = false;
    }

    public final void a(dc1 dc1Var) {
        this.f19094e.a(dc1Var);
    }

    public final void b() {
        this.f19099j = true;
    }

    public final void c() {
        s50 s50VarC = this.f19090a.c();
        if (s50VarC != null) {
            s50VarC.b();
        } else {
            x60.c("Failed to pause ad group item", new Object[0]);
        }
    }

    public final void d() {
        s50 s50VarC = this.f19090a.c();
        if (s50VarC != null) {
            this.f19099j = false;
            s50VarC.c();
        } else {
            x60.c("Failed to start ad group item", new Object[0]);
        }
        this.f19095f.b();
    }

    public final void e() {
        s50 s50VarC = this.f19090a.c();
        if (s50VarC != null) {
            s50VarC.d();
        } else {
            x60.c("Failed to prepare ad group item", new Object[0]);
        }
    }

    public final void f() {
        sc1<VideoAd> sc1VarB = this.f19090a.b();
        eg1 eg1VarD = this.f19090a.d();
        if (sc1VarB == null || eg1VarD == null) {
            x60.c("Failed to show UI for ad group item", new Object[0]);
        } else {
            this.f19091b.a(this.f19092c, sc1VarB, eg1VarD, this.f19094e, this.f19097h);
        }
        s50 s50VarC = this.f19090a.c();
        if (s50VarC != null) {
            s50VarC.f();
        } else {
            x60.c("Failed to resume ad group item", new Object[0]);
        }
    }

    public final void g() {
        s50 s50VarC = this.f19090a.c();
        if (s50VarC != null) {
            s50VarC.g();
        } else {
            x60.c("Failed to stop ad group item", new Object[0]);
        }
        this.f19095f.c();
    }
}
