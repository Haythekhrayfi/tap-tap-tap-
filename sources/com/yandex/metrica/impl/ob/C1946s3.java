package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1946s3 implements InterfaceC1605ea<C1921r3, C1561cg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1996u3 f17276a;

    public C1946s3() {
        this(new C1996u3());
    }

    public C1946s3(C1996u3 c1996u3) {
        this.f17276a = c1996u3;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1921r3 a(C1561cg c1561cg) {
        C1561cg c1561cg2 = c1561cg;
        ArrayList arrayList = new ArrayList(c1561cg2.f15879b.length);
        for (C1561cg.a aVar : c1561cg2.f15879b) {
            arrayList.add(this.f17276a.a(aVar));
        }
        return new C1921r3(arrayList, c1561cg2.f15880c);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1561cg b(C1921r3 c1921r3) {
        C1921r3 c1921r4 = c1921r3;
        C1561cg c1561cg = new C1561cg();
        c1561cg.f15879b = new C1561cg.a[c1921r4.f17203a.size()];
        Iterator<ca.a> it = c1921r4.f17203a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            c1561cg.f15879b[i10] = this.f17276a.b(it.next());
            i10++;
        }
        c1561cg.f15880c = c1921r4.f17204b;
        return c1561cg;
    }
}
