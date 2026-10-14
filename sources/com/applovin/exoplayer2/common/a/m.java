package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class m<T> extends ai<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator<T> f4912a;

    public m(Comparator<T> comparator) {
        this.f4912a = (Comparator) Preconditions.checkNotNull(comparator);
    }

    @Override // com.applovin.exoplayer2.common.a.ai, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f4912a.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return this.f4912a.equals(((m) obj).f4912a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4912a.hashCode();
    }

    public String toString() {
        return this.f4912a.toString();
    }
}
