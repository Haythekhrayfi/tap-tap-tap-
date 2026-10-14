package t8;

import android.view.View;
import fd.j0;
import i8.k;
import i8.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kc.l;
import kc.t;
import o8.r;
import y9.l1;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f35706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f35707b;

    public a(k kVar, u uVar) {
        j0.i(kVar, "divView");
        j0.i(uVar, "divBinder");
        this.f35706a = kVar;
        this.f35707b = uVar;
    }

    @Override // t8.e
    public void a(l1.c cVar, List<c8.e> list) {
        c8.e eVar;
        c8.e eVar2;
        View childAt = this.f35706a.getChildAt(0);
        y9.k kVar = cVar.f41207a;
        c8.e eVarA = c8.e.f3631c.a(cVar.f41208b);
        int size = list.size();
        if (size == 0) {
            eVar = eVarA;
        } else if (size != 1) {
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                c8.e eVar3 = (c8.e) it.next();
                c8.e eVar4 = (c8.e) next;
                Objects.requireNonNull(c8.e.f3631c);
                j0.i(eVar4, "somePath");
                j0.i(eVar3, "otherPath");
                if (eVar4.f3632a != eVar3.f3632a) {
                    next = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it2 = eVar4.f3633b.iterator();
                    int i10 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            eVar2 = new c8.e(eVar4.f3632a, arrayList);
                            break;
                        }
                        Object next2 = it2.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            l.i();
                            throw null;
                        }
                        jc.h hVar = (jc.h) next2;
                        jc.h hVar2 = (jc.h) t.t(eVar3.f3633b, i10);
                        if (hVar2 == null || !j0.d(hVar, hVar2)) {
                            eVar2 = new c8.e(eVar4.f3632a, arrayList);
                            break;
                        } else {
                            arrayList.add(hVar);
                            i10 = i11;
                        }
                    }
                    next = eVar2;
                }
                if (next == null) {
                    next = eVarA;
                }
            }
            eVar = (c8.e) next;
        } else {
            eVar = (c8.e) t.r(list);
        }
        if (!eVar.c()) {
            c8.a aVar = c8.a.f3624a;
            j0.h(childAt, "rootView");
            r rVarE = aVar.e(childAt, eVar);
            y9.k kVarC = aVar.c(kVar, eVar);
            y9.k.o oVar = kVarC instanceof y9.k.o ? (y9.k.o) kVarC : null;
            if (rVarE != null && oVar != null) {
                childAt = rVarE;
                eVarA = eVar;
                kVar = oVar;
            }
        }
        u uVar = this.f35707b;
        j0.h(childAt, "view");
        uVar.b(childAt, kVar, this.f35706a, eVarA.d());
        this.f35707b.a();
    }
}
