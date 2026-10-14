package vc;

import fd.j0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> implements Iterator<T>, wc.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T[] f36989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36990d;

    public b(T[] tArr) {
        j0.i(tArr, "array");
        this.f36989c = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36990d < this.f36989c.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f36989c;
            int i10 = this.f36990d;
            this.f36990d = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f36990d--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
