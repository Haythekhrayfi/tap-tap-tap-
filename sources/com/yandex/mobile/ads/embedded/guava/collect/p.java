package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.fs0;
import com.yandex.mobile.ads.impl.u60;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class p<E> extends n<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q0<Object> f18373b = new b(0, f0.f18328f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f18374c = 0;

    public static final class a<E> extends n.a<E> {
        public a() {
            this(0);
        }

        public a(int i10) {
        }

        public final p<E> a() {
            this.f18368c = true;
            return p.b(this.f18367b, this.f18366a);
        }

        public final a b(List list) {
            a(list);
            return this;
        }

        public final void b(Object obj) {
            a(obj);
        }
    }

    public static class b<E> extends com.yandex.mobile.ads.embedded.guava.collect.a<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p<E> f18375c;

        public b(int i10, p pVar) {
            super(pVar.size(), i10);
            this.f18375c = pVar;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.a
        public final E a(int i10) {
            return this.f18375c.get(i10);
        }
    }

    public static class c implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f18376a;

        public c(Object[] objArr) {
            this.f18376a = objArr;
        }

        public Object readResolve() {
            return p.b(this.f18376a);
        }
    }

    public class d extends p<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient int f18377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient int f18378e;

        public d(int i10, int i11) {
            this.f18377d = i10;
            this.f18378e = i11;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.p, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p<E> subList(int i10, int i11) {
            fs0.a(i10, i11, this.f18378e);
            p pVar = p.this;
            int i12 = this.f18377d;
            return pVar.subList(i10 + i12, i11 + i12);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        @CheckForNull
        public final Object[] c() {
            return p.this.c();
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        public final int d() {
            return p.this.e() + this.f18377d + this.f18378e;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        public final int e() {
            return p.this.e() + this.f18377d;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        public final boolean f() {
            return true;
        }

        @Override // java.util.List
        public final E get(int i10) {
            fs0.a(i10, this.f18378e);
            return p.this.get(i10 + this.f18377d);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.p, com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.p, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.p, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return listIterator(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f18378e;
        }
    }

    public static p a(Long l10, Long l11, Long l12, Long l13, Long l14) {
        return a(l10, l11, l12, l13, l14);
    }

    public static <E> p<E> a(E e10) {
        return a(e10);
    }

    public static <E> p<E> a(E e10, E e11) {
        return a(e10, e11);
    }

    public static <E> p<E> a(Collection<? extends E> collection) {
        if (!(collection instanceof n)) {
            return a(collection.toArray());
        }
        p<E> pVarB = ((n) collection).b();
        if (!pVarB.f()) {
            return pVarB;
        }
        Object[] array = pVarB.toArray();
        return b(array.length, array);
    }

    private static <E> p<E> a(Object... objArr) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(u60.a("at index ", i10));
            }
        }
        return b(objArr.length, objArr);
    }

    public static p b(int i10, Object[] objArr) {
        return i10 == 0 ? f0.f18328f : new f0(i10, objArr);
    }

    public static <E> p<E> b(E[] eArr) {
        return eArr.length == 0 ? (p<E>) f0.f18328f : a((Object[]) eArr.clone());
    }

    public static <E> a<E> h() {
        return new a<>();
    }

    public static <E> p<E> i() {
        return (p<E>) f0.f18328f;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public int a(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a */
    public p<E> subList(int i10, int i11) {
        fs0.a(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? (p<E>) f0.f18328f : new d(i10, i12);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final q0<E> listIterator(int i10) {
        fs0.b(i10, size());
        return isEmpty() ? (q0<E>) f18373b : new b(i10, this);
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

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    @Deprecated
    public final p<E> b() {
        return this;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        return v.a(this, obj);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    /* JADX INFO: renamed from: g */
    public final p0<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj != null) {
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (obj.equals(get(i10))) {
                    return i10;
                }
            }
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj != null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (obj.equals(get(size))) {
                    return size;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
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

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public Object writeReplace() {
        return new c(toArray());
    }
}
