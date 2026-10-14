package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C1848o4.b;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1873p4 extends C1649g4 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C2146zn f17037m;

    public C1873p4(Context context, C1549c4 c1549c4, X3.a aVar, Wi wi, Qi qi, C1736jh.e eVar, InterfaceExecutorC1966sn interfaceExecutorC1966sn, int i10, C2146zn c2146zn, C1845o1 c1845o1) {
        super(context, c1549c4, aVar, wi, qi, eVar, interfaceExecutorC1966sn, i10, c1845o1);
        this.f17037m = c2146zn;
    }

    public V7 a(Q7 q10, N7<String> n10, G9 g10) {
        return new V7(this.f16167c, new L0(), q10, n10, P0.i().s().f(), g10);
    }

    public C2101y3 a(C1848o4 c1848o4) {
        return new C2101y3(this.f16167c, this.f17037m.b(), this.f17037m.k(), C2126z3.a(), new C2051w3(this.f16167c), new C2021v3(c1848o4, P0.i().s().f()), P0.i().c(), new C2076x3());
    }

    public N7<String> b(C1848o4 c1848o4) {
        return new T7(c1848o4);
    }

    public Vg c(C1848o4 c1848o4) {
        return new Vg(new Ng(c1848o4), c1848o4.new b(), c1848o4);
    }

    public Q7 e() {
        return new Q7(new K7(O7.BREAKPAD, null), new P7(new C2080x7()));
    }
}
