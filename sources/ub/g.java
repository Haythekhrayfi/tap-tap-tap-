package ub;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class g<T, R> extends ub.a<T, R> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pb.c<? super T, ? extends Iterable<? extends R>> f36268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f36269f;

    public static final class a<T, R> extends ac.a<R> implements lb.f<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final me.b<? super R> f36270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final pb.c<? super T, ? extends Iterable<? extends R>> f36271d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f36272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f36273f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public me.c f36275h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public sb.i<T> f36276i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f36277j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile boolean f36278k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Iterator<? extends R> f36280m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f36281n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f36282o;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AtomicReference<Throwable> f36279l = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AtomicLong f36274g = new AtomicLong();

        public a(me.b<? super R> bVar, pb.c<? super T, ? extends Iterable<? extends R>> cVar, int i10) {
            this.f36270c = bVar;
            this.f36271d = cVar;
            this.f36272e = i10;
            this.f36273f = i10 - (i10 >> 2);
        }

        @Override // me.b
        public void a(Throwable th) {
            if (this.f36277j || !bc.e.a(this.f36279l, th)) {
                dc.a.b(th);
            } else {
                this.f36277j = true;
                h();
            }
        }

        @Override // lb.f, me.b
        public void c(me.c cVar) {
            if (ac.g.validate(this.f36275h, cVar)) {
                this.f36275h = cVar;
                if (cVar instanceof sb.f) {
                    sb.f fVar = (sb.f) cVar;
                    int iRequestFusion = fVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f36282o = iRequestFusion;
                        this.f36276i = fVar;
                        this.f36277j = true;
                        this.f36270c.c(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f36282o = iRequestFusion;
                        this.f36276i = fVar;
                        this.f36270c.c(this);
                        cVar.request(this.f36272e);
                        return;
                    }
                }
                this.f36276i = new xb.a(this.f36272e);
                this.f36270c.c(this);
                cVar.request(this.f36272e);
            }
        }

        @Override // me.c
        public void cancel() {
            if (this.f36278k) {
                return;
            }
            this.f36278k = true;
            this.f36275h.cancel();
            if (getAndIncrement() == 0) {
                this.f36276i.clear();
            }
        }

        @Override // sb.i
        public void clear() {
            this.f36280m = null;
            this.f36276i.clear();
        }

        @Override // me.b
        public void d(T t10) {
            if (this.f36277j) {
                return;
            }
            if (this.f36282o != 0 || this.f36276i.offer(t10)) {
                h();
            } else {
                a(new ob.b("Queue is full?!"));
            }
        }

        public boolean f(boolean z10, boolean z11, me.b<?> bVar, sb.i<?> iVar) {
            if (this.f36278k) {
                this.f36280m = null;
                iVar.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f36279l.get() == null) {
                if (!z11) {
                    return false;
                }
                bVar.onComplete();
                return true;
            }
            Throwable thB = bc.e.b(this.f36279l);
            this.f36280m = null;
            iVar.clear();
            bVar.a(thB);
            return true;
        }

        public void g(boolean z10) {
            if (z10) {
                int i10 = this.f36281n + 1;
                if (i10 != this.f36273f) {
                    this.f36281n = i10;
                } else {
                    this.f36281n = 0;
                    this.f36275h.request(i10);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:69:0x0105 A[PHI: r6
  0x0105: PHI (r6v4 java.util.Iterator<? extends R>) = (r6v3 java.util.Iterator<? extends R>), (r6v6 java.util.Iterator<? extends R>) binds: [B:32:0x007d, B:67:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:89:0x010c A[SYNTHETIC] */
        public void h() {
            Throwable th;
            Throwable thB;
            if (getAndIncrement() != 0) {
                return;
            }
            me.b<?> bVar = this.f36270c;
            sb.i<T> iVar = this.f36276i;
            boolean z10 = true;
            boolean z11 = this.f36282o != 1;
            Iterator<? extends R> it = this.f36280m;
            int iAddAndGet = 1;
            while (true) {
                if (it == null) {
                    boolean z12 = this.f36277j;
                    try {
                        T tPoll = iVar.poll();
                        if (f(z12, tPoll == null ? z10 : false, bVar, iVar)) {
                            return;
                        }
                        if (tPoll != null) {
                            try {
                                it = this.f36271d.apply(tPoll).iterator();
                                if (it.hasNext()) {
                                    this.f36280m = it;
                                } else {
                                    g(z11);
                                    it = null;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                c0.Q(th);
                                this.f36275h.cancel();
                                bc.e.a(this.f36279l, th);
                                thB = bc.e.b(this.f36279l);
                                bVar.a(thB);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        c0.Q(th3);
                        this.f36275h.cancel();
                        bc.e.a(this.f36279l, th3);
                        thB = bc.e.b(this.f36279l);
                        this.f36280m = null;
                        iVar.clear();
                        bVar.a(thB);
                        return;
                    }
                }
                if (it != null) {
                    long j10 = this.f36274g.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        if (f(this.f36277j, false, bVar, iVar)) {
                            return;
                        }
                        try {
                            R next = it.next();
                            Objects.requireNonNull(next, "The iterator returned a null value");
                            bVar.d(next);
                            if (f(this.f36277j, false, bVar, iVar)) {
                                return;
                            }
                            j11++;
                            try {
                                if (!it.hasNext()) {
                                    g(z11);
                                    this.f36280m = null;
                                    it = null;
                                    break;
                                }
                            } catch (Throwable th4) {
                                c0.Q(th4);
                                this.f36280m = null;
                                this.f36275h.cancel();
                                bc.e.a(this.f36279l, th4);
                                thB = bc.e.b(this.f36279l);
                                bVar.a(thB);
                                return;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c0.Q(th);
                            this.f36280m = null;
                            this.f36275h.cancel();
                            bc.e.a(this.f36279l, th);
                            thB = bc.e.b(this.f36279l);
                            bVar.a(thB);
                            return;
                        }
                    }
                    if (j11 == j10) {
                        if (f(this.f36277j, iVar.isEmpty() && it == null, bVar, iVar)) {
                            return;
                        }
                    }
                    if (j11 != 0 && j10 != RecyclerView.FOREVER_NS) {
                        this.f36274g.addAndGet(-j11);
                    }
                    if (it != null) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                z10 = true;
            }
        }

        @Override // sb.i
        public boolean isEmpty() {
            return this.f36280m == null && this.f36276i.isEmpty();
        }

        @Override // me.b
        public void onComplete() {
            if (this.f36277j) {
                return;
            }
            this.f36277j = true;
            h();
        }

        @Override // sb.i
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f36280m;
            while (it == null) {
                T tPoll = this.f36276i.poll();
                if (tPoll != null) {
                    it = this.f36271d.apply(tPoll).iterator();
                    if (it.hasNext()) {
                        this.f36280m = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f36280m = null;
            }
            return next;
        }

        @Override // me.c
        public void request(long j10) {
            if (ac.g.validate(j10)) {
                h9.d.a(this.f36274g, j10);
                h();
            }
        }

        @Override // sb.e
        public int requestFusion(int i10) {
            return ((i10 & 1) == 0 || this.f36282o != 1) ? 0 : 1;
        }
    }

    public g(lb.c<T> cVar, pb.c<? super T, ? extends Iterable<? extends R>> cVar2, int i10) {
        super(cVar);
        this.f36268e = cVar2;
        this.f36269f = i10;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // lb.c
    public void h(me.b<? super R> bVar) {
        lb.c<T> cVar = this.f36195d;
        if (!(cVar instanceof Callable)) {
            cVar.g(new a(bVar, this.f36268e, this.f36269f));
            return;
        }
        try {
            Object objCall = ((Callable) cVar).call();
            if (objCall == null) {
                ac.d.complete(bVar);
                return;
            }
            try {
                h.j(bVar, this.f36268e.apply(objCall).iterator());
            } catch (Throwable th) {
                c0.Q(th);
                ac.d.error(th, bVar);
            }
        } catch (Throwable th2) {
            c0.Q(th2);
            ac.d.error(th2, bVar);
        }
    }
}
