package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.fs0;
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
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
abstract class e<K, V> extends com.yandex.mobile.ads.embedded.guava.collect.g<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Map<K, Collection<V>> f18296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f18297e;

    public class a extends x.d<K, Collection<V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final transient Map<K, Collection<V>> f18298c;

        /* JADX INFO: renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$a$a, reason: collision with other inner class name */
        public class C0189a extends x.a<K, Collection<V>> {
            public C0189a() {
            }

            @Override // com.yandex.mobile.ads.embedded.guava.collect.x.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@CheckForNull Object obj) {
                Set<Map.Entry<K, Collection<V>>> setEntrySet = a.this.f18298c.entrySet();
                Objects.requireNonNull(setEntrySet);
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return a.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@CheckForNull Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                e.a(e.this, entry.getKey());
                return true;
            }
        }

        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f18301a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @CheckForNull
            public Collection<V> f18302b;

            public b() {
                this.f18301a = a.this.f18298c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f18301a.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.f18301a.next();
                this.f18302b = next.getValue();
                return a.this.a(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                fs0.a("no calls to next() since the last call to remove()", this.f18302b != null);
                this.f18301a.remove();
                e.b(e.this, this.f18302b.size());
                this.f18302b.clear();
                this.f18302b = null;
            }
        }

        public a(Map<K, Collection<V>> map) {
            this.f18298c = map;
        }

        final Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            e eVar = e.this;
            Collection<V> value = entry.getValue();
            com.yandex.mobile.ads.embedded.guava.collect.c cVar = (com.yandex.mobile.ads.embedded.guava.collect.c) eVar;
            Objects.requireNonNull(cVar);
            List list = (List) value;
            return new o(key, list instanceof RandomAccess ? new f(cVar, key, list, null) : new j(key, list, null));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            if (this.f18298c == e.this.f18296d) {
                e.this.d();
                return;
            }
            b bVar = new b();
            while (bVar.hasNext()) {
                bVar.next();
                bVar.remove();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@CheckForNull Object obj) {
            Map<K, Collection<V>> map = this.f18298c;
            Objects.requireNonNull(map);
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(@CheckForNull Object obj) {
            return this == obj || this.f18298c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final Object get(@CheckForNull Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.f18298c;
            Objects.requireNonNull(map);
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            com.yandex.mobile.ads.embedded.guava.collect.c cVar = (com.yandex.mobile.ads.embedded.guava.collect.c) e.this;
            Objects.requireNonNull(cVar);
            List list = (List) collection2;
            return list instanceof RandomAccess ? new f(cVar, obj, list, null) : new j(obj, list, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f18298c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return e.this.b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final Object remove(@CheckForNull Object obj) {
            Collection<V> collectionRemove = this.f18298c.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            List<V> list = ((b0) e.this).f18294f.get();
            list.addAll(collectionRemove);
            e.b(e.this, collectionRemove.size());
            collectionRemove.clear();
            return list;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f18298c.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f18298c.toString();
        }
    }

    public abstract class b<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f18304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        public K f18305b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        public Collection<V> f18306c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator<V> f18307d = u.a.INSTANCE;

        public b() {
            this.f18304a = e.this.f18296d.entrySet().iterator();
        }

        public abstract T a(K k10, V v10);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18304a.hasNext() || this.f18307d.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f18307d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f18304a.next();
                this.f18305b = next.getKey();
                Collection<V> value = next.getValue();
                this.f18306c = value;
                this.f18307d = value.iterator();
            }
            return a(this.f18305b, this.f18307d.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f18307d.remove();
            Collection<V> collection = this.f18306c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f18304a.remove();
            }
            e.c(e.this);
        }
    }

    public class c extends x.b<K, Collection<V>> {

        public class a implements Iterator<K> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @CheckForNull
            public Map.Entry<K, Collection<V>> f18310a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator f18311b;

            public a(Iterator it) {
                this.f18311b = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f18311b.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f18311b.next();
                this.f18310a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                fs0.a("no calls to next() since the last call to remove()", this.f18310a != null);
                Collection<V> value = this.f18310a.getValue();
                this.f18311b.remove();
                e.b(e.this, value.size());
                value.clear();
                this.f18310a = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Iterator<K> it = iterator();
            while (true) {
                a aVar = (a) it;
                if (!aVar.hasNext()) {
                    return;
                }
                aVar.next();
                aVar.remove();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.f18395a.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(@CheckForNull Object obj) {
            return this == obj || this.f18395a.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f18395a.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this.f18395a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            int size;
            Collection collection = (Collection) this.f18395a.remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                e.b(e.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    public class d extends e<K, V>.g implements NavigableMap<K, Collection<V>> {
        public d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.g
        public final SortedSet a() {
            return new C0190e(c());
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.g
        /* JADX INFO: renamed from: b */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = c().ceilingEntry(k10);
            if (entryCeilingEntry == null) {
                return null;
            }
            return a(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final K ceilingKey(K k10) {
            return c().ceilingKey(k10);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> c() {
            return (NavigableMap) ((SortedMap) this.f18298c);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new d(c().descendingMap());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = c().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return a(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> entryFloorEntry = c().floorEntry(k10);
            if (entryFloorEntry == null) {
                return null;
            }
            return a(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final K floorKey(K k10) {
            return c().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new d(c().headMap(k10, z10));
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> entryHigherEntry = c().higherEntry(k10);
            if (entryHigherEntry == null) {
                return null;
            }
            return a(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final K higherKey(K k10) {
            return c().higherKey(k10);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.g, com.yandex.mobile.ads.embedded.guava.collect.e.a, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = c().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return a(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> entryLowerEntry = c().lowerEntry(k10);
            if (entryLowerEntry == null) {
                return null;
            }
            return a(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final K lowerKey(K k10) {
            return c().lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            Iterator<Map.Entry<K, Collection<V>>> it = entrySet().iterator();
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            List<V> list = ((b0) e.this).f18294f.get();
            list.addAll(next.getValue());
            it.remove();
            K key = next.getKey();
            Objects.requireNonNull((com.yandex.mobile.ads.embedded.guava.collect.c) e.this);
            return new o(key, Collections.unmodifiableList(list));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            Iterator<Map.Entry<K, V>> it = ((x.d) descendingMap()).entrySet().iterator();
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, V> next = it.next();
            List<V> list = ((b0) e.this).f18294f.get();
            list.addAll((Collection) next.getValue());
            it.remove();
            K key = next.getKey();
            Objects.requireNonNull((com.yandex.mobile.ads.embedded.guava.collect.c) e.this);
            return new o(key, Collections.unmodifiableList(list));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new d(c().subMap(k10, z10, k11, z11));
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new d(c().tailMap(k10, z10));
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    /* JADX INFO: renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$e, reason: collision with other inner class name */
    public class C0190e extends e<K, V>.h implements NavigableSet<K> {
        public C0190e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> b() {
            return (NavigableMap) ((SortedMap) this.f18395a);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K ceiling(K k10) {
            return b().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((c) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new C0190e(b().descendingMap());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K floor(K k10) {
            return b().floorKey(k10);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k10, boolean z10) {
            return new C0190e(b().headMap(k10, z10));
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K higher(K k10) {
            return b().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K lower(K k10) {
            return b().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K pollFirst() {
            c.a aVar = (c.a) iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K k10 = (K) aVar.next();
            aVar.remove();
            return k10;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K pollLast() {
            Iterator<K> itDescendingIterator = descendingIterator();
            if (!itDescendingIterator.hasNext()) {
                return null;
            }
            K next = itDescendingIterator.next();
            itDescendingIterator.remove();
            return next;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new C0190e(b().subMap(k10, z10, k11, z11));
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k10, boolean z10) {
            return new C0190e(b().tailMap(k10, z10));
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }

    public class f extends e<K, V>.j implements RandomAccess {
        public f(e eVar, K k10, @CheckForNull List<V> list, e<K, V>.i iVar) {
            super(k10, list, iVar);
        }
    }

    public class g extends e<K, V>.a implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        public SortedSet<K> f18315e;

        public g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedSet<K> a() {
            return new h(c());
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.a, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f18315e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetA = a();
            this.f18315e = sortedSetA;
            return sortedSetA;
        }

        public SortedMap<K, Collection<V>> c() {
            return (SortedMap) this.f18298c;
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public final Comparator<? super K> comparator() {
            return c().comparator();
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return c().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new g(c().headMap(k10));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return c().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new g(c().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new g(c().tailMap(k10));
        }
    }

    public class h extends e<K, V>.c implements SortedSet<K> {
        public h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        SortedMap<K, Collection<V>> b() {
            return (SortedMap) this.f18395a;
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public final Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return b().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new h(b().headMap(k10));
        }

        @Override // java.util.SortedSet
        public final K last() {
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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f18318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Collection<V> f18319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        public final e<K, V>.i f18320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        public final Collection<V> f18321d;

        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<V> f18323a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Collection<V> f18324b;

            public a() {
                Collection<V> collection = i.this.f18319b;
                this.f18324b = collection;
                this.f18323a = e.a(collection);
            }

            public a(ListIterator listIterator) {
                this.f18324b = i.this.f18319b;
                this.f18323a = listIterator;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                i.this.d();
                if (i.this.f18319b == this.f18324b) {
                    return this.f18323a.hasNext();
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public final V next() {
                i.this.d();
                if (i.this.f18319b == this.f18324b) {
                    return this.f18323a.next();
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f18323a.remove();
                e.c(e.this);
                i.this.e();
            }
        }

        public i(K k10, @CheckForNull Collection<V> collection, e<K, V>.i iVar) {
            this.f18318a = k10;
            this.f18319b = collection;
            this.f18320c = iVar;
            this.f18321d = iVar == null ? null : iVar.c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v10) {
            d();
            boolean zIsEmpty = this.f18319b.isEmpty();
            boolean zAdd = this.f18319b.add(v10);
            if (zAdd) {
                e.b(e.this);
                if (zIsEmpty) {
                    b();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f18319b.addAll(collection);
            if (zAddAll) {
                e.a(e.this, this.f18319b.size() - size);
                if (size == 0) {
                    b();
                }
            }
            return zAddAll;
        }

        final void b() {
            e<K, V>.i iVar = this.f18320c;
            if (iVar != null) {
                iVar.b();
            } else {
                e.this.f18296d.put(this.f18318a, this.f18319b);
            }
        }

        final Collection<V> c() {
            return this.f18319b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f18319b.clear();
            e.b(e.this, size);
            e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            d();
            return this.f18319b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            d();
            return this.f18319b.containsAll(collection);
        }

        final void d() {
            Collection<V> collection;
            e<K, V>.i iVar = this.f18320c;
            if (iVar != null) {
                iVar.d();
                if (this.f18320c.f18319b != this.f18321d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f18319b.isEmpty() || (collection = (Collection) e.this.f18296d.get(this.f18318a)) == null) {
                    return;
                }
                this.f18319b = collection;
            }
        }

        final void e() {
            e<K, V>.i iVar = this.f18320c;
            if (iVar != null) {
                iVar.e();
            } else if (this.f18319b.isEmpty()) {
                e.this.f18296d.remove(this.f18318a);
            }
        }

        @Override // java.util.Collection
        public final boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            d();
            return this.f18319b.equals(obj);
        }

        @Override // java.util.Collection
        public final int hashCode() {
            d();
            return this.f18319b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            d();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(@CheckForNull Object obj) {
            d();
            boolean zRemove = this.f18319b.remove(obj);
            if (zRemove) {
                e.c(e.this);
                e();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f18319b.removeAll(collection);
            if (zRemoveAll) {
                e.a(e.this, this.f18319b.size() - size);
                e();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            int size = size();
            boolean zRetainAll = this.f18319b.retainAll(collection);
            if (zRetainAll) {
                e.a(e.this, this.f18319b.size() - size);
                e();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            d();
            return this.f18319b.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            d();
            return this.f18319b.toString();
        }
    }

    public class j extends e<K, V>.i implements List<V> {

        public class a extends e<K, V>.i.a implements ListIterator<V> {
            public a() {
                super();
            }

            public a(int i10) {
                super(j.this.f().listIterator(i10));
            }

            private ListIterator<V> a() {
                i.this.d();
                if (i.this.f18319b == this.f18324b) {
                    return (ListIterator) this.f18323a;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.ListIterator
            public final void add(V v10) {
                boolean zIsEmpty = j.this.isEmpty();
                a().add(v10);
                e.b(e.this);
                if (zIsEmpty) {
                    j.this.b();
                }
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return a().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return a().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return a().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return a().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v10) {
                a().set(v10);
            }
        }

        public j(K k10, @CheckForNull List<V> list, e<K, V>.i iVar) {
            super(k10, list, iVar);
        }

        @Override // java.util.List
        public final void add(int i10, V v10) {
            d();
            boolean zIsEmpty = this.f18319b.isEmpty();
            ((List) this.f18319b).add(i10, v10);
            e.b(e.this);
            if (zIsEmpty) {
                b();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = ((List) this.f18319b).addAll(i10, collection);
            if (zAddAll) {
                e.a(e.this, this.f18319b.size() - size);
                if (size == 0) {
                    b();
                }
            }
            return zAddAll;
        }

        final List<V> f() {
            return (List) this.f18319b;
        }

        @Override // java.util.List
        public final V get(int i10) {
            d();
            return (V) ((List) this.f18319b).get(i10);
        }

        @Override // java.util.List
        public final int indexOf(@CheckForNull Object obj) {
            d();
            return ((List) this.f18319b).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(@CheckForNull Object obj) {
            d();
            return ((List) this.f18319b).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            d();
            return new a();
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i10) {
            d();
            return new a(i10);
        }

        @Override // java.util.List
        public final V remove(int i10) {
            d();
            V v10 = (V) ((List) this.f18319b).remove(i10);
            e.c(e.this);
            e();
            return v10;
        }

        @Override // java.util.List
        public final V set(int i10, V v10) {
            d();
            return (V) ((List) this.f18319b).set(i10, v10);
        }

        @Override // java.util.List
        public final List<V> subList(int i10, int i11) {
            d();
            e eVar = e.this;
            K k10 = this.f18318a;
            List listSubList = ((List) this.f18319b).subList(i10, i11);
            e<K, V>.i iVar = this.f18320c;
            if (iVar == null) {
                iVar = this;
            }
            Objects.requireNonNull(eVar);
            return listSubList instanceof RandomAccess ? new f(eVar, k10, listSubList, iVar) : new j(k10, listSubList, iVar);
        }
    }

    public e(Map<K, Collection<V>> map) {
        fs0.a(map.isEmpty());
        this.f18296d = map;
    }

    public static Iterator a(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public static /* synthetic */ void a(e eVar, int i10) {
        eVar.f18297e += i10;
    }

    public static void a(e eVar, Object obj) {
        Collection<V> collectionRemove;
        Map<K, Collection<V>> map = eVar.f18296d;
        Objects.requireNonNull(map);
        try {
            collectionRemove = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collectionRemove = null;
        }
        Collection<V> collection = collectionRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            eVar.f18297e -= size;
        }
    }

    public static /* synthetic */ void b(e eVar) {
        eVar.f18297e++;
    }

    public static /* synthetic */ void b(e eVar, int i10) {
        eVar.f18297e -= i10;
    }

    public static /* synthetic */ void c(e eVar) {
        eVar.f18297e--;
    }

    final void a(Map<K, Collection<V>> map) {
        this.f18296d = map;
        this.f18297e = 0;
        for (Collection<V> collection : map.values()) {
            fs0.a(!collection.isEmpty());
            this.f18297e = collection.size() + this.f18297e;
        }
    }

    final Map<K, Collection<V>> c() {
        return this.f18296d;
    }

    public final void d() {
        Iterator<Collection<V>> it = this.f18296d.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f18296d.clear();
        this.f18297e = 0;
    }

    public final Map<K, Collection<V>> e() {
        Map<K, Collection<V>> map = this.f18296d;
        if (map instanceof NavigableMap) {
            return new d((NavigableMap) this.f18296d);
        }
        return map instanceof SortedMap ? new g((SortedMap) this.f18296d) : new a(this.f18296d);
    }

    final Set<K> f() {
        Map<K, Collection<V>> map = this.f18296d;
        if (map instanceof NavigableMap) {
            return new C0190e((NavigableMap) this.f18296d);
        }
        return map instanceof SortedMap ? new h((SortedMap) this.f18296d) : new c(this.f18296d);
    }

    public final int g() {
        return this.f18297e;
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.f18296d.get(k10);
        if (collection != null) {
            if (!collection.add(v10)) {
                return false;
            }
            this.f18297e++;
            return true;
        }
        List<V> list = ((b0) this).f18294f.get();
        if (!list.add(v10)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f18297e++;
        this.f18296d.put(k10, list);
        return true;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.g, com.yandex.mobile.ads.impl.hh0
    public final Collection<V> values() {
        return super.values();
    }
}
