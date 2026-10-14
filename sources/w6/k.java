package w6;

import fd.j0;
import vc.b0;
import z6.i1;
import z6.u0;
import z6.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends vc.l implements uc.l<ae.a, u0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe.a f37122c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(fe.a aVar) {
        super(1);
        this.f37122c = aVar;
    }

    @Override // uc.l
    public u0 invoke(ae.a aVar) {
        j0.i(aVar, "it");
        fe.a aVar2 = this.f37122c;
        ae.b bVar = ae.b.f348c;
        Object objC = aVar2.f29652f.f37311a.c(new yd.h("", b0.a(r6.e.class), null, bVar));
        j0.g(objC, "null cannot be cast to non-null type com.inscode.autoclicker.data.AppSettings");
        return ((r6.e) objC).g() == r6.l.NATURAL ? new x0((q6.b) this.f37122c.f29652f.f37311a.c(new yd.h("", b0.a(q6.b.class), null, bVar)), (z6.r) this.f37122c.f29652f.f37311a.c(new yd.h("", b0.a(z6.r.class), null, bVar))) : new i1((q6.b) this.f37122c.f29652f.f37311a.c(new yd.h("", b0.a(q6.b.class), null, bVar)), (z6.r) this.f37122c.f29652f.f37311a.c(new yd.h("", b0.a(z6.r.class), null, bVar)), (r6.e) this.f37122c.f29652f.f37311a.c(new yd.h("", b0.a(r6.e.class), null, bVar)));
    }
}
