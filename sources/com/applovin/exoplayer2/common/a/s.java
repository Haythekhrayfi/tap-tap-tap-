package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class s<E> extends q<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ay<Object> f4924a = new b(ak.f4799a, 0);

    public static final class a<E> extends q.a<E> {
        public a() {
            this(4);
        }

        public a(int i10) {
            super(i10);
        }

        public s<E> a() {
            this.f4921c = true;
            return s.b(this.f4919a, this.f4920b);
        }

        @Override // com.applovin.exoplayer2.common.a.q.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e10) {
            super.a(e10);
            return this;
        }
    }

    public static class b<E> extends com.applovin.exoplayer2.common.a.a<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s<E> f4925a;

        public b(s<E> sVar, int i10) {
            super(sVar.size(), i10);
            this.f4925a = sVar;
        }

        @Override // com.applovin.exoplayer2.common.a.a
        public E a(int i10) {
            return this.f4925a.get(i10);
        }
    }

    public class c extends s<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final transient int f4926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final transient int f4927b;

        public c(int i10, int i11) {
            this.f4926a = i10;
            this.f4927b = i11;
        }

        @Override // com.applovin.exoplayer2.common.a.s, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s<E> subList(int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11, this.f4927b);
            s sVar = s.this;
            int i12 = this.f4926a;
            return sVar.subList(i10 + i12, i11 + i12);
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public Object[] b() {
            return s.this.b();
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public int c() {
            return s.this.c() + this.f4926a;
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public int d() {
            return s.this.c() + this.f4926a + this.f4927b;
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public boolean f() {
            return true;
        }

        @Override // java.util.List
        public E get(int i10) {
            Preconditions.checkElementIndex(i10, this.f4927b);
            return s.this.get(i10 + this.f4926a);
        }

        @Override // com.applovin.exoplayer2.common.a.s, com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.applovin.exoplayer2.common.a.s, java.util.List
        public /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.applovin.exoplayer2.common.a.s, java.util.List
        public /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f4927b;
        }
    }

    public static <E> s<E> a(E e10) {
        return c(e10);
    }

    public static <E> s<E> a(E e10, E e11) {
        return c(e10, e11);
    }

    public static <E> s<E> a(E e10, E e11, E e12, E e13, E e14) {
        return c(e10, e11, e12, e13, e14);
    }

    public static <E> s<E> a(E e10, E e11, E e12, E e13, E e14, E e15) {
        return c(e10, e11, e12, e13, e14, e15);
    }

    public static <E> s<E> a(Collection<? extends E> collection) {
        if (!(collection instanceof q)) {
            return c(collection.toArray());
        }
        s<E> sVarE = ((q) collection).e();
        return sVarE.f() ? b(sVarE.toArray()) : sVarE;
    }

    public static <E> s<E> a(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] objArrB = x.b(iterable);
        ah.a(objArrB);
        Arrays.sort(objArrB, comparator);
        return b(objArrB);
    }

    public static <E> s<E> a(E[] eArr) {
        return eArr.length == 0 ? g() : c((Object[]) eArr.clone());
    }

    public static <E> s<E> b(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    public static <E> s<E> b(Object[] objArr, int i10) {
        return i10 == 0 ? g() : new ak(objArr, i10);
    }

    private static <E> s<E> c(Object... objArr) {
        return b(ah.a(objArr));
    }

    public static <E> s<E> g() {
        return (s<E>) ak.f4799a;
    }

    public static <E> a<E> i() {
        return new a<>();
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public int a(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: a */
    public ax<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ay<E> listIterator(int i10) {
        Preconditions.checkPositionIndex(i10, size());
        return isEmpty() ? (ay<E>) f4924a : new b(this, i10);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a */
    public s<E> subList(int i10, int i11) {
        Preconditions.checkPositionIndexes(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? g() : b(i10, i11);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public s<E> b(int i10, int i11) {
        return new c(i10, i11 - i10);
    }

    @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public final s<E> e() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return aa.a(this, obj);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public ay<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return aa.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return aa.c(this, obj);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }
}
