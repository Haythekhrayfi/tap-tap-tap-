package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class Fm<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<K, V> f14018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V f14019b;

    public Fm(V v10) {
        this(new HashMap(), v10);
    }

    public Fm(Map<K, V> map, V v10) {
        this.f14018a = map;
        this.f14019b = v10;
    }

    public V a(K k10) {
        V v10 = this.f14018a.get(k10);
        return v10 == null ? this.f14019b : v10;
    }

    public Set<K> a() {
        return this.f14018a.keySet();
    }

    public void a(K k10, V v10) {
        this.f14018a.put(k10, v10);
    }
}
