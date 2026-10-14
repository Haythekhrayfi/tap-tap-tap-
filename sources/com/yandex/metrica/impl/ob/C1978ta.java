package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1978ta implements Object<C1708id, C1760kg.k.b> {
    public C1708id a(C1760kg.k.b bVar) {
        M.b.a aVar;
        E.a aVar2;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        if (bVar.f16688b.length != 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = bVar.f16688b;
                if (i11 >= iArr.length) {
                    break;
                }
                int i12 = iArr[i11];
                if (i12 == 0) {
                    aVar = M.b.a.NONE;
                } else if (i12 == 1) {
                    aVar = M.b.a.USB;
                } else if (i12 != 2) {
                    aVar = i12 != 3 ? M.b.a.UNKNOWN : M.b.a.AC;
                } else {
                    aVar = M.b.a.WIRELESS;
                }
                arrayList.add(aVar);
                i11++;
            }
        } else {
            arrayList.addAll(Arrays.asList(M.b.a.values()));
        }
        ArrayList arrayList2 = new ArrayList();
        if (bVar.f16689c.length != 0) {
            while (true) {
                int[] iArr2 = bVar.f16689c;
                if (i10 >= iArr2.length) {
                    break;
                }
                int i13 = iArr2[i10];
                if (i13 != 0) {
                    aVar2 = i13 != 2 ? E.a.UNKNOWN : E.a.VISIBLE;
                } else {
                    aVar2 = E.a.BACKGROUND;
                }
                arrayList2.add(aVar2);
                i10++;
            }
        } else {
            arrayList2.addAll(Arrays.asList(E.a.values()));
        }
        return new C1708id(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1760kg.k.b b(C1708id c1708id) {
        C1760kg.k.b bVar = new C1760kg.k.b();
        bVar.f16688b = new int[c1708id.f16343a.size()];
        Iterator<M.b.a> it = c1708id.f16343a.iterator();
        int i10 = 0;
        while (true) {
            int i11 = 3;
            if (!it.hasNext()) {
                break;
            }
            M.b.a next = it.next();
            int[] iArr = bVar.f16688b;
            int iOrdinal = next.ordinal();
            if (iOrdinal == 1) {
                i11 = 0;
            } else if (iOrdinal == 2) {
                i11 = 1;
            } else if (iOrdinal == 3) {
                i11 = 2;
            } else if (iOrdinal != 4) {
                i11 = 4;
            }
            iArr[i10] = i11;
            i10++;
        }
        bVar.f16689c = new int[c1708id.f16344b.size()];
        int i12 = 0;
        for (E.a aVar : c1708id.f16344b) {
            int[] iArr2 = bVar.f16689c;
            int iOrdinal2 = aVar.ordinal();
            iArr2[i12] = iOrdinal2 != 1 ? iOrdinal2 != 2 ? 3 : 2 : 0;
            i12++;
        }
        return bVar;
    }
}
