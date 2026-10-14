package ub;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class o<T> extends ub.a<T, T> {

    public static final class a<T> extends AtomicInteger implements lb.f<T>, me.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final me.b<? super T> f36333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public me.c f36334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f36335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Throwable f36336f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f36337g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AtomicLong f36338h = new AtomicLong();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AtomicReference<T> f36339i = new AtomicReference<>();

        public a(me.b<? super T> bVar) {
            this.f36333c = bVar;
        }

        @Override // me.b
        public void a(Throwable th) {
            this.f36336f = th;
            this.f36335e = true;
            f();
        }

        public boolean b(boolean z10, boolean z11, me.b<?> bVar, AtomicReference<T> atomicReference) {
            if (this.f36337g) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th = this.f36336f;
            if (th != null) {
                atomicReference.lazySet(null);
                bVar.a(th);
                return true;
            }
            if (!z11) {
                return false;
            }
            bVar.onComplete();
            return true;
        }

        @Override // lb.f, me.b
        public void c(me.c cVar) {
            if (ac.g.validate(this.f36334d, cVar)) {
                this.f36334d = cVar;
                this.f36333c.c(this);
                cVar.request(RecyclerView.FOREVER_NS);
            }
        }

        @Override // me.c
        public void cancel() {
            if (this.f36337g) {
                return;
            }
            this.f36337g = true;
            this.f36334d.cancel();
            if (getAndIncrement() == 0) {
                this.f36339i.lazySet(null);
            }
        }

        @Override // me.b
        public void d(T t10) {
            this.f36339i.lazySet(t10);
            f();
        }

        public void f() {
            if (getAndIncrement() != 0) {
                return;
            }
            me.b<? super T> bVar = this.f36333c;
            AtomicLong atomicLong = this.f36338h;
            AtomicReference<T> atomicReference = this.f36339i;
            int iAddAndGet = 1;
            do {
                long j10 = 0;
                while (true) {
                    if (j10 == atomicLong.get()) {
                        break;
                    }
                    boolean z10 = this.f36335e;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z11 = andSet == null;
                    if (b(z10, z11, bVar, atomicReference)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    bVar.d(andSet);
                    j10++;
                }
                if (j10 == atomicLong.get()) {
                    if (b(this.f36335e, atomicReference.get() == null, bVar, atomicReference)) {
                        return;
                    }
                }
                if (j10 != 0) {
                    h9.d.m(atomicLong, j10);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // me.b
        public void onComplete() {
            this.f36335e = true;
            f();
        }

        @Override // me.c
        public void request(long j10) {
            if (ac.g.validate(j10)) {
                h9.d.a(this.f36338h, j10);
                f();
            }
        }
    }

    public o(lb.c<T> cVar) {
        super(cVar);
    }

    @Override // lb.c
    public void h(me.b<? super T> bVar) {
        this.f36195d.g(new a(bVar));
    }
}
