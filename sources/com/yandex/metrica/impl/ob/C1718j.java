package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1718j implements InterfaceC1942s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f16366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1992u f16367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, ca.a> f16368c = new HashMap();

    public C1718j(InterfaceC1992u interfaceC1992u) {
        C2051w3 c2051w3 = (C2051w3) interfaceC1992u;
        for (ca.a aVar : c2051w3.a()) {
            this.f16368c.put(aVar.f3652b, aVar);
        }
        this.f16366a = c2051w3.b();
        this.f16367b = c2051w3;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1942s
    public ca.a a(String str) {
        return this.f16368c.get(str);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1942s
    public void a(Map<String, ca.a> map) {
        for (ca.a aVar : map.values()) {
            this.f16368c.put(aVar.f3652b, aVar);
        }
        ((C2051w3) this.f16367b).a(new ArrayList(this.f16368c.values()), this.f16366a);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1942s
    public boolean a() {
        return this.f16366a;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1942s
    public void b() {
        if (this.f16366a) {
            return;
        }
        this.f16366a = true;
        ((C2051w3) this.f16367b).a(new ArrayList(this.f16368c.values()), this.f16366a);
    }
}
