package ub;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicLong;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class k<T> extends ub.a<T, T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb.l f36292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f36293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f36294g;

    public static abstract class a<T> extends ac.a<T> implements lb.f<T>, Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.l.c f36295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f36296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f36297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f36298f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AtomicLong f36299g = new AtomicLong();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public me.c f36300h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public sb.i<T> f36301i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f36302j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile boolean f36303k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Throwable f36304l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f36305m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f36306n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f36307o;

        public a(lb.l.c cVar, boolean z10, int i10) {
            this.f36295c = cVar;
            this.f36296d = z10;
            this.f36297e = i10;
            this.f36298f = i10 - (i10 >> 2);
        }

        @Override // me.b
        public final void a(Throwable th) {
            if (this.f36303k) {
                dc.a.b(th);
                return;
            }
            this.f36304l = th;
            this.f36303k = true;
            j();
        }

        @Override // me.c
        public final void cancel() {
            if (this.f36302j) {
                return;
            }
            this.f36302j = true;
            this.f36300h.cancel();
            this.f36295c.dispose();
            if (this.f36307o || getAndIncrement() != 0) {
                return;
            }
            this.f36301i.clear();
        }

        @Override // sb.i
        public final void clear() {
            this.f36301i.clear();
        }

        @Override // me.b
        public final void d(T t10) {
            if (this.f36303k) {
                return;
            }
            if (this.f36305m == 2) {
                j();
                return;
            }
            if (!this.f36301i.offer(t10)) {
                this.f36300h.cancel();
                this.f36304l = new ob.b("Queue is full?!");
                this.f36303k = true;
            }
            j();
        }

        public final boolean f(boolean z10, boolean z11, me.b<?> bVar) {
            Throwable th;
            if (this.f36302j) {
                this.f36301i.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (!this.f36296d) {
                th = this.f36304l;
                if (th != null) {
                    this.f36302j = true;
                    this.f36301i.clear();
                    bVar.a(th);
                } else {
                    if (!z11) {
                        return false;
                    }
                    this.f36302j = true;
                    bVar.onComplete();
                }
            } else {
                if (!z11) {
                    return false;
                }
                this.f36302j = true;
                th = this.f36304l;
                if (th != null) {
                    bVar.a(th);
                } else {
                    bVar.onComplete();
                }
            }
            this.f36295c.dispose();
            return true;
        }

        public abstract void g();

        public abstract void h();

        public abstract void i();

        @Override // sb.i
        public final boolean isEmpty() {
            return this.f36301i.isEmpty();
        }

        public final void j() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f36295c.b(this);
        }

        @Override // me.b
        public final void onComplete() {
            if (this.f36303k) {
                return;
            }
            this.f36303k = true;
            j();
        }

        @Override // me.c
        public final void request(long j10) {
            if (ac.g.validate(j10)) {
                h9.d.a(this.f36299g, j10);
                j();
            }
        }

        @Override // sb.e
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f36307o = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f36307o) {
                h();
            } else if (this.f36305m == 1) {
                i();
            } else {
                g();
            }
        }
    }

    public static final class b<T> extends a<T> {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final sb.a<? super T> f36308p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f36309q;

        public b(sb.a<? super T> aVar, lb.l.c cVar, boolean z10, int i10) {
            super(cVar, z10, i10);
            this.f36308p = aVar;
        }

        @Override // lb.f, me.b
        public void c(me.c cVar) {
            if (ac.g.validate(this.f36300h, cVar)) {
                this.f36300h = cVar;
                if (cVar instanceof sb.f) {
                    sb.f fVar = (sb.f) cVar;
                    int iRequestFusion = fVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f36305m = 1;
                        this.f36301i = fVar;
                        this.f36303k = true;
                        this.f36308p.c(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f36305m = 2;
                        this.f36301i = fVar;
                        this.f36308p.c(this);
                        cVar.request(this.f36297e);
                        return;
                    }
                }
                this.f36301i = new xb.a(this.f36297e);
                this.f36308p.c(this);
                cVar.request(this.f36297e);
            }
        }

        @Override // ub.k.a
        public void g() {
            sb.a<? super T> aVar = this.f36308p;
            sb.i<T> iVar = this.f36301i;
            long j10 = this.f36306n;
            long j11 = this.f36309q;
            int iAddAndGet = 1;
            while (true) {
                long j12 = this.f36299g.get();
                while (j10 != j12) {
                    boolean z10 = this.f36303k;
                    try {
                        T tPoll = iVar.poll();
                        boolean z11 = tPoll == null;
                        if (f(z10, z11, aVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        if (aVar.e(tPoll)) {
                            j10++;
                        }
                        j11++;
                        if (j11 == this.f36298f) {
                            this.f36300h.request(j11);
                            j11 = 0;
                        }
                    } catch (Throwable th) {
                        c0.Q(th);
                        this.f36302j = true;
                        this.f36300h.cancel();
                        iVar.clear();
                        aVar.a(th);
                        this.f36295c.dispose();
                        return;
                    }
                }
                if (j10 == j12 && f(this.f36303k, iVar.isEmpty(), aVar)) {
                    return;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.f36306n = j10;
                    this.f36309q = j11;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // ub.k.a
        public void h() {
            int iAddAndGet = 1;
            while (!this.f36302j) {
                boolean z10 = this.f36303k;
                this.f36308p.d(null);
                if (z10) {
                    this.f36302j = true;
                    Throwable th = this.f36304l;
                    if (th != null) {
                        this.f36308p.a(th);
                    } else {
                        this.f36308p.onComplete();
                    }
                    this.f36295c.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // ub.k.a
        public void i() {
            sb.a<? super T> aVar = this.f36308p;
            sb.i<T> iVar = this.f36301i;
            long j10 = this.f36306n;
            int iAddAndGet = 1;
            loop0: while (true) {
                long j11 = this.f36299g.get();
                while (j10 != j11) {
                    try {
                        T tPoll = iVar.poll();
                        if (this.f36302j) {
                            return;
                        }
                        if (tPoll == null) {
                            break loop0;
                        } else if (aVar.e(tPoll)) {
                            j10++;
                        }
                    } catch (Throwable th) {
                        c0.Q(th);
                        this.f36302j = true;
                        this.f36300h.cancel();
                        aVar.a(th);
                    }
                }
                if (this.f36302j) {
                    return;
                }
                if (iVar.isEmpty()) {
                    break;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.f36306n = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
            this.f36302j = true;
            aVar.onComplete();
            this.f36295c.dispose();
        }

        @Override // sb.i
        public T poll() throws Exception {
            T tPoll = this.f36301i.poll();
            if (tPoll != null && this.f36305m != 1) {
                long j10 = this.f36309q + 1;
                if (j10 == this.f36298f) {
                    this.f36309q = 0L;
                    this.f36300h.request(j10);
                } else {
                    this.f36309q = j10;
                }
            }
            return tPoll;
        }
    }

    /* JADX WARN: Unexpected interfaces in signature: [lb.f<T>] */
    public static final class c<T> extends a<T> {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final me.b<? super T> f36310p;

        public c(me.b<? super T> bVar, lb.l.c cVar, boolean z10, int i10) {
            super(cVar, z10, i10);
            this.f36310p = bVar;
        }

        @Override // lb.f, me.b
        public void c(me.c cVar) {
            if (ac.g.validate(this.f36300h, cVar)) {
                this.f36300h = cVar;
                if (cVar instanceof sb.f) {
                    sb.f fVar = (sb.f) cVar;
                    int iRequestFusion = fVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f36305m = 1;
                        this.f36301i = fVar;
                        this.f36303k = true;
                        this.f36310p.c(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f36305m = 2;
                        this.f36301i = fVar;
                        this.f36310p.c(this);
                        cVar.request(this.f36297e);
                        return;
                    }
                }
                this.f36301i = new xb.a(this.f36297e);
                this.f36310p.c(this);
                cVar.request(this.f36297e);
            }
        }

        @Override // ub.k.a
        public void g() {
            me.b<? super T> bVar = this.f36310p;
            sb.i<T> iVar = this.f36301i;
            long j10 = this.f36306n;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.f36299g.get();
                while (j10 != jAddAndGet) {
                    boolean z10 = this.f36303k;
                    try {
                        T tPoll = iVar.poll();
                        boolean z11 = tPoll == null;
                        if (f(z10, z11, bVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        bVar.d(tPoll);
                        j10++;
                        if (j10 == this.f36298f) {
                            if (jAddAndGet != RecyclerView.FOREVER_NS) {
                                jAddAndGet = this.f36299g.addAndGet(-j10);
                            }
                            this.f36300h.request(j10);
                            j10 = 0;
                        }
                    } catch (Throwable th) {
                        c0.Q(th);
                        this.f36302j = true;
                        this.f36300h.cancel();
                        iVar.clear();
                        bVar.a(th);
                        this.f36295c.dispose();
                        return;
                    }
                }
                if (j10 == jAddAndGet && f(this.f36303k, iVar.isEmpty(), bVar)) {
                    return;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.f36306n = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // ub.k.a
        public void h() {
            int iAddAndGet = 1;
            while (!this.f36302j) {
                boolean z10 = this.f36303k;
                this.f36310p.d(null);
                if (z10) {
                    this.f36302j = true;
                    Throwable th = this.f36304l;
                    if (th != null) {
                        this.f36310p.a(th);
                    } else {
                        this.f36310p.onComplete();
                    }
                    this.f36295c.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // ub.k.a
        public void i() {
            me.b<? super T> bVar = this.f36310p;
            sb.i<T> iVar = this.f36301i;
            long j10 = this.f36306n;
            int iAddAndGet = 1;
            loop0: while (true) {
                long j11 = this.f36299g.get();
                while (j10 != j11) {
                    try {
                        T tPoll = iVar.poll();
                        if (this.f36302j) {
                            return;
                        }
                        if (tPoll == null) {
                            break loop0;
                        }
                        bVar.d(tPoll);
                        j10++;
                    } catch (Throwable th) {
                        c0.Q(th);
                        this.f36302j = true;
                        this.f36300h.cancel();
                        bVar.a(th);
                    }
                }
                if (this.f36302j) {
                    return;
                }
                if (iVar.isEmpty()) {
                    break;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.f36306n = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
            this.f36302j = true;
            bVar.onComplete();
            this.f36295c.dispose();
        }

        @Override // sb.i
        public T poll() throws Exception {
            T tPoll = this.f36301i.poll();
            if (tPoll != null && this.f36305m != 1) {
                long j10 = this.f36306n + 1;
                if (j10 == this.f36298f) {
                    this.f36306n = 0L;
                    this.f36300h.request(j10);
                } else {
                    this.f36306n = j10;
                }
            }
            return tPoll;
        }
    }

    public k(lb.c<T> cVar, lb.l lVar, boolean z10, int i10) {
        super(cVar);
        this.f36292e = lVar;
        this.f36293f = z10;
        this.f36294g = i10;
    }

    @Override // lb.c
    public void h(me.b<? super T> bVar) {
        lb.c<T> cVar;
        lb.f<? super T> cVar2;
        lb.l.c cVarA = this.f36292e.a();
        if (bVar instanceof sb.a) {
            cVar = this.f36195d;
            cVar2 = new b<>((sb.a) bVar, cVarA, this.f36293f, this.f36294g);
        } else {
            cVar = this.f36195d;
            cVar2 = new c<>(bVar, cVarA, this.f36293f, this.f36294g);
        }
        cVar.g(cVar2);
    }
}
