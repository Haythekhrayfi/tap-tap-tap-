package com.applovin.exoplayer2.common.a;

import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class v<K, V> extends g<K, V> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient u<K, ? extends q<V>> f4937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f4938c;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<K, Collection<V>> f4946a = aj.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @MonotonicNonNullDecl
        public Comparator<? super K> f4947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @MonotonicNonNullDecl
        public Comparator<? super V> f4948c;

        public a<K, V> b(K k10, Iterable<? extends V> iterable) {
            if (k10 == null) {
                StringBuilder sbA = defpackage.a.a("null key in entry: null=");
                sbA.append(x.a(iterable));
                throw new NullPointerException(sbA.toString());
            }
            Collection<V> collection = this.f4946a.get(k10);
            Iterator<? extends V> it = iterable.iterator();
            if (collection != null) {
                while (it.hasNext()) {
                    V next = it.next();
                    j.a(k10, next);
                    collection.add(next);
                }
                return this;
            }
            if (!it.hasNext()) {
                return this;
            }
            Collection<V> collectionC = c();
            while (it.hasNext()) {
                V next2 = it.next();
                j.a(k10, next2);
                collectionC.add(next2);
            }
            this.f4946a.put(k10, collectionC);
            return this;
        }

        public a<K, V> b(K k10, V... vArr) {
            return b(k10, Arrays.asList(vArr));
        }

        public v<K, V> b() {
            Collection collectionEntrySet = this.f4946a.entrySet();
            Comparator<? super K> comparator = this.f4947b;
            if (comparator != null) {
                collectionEntrySet = ai.a(comparator).c().a(collectionEntrySet);
            }
            return t.a(collectionEntrySet, (Comparator) this.f4948c);
        }

        public Collection<V> c() {
            return new ArrayList();
        }
    }

    public static class b<K, V> extends q<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Weak
        public final v<K, V> f4949a;

        public b(v<K, V> vVar) {
            this.f4949a = vVar;
        }

        @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a */
        public ax<Map.Entry<K, V>> iterator() {
            return this.f4949a.m();
        }

        @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f4949a.b(entry.getKey(), entry.getValue());
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public boolean f() {
            return this.f4949a.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f4949a.d();
        }
    }

    public static final class c<K, V> extends q<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Weak
        private final transient v<K, V> f4950a;

        public c(v<K, V> vVar) {
            this.f4950a = vVar;
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public int a(Object[] objArr, int i10) {
            ax<? extends q<V>> it = this.f4950a.f4937b.values().iterator();
            while (it.hasNext()) {
                i10 = it.next().a(objArr, i10);
            }
            return i10;
        }

        @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a */
        public ax<V> iterator() {
            return this.f4950a.j();
        }

        @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return this.f4950a.d(obj);
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public boolean f() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f4950a.d();
        }
    }

    public v(u<K, ? extends q<V>> uVar, int i10) {
        this.f4937b = uVar;
        this.f4938c = i10;
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    @Deprecated
    public boolean a(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    public /* bridge */ /* synthetic */ boolean b(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.b(obj, obj2);
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    @Deprecated
    public boolean c(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public int d() {
        return this.f4938c;
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public boolean d(@NullableDecl Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract q<V> b(K k10);

    @Override // com.applovin.exoplayer2.common.a.ac
    @Deprecated
    public void e() {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.applovin.exoplayer2.common.a.f
    Set<K> f() {
        throw new AssertionError("unreachable");
    }

    boolean g() {
        return this.f4937b.i();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Map<K, Collection<V>> n() {
        throw new AssertionError("should never be called");
    }

    @Override // com.applovin.exoplayer2.common.a.f
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public w<K> p() {
        return this.f4937b.keySet();
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public u<K, Collection<V>> b() {
        return this.f4937b;
    }

    @Override // com.applovin.exoplayer2.common.a.f
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public q<Map.Entry<K, V>> k() {
        return (q) super.k();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public q<Map.Entry<K, V>> l() {
        return new b(this);
    }

    @Override // com.applovin.exoplayer2.common.a.f
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public ax<Map.Entry<K, V>> m() {
        return new ax<Map.Entry<K, V>>() { // from class: com.applovin.exoplayer2.common.a.v.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<? extends Map.Entry<K, ? extends q<V>>> f4939a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public K f4940b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Iterator<V> f4941c = y.a();

            {
                this.f4939a = v.this.f4937b.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                if (!this.f4941c.hasNext()) {
                    Map.Entry<K, ? extends q<V>> next = this.f4939a.next();
                    this.f4940b = next.getKey();
                    this.f4941c = next.getValue().iterator();
                }
                return ab.a(this.f4940b, this.f4941c.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f4941c.hasNext() || this.f4939a.hasNext();
            }
        };
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public q<V> h() {
        return (q) super.h();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public q<V> i() {
        return new c(this);
    }

    @Override // com.applovin.exoplayer2.common.a.f
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public ax<V> j() {
        return new ax<V>() { // from class: com.applovin.exoplayer2.common.a.v.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Iterator<? extends q<V>> f4943a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Iterator<V> f4944b = y.a();

            {
                this.f4943a = v.this.f4937b.values().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f4944b.hasNext() || this.f4943a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                if (!this.f4944b.hasNext()) {
                    this.f4944b = this.f4943a.next().iterator();
                }
                return this.f4944b.next();
            }
        };
    }
}
