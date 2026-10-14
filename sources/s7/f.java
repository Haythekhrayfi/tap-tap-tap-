package s7;

import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import y9.a3;
import y9.f7;
import y9.g0;
import y9.r4;
import y9.t2;
import y9.w0;
import y9.x6;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f35475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f35476b;

    public f(l lVar) {
        j0.i(lVar, "patch");
        this.f35475a = lVar;
        this.f35476b = new LinkedHashSet();
    }

    public final List<y9.k> a(y9.k kVar, v9.d dVar) {
        y9.k pVar;
        g0 g0VarA;
        List<y9.k> list;
        String id2 = kVar.a().getId();
        if (id2 != null && this.f35475a.f35483a.containsKey(id2)) {
            String id3 = kVar.a().getId();
            if (id3 == null || (list = this.f35475a.f35483a.get(id3)) == null) {
                return kc.k.a(kVar);
            }
            this.f35476b.add(id3);
            return list;
        }
        if (kVar instanceof y9.k.c) {
            w0 w0Var = ((y9.k.c) kVar).f40976c;
            List<y9.k> listB = b(w0Var.f43638t, dVar);
            j0.i(listB, "items");
            pVar = new y9.k.c(new w0(w0Var.f43619a, w0Var.f43620b, w0Var.f43621c, w0Var.f43622d, w0Var.f43623e, w0Var.f43624f, w0Var.f43625g, w0Var.f43626h, w0Var.f43627i, w0Var.f43628j, w0Var.f43629k, w0Var.f43630l, w0Var.f43631m, w0Var.f43632n, w0Var.f43633o, w0Var.f43634p, w0Var.f43635q, w0Var.f43636r, w0Var.f43637s, listB, w0Var.f43639u, w0Var.f43640v, w0Var.f43641w, w0Var.f43642x, w0Var.f43643y, w0Var.f43644z, w0Var.A, w0Var.B, w0Var.C, w0Var.D, w0Var.E, w0Var.F, w0Var.G, w0Var.H, w0Var.I, w0Var.J, w0Var.K, w0Var.L, w0Var.M));
        } else if (kVar instanceof y9.k.g) {
            a3 a3Var = ((y9.k.g) kVar).f40980c;
            List<y9.k> listB2 = b(a3Var.f39044t, dVar);
            j0.i(listB2, "items");
            pVar = new y9.k.g(new a3(a3Var.f39025a, a3Var.f39026b, a3Var.f39027c, a3Var.f39028d, a3Var.f39029e, a3Var.f39030f, a3Var.f39031g, a3Var.f39032h, a3Var.f39033i, a3Var.f39034j, a3Var.f39035k, a3Var.f39036l, a3Var.f39037m, a3Var.f39038n, a3Var.f39039o, a3Var.f39040p, a3Var.f39041q, a3Var.f39042r, a3Var.f39043s, listB2, a3Var.f39045u, a3Var.f39046v, a3Var.f39047w, a3Var.f39048x, a3Var.f39049y, a3Var.f39050z, a3Var.A, a3Var.B, a3Var.C, a3Var.D, a3Var.E, a3Var.F, a3Var.G, a3Var.H, a3Var.I));
        } else if (kVar instanceof y9.k.e) {
            t2 t2Var = ((y9.k.e) kVar).f40978c;
            List<y9.k> listB3 = b(t2Var.f42724r, dVar);
            j0.i(listB3, "items");
            pVar = new y9.k.e(new t2(t2Var.f42707a, t2Var.f42708b, t2Var.f42709c, t2Var.f42710d, t2Var.f42711e, t2Var.f42712f, t2Var.f42713g, t2Var.f42714h, t2Var.f42715i, t2Var.f42716j, t2Var.f42717k, t2Var.f42718l, t2Var.f42719m, t2Var.f42720n, t2Var.f42721o, t2Var.f42722p, t2Var.f42723q, listB3, t2Var.f42725s, t2Var.f42726t, t2Var.f42727u, t2Var.f42728v, t2Var.f42729w, t2Var.f42730x, t2Var.f42731y, t2Var.f42732z, t2Var.A, t2Var.B, t2Var.C, t2Var.D, t2Var.E, t2Var.F, t2Var.G, t2Var.H, t2Var.I));
        } else if (kVar instanceof y9.k.C0475k) {
            r4 r4Var = ((y9.k.C0475k) kVar).f40984c;
            List<y9.k> listB4 = b(r4Var.f42306o, dVar);
            j0.i(listB4, "items");
            pVar = new y9.k.C0475k(new r4(r4Var.f42292a, r4Var.f42293b, r4Var.f42294c, r4Var.f42295d, r4Var.f42296e, r4Var.f42297f, r4Var.f42298g, r4Var.f42299h, r4Var.f42300i, r4Var.f42301j, r4Var.f42302k, r4Var.f42303l, r4Var.f42304m, r4Var.f42305n, listB4, r4Var.f42307p, r4Var.f42308q, r4Var.f42309r, r4Var.f42310s, r4Var.f42311t, r4Var.f42312u, r4Var.f42313v, r4Var.f42314w, r4Var.f42315x, r4Var.f42316y, r4Var.f42317z, r4Var.A, r4Var.B, r4Var.C, r4Var.D, r4Var.E, r4Var.F));
        } else if (kVar instanceof y9.k.o) {
            x6 x6Var = ((y9.k.o) kVar).f40988c;
            List<x6.f> list2 = x6Var.f44147s;
            ArrayList arrayList = new ArrayList();
            for (x6.f fVar : list2) {
                y9.k kVar2 = fVar.f44164c;
                String id4 = null;
                if (kVar2 != null && (g0VarA = kVar2.a()) != null) {
                    id4 = g0VarA.getId();
                }
                if (id4 != null) {
                    List<y9.k> list3 = this.f35475a.f35483a.get(id4);
                    if (list3 != null && list3.size() == 1) {
                        arrayList.add(new x6.f(fVar.f44162a, fVar.f44163b, list3.get(0), fVar.f44165d, fVar.f44166e));
                    } else if (list3 == null || !list3.isEmpty()) {
                    }
                    this.f35476b.add(id4);
                }
                arrayList.add(c(fVar, dVar));
            }
            j0.i(arrayList, "states");
            pVar = new y9.k.o(new x6(x6Var.f44129a, x6Var.f44130b, x6Var.f44131c, x6Var.f44132d, x6Var.f44133e, x6Var.f44134f, x6Var.f44135g, x6Var.f44136h, x6Var.f44137i, x6Var.f44138j, x6Var.f44139k, x6Var.f44140l, x6Var.f44141m, x6Var.f44142n, x6Var.f44143o, x6Var.f44144p, x6Var.f44145q, x6Var.f44146r, arrayList, x6Var.f44148t, x6Var.f44149u, x6Var.f44150v, x6Var.f44151w, x6Var.f44152x, x6Var.f44153y, x6Var.f44154z, x6Var.A, x6Var.B, x6Var.C, x6Var.D));
        } else if (kVar instanceof y9.k.p) {
            f7 f7Var = ((y9.k.p) kVar).f40989c;
            ArrayList arrayList2 = new ArrayList();
            for (f7.e eVar : f7Var.f40008o) {
                List<y9.k> listA = a(eVar.f40026a, dVar);
                if (listA.size() == 1) {
                    arrayList2.add(new f7.e(listA.get(0), eVar.f40027b, eVar.f40028c));
                } else {
                    arrayList2.add(eVar);
                }
            }
            j0.i(arrayList2, "items");
            pVar = new y9.k.p(new f7(f7Var.f39994a, f7Var.f39995b, f7Var.f39996c, f7Var.f39997d, f7Var.f39998e, f7Var.f39999f, f7Var.f40000g, f7Var.f40001h, f7Var.f40002i, f7Var.f40003j, f7Var.f40004k, f7Var.f40005l, f7Var.f40006m, f7Var.f40007n, arrayList2, f7Var.f40009p, f7Var.f40010q, f7Var.f40011r, f7Var.f40012s, f7Var.f40013t, f7Var.f40014u, f7Var.f40015v, f7Var.f40016w, f7Var.f40017x, f7Var.f40018y, f7Var.f40019z, f7Var.A, f7Var.B, f7Var.C, f7Var.D, f7Var.E, f7Var.F, f7Var.G, f7Var.H, f7Var.I, f7Var.J));
        } else {
            pVar = kVar;
        }
        return kc.k.a(pVar);
    }

    public final List<y9.k> b(List<? extends y9.k> list, v9.d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(a((y9.k) it.next(), dVar));
        }
        return arrayList;
    }

    public final x6.f c(x6.f fVar, v9.d dVar) {
        y9.k kVar = fVar.f44164c;
        List<y9.k> listA = kVar == null ? null : a(kVar, dVar);
        return listA != null && listA.size() == 1 ? new x6.f(fVar.f44162a, fVar.f44163b, listA.get(0), fVar.f44165d, fVar.f44166e) : fVar;
    }
}
