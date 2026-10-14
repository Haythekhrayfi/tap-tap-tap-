package p0;

import fd.j1;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements androidx.lifecycle.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f34380c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f34381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f34382e;

    public /* synthetic */ j(androidx.lifecycle.j jVar, j1 j1Var) {
        this.f34381d = jVar;
        this.f34382e = j1Var;
    }

    public /* synthetic */ j(l lVar, n nVar) {
        this.f34381d = lVar;
        this.f34382e = nVar;
    }

    @Override // androidx.lifecycle.n
    public final void g(androidx.lifecycle.p pVar, androidx.lifecycle.i.b bVar) {
        switch (this.f34380c) {
            case 0:
                l lVar = (l) this.f34381d;
                n nVar = (n) this.f34382e;
                Objects.requireNonNull(lVar);
                if (bVar == androidx.lifecycle.i.b.ON_DESTROY) {
                    lVar.f(nVar);
                    return;
                }
                return;
            default:
                androidx.lifecycle.j jVar = (androidx.lifecycle.j) this.f34381d;
                j1 j1Var = (j1) this.f34382e;
                fd.j0.i(jVar, "this$0");
                fd.j0.i(j1Var, "$parentJob");
                fd.j0.i(pVar, "source");
                fd.j0.i(bVar, "<anonymous parameter 1>");
                if (pVar.getLifecycle().b() == androidx.lifecycle.i.c.DESTROYED) {
                    j1Var.c(null);
                    jVar.a();
                    return;
                }
                int iCompareTo = pVar.getLifecycle().b().compareTo(jVar.f2213b);
                androidx.lifecycle.d dVar = jVar.f2214c;
                if (iCompareTo < 0) {
                    dVar.f2181a = true;
                    return;
                } else {
                    if (dVar.f2181a) {
                        if (!(!dVar.f2182b)) {
                            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
                        }
                        dVar.f2181a = false;
                        dVar.b();
                        return;
                    }
                    return;
                }
        }
    }
}
