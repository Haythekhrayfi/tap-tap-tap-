package vb;

import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class y<T, U extends Collection<? super T>> extends lb.m<U> implements sb.c<U> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb.j<T> f36976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<U> f36977b;

    public static final class a<T, U extends Collection<? super T>> implements lb.k<T>, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.n<? super U> f36978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public U f36979d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public nb.b f36980e;

        public a(lb.n<? super U> nVar, U u10) {
            this.f36978c = nVar;
            this.f36979d = u10;
        }

        @Override // lb.k
        public void a(Throwable th) {
            this.f36979d = null;
            this.f36978c.a(th);
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            if (qb.b.validate(this.f36980e, bVar)) {
                this.f36980e = bVar;
                this.f36978c.b(this);
            }
        }

        @Override // lb.k
        public void d(T t10) {
            this.f36979d.add(t10);
        }

        @Override // nb.b
        public void dispose() {
            this.f36980e.dispose();
        }

        @Override // lb.k
        public void onComplete() {
            U u10 = this.f36979d;
            this.f36979d = null;
            this.f36978c.onSuccess(u10);
        }
    }

    public y(lb.j<T> jVar, int i10) {
        this.f36976a = jVar;
        this.f36977b = new rb.a.CallableC0404a(i10);
    }

    public y(lb.j<T> jVar, Callable<U> callable) {
        this.f36976a = jVar;
        this.f36977b = callable;
    }

    @Override // sb.c
    public lb.i<U> b() {
        return new x(this.f36976a, this.f36977b);
    }

    @Override // lb.m
    public void m(lb.n<? super U> nVar) {
        try {
            U uCall = this.f36977b.call();
            Objects.requireNonNull(uCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f36976a.c(new a(nVar, uCall));
        } catch (Throwable th) {
            c0.Q(th);
            qb.c.error(th, nVar);
        }
    }
}
