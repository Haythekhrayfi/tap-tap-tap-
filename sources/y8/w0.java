package y8;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 implements x8.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, List<x8.h>> f38903a = new LinkedHashMap();

    @Override // x8.j
    public x8.h a(String str, List<? extends x8.e> list) {
        Object next;
        fd.j0.i(str, "name");
        List<x8.h> list2 = this.f38903a.get(str);
        if (list2 == null) {
            throw new x8.b(l8.a1.a("Unknown function name: ", str, CoreConstants.DOT), null, 2, null);
        }
        List<x8.h> list3 = list2;
        if (list3.size() != 1) {
            Iterator<T> it = list3.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fd.j0.d(((x8.h) next).g(list), x8.h.c.b.f37566a));
            x8.h hVar = (x8.h) next;
            if (hVar != null) {
                return hVar;
            }
            if (list.isEmpty()) {
                throw new x8.b(androidx.activity.j.a("Non empty argument list is required for function '", str, "'."), null, 2, null);
            }
            throw new x8.b(s.a.a(androidx.activity.result.c.a("Function '", str, "' has no matching override for given argument types: "), kc.t.w(list, ", ", null, null, 0, null, x8.d.f37554c, 30), CoreConstants.DOT), null, 2, null);
        }
        x8.h hVar2 = (x8.h) kc.t.r(list3);
        x8.h.c cVarG = hVar2.g(list);
        if (cVarG instanceof x8.h.c.b) {
            return hVar2;
        }
        if (cVarG instanceof x8.h.c.C0463c) {
            StringBuilder sbA = androidx.activity.result.c.a("Too few arguments passed to function '", str, "': expected ");
            x8.h.c.C0463c c0463c = (x8.h.c.C0463c) cVarG;
            sbA.append(c0463c.f37567a);
            sbA.append(", got ");
            throw new x8.b(h0.f.a(sbA, c0463c.f37568b, CoreConstants.DOT), null, 2, null);
        }
        if (cVarG instanceof x8.h.c.d) {
            StringBuilder sbA2 = androidx.activity.result.c.a("Too many arguments passed to function '", str, "': expected ");
            x8.h.c.d dVar = (x8.h.c.d) cVarG;
            sbA2.append(dVar.f37569a);
            sbA2.append(", got ");
            throw new x8.b(h0.f.a(sbA2, dVar.f37570b, CoreConstants.DOT), null, 2, null);
        }
        if (!(cVarG instanceof x8.h.c.a)) {
            throw new jc.g();
        }
        StringBuilder sbA3 = androidx.activity.result.c.a("Call of function '", str, "' has argument type mismatch: expected ");
        x8.h.c.a aVar = (x8.h.c.a) cVarG;
        sbA3.append(aVar.f37564a);
        sbA3.append(", got ");
        sbA3.append(aVar.f37565b);
        sbA3.append(CoreConstants.DOT);
        throw new x8.b(sbA3.toString(), null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0136  */
    public final void b(x8.h hVar) {
        fd.j0.i(hVar, "function");
        Map<String, List<x8.h>> map = this.f38903a;
        String strC = hVar.c();
        List<x8.h> arrayList = map.get(strC);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(strC, arrayList);
        }
        List<x8.h> list = arrayList;
        if (list.contains(hVar)) {
            return;
        }
        fd.j0.i(hVar, "function");
        List<x8.i> listB = hVar.b();
        int iB = kc.l.b(listB);
        int i10 = 0;
        while (i10 < iB) {
            int i11 = i10 + 1;
            if (listB.get(i10).f37573b) {
                throw new x8.b("Variadic argument allowed at the end of list only", null, 2, null);
            }
            i10 = i11;
        }
        fd.j0.i(hVar, "nonValidatedFunction");
        fd.j0.i(list, "overloadedFunctions");
        for (x8.h hVar2 : list) {
            boolean z10 = true;
            if (!fd.j0.d(hVar.c(), hVar2.c())) {
                z10 = false;
                break;
                break;
            }
            List<x8.i> listB2 = hVar.b().size() < hVar2.b().size() ? hVar.b() : hVar2.b();
            List<x8.i> listB3 = fd.j0.d(listB2, hVar.b()) ? hVar2.b() : hVar.b();
            if (listB2.isEmpty()) {
                x8.i iVar = (x8.i) kc.t.s(listB3);
                if (!(iVar != null && iVar.f37573b)) {
                    z10 = false;
                    break;
                }
            } else {
                int iB2 = kc.l.b(listB2);
                int i12 = 0;
                while (true) {
                    if (i12 < iB2) {
                        int i13 = i12 + 1;
                        if (listB2.get(i12).f37572a == listB3.get(i12).f37572a) {
                            i12 = i13;
                        }
                    } else {
                        if (((x8.i) kc.t.x(listB2)).f37573b) {
                            x8.e eVar = ((x8.i) kc.t.x(listB2)).f37572a;
                            int iB3 = kc.l.b(listB2);
                            int size = listB3.size();
                            while (iB3 < size) {
                                int i14 = iB3 + 1;
                                if (listB3.get(iB3).f37572a == eVar) {
                                    iB3 = i14;
                                }
                            }
                            break;
                        }
                        if (listB2.size() == listB3.size()) {
                            if (((x8.i) kc.t.x(listB2)).f37572a == ((x8.i) kc.t.x(listB3)).f37572a) {
                                break;
                            } else {
                                break;
                            }
                        } else if (listB3.size() == listB2.size() + 1) {
                            z10 = true ^ ((x8.i) kc.t.x(listB3)).f37573b;
                            break;
                        }
                    }
                    z10 = false;
                    break;
                    break;
                }
            }
            if (z10) {
                throw new x8.b("Function " + hVar2 + " has conflict with " + hVar2, null, 2, null);
            }
        }
        list.add(hVar);
    }
}
