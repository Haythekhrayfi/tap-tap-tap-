package vb;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class u<T> extends vb.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb.l f36958d;

    public static final class a<T> extends AtomicReference<nb.b> implements lb.k<T>, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super T> f36959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference<nb.b> f36960d = new AtomicReference<>();

        public a(lb.k<? super T> kVar) {
            this.f36959c = kVar;
        }

        @Override // lb.k
        public void a(Throwable th) {
            this.f36959c.a(th);
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            qb.b.setOnce(this.f36960d, bVar);
        }

        @Override // lb.k
        public void d(T t10) {
            this.f36959c.d(t10);
        }

        @Override // nb.b
        public void dispose() {
            qb.b.dispose(this.f36960d);
            qb.b.dispose(this);
        }

        @Override // lb.k
        public void onComplete() {
            this.f36959c.onComplete();
        }
    }

    public final class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a<T> f36961c;

        public b(a<T> aVar) {
            this.f36961c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            u.this.f36794c.c(this.f36961c);
        }
    }

    public u(lb.j<T> jVar, lb.l lVar) {
        super(jVar);
        this.f36958d = lVar;
    }

    @Override // lb.i
    public void t(lb.k<? super T> kVar) {
        a aVar = new a(kVar);
        kVar.b(aVar);
        qb.b.setOnce(aVar, this.f36958d.b(new b(aVar)));
    }
}
