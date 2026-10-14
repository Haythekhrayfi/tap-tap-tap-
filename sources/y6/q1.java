package y6;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q1 extends vc.l implements uc.l<com.inscode.autoclicker.utils.b, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1 f38365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(o1 o1Var) {
        super(1);
        this.f38365c = o1Var;
    }

    @Override // uc.l
    public jc.w invoke(com.inscode.autoclicker.utils.b bVar) {
        com.inscode.autoclicker.utils.b bVar2 = bVar;
        Objects.requireNonNull(o1.f38296s);
        if (o1.f38297t == 1) {
            d7.o oVarM = this.f38365c.m();
            fd.j0.h(bVar2, "it");
            oVarM.c(bVar2);
        }
        return jc.w.f31842a;
    }
}
