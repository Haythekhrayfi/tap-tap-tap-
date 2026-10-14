package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class g51 implements h51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final am[] f20951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f20952b;

    public g51(am[] amVarArr, long[] jArr) {
        this.f20951a = amVarArr;
        this.f20952b = jArr;
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final int a() {
        return this.f20952b.length;
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final int a(long j10) {
        int iA = da1.a(this.f20952b, j10, false);
        if (iA < this.f20952b.length) {
            return iA;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final long a(int i10) {
        pa.a(i10 >= 0);
        pa.a(i10 < this.f20952b.length);
        return this.f20952b[i10];
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final List<am> b(long j10) {
        am amVar;
        int iB = da1.b(this.f20952b, j10, false);
        return (iB == -1 || (amVar = this.f20951a[iB]) == am.f18955r) ? Collections.emptyList() : Collections.singletonList(amVar);
    }
}
