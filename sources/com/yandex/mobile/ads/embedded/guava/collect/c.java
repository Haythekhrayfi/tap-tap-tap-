package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.q80;
import java.util.Collection;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
abstract class c<K, V> extends e<K, V> implements q80<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.g, com.yandex.mobile.ads.impl.hh0
    public final Map<K, Collection<V>> a() {
        return super.a();
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.g
    public final boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.e, com.yandex.mobile.ads.impl.hh0
    public final boolean put(K k10, V v10) {
        return super.put(k10, v10);
    }
}
