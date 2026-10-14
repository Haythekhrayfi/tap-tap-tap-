package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
abstract class d<K, V> extends com.applovin.exoplayer2.common.a.f<K, V> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Map<K, Collection<V>> f4844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f4845b;

    public class a extends ab.e<K, Collection<V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final transient Map<K, Collection<V>> f4848a;

        /* JADX INFO: renamed from: com.applovin.exoplayer2.common.a.d$a$a, reason: collision with other inner class name */
        public class C0075a extends ab.b<K, Collection<V>> {
            public C0075a() {
            }

            @Override // com.applovin.exoplayer2.common.a.ab.b
            public Map<K, Collection<V>> a() {
                return a.this;
            }

            @Override // com.applovin.exoplayer2.common.a.ab.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return k.a(a.this.f4848a.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return a.this.new b();
            }

            @Override // com.applovin.exoplayer2.common.a.ab.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                d.this.e(((Map.Entry) obj).getKey());
                return true;
            }
        }

        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f4851a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NullableDecl
            public Collection<V> f4852b;

            public b() {
                this.f4851a = a.this.f4848a.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f4851a.next();
                this.f4852b = next.getValue();
                return a.this.a((Map.Entry) next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f4851a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                com.applovin.exoplayer2.common.a.j.a(this.f4852b != null);
                this.f4851a.remove();
                d.b(d.this, this.f4852b.size());
                this.f4852b.clear();
                this.f4852b = null;
            }
        }

        public a(Map<K, Collection<V>> map) {
            this.f4848a = map;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) ab.a((Map) this.f4848a, obj);
            if (collection == null) {
                return null;
            }
            return d.this.a(obj, (Collection) collection);
        }

        Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return ab.a(key, d.this.a((Object) key, (Collection) entry.getValue()));
        }

        @Override // com.applovin.exoplayer2.common.a.ab.e
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new C0075a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f4848a.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionC = d.this.c();
            collectionC.addAll(collectionRemove);
            d.b(d.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionC;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f4848a == d.this.f4844a) {
                d.this.e();
            } else {
                y.d(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return ab.b(this.f4848a, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f4848a.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f4848a.hashCode();
        }

        @Override // com.applovin.exoplayer2.common.a.ab.e, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return d.this.p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f4848a.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f4848a.toString();
        }
    }

    public abstract class b<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f4854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NullableDecl
        public K f4855c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @MonotonicNonNullDecl
        public Collection<V> f4856d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Iterator<V> f4857e = y.c();

        public b() {
            this.f4854b = d.this.f4844a.entrySet().iterator();
        }

        public abstract T a(K k10, V v10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4854b.hasNext() || this.f4857e.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f4857e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f4854b.next();
                this.f4855c = next.getKey();
                Collection<V> value = next.getValue();
                this.f4856d = value;
                this.f4857e = value.iterator();
            }
            return a(this.f4855c, this.f4857e.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f4857e.remove();
            if (this.f4856d.isEmpty()) {
                this.f4854b.remove();
            }
            d.b(d.this);
        }
    }

    public class c extends ab.c<K, Collection<V>> {
        public c(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // com.applovin.exoplayer2.common.a.ab.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            y.d(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return c().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || c().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return c().keySet().hashCode();
        }

        @Override // com.applovin.exoplayer2.common.a.ab.c, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            final Iterator<Map.Entry<K, Collection<V>>> it = c().entrySet().iterator();
            return new Iterator<K>() { // from class: com.applovin.exoplayer2.common.a.d.c.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NullableDecl
                public Map.Entry<K, Collection<V>> f4860a;

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public K next() {
                    Map.Entry<K, Collection<V>> entry = (Map.Entry) it.next();
                    this.f4860a = entry;
                    return entry.getKey();
                }

                @Override // java.util.Iterator
                public void remove() {
                    com.applovin.exoplayer2.common.a.j.a(this.f4860a != null);
                    Collection<V> value = this.f4860a.getValue();
                    it.remove();
                    d.b(d.this, value.size());
                    value.clear();
                    this.f4860a = null;
                }
            };
        }

        @Override // com.applovin.exoplayer2.common.a.ab.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection<V> collectionRemove = c().remove(obj);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                d.b(d.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.common.a.d$d, reason: collision with other inner class name */
    public class C0076d extends d<K, V>.g implements NavigableMap<K, Collection<V>> {
        public C0076d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public Map.Entry<K, Collection<V>> a(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionC = d.this.c();
            collectionC.addAll(next.getValue());
            it.remove();
            return ab.a(next.getKey(), d.this.a(collectionC));
        }

        @Override // com.applovin.exoplayer2.common.a.d.g, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // com.applovin.exoplayer2.common.a.d.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> g() {
            return (NavigableMap) super.g();
        }

        @Override // com.applovin.exoplayer2.common.a.d.g, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // com.applovin.exoplayer2.common.a.d.g, com.applovin.exoplayer2.common.a.d.a, com.applovin.exoplayer2.common.a.ab.e, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = g().ceilingEntry(k10);
            if (entryCeilingEntry == null) {
                return null;
            }
            return a((Map.Entry) entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return g().ceilingKey(k10);
        }

        @Override // com.applovin.exoplayer2.common.a.d.g, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // com.applovin.exoplayer2.common.a.d.g, com.applovin.exoplayer2.common.a.ab.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> h() {
            return new e(g());
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new C0076d(g().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = g().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return a((Map.Entry) entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> entryFloorEntry = g().floorEntry(k10);
            if (entryFloorEntry == null) {
                return null;
            }
            return a((Map.Entry) entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return g().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new C0076d(g().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> entryHigherEntry = g().higherEntry(k10);
            if (entryHigherEntry == null) {
                return null;
            }
            return a((Map.Entry) entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return g().higherKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = g().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return a((Map.Entry) entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> entryLowerEntry = g().lowerEntry(k10);
            if (entryLowerEntry == null) {
                return null;
            }
            return a((Map.Entry) entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return g().lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return f();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return a((Iterator) entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return a((Iterator) descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new C0076d(g().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new C0076d(g().tailMap(k10, z10));
        }
    }

    public class e extends d<K, V>.h implements NavigableSet<K> {
        public e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.applovin.exoplayer2.common.a.d.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> b() {
            return (NavigableMap) super.b();
        }

        @Override // com.applovin.exoplayer2.common.a.d.h, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // com.applovin.exoplayer2.common.a.d.h, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // com.applovin.exoplayer2.common.a.d.h, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return b().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new e(b().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return b().floorKey(k10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new e(b().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return b().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return b().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) y.c(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) y.c(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new e(b().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new e(b().tailMap(k10, z10));
        }
    }

    public class f extends d<K, V>.j implements RandomAccess {
        public f(K k10, @NullableDecl List<V> list, d<K, V>.i iVar) {
            super(k10, list, iVar);
        }
    }

    public class g extends d<K, V>.a implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @MonotonicNonNullDecl
        public SortedSet<K> f4866d;

        public g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return g().comparator();
        }

        @Override // com.applovin.exoplayer2.common.a.ab.e
        /* JADX INFO: renamed from: e */
        public SortedSet<K> h() {
            return new h(g());
        }

        @Override // com.applovin.exoplayer2.common.a.d.a, com.applovin.exoplayer2.common.a.ab.e, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f4866d;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetH = h();
            this.f4866d = sortedSetH;
            return sortedSetH;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return g().firstKey();
        }

        public SortedMap<K, Collection<V>> g() {
            return (SortedMap) ((a) this).f4848a;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new g(g().headMap(k10));
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return g().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new g(g().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new g(g().tailMap(k10));
        }
    }

    public class h extends d<K, V>.c implements SortedSet<K> {
        public h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        SortedMap<K, Collection<V>> b() {
            return (SortedMap) super.c();
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return b().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new h(b().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return b().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new h(b().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new h(b().tailMap(k10));
        }
    }

    public class i extends AbstractCollection<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NullableDecl
        public final K f4869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Collection<V> f4870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NullableDecl
        public final d<K, V>.i f4871d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NullableDecl
        public final Collection<V> f4872e;

        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<V> f4874a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Collection<V> f4875b;

            public a() {
                Collection<V> collection = i.this.f4870c;
                this.f4875b = collection;
                this.f4874a = d.c((Collection) collection);
            }

            public a(Iterator<V> it) {
                this.f4875b = i.this.f4870c;
                this.f4874a = it;
            }

            void a() {
                i.this.a();
                if (i.this.f4870c != this.f4875b) {
                    throw new ConcurrentModificationException();
                }
            }

            public Iterator<V> b() {
                a();
                return this.f4874a;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f4874a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                a();
                return this.f4874a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f4874a.remove();
                d.b(d.this);
                i.this.b();
            }
        }

        public i(K k10, @NullableDecl Collection<V> collection, d<K, V>.i iVar) {
            this.f4869b = k10;
            this.f4870c = collection;
            this.f4871d = iVar;
            this.f4872e = iVar == null ? null : iVar.e();
        }

        void a() {
            Collection<V> collection;
            d<K, V>.i iVar = this.f4871d;
            if (iVar != null) {
                iVar.a();
                if (this.f4871d.e() != this.f4872e) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f4870c.isEmpty() || (collection = (Collection) d.this.f4844a.get(this.f4869b)) == null) {
                    return;
                }
                this.f4870c = collection;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            a();
            boolean zIsEmpty = this.f4870c.isEmpty();
            boolean zAdd = this.f4870c.add(v10);
            if (zAdd) {
                d.c(d.this);
                if (zIsEmpty) {
                    d();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f4870c.addAll(collection);
            if (zAddAll) {
                d.a(d.this, this.f4870c.size() - size);
                if (size == 0) {
                    d();
                }
            }
            return zAddAll;
        }

        void b() {
            d<K, V>.i iVar = this.f4871d;
            if (iVar != null) {
                iVar.b();
            } else if (this.f4870c.isEmpty()) {
                d.this.f4844a.remove(this.f4869b);
            }
        }

        public K c() {
            return this.f4869b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f4870c.clear();
            d.b(d.this, size);
            b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            a();
            return this.f4870c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            a();
            return this.f4870c.containsAll(collection);
        }

        void d() {
            d<K, V>.i iVar = this.f4871d;
            if (iVar != null) {
                iVar.d();
            } else {
                d.this.f4844a.put(this.f4869b, this.f4870c);
            }
        }

        public Collection<V> e() {
            return this.f4870c;
        }

        @Override // java.util.Collection
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            a();
            return this.f4870c.equals(obj);
        }

        public d<K, V>.i f() {
            return this.f4871d;
        }

        @Override // java.util.Collection
        public int hashCode() {
            a();
            return this.f4870c.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            a();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            a();
            boolean zRemove = this.f4870c.remove(obj);
            if (zRemove) {
                d.b(d.this);
                b();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f4870c.removeAll(collection);
            if (zRemoveAll) {
                d.a(d.this, this.f4870c.size() - size);
                b();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean zRetainAll = this.f4870c.retainAll(collection);
            if (zRetainAll) {
                d.a(d.this, this.f4870c.size() - size);
                b();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            a();
            return this.f4870c.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            a();
            return this.f4870c.toString();
        }
    }

    public class j extends d<K, V>.i implements List<V> {

        public class a extends d<K, V>.i.a implements ListIterator<V> {
            public a() {
                super();
            }

            public a(int i10) {
                super(j.this.g().listIterator(i10));
            }

            private ListIterator<V> c() {
                return (ListIterator) b();
            }

            @Override // java.util.ListIterator
            public void add(V v10) {
                boolean zIsEmpty = j.this.isEmpty();
                c().add(v10);
                d.c(d.this);
                if (zIsEmpty) {
                    j.this.d();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v10) {
                c().set(v10);
            }
        }

        public j(K k10, @NullableDecl List<V> list, d<K, V>.i iVar) {
            super(k10, list, iVar);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            a();
            boolean zIsEmpty = e().isEmpty();
            g().add(i10, v10);
            d.c(d.this);
            if (zIsEmpty) {
                d();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = g().addAll(i10, collection);
            if (zAddAll) {
                d.a(d.this, e().size() - size);
                if (size == 0) {
                    d();
                }
            }
            return zAddAll;
        }

        List<V> g() {
            return (List) e();
        }

        @Override // java.util.List
        public V get(int i10) {
            a();
            return g().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            a();
            return g().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            a();
            return g().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            a();
            return new a();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            a();
            return new a(i10);
        }

        @Override // java.util.List
        public V remove(int i10) {
            a();
            V vRemove = g().remove(i10);
            d.b(d.this);
            b();
            return vRemove;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            a();
            return g().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            a();
            return d.this.a(c(), g().subList(i10, i11), f() == null ? this : f());
        }
    }

    public d(Map<K, Collection<V>> map) {
        Preconditions.checkArgument(map.isEmpty());
        this.f4844a = map;
    }

    public static /* synthetic */ int a(d dVar, int i10) {
        int i11 = dVar.f4845b + i10;
        dVar.f4845b = i11;
        return i11;
    }

    public static /* synthetic */ int b(d dVar) {
        int i10 = dVar.f4845b;
        dVar.f4845b = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int b(d dVar, int i10) {
        int i11 = dVar.f4845b - i10;
        dVar.f4845b = i11;
        return i11;
    }

    public static /* synthetic */ int c(d dVar) {
        int i10 = dVar.f4845b;
        dVar.f4845b = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> c(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj) {
        Collection collection = (Collection) ab.c(this.f4844a, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f4845b -= size;
        }
    }

    public Collection<V> a(@NullableDecl K k10, Collection<V> collection) {
        return new i(k10, collection, null);
    }

    public <E> Collection<E> a(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public final List<V> a(@NullableDecl K k10, List<V> list, @NullableDecl d<K, V>.i iVar) {
        return list instanceof RandomAccess ? new f(k10, list, iVar) : new j(k10, list, iVar);
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    public boolean a(@NullableDecl K k10, @NullableDecl V v10) {
        Collection<V> collection = this.f4844a.get(k10);
        if (collection != null) {
            if (!collection.add(v10)) {
                return false;
            }
            this.f4845b++;
            return true;
        }
        Collection<V> collectionC = c(k10);
        if (!collectionC.add(v10)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f4845b++;
        this.f4844a.put(k10, collectionC);
        return true;
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public Collection<V> b(@NullableDecl K k10) {
        Collection<V> collectionC = this.f4844a.get(k10);
        if (collectionC == null) {
            collectionC = c(k10);
        }
        return a((Object) k10, (Collection) collectionC);
    }

    abstract Collection<V> c();

    public Collection<V> c(@NullableDecl K k10) {
        return c();
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public int d() {
        return this.f4845b;
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public void e() {
        Iterator<Collection<V>> it = this.f4844a.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f4844a.clear();
        this.f4845b = 0;
    }

    @Override // com.applovin.exoplayer2.common.a.f
    Set<K> f() {
        return new c(this.f4844a);
    }

    public final Set<K> g() {
        Map<K, Collection<V>> map = this.f4844a;
        if (map instanceof NavigableMap) {
            return new e((NavigableMap) this.f4844a);
        }
        return map instanceof SortedMap ? new h((SortedMap) this.f4844a) : new c(this.f4844a);
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    public Collection<V> h() {
        return super.h();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Collection<V> i() {
        return new com.applovin.exoplayer2.common.a.f.c();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Iterator<V> j() {
        return new d<K, V>.b<V>() { // from class: com.applovin.exoplayer2.common.a.d.1
            @Override // com.applovin.exoplayer2.common.a.d.b
            public V a(K k10, V v10) {
                return v10;
            }
        };
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Collection<Map.Entry<K, V>> k() {
        return super.k();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Collection<Map.Entry<K, V>> l() {
        return this instanceof ap ? new com.applovin.exoplayer2.common.a.f.b() : new com.applovin.exoplayer2.common.a.f.a();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Iterator<Map.Entry<K, V>> m() {
        return new d<K, V>.b<Map.Entry<K, V>>() { // from class: com.applovin.exoplayer2.common.a.d.2
            @Override // com.applovin.exoplayer2.common.a.d.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a(K k10, V v10) {
                return ab.a(k10, v10);
            }
        };
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Map<K, Collection<V>> n() {
        return new a(this.f4844a);
    }

    public final Map<K, Collection<V>> o() {
        Map<K, Collection<V>> map = this.f4844a;
        if (map instanceof NavigableMap) {
            return new C0076d((NavigableMap) this.f4844a);
        }
        return map instanceof SortedMap ? new g((SortedMap) this.f4844a) : new a(this.f4844a);
    }
}
