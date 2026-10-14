package wb;

import java.util.Objects;
import java.util.concurrent.Callable;
import lb.n;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class f<T> extends lb.m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable<? extends T> f37275a;

    public f(Callable<? extends T> callable) {
        this.f37275a = callable;
    }

    @Override // lb.m
    public void m(n<? super T> nVar) {
        nb.c cVar = new nb.c(rb.a.f35358a);
        nVar.b(cVar);
        if (cVar.a()) {
            return;
        }
        try {
            T tCall = this.f37275a.call();
            Objects.requireNonNull(tCall, "The callable returned a null value");
            if (cVar.a()) {
                return;
            }
            nVar.onSuccess(tCall);
        } catch (Throwable th) {
            c0.Q(th);
            if (cVar.a()) {
                dc.a.b(th);
            } else {
                nVar.a(th);
            }
        }
    }
}
