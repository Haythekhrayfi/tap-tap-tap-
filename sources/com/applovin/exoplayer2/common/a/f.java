package com.applovin.exoplayer2.common.a;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
abstract class f<K, V> implements ac<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @MonotonicNonNullDecl
    private transient Collection<Map.Entry<K, V>> f4879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @MonotonicNonNullDecl
    private transient Set<K> f4880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @MonotonicNonNullDecl
    private transient Collection<V> f4881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @MonotonicNonNullDecl
    private transient Map<K, Collection<V>> f4882d;

    public class a extends ae.b<K, V> {
        public a() {
        }

        @Override // com.applovin.exoplayer2.common.a.ae.b
        public ac<K, V> a() {
            return f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return f.this.m();
        }
    }

    public class b extends f<K, V>.a implements Set<Map.Entry<K, V>> {
        public b() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return aq.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return aq.a(this);
        }
    }

    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            f.this.e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return f.this.d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return f.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return f.this.d();
        }
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public boolean a(@NullableDecl K k10, @NullableDecl V v10) {
        return b(k10).add(v10);
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.f4882d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapN = n();
        this.f4882d = mapN;
        return mapN;
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public boolean b(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public boolean c(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public boolean d(@NullableDecl Object obj) {
        Iterator<Collection<V>> it = b().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@NullableDecl Object obj) {
        return ae.a(this, obj);
    }

    abstract Set<K> f();

    @Override // com.applovin.exoplayer2.common.a.ac
    public Collection<V> h() {
        Collection<V> collection = this.f4881c;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionI = i();
        this.f4881c = collectionI;
        return collectionI;
    }

    public int hashCode() {
        return b().hashCode();
    }

    public abstract Collection<V> i();

    public Iterator<V> j() {
        return ab.b(k().iterator());
    }

    public Collection<Map.Entry<K, V>> k() {
        Collection<Map.Entry<K, V>> collection = this.f4879a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionL = l();
        this.f4879a = collectionL;
        return collectionL;
    }

    public abstract Collection<Map.Entry<K, V>> l();

    public abstract Iterator<Map.Entry<K, V>> m();

    public abstract Map<K, Collection<V>> n();

    public Set<K> p() {
        Set<K> set = this.f4880b;
        if (set != null) {
            return set;
        }
        Set<K> setF = f();
        this.f4880b = setF;
        return setF;
    }

    public String toString() {
        return b().toString();
    }
}
