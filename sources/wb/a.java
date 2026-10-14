package wb;

import java.util.Objects;
import java.util.concurrent.Callable;
import lb.n;
import lb.o;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T> extends lb.m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable<? extends o<? extends T>> f37248a;

    public a(Callable<? extends o<? extends T>> callable) {
        this.f37248a = callable;
    }

    @Override // lb.m
    public void m(n<? super T> nVar) {
        try {
            o<? extends T> oVarCall = this.f37248a.call();
            Objects.requireNonNull(oVarCall, "The singleSupplier returned a null SingleSource");
            oVarCall.a(nVar);
        } catch (Throwable th) {
            c0.Q(th);
            qb.c.error(th, nVar);
        }
    }
}
