package vb;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T> extends vb.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeUnit f36841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lb.l f36842f;

    public static final class a<T> extends AtomicReference<nb.b> implements Runnable, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f36843c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f36844d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b<T> f36845e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicBoolean f36846f = new AtomicBoolean();

        public a(T t10, long j10, b<T> bVar) {
            this.f36843c = t10;
            this.f36844d = j10;
            this.f36845e = bVar;
        }

        @Override // nb.b
        public void dispose() {
            qb.b.dispose(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f36846f.compareAndSet(false, true)) {
                b<T> bVar = this.f36845e;
                long j10 = this.f36844d;
                T t10 = this.f36843c;
                if (j10 == bVar.f36853i) {
                    bVar.f36847c.d(t10);
                    qb.b.dispose(this);
                }
            }
        }
    }

    public static final class b<T> implements lb.k<T>, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super T> f36847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f36848d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TimeUnit f36849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final lb.l.c f36850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public nb.b f36851g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public nb.b f36852h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile long f36853i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f36854j;

        public b(lb.k<? super T> kVar, long j10, TimeUnit timeUnit, lb.l.c cVar) {
            this.f36847c = kVar;
            this.f36848d = j10;
            this.f36849e = timeUnit;
            this.f36850f = cVar;
        }

        @Override // lb.k
        public void a(Throwable th) {
            if (this.f36854j) {
                dc.a.b(th);
                return;
            }
            nb.b bVar = this.f36852h;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f36854j = true;
            this.f36847c.a(th);
            this.f36850f.dispose();
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            if (qb.b.validate(this.f36851g, bVar)) {
                this.f36851g = bVar;
                this.f36847c.b(this);
            }
        }

        @Override // lb.k
        public void d(T t10) {
            if (this.f36854j) {
                return;
            }
            long j10 = this.f36853i + 1;
            this.f36853i = j10;
            nb.b bVar = this.f36852h;
            if (bVar != null) {
                bVar.dispose();
            }
            a aVar = new a(t10, j10, this);
            this.f36852h = aVar;
            qb.b.replace(aVar, this.f36850f.c(aVar, this.f36848d, this.f36849e));
        }

        @Override // nb.b
        public void dispose() {
            this.f36851g.dispose();
            this.f36850f.dispose();
        }

        @Override // lb.k
        public void onComplete() {
            if (this.f36854j) {
                return;
            }
            this.f36854j = true;
            nb.b bVar = this.f36852h;
            if (bVar != null) {
                bVar.dispose();
            }
            a aVar = (a) bVar;
            if (aVar != null) {
                aVar.run();
            }
            this.f36847c.onComplete();
            this.f36850f.dispose();
        }
    }

    public d(lb.j<T> jVar, long j10, TimeUnit timeUnit, lb.l lVar) {
        super(jVar);
        this.f36840d = j10;
        this.f36841e = timeUnit;
        this.f36842f = lVar;
    }

    @Override // lb.i
    public void t(lb.k<? super T> kVar) {
        this.f36794c.c(new b(new cc.a(kVar), this.f36840d, this.f36841e, this.f36842f.a()));
    }
}
