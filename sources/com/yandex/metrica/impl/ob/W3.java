package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class W3 extends C1624f4 {
    public W3(Context context, Qi qi, C1549c4 c1549c4, X3.a aVar, C1736jh.e eVar, Wi wi) {
        this(context, c1549c4, new V3(), new R2(), new C1649g4(context, c1549c4, aVar, wi, qi, eVar, P0.i().s().e(), U2.b(context, c1549c4.b()), P0.i().j()));
    }

    public W3(Context context, C1549c4 c1549c4, V3 v10, R2 r10, C1649g4 c1649g4) {
        super(context, c1549c4, v10, r10, c1649g4);
    }

    @Override // com.yandex.metrica.impl.ob.C1624f4
    public CounterConfiguration.b s() {
        return CounterConfiguration.b.APPMETRICA;
    }
}
