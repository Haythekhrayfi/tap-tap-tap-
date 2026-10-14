package lb;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ub.p;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m<T> implements o<T> {
    public static <T> m<T> g(T t10) {
        Objects.requireNonNull(t10, "item is null");
        return new wb.g(t10);
    }

    @Override // lb.o
    public final void a(n<? super T> nVar) {
        Objects.requireNonNull(nVar, "observer is null");
        try {
            m(nVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            c0.Q(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final m<T> d(long j10, TimeUnit timeUnit) {
        l lVar = fc.a.f29533a;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(lVar, "scheduler is null");
        return new wb.b(this, j10, timeUnit, lVar, false);
    }

    public final m<T> e(pb.b<? super T> bVar) {
        return new wb.d(this, bVar);
    }

    public final <R> m<R> f(pb.c<? super T, ? extends o<? extends R>> cVar) {
        return new wb.e(this, cVar);
    }

    public final <R> m<R> h(pb.c<? super T, ? extends R> cVar) {
        return new wb.h(this, cVar);
    }

    public final m<T> i(l lVar) {
        Objects.requireNonNull(lVar, "scheduler is null");
        return new wb.i(this, lVar);
    }

    public final m<T> j(pb.c<Throwable, ? extends T> cVar) {
        return new wb.j(this, cVar, null);
    }

    public final c<T> k(long j10) {
        c<T> cVarO = o();
        Objects.requireNonNull(cVarO);
        if (j10 >= 0) {
            return j10 == 0 ? (c<T>) ub.e.f36236d : new p(cVarO, j10);
        }
        throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("times >= 0 required but it was ", j10));
    }

    public final nb.b l(pb.b<? super T> bVar, pb.b<? super Throwable> bVar2) {
        tb.d dVar = new tb.d(bVar, bVar2);
        a(dVar);
        return dVar;
    }

    public abstract void m(n<? super T> nVar);

    public final m<T> n(l lVar) {
        Objects.requireNonNull(lVar, "scheduler is null");
        return new wb.k(this, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c<T> o() {
        return this instanceof sb.b ? ((sb.b) this).c() : new wb.l(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<T> p() {
        return this instanceof sb.c ? ((sb.c) this).b() : new wb.m(this);
    }
}
