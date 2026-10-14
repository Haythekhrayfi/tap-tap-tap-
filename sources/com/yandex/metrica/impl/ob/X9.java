package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class X9 implements InterfaceC1605ea<C1509ae, C1536bg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1505aa f15478a;

    public X9() {
        this(new C1505aa());
    }

    public X9(C1505aa c1505aa) {
        this.f15478a = c1505aa;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1509ae a(C1536bg c1536bg) {
        C1536bg c1536bg2 = c1536bg;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            C1536bg.b[] bVarArr = c1536bg2.f15835b;
            if (i11 >= bVarArr.length) {
                break;
            }
            C1536bg.b bVar = bVarArr[i11];
            arrayList.add(new C1709ie(bVar.f15841b, bVar.f15842c));
            i11++;
        }
        C1536bg.a aVar = c1536bg2.f15836c;
        H hA = aVar != null ? this.f15478a.a(aVar) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c1536bg2.f15837d;
            if (i10 >= strArr.length) {
                return new C1509ae(arrayList, hA, arrayList2);
            }
            arrayList2.add(strArr[i10]);
            i10++;
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1536bg b(C1509ae c1509ae) {
        C1509ae c1509ae2 = c1509ae;
        C1536bg c1536bg = new C1536bg();
        c1536bg.f15835b = new C1536bg.b[c1509ae2.f15746a.size()];
        int i10 = 0;
        int i11 = 0;
        for (C1709ie c1709ie : c1509ae2.f15746a) {
            C1536bg.b[] bVarArr = c1536bg.f15835b;
            C1536bg.b bVar = new C1536bg.b();
            bVar.f15841b = c1709ie.f16345a;
            bVar.f15842c = c1709ie.f16346b;
            bVarArr[i11] = bVar;
            i11++;
        }
        H h10 = c1509ae2.f15747b;
        if (h10 != null) {
            c1536bg.f15836c = this.f15478a.b(h10);
        }
        c1536bg.f15837d = new String[c1509ae2.f15748c.size()];
        Iterator<String> it = c1509ae2.f15748c.iterator();
        while (it.hasNext()) {
            c1536bg.f15837d[i10] = it.next();
            i10++;
        }
        return c1536bg;
    }
}
