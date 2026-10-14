package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class ab {

    public enum a implements Function<Map.Entry<?, ?>, Object> {
        KEY { // from class: com.applovin.exoplayer2.common.a.ab.a.1
            @Override // com.applovin.exoplayer2.common.base.Function
            @NullableDecl
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.applovin.exoplayer2.common.a.ab.a.2
            @Override // com.applovin.exoplayer2.common.base.Function
            @NullableDecl
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    public static abstract class b<K, V> extends aq.a<Map.Entry<K, V>> {
        public abstract Map<K, V> a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objA = ab.a((Map<?, Object>) a(), key);
            if (Objects.equal(objA, entry.getValue())) {
                return objA != null || a().containsKey(key);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                return a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.a.aq.a, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return aq.a((Set<?>) this, collection.iterator());
            }
        }

        @Override // com.applovin.exoplayer2.common.a.aq.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetA = aq.a(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        hashSetA.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(hashSetA);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    public static class c<K, V> extends aq.a<K> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Weak
        public final Map<K, V> f4787d;

        public c(Map<K, V> map) {
            this.f4787d = (Map) Preconditions.checkNotNull(map);
        }

        Map<K, V> c() {
            return this.f4787d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return c().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return ab.a(c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            c().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c().size();
        }
    }

    public static class d<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Weak
        public final Map<K, V> f4788a;

        public d(Map<K, V> map) {
            this.f4788a = (Map) Preconditions.checkNotNull(map);
        }

        public final Map<K, V> a() {
            return this.f4788a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return ab.b(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetA = aq.a();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetA.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(hashSetA);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetA = aq.a();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetA.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(hashSetA);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    public static abstract class e<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @MonotonicNonNullDecl
        private transient Set<Map.Entry<K, V>> f4789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @MonotonicNonNullDecl
        private transient Set<K> f4790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @MonotonicNonNullDecl
        private transient Collection<V> f4791c;

        abstract Set<Map.Entry<K, V>> a();

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f4789a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setA = a();
            this.f4789a = setA;
            return setA;
        }

        public Set<K> h() {
            return new c(this);
        }

        public Collection<V> i() {
            return new d(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.f4790b;
            if (set != null) {
                return set;
            }
            Set<K> setH = h();
            this.f4790b = setH;
            return setH;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f4791c;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionI = i();
            this.f4791c = collectionI;
            return collectionI;
        }
    }

    public static int a(int i10) {
        if (i10 < 3) {
            j.a(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K> Function<Map.Entry<K, ?>, K> a() {
        return a.KEY;
    }

    public static <V> V a(Map<?, V> map, @NullableDecl Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String a(Map<?, ?> map) {
        StringBuilder sbA = k.a(map.size());
        sbA.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                sbA.append(", ");
            }
            z10 = false;
            sbA.append(entry.getKey());
            sbA.append('=');
            sbA.append(entry.getValue());
        }
        sbA.append('}');
        return sbA.toString();
    }

    public static <K, V> Iterator<K> a(Iterator<Map.Entry<K, V>> it) {
        return new aw<Map.Entry<K, V>, K>(it) { // from class: com.applovin.exoplayer2.common.a.ab.1
            @Override // com.applovin.exoplayer2.common.a.aw
            public K a(Map.Entry<K, V> entry) {
                return entry.getKey();
            }
        };
    }

    public static <K, V> Map.Entry<K, V> a(@NullableDecl K k10, @NullableDecl V v10) {
        return new r(k10, v10);
    }

    public static <V> Function<Map.Entry<?, V>, V> b() {
        return a.VALUE;
    }

    public static <K, V> Iterator<V> b(Iterator<Map.Entry<K, V>> it) {
        return new aw<Map.Entry<K, V>, V>(it) { // from class: com.applovin.exoplayer2.common.a.ab.2
            @Override // com.applovin.exoplayer2.common.a.aw
            public V a(Map.Entry<K, V> entry) {
                return entry.getValue();
            }
        };
    }

    public static boolean b(Map<?, ?> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <V> V c(Map<?, V> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <K, V> IdentityHashMap<K, V> c() {
        return new IdentityHashMap<>();
    }

    public static boolean d(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
