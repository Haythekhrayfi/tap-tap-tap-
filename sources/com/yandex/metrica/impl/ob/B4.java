package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;

/* JADX INFO: loaded from: classes.dex */
class B4 extends O4 {
    @Override // com.yandex.metrica.impl.ob.O4, com.yandex.metrica.impl.ob.I4
    public InterfaceC1798m4 a(Context context, C1549c4 c1549c4, X3.a aVar, Si si) {
        return new W3(context, si.c(), c1549c4, aVar, new C2102y4(P0.i().v()), new C1514aj());
    }

    @Override // com.yandex.metrica.impl.ob.O4, com.yandex.metrica.impl.ob.I4
    public InterfaceC1748k4 b(Context context, C1549c4 c1549c4, X3.a aVar, Si si) {
        return new T4(context, c1549c4, aVar, si.c(), new C1514aj(), CounterConfiguration.b.APPMETRICA);
    }

    @Override // com.yandex.metrica.impl.ob.O4
    /* JADX INFO: renamed from: c */
    public C1624f4 a(Context context, C1549c4 c1549c4, X3.a aVar, Si si) {
        return new W3(context, si.c(), c1549c4, aVar, new C2102y4(P0.i().v()), new C1514aj());
    }

    @Override // com.yandex.metrica.impl.ob.O4
    /* JADX INFO: renamed from: d */
    public T4 b(Context context, C1549c4 c1549c4, X3.a aVar, Si si) {
        return new T4(context, c1549c4, aVar, si.c(), new C1514aj(), CounterConfiguration.b.APPMETRICA);
    }
}
