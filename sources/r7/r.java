package r7;

import fd.j0;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<b9.n> f35279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<d9.b> f35280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<ExecutorService> f35281c;

    public r(ic.a<b9.n> aVar, ic.a<d9.b> aVar2, ic.a<ExecutorService> aVar3) {
        this.f35279a = aVar;
        this.f35280b = aVar2;
        this.f35281c = aVar3;
    }

    @Override // ic.a
    public Object get() {
        Object gVar;
        b9.n nVar = this.f35279a.get();
        ic.a<d9.b> aVar = this.f35280b;
        ic.a bVar = this.f35281c;
        j0.i(nVar, "histogramConfiguration");
        j0.i(aVar, "histogramReporterDelegate");
        j0.i(bVar, "executorService");
        if (nVar.a()) {
            if (!nVar.e()) {
                bVar = new ic.a() { // from class: r7.o
                    @Override // ic.a
                    public final Object get() {
                        return d6.j.f28717f;
                    }
                };
                Object obj = ib.b.f31544c;
                if (!(bVar instanceof ib.b)) {
                    bVar = new ib.b(bVar);
                }
            }
            d9.b bVar2 = aVar.get();
            j0.h(bVar2, "histogramReporterDelegate.get()");
            final d9.b bVar3 = bVar2;
            ic.a bVar4 = new ic.a() { // from class: r7.n
                @Override // ic.a
                public final Object get() {
                    d9.b bVar5 = bVar3;
                    j0.i(bVar5, "$histogramReporterDelegate");
                    j0.i(bVar5, "histogramReporterDelegate");
                    return new d9.a(bVar5);
                }
            };
            Object obj2 = ib.b.f31544c;
            if (!(bVar4 instanceof ib.b)) {
                bVar4 = new ib.b(bVar4);
            }
            gVar = new b9.g(new p(bVar4), new q(bVar));
        } else {
            Objects.requireNonNull(b9.f.f3374a);
            gVar = (b9.f) ((jc.k) b9.f.a.f3376b).getValue();
        }
        Objects.requireNonNull(gVar, "Cannot return null from a non-@Nullable @Provides method");
        return gVar;
    }
}
