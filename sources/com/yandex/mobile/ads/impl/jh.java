package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class jh implements h51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<am> f22042a;

    public jh(List<am> list) {
        this.f22042a = list;
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final int a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final long a(int i10) {
        pa.a(i10 == 0);
        return 0L;
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final List<am> b(long j10) {
        return j10 >= 0 ? this.f22042a : Collections.emptyList();
    }
}
