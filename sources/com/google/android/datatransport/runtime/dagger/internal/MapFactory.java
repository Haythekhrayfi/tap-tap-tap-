package com.google.android.datatransport.runtime.dagger.internal;

import ic.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MapFactory<K, V> extends AbstractMapFactory<K, V, V> {
    private static final a<Map<Object, Object>> EMPTY = InstanceFactory.create(Collections.emptyMap());

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, V> {
        private Builder(int i10) {
            super(i10);
        }

        public MapFactory<K, V> build() {
            return new MapFactory<>(this.map);
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> put(K k10, a<V> aVar) {
            super.put((Object) k10, (a) aVar);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> putAll(a<Map<K, V>> aVar) {
            super.putAll((a) aVar);
            return this;
        }
    }

    private MapFactory(Map<K, a<V>> map) {
        super(map);
    }

    public static <K, V> Builder<K, V> builder(int i10) {
        return new Builder<>(i10);
    }

    public static <K, V> a<Map<K, V>> emptyMapProvider() {
        return (a<Map<K, V>>) EMPTY;
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory, com.google.android.datatransport.runtime.dagger.internal.Factory, ic.a
    public Map<K, V> get() {
        LinkedHashMap linkedHashMapNewLinkedHashMapWithExpectedSize = DaggerCollections.newLinkedHashMapWithExpectedSize(contributingMap().size());
        for (Map.Entry<K, a<V>> entry : contributingMap().entrySet()) {
            linkedHashMapNewLinkedHashMapWithExpectedSize.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(linkedHashMapNewLinkedHashMapWithExpectedSize);
    }
}
