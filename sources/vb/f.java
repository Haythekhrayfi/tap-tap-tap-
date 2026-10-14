package vb;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class f<T> extends vb.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeUnit f36857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lb.l f36858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f36859g;

    public static final class a<T> implements lb.k<T>, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super T> f36860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f36861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TimeUnit f36862e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final lb.l.c f36863f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f36864g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public nb.b f36865h;

        /* JADX INFO: renamed from: vb.f$a$a, reason: collision with other inner class name */
        public final class RunnableC0442a implements Runnable {
            public RunnableC0442a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f36860c.onComplete();
                } finally {
                    a.this.f36863f.dispose();
                }
            }
        }

        public final class b implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Throwable f36867c;

            public b(Throwable th) {
                this.f36867c = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f36860c.a(this.f36867c);
                } finally {
                    a.this.f36863f.dispose();
                }
            }
        }

        public final class c implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final T f36869c;

            public c(T t10) {
                this.f36869c = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f36860c.d(this.f36869c);
            }
        }

        public a(lb.k<? super T> kVar, long j10, TimeUnit timeUnit, lb.l.c cVar, boolean z10) {
            this.f36860c = kVar;
            this.f36861d = j10;
            this.f36862e = timeUnit;
            this.f36863f = cVar;
            this.f36864g = z10;
        }

        @Override // lb.k
        public void a(Throwable th) {
            this.f36863f.c(new b(th), this.f36864g ? this.f36861d : 0L, this.f36862e);
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            if (qb.b.validate(this.f36865h, bVar)) {
                this.f36865h = bVar;
                this.f36860c.b(this);
            }
        }

        @Override // lb.k
        public void d(T t10) {
            this.f36863f.c(new c(t10), this.f36861d, this.f36862e);
        }

        @Override // nb.b
        public void dispose() {
            this.f36865h.dispose();
            this.f36863f.dispose();
        }

        @Override // lb.k
        public void onComplete() {
            this.f36863f.c(new RunnableC0442a(), this.f36861d, this.f36862e);
        }
    }

    public f(lb.j<T> jVar, long j10, TimeUnit timeUnit, lb.l lVar, boolean z10) {
        super(jVar);
        this.f36856d = j10;
        this.f36857e = timeUnit;
        this.f36858f = lVar;
        this.f36859g = z10;
    }

    @Override // lb.i
    public void t(lb.k<? super T> kVar) {
        this.f36794c.c(new a(this.f36859g ? kVar : new cc.a(kVar), this.f36856d, this.f36857e, this.f36858f.a(), this.f36859g));
    }
}
