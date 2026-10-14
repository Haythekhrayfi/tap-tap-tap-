package w6;

import d7.a0;
import fd.j0;
import vc.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends vc.l implements uc.l<ae.a, d7.o> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe.a f37121c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fe.a aVar) {
        super(1);
        this.f37121c = aVar;
    }

    @Override // uc.l
    public d7.o invoke(ae.a aVar) {
        j0.i(aVar, "it");
        fe.a aVar2 = this.f37121c;
        ae.b bVar = ae.b.f348c;
        Object objC = aVar2.f29652f.f37311a.c(new yd.h("", b0.a(r6.e.class), null, bVar));
        j0.g(objC, "null cannot be cast to non-null type com.inscode.autoclicker.data.AppSettings");
        return ((r6.e) objC).g() == r6.l.NATURAL ? new d7.p((q6.b) this.f37121c.f29652f.f37311a.c(new yd.h("", b0.a(q6.b.class), null, bVar)), (d7.g) this.f37121c.f29652f.f37311a.c(new yd.h("", b0.a(d7.g.class), null, bVar))) : new a0((q6.b) this.f37121c.f29652f.f37311a.c(new yd.h("", b0.a(q6.b.class), null, bVar)), (d7.g) this.f37121c.f29652f.f37311a.c(new yd.h("", b0.a(d7.g.class), null, bVar)), (r6.e) this.f37121c.f29652f.f37311a.c(new yd.h("", b0.a(r6.e.class), null, bVar)));
    }
}
