package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
abstract class aw<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator<? extends F> f4835a;

    public aw(Iterator<? extends F> it) {
        this.f4835a = (Iterator) Preconditions.checkNotNull(it);
    }

    public abstract T a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4835a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f4835a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4835a.remove();
    }
}
