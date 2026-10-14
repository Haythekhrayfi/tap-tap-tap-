package wb;

import lb.n;
import lb.o;

/* JADX INFO: loaded from: classes3.dex */
public final class m<T> extends lb.i<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? extends T> f37299c;

    public static final class a<T> extends tb.e<T> implements n<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public nb.b f37300e;

        public a(lb.k<? super T> kVar) {
            super(kVar);
        }

        @Override // lb.n
        public void a(Throwable th) {
            if ((get() & 54) != 0) {
                dc.a.b(th);
            } else {
                lazySet(2);
                this.f35883c.a(th);
            }
        }

        @Override // lb.n
        public void b(nb.b bVar) {
            if (qb.b.validate(this.f37300e, bVar)) {
                this.f37300e = bVar;
                this.f35883c.b(this);
            }
        }

        @Override // tb.e, nb.b
        public void dispose() {
            super.dispose();
            this.f37300e.dispose();
        }

        @Override // lb.n
        public void onSuccess(T t10) {
            c(t10);
        }
    }

    public m(o<? extends T> oVar) {
        this.f37299c = oVar;
    }

    @Override // lb.i
    public void t(lb.k<? super T> kVar) {
        this.f37299c.a(new a(kVar));
    }
}
