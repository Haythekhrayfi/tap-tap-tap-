package a7;

import fd.j0;
import jc.w;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends l implements uc.l<u6.a, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f169c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar) {
        super(1);
        this.f169c = iVar;
    }

    @Override // uc.l
    public w invoke(u6.a aVar) {
        u6.a aVar2 = aVar;
        i iVar = this.f169c;
        j0.h(aVar2, "settings");
        iVar.f173c.d(new b(aVar2));
        return w.f31842a;
    }
}
