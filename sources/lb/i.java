package lb;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import vb.p;
import vb.q;
import vb.r;
import vb.s;
import vb.t;
import vb.u;
import vb.v;
import vb.w;
import vb.y;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i<T> implements j<T> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33053a;

        static {
            int[] iArr = new int[lb.a.values().length];
            f33053a = iArr;
            try {
                iArr[lb.a.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33053a[lb.a.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33053a[lb.a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33053a[lb.a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static <T> i<T> l(Iterable<? extends T> iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return new vb.m(iterable);
    }

    public static i<Long> m(long j10, TimeUnit timeUnit) {
        l lVar = fc.a.f29533a;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(lVar, "scheduler is null");
        return new vb.n(Math.max(0L, j10), Math.max(0L, j10), timeUnit, lVar);
    }

    public static <T> i<T> n(T t10) {
        Objects.requireNonNull(t10, "item is null");
        return new vb.o(t10);
    }

    public static i<Long> w(long j10, TimeUnit timeUnit) {
        l lVar = fc.a.f29533a;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(lVar, "scheduler is null");
        return new w(Math.max(j10, 0L), timeUnit, lVar);
    }

    @Override // lb.j
    public final void c(k<? super T> kVar) {
        Objects.requireNonNull(kVar, "observer is null");
        try {
            t(kVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            c0.Q(th);
            dc.a.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final i<List<T>> f(int i10) {
        Callable callableAsCallable = bc.b.asCallable();
        rb.b.a(i10, "count");
        rb.b.a(i10, "skip");
        Objects.requireNonNull(callableAsCallable, "bufferSupplier is null");
        return new vb.b(this, i10, i10, callableAsCallable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> i<R> g(pb.c<? super T, ? extends j<? extends R>> cVar) {
        i<R> cVar2;
        rb.b.a(2, "prefetch");
        if (this instanceof sb.g) {
            Object objCall = ((sb.g) this).call();
            if (objCall == null) {
                return (i<R>) vb.i.f36884c;
            }
            cVar2 = new t.b<>(objCall, cVar);
        } else {
            cVar2 = new vb.c<>(this, cVar, 2, bc.d.IMMEDIATE);
        }
        return cVar2;
    }

    public final i<T> h(long j10, TimeUnit timeUnit) {
        l lVar = fc.a.f29533a;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(lVar, "scheduler is null");
        return new vb.f(this, j10, timeUnit, lVar, false);
    }

    public final i<T> i(pb.b<? super T> bVar, pb.b<? super Throwable> bVar2, pb.a aVar, pb.a aVar2) {
        Objects.requireNonNull(bVar, "onNext is null");
        Objects.requireNonNull(bVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        return new vb.g(this, bVar, bVar2, aVar, aVar2);
    }

    public final i<T> j(pb.d<? super T> dVar) {
        return new vb.j(this, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> i<R> k(pb.c<? super T, ? extends j<? extends R>> cVar) {
        int i10 = c.f33052c;
        rb.b.a(Integer.MAX_VALUE, "maxConcurrency");
        rb.b.a(i10, "bufferSize");
        if (!(this instanceof sb.g)) {
            return new vb.k(this, cVar, false, Integer.MAX_VALUE, i10);
        }
        Object objCall = ((sb.g) this).call();
        return objCall == null ? (i<R>) vb.i.f36884c : new t.b(objCall, cVar);
    }

    public final <R> i<R> o(pb.c<? super T, ? extends R> cVar) {
        return new p(this, cVar);
    }

    public final i<T> p(l lVar) {
        return q(lVar, false, c.f33052c);
    }

    public final i<T> q(l lVar, boolean z10, int i10) {
        Objects.requireNonNull(lVar, "scheduler is null");
        rb.b.a(i10, "bufferSize");
        return new q(this, lVar, z10, i10);
    }

    public final i<T> r(pb.c<? super Throwable, ? extends T> cVar) {
        return new r(this, cVar);
    }

    public final i<T> s(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? (i<T>) vb.i.f36884c : new s(this, j10);
        }
        throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("times >= 0 required but it was ", j10));
    }

    public abstract void t(k<? super T> kVar);

    public final i<T> u(l lVar) {
        Objects.requireNonNull(lVar, "scheduler is null");
        return new u(this, lVar);
    }

    public final i<T> v(long j10) {
        if (j10 >= 0) {
            return new v(this, j10);
        }
        throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("count >= 0 required but it was ", j10));
    }

    public final c<T> x(lb.a aVar) {
        ub.i iVar = new ub.i(this);
        int i10 = a.f33053a[aVar.ordinal()];
        if (i10 == 1) {
            return new ub.m(iVar);
        }
        if (i10 == 2) {
            return new ub.o(iVar);
        }
        if (i10 == 3) {
            return iVar;
        }
        if (i10 == 4) {
            return new ub.n(iVar);
        }
        int i11 = c.f33052c;
        rb.b.a(i11, "capacity");
        return new ub.l(iVar, i11, true, false, rb.a.f35359b);
    }

    public final m<List<T>> y() {
        rb.b.a(16, "capacityHint");
        return new y(this, 16);
    }
}
