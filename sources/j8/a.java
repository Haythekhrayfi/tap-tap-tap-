package j8;

import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc.t;
import kc.w;
import y9.g0;
import y9.i1;
import y9.l1;
import y9.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(List<? extends y9.k> list, List<? extends y9.k> list2, v9.d dVar) {
        if (list.size() != list2.size()) {
            return false;
        }
        ArrayList<jc.h> arrayList = (ArrayList) t.M(list, list2);
        if (!arrayList.isEmpty()) {
            for (jc.h hVar : arrayList) {
                if (!b((y9.k) hVar.f31811c, (y9.k) hVar.f31812d, dVar)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean b(y9.k kVar, y9.k kVar2, v9.d dVar) {
        j0.i(dVar, "resolver");
        if (!j0.d(kVar == null ? null : kVar.getClass(), kVar2 != null ? kVar2.getClass() : null)) {
            return false;
        }
        if (kVar == null || kVar2 == null || kVar == kVar2) {
            return true;
        }
        return c(kVar.a(), kVar2.a(), dVar) && a(d(kVar), d(kVar2), dVar);
    }

    public static final boolean c(g0 g0Var, g0 g0Var2, v9.d dVar) {
        if (g0Var.getId() != null && g0Var2.getId() != null && !j0.d(g0Var.getId(), g0Var2.getId())) {
            return false;
        }
        if ((g0Var instanceof i1) && (g0Var2 instanceof i1) && !j0.d(((i1) g0Var).f40541i, ((i1) g0Var2).f40541i)) {
            return false;
        }
        return ((g0Var instanceof w0) && (g0Var2 instanceof w0) && l8.b.H((w0) g0Var, dVar) != l8.b.H((w0) g0Var2, dVar)) ? false : true;
    }

    public static final List<y9.k> d(y9.k kVar) {
        if (kVar instanceof y9.k.c) {
            return ((y9.k.c) kVar).f40976c.f43638t;
        }
        if (kVar instanceof y9.k.g) {
            return ((y9.k.g) kVar).f40980c.f39044t;
        }
        if ((kVar instanceof y9.k.h) || (kVar instanceof y9.k.f) || (kVar instanceof y9.k.q) || (kVar instanceof y9.k.m) || (kVar instanceof y9.k.e) || (kVar instanceof y9.k.C0475k) || (kVar instanceof y9.k.p) || (kVar instanceof y9.k.o) || (kVar instanceof y9.k.d) || (kVar instanceof y9.k.j) || (kVar instanceof y9.k.l) || (kVar instanceof y9.k.i) || (kVar instanceof y9.k.n) || (kVar instanceof y9.k.r)) {
            return w.f32009c;
        }
        throw new jc.g();
    }

    public static final boolean e(l1 l1Var, l1 l1Var2, long j10, v9.d dVar) {
        Object obj;
        Object next;
        j0.i(dVar, "resolver");
        if (l1Var == null) {
            return false;
        }
        Iterator<T> it = l1Var.f41198b.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((l1.c) next).f41208b == j10));
        l1.c cVar = (l1.c) next;
        if (cVar == null) {
            return false;
        }
        for (Object obj2 : l1Var2.f41198b) {
            if (((l1.c) obj2).f41208b == j10) {
                obj = obj2;
                break;
            }
        }
        l1.c cVar2 = (l1.c) obj;
        if (cVar2 == null) {
            return false;
        }
        return b(cVar.f41207a, cVar2.f41207a, dVar);
    }
}
