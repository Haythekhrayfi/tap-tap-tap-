package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class ar<E> extends w<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient E f4833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f4834b;

    public ar(E e10) {
        this.f4833a = (E) Preconditions.checkNotNull(e10);
    }

    public ar(E e10, int i10) {
        this.f4833a = e10;
        this.f4834b = i10;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public int a(Object[] objArr, int i10) {
        objArr[i10] = this.f4833a;
        return i10 + 1;
    }

    @Override // com.applovin.exoplayer2.common.a.w, com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: a */
    public ax<E> iterator() {
        return y.a(this.f4833a);
    }

    @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f4833a.equals(obj);
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public boolean f() {
        return false;
    }

    @Override // com.applovin.exoplayer2.common.a.w
    public boolean h() {
        return this.f4834b != 0;
    }

    @Override // com.applovin.exoplayer2.common.a.w, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i10 = this.f4834b;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f4833a.hashCode();
        this.f4834b = iHashCode;
        return iHashCode;
    }

    @Override // com.applovin.exoplayer2.common.a.w
    public s<E> i() {
        return s.a(this.f4833a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sbA = o2.b.a('[');
        sbA.append(this.f4833a.toString());
        sbA.append(']');
        return sbA.toString();
    }
}
