package dd;

import fd.j0;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<g<T>> f28924a;

    public a(g<? extends T> gVar) {
        j0.i(gVar, "sequence");
        this.f28924a = new AtomicReference<>(gVar);
    }

    @Override // dd.g
    public Iterator<T> iterator() {
        g<T> andSet = this.f28924a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
