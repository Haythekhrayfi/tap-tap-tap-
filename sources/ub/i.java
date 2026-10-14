package ub;

/* JADX INFO: loaded from: classes3.dex */
public final class i<T> extends lb.c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb.i<T> f36289d;

    public static final class a<T> implements lb.k<T>, me.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final me.b<? super T> f36290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public nb.b f36291d;

        public a(me.b<? super T> bVar) {
            this.f36290c = bVar;
        }

        @Override // lb.k
        public void a(Throwable th) {
            this.f36290c.a(th);
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            this.f36291d = bVar;
            this.f36290c.c(this);
        }

        @Override // me.c
        public void cancel() {
            this.f36291d.dispose();
        }

        @Override // lb.k
        public void d(T t10) {
            this.f36290c.d(t10);
        }

        @Override // lb.k
        public void onComplete() {
            this.f36290c.onComplete();
        }

        @Override // me.c
        public void request(long j10) {
        }
    }

    public i(lb.i<T> iVar) {
        this.f36289d = iVar;
    }

    @Override // lb.c
    public void h(me.b<? super T> bVar) {
        this.f36289d.c(new a(bVar));
    }
}
