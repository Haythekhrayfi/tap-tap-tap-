package i8;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends vc.l implements uc.a<b9.s> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p7.e f31408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p7.e eVar) {
        super(0);
        this.f31408c = eVar;
    }

    @Override // uc.a
    public b9.s invoke() {
        b9.n nVar = ((r7.a) p7.q0.f34583b.a(this.f31408c).f34586a).f35184a.f34592c.get();
        fd.j0.h(nVar, "histogramConfiguration.get()");
        return nVar.g().get();
    }
}
