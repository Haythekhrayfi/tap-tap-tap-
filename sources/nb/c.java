package nb;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends AtomicReference implements b {
    public c(Runnable runnable) {
        super(runnable);
    }

    public final boolean a() {
        return get() == null;
    }

    @Override // nb.b
    public final void dispose() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        ((Runnable) andSet).run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        StringBuilder sbA = defpackage.a.a("RunnableDisposable(disposed=");
        sbA.append(a());
        sbA.append(", ");
        sbA.append(get());
        sbA.append(")");
        return sbA.toString();
    }
}
