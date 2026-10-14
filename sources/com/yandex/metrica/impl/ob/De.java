package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class De implements InterfaceC1605ea<Be, C1661gg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Me f13815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2137ze f13816b;

    public De() {
        this(new Me(), new C2137ze());
    }

    public De(Me me2, C2137ze c2137ze) {
        this.f13815a = me2;
        this.f13816b = c2137ze;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Be a(C1661gg c1661gg) {
        C1661gg c1661gg2 = c1661gg;
        ArrayList arrayList = new ArrayList(c1661gg2.f16214c.length);
        for (C1661gg.b bVar : c1661gg2.f16214c) {
            arrayList.add(this.f13816b.a(bVar));
        }
        C1661gg.a aVar = c1661gg2.f16213b;
        return new Be(aVar == null ? this.f13815a.a(new C1661gg.a()) : this.f13815a.a(aVar), arrayList);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1661gg b(Be be2) {
        Be be3 = be2;
        C1661gg c1661gg = new C1661gg();
        c1661gg.f16213b = this.f13815a.b(be3.f13721a);
        c1661gg.f16214c = new C1661gg.b[be3.f13722b.size()];
        Iterator<Be.a> it = be3.f13722b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            c1661gg.f16214c[i10] = this.f13816b.b(it.next());
            i10++;
        }
        return c1661gg;
    }
}
