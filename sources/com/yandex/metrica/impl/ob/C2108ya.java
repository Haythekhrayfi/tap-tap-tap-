package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2108ya implements Object<C1785lg.e, C1686hg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, C1522b2.d> f17899a = Collections.unmodifiableMap(new a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<C1522b2.d, Integer> f17900b = Collections.unmodifiableMap(new b());

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ya$a */
    public class a extends HashMap<Integer, C1522b2.d> {
        public a() {
            put(1, C1522b2.d.WIFI);
            put(2, C1522b2.d.CELL);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ya$b */
    public class b extends HashMap<C1522b2.d, Integer> {
        public b() {
            put(C1522b2.d.WIFI, 1);
            put(C1522b2.d.CELL, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    public Object a(Object obj) {
        C1686hg c1686hg = (C1686hg) obj;
        ArrayList arrayList = new ArrayList();
        C1686hg.a[] aVarArr = c1686hg.f16274b;
        int length = aVarArr.length;
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            C1686hg.a aVar = aVarArr[i10];
            String str = aVar.f16277b;
            String str2 = aVar.f16278c;
            String str3 = aVar.f16279d;
            C1686hg.a.C0180a[] c0180aArr = aVar.f16280e;
            Zm zm = new Zm(z10);
            int length2 = c0180aArr.length;
            for (?? r14 = z10; r14 < length2; r14++) {
                C1686hg.a.C0180a c0180a = c0180aArr[r14];
                zm.a(c0180a.f16284b, c0180a.f16285c);
                aVarArr = aVarArr;
            }
            C1686hg.a[] aVarArr2 = aVarArr;
            long j10 = aVar.f16281f;
            int[] iArr = aVar.f16282g;
            ArrayList arrayList2 = new ArrayList(iArr.length);
            int length3 = iArr.length;
            int i11 = 0;
            while (i11 < length3) {
                arrayList2.add(f17899a.get(Integer.valueOf(iArr[i11])));
                i11++;
                iArr = iArr;
                length = length;
            }
            arrayList.add(new C1785lg.e.a(str, str2, str3, zm, j10, arrayList2));
            i10++;
            aVarArr = aVarArr2;
            z10 = false;
        }
        return new C1785lg.e(arrayList, Arrays.asList(c1686hg.f16275c));
    }

    public Object b(Object obj) {
        C1785lg.e eVar = (C1785lg.e) obj;
        C1686hg c1686hg = new C1686hg();
        Set<String> setA = eVar.a();
        c1686hg.f16275c = (String[]) setA.toArray(new String[((HashSet) setA).size()]);
        List<C1785lg.e.a> listB = eVar.b();
        C1686hg.a[] aVarArr = new C1686hg.a[listB.size()];
        for (int i10 = 0; i10 < listB.size(); i10++) {
            C1785lg.e.a aVar = listB.get(i10);
            C1686hg.a aVar2 = new C1686hg.a();
            aVar2.f16277b = aVar.f16842a;
            aVar2.f16278c = aVar.f16843b;
            C1686hg.a.C0180a[] c0180aArr = new C1686hg.a.C0180a[aVar.f16845d.c()];
            int i11 = 0;
            for (Map.Entry<String, ? extends Collection<String>> entry : aVar.f16845d.a()) {
                for (String str : entry.getValue()) {
                    C1686hg.a.C0180a c0180a = new C1686hg.a.C0180a();
                    c0180a.f16284b = entry.getKey();
                    c0180a.f16285c = str;
                    c0180aArr[i11] = c0180a;
                    i11++;
                }
            }
            aVar2.f16280e = c0180aArr;
            aVar2.f16279d = aVar.f16844c;
            aVar2.f16281f = aVar.f16846e;
            List<C1522b2.d> list = aVar.f16847f;
            int[] iArr = new int[list.size()];
            for (int i12 = 0; i12 < list.size(); i12++) {
                iArr[i12] = f17900b.get(list.get(i12)).intValue();
            }
            aVar2.f16282g = iArr;
            aVarArr[i10] = aVar2;
        }
        c1686hg.f16274b = aVarArr;
        return c1686hg;
    }
}
