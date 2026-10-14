package com.yandex.mobile.ads.instream;

import android.content.Context;
import com.yandex.mobile.ads.impl.d40;
import com.yandex.mobile.ads.impl.dk;
import com.yandex.mobile.ads.impl.ec1;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.n50;
import com.yandex.mobile.ads.impl.r5;
import com.yandex.mobile.ads.impl.s40;
import com.yandex.mobile.ads.impl.s5;
import com.yandex.mobile.ads.impl.u5;
import com.yandex.mobile.ads.impl.v50;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d40 f27472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f27473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f27474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s5 f27475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u5 f27476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u5 f27477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u5 f27478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ec1 f27479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private r5 f27480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g60 f27481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f27482k;

    public class a implements u5 {
        private a() {
        }

        public /* synthetic */ a(b bVar, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.u5
        public final void a() {
            b.this.e();
        }

        @Override // com.yandex.mobile.ads.impl.u5
        public final void b() {
            b.c(b.this);
        }

        @Override // com.yandex.mobile.ads.impl.u5
        public final void c() {
            b.f(b.this);
        }
    }

    /* JADX INFO: renamed from: com.yandex.mobile.ads.instream.b$b, reason: collision with other inner class name */
    public class C0212b implements u5 {
        private C0212b() {
        }

        public /* synthetic */ C0212b(b bVar, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.u5
        public final void a() {
            b.g(b.this);
        }

        @Override // com.yandex.mobile.ads.impl.u5
        public final void b() {
            b.c(b.this);
        }

        @Override // com.yandex.mobile.ads.impl.u5
        public final void c() {
            b.g(b.this);
        }
    }

    public class c implements u5 {
        private c() {
        }

        public /* synthetic */ c(b bVar, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.u5
        public final void a() {
            b.this.f27482k = false;
            b.e(b.this);
        }

        @Override // com.yandex.mobile.ads.impl.u5
        public final void b() {
            boolean z10 = b.this.f27482k;
            b.this.f27482k = false;
            if (z10) {
                b.c(b.this);
            } else if (b.this.f27481j != null) {
                ((n50) b.this.f27481j).c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.u5
        public final void c() {
            b.e(b.this);
        }
    }

    public b(Context context, v50 v50Var, d40 d40Var, s40 s40Var, e eVar) {
        this.f27472a = d40Var;
        this.f27473b = eVar;
        ec1 ec1Var = new ec1();
        this.f27479h = ec1Var;
        d dVar = new d(eVar, this);
        this.f27474c = dVar;
        this.f27475d = new s5(context, v50Var, d40Var, s40Var, eVar, dVar, ec1Var);
        int i10 = 0;
        this.f27476e = new c(this, i10);
        this.f27477f = new a(this, i10);
        this.f27478g = new C0212b(this, i10);
    }

    public static void c(b bVar) {
        r5 r5Var = bVar.f27480i;
        if (r5Var != null) {
            r5Var.h();
        }
    }

    public static void e(b bVar) {
        r5 r5VarA = bVar.f27475d.a();
        bVar.f27480i = r5VarA;
        r5VarA.a(bVar.f27477f);
        bVar.f27480i.f();
    }

    public static void f(b bVar) {
        r5 r5VarB = bVar.f27475d.b();
        bVar.f27480i = r5VarB;
        if (r5VarB != null) {
            r5VarB.a(bVar.f27478g);
            bVar.f27480i.f();
            return;
        }
        g60 g60Var = bVar.f27481j;
        if (g60Var != null) {
            ((n50) g60Var).d();
        }
        bVar.f27473b.h();
        bVar.f27472a.b();
    }

    public static void g(b bVar) {
        g60 g60Var = bVar.f27481j;
        if (g60Var != null) {
            ((n50) g60Var).d();
        }
        bVar.f27473b.h();
        bVar.f27472a.b();
    }

    public final void a() {
        this.f27474c.a();
    }

    public final void a(dk dkVar) {
        this.f27479h.a(dkVar);
    }

    public final void a(n50 n50Var) {
        this.f27481j = n50Var;
    }

    public final void b() {
        r5 r5Var = this.f27480i;
        if (r5Var != null) {
            r5Var.g();
            return;
        }
        g60 g60Var = this.f27481j;
        if (g60Var != null) {
            ((n50) g60Var).d();
        }
        this.f27473b.h();
        this.f27472a.b();
    }

    public final void c() {
        r5 r5Var = this.f27480i;
        if (r5Var != null) {
            r5Var.d();
        }
        this.f27472a.b();
    }

    public final void d() {
        c();
        this.f27473b.h();
        this.f27474c.b();
    }

    public final void e() {
        g60 g60Var = this.f27481j;
        if (g60Var != null) {
            ((n50) g60Var).e();
        }
        this.f27473b.h();
        this.f27472a.b();
    }

    public final void f() {
        if (this.f27480i != null) {
            this.f27474c.c();
            r5 r5Var = this.f27480i;
            if (r5Var != null) {
                r5Var.h();
                return;
            }
            return;
        }
        r5 r5VarC = this.f27475d.c();
        this.f27480i = r5VarC;
        if (r5VarC != null) {
            r5VarC.a(this.f27476e);
            this.f27474c.c();
            this.f27482k = true;
        } else {
            r5 r5VarA = this.f27475d.a();
            this.f27480i = r5VarA;
            r5VarA.a(this.f27477f);
        }
        this.f27480i.f();
    }

    public final void g() {
        this.f27473b.a(this.f27474c);
        this.f27474c.d();
    }

    public final void h() {
        g60 g60Var;
        if (this.f27480i == null) {
            r5 r5VarC = this.f27475d.c();
            this.f27480i = r5VarC;
            if (r5VarC != null) {
                r5VarC.a(this.f27476e);
                this.f27482k = false;
                this.f27480i.f();
                return;
            } else {
                g60Var = this.f27481j;
                if (g60Var == null) {
                    return;
                }
            }
        } else {
            g60Var = this.f27481j;
            if (g60Var == null) {
                return;
            }
        }
        ((n50) g60Var).c();
    }

    public final void i() {
        r5 r5Var = this.f27480i;
        if (r5Var != null) {
            r5Var.g();
        }
    }

    public final void j() {
        this.f27474c.f();
        r5 r5Var = this.f27480i;
        if (r5Var != null) {
            r5Var.e();
        }
    }
}
