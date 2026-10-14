package ub;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class t<T, U extends Collection<? super T>> extends lb.m<U> implements sb.b<U> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb.c<T> f36360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<U> f36361b;

    public static final class a<T, U extends Collection<? super T>> implements lb.f<T>, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.n<? super U> f36362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public me.c f36363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public U f36364e;

        public a(lb.n<? super U> nVar, U u10) {
            this.f36362c = nVar;
            this.f36364e = u10;
        }

        @Override // me.b
        public void a(Throwable th) {
            this.f36364e = null;
            this.f36363d = ac.g.CANCELLED;
            this.f36362c.a(th);
        }

        @Override // lb.f, me.b
        public void c(me.c cVar) {
            if (ac.g.validate(this.f36363d, cVar)) {
                this.f36363d = cVar;
                this.f36362c.b(this);
                cVar.request(RecyclerView.FOREVER_NS);
            }
        }

        @Override // me.b
        public void d(T t10) {
            this.f36364e.add(t10);
        }

        @Override // nb.b
        public void dispose() {
            this.f36363d.cancel();
            this.f36363d = ac.g.CANCELLED;
        }

        @Override // me.b
        public void onComplete() {
            this.f36363d = ac.g.CANCELLED;
            this.f36362c.onSuccess(this.f36364e);
        }
    }

    public t(lb.c<T> cVar) {
        this(cVar, bc.b.asCallable());
    }

    public t(lb.c<T> cVar, Callable<U> callable) {
        this.f36360a = cVar;
        this.f36361b = callable;
    }

    @Override // sb.b
    public lb.c<U> c() {
        return new s(this.f36360a, this.f36361b);
    }

    @Override // lb.m
    public void m(lb.n<? super U> nVar) {
        try {
            U uCall = this.f36361b.call();
            Objects.requireNonNull(uCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f36360a.g(new a(nVar, uCall));
        } catch (Throwable th) {
            c0.Q(th);
            qb.c.error(th, nVar);
        }
    }
}
