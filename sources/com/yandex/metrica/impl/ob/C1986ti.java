package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1986ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, ? extends List<String>> f17472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, ? extends C1646g1> f17473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1646g1 f17474c;

    public C1986ti() {
        kc.x xVar = kc.x.f32010c;
        this.f17472a = xVar;
        this.f17473b = xVar;
    }

    public final C1646g1 a() {
        return this.f17474c;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0027 A[Catch: all -> 0x00ea, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:9:0x000e, B:15:0x001a, B:17:0x001e, B:21:0x0027, B:34:0x005e, B:35:0x0073, B:37:0x0079, B:39:0x00a0, B:40:0x00b7, B:42:0x00bd, B:50:0x00e0, B:51:0x00e2, B:52:0x00e6, B:38:0x009e, B:24:0x002f), top: B:61:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x002d  */
    /* JADX WARN: Code duplicated, block: B:24:0x002f A[Catch: all -> 0x00ea, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:9:0x000e, B:15:0x001a, B:17:0x001e, B:21:0x0027, B:34:0x005e, B:35:0x0073, B:37:0x0079, B:39:0x00a0, B:40:0x00b7, B:42:0x00bd, B:50:0x00e0, B:51:0x00e2, B:52:0x00e6, B:38:0x009e, B:24:0x002f), top: B:61:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0043 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #1 {all -> 0x005c, blocks: (B:25:0x0034, B:26:0x003d, B:28:0x0043), top: B:63:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[Catch: all -> 0x00ea, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:9:0x000e, B:15:0x001a, B:17:0x001e, B:21:0x0027, B:34:0x005e, B:35:0x0073, B:37:0x0079, B:39:0x00a0, B:40:0x00b7, B:42:0x00bd, B:50:0x00e0, B:51:0x00e2, B:52:0x00e6, B:38:0x009e, B:24:0x002f), top: B:61:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0079 A[Catch: all -> 0x00ea, LOOP:0: B:35:0x0073->B:37:0x0079, LOOP_END, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:9:0x000e, B:15:0x001a, B:17:0x001e, B:21:0x0027, B:34:0x005e, B:35:0x0073, B:37:0x0079, B:39:0x00a0, B:40:0x00b7, B:42:0x00bd, B:50:0x00e0, B:51:0x00e2, B:52:0x00e6, B:38:0x009e, B:24:0x002f), top: B:61:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009e A[Catch: all -> 0x00ea, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:9:0x000e, B:15:0x001a, B:17:0x001e, B:21:0x0027, B:34:0x005e, B:35:0x0073, B:37:0x0079, B:39:0x00a0, B:40:0x00b7, B:42:0x00bd, B:50:0x00e0, B:51:0x00e2, B:52:0x00e6, B:38:0x009e, B:24:0x002f), top: B:61:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd A[Catch: all -> 0x00ea, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:9:0x000e, B:15:0x001a, B:17:0x001e, B:21:0x0027, B:34:0x005e, B:35:0x0073, B:37:0x0079, B:39:0x00a0, B:40:0x00b7, B:42:0x00bd, B:50:0x00e0, B:51:0x00e2, B:52:0x00e6, B:38:0x009e, B:24:0x002f), top: B:61:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0 A[Catch: all -> 0x00ea, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:9:0x000e, B:15:0x001a, B:17:0x001e, B:21:0x0027, B:34:0x005e, B:35:0x0073, B:37:0x0079, B:39:0x00a0, B:40:0x00b7, B:42:0x00bd, B:50:0x00e0, B:51:0x00e2, B:52:0x00e6, B:38:0x009e, B:24:0x002f), top: B:61:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x003d A[SYNTHETIC] */
    public final synchronized void a(C1646g1 c1646g1) {
        String str;
        HashMap map;
        JSONObject jSONObject;
        Iterator<String> itKeys;
        String next;
        List<String> listB;
        Map linkedHashMap;
        LinkedHashMap linkedHashMap2;
        String str2;
        List<String> listB2;
        C1646g1 c1646g2 = this.f17474c;
        String str3 = c1646g2 != null ? c1646g2.f16160a : null;
        if (str3 == null || str3.length() == 0) {
            this.f17474c = c1646g1;
            str = c1646g1.f16160a;
            if (str == null) {
                map = null;
            } else {
                map = new HashMap();
                try {
                    jSONObject = new JSONObject(str);
                    itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        next = itKeys.next();
                        try {
                            listB = C2120ym.b(new JSONArray(jSONObject.optString(next)));
                            if (listB != null) {
                                map.put(next, listB);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (map != null) {
                linkedHashMap = new LinkedHashMap(kc.e0.a(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), new C1646g1(String.valueOf(C2120ym.b((List<?>) entry.getValue())), c1646g1.f16161b, c1646g1.f16162c));
                }
            } else {
                linkedHashMap = kc.x.f32010c;
            }
            this.f17473b = linkedHashMap;
            linkedHashMap2 = new LinkedHashMap(kc.e0.a(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                str2 = ((C1646g1) entry2.getValue()).f16160a;
                if (str2 == null) {
                    listB2 = null;
                } else {
                    try {
                        listB2 = C2120ym.b(new JSONArray(str2));
                    } catch (Throwable unused3) {
                        listB2 = null;
                    }
                }
                if (listB2 != null) {
                    listB2 = kc.w.f32009c;
                }
                linkedHashMap2.put(key, listB2);
            }
            this.f17472a = linkedHashMap2;
        } else {
            String str4 = c1646g1.f16160a;
            if (!(str4 == null || str4.length() == 0)) {
                this.f17474c = c1646g1;
                str = c1646g1.f16160a;
                if (str == null) {
                    map = null;
                } else {
                    map = new HashMap();
                    jSONObject = new JSONObject(str);
                    itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        next = itKeys.next();
                        listB = C2120ym.b(new JSONArray(jSONObject.optString(next)));
                        if (listB != null) {
                            map.put(next, listB);
                        }
                    }
                }
                if (map != null) {
                    linkedHashMap = new LinkedHashMap(kc.e0.a(map.size()));
                    while (r2.hasNext()) {
                        linkedHashMap.put(entry.getKey(), new C1646g1(String.valueOf(C2120ym.b((List<?>) entry.getValue())), c1646g1.f16161b, c1646g1.f16162c));
                    }
                } else {
                    linkedHashMap = kc.x.f32010c;
                }
                this.f17473b = linkedHashMap;
                linkedHashMap2 = new LinkedHashMap(kc.e0.a(linkedHashMap.size()));
                while (r0.hasNext()) {
                    Object key2 = entry2.getKey();
                    str2 = ((C1646g1) entry2.getValue()).f16160a;
                    if (str2 == null) {
                        listB2 = null;
                    } else {
                        listB2 = C2120ym.b(new JSONArray(str2));
                    }
                    if (listB2 != null) {
                        listB2 = kc.w.f32009c;
                    }
                    linkedHashMap2.put(key2, listB2);
                }
                this.f17472a = linkedHashMap2;
            }
        }
    }

    public final synchronized void a(List<String> list, Map<String, C1646g1> map) {
        EnumC1596e1 enumC1596e1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : list) {
            List<String> list2 = this.f17472a.get(str);
            if (!(list2 == null || list2.isEmpty())) {
                linkedHashMap.put(str, list2);
            }
        }
        String strB = C2120ym.b(linkedHashMap);
        C1646g1 c1646g1 = this.f17474c;
        if (c1646g1 == null || (enumC1596e1 = c1646g1.f16161b) == null) {
            enumC1596e1 = EnumC1596e1.UNKNOWN;
        }
        map.put("yandex_mobile_metrica_custom_sdk_hosts", new C1646g1(strB, enumC1596e1, c1646g1 != null ? c1646g1.f16162c : null));
    }

    public final Map<String, C1646g1> b() {
        return this.f17473b;
    }
}
