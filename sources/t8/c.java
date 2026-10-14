package t8;

import android.view.View;
import fd.j0;
import i8.k;
import i8.u;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import o8.r;
import y9.l1;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f35710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f35711b;

    public c(k kVar, u uVar) {
        j0.i(kVar, "divView");
        j0.i(uVar, "divBinder");
        this.f35710a = kVar;
        this.f35711b = uVar;
    }

    @Override // t8.e
    public void a(l1.c cVar, List<c8.e> list) {
        View childAt = this.f35710a.getChildAt(0);
        y9.k kVar = cVar.f41207a;
        List<c8.e> listA = c8.a.f3624a.a(list);
        ArrayList<c8.e> arrayList = new ArrayList();
        for (Object obj : listA) {
            if (!((c8.e) obj).c()) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (c8.e eVar : arrayList) {
            c8.a aVar = c8.a.f3624a;
            j0.h(childAt, "rootView");
            r rVarE = aVar.e(childAt, eVar);
            y9.k kVarC = aVar.c(kVar, eVar);
            y9.k.o oVar = kVarC instanceof y9.k.o ? (y9.k.o) kVarC : null;
            if (rVarE != null && oVar != null && !linkedHashSet.contains(rVarE)) {
                this.f35711b.b(rVarE, oVar, this.f35710a, eVar.d());
                linkedHashSet.add(rVarE);
            }
        }
        if (linkedHashSet.isEmpty()) {
            u uVar = this.f35711b;
            j0.h(childAt, "rootView");
            uVar.b(childAt, kVar, this.f35710a, c8.e.f3631c.a(cVar.f41208b));
        }
        this.f35711b.a();
    }
}
