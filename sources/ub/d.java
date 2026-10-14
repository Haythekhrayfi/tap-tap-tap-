package ub;

import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T> extends ub.a<T, T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pb.b<? super T> f36224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pb.b<? super Throwable> f36225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pb.a f36226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pb.a f36227h;

    public static final class a<T> extends zb.a<T, T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final pb.b<? super T> f36228h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final pb.b<? super Throwable> f36229i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final pb.a f36230j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final pb.a f36231k;

        public a(sb.a<? super T> aVar, pb.b<? super T> bVar, pb.b<? super Throwable> bVar2, pb.a aVar2, pb.a aVar3) {
            super(aVar);
            this.f36228h = bVar;
            this.f36229i = bVar2;
            this.f36230j = aVar2;
            this.f36231k = aVar3;
        }

        @Override // zb.a, me.b
        public void a(Throwable th) {
            if (this.f45257f) {
                dc.a.b(th);
                return;
            }
            boolean z10 = true;
            this.f45257f = true;
            try {
                this.f36229i.accept(th);
            } catch (Throwable th2) {
                c0.Q(th2);
                this.f45254c.a(new ob.a(th, th2));
                z10 = false;
            }
            if (z10) {
                this.f45254c.a(th);
            }
            try {
                this.f36231k.run();
            } catch (Throwable th3) {
                c0.Q(th3);
                dc.a.b(th3);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // me.b
        public void d(T t10) {
            if (this.f45257f) {
                return;
            }
            if (this.f45258g != 0) {
                this.f45254c.d(null);
                return;
            }
            try {
                this.f36228h.accept(t10);
                this.f45254c.d((Object) t10);
            } catch (Throwable th) {
                b(th);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // sb.a
        public boolean e(T t10) {
            if (this.f45257f) {
                return false;
            }
            try {
                this.f36228h.accept(t10);
                return this.f45254c.e((Object) t10);
            } catch (Throwable th) {
                b(th);
                return false;
            }
        }

        @Override // zb.a, me.b
        public void onComplete() {
            if (this.f45257f) {
                return;
            }
            try {
                this.f36230j.run();
                this.f45257f = true;
                this.f45254c.onComplete();
                try {
                    this.f36231k.run();
                } catch (Throwable th) {
                    c0.Q(th);
                    dc.a.b(th);
                }
            } catch (Throwable th2) {
                b(th2);
            }
        }

        @Override // sb.i
        public T poll() throws Exception {
            try {
                T tPoll = this.f45256e.poll();
                if (tPoll == null) {
                    if (this.f45258g == 1) {
                        this.f36230j.run();
                    }
                    return tPoll;
                }
                try {
                    this.f36228h.accept(tPoll);
                } catch (Throwable th) {
                    try {
                        c0.Q(th);
                        try {
                            this.f36229i.accept(th);
                            throw bc.e.c(th);
                        } catch (Throwable th2) {
                            throw new ob.a(th, th2);
                        }
                    } catch (Throwable th3) {
                        this.f36231k.run();
                        throw th3;
                    }
                }
                this.f36231k.run();
                return tPoll;
            } catch (Throwable th4) {
                c0.Q(th4);
                try {
                    this.f36229i.accept(th4);
                    throw bc.e.c(th4);
                } catch (Throwable th5) {
                    throw new ob.a(th4, th5);
                }
            }
        }

        @Override // sb.e
        public int requestFusion(int i10) {
            sb.f<T> fVar = this.f45256e;
            if (fVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = fVar.requestFusion(i10);
            if (iRequestFusion == 0) {
                return iRequestFusion;
            }
            this.f45258g = iRequestFusion;
            return iRequestFusion;
        }
    }

    public static final class b<T> extends zb.b<T, T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final pb.b<? super T> f36232h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final pb.b<? super Throwable> f36233i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final pb.a f36234j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final pb.a f36235k;

        public b(me.b<? super T> bVar, pb.b<? super T> bVar2, pb.b<? super Throwable> bVar3, pb.a aVar, pb.a aVar2) {
            super(bVar);
            this.f36232h = bVar2;
            this.f36233i = bVar3;
            this.f36234j = aVar;
            this.f36235k = aVar2;
        }

        @Override // zb.b, me.b
        public void a(Throwable th) {
            if (this.f45262f) {
                dc.a.b(th);
                return;
            }
            boolean z10 = true;
            this.f45262f = true;
            try {
                this.f36233i.accept(th);
            } catch (Throwable th2) {
                c0.Q(th2);
                this.f45259c.a(new ob.a(th, th2));
                z10 = false;
            }
            if (z10) {
                this.f45259c.a(th);
            }
            try {
                this.f36235k.run();
            } catch (Throwable th3) {
                c0.Q(th3);
                dc.a.b(th3);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // me.b
        public void d(T t10) {
            if (this.f45262f) {
                return;
            }
            if (this.f45263g != 0) {
                this.f45259c.d(null);
                return;
            }
            try {
                this.f36232h.accept(t10);
                this.f45259c.d((Object) t10);
            } catch (Throwable th) {
                c0.Q(th);
                this.f45260d.cancel();
                a(th);
            }
        }

        @Override // zb.b, me.b
        public void onComplete() {
            if (this.f45262f) {
                return;
            }
            try {
                this.f36234j.run();
                this.f45262f = true;
                this.f45259c.onComplete();
                try {
                    this.f36235k.run();
                } catch (Throwable th) {
                    c0.Q(th);
                    dc.a.b(th);
                }
            } catch (Throwable th2) {
                c0.Q(th2);
                this.f45260d.cancel();
                a(th2);
            }
        }

        @Override // sb.i
        public T poll() throws Exception {
            try {
                T tPoll = this.f45261e.poll();
                if (tPoll == null) {
                    if (this.f45263g == 1) {
                        this.f36234j.run();
                    }
                    return tPoll;
                }
                try {
                    this.f36232h.accept(tPoll);
                } catch (Throwable th) {
                    try {
                        c0.Q(th);
                        try {
                            this.f36233i.accept(th);
                            throw bc.e.c(th);
                        } catch (Throwable th2) {
                            throw new ob.a(th, th2);
                        }
                    } catch (Throwable th3) {
                        this.f36235k.run();
                        throw th3;
                    }
                }
                this.f36235k.run();
                return tPoll;
            } catch (Throwable th4) {
                c0.Q(th4);
                try {
                    this.f36233i.accept(th4);
                    throw bc.e.c(th4);
                } catch (Throwable th5) {
                    throw new ob.a(th4, th5);
                }
            }
        }

        @Override // sb.e
        public int requestFusion(int i10) {
            sb.f<T> fVar = this.f45261e;
            if (fVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = fVar.requestFusion(i10);
            if (iRequestFusion == 0) {
                return iRequestFusion;
            }
            this.f45263g = iRequestFusion;
            return iRequestFusion;
        }
    }

    public d(lb.c<T> cVar, pb.b<? super T> bVar, pb.b<? super Throwable> bVar2, pb.a aVar, pb.a aVar2) {
        super(cVar);
        this.f36224e = bVar;
        this.f36225f = bVar2;
        this.f36226g = aVar;
        this.f36227h = aVar2;
    }

    @Override // lb.c
    public void h(me.b<? super T> bVar) {
        lb.c<T> cVar;
        lb.f<? super T> bVar2;
        if (bVar instanceof sb.a) {
            cVar = this.f36195d;
            bVar2 = new a<>((sb.a) bVar, this.f36224e, this.f36225f, this.f36226g, this.f36227h);
        } else {
            cVar = this.f36195d;
            bVar2 = new b<>(bVar, this.f36224e, this.f36225f, this.f36226g, this.f36227h);
        }
        cVar.g(bVar2);
    }
}
