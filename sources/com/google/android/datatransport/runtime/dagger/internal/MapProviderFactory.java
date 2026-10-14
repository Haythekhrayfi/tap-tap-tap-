package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import ic.a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MapProviderFactory<K, V> extends AbstractMapFactory<K, V, a<V>> implements Lazy<Map<K, a<V>>> {

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, a<V>> {
        private Builder(int i10) {
            super(i10);
        }

        public MapProviderFactory<K, V> build() {
            return new MapProviderFactory<>(this.map);
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> put(K k10, a<V> aVar) {
            super.put((Object) k10, (a) aVar);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> putAll(a<Map<K, a<V>>> aVar) {
            super.putAll((a) aVar);
            return this;
        }
    }

    private MapProviderFactory(Map<K, a<V>> map) {
        super(map);
    }

    public static <K, V> Builder<K, V> builder(int i10) {
        return new Builder<>(i10);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory, com.google.android.datatransport.runtime.dagger.internal.Factory, ic.a
    public Map<K, a<V>> get() {
        return contributingMap();
    }
}
