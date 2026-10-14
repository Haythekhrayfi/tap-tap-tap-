package com.applovin.exoplayer2.common.a;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
abstract class c<K, V> extends d<K, V> implements z<K, V> {
    public c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.applovin.exoplayer2.common.a.d
    public Collection<V> a(K k10, Collection<V> collection) {
        return a(k10, (List) collection, null);
    }

    @Override // com.applovin.exoplayer2.common.a.d
    public <E> Collection<E> a(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.applovin.exoplayer2.common.a.d
    /* JADX INFO: renamed from: a */
    public abstract List<V> c();

    @Override // com.applovin.exoplayer2.common.a.d, com.applovin.exoplayer2.common.a.ac
    /* JADX INFO: renamed from: a */
    public List<V> b(@NullableDecl K k10) {
        return (List) super.b(k10);
    }

    @Override // com.applovin.exoplayer2.common.a.d, com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    public boolean a(@NullableDecl K k10, @NullableDecl V v10) {
        return super.a(k10, v10);
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    public Map<K, Collection<V>> b() {
        return super.b();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }
}
