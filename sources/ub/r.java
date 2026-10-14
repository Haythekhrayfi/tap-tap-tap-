package ub;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class r<T> extends ub.a<T, T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb.l f36348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f36349f;

    public static final class a<T> extends AtomicReference<Thread> implements lb.f<T>, me.c, Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final me.b<? super T> f36350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final lb.l.c f36351d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReference<me.c> f36352e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicLong f36353f = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f36354g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public me.a<T> f36355h;

        /* JADX INFO: renamed from: ub.r$a$a, reason: collision with other inner class name */
        public static final class RunnableC0431a implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final me.c f36356c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f36357d;

            public RunnableC0431a(me.c cVar, long j10) {
                this.f36356c = cVar;
                this.f36357d = j10;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f36356c.request(this.f36357d);
            }
        }

        public a(me.b<? super T> bVar, lb.l.c cVar, me.a<T> aVar, boolean z10) {
            this.f36350c = bVar;
            this.f36351d = cVar;
            this.f36355h = aVar;
            this.f36354g = !z10;
        }

        @Override // me.b
        public void a(Throwable th) {
            this.f36350c.a(th);
            this.f36351d.dispose();
        }

        public void b(long j10, me.c cVar) {
            if (this.f36354g || Thread.currentThread() == get()) {
                cVar.request(j10);
            } else {
                this.f36351d.b(new RunnableC0431a(cVar, j10));
            }
        }

        @Override // lb.f, me.b
        public void c(me.c cVar) {
            if (ac.g.setOnce(this.f36352e, cVar)) {
                long andSet = this.f36353f.getAndSet(0L);
                if (andSet != 0) {
                    b(andSet, cVar);
                }
            }
        }

        @Override // me.c
        public void cancel() {
            ac.g.cancel(this.f36352e);
            this.f36351d.dispose();
        }

        @Override // me.b
        public void d(T t10) {
            this.f36350c.d(t10);
        }

        @Override // me.b
        public void onComplete() {
            this.f36350c.onComplete();
            this.f36351d.dispose();
        }

        @Override // me.c
        public void request(long j10) {
            if (ac.g.validate(j10)) {
                me.c cVar = this.f36352e.get();
                if (cVar != null) {
                    b(j10, cVar);
                    return;
                }
                h9.d.a(this.f36353f, j10);
                me.c cVar2 = this.f36352e.get();
                if (cVar2 != null) {
                    long andSet = this.f36353f.getAndSet(0L);
                    if (andSet != 0) {
                        b(andSet, cVar2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            me.a<T> aVar = this.f36355h;
            this.f36355h = null;
            aVar.a(this);
        }
    }

    public r(lb.c<T> cVar, lb.l lVar, boolean z10) {
        super(cVar);
        this.f36348e = lVar;
        this.f36349f = z10;
    }

    @Override // lb.c
    public void h(me.b<? super T> bVar) {
        lb.l.c cVarA = this.f36348e.a();
        a aVar = new a(bVar, cVarA, this.f36195d, this.f36349f);
        bVar.c(aVar);
        cVarA.b(aVar);
    }
}
