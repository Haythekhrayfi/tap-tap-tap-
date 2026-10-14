package com.yandex.mobile.ads.embedded.guava.collect;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class c0 extends d0<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f18295a = new c0();
    private static final long serialVersionUID = 0;

    private c0() {
    }

    private Object readResolve() {
        return f18295a;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.d0
    public final <S extends Comparable<?>> d0<S> b() {
        return i0.f18358a;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.d0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
