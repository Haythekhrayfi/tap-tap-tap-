package vb;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T, U> extends vb.a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pb.c<? super T, ? extends lb.j<? extends U>> f36811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bc.d f36813f;

    public static final class a<T, R> extends AtomicInteger implements lb.k<T>, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super R> f36814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final pb.c<? super T, ? extends lb.j<? extends R>> f36815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f36816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final bc.c f36817f = new bc.c();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final C0441a<R> f36818g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f36819h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public sb.i<T> f36820i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public nb.b f36821j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile boolean f36822k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public volatile boolean f36823l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public volatile boolean f36824m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f36825n;

        /* JADX INFO: renamed from: vb.c$a$a, reason: collision with other inner class name */
        public static final class C0441a<R> extends AtomicReference<nb.b> implements lb.k<R> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final lb.k<? super R> f36826c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final a<?, R> f36827d;

            public C0441a(lb.k<? super R> kVar, a<?, R> aVar) {
                this.f36826c = kVar;
                this.f36827d = aVar;
            }

            @Override // lb.k
            public void a(Throwable th) {
                a<?, R> aVar = this.f36827d;
                if (!bc.e.a(aVar.f36817f, th)) {
                    dc.a.b(th);
                    return;
                }
                if (!aVar.f36819h) {
                    aVar.f36821j.dispose();
                }
                aVar.f36822k = false;
                aVar.c();
            }

            @Override // lb.k
            public void b(nb.b bVar) {
                qb.b.replace(this, bVar);
            }

            @Override // lb.k
            public void d(R r10) {
                this.f36826c.d(r10);
            }

            @Override // lb.k
            public void onComplete() {
                a<?, R> aVar = this.f36827d;
                aVar.f36822k = false;
                aVar.c();
            }
        }

        public a(lb.k<? super R> kVar, pb.c<? super T, ? extends lb.j<? extends R>> cVar, int i10, boolean z10) {
            this.f36814c = kVar;
            this.f36815d = cVar;
            this.f36816e = i10;
            this.f36819h = z10;
            this.f36818g = new C0441a<>(kVar, this);
        }

        @Override // lb.k
        public void a(Throwable th) {
            if (!bc.e.a(this.f36817f, th)) {
                dc.a.b(th);
            } else {
                this.f36823l = true;
                c();
            }
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            if (qb.b.validate(this.f36821j, bVar)) {
                this.f36821j = bVar;
                if (bVar instanceof sb.d) {
                    sb.d dVar = (sb.d) bVar;
                    int iRequestFusion = dVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f36825n = iRequestFusion;
                        this.f36820i = dVar;
                        this.f36823l = true;
                        this.f36814c.b(this);
                        c();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f36825n = iRequestFusion;
                        this.f36820i = dVar;
                        this.f36814c.b(this);
                        return;
                    }
                }
                this.f36820i = new xb.b(this.f36816e);
                this.f36814c.b(this);
            }
        }

        public void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            lb.k<? super R> kVar = this.f36814c;
            sb.i<T> iVar = this.f36820i;
            bc.c cVar = this.f36817f;
            while (true) {
                if (!this.f36822k) {
                    if (this.f36824m) {
                        iVar.clear();
                        return;
                    }
                    if (!this.f36819h && cVar.get() != null) {
                        iVar.clear();
                        this.f36824m = true;
                        kVar.a(bc.e.b(cVar));
                        return;
                    }
                    boolean z10 = this.f36823l;
                    try {
                        T tPoll = iVar.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            this.f36824m = true;
                            Throwable thB = bc.e.b(cVar);
                            if (thB != null) {
                                kVar.a(thB);
                                return;
                            } else {
                                kVar.onComplete();
                                return;
                            }
                        }
                        if (!z11) {
                            try {
                                lb.j<? extends R> jVarApply = this.f36815d.apply(tPoll);
                                Objects.requireNonNull(jVarApply, "The mapper returned a null ObservableSource");
                                lb.j<? extends R> jVar = jVarApply;
                                if (jVar instanceof Callable) {
                                    try {
                                        a1.a aVar = (Object) ((Callable) jVar).call();
                                        if (aVar != null && !this.f36824m) {
                                            kVar.d(aVar);
                                        }
                                    } catch (Throwable th) {
                                        c0.Q(th);
                                        bc.e.a(cVar, th);
                                    }
                                } else {
                                    this.f36822k = true;
                                    jVar.c(this.f36818g);
                                }
                            } catch (Throwable th2) {
                                c0.Q(th2);
                                this.f36824m = true;
                                this.f36821j.dispose();
                                iVar.clear();
                                bc.e.a(cVar, th2);
                                kVar.a(bc.e.b(cVar));
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        c0.Q(th3);
                        this.f36824m = true;
                        this.f36821j.dispose();
                        bc.e.a(cVar, th3);
                        kVar.a(bc.e.b(cVar));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // lb.k
        public void d(T t10) {
            if (this.f36825n == 0) {
                this.f36820i.offer(t10);
            }
            c();
        }

        @Override // nb.b
        public void dispose() {
            this.f36824m = true;
            this.f36821j.dispose();
            C0441a<R> c0441a = this.f36818g;
            Objects.requireNonNull(c0441a);
            qb.b.dispose(c0441a);
        }

        @Override // lb.k
        public void onComplete() {
            this.f36823l = true;
            c();
        }
    }

    public static final class b<T, U> extends AtomicInteger implements lb.k<T>, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super U> f36828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final pb.c<? super T, ? extends lb.j<? extends U>> f36829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a<U> f36830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f36831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public sb.i<T> f36832g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public nb.b f36833h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f36834i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f36835j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile boolean f36836k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f36837l;

        public static final class a<U> extends AtomicReference<nb.b> implements lb.k<U> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final lb.k<? super U> f36838c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final b<?, ?> f36839d;

            public a(lb.k<? super U> kVar, b<?, ?> bVar) {
                this.f36838c = kVar;
                this.f36839d = bVar;
            }

            @Override // lb.k
            public void a(Throwable th) {
                this.f36839d.dispose();
                this.f36838c.a(th);
            }

            @Override // lb.k
            public void b(nb.b bVar) {
                qb.b.replace(this, bVar);
            }

            @Override // lb.k
            public void d(U u10) {
                this.f36838c.d(u10);
            }

            @Override // lb.k
            public void onComplete() {
                b<?, ?> bVar = this.f36839d;
                bVar.f36834i = false;
                bVar.c();
            }
        }

        public b(lb.k<? super U> kVar, pb.c<? super T, ? extends lb.j<? extends U>> cVar, int i10) {
            this.f36828c = kVar;
            this.f36829d = cVar;
            this.f36831f = i10;
            this.f36830e = new a<>(kVar, this);
        }

        @Override // lb.k
        public void a(Throwable th) {
            if (this.f36836k) {
                dc.a.b(th);
                return;
            }
            this.f36836k = true;
            dispose();
            this.f36828c.a(th);
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            if (qb.b.validate(this.f36833h, bVar)) {
                this.f36833h = bVar;
                if (bVar instanceof sb.d) {
                    sb.d dVar = (sb.d) bVar;
                    int iRequestFusion = dVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f36837l = iRequestFusion;
                        this.f36832g = dVar;
                        this.f36836k = true;
                        this.f36828c.b(this);
                        c();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f36837l = iRequestFusion;
                        this.f36832g = dVar;
                        this.f36828c.b(this);
                        return;
                    }
                }
                this.f36832g = new xb.b(this.f36831f);
                this.f36828c.b(this);
            }
        }

        public void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f36835j) {
                if (!this.f36834i) {
                    boolean z10 = this.f36836k;
                    try {
                        T tPoll = this.f36832g.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            this.f36835j = true;
                            this.f36828c.onComplete();
                            return;
                        }
                        if (!z11) {
                            try {
                                lb.j<? extends U> jVarApply = this.f36829d.apply(tPoll);
                                Objects.requireNonNull(jVarApply, "The mapper returned a null ObservableSource");
                                lb.j<? extends U> jVar = jVarApply;
                                this.f36834i = true;
                                jVar.c(this.f36830e);
                            } catch (Throwable th) {
                                c0.Q(th);
                                dispose();
                                this.f36832g.clear();
                                this.f36828c.a(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        c0.Q(th2);
                        dispose();
                        this.f36832g.clear();
                        this.f36828c.a(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f36832g.clear();
        }

        @Override // lb.k
        public void d(T t10) {
            if (this.f36836k) {
                return;
            }
            if (this.f36837l == 0) {
                this.f36832g.offer(t10);
            }
            c();
        }

        @Override // nb.b
        public void dispose() {
            this.f36835j = true;
            a<U> aVar = this.f36830e;
            Objects.requireNonNull(aVar);
            qb.b.dispose(aVar);
            this.f36833h.dispose();
            if (getAndIncrement() == 0) {
                this.f36832g.clear();
            }
        }

        @Override // lb.k
        public void onComplete() {
            if (this.f36836k) {
                return;
            }
            this.f36836k = true;
            c();
        }
    }

    public c(lb.j<T> jVar, pb.c<? super T, ? extends lb.j<? extends U>> cVar, int i10, bc.d dVar) {
        super(jVar);
        this.f36811d = cVar;
        this.f36813f = dVar;
        this.f36812e = Math.max(8, i10);
    }

    @Override // lb.i
    public void t(lb.k<? super U> kVar) {
        if (t.a(this.f36794c, kVar, this.f36811d)) {
            return;
        }
        if (this.f36813f == bc.d.IMMEDIATE) {
            this.f36794c.c(new b(new cc.a(kVar), this.f36811d, this.f36812e));
        } else {
            this.f36794c.c(new a(kVar, this.f36811d, this.f36812e, this.f36813f == bc.d.END));
        }
    }
}
