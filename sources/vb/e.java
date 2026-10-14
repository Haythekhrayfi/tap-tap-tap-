package vb;

import java.util.Objects;
import java.util.concurrent.Callable;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class e<T> extends lb.i<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<? extends lb.j<? extends T>> f36855c;

    public e(Callable<? extends lb.j<? extends T>> callable) {
        this.f36855c = callable;
    }

    @Override // lb.i
    public void t(lb.k<? super T> kVar) {
        try {
            lb.j<? extends T> jVarCall = this.f36855c.call();
            Objects.requireNonNull(jVarCall, "null ObservableSource supplied");
            jVarCall.c(kVar);
        } catch (Throwable th) {
            c0.Q(th);
            qb.c.error(th, kVar);
        }
    }
}
