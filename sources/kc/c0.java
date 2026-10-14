package kc;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 implements Iterator<Integer>, wc.a {
    public abstract int a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
