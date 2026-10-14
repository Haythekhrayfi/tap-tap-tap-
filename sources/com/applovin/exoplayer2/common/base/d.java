package com.applovin.exoplayer2.common.base;

import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class d<T> extends Optional<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f5049a;

    public d(T t10) {
        this.f5049a = t10;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Set<T> asSet() {
        return Collections.singleton(this.f5049a);
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof d) {
            return this.f5049a.equals(((d) obj).f5049a);
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T get() {
        return this.f5049a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public int hashCode() {
        return this.f5049a.hashCode() + 1502476572;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        Preconditions.checkNotNull(optional);
        return this;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T or(Supplier<? extends T> supplier) {
        Preconditions.checkNotNull(supplier);
        return this.f5049a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T or(T t10) {
        Preconditions.checkNotNull(t10, "use Optional.orNull() instead of Optional.or(null)");
        return this.f5049a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T orNull() {
        return this.f5049a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public String toString() {
        return o0.c.a(defpackage.a.a("Optional.of("), this.f5049a, ")");
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public <V> Optional<V> transform(Function<? super T, V> function) {
        return new d(Preconditions.checkNotNull(function.apply(this.f5049a), "the Function passed to Optional.transform() must not return null."));
    }
}
