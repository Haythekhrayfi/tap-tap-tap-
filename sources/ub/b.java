package ub;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> extends lb.c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb.e<T> f36196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb.a f36197e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36198a;

        static {
            int[] iArr = new int[lb.a.values().length];
            f36198a = iArr;
            try {
                iArr[lb.a.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36198a[lb.a.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36198a[lb.a.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36198a[lb.a.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: ub.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0428b<T> extends AtomicLong implements lb.d<T>, me.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final me.b<? super T> f36199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final qb.e f36200d = new qb.e();

        public AbstractC0428b(me.b<? super T> bVar) {
            this.f36199c = bVar;
        }

        public void a() {
            if (c()) {
                return;
            }
            try {
                this.f36199c.onComplete();
            } finally {
                qb.e eVar = this.f36200d;
                Objects.requireNonNull(eVar);
                qb.b.dispose(eVar);
            }
        }

        public boolean b(Throwable th) {
            qb.e eVar;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (c()) {
                return false;
            }
            try {
                this.f36199c.a(th);
                return true;
            } finally {
                eVar = this.f36200d;
                Objects.requireNonNull(eVar);
                qb.b.dispose(eVar);
            }
        }

        public final boolean c() {
            return this.f36200d.a();
        }

        @Override // me.c
        public final void cancel() {
            qb.e eVar = this.f36200d;
            Objects.requireNonNull(eVar);
            qb.b.dispose(eVar);
            f();
        }

        public final void d(Throwable th) {
            if (g(th)) {
                return;
            }
            dc.a.b(th);
        }

        public void e() {
        }

        public void f() {
        }

        public boolean g(Throwable th) {
            return b(th);
        }

        @Override // me.c
        public final void request(long j10) {
            if (ac.g.validate(j10)) {
                h9.d.a(this, j10);
                e();
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    public static final class c<T> extends AbstractC0428b<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final xb.b<T> f36201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Throwable f36202f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f36203g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AtomicInteger f36204h;

        public c(me.b<? super T> bVar, int i10) {
            super(bVar);
            this.f36201e = new xb.b<>(i10);
            this.f36204h = new AtomicInteger();
        }

        @Override // ub.b.AbstractC0428b
        public void e() {
            h();
        }

        @Override // ub.b.AbstractC0428b
        public void f() {
            if (this.f36204h.getAndIncrement() == 0) {
                this.f36201e.clear();
            }
        }

        @Override // ub.b.AbstractC0428b
        public boolean g(Throwable th) {
            if (this.f36203g || c()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f36202f = th;
            this.f36203g = true;
            h();
            return true;
        }

        public void h() {
            if (this.f36204h.getAndIncrement() != 0) {
                return;
            }
            me.b<? super T> bVar = this.f36199c;
            xb.b<T> bVar2 = this.f36201e;
            int iAddAndGet = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (j11 != j10) {
                    if (c()) {
                        bVar2.clear();
                        return;
                    }
                    boolean z10 = this.f36203g;
                    T tPoll = bVar2.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        Throwable th = this.f36202f;
                        if (th != null) {
                            b(th);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    bVar.d(tPoll);
                    j11++;
                }
                if (j11 == j10) {
                    if (c()) {
                        bVar2.clear();
                        return;
                    }
                    boolean z12 = this.f36203g;
                    boolean zIsEmpty = bVar2.isEmpty();
                    if (z12 && zIsEmpty) {
                        Throwable th2 = this.f36202f;
                        if (th2 != null) {
                            b(th2);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    h9.d.m(this, j11);
                }
                iAddAndGet = this.f36204h.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    public static final class d<T> extends h<T> {
        public d(me.b<? super T> bVar) {
            super(bVar);
        }
    }

    public static final class e<T> extends h<T> {
        public e(me.b<? super T> bVar) {
            super(bVar);
        }
    }

    public static final class f<T> extends AbstractC0428b<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReference<T> f36205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Throwable f36206f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f36207g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AtomicInteger f36208h;

        public f(me.b<? super T> bVar) {
            super(bVar);
            this.f36205e = new AtomicReference<>();
            this.f36208h = new AtomicInteger();
        }

        @Override // ub.b.AbstractC0428b
        public void e() {
            h();
        }

        @Override // ub.b.AbstractC0428b
        public void f() {
            if (this.f36208h.getAndIncrement() == 0) {
                this.f36205e.lazySet(null);
            }
        }

        @Override // ub.b.AbstractC0428b
        public boolean g(Throwable th) {
            if (this.f36207g || c()) {
                return false;
            }
            if (th == null) {
                d(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f36206f = th;
            this.f36207g = true;
            h();
            return true;
        }

        public void h() {
            if (this.f36208h.getAndIncrement() != 0) {
                return;
            }
            me.b<? super T> bVar = this.f36199c;
            AtomicReference<T> atomicReference = this.f36205e;
            int iAddAndGet = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (c()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z10 = this.f36207g;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z11 = andSet == null;
                    if (z10 && z11) {
                        Throwable th = this.f36206f;
                        if (th != null) {
                            b(th);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    bVar.d(andSet);
                    j11++;
                }
                if (j11 == j10) {
                    if (c()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z12 = this.f36207g;
                    boolean z13 = atomicReference.get() == null;
                    if (z12 && z13) {
                        Throwable th2 = this.f36206f;
                        if (th2 != null) {
                            b(th2);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    h9.d.m(this, j11);
                }
                iAddAndGet = this.f36208h.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    public static final class g<T> extends AbstractC0428b<T> {
        public g(me.b<? super T> bVar) {
            super(bVar);
        }
    }

    public static abstract class h<T> extends AbstractC0428b<T> {
        public h(me.b<? super T> bVar) {
            super(bVar);
        }
    }

    public b(lb.e<T> eVar, lb.a aVar) {
        this.f36196d = eVar;
        this.f36197e = aVar;
    }

    @Override // lb.c
    public void h(me.b<? super T> bVar) {
        AbstractC0428b gVar;
        int i10 = a.f36198a[this.f36197e.ordinal()];
        if (i10 == 1) {
            gVar = new g(bVar);
        } else if (i10 == 2) {
            gVar = new e(bVar);
        } else if (i10 != 3) {
            gVar = i10 != 4 ? new c(bVar, lb.c.f33052c) : new f(bVar);
        } else {
            gVar = new d(bVar);
        }
        bVar.c(gVar);
        try {
            this.f36196d.a(gVar);
        } catch (Throwable th) {
            c0.Q(th);
            if (gVar.g(th)) {
                return;
            }
            dc.a.b(th);
        }
    }
}
