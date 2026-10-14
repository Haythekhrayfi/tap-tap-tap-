package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class ao<T> extends ai<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ai<? super T> f4823a;

    public ao(ai<? super T> aiVar) {
        this.f4823a = (ai) Preconditions.checkNotNull(aiVar);
    }

    @Override // com.applovin.exoplayer2.common.a.ai
    public <S extends T> ai<S> a() {
        return this.f4823a;
    }

    @Override // com.applovin.exoplayer2.common.a.ai, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f4823a.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ao) {
            return this.f4823a.equals(((ao) obj).f4823a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f4823a.hashCode();
    }

    public String toString() {
        return this.f4823a + ".reverse()";
    }
}
