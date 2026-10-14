package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class a<E> extends ay<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4783b;

    public a(int i10, int i11) {
        Preconditions.checkPositionIndex(i11, i10);
        this.f4782a = i10;
        this.f4783b = i11;
    }

    public abstract E a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f4783b < this.f4782a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4783b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f4783b;
        this.f4783b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4783b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f4783b - 1;
        this.f4783b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4783b - 1;
    }
}
