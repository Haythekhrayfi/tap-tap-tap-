package n8;

import fd.j0;
import y9.q2;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends vc.l implements uc.l<q2, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9.s f33684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t9.s sVar) {
        super(1);
        this.f33684c = sVar;
    }

    @Override // uc.l
    public jc.w invoke(q2 q2Var) {
        q2 q2Var2 = q2Var;
        j0.i(q2Var2, "divFontWeight");
        this.f33684c.setInactiveTypefaceType(p.a(q2Var2));
        return jc.w.f31842a;
    }
}
