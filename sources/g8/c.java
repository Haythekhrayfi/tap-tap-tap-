package g8;

import fd.j0;
import jc.w;
import uc.l;

/* JADX INFO: loaded from: classes2.dex */
public class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l<Exception, w> f30048e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(a.b bVar, l<? super Exception, w> lVar) {
        super(bVar);
        j0.i(bVar, "initialMaskData");
        j0.i(lVar, "onError");
        this.f30048e = lVar;
    }

    @Override // g8.a
    public void j(Exception exc) {
        this.f30048e.invoke(exc);
    }
}
