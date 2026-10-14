package com.yandex.mobile.ads.embedded.guava.collect;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class n<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object[] f18365a = new Object[0];

    public static abstract class a<E> extends b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f18366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f18368c;

        public a() {
            h.a(4, "initialCapacity");
            this.f18366a = new Object[4];
            this.f18367b = 0;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0049  */
        /* JADX WARN: Multi-variable type inference failed */
        public final b a(List list) {
            if (list instanceof Collection) {
                int size = list.size() + this.f18367b;
                Object[] objArr = this.f18366a;
                if (objArr.length < size) {
                    int length = objArr.length;
                    if (size < 0) {
                        throw new AssertionError("cannot store more than MAX_VALUE elements");
                    }
                    int iHighestOneBit = length + (length >> 1) + 1;
                    if (iHighestOneBit < size) {
                        iHighestOneBit = Integer.highestOneBit(size - 1) << 1;
                    }
                    if (iHighestOneBit < 0) {
                        iHighestOneBit = Integer.MAX_VALUE;
                    }
                    this.f18366a = Arrays.copyOf(objArr, iHighestOneBit);
                } else {
                    if (this.f18368c) {
                        this.f18366a = (Object[]) objArr.clone();
                    }
                    if (list instanceof n) {
                        this.f18367b = ((n) list).a(this.f18367b, this.f18366a);
                        return this;
                    }
                }
                this.f18368c = false;
                if (list instanceof n) {
                    this.f18367b = ((n) list).a(this.f18367b, this.f18366a);
                    return this;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((p.a) this).a(it.next());
            }
            return this;
        }

        public final void a(Object obj) {
            Objects.requireNonNull(obj);
            int i10 = this.f18367b + 1;
            Object[] objArr = this.f18366a;
            if (objArr.length >= i10) {
                if (this.f18368c) {
                    this.f18366a = (Object[]) objArr.clone();
                }
                Object[] objArr2 = this.f18366a;
                int i11 = this.f18367b;
                this.f18367b = i11 + 1;
                objArr2[i11] = obj;
            }
            int length = objArr.length;
            if (i10 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = length + (length >> 1) + 1;
            if (iHighestOneBit < i10) {
                iHighestOneBit = Integer.highestOneBit(i10 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                iHighestOneBit = Integer.MAX_VALUE;
            }
            this.f18366a = Arrays.copyOf(objArr, iHighestOneBit);
            this.f18368c = false;
            Object[] objArr3 = this.f18366a;
            int i12 = this.f18367b;
            this.f18367b = i12 + 1;
            objArr3[i12] = obj;
        }
    }

    public static abstract class b<E> {
    }

    public int a(int i10, Object[] objArr) {
        p0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

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

    public p<E> b() {
        if (isEmpty()) {
            int i10 = p.f18374c;
            return (p<E>) f0.f18328f;
        }
        Object[] array = toArray(f18365a);
        int i11 = p.f18374c;
        return p.b(array.length, array);
    }

    @CheckForNull
    public Object[] c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@CheckForNull Object obj);

    int d() {
        throw new UnsupportedOperationException();
    }

    int e() {
        throw new UnsupportedOperationException();
    }

    abstract boolean f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract p0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
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
        return toArray(f18365a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrC = c();
            if (objArrC != null) {
                return (T[]) e0.a(objArrC, e(), d(), tArr);
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(0, tArr);
        return tArr;
    }

    Object writeReplace() {
        return new p.c(toArray(f18365a));
    }
}
