package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.fs0;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class a<E> extends q0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18289b;

    public a(int i10, int i11) {
        fs0.b(i11, i10);
        this.f18288a = i10;
        this.f18289b = i11;
    }

    public abstract E a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f18289b < this.f18288a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18289b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f18289b;
        this.f18289b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18289b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f18289b - 1;
        this.f18289b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18289b - 1;
    }
}
