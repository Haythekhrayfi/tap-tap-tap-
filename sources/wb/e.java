package wb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import lb.n;
import lb.o;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class e<T, R> extends lb.m<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<? extends T> f37269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pb.c<? super T, ? extends o<? extends R>> f37270b;

    public static final class a<T, R> extends AtomicReference<nb.b> implements n<T>, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n<? super R> f37271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final pb.c<? super T, ? extends o<? extends R>> f37272d;

        /* JADX INFO: renamed from: wb.e$a$a, reason: collision with other inner class name */
        public static final class C0451a<R> implements n<R> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final AtomicReference<nb.b> f37273c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final n<? super R> f37274d;

            public C0451a(AtomicReference<nb.b> atomicReference, n<? super R> nVar) {
                this.f37273c = atomicReference;
                this.f37274d = nVar;
            }

            @Override // lb.n
            public void a(Throwable th) {
                this.f37274d.a(th);
            }

            @Override // lb.n
            public void b(nb.b bVar) {
                qb.b.replace(this.f37273c, bVar);
            }

            @Override // lb.n
            public void onSuccess(R r10) {
                this.f37274d.onSuccess(r10);
            }
        }

        public a(n<? super R> nVar, pb.c<? super T, ? extends o<? extends R>> cVar) {
            this.f37271c = nVar;
            this.f37272d = cVar;
        }

        @Override // lb.n
        public void a(Throwable th) {
            this.f37271c.a(th);
        }

        @Override // lb.n
        public void b(nb.b bVar) {
            if (qb.b.setOnce(this, bVar)) {
                this.f37271c.b(this);
            }
        }

        public boolean c() {
            return qb.b.isDisposed(get());
        }

        @Override // nb.b
        public void dispose() {
            qb.b.dispose(this);
        }

        @Override // lb.n
        public void onSuccess(T t10) {
            try {
                o<? extends R> oVarApply = this.f37272d.apply(t10);
                Objects.requireNonNull(oVarApply, "The single returned by the mapper is null");
                o<? extends R> oVar = oVarApply;
                if (c()) {
                    return;
                }
                oVar.a(new C0451a(this, this.f37271c));
            } catch (Throwable th) {
                c0.Q(th);
                this.f37271c.a(th);
            }
        }
    }

    public e(o<? extends T> oVar, pb.c<? super T, ? extends o<? extends R>> cVar) {
        this.f37270b = cVar;
        this.f37269a = oVar;
    }

    @Override // lb.m
    public void m(n<? super R> nVar) {
        this.f37269a.a(new a(nVar, this.f37270b));
    }
}
