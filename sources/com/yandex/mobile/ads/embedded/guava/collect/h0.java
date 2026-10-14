package com.yandex.mobile.ads.embedded.guava.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class h0<E> extends r<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f18349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h0<Object> f18350i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f18351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f18352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f18353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f18354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f18355g;

    static {
        Object[] objArr = new Object[0];
        f18349h = objArr;
        f18350i = new h0<>(objArr, 0, objArr, 0, 0);
    }

    public h0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f18351c = objArr;
        this.f18352d = i10;
        this.f18353e = objArr2;
        this.f18354f = i11;
        this.f18355g = i12;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final int a(int i10, Object[] objArr) {
        System.arraycopy(this.f18351c, 0, objArr, i10, this.f18355g);
        return i10 + this.f18355g;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final Object[] c() {
        return this.f18351c;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.f18353e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iA = m.a(obj.hashCode());
        while (true) {
            int i10 = iA & this.f18354f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA = i10 + 1;
        }
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final int d() {
        return this.f18355g;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final int e() {
        return 0;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public final boolean f() {
        return false;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.r, com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g */
    public final p0<E> iterator() {
        return b().listIterator(0);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.r
    public final p<E> h() {
        return p.b(this.f18355g, this.f18351c);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.r, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18352d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18355g;
    }
}
