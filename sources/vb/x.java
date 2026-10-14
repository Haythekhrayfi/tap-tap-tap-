package vb;

import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class x<T, U extends Collection<? super T>> extends vb.a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable<U> f36972d;

    public static final class a<T, U extends Collection<? super T>> implements lb.k<T>, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super U> f36973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public nb.b f36974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public U f36975e;

        public a(lb.k<? super U> kVar, U u10) {
            this.f36973c = kVar;
            this.f36975e = u10;
        }

        @Override // lb.k
        public void a(Throwable th) {
            this.f36975e = null;
            this.f36973c.a(th);
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            if (qb.b.validate(this.f36974d, bVar)) {
                this.f36974d = bVar;
                this.f36973c.b(this);
            }
        }

        @Override // lb.k
        public void d(T t10) {
            this.f36975e.add(t10);
        }

        @Override // nb.b
        public void dispose() {
            this.f36974d.dispose();
        }

        @Override // lb.k
        public void onComplete() {
            U u10 = this.f36975e;
            this.f36975e = null;
            this.f36973c.d(u10);
            this.f36973c.onComplete();
        }
    }

    public x(lb.j<T> jVar, int i10) {
        super(jVar);
        this.f36972d = new rb.a.CallableC0404a(i10);
    }

    public x(lb.j<T> jVar, Callable<U> callable) {
        super(jVar);
        this.f36972d = callable;
    }

    @Override // lb.i
    public void t(lb.k<? super U> kVar) {
        try {
            U uCall = this.f36972d.call();
            Objects.requireNonNull(uCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f36794c.c(new a(kVar, uCall));
        } catch (Throwable th) {
            c0.Q(th);
            qb.c.error(th, kVar);
        }
    }
}
