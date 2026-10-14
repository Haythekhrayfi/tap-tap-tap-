package lb;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ub.q;
import ub.r;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c<T> implements me.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f33052c = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @Override // me.a
    public final void a(me.b<? super T> bVar) {
        if (bVar instanceof f) {
            g((f) bVar);
        } else {
            Objects.requireNonNull(bVar, "s is null");
            g(new zb.d(bVar));
        }
    }

    public final <R> c<R> b(g<? super T, ? extends R> gVar) {
        kb.a aVar = (kb.a) gVar;
        return new kb.a(this, aVar.f31974e, aVar.f31975f, aVar.f31976g);
    }

    public final c<T> c(long j10, TimeUnit timeUnit) {
        l lVar = fc.a.f29533a;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(lVar, "scheduler is null");
        return new ub.c(this, Math.max(0L, j10), timeUnit, lVar, false);
    }

    public final c<T> d(pb.b<? super T> bVar) {
        pb.b<Object> bVar2 = rb.a.f35360c;
        pb.a aVar = rb.a.f35359b;
        return new ub.d(this, bVar, bVar2, aVar, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> c<R> e(pb.c<? super T, ? extends me.a<? extends R>> cVar) {
        int i10 = f33052c;
        rb.b.a(i10, "maxConcurrency");
        rb.b.a(i10, "bufferSize");
        if (!(this instanceof sb.g)) {
            return new ub.f(this, cVar, false, i10, i10);
        }
        Object objCall = ((sb.g) this).call();
        return objCall == null ? (c<R>) ub.e.f36236d : new q(objCall, cVar);
    }

    public final <U> c<U> f(pb.c<? super T, ? extends Iterable<? extends U>> cVar) {
        int i10 = f33052c;
        rb.b.a(i10, "bufferSize");
        return new ub.g(this, cVar, i10);
    }

    public final void g(f<? super T> fVar) {
        Objects.requireNonNull(fVar, "s is null");
        try {
            h(fVar);
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

    public abstract void h(me.b<? super T> bVar);

    public final c<T> i(l lVar) {
        Objects.requireNonNull(lVar, "scheduler is null");
        return new r(this, lVar, !(this instanceof ub.b));
    }
}
