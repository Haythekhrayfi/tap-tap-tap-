package com.yandex.mobile.ads.embedded.guava.collect;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0<T> implements Comparator<T> {
    public static <C extends Comparable> d0<C> a() {
        return c0.f18295a;
    }

    public static <T> d0<T> a(Comparator<T> comparator) {
        return comparator instanceof d0 ? (d0) comparator : new j(comparator);
    }

    public <S extends T> d0<S> b() {
        return new j0(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t10, T t11);
}
