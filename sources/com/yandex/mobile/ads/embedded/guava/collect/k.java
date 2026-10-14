package com.yandex.mobile.ads.embedded.guava.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class k<K, V> extends l implements Map<K, V> {
    public final boolean a(@CheckForNull Object obj) {
        return x.a(this, obj);
    }

    public abstract Map<K, V> b();

    public final boolean b(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((m0.a) entrySet()).equals(((Map) obj).entrySet());
    }

    public final int c() {
        return m0.a(entrySet());
    }

    @Override // java.util.Map
    public final void clear() {
        b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return b().containsKey(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return b().entrySet();
    }

    @Override // java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        return b().get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return b().keySet();
    }

    @Override // java.util.Map
    @CheckForNull
    public final V put(K k10, V v10) {
        return b().put(k10, v10);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b().putAll(map);
    }

    @Override // java.util.Map
    @CheckForNull
    public final V remove(@CheckForNull Object obj) {
        return b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return b().size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return b().values();
    }
}
