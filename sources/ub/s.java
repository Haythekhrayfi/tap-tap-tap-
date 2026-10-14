package ub;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class s<T, U extends Collection<? super T>> extends ub.a<T, U> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Callable<U> f36358e;

    public static final class a<T, U extends Collection<? super T>> extends ac.c<U> implements lb.f<T>, me.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public me.c f36359e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(me.b<? super U> bVar, U u10) {
            super(bVar);
            this.f336d = u10;
        }

        @Override // me.b
        public void a(Throwable th) {
            this.f336d = null;
            this.f335c.a(th);
        }

        @Override // lb.f, me.b
        public void c(me.c cVar) {
            if (ac.g.validate(this.f36359e, cVar)) {
                this.f36359e = cVar;
                this.f335c.c(this);
                cVar.request(RecyclerView.FOREVER_NS);
            }
        }

        @Override // ac.c, me.c
        public void cancel() {
            super.cancel();
            this.f36359e.cancel();
        }

        @Override // me.b
        public void d(T t10) {
            Collection collection = (Collection) this.f336d;
            if (collection != null) {
                collection.add(t10);
            }
        }

        @Override // me.b
        public void onComplete() {
            f(this.f336d);
        }
    }

    public s(lb.c<T> cVar, Callable<U> callable) {
        super(cVar);
        this.f36358e = callable;
    }

    @Override // lb.c
    public void h(me.b<? super U> bVar) {
        try {
            U uCall = this.f36358e.call();
            Objects.requireNonNull(uCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f36195d.g(new a(bVar, uCall));
        } catch (Throwable th) {
            c0.Q(th);
            ac.d.error(th, bVar);
        }
    }
}
