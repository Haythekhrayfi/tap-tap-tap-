package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.fs0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class o0<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator<? extends F> f18372a;

    public o0(Iterator<? extends F> it) {
        this.f18372a = (Iterator) fs0.a(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18372a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return (T) ((Map.Entry) this.f18372a.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f18372a.remove();
    }
}
