package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.fs0;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class j<T> extends d0<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator<T> f18359a;

    public j(Comparator<T> comparator) {
        this.f18359a = (Comparator) fs0.a(comparator);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.d0, java.util.Comparator
    public final int compare(T t10, T t11) {
        return this.f18359a.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f18359a.equals(((j) obj).f18359a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18359a.hashCode();
    }

    public final String toString() {
        return this.f18359a.toString();
    }
}
