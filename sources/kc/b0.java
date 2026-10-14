package kc;

import fd.j0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class b0<T> implements Iterator<z<? extends T>>, wc.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterator<T> f31990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31991d;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(Iterator<? extends T> it) {
        j0.i(it, "iterator");
        this.f31990c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31990c.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f31991d;
        this.f31991d = i10 + 1;
        if (i10 >= 0) {
            return new z(i10, this.f31990c.next());
        }
        l.i();
        throw null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
