package ub;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicLong;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class l<T> extends ub.a<T, T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f36312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f36313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pb.a f36314h;

    public static final class a<T> extends ac.a<T> implements lb.f<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final me.b<? super T> f36315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final sb.h<T> f36316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f36317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final pb.a f36318f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public me.c f36319g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f36320h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f36321i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Throwable f36322j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final AtomicLong f36323k = new AtomicLong();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f36324l;

        public a(me.b<? super T> bVar, int i10, boolean z10, boolean z11, pb.a aVar) {
            this.f36315c = bVar;
            this.f36318f = aVar;
            this.f36317e = z11;
            this.f36316d = z10 ? new xb.b<>(i10) : new xb.a<>(i10);
        }

        @Override // me.b
        public void a(Throwable th) {
            this.f36322j = th;
            this.f36321i = true;
            if (this.f36324l) {
                this.f36315c.a(th);
            } else {
                g();
            }
        }

        @Override // lb.f, me.b
        public void c(me.c cVar) {
            if (ac.g.validate(this.f36319g, cVar)) {
                this.f36319g = cVar;
                this.f36315c.c(this);
                cVar.request(RecyclerView.FOREVER_NS);
            }
        }

        @Override // me.c
        public void cancel() {
            if (this.f36320h) {
                return;
            }
            this.f36320h = true;
            this.f36319g.cancel();
            if (this.f36324l || getAndIncrement() != 0) {
                return;
            }
            this.f36316d.clear();
        }

        @Override // sb.i
        public void clear() {
            this.f36316d.clear();
        }

        @Override // me.b
        public void d(T t10) {
            if (this.f36316d.offer(t10)) {
                if (this.f36324l) {
                    this.f36315c.d(null);
                    return;
                } else {
                    g();
                    return;
                }
            }
            this.f36319g.cancel();
            ob.b bVar = new ob.b("Buffer is full");
            try {
                this.f36318f.run();
            } catch (Throwable th) {
                c0.Q(th);
                bVar.initCause(th);
            }
            a(bVar);
        }

        public boolean f(boolean z10, boolean z11, me.b<? super T> bVar) {
            if (this.f36320h) {
                this.f36316d.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f36317e) {
                if (!z11) {
                    return false;
                }
                Throwable th = this.f36322j;
                if (th != null) {
                    bVar.a(th);
                } else {
                    bVar.onComplete();
                }
                return true;
            }
            Throwable th2 = this.f36322j;
            if (th2 != null) {
                this.f36316d.clear();
                bVar.a(th2);
                return true;
            }
            if (!z11) {
                return false;
            }
            bVar.onComplete();
            return true;
        }

        public void g() {
            if (getAndIncrement() == 0) {
                sb.h<T> hVar = this.f36316d;
                me.b<? super T> bVar = this.f36315c;
                int iAddAndGet = 1;
                while (!f(this.f36321i, hVar.isEmpty(), bVar)) {
                    long j10 = this.f36323k.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        boolean z10 = this.f36321i;
                        T tPoll = hVar.poll();
                        boolean z11 = tPoll == null;
                        if (f(z10, z11, bVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        bVar.d(tPoll);
                        j11++;
                    }
                    if (j11 == j10 && f(this.f36321i, hVar.isEmpty(), bVar)) {
                        return;
                    }
                    if (j11 != 0 && j10 != RecyclerView.FOREVER_NS) {
                        this.f36323k.addAndGet(-j11);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // sb.i
        public boolean isEmpty() {
            return this.f36316d.isEmpty();
        }

        @Override // me.b
        public void onComplete() {
            this.f36321i = true;
            if (this.f36324l) {
                this.f36315c.onComplete();
            } else {
                g();
            }
        }

        @Override // sb.i
        public T poll() throws Exception {
            return this.f36316d.poll();
        }

        @Override // me.c
        public void request(long j10) {
            if (this.f36324l || !ac.g.validate(j10)) {
                return;
            }
            h9.d.a(this.f36323k, j10);
            g();
        }

        @Override // sb.e
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f36324l = true;
            return 2;
        }
    }

    public l(lb.c<T> cVar, int i10, boolean z10, boolean z11, pb.a aVar) {
        super(cVar);
        this.f36311e = i10;
        this.f36312f = z10;
        this.f36313g = z11;
        this.f36314h = aVar;
    }

    @Override // lb.c
    public void h(me.b<? super T> bVar) {
        this.f36195d.g(new a(bVar, this.f36311e, this.f36312f, this.f36313g, this.f36314h));
    }
}
