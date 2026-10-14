package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1769l0 extends J {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final V6 f16782p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C1577d7 f16783q;

    public C1769l0(Context context, U3 u10, com.yandex.metrica.j jVar, C1821n2 c1821n2) {
        this(context, u10, jVar, c1821n2, new K0(context));
    }

    private C1769l0(Context context, U3 u10, com.yandex.metrica.j jVar, C1821n2 c1821n2, K0 k10) {
        this(context, c1821n2, new C1746k2(u10, new CounterConfiguration(jVar, CounterConfiguration.b.CRASH), jVar.userProfileID), k10, new V6(context), new C1577d7(), Y.g().j(), new C1960sh(), new C2065wh(null, null), new F7(), new A7(), new C2000u7(), new C1950s7(), new C1502a7(k10));
    }

    public C1769l0(Context context, C1821n2 c1821n2, C1746k2 c1746k2, K0 k10, V6 v10, C1577d7 c1577d7, Hm hm2, ea.a aVar, C2065wh c2065wh, F7 f10, A7 a10, C2000u7 c2000u7, C1950s7 c1950s7, C1502a7 c1502a7) {
        super(context, c1821n2, c1746k2, k10, hm2, aVar, c2065wh, f10, a10, c2000u7, c1950s7, c1502a7);
        this.f16782p = v10;
        this.f16783q = c1577d7;
    }

    @Override // com.yandex.metrica.impl.ob.J, com.yandex.metrica.impl.ob.InterfaceC1521b1
    public void a(C1876p7 c1876p7) {
        this.f16782p.a(this.f16783q.a(c1876p7, this.f14245b));
        b(c1876p7);
    }
}
