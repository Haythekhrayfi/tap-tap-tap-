package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;

/* JADX INFO: loaded from: classes.dex */
class K4 implements F4, I4<C1848o4> {
    @Override // com.yandex.metrica.impl.ob.F4
    public E4 a(Context context, J4 j10, C4 c10, X3 x10) {
        return new L4(context, j10.b(new C1898q4(c10.b(), c10.a()), x10, new C1947s4(this)));
    }

    @Override // com.yandex.metrica.impl.ob.I4
    public InterfaceC1798m4 a(Context context, C1549c4 c1549c4, X3.a aVar, Si si) {
        return new C1848o4(context, si.c(), c1549c4, aVar, P0.i().o(), P0.i().v(), new Xi(si));
    }

    @Override // com.yandex.metrica.impl.ob.I4
    public InterfaceC1748k4 b(Context context, C1549c4 c1549c4, X3.a aVar, Si si) {
        return new T4(context, c1549c4, aVar, si.c(), new Xi(si), CounterConfiguration.b.MAIN);
    }
}
