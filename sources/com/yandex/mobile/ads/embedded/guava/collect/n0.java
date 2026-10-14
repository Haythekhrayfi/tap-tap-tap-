package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.fs0;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class n0<E> extends r<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient E f18369c;

    public n0(E e10) {
        this.f18369c = (E) fs0.a(e10);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final int a(int i10, Object[] objArr) {
        objArr[i10] = this.f18369c;
        return i10 + 1;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.r, com.yandex.mobile.ads.embedded.guava.collect.n
    public final p<E> b() {
        return p.a(this.f18369c);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.f18369c.equals(obj);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final boolean f() {
        return false;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.r, com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g */
    public final p0<E> iterator() {
        return new t(this.f18369c);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.r, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18369c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbA = o2.b.a('[');
        sbA.append(this.f18369c.toString());
        sbA.append(']');
        return sbA.toString();
    }
}
