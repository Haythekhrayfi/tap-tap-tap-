package com.yandex.metrica.impl.ob;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2133za implements Object<Bi, C1760kg.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, Bi.a> f18010a = Collections.unmodifiableMap(new a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Bi.a, Integer> f18011b = Collections.unmodifiableMap(new b());

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.za$a */
    public class a extends HashMap<Integer, Bi.a> {
        public a() {
            put(1, Bi.a.WIFI);
            put(2, Bi.a.CELL);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.za$b */
    public class b extends HashMap<Bi.a, Integer> {
        public b() {
            put(Bi.a.WIFI, 1);
            put(Bi.a.CELL, 2);
        }
    }

    public Bi a(C1760kg.n nVar) {
        String str = nVar.f16696b;
        String str2 = nVar.f16697c;
        String str3 = nVar.f16698d;
        C1760kg.n.a[] aVarArr = nVar.f16699e;
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (C1760kg.n.a aVar : aVarArr) {
            arrayList.add(new Pair(aVar.f16703b, aVar.f16704c));
        }
        Long lValueOf = Long.valueOf(nVar.f16700f);
        int[] iArr = nVar.f16701g;
        ArrayList arrayList2 = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList2.add(f18010a.get(Integer.valueOf(i10)));
        }
        return new Bi(str, str2, str3, arrayList, lValueOf, arrayList2);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1760kg.n b(Bi bi) {
        C1760kg.n nVar = new C1760kg.n();
        nVar.f16696b = bi.f13727a;
        nVar.f16697c = bi.f13728b;
        nVar.f16698d = bi.f13729c;
        List<Pair<String, String>> list = bi.f13730d;
        C1760kg.n.a[] aVarArr = new C1760kg.n.a[list.size()];
        int i10 = 0;
        for (Pair<String, String> pair : list) {
            C1760kg.n.a aVar = new C1760kg.n.a();
            aVar.f16703b = (String) pair.first;
            aVar.f16704c = (String) pair.second;
            aVarArr[i10] = aVar;
            i10++;
        }
        nVar.f16699e = aVarArr;
        Long l10 = bi.f13731e;
        nVar.f16700f = l10 == null ? 0L : l10.longValue();
        List<Bi.a> list2 = bi.f13732f;
        int[] iArr = new int[list2.size()];
        for (int i11 = 0; i11 < list2.size(); i11++) {
            iArr[i11] = f18011b.get(list2.get(i11)).intValue();
        }
        nVar.f16701g = iArr;
        return nVar;
    }
}
