package com.yandex.mobile.ads.embedded.guava.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
final class y extends z.c<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f18399a;

    public y(Comparator comparator) {
        this.f18399a = comparator;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.z.c
    public final <K, V> Map<K, Collection<V>> b() {
        return new TreeMap(this.f18399a);
    }
}
