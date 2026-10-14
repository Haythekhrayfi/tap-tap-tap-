package r7;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<d9.b> f35276a;

    public l(ic.a<d9.b> aVar) {
        this.f35276a = aVar;
    }

    @Override // ic.a
    public Object get() {
        d9.b bVar = this.f35276a.get();
        j0.i(bVar, "histogramReporterDelegate");
        j0.i(bVar, "histogramReporterDelegate");
        return new d9.a(bVar);
    }
}
