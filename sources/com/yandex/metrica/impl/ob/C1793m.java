package com.yandex.metrica.impl.ob;

import com.applovin.sdk.AppLovinEventParameters;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1793m implements InterfaceC1942s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f16866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, ca.a> f16867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1992u f16868c;

    public C1793m(InterfaceC1992u interfaceC1992u) {
        fd.j0.i(interfaceC1992u, "storage");
        this.f16868c = interfaceC1992u;
        C2051w3 c2051w3 = (C2051w3) interfaceC1992u;
        this.f16866a = c2051w3.b();
        List<ca.a> listA = c2051w3.a();
        fd.j0.h(listA, "storage.billingInfo");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listA) {
            linkedHashMap.put(((ca.a) obj).f3652b, obj);
        }
        this.f16867b = linkedHashMap;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1942s
    public ca.a a(String str) {
        fd.j0.i(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        return this.f16867b.get(str);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1942s
    public void a(Map<String, ? extends ca.a> map) {
        fd.j0.i(map, "history");
        for (ca.a aVar : map.values()) {
            Map<String, ca.a> map2 = this.f16867b;
            String str = aVar.f3652b;
            fd.j0.h(str, "billingInfo.sku");
            map2.put(str, aVar);
        }
        ((C2051w3) this.f16868c).a(kc.t.H(this.f16867b.values()), this.f16866a);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1942s
    public boolean a() {
        return this.f16866a;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1942s
    public void b() {
        if (this.f16866a) {
            return;
        }
        this.f16866a = true;
        ((C2051w3) this.f16868c).a(kc.t.H(this.f16867b.values()), this.f16866a);
    }
}
