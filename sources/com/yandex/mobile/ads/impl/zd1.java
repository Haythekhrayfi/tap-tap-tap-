package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zd1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    private static final Map<v3, String> f27288b = kc.f0.e(new jc.h(v3.f25809l, "video_ad_rendering_duration"), new jc.h(v3.f25810m, "video_ad_prepare_duration"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w3 f27289a;

    public zd1(w3 w3Var) {
        fd.j0.i(w3Var, "adLoadingPhasesManager");
        this.f27289a = w3Var;
    }

    public final Map<String, Object> a() {
        List<u3> listB = this.f27289a.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listB) {
            v3 v3VarA = ((u3) obj).a();
            Object arrayList = linkedHashMap.get(v3VarA);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(v3VarA, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kc.e0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = f27288b.get(entry.getKey());
            if (str == null) {
                str = "";
            }
            linkedHashMap2.put(str, entry.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (((String) entry2.getKey()).length() > 0) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(kc.e0.a(linkedHashMap3.size()));
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            Object key = entry3.getKey();
            Iterable iterable = (Iterable) entry3.getValue();
            ArrayList arrayList2 = new ArrayList(kc.m.j(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((u3) it.next()).b());
            }
            linkedHashMap4.put(key, arrayList2);
        }
        return kc.e0.b(new jc.h("durations", linkedHashMap4));
    }
}
