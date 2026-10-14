package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.sn0;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
abstract class f<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return sn0.a(getKey(), entry.getKey()) && sn0.a(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
