package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class Zm<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<K, Collection<V>> f15711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f15712b;

    public Zm() {
        this(false);
    }

    public Zm(boolean z10) {
        this.f15711a = new HashMap<>();
        this.f15712b = z10;
    }

    public Collection<V> a(K k10) {
        return this.f15711a.get(k10);
    }

    public Collection<V> a(K k10, V v10) {
        Collection<V> collection = this.f15711a.get(k10);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(v10);
        return this.f15711a.put(k10, arrayList);
    }

    public Set<? extends Map.Entry<K, ? extends Collection<V>>> a() {
        return this.f15711a.entrySet();
    }

    public Collection<V> b(K k10) {
        return this.f15711a.remove(k10);
    }

    public Collection<V> b(K k10, V v10) {
        Collection<V> collection = this.f15711a.get(k10);
        if (collection == null || !collection.remove(v10)) {
            return null;
        }
        if (collection.isEmpty() && this.f15712b) {
            this.f15711a.remove(k10);
        }
        return new ArrayList(collection);
    }

    public boolean b() {
        return this.f15711a.isEmpty();
    }

    public int c() {
        Iterator<Collection<V>> it = this.f15711a.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public String toString() {
        return this.f15711a.toString();
    }
}
