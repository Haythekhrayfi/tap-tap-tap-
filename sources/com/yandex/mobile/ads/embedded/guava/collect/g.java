package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.hh0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
abstract class g<K, V> implements hh0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @CheckForNull
    private transient Set<K> f18331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private transient Collection<V> f18332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private transient Map<K, Collection<V>> f18333c;

    public class a extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f18334a;

        public a(e eVar) {
            this.f18334a = eVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            ((e) this.f18334a).d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            Iterator<Collection<V>> it = this.f18334a.a().values().iterator();
            while (it.hasNext()) {
                if (it.next().contains(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            e eVar = (e) this.f18334a;
            Objects.requireNonNull(eVar);
            return new d(eVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ((e) this.f18334a).g();
        }
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.f18333c;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapE = ((b0) this).e();
        this.f18333c = mapE;
        return mapE;
    }

    public final Set<K> b() {
        Set<K> set = this.f18331a;
        if (set != null) {
            return set;
        }
        Set<K> setF = ((b0) this).f();
        this.f18331a = setF;
        return setF;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hh0) {
            return ((c) this).a().equals(((hh0) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    public Collection<V> values() {
        Collection<V> collection = this.f18332b;
        if (collection != null) {
            return collection;
        }
        a aVar = new a((e) this);
        this.f18332b = aVar;
        return aVar;
    }
}
