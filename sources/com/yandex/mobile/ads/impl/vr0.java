package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class vr0 extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f26068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f26069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f26070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f26071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v61[] f26072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object[] f26073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap<Object, Integer> f26074k;

    public vr0(List list, i11 i11Var) {
        super(i11Var);
        int size = list.size();
        this.f26070g = new int[size];
        this.f26071h = new int[size];
        this.f26072i = new v61[size];
        this.f26073j = new Object[size];
        this.f26074k = new HashMap<>();
        Iterator it = list.iterator();
        int iB = 0;
        int iA = 0;
        int i10 = 0;
        while (it.hasNext()) {
            pc0 pc0Var = (pc0) it.next();
            this.f26072i[i10] = pc0Var.b();
            this.f26071h[i10] = iB;
            this.f26070g[i10] = iA;
            iB += this.f26072i[i10].b();
            iA += this.f26072i[i10].a();
            this.f26073j[i10] = pc0Var.a();
            this.f26074k.put(this.f26073j[i10], Integer.valueOf(i10));
            i10++;
        }
        this.f26068e = iB;
        this.f26069f = iA;
    }

    @Override // com.yandex.mobile.ads.impl.v61
    public final int a() {
        return this.f26069f;
    }

    @Override // com.yandex.mobile.ads.impl.v61
    public final int b() {
        return this.f26068e;
    }

    @Override // com.yandex.mobile.ads.impl.e
    public final int b(int i10) {
        return da1.a(this.f26070g, i10 + 1, false, false);
    }

    @Override // com.yandex.mobile.ads.impl.e
    public final int b(Object obj) {
        Integer num = this.f26074k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.yandex.mobile.ads.impl.e
    public final int c(int i10) {
        return da1.a(this.f26071h, i10 + 1, false, false);
    }

    @Override // com.yandex.mobile.ads.impl.e
    public final Object d(int i10) {
        return this.f26073j[i10];
    }

    public final List<v61> d() {
        return Arrays.asList(this.f26072i);
    }

    @Override // com.yandex.mobile.ads.impl.e
    public final int e(int i10) {
        return this.f26070g[i10];
    }

    @Override // com.yandex.mobile.ads.impl.e
    public final int f(int i10) {
        return this.f26071h[i10];
    }

    @Override // com.yandex.mobile.ads.impl.e
    public final v61 g(int i10) {
        return this.f26072i[i10];
    }
}
