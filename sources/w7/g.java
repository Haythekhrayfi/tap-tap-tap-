package w7;

import fd.j0;
import jc.w;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends l implements uc.l<w8.d, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f37153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(1);
        this.f37153c = hVar;
    }

    @Override // uc.l
    public w invoke(w8.d dVar) {
        w8.d dVar2 = dVar;
        j0.i(dVar2, "it");
        h hVar = this.f37153c;
        uc.l<w8.d, w> lVar = hVar.f37158e;
        j0.i(lVar, "observer");
        dVar2.f37170a.b(lVar);
        hVar.c(dVar2);
        return w.f31842a;
    }
}
