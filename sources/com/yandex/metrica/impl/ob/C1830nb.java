package com.yandex.metrica.impl.ob;

import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1830nb implements InterfaceC1605ea<Map<String, String>, C1979tb<Rf.i, Fn>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Vn f16945a;

    public C1830nb() {
        this(new Vn(20480, 100, 1000));
    }

    public C1830nb(Vn vn) {
        this.f16945a = vn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1979tb<Rf.i, Fn> b(Map<String, String> map) {
        Qn<Map<String, String>, Hn> qnA = this.f16945a.a(map);
        Rf.i iVar = new Rf.i();
        iVar.f14900c = ((Hn) qnA.f14829b).f14165b;
        Map<String, String> map2 = qnA.f14828a;
        if (map2 != null) {
            iVar.f14899b = new Rf.i.a[map2.size()];
            int i10 = 0;
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                iVar.f14899b[i10] = new Rf.i.a();
                iVar.f14899b[i10].f14902b = O2.c(entry.getKey());
                iVar.f14899b[i10].f14903c = O2.c(entry.getValue());
                i10++;
            }
        }
        return new C1979tb<>(iVar, qnA.f14829b);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Map<String, String> a(C1979tb<Rf.i, Fn> c1979tb) {
        throw new UnsupportedOperationException();
    }
}
