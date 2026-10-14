package com.applovin.exoplayer2.common.a;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
class r<K, V> extends e<K, V> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NullableDecl
    public final K f4922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NullableDecl
    public final V f4923b;

    public r(@NullableDecl K k10, @NullableDecl V v10) {
        this.f4922a = k10;
        this.f4923b = v10;
    }

    @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.f4922a;
    }

    @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        return this.f4923b;
    }

    @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
