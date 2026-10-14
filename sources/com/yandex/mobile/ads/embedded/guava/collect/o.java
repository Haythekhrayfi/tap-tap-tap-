package com.yandex.mobile.ads.embedded.guava.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class o<K, V> extends f<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f18370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f18371b;

    public o(K k10, V v10) {
        this.f18370a = k10;
        this.f18371b = v10;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.f, java.util.Map.Entry
    public final K getKey() {
        return this.f18370a;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.f, java.util.Map.Entry
    public final V getValue() {
        return this.f18371b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
