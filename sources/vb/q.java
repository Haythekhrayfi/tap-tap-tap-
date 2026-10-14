package vb;

import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class q<T> extends vb.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb.l f36931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f36933f;

    public static final class a<T> extends tb.b<T> implements lb.k<T>, Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super T> f36934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final lb.l.c f36935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f36936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f36937f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public sb.i<T> f36938g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public nb.b f36939h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Throwable f36940i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f36941j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile boolean f36942k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f36943l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f36944m;

        public a(lb.k<? super T> kVar, lb.l.c cVar, boolean z10, int i10) {
            this.f36934c = kVar;
            this.f36935d = cVar;
            this.f36936e = z10;
            this.f36937f = i10;
        }

        @Override // lb.k
        public void a(Throwable th) {
            if (this.f36941j) {
                dc.a.b(th);
                return;
            }
            this.f36940i = th;
            this.f36941j = true;
            e();
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            if (qb.b.validate(this.f36939h, bVar)) {
                this.f36939h = bVar;
                if (bVar instanceof sb.d) {
                    sb.d dVar = (sb.d) bVar;
                    int iRequestFusion = dVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f36943l = iRequestFusion;
                        this.f36938g = dVar;
                        this.f36941j = true;
                        this.f36934c.b(this);
                        e();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f36943l = iRequestFusion;
                        this.f36938g = dVar;
                        this.f36934c.b(this);
                        return;
                    }
                }
                this.f36938g = new xb.b(this.f36937f);
                this.f36934c.b(this);
            }
        }

        public boolean c(boolean z10, boolean z11, lb.k<? super T> kVar) {
            if (this.f36942k) {
                this.f36938g.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th = this.f36940i;
            if (this.f36936e) {
                if (!z11) {
                    return false;
                }
                this.f36942k = true;
                if (th != null) {
                    kVar.a(th);
                } else {
                    kVar.onComplete();
                }
                this.f36935d.dispose();
                return true;
            }
            if (th != null) {
                this.f36942k = true;
                this.f36938g.clear();
                kVar.a(th);
                this.f36935d.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f36942k = true;
            kVar.onComplete();
            this.f36935d.dispose();
            return true;
        }

        @Override // sb.i
        public void clear() {
            this.f36938g.clear();
        }

        @Override // lb.k
        public void d(T t10) {
            if (this.f36941j) {
                return;
            }
            if (this.f36943l != 2) {
                this.f36938g.offer(t10);
            }
            e();
        }

        @Override // nb.b
        public void dispose() {
            if (this.f36942k) {
                return;
            }
            this.f36942k = true;
            this.f36939h.dispose();
            this.f36935d.dispose();
            if (this.f36944m || getAndIncrement() != 0) {
                return;
            }
            this.f36938g.clear();
        }

        public void e() {
            if (getAndIncrement() == 0) {
                this.f36935d.b(this);
            }
        }

        @Override // sb.i
        public boolean isEmpty() {
            return this.f36938g.isEmpty();
        }

        @Override // lb.k
        public void onComplete() {
            if (this.f36941j) {
                return;
            }
            this.f36941j = true;
            e();
        }

        @Override // sb.i
        public T poll() throws Exception {
            return this.f36938g.poll();
        }

        @Override // sb.e
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f36944m = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f36944m) {
                int iAddAndGet = 1;
                while (!this.f36942k) {
                    boolean z10 = this.f36941j;
                    Throwable th = this.f36940i;
                    if (this.f36936e || !z10 || th == null) {
                        this.f36934c.d(null);
                        if (z10) {
                            this.f36942k = true;
                            Throwable th2 = this.f36940i;
                            if (th2 != null) {
                                this.f36934c.a(th2);
                            } else {
                                this.f36934c.onComplete();
                            }
                        } else {
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                return;
                            }
                        }
                    } else {
                        this.f36942k = true;
                        this.f36934c.a(this.f36940i);
                    }
                    this.f36935d.dispose();
                    return;
                }
                return;
            }
            sb.i<T> iVar = this.f36938g;
            lb.k<? super T> kVar = this.f36934c;
            int iAddAndGet2 = 1;
            while (!c(this.f36941j, iVar.isEmpty(), kVar)) {
                while (true) {
                    boolean z11 = this.f36941j;
                    try {
                        T tPoll = iVar.poll();
                        boolean z12 = tPoll == null;
                        if (c(z11, z12, kVar)) {
                            return;
                        }
                        if (z12) {
                            break;
                        } else {
                            kVar.d(tPoll);
                        }
                    } catch (Throwable th3) {
                        c0.Q(th3);
                        this.f36942k = true;
                        this.f36939h.dispose();
                        iVar.clear();
                        kVar.a(th3);
                        this.f36935d.dispose();
                        return;
                    }
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
                if (iAddAndGet2 == 0) {
                    return;
                }
            }
        }
    }

    public q(lb.j<T> jVar, lb.l lVar, boolean z10, int i10) {
        super(jVar);
        this.f36931d = lVar;
        this.f36932e = z10;
        this.f36933f = i10;
    }

    @Override // lb.i
    public void t(lb.k<? super T> kVar) {
        lb.l lVar = this.f36931d;
        if (lVar instanceof yb.m) {
            this.f36794c.c(kVar);
        } else {
            this.f36794c.c(new a(kVar, lVar.a(), this.f36932e, this.f36933f));
        }
    }
}
