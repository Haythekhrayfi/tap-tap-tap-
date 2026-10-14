package com.applovin.exoplayer2.common.a;

import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class u<K, V> implements Serializable, Map<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map.Entry<?, ?>[] f4929a = new Map.Entry[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient w<Map.Entry<K, V>> f4930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @RetainedWith
    private transient w<K> f4931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @RetainedWith
    private transient q<V> f4932d;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @MonotonicNonNullDecl
        public Comparator<? super V> f4933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object[] f4934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f4936d;

        public a() {
            this(4);
        }

        public a(int i10) {
            this.f4934b = new Object[i10 * 2];
            this.f4935c = 0;
            this.f4936d = false;
        }

        private void a(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f4934b;
            if (i11 > objArr.length) {
                this.f4934b = Arrays.copyOf(objArr, q.b.a(objArr.length, i11));
                this.f4936d = false;
            }
        }

        public a<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                a(((Collection) iterable).size() + this.f4935c);
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public a<K, V> a(K k10, V v10) {
            a(this.f4935c + 1);
            j.a(k10, v10);
            Object[] objArr = this.f4934b;
            int i10 = this.f4935c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f4935c = i10 + 1;
            return this;
        }

        public a<K, V> a(Map.Entry<? extends K, ? extends V> entry) {
            return a(entry.getKey(), entry.getValue());
        }

        public u<K, V> a() {
            b();
            this.f4936d = true;
            return al.a(this.f4935c, this.f4934b);
        }

        public void b() {
            int i10;
            if (this.f4933a != null) {
                if (this.f4936d) {
                    this.f4934b = Arrays.copyOf(this.f4934b, this.f4935c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f4935c];
                int i11 = 0;
                while (true) {
                    i10 = this.f4935c;
                    if (i11 >= i10) {
                        break;
                    }
                    Object[] objArr = this.f4934b;
                    int i12 = i11 * 2;
                    entryArr[i11] = new AbstractMap.SimpleImmutableEntry(objArr[i12], objArr[i12 + 1]);
                    i11++;
                }
                Arrays.sort(entryArr, 0, i10, ai.a(this.f4933a).a(ab.b()));
                for (int i13 = 0; i13 < this.f4935c; i13++) {
                    int i14 = i13 * 2;
                    this.f4934b[i14] = entryArr[i13].getKey();
                    this.f4934b[i14 + 1] = entryArr[i13].getValue();
                }
            }
        }
    }

    public static <K, V> u<K, V> a() {
        return (u<K, V>) al.f4802b;
    }

    public static <K, V> u<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.a(iterable);
        return aVar.a();
    }

    public static <K, V> u<K, V> a(Map<? extends K, ? extends V> map) {
        if ((map instanceof u) && !(map instanceof SortedMap)) {
            u<K, V> uVar = (u) map;
            if (!uVar.i()) {
                return uVar;
            }
        }
        return a(map.entrySet());
    }

    public static <K, V> a<K, V> b() {
        return new a<>();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public w<Map.Entry<K, V>> entrySet() {
        w<Map.Entry<K, V>> wVar = this.f4930b;
        if (wVar != null) {
            return wVar;
        }
        w<Map.Entry<K, V>> wVarD = d();
        this.f4930b = wVarD;
        return wVarD;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    public abstract w<Map.Entry<K, V>> d();

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public w<K> keySet() {
        w<K> wVar = this.f4931c;
        if (wVar != null) {
            return wVar;
        }
        w<K> wVarF = f();
        this.f4931c = wVarF;
        return wVarF;
    }

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        return ab.d(this, obj);
    }

    public abstract w<K> f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public q<V> values() {
        q<V> qVar = this.f4932d;
        if (qVar != null) {
            return qVar;
        }
        q<V> qVarH = h();
        this.f4932d = qVarH;
        return qVarH;
    }

    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    public abstract q<V> h();

    @Override // java.util.Map
    public int hashCode() {
        return aq.a(entrySet());
    }

    public abstract boolean i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return ab.a(this);
    }
}
