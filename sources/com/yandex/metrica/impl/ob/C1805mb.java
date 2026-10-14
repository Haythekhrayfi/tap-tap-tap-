package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1805mb implements InterfaceC1780lb<Bb> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1830nb f16886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1706ib f16887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Un f16888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1929rb f16889d;

    public C1805mb() {
        this(new C1830nb(), new C1706ib(), new Un(100), new C1929rb());
    }

    public C1805mb(C1830nb c1830nb, C1706ib c1706ib, Un un, C1929rb c1929rb) {
        this.f16886a = c1830nb;
        this.f16887b = c1706ib;
        this.f16888c = un;
        this.f16889d = c1929rb;
    }

    private Rf a(Rf rf) {
        Rf rf2 = new Rf();
        rf2.f14873b = rf.f14873b;
        Rf.h hVar = new Rf.h();
        rf2.f14878g = hVar;
        hVar.f14898b = new Rf.f();
        Rf.f fVar = rf2.f14878g.f14898b;
        Rf.f fVar2 = rf.f14878g.f14898b;
        fVar.f14891c = fVar2.f14891c;
        fVar.f14890b = fVar2.f14890b;
        fVar.f14894f = fVar2.f14894f;
        fVar.f14892d = fVar2.f14892d;
        return rf2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Object a(List<C1979tb<Rf, Fn>> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public List<C1979tb<Rf, Fn>> b(Object obj) {
        C1979tb<Rf.i, Fn> c1979tbB;
        Bb bb2 = (Bb) obj;
        Rf rf = new Rf();
        rf.f14873b = bb2.f13714b;
        rf.f14878g = new Rf.h();
        Cb cb2 = bb2.f13715c;
        Rf.f fVar = new Rf.f();
        fVar.f14890b = O2.c(cb2.f13767a);
        Qn<String, Fn> qnA = this.f16888c.a(cb2.f13768b);
        fVar.f14891c = O2.c(qnA.f14828a);
        fVar.f14894f = cb2.f13769c.size();
        Map<String, String> map = cb2.f13770d;
        if (map != null) {
            c1979tbB = this.f16886a.b(map);
            fVar.f14892d = c1979tbB.f17444a;
        } else {
            c1979tbB = null;
        }
        rf.f14878g.f14898b = fVar;
        Fn fnA = En.a(qnA, c1979tbB);
        List<Ab> list = cb2.f13769c;
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(this.f16889d);
        int iA = rf.f14873b != new Rf().f14873b ? C1519b.a(1, rf.f14873b) + 0 : 0;
        Rf.q qVar = rf.f14874c;
        if (qVar != null) {
            iA += C1519b.a(2, qVar);
        }
        Rf.o oVar = rf.f14875d;
        if (oVar != null) {
            iA += C1519b.a(3, oVar);
        }
        Rf.p pVar = rf.f14876e;
        int i10 = 4;
        if (pVar != null) {
            iA += C1519b.a(4, pVar);
        }
        Rf.b bVar = rf.f14877f;
        if (bVar != null) {
            iA += C1519b.a(5, bVar);
        }
        Rf.h hVar = rf.f14878g;
        if (hVar != null) {
            iA += C1519b.a(6, hVar);
        }
        ArrayList arrayList2 = new ArrayList();
        Rf rfA = a(rf);
        Fn fnA2 = fnA;
        int i11 = 0;
        int i12 = iA;
        while (i11 < list.size()) {
            Ab ab2 = list.get(i11);
            Rf.g gVar = new Rf.g();
            gVar.f14896b = i11;
            C1979tb<Rf.c, Fn> c1979tbB2 = this.f16887b.b(ab2);
            gVar.f14897c = c1979tbB2.f17444a;
            Objects.requireNonNull(this.f16889d);
            int iC = C1519b.c(i10);
            int iA2 = C1519b.a(gVar);
            int iB = iC + iA2 + ((iA2 & (-128)) == 0 ? 0 : C1519b.b(iA2));
            if (arrayList2.size() != 0 && i12 + iB > 204800) {
                rfA.f14878g.f14898b.f14893e = (Rf.g[]) arrayList2.toArray(new Rf.g[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new C1979tb(rfA, fnA2));
                fnA2 = fnA;
                i12 = iA;
                rfA = a(rf);
                arrayList2 = arrayList3;
            }
            arrayList2.add(gVar);
            fnA2 = En.a(fnA2, c1979tbB2);
            i12 += iB;
            i11++;
            i10 = 4;
        }
        rfA.f14878g.f14898b.f14893e = (Rf.g[]) arrayList2.toArray(new Rf.g[arrayList2.size()]);
        arrayList.add(new C1979tb(rfA, fnA2));
        return arrayList;
    }
}
