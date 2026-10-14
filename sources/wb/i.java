package wb;

import java.util.concurrent.atomic.AtomicReference;
import lb.n;
import lb.o;

/* JADX INFO: loaded from: classes3.dex */
public final class i<T> extends lb.m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<T> f37281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb.l f37282b;

    public static final class a<T> extends AtomicReference<nb.b> implements n<T>, nb.b, Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n<? super T> f37283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final lb.l f37284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public T f37285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Throwable f37286f;

        public a(n<? super T> nVar, lb.l lVar) {
            this.f37283c = nVar;
            this.f37284d = lVar;
        }

        @Override // lb.n
        public void a(Throwable th) {
            this.f37286f = th;
            qb.b.replace(this, this.f37284d.b(this));
        }

        @Override // lb.n
        public void b(nb.b bVar) {
            if (qb.b.setOnce(this, bVar)) {
                this.f37283c.b(this);
            }
        }

        @Override // nb.b
        public void dispose() {
            qb.b.dispose(this);
        }

        @Override // lb.n
        public void onSuccess(T t10) {
            this.f37285e = t10;
            qb.b.replace(this, this.f37284d.b(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f37286f;
            if (th != null) {
                this.f37283c.a(th);
            } else {
                this.f37283c.onSuccess(this.f37285e);
            }
        }
    }

    public i(o<T> oVar, lb.l lVar) {
        this.f37281a = oVar;
        this.f37282b = lVar;
    }

    @Override // lb.m
    public void m(n<? super T> nVar) {
        this.f37281a.a(new a(nVar, this.f37282b));
    }
}
