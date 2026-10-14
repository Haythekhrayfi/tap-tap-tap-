package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;

/* JADX INFO: loaded from: classes.dex */
class ak<E> extends s<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s<Object> f4799a = new ak(new Object[0], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient Object[] f4800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f4801c;

    public ak(Object[] objArr, int i10) {
        this.f4800b = objArr;
        this.f4801c = i10;
    }

    @Override // com.applovin.exoplayer2.common.a.s, com.applovin.exoplayer2.common.a.q
    public int a(Object[] objArr, int i10) {
        System.arraycopy(this.f4800b, 0, objArr, i10, this.f4801c);
        return i10 + this.f4801c;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public Object[] b() {
        return this.f4800b;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public int c() {
        return 0;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public int d() {
        return this.f4801c;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public boolean f() {
        return false;
    }

    @Override // java.util.List
    public E get(int i10) {
        Preconditions.checkElementIndex(i10, this.f4801c);
        return (E) this.f4800b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4801c;
    }
}
