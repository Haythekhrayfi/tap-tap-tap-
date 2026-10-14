package vb;

import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class r<T> extends vb.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pb.c<? super Throwable, ? extends T> f36945d;

    public static final class a<T> implements lb.k<T>, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super T> f36946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final pb.c<? super Throwable, ? extends T> f36947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public nb.b f36948e;

        public a(lb.k<? super T> kVar, pb.c<? super Throwable, ? extends T> cVar) {
            this.f36946c = kVar;
            this.f36947d = cVar;
        }

        @Override // lb.k
        public void a(Throwable th) {
            try {
                T tApply = this.f36947d.apply(th);
                if (tApply != null) {
                    this.f36946c.d(tApply);
                    this.f36946c.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f36946c.a(nullPointerException);
                }
            } catch (Throwable th2) {
                c0.Q(th2);
                this.f36946c.a(new ob.a(th, th2));
            }
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            if (qb.b.validate(this.f36948e, bVar)) {
                this.f36948e = bVar;
                this.f36946c.b(this);
            }
        }

        @Override // lb.k
        public void d(T t10) {
            this.f36946c.d(t10);
        }

        @Override // nb.b
        public void dispose() {
            this.f36948e.dispose();
        }

        @Override // lb.k
        public void onComplete() {
            this.f36946c.onComplete();
        }
    }

    public r(lb.j<T> jVar, pb.c<? super Throwable, ? extends T> cVar) {
        super(jVar);
        this.f36945d = cVar;
    }

    @Override // lb.i
    public void t(lb.k<? super T> kVar) {
        this.f36794c.c(new a(kVar, this.f36945d));
    }
}
