package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public final class Nb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Mb.b f14538a = new Mb.b(false, 1);

    public final Mb a(C2011ui c2011ui) {
        Mb.b bVar = this.f14538a;
        zc.c.a aVar = zc.c.f45275c;
        P0 p0I = P0.i();
        fd.j0.h(p0I, "GlobalServiceLocator.getInstance()");
        C2146zn c2146znS = p0I.s();
        fd.j0.h(c2146znS, "GlobalServiceLocator.get…).serviceExecutorProvider");
        InterfaceExecutorC1966sn interfaceExecutorC1966snH = c2146znS.h();
        fd.j0.h(interfaceExecutorC1966snH, "GlobalServiceLocator.get…ortDataCollectingExecutor");
        Ob ob2 = new Ob(c2011ui);
        W0 w0A = Oh.a();
        fd.j0.h(w0A, "YandexMetricaSelfReportFacade.getReporter()");
        return new Mb(c2011ui, bVar, aVar, interfaceExecutorC1966snH, new Rb(ob2, new Qb(c2011ui, w0A)));
    }
}
