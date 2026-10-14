package vb;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends lb.i<Long> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb.l f36922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f36924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeUnit f36925f;

    public static final class a extends AtomicReference<nb.b> implements nb.b, Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super Long> f36926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f36927d;

        public a(lb.k<? super Long> kVar) {
            this.f36926c = kVar;
        }

        @Override // nb.b
        public void dispose() {
            qb.b.dispose(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != qb.b.DISPOSED) {
                lb.k<? super Long> kVar = this.f36926c;
                long j10 = this.f36927d;
                this.f36927d = 1 + j10;
                kVar.d(Long.valueOf(j10));
            }
        }
    }

    public n(long j10, long j11, TimeUnit timeUnit, lb.l lVar) {
        this.f36923d = j10;
        this.f36924e = j11;
        this.f36925f = timeUnit;
        this.f36922c = lVar;
    }

    @Override // lb.i
    public void t(lb.k<? super Long> kVar) {
        a aVar = new a(kVar);
        kVar.b(aVar);
        lb.l lVar = this.f36922c;
        if (!(lVar instanceof yb.m)) {
            qb.b.setOnce(aVar, lVar.d(aVar, this.f36923d, this.f36924e, this.f36925f));
            return;
        }
        lb.l.c cVarA = lVar.a();
        qb.b.setOnce(aVar, cVarA);
        cVarA.d(aVar, this.f36923d, this.f36924e, this.f36925f);
    }
}
