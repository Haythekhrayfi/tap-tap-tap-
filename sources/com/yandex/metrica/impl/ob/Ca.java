package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Ca implements InterfaceC1605ea<Eh, C1735jg> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Eh a(C1735jg c1735jg) {
        C1735jg c1735jg2 = c1735jg;
        ArrayList arrayList = new ArrayList(c1735jg2.f16416b.length);
        int i10 = 0;
        while (true) {
            C1735jg.a[] aVarArr = c1735jg2.f16416b;
            if (i10 >= aVarArr.length) {
                return new Eh(arrayList, c1735jg2.f16417c, c1735jg2.f16418d, c1735jg2.f16419e, c1735jg2.f16420f);
            }
            C1735jg.a aVar = aVarArr[i10];
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = aVar.f16423c;
            if (strArr != null && strArr.length > 0) {
                arrayList2 = new ArrayList(aVar.f16423c.length);
                int i11 = 0;
                while (true) {
                    String[] strArr2 = aVar.f16423c;
                    if (i11 < strArr2.length) {
                        arrayList2.add(strArr2[i11]);
                        i11++;
                    }
                }
            }
            arrayList.add(new Hh(O2.b(aVar.f16422b), arrayList2));
            i10++;
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1735jg b(Eh eh) {
        Eh eh2 = eh;
        C1735jg c1735jg = new C1735jg();
        c1735jg.f16416b = new C1735jg.a[eh2.f13908a.size()];
        for (int i10 = 0; i10 < eh2.f13908a.size(); i10++) {
            C1735jg.a[] aVarArr = c1735jg.f16416b;
            Hh hh = eh2.f13908a.get(i10);
            C1735jg.a aVar = new C1735jg.a();
            aVar.f16422b = hh.f14148a;
            List<String> list = hh.f14149b;
            aVar.f16423c = new String[list.size()];
            Iterator<String> it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                aVar.f16423c[i11] = it.next();
                i11++;
            }
            aVarArr[i10] = aVar;
        }
        c1735jg.f16417c = eh2.f13909b;
        c1735jg.f16418d = eh2.f13910c;
        c1735jg.f16419e = eh2.f13911d;
        c1735jg.f16420f = eh2.f13912e;
        return c1735jg;
    }
}
