package com.yandex.metrica.impl.ob;

import com.yandex.metrica.IReporter;
import java.util.HashMap;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1973t5 extends AbstractC1948s5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IReporter f17422b;

    public C1973t5(C1624f4 c1624f4, IReporter iReporter) {
        super(c1624f4);
        this.f17422b = iReporter;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1824n5
    public boolean a(C1744k0 c1744k0) {
        Z6 z6A = Z6.a(c1744k0.n());
        HashMap map = new HashMap();
        map.put("type", z6A.f15634a);
        map.put("delivery_method", z6A.f15635b);
        this.f17422b.reportEvent("crash_saved", map);
        return false;
    }
}
