package vb;

import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class g<T> extends vb.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pb.b<? super T> f36871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pb.b<? super Throwable> f36872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pb.a f36873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pb.a f36874g;

    public static final class a<T> implements lb.k<T>, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super T> f36875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final pb.b<? super T> f36876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final pb.b<? super Throwable> f36877e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final pb.a f36878f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final pb.a f36879g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public nb.b f36880h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f36881i;

        public a(lb.k<? super T> kVar, pb.b<? super T> bVar, pb.b<? super Throwable> bVar2, pb.a aVar, pb.a aVar2) {
            this.f36875c = kVar;
            this.f36876d = bVar;
            this.f36877e = bVar2;
            this.f36878f = aVar;
            this.f36879g = aVar2;
        }

        @Override // lb.k
        public void a(Throwable th) {
            if (this.f36881i) {
                dc.a.b(th);
                return;
            }
            this.f36881i = true;
            try {
                this.f36877e.accept(th);
            } catch (Throwable th2) {
                c0.Q(th2);
                th = new ob.a(th, th2);
            }
            this.f36875c.a(th);
            try {
                this.f36879g.run();
            } catch (Throwable th3) {
                c0.Q(th3);
                dc.a.b(th3);
            }
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            if (qb.b.validate(this.f36880h, bVar)) {
                this.f36880h = bVar;
                this.f36875c.b(this);
            }
        }

        @Override // lb.k
        public void d(T t10) {
            if (this.f36881i) {
                return;
            }
            try {
                this.f36876d.accept(t10);
                this.f36875c.d(t10);
            } catch (Throwable th) {
                c0.Q(th);
                this.f36880h.dispose();
                a(th);
            }
        }

        @Override // nb.b
        public void dispose() {
            this.f36880h.dispose();
        }

        @Override // lb.k
        public void onComplete() {
            if (this.f36881i) {
                return;
            }
            try {
                this.f36878f.run();
                this.f36881i = true;
                this.f36875c.onComplete();
                try {
                    this.f36879g.run();
                } catch (Throwable th) {
                    c0.Q(th);
                    dc.a.b(th);
                }
            } catch (Throwable th2) {
                c0.Q(th2);
                a(th2);
            }
        }
    }

    public g(lb.j<T> jVar, pb.b<? super T> bVar, pb.b<? super Throwable> bVar2, pb.a aVar, pb.a aVar2) {
        super(jVar);
        this.f36871d = bVar;
        this.f36872e = bVar2;
        this.f36873f = aVar;
        this.f36874g = aVar2;
    }

    @Override // lb.i
    public void t(lb.k<? super T> kVar) {
        this.f36794c.c(new a(kVar, this.f36871d, this.f36872e, this.f36873f, this.f36874g));
    }
}
