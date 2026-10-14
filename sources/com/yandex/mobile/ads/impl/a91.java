package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class a91 implements h51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w81 f18819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f18820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, z81> f18821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, x81> f18822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, String> f18823e;

    public a91(w81 w81Var, HashMap map, HashMap map2, HashMap map3) {
        this.f18819a = w81Var;
        this.f18822d = map2;
        this.f18823e = map3;
        this.f18821c = Collections.unmodifiableMap(map);
        this.f18820b = w81Var.b();
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final int a() {
        return this.f18820b.length;
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final int a(long j10) {
        int iA = da1.a(this.f18820b, j10, false);
        if (iA < this.f18820b.length) {
            return iA;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final long a(int i10) {
        return this.f18820b[i10];
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final List<am> b(long j10) {
        return this.f18819a.a(j10, this.f18821c, this.f18822d, this.f18823e);
    }
}
