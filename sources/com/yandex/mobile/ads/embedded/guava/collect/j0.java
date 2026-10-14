package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.fs0;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class j0<T> extends d0<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0<? super T> f18360a;

    public j0(d0<? super T> d0Var) {
        this.f18360a = (d0) fs0.a(d0Var);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.d0
    public final <S extends T> d0<S> b() {
        return this.f18360a;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.d0, java.util.Comparator
    public final int compare(T t10, T t11) {
        return this.f18360a.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j0) {
            return this.f18360a.equals(((j0) obj).f18360a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f18360a.hashCode();
    }

    public final String toString() {
        return this.f18360a + ".reverse()";
    }
}
