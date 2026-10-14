package com.applovin.exoplayer2.common.a;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class am<E> extends w<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final am<Object> f4816a = new am<>(new Object[0], 0, null, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient Object[] f4817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f4818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f4819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f4820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f4821f;

    public am(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f4817b = objArr;
        this.f4818c = objArr2;
        this.f4819d = i11;
        this.f4820e = i10;
        this.f4821f = i12;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public int a(Object[] objArr, int i10) {
        System.arraycopy(this.f4817b, 0, objArr, i10, this.f4821f);
        return i10 + this.f4821f;
    }

    @Override // com.applovin.exoplayer2.common.a.w, com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: a */
    public ax<E> iterator() {
        return e().iterator();
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public Object[] b() {
        return this.f4817b;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public int c() {
        return 0;
    }

    @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f4818c;
        if (obj == null || objArr == null) {
            return false;
        }
        int iA = p.a(obj);
        while (true) {
            int i10 = iA & this.f4819d;
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

    @Override // com.applovin.exoplayer2.common.a.q
    public int d() {
        return this.f4821f;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public boolean f() {
        return false;
    }

    @Override // com.applovin.exoplayer2.common.a.w
    public boolean h() {
        return true;
    }

    @Override // com.applovin.exoplayer2.common.a.w, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f4820e;
    }

    @Override // com.applovin.exoplayer2.common.a.w
    public s<E> i() {
        return s.b(this.f4817b, this.f4821f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f4821f;
    }
}
