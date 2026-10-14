package com.applovin.exoplayer2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ap extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f4288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f4289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ba[] f4290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object[] f4291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashMap<Object, Integer> f4292i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(Collection<? extends ag> collection, com.applovin.exoplayer2.h.z zVar) {
        super(false, zVar);
        int iB = 0;
        int size = collection.size();
        this.f4288e = new int[size];
        this.f4289f = new int[size];
        this.f4290g = new ba[size];
        this.f4291h = new Object[size];
        this.f4292i = new HashMap<>();
        int iC = 0;
        int i10 = 0;
        for (ag agVar : collection) {
            this.f4290g[i10] = agVar.b();
            this.f4289f[i10] = iB;
            this.f4288e[i10] = iC;
            iB += this.f4290g[i10].b();
            iC += this.f4290g[i10].c();
            this.f4291h[i10] = agVar.a();
            this.f4292i.put(this.f4291h[i10], Integer.valueOf(i10));
            i10++;
        }
        this.f4286c = iB;
        this.f4287d = iC;
    }

    public List<ba> a() {
        return Arrays.asList(this.f4290g);
    }

    @Override // com.applovin.exoplayer2.ba
    public int b() {
        return this.f4286c;
    }

    @Override // com.applovin.exoplayer2.a
    public int b(int i10) {
        return com.applovin.exoplayer2.l.ai.a(this.f4288e, i10 + 1, false, false);
    }

    @Override // com.applovin.exoplayer2.ba
    public int c() {
        return this.f4287d;
    }

    @Override // com.applovin.exoplayer2.a
    public int c(int i10) {
        return com.applovin.exoplayer2.l.ai.a(this.f4289f, i10 + 1, false, false);
    }

    @Override // com.applovin.exoplayer2.a
    public int d(Object obj) {
        Integer num = this.f4292i.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.applovin.exoplayer2.a
    public ba d(int i10) {
        return this.f4290g[i10];
    }

    @Override // com.applovin.exoplayer2.a
    public int e(int i10) {
        return this.f4288e[i10];
    }

    @Override // com.applovin.exoplayer2.a
    public int f(int i10) {
        return this.f4289f[i10];
    }

    @Override // com.applovin.exoplayer2.a
    public Object g(int i10) {
        return this.f4291h[i10];
    }
}
