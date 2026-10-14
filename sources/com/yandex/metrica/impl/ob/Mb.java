package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class Mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Km f14491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f14492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f14493c;

    public static final class a extends Km {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f14495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Rb f14496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f14497d;

        public a(b bVar, Rb rb2, long j10) {
            this.f14495b = bVar;
            this.f14496c = rb2;
            this.f14497d = j10;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() {
            if (Mb.this.f14492b) {
                return;
            }
            this.f14495b.a(true);
            this.f14496c.a();
            ((C1941rn) Mb.this.f14493c).a(Mb.b(Mb.this), this.f14497d, TimeUnit.SECONDS);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f14498a;

        public b(boolean z10) {
            this.f14498a = z10;
        }

        public /* synthetic */ b(boolean z10, int i10) {
            this((i10 & 1) != 0 ? false : z10);
        }

        public final void a(boolean z10) {
            this.f14498a = z10;
        }

        public final boolean a() {
            return this.f14498a;
        }
    }

    public Mb(C2011ui c2011ui, b bVar, zc.c cVar, InterfaceExecutorC1966sn interfaceExecutorC1966sn, Rb rb2) {
        this.f14493c = interfaceExecutorC1966sn;
        this.f14491a = new a(bVar, rb2, c2011ui.b());
        if (bVar.a()) {
            Km km = this.f14491a;
            if (km != null) {
                km.run();
                return;
            } else {
                fd.j0.r("periodicRunnable");
                throw null;
            }
        }
        long jC = cVar.c(c2011ui.a() + 1);
        Km km2 = this.f14491a;
        if (km2 == null) {
            fd.j0.r("periodicRunnable");
            throw null;
        }
        ((C1941rn) interfaceExecutorC1966sn).a(km2, jC, TimeUnit.SECONDS);
    }

    public static final /* synthetic */ Km b(Mb mb2) {
        Km km = mb2.f14491a;
        if (km != null) {
            return km;
        }
        fd.j0.r("periodicRunnable");
        throw null;
    }

    public final void a() {
        this.f14492b = true;
        InterfaceExecutorC1966sn interfaceExecutorC1966sn = this.f14493c;
        Km km = this.f14491a;
        if (km != null) {
            ((C1941rn) interfaceExecutorC1966sn).a(km);
        } else {
            fd.j0.r("periodicRunnable");
            throw null;
        }
    }
}
