package mc;

import fd.j0;
import uc.p;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends l implements p<f, f.a, f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f33538c = new g();

    public g() {
        super(2);
    }

    @Override // uc.p
    public f invoke(f fVar, f.a aVar) {
        c cVar;
        f fVar2 = fVar;
        f.a aVar2 = aVar;
        j0.i(fVar2, "acc");
        j0.i(aVar2, "element");
        f fVarP = fVar2.p(aVar2.getKey());
        h hVar = h.f33539c;
        if (fVarP == hVar) {
            return aVar2;
        }
        int i10 = e.B1;
        e.a aVar3 = e.a.f33537c;
        e eVar = (e) fVarP.b(aVar3);
        if (eVar == null) {
            cVar = new c(fVarP, aVar2);
        } else {
            f fVarP2 = fVarP.p(aVar3);
            if (fVarP2 == hVar) {
                return new c(aVar2, eVar);
            }
            cVar = new c(new c(fVarP2, aVar2), eVar);
        }
        return cVar;
    }
}
