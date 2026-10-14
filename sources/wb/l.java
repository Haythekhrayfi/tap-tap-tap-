package wb;

import lb.n;
import lb.o;

/* JADX INFO: loaded from: classes3.dex */
public final class l<T> extends lb.c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o<? extends T> f37297d;

    public static final class a<T> extends ac.c<T> implements n<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public nb.b f37298e;

        public a(me.b<? super T> bVar) {
            super(bVar);
        }

        @Override // lb.n
        public void a(Throwable th) {
            this.f335c.a(th);
        }

        @Override // lb.n
        public void b(nb.b bVar) {
            if (qb.b.validate(this.f37298e, bVar)) {
                this.f37298e = bVar;
                this.f335c.c(this);
            }
        }

        @Override // ac.c, me.c
        public void cancel() {
            super.cancel();
            this.f37298e.dispose();
        }

        @Override // lb.n
        public void onSuccess(T t10) {
            f(t10);
        }
    }

    public l(o<? extends T> oVar) {
        this.f37297d = oVar;
    }

    @Override // lb.c
    public void h(me.b<? super T> bVar) {
        this.f37297d.a(new a(bVar));
    }
}
