package f8;

import fd.j0;
import java.util.Iterator;
import q.i;

/* JADX INFO: loaded from: classes2.dex */
public final class g<T> implements Iterator<T>, wc.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<T> f29421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29422d;

    public g(i<T> iVar) {
        j0.i(iVar, "array");
        this.f29421c = iVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f29421c.h() > this.f29422d;
    }

    @Override // java.util.Iterator
    public T next() {
        i<T> iVar = this.f29421c;
        int i10 = this.f29422d;
        this.f29422d = i10 + 1;
        return iVar.i(i10);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
