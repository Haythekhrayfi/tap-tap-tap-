package vb;

import java.util.Objects;
import java.util.concurrent.Callable;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class l<T> extends lb.i<T> implements Callable<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<? extends T> f36914c;

    public l(Callable<? extends T> callable) {
        this.f36914c = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        T tCall = this.f36914c.call();
        Objects.requireNonNull(tCall, "The callable returned a null value");
        return tCall;
    }

    @Override // lb.i
    public void t(lb.k<? super T> kVar) {
        tb.e eVar = new tb.e(kVar);
        kVar.b(eVar);
        if (eVar.e()) {
            return;
        }
        try {
            T tCall = this.f36914c.call();
            Objects.requireNonNull(tCall, "Callable returned null");
            eVar.c(tCall);
        } catch (Throwable th) {
            c0.Q(th);
            if (eVar.e()) {
                dc.a.b(th);
            } else {
                kVar.a(th);
            }
        }
    }
}
