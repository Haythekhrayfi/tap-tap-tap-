package com.google.android.datatransport.runtime.dagger.internal;

import ch.qos.logback.core.joran.action.Action;
import ic.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class AbstractMapFactory<K, V, V2> implements Factory<Map<K, V2>> {
    private final Map<K, a<V>> contributingMap;

    public static abstract class Builder<K, V, V2> {
        public final LinkedHashMap<K, a<V>> map;

        public Builder(int i10) {
            this.map = DaggerCollections.newLinkedHashMapWithExpectedSize(i10);
        }

        public Builder<K, V, V2> put(K k10, a<V> aVar) {
            this.map.put((K) Preconditions.checkNotNull(k10, Action.KEY_ATTRIBUTE), (a<V>) Preconditions.checkNotNull(aVar, "provider"));
            return this;
        }

        public Builder<K, V, V2> putAll(a<Map<K, V2>> aVar) {
            if (aVar instanceof DelegateFactory) {
                return putAll(((DelegateFactory) aVar).getDelegate());
            }
            this.map.putAll(((AbstractMapFactory) aVar).contributingMap);
            return this;
        }
    }

    public AbstractMapFactory(Map<K, a<V>> map) {
        this.contributingMap = Collections.unmodifiableMap(map);
    }

    public final Map<K, a<V>> contributingMap() {
        return this.contributingMap;
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, ic.a
    public abstract /* synthetic */ T get();
}
