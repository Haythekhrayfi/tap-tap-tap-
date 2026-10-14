package ub;

import java.util.Objects;
import java.util.concurrent.Callable;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class q<T, R> extends lb.c<R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f36346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pb.c<? super T, ? extends me.a<? extends R>> f36347e;

    public q(T t10, pb.c<? super T, ? extends me.a<? extends R>> cVar) {
        this.f36346d = t10;
        this.f36347e = cVar;
    }

    @Override // lb.c
    public void h(me.b<? super R> bVar) {
        try {
            me.a<? extends R> aVarApply = this.f36347e.apply(this.f36346d);
            Objects.requireNonNull(aVarApply, "The mapper returned a null Publisher");
            me.a<? extends R> aVar = aVarApply;
            if (!(aVar instanceof Callable)) {
                aVar.a(bVar);
                return;
            }
            try {
                Object objCall = ((Callable) aVar).call();
                if (objCall == null) {
                    ac.d.complete(bVar);
                } else {
                    bVar.c(new ac.e(bVar, objCall));
                }
            } catch (Throwable th) {
                c0.Q(th);
                ac.d.error(th, bVar);
            }
        } catch (Throwable th2) {
            ac.d.error(th2, bVar);
        }
    }
}
