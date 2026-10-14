package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1994u1 extends J {
    public C1994u1(Context context, U3 u10, com.yandex.metrica.f fVar, C1821n2 c1821n2) {
        this(context, u10, fVar, c1821n2, new K0(context));
    }

    private C1994u1(Context context, U3 u10, com.yandex.metrica.f fVar, C1821n2 c1821n2, K0 k10) {
        this(context, c1821n2, fVar, new C1746k2(u10, new CounterConfiguration(fVar), fVar.userProfileID), k10, Y.g().j(), new C2090xh(), new C2065wh(null, null), new F7(), new A7(), new C2000u7(), new C1950s7(), new C1502a7(k10));
    }

    public C1994u1(Context context, C1821n2 c1821n2, com.yandex.metrica.f fVar, C1746k2 c1746k2, K0 k10, Hm hm2, C2090xh c2090xh, C2065wh c2065wh, F7 f10, A7 a10, C2000u7 c2000u7, C1950s7 c1950s7, C1502a7 c1502a7) {
        super(context, c1821n2, c1746k2, k10, hm2, c2090xh.a(c1821n2.b(), fVar.apiKey, false), c2065wh, f10, a10, c2000u7, c1950s7, c1502a7);
    }
}
