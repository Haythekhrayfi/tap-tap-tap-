package com.yandex.mobile.ads.embedded.guava.collect;

import com.google.j2objc.annotations.Weak;
import com.yandex.mobile.ads.embedded.guava.collect.e.a.C0189a;
import com.yandex.mobile.ads.impl.fs0;
import com.yandex.mobile.ads.impl.sn0;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    public static abstract class a<K, V> extends m0.c<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            e.a.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(@CheckForNull Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return e.a.this.isEmpty();
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.m0.c, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                return m0.a((Set<?>) this, collection.iterator());
            }
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.m0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            int i10;
            try {
                Objects.requireNonNull(collection);
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                int size = collection.size();
                if (size < 3) {
                    h.a(size, "expectedSize");
                    i10 = size + 1;
                } else {
                    i10 = size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE;
                }
                HashSet hashSet = new HashSet(i10);
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return e.a.this.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return e.a.this.f18298c.size();
        }
    }

    public static class b<K, V> extends m0.c<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Weak
        public final Map<K, V> f18395a;

        public b(Map<K, V> map) {
            this.f18395a = (Map) fs0.a(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            return this.f18395a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return this.f18395a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f18395a.size();
        }
    }

    public static class c<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Weak
        public final Map<K, V> f18396a;

        public c(Map<K, V> map) {
            this.f18396a = (Map) fs0.a(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f18396a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            return this.f18396a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.f18396a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new w(this.f18396a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(@CheckForNull Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : this.f18396a.entrySet()) {
                    if (sn0.a(obj, entry.getValue())) {
                        this.f18396a.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f18396a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f18396a.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f18396a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f18396a.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f18396a.size();
        }
    }

    public static abstract class d<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @CheckForNull
        private transient Set<Map.Entry<K, V>> f18397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        private transient Collection<V> f18398b;

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f18397a;
            if (set != null) {
                return set;
            }
            e.a.C0189a c0189a = ((e.a) this).new C0189a();
            this.f18397a = c0189a;
            return c0189a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection<V> values() {
            Collection<V> collection = this.f18398b;
            if (collection != null) {
                return collection;
            }
            c cVar = new c(this);
            this.f18398b = cVar;
            return cVar;
        }
    }

    public static boolean a(Map<?, ?> map, @CheckForNull Object obj) {
        Iterator it = (Iterator) fs0.a(map.entrySet().iterator());
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }
}
