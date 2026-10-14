package vb;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    public static final class a<T> extends AtomicInteger implements sb.d<T>, Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super T> f36954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final T f36955d;

        public a(lb.k<? super T> kVar, T t10) {
            this.f36954c = kVar;
            this.f36955d = t10;
        }

        @Override // sb.i
        public void clear() {
            lazySet(3);
        }

        @Override // nb.b
        public void dispose() {
            set(3);
        }

        @Override // sb.i
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // sb.i
        public boolean offer(T t10) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // sb.i
        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f36955d;
        }

        @Override // sb.e
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f36954c.d(this.f36955d);
                if (get() == 2) {
                    lazySet(3);
                    this.f36954c.onComplete();
                }
            }
        }
    }

    public static final class b<T, R> extends lb.i<R> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f36956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final pb.c<? super T, ? extends lb.j<? extends R>> f36957d;

        public b(T t10, pb.c<? super T, ? extends lb.j<? extends R>> cVar) {
            this.f36956c = t10;
            this.f36957d = cVar;
        }

        @Override // lb.i
        public void t(lb.k<? super R> kVar) {
            try {
                lb.j<? extends R> jVarApply = this.f36957d.apply(this.f36956c);
                Objects.requireNonNull(jVarApply, "The mapper returned a null ObservableSource");
                lb.j<? extends R> jVar = jVarApply;
                if (!(jVar instanceof Callable)) {
                    jVar.c(kVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) jVar).call();
                    if (objCall == null) {
                        qb.c.complete(kVar);
                        return;
                    }
                    a aVar = new a(kVar, objCall);
                    kVar.b(aVar);
                    aVar.run();
                } catch (Throwable th) {
                    c0.Q(th);
                    qb.c.error(th, kVar);
                }
            } catch (Throwable th2) {
                qb.c.error(th2, kVar);
            }
        }
    }

    public static <T, R> boolean a(lb.j<T> jVar, lb.k<? super R> kVar, pb.c<? super T, ? extends lb.j<? extends R>> cVar) {
        if (!(jVar instanceof Callable)) {
            return false;
        }
        try {
            a1.a aVar = (Object) ((Callable) jVar).call();
            if (aVar == null) {
                qb.c.complete(kVar);
                return true;
            }
            lb.j<? extends R> jVarApply = cVar.apply(aVar);
            Objects.requireNonNull(jVarApply, "The mapper returned a null ObservableSource");
            lb.j<? extends R> jVar2 = jVarApply;
            if (jVar2 instanceof Callable) {
                Object objCall = ((Callable) jVar2).call();
                if (objCall == null) {
                    qb.c.complete(kVar);
                    return true;
                }
                a aVar2 = new a(kVar, objCall);
                kVar.b(aVar2);
                aVar2.run();
            } else {
                jVar2.c(kVar);
            }
            return true;
        } catch (Throwable th) {
            c0.Q(th);
            qb.c.error(th, kVar);
            return true;
        }
    }
}
