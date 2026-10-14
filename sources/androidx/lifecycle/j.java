package androidx.lifecycle;

import fd.j1;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f2212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.c f2213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f2214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f2215d;

    public j(i iVar, i.c cVar, d dVar, j1 j1Var) {
        fd.j0.i(iVar, "lifecycle");
        fd.j0.i(cVar, "minState");
        fd.j0.i(dVar, "dispatchQueue");
        fd.j0.i(j1Var, "parentJob");
        this.f2212a = iVar;
        this.f2213b = cVar;
        this.f2214c = dVar;
        p0.j jVar = new p0.j(this, j1Var);
        this.f2215d = jVar;
        if (iVar.b() != i.c.DESTROYED) {
            iVar.a(jVar);
        } else {
            j1Var.c(null);
            a();
        }
    }

    public final void a() {
        this.f2212a.c(this.f2215d);
        d dVar = this.f2214c;
        dVar.f2182b = true;
        dVar.b();
    }
}
