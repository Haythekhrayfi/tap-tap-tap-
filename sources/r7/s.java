package r7;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<b9.n> f35282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<b9.q> f35283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<b9.l> f35284c;

    public s(ic.a<b9.n> aVar, ic.a<b9.q> aVar2, ic.a<b9.l> aVar3) {
        this.f35282a = aVar;
        this.f35283b = aVar2;
        this.f35284c = aVar3;
    }

    @Override // ic.a
    public Object get() {
        b9.n nVar = this.f35282a.get();
        ic.a<b9.q> aVar = this.f35283b;
        ic.a<b9.l> aVar2 = this.f35284c;
        j0.i(nVar, "histogramConfiguration");
        j0.i(aVar, "histogramRecorderProvider");
        j0.i(aVar2, "histogramColdTypeCheckerProvider");
        if (!nVar.a()) {
            return d9.b.a.f28906a;
        }
        j0.i(nVar, "histogramConfiguration");
        j0.i(aVar, "histogramRecorderProvider");
        j0.i(aVar2, "histogramColdTypeChecker");
        return !nVar.a() ? d9.b.a.f28906a : new d9.c(aVar, new b9.k(new k(aVar2)), nVar, nVar.f());
    }
}
