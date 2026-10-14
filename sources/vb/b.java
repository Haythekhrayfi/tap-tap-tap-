package vb;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T, U extends Collection<? super T>> extends vb.a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Callable<U> f36797f;

    public static final class a<T, U extends Collection<? super T>> implements lb.k<T>, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super U> f36798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f36799d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Callable<U> f36800e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public U f36801f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f36802g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public nb.b f36803h;

        public a(lb.k<? super U> kVar, int i10, Callable<U> callable) {
            this.f36798c = kVar;
            this.f36799d = i10;
            this.f36800e = callable;
        }

        @Override // lb.k
        public void a(Throwable th) {
            this.f36801f = null;
            this.f36798c.a(th);
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            if (qb.b.validate(this.f36803h, bVar)) {
                this.f36803h = bVar;
                this.f36798c.b(this);
            }
        }

        public boolean c() {
            try {
                U uCall = this.f36800e.call();
                Objects.requireNonNull(uCall, "Empty buffer supplied");
                this.f36801f = uCall;
                return true;
            } catch (Throwable th) {
                c0.Q(th);
                this.f36801f = null;
                nb.b bVar = this.f36803h;
                if (bVar == null) {
                    qb.c.error(th, this.f36798c);
                    return false;
                }
                bVar.dispose();
                this.f36798c.a(th);
                return false;
            }
        }

        @Override // lb.k
        public void d(T t10) {
            U u10 = this.f36801f;
            if (u10 != null) {
                u10.add(t10);
                int i10 = this.f36802g + 1;
                this.f36802g = i10;
                if (i10 >= this.f36799d) {
                    this.f36798c.d(u10);
                    this.f36802g = 0;
                    c();
                }
            }
        }

        @Override // nb.b
        public void dispose() {
            this.f36803h.dispose();
        }

        @Override // lb.k
        public void onComplete() {
            U u10 = this.f36801f;
            if (u10 != null) {
                this.f36801f = null;
                if (!u10.isEmpty()) {
                    this.f36798c.d(u10);
                }
                this.f36798c.onComplete();
            }
        }
    }

    /* JADX INFO: renamed from: vb.b$b, reason: collision with other inner class name */
    public static final class C0440b<T, U extends Collection<? super T>> extends AtomicBoolean implements lb.k<T>, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super U> f36804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f36805d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f36806e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Callable<U> f36807f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public nb.b f36808g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ArrayDeque<U> f36809h = new ArrayDeque<>();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f36810i;

        public C0440b(lb.k<? super U> kVar, int i10, int i11, Callable<U> callable) {
            this.f36804c = kVar;
            this.f36805d = i10;
            this.f36806e = i11;
            this.f36807f = callable;
        }

        @Override // lb.k
        public void a(Throwable th) {
            this.f36809h.clear();
            this.f36804c.a(th);
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            if (qb.b.validate(this.f36808g, bVar)) {
                this.f36808g = bVar;
                this.f36804c.b(this);
            }
        }

        @Override // lb.k
        public void d(T t10) {
            long j10 = this.f36810i;
            this.f36810i = 1 + j10;
            if (j10 % ((long) this.f36806e) == 0) {
                try {
                    U uCall = this.f36807f.call();
                    Objects.requireNonNull(uCall, "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.f36809h.offer(uCall);
                } catch (Throwable th) {
                    this.f36809h.clear();
                    this.f36808g.dispose();
                    this.f36804c.a(th);
                    return;
                }
            }
            Iterator<U> it = this.f36809h.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t10);
                if (this.f36805d <= next.size()) {
                    it.remove();
                    this.f36804c.d(next);
                }
            }
        }

        @Override // nb.b
        public void dispose() {
            this.f36808g.dispose();
        }

        @Override // lb.k
        public void onComplete() {
            while (!this.f36809h.isEmpty()) {
                this.f36804c.d(this.f36809h.poll());
            }
            this.f36804c.onComplete();
        }
    }

    public b(lb.j<T> jVar, int i10, int i11, Callable<U> callable) {
        super(jVar);
        this.f36795d = i10;
        this.f36796e = i11;
        this.f36797f = callable;
    }

    @Override // lb.i
    public void t(lb.k<? super U> kVar) {
        int i10 = this.f36796e;
        int i11 = this.f36795d;
        if (i10 != i11) {
            this.f36794c.c(new C0440b(kVar, this.f36795d, this.f36796e, this.f36797f));
            return;
        }
        a aVar = new a(kVar, i11, this.f36797f);
        if (aVar.c()) {
            this.f36794c.c(aVar);
        }
    }
}
