package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.SystemClock;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qc f14703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rc f14704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Nm f14705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uc f14706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M f14707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1523b3 f14708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Gd f14709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final E f14710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f14711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f14712j;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Pc.this.b();
            Pc.this.c();
        }
    }

    public class b implements Wj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Tc f14714a;

        public b(Pc pc2, Tc tc2) {
            this.f14714a = tc2;
        }

        @Override // com.yandex.metrica.impl.ob.Wj
        public void a(Collection<Vj> collection) {
            this.f14714a.a(C2120ym.a(collection));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Pc(Qc qc2) {
        Context context = qc2.f14773a.f18015a;
        Uc uc2 = qc2.f14777e;
        this(qc2, new Gd(context, uc2 == null ? null : uc2.f15149m));
    }

    private Pc(Qc qc2, Gd gd2) {
        this(qc2, new Rc(qc2.f14773a.f18015a), new Nm(), P0.i().d(), P0.i().c(), C1523b3.a(qc2.f14773a.f18015a), gd2, new R0.c());
    }

    public Pc(Qc qc2, Rc rc2, Nm nm, M m10, E e10, C1523b3 c1523b3, Gd gd2, R0.c cVar) {
        this.f14712j = new a();
        this.f14703a = qc2;
        this.f14704b = rc2;
        this.f14705c = nm;
        this.f14706d = qc2.f14777e;
        this.f14707e = m10;
        this.f14710h = e10;
        this.f14708f = c1523b3;
        this.f14709g = gd2;
        c1523b3.a().a(cVar.a(qc2.f14773a.f18016b, gd2, c1523b3.a()));
    }

    private void a() {
        Uc uc2 = this.f14706d;
        boolean z10 = uc2 != null && uc2.f15145i;
        if (this.f14711i != z10) {
            this.f14711i = z10;
            if (z10) {
                c();
            } else {
                this.f14703a.f14773a.f18016b.a(this.f14712j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Uc uc2 = this.f14706d;
        if (uc2 != null) {
            long j10 = uc2.f15144h;
            if (j10 > 0) {
                this.f14703a.f14773a.f18016b.a(this.f14712j, j10);
            }
        }
    }

    public void a(Uc uc2) {
        this.f14706d = uc2;
        this.f14709g.a(uc2 == null ? null : uc2.f15149m);
        a();
    }

    public void b() {
        Tc tc2 = new Tc();
        Objects.requireNonNull(this.f14705c);
        tc2.b(System.currentTimeMillis());
        Objects.requireNonNull(this.f14705c);
        tc2.a(SystemClock.elapsedRealtime());
        this.f14709g.b();
        tc2.b(Z2.a(this.f14708f.a().a()));
        this.f14703a.f14774b.a(new b(this, tc2));
        tc2.a(this.f14707e.b());
        tc2.a(Wc.a.a(this.f14710h.c()));
        this.f14704b.a(tc2);
        this.f14703a.f14775c.a();
        this.f14703a.f14776d.a();
    }

    public void d() {
        a();
    }

    public void e() {
        this.f14703a.f14773a.f18016b.a(this.f14712j);
    }
}
