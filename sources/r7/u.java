package r7;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<b9.a> f35287a;

    public u(ic.a<b9.a> aVar) {
        this.f35287a = aVar;
    }

    @Override // ic.a
    public Object get() {
        b9.a aVar = this.f35287a.get();
        j0.i(aVar, "cpuUsageHistogramReporter");
        return new l9.e(aVar);
    }
}
