package f9;

import fd.j0;
import jc.g;
import v9.d;
import y9.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> {
    public abstract T a(k kVar, d dVar);

    public T b(k.c cVar, d dVar) {
        return a(cVar, dVar);
    }

    public T c(k.d dVar, d dVar2) {
        return a(dVar, dVar2);
    }

    public T d(k.e eVar, d dVar) {
        return a(eVar, dVar);
    }

    public T e(k.f fVar, d dVar) {
        return a(fVar, dVar);
    }

    public T f(k.g gVar, d dVar) {
        return a(gVar, dVar);
    }

    public T g(k.h hVar, d dVar) {
        return a(hVar, dVar);
    }

    public T h(k.C0475k c0475k, d dVar) {
        return a(c0475k, dVar);
    }

    public T i(k.m mVar, d dVar) {
        return a(mVar, dVar);
    }

    public T j(k.o oVar, d dVar) {
        return a(oVar, dVar);
    }

    public T k(k.p pVar, d dVar) {
        return a(pVar, dVar);
    }

    public T l(k.q qVar, d dVar) {
        return a(qVar, dVar);
    }

    public final T m(k kVar, d dVar) {
        j0.i(kVar, "div");
        j0.i(dVar, "resolver");
        if (kVar instanceof k.q) {
            return l((k.q) kVar, dVar);
        }
        if (kVar instanceof k.h) {
            return g((k.h) kVar, dVar);
        }
        if (kVar instanceof k.f) {
            return e((k.f) kVar, dVar);
        }
        if (kVar instanceof k.m) {
            return i((k.m) kVar, dVar);
        }
        if (kVar instanceof k.c) {
            return b((k.c) kVar, dVar);
        }
        if (kVar instanceof k.g) {
            return f((k.g) kVar, dVar);
        }
        if (kVar instanceof k.e) {
            return d((k.e) kVar, dVar);
        }
        if (kVar instanceof k.C0475k) {
            return h((k.C0475k) kVar, dVar);
        }
        if (kVar instanceof k.p) {
            return k((k.p) kVar, dVar);
        }
        if (kVar instanceof k.o) {
            return j((k.o) kVar, dVar);
        }
        if (kVar instanceof k.d) {
            return c((k.d) kVar, dVar);
        }
        if (kVar instanceof k.i) {
            k.i iVar = (k.i) kVar;
            j0.i(iVar, "data");
            j0.i(dVar, "resolver");
            return a(iVar, dVar);
        }
        if (kVar instanceof k.n) {
            k.n nVar = (k.n) kVar;
            j0.i(nVar, "data");
            j0.i(dVar, "resolver");
            return a(nVar, dVar);
        }
        if (kVar instanceof k.j) {
            k.j jVar = (k.j) kVar;
            j0.i(jVar, "data");
            j0.i(dVar, "resolver");
            return a(jVar, dVar);
        }
        if (kVar instanceof k.l) {
            k.l lVar = (k.l) kVar;
            j0.i(lVar, "data");
            j0.i(dVar, "resolver");
            return a(lVar, dVar);
        }
        if (!(kVar instanceof k.r)) {
            throw new g();
        }
        k.r rVar = (k.r) kVar;
        j0.i(rVar, "data");
        j0.i(dVar, "resolver");
        return a(rVar, dVar);
    }
}
