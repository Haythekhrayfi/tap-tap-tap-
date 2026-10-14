package y6;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends vc.l implements uc.l<com.inscode.autoclicker.utils.b, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f38286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j jVar) {
        super(1);
        this.f38286c = jVar;
    }

    @Override // uc.l
    public jc.w invoke(com.inscode.autoclicker.utils.b bVar) {
        com.inscode.autoclicker.utils.b bVar2 = bVar;
        Objects.requireNonNull(j.f38212r);
        if (j.f38213s == 1) {
            z6.u0 u0VarL = this.f38286c.l();
            fd.j0.h(bVar2, "it");
            u0VarL.c(bVar2);
        }
        return jc.w.f31842a;
    }
}
