package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class h01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f21263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w3 f21264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e1 f21265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t10 f21266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s10 f21267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k8 f21268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final rz0 f21269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d8 f21270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w01 f21271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final q2 f21272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final xr f21273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final m01 f21274m;

    public interface a {
        void a(d8 d8Var, wr wrVar);

        void a(t2 t2Var);
    }

    public h01(Context context, Executor executor, w3 w3Var) {
        Context applicationContext = context.getApplicationContext();
        this.f21262a = applicationContext;
        this.f21263b = executor;
        this.f21264c = w3Var;
        d8 d8Var = new d8();
        this.f21270i = d8Var;
        xr xrVarA = xr.a(applicationContext);
        this.f21273l = xrVarA;
        this.f21266e = new t10(xrVarA);
        this.f21267f = new s10(xrVarA.a(), i01.b());
        this.f21265d = c.a(context);
        this.f21268g = new k8();
        this.f21269h = new rz0(context, d8Var, xrVarA);
        this.f21271j = new w01();
        this.f21272k = new q2();
        this.f21274m = new m01(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar, r10 r10Var) {
        this.f21267f.a(this.f21262a, r10Var);
        this.f21264c.a(v3.f25804g);
        this.f21264c.b(v3.f25799b);
        this.f21263b.execute(new e01(this, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a aVar) {
        this.f21265d.a(new d01(this, aVar));
    }

    public static void b(h01 h01Var, a aVar) {
        h01Var.f21263b.execute(new f01(h01Var, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(a aVar) {
        this.f21266e.a(new com.applovin.exoplayer2.a.e(this, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(a aVar) {
        this.f21264c.b(v3.f25804g);
        this.f21263b.execute(new eo1(this, aVar, 1));
    }

    public static void h(h01 h01Var) {
        h01Var.f21263b.execute(new g01(h01Var));
    }

    public final void a() {
        this.f21265d.a();
        this.f21268g.a(this.f21262a);
        this.f21269h.a();
    }

    public final void a(a aVar) {
        this.f21263b.execute(new eo1(this, aVar, 0));
    }
}
