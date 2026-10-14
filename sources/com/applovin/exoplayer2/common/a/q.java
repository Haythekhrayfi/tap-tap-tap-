package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class q<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object[] f4918a = new Object[0];

    public static abstract class a<E> extends b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f4919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4921c;

        public a(int i10) {
            j.a(i10, "initialCapacity");
            this.f4919a = new Object[i10];
            this.f4920b = 0;
        }

        private void a(int i10) {
            Object[] objArr = this.f4919a;
            if (objArr.length < i10) {
                this.f4919a = Arrays.copyOf(objArr, b.a(objArr.length, i10));
            } else if (!this.f4921c) {
                return;
            } else {
                this.f4919a = (Object[]) objArr.clone();
            }
            this.f4921c = false;
        }

        public a<E> a(E e10) {
            Preconditions.checkNotNull(e10);
            a(this.f4920b + 1);
            Object[] objArr = this.f4919a;
            int i10 = this.f4920b;
            this.f4920b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }
    }

    public static abstract class b<E> {
        public static int a(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }
    }

    public int a(Object[] objArr, int i10) {
        ax<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: a */
    public abstract ax<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public Object[] b() {
        return null;
    }

    int c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@NullableDecl Object obj);

    int d() {
        throw new UnsupportedOperationException();
    }

    public s<E> e() {
        return isEmpty() ? s.g() : s.b(toArray());
    }

    abstract boolean f();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f4918a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Preconditions.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrB = b();
            if (objArrB != null) {
                return (T[]) aj.a(objArrB, c(), d(), tArr);
            }
            tArr = (T[]) ah.a((Object[]) tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}
