package yd;

import androidx.activity.k;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kc.t;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends l implements uc.a<ge.b<Object>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f.a f44887c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f.a aVar) {
        super(0);
        this.f44887c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    @Override // uc.a
    public ge.b<Object> invoke() throws je.f, je.e, je.h {
        List list;
        f.a aVar = this.f44887c;
        f fVar = aVar.f44899f;
        de.a aVar2 = aVar.f44901h;
        uc.a aVar3 = aVar.f44902i;
        xd.a aVar4 = fVar.f44892b;
        ee.b bVar = fVar.f44891a;
        ge.b<?> bVarPeek = bVar.f29163a.size() > 0 ? bVar.f29163a.peek() : null;
        Objects.requireNonNull(aVar4);
        j0.j(aVar3, "definitionResolver");
        List list2 = (List) aVar3.invoke();
        if (bVarPeek != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                ge.b bVar2 = (ge.b) obj;
                j0.j(bVar2, "other");
                if (bVar2.f30449f.a(bVarPeek.f30449f)) {
                    arrayList.add(obj);
                }
            }
            if ((!list2.isEmpty()) && arrayList.isEmpty()) {
                throw new je.h("Definition is not visible from last definition : " + bVarPeek);
            }
            list2 = arrayList;
        }
        if (aVar2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                ge.b bVar3 = (ge.b) obj2;
                j0.j(bVar3, "$receiver");
                String strE = fd.f.e(bVar3);
                boolean z10 = false;
                if (strE.length() == 0) {
                    z10 = true;
                } else if ((strE.length() > 0) && j0.d(strE, aVar2.f28958a)) {
                    z10 = true;
                }
                if (z10) {
                    arrayList2.add(obj2);
                }
            }
            list = arrayList2;
        } else {
            list = list2;
        }
        if (list.size() != 1) {
            if (list.isEmpty()) {
                throw new je.f("No compatible definition found. Check your module definition");
            }
            throw new je.e(k.a(defpackage.a.a("Multiple definitions found - Koin can't choose between :\n\t"), t.w(list, "\n\t", null, null, 0, null, null, 62), "\n\tCheck your modules definition, use inner modules visibility or definition names."));
        }
        Object objR = t.r(list);
        if (objR != null) {
            return (ge.b) objR;
        }
        throw new jc.l("null cannot be cast to non-null type org.koin.dsl.definition.BeanDefinition<T>");
    }
}
