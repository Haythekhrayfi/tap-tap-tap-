package u7;

import fd.j0;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jc.w;
import p7.h;
import p7.j;
import uc.l;
import w7.i;
import x1.q;
import x8.n;
import y9.e8;
import y9.l1;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w7.a f36050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f36051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q8.e f36052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f36053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Object, d> f36054e;

    public f(w7.a aVar, j jVar, q8.e eVar, h hVar) {
        j0.i(aVar, "globalVariableController");
        j0.i(jVar, "divActionHandler");
        j0.i(eVar, "errorCollectors");
        j0.i(hVar, "logger");
        this.f36050a = aVar;
        this.f36051b = jVar;
        this.f36052c = eVar;
        this.f36053d = hVar;
        this.f36054e = Collections.synchronizedMap(new LinkedHashMap());
    }

    public d a(o7.a aVar, l1 l1Var) {
        boolean z10;
        j0.i(aVar, "tag");
        Map<Object, d> map = this.f36054e;
        j0.h(map, "runtimes");
        String str = aVar.f33995a;
        d dVar = map.get(str);
        if (dVar == null) {
            q8.d dVarA = this.f36052c.a(aVar, l1Var);
            final w7.h hVar = new w7.h();
            List<e8> list = l1Var.f41202f;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        hVar.a(q.m((e8) it.next()));
                    } catch (w8.e e10) {
                        dVarA.a(e10);
                    }
                }
            }
            i iVar = this.f36050a.f37138c;
            j0.i(iVar, "source");
            l<w8.d, w> lVar = hVar.f37158e;
            j0.i(lVar, "observer");
            for (w8.d dVar2 : iVar.f37160a.values()) {
                Objects.requireNonNull(dVar2);
                dVar2.f37170a.b(lVar);
            }
            w7.g gVar = new w7.g(hVar);
            k9.j<l<w8.d, w>> jVar = iVar.f37162c;
            synchronized (jVar.f31953a) {
                jVar.f31953a.add(gVar);
            }
            hVar.f37155b.add(iVar);
            final int i10 = 0;
            a aVar2 = new a(new y8.d(new n() { // from class: u7.e
                @Override // x8.n
                public final Object get(String str2) {
                    switch (i10) {
                        case 0:
                            w7.h hVar2 = hVar;
                            j0.i(hVar2, "$variableController");
                            j0.i(str2, "variableName");
                            w8.d dVarB = hVar2.b(str2);
                            if (dVarB == null) {
                                return null;
                            }
                            return dVarB.b();
                        default:
                            w7.h hVar3 = hVar;
                            j0.i(hVar3, "$variableController");
                            j0.i(str2, "name");
                            w8.d dVarB2 = hVar3.b(str2);
                            Object objB = dVarB2 == null ? null : dVarB2.b();
                            if (objB != null) {
                                return objB;
                            }
                            throw new x8.b(j0.p("Unknown variable ", str2), null, 2, null);
                    }
                }
            }));
            c cVar = new c(hVar, aVar2, dVarA);
            final int i11 = 1;
            d dVar3 = new d(cVar, hVar, new v7.c(l1Var.f41201e, hVar, cVar, this.f36051b, new x8.f(new n() { // from class: u7.e
                @Override // x8.n
                public final Object get(String str2) {
                    switch (i11) {
                        case 0:
                            w7.h hVar2 = hVar;
                            j0.i(hVar2, "$variableController");
                            j0.i(str2, "variableName");
                            w8.d dVarB = hVar2.b(str2);
                            if (dVarB == null) {
                                return null;
                            }
                            return dVarB.b();
                        default:
                            w7.h hVar3 = hVar;
                            j0.i(hVar3, "$variableController");
                            j0.i(str2, "name");
                            w8.d dVarB2 = hVar3.b(str2);
                            Object objB = dVarB2 == null ? null : dVarB2.b();
                            if (objB != null) {
                                return objB;
                            }
                            throw new x8.b(j0.p("Unknown variable ", str2), null, 2, null);
                    }
                }
            }, aVar2.f36033a), dVarA, this.f36053d));
            map.put(str, dVar3);
            dVar = dVar3;
        }
        d dVar4 = dVar;
        q8.d dVarA2 = this.f36052c.a(aVar, l1Var);
        w7.h hVar2 = dVar4.f36046b;
        List<e8> list2 = l1Var.f41202f;
        if (list2 != null) {
            for (e8 e8Var : list2) {
                w8.d dVarB = hVar2.b(u1.a.b(e8Var));
                if (dVarB == null) {
                    try {
                        hVar2.a(q.m(e8Var));
                    } catch (w8.e e11) {
                        dVarA2.a(e11);
                    }
                } else {
                    if (e8Var instanceof e8.a) {
                        z10 = dVarB instanceof w8.d.a;
                    } else if (e8Var instanceof e8.f) {
                        z10 = dVarB instanceof w8.d.e;
                    } else if (e8Var instanceof e8.g) {
                        z10 = dVarB instanceof w8.d.C0447d;
                    } else if (e8Var instanceof e8.h) {
                        z10 = dVarB instanceof w8.d.f;
                    } else if (e8Var instanceof e8.b) {
                        z10 = dVarB instanceof w8.d.b;
                    } else if (e8Var instanceof e8.i) {
                        z10 = dVarB instanceof w8.d.g;
                    } else {
                        if (!(e8Var instanceof e8.e)) {
                            throw new jc.g();
                        }
                        z10 = dVarB instanceof w8.d.c;
                    }
                    if (!z10) {
                        StringBuilder sbA = defpackage.a.a("\n                           Variable inconsistency detected!\n                           at DivData: ");
                        sbA.append(u1.a.b(e8Var));
                        sbA.append(" (");
                        sbA.append(e8Var);
                        sbA.append(")\n                           at VariableController: ");
                        sbA.append(hVar2.b(u1.a.b(e8Var)));
                        sbA.append("\n                        ");
                        dVarA2.a(new IllegalArgumentException(ed.j.c(sbA.toString())));
                    }
                }
            }
        }
        return dVar4;
    }
}
