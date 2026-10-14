package vb;

/* JADX INFO: loaded from: classes3.dex */
public final class v<T> extends vb.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36963d;

    public static final class a<T> implements lb.k<T>, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super T> f36964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f36965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public nb.b f36966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f36967f;

        public a(lb.k<? super T> kVar, long j10) {
            this.f36964c = kVar;
            this.f36967f = j10;
        }

        @Override // lb.k
        public void a(Throwable th) {
            if (this.f36965d) {
                dc.a.b(th);
                return;
            }
            this.f36965d = true;
            this.f36966e.dispose();
            this.f36964c.a(th);
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            if (qb.b.validate(this.f36966e, bVar)) {
                this.f36966e = bVar;
                if (this.f36967f != 0) {
                    this.f36964c.b(this);
                    return;
                }
                this.f36965d = true;
                bVar.dispose();
                qb.c.complete(this.f36964c);
            }
        }

        @Override // lb.k
        public void d(T t10) {
            if (this.f36965d) {
                return;
            }
            long j10 = this.f36967f;
            long j11 = j10 - 1;
            this.f36967f = j11;
            if (j10 > 0) {
                boolean z10 = j11 == 0;
                this.f36964c.d(t10);
                if (z10) {
                    onComplete();
                }
            }
        }

        @Override // nb.b
        public void dispose() {
            this.f36966e.dispose();
        }

        @Override // lb.k
        public void onComplete() {
            if (this.f36965d) {
                return;
            }
            this.f36965d = true;
            this.f36966e.dispose();
            this.f36964c.onComplete();
        }
    }

    public v(lb.j<T> jVar, long j10) {
        super(jVar);
        this.f36963d = j10;
    }

    @Override // lb.i
    public void t(lb.k<? super T> kVar) {
        this.f36794c.c(new a(kVar, this.f36963d));
    }
}
