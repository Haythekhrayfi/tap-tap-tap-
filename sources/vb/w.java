package vb;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends lb.i<Long> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb.l f36968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeUnit f36970e;

    public static final class a extends AtomicReference<nb.b> implements nb.b, Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super Long> f36971c;

        public a(lb.k<? super Long> kVar) {
            this.f36971c = kVar;
        }

        public boolean a() {
            return get() == qb.b.DISPOSED;
        }

        @Override // nb.b
        public void dispose() {
            qb.b.dispose(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a()) {
                return;
            }
            this.f36971c.d(0L);
            lazySet(qb.c.INSTANCE);
            this.f36971c.onComplete();
        }
    }

    public w(long j10, TimeUnit timeUnit, lb.l lVar) {
        this.f36969d = j10;
        this.f36970e = timeUnit;
        this.f36968c = lVar;
    }

    @Override // lb.i
    public void t(lb.k<? super Long> kVar) {
        a aVar = new a(kVar);
        kVar.b(aVar);
        qb.b.trySet(aVar, this.f36968c.c(aVar, this.f36969d, this.f36970e));
    }
}
