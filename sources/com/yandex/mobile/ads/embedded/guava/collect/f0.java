package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.fs0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class f0<E> extends p<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p<Object> f18328f = new f0(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f18329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f18330e;

    public f0(int i10, Object[] objArr) {
        this.f18329d = objArr;
        this.f18330e = i10;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.p, com.yandex.mobile.ads.embedded.guava.collect.n
    public final int a(int i10, Object[] objArr) {
        System.arraycopy(this.f18329d, 0, objArr, i10, this.f18330e);
        return i10 + this.f18330e;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final Object[] c() {
        return this.f18329d;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final int d() {
        return this.f18330e;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final int e() {
        return 0;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final E get(int i10) {
        fs0.a(i10, this.f18330e);
        E e10 = (E) this.f18329d[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18330e;
    }
}
