package ub;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> extends ub.a<T, T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f36209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeUnit f36210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lb.l f36211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f36212h;

    public static final class a<T> implements lb.f<T>, me.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final me.b<? super T> f36213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f36214d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TimeUnit f36215e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final lb.l.c f36216f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f36217g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public me.c f36218h;

        /* JADX INFO: renamed from: ub.c$a$a, reason: collision with other inner class name */
        public final class RunnableC0429a implements Runnable {
            public RunnableC0429a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f36213c.onComplete();
                } finally {
                    a.this.f36216f.dispose();
                }
            }
        }

        public final class b implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Throwable f36220c;

            public b(Throwable th) {
                this.f36220c = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f36213c.a(this.f36220c);
                } finally {
                    a.this.f36216f.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: ub.c$a$c, reason: collision with other inner class name */
        public final class RunnableC0430c implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final T f36222c;

            public RunnableC0430c(T t10) {
                this.f36222c = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f36213c.d(this.f36222c);
            }
        }

        public a(me.b<? super T> bVar, long j10, TimeUnit timeUnit, lb.l.c cVar, boolean z10) {
            this.f36213c = bVar;
            this.f36214d = j10;
            this.f36215e = timeUnit;
            this.f36216f = cVar;
            this.f36217g = z10;
        }

        @Override // me.b
        public void a(Throwable th) {
            this.f36216f.c(new b(th), this.f36217g ? this.f36214d : 0L, this.f36215e);
        }

        @Override // lb.f, me.b
        public void c(me.c cVar) {
            if (ac.g.validate(this.f36218h, cVar)) {
                this.f36218h = cVar;
                this.f36213c.c(this);
            }
        }

        @Override // me.c
        public void cancel() {
            this.f36218h.cancel();
            this.f36216f.dispose();
        }

        @Override // me.b
        public void d(T t10) {
            this.f36216f.c(new RunnableC0430c(t10), this.f36214d, this.f36215e);
        }

        @Override // me.b
        public void onComplete() {
            this.f36216f.c(new RunnableC0429a(), this.f36214d, this.f36215e);
        }

        @Override // me.c
        public void request(long j10) {
            this.f36218h.request(j10);
        }
    }

    public c(lb.c<T> cVar, long j10, TimeUnit timeUnit, lb.l lVar, boolean z10) {
        super(cVar);
        this.f36209e = j10;
        this.f36210f = timeUnit;
        this.f36211g = lVar;
        this.f36212h = z10;
    }

    @Override // lb.c
    public void h(me.b<? super T> bVar) {
        this.f36195d.g(new a(this.f36212h ? bVar : new hc.a(bVar), this.f36209e, this.f36210f, this.f36211g.a(), this.f36212h));
    }
}
