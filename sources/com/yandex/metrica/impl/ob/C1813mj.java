package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1813mj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f16898a = Collections.unmodifiableMap(new a());

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.mj$a */
    public class a extends HashMap<String, Integer> {
        public a() {
            put("BACKGROUND", 0);
            put("FOREGROUND", 2);
            put("VISIBLE", 2);
        }
    }

    private static C1760kg.k.a.C0183a a(JSONObject jSONObject, boolean z10) {
        C1760kg.k.a.C0183a c0183a = new C1760kg.k.a.C0183a();
        Boolean boolB = C2120ym.b(jSONObject, "last_known_enabled");
        Boolean boolValueOf = Boolean.valueOf(c0183a.f16677b);
        if (boolB == null) {
            boolB = boolValueOf;
        }
        c0183a.f16677b = boolB.booleanValue();
        Boolean boolB2 = C2120ym.b(jSONObject, "scanning_enabled");
        Boolean boolValueOf2 = Boolean.valueOf(z10);
        if (boolB2 == null) {
            boolB2 = boolValueOf2;
        }
        boolean zBooleanValue = boolB2.booleanValue();
        c0183a.f16678c = zBooleanValue;
        if (jSONObject != null && zBooleanValue) {
            C1760kg.k.a.C0183a.C0184a c0184a = new C1760kg.k.a.C0183a.C0184a();
            Long lD = C2120ym.d(jSONObject, "duration_seconds");
            Long lValueOf = Long.valueOf(c0184a.f16680b);
            if (lD == null) {
                lD = lValueOf;
            }
            c0184a.f16680b = lD.longValue();
            Long lD2 = C2120ym.d(jSONObject, "interval_seconds");
            Long lValueOf2 = Long.valueOf(c0184a.f16681c);
            if (lD2 == null) {
                lD2 = lValueOf2;
            }
            c0184a.f16681c = lD2.longValue();
            c0183a.f16679d = c0184a;
        }
        return c0183a;
    }

    public void a(C2042vj c2042vj, JSONObject jSONObject) {
        int i10;
        Float fValueOf;
        C1953sa c1953sa = new C1953sa();
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("location_collecting");
        if (jSONArrayOptJSONArray != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                if (jSONObjectOptJSONObject != null) {
                    C1961si c1961siE = c2042vj.e();
                    C1760kg.k kVar = new C1760kg.k();
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("config");
                    C1760kg.k.a aVar = new C1760kg.k.a();
                    kVar.f16658b = aVar;
                    if (jSONObjectOptJSONObject2 != null) {
                        aVar.f16660b = C2120ym.a(C2120ym.d(jSONObjectOptJSONObject2, "min_update_interval_seconds"), TimeUnit.SECONDS, kVar.f16658b.f16660b);
                        C1760kg.k.a aVar2 = kVar.f16658b;
                        Integer num = null;
                        if (jSONObjectOptJSONObject2.has("min_update_distance_meters")) {
                            try {
                                fValueOf = Float.valueOf((float) jSONObjectOptJSONObject2.getDouble("min_update_distance_meters"));
                            } catch (Throwable unused) {
                                fValueOf = null;
                            }
                        } else {
                            fValueOf = null;
                        }
                        Float fValueOf2 = Float.valueOf(kVar.f16658b.f16661c);
                        if (fValueOf == null) {
                            fValueOf = fValueOf2;
                        }
                        aVar2.f16661c = fValueOf.floatValue();
                        C1760kg.k.a aVar3 = kVar.f16658b;
                        Integer numC = C2120ym.c(jSONObjectOptJSONObject2, "records_count_to_force_flush");
                        Integer numValueOf = Integer.valueOf(kVar.f16658b.f16662d);
                        if (numC == null) {
                            numC = numValueOf;
                        }
                        aVar3.f16662d = numC.intValue();
                        C1760kg.k.a aVar4 = kVar.f16658b;
                        Integer numC2 = C2120ym.c(jSONObjectOptJSONObject2, "max_records_count_in_batch");
                        Integer numValueOf2 = Integer.valueOf(kVar.f16658b.f16663e);
                        if (numC2 == null) {
                            numC2 = numValueOf2;
                        }
                        aVar4.f16663e = numC2.intValue();
                        C1760kg.k.a aVar5 = kVar.f16658b;
                        Long lD = C2120ym.d(jSONObjectOptJSONObject2, "max_age_seconds_to_force_flush");
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        aVar5.f16664f = C2120ym.a(lD, timeUnit, kVar.f16658b.f16664f);
                        C1760kg.k.a aVar6 = kVar.f16658b;
                        Integer numC3 = C2120ym.c(jSONObjectOptJSONObject2, "max_records_to_store_locally");
                        Integer numValueOf3 = Integer.valueOf(kVar.f16658b.f16665g);
                        if (numC3 == null) {
                            numC3 = numValueOf3;
                        }
                        aVar6.f16665g = numC3.intValue();
                        kVar.f16658b.f16669k = C2120ym.a(C2120ym.d(jSONObjectOptJSONObject2, "lbs_min_update_interval_seconds"), timeUnit, kVar.f16658b.f16669k);
                        C1760kg.k.a aVar7 = kVar.f16658b;
                        Boolean boolB = C2120ym.b(jSONObjectOptJSONObject2, "location_collecting_enabled");
                        Boolean boolValueOf = Boolean.valueOf(kVar.f16658b.f16666h);
                        if (boolB == null) {
                            boolB = boolValueOf;
                        }
                        aVar7.f16666h = boolB.booleanValue() && c1961siE.f17342g;
                        C1760kg.k.a aVar8 = kVar.f16658b;
                        Boolean boolB2 = C2120ym.b(jSONObjectOptJSONObject2, "lbs_collecting_enabled");
                        Boolean boolValueOf2 = Boolean.valueOf(kVar.f16658b.f16667i);
                        if (boolB2 == null) {
                            boolB2 = boolValueOf2;
                        }
                        aVar8.f16667i = boolB2.booleanValue() && c1961siE.f17343h;
                        C1760kg.k.a aVar9 = kVar.f16658b;
                        Boolean boolB3 = C2120ym.b(jSONObjectOptJSONObject2, "passive_collecting_enabled");
                        Boolean boolValueOf3 = Boolean.valueOf(kVar.f16658b.f16668j);
                        if (boolB3 == null) {
                            boolB3 = boolValueOf3;
                        }
                        aVar9.f16668j = boolB3.booleanValue() && c1961siE.f17342g;
                        C1760kg.k.a aVar10 = kVar.f16658b;
                        Boolean boolB4 = C2120ym.b(jSONObjectOptJSONObject2, "all_cells_collecting_enabled");
                        Boolean boolValueOf4 = Boolean.valueOf(kVar.f16658b.f16675q);
                        if (boolB4 == null) {
                            boolB4 = boolValueOf4;
                        }
                        aVar10.f16675q = boolB4.booleanValue() && c1961siE.f17354s;
                        C1760kg.k.a aVar11 = kVar.f16658b;
                        Boolean boolB5 = C2120ym.b(jSONObjectOptJSONObject2, "connected_cell_collecting_enabled");
                        Boolean boolValueOf5 = Boolean.valueOf(kVar.f16658b.f16676r);
                        if (boolB5 == null) {
                            boolB5 = boolValueOf5;
                        }
                        aVar11.f16676r = boolB5.booleanValue() && c1961siE.f17354s;
                        if (c1961siE.f17352q) {
                            kVar.f16658b.f16670l = a(jSONObjectOptJSONObject2.optJSONObject("wifi_access_config"), false);
                        }
                        C1760kg.k.a aVar12 = kVar.f16658b;
                        if (aVar12.f16667i) {
                            aVar12.f16671m = a(jSONObjectOptJSONObject2.optJSONObject("lbs_access_config"), false);
                        }
                        C1760kg.k.a aVar13 = kVar.f16658b;
                        if (aVar13.f16666h) {
                            aVar13.f16672n = a(jSONObjectOptJSONObject2.optJSONObject("gps_access_config"), false);
                        }
                        C1760kg.k.a aVar14 = kVar.f16658b;
                        if (aVar14.f16668j) {
                            aVar14.f16673o = a(jSONObjectOptJSONObject2.optJSONObject("passive_access_config"), true);
                        }
                        if (c1961siE.f17345j) {
                            C1760kg.k.a aVar15 = kVar.f16658b;
                            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("gpl_access_config");
                            C1760kg.k.a.b bVar = new C1760kg.k.a.b();
                            Boolean boolB6 = C2120ym.b(jSONObjectOptJSONObject3, "scanning_enabled");
                            Boolean boolValueOf6 = Boolean.valueOf(bVar.f16683c);
                            if (boolB6 == null) {
                                boolB6 = boolValueOf6;
                            }
                            bVar.f16683c = boolB6.booleanValue();
                            Boolean boolB7 = C2120ym.b(jSONObjectOptJSONObject3, "last_known_enabled");
                            Boolean boolValueOf7 = Boolean.valueOf(bVar.f16682b);
                            if (boolB7 == null) {
                                boolB7 = boolValueOf7;
                            }
                            bVar.f16682b = boolB7.booleanValue();
                            if (bVar.f16683c) {
                                String strE = C2120ym.e(jSONObjectOptJSONObject3, "priority");
                                Long lD2 = C2120ym.d(jSONObjectOptJSONObject3, "duration_seconds");
                                Long lD3 = C2120ym.d(jSONObjectOptJSONObject3, "interval_seconds");
                                if (strE != null) {
                                    if (strE.equals("PRIORITY_NO_POWER")) {
                                        num = 0;
                                    } else if (strE.equals("PRIORITY_LOW_POWER")) {
                                        num = 1;
                                    } else if (strE.equals("PRIORITY_BALANCED_POWER_ACCURACY")) {
                                        num = 2;
                                    } else if (strE.equals("PRIORITY_HIGH_ACCURACY")) {
                                        num = 3;
                                    }
                                }
                                if (num != null && lD2 != null && lD3 != null) {
                                    C1760kg.k.a.b.C0185a c0185a = new C1760kg.k.a.b.C0185a();
                                    c0185a.f16685b = lD2.longValue();
                                    c0185a.f16686c = lD3.longValue();
                                    c0185a.f16687d = num.intValue();
                                    bVar.f16684d = c0185a;
                                }
                            }
                            aVar15.f16674p = bVar;
                        }
                    }
                    kVar.f16659c = new C1760kg.k.b();
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("preconditions");
                    if (jSONObjectOptJSONObject4 != null) {
                        C1760kg.k.b bVar2 = kVar.f16659c;
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray("charge_types");
                        if (jSONArrayOptJSONArray2 != null) {
                            for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                                String strOptString = jSONArrayOptJSONArray2.optString(i12);
                                if ("USB".equals(strOptString)) {
                                    arrayList2.add(1);
                                } else {
                                    if ("AC".equals(strOptString)) {
                                        i10 = 3;
                                    } else if ("NONE".equals(strOptString)) {
                                        i10 = 0;
                                    } else if ("WIRELESS".equals(strOptString)) {
                                        arrayList2.add(2);
                                    }
                                    arrayList2.add(i10);
                                }
                            }
                        }
                        int[] iArr = new int[arrayList2.size()];
                        Iterator it = arrayList2.iterator();
                        int i13 = 0;
                        while (it.hasNext()) {
                            iArr[i13] = ((Integer) it.next()).intValue();
                            i13++;
                        }
                        bVar2.f16688b = iArr;
                        C1760kg.k.b bVar3 = kVar.f16659c;
                        ArrayList arrayList3 = new ArrayList();
                        JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject4.optJSONArray("app_statuses");
                        if (jSONArrayOptJSONArray3 != null) {
                            for (int i14 = 0; i14 < jSONArrayOptJSONArray3.length(); i14++) {
                                Integer num2 = f16898a.get(jSONArrayOptJSONArray3.optString(i14, ""));
                                if (num2 != null) {
                                    arrayList3.add(num2);
                                }
                            }
                        }
                        int[] iArr2 = new int[arrayList3.size()];
                        Iterator it2 = arrayList3.iterator();
                        int i15 = 0;
                        while (it2.hasNext()) {
                            iArr2[i15] = ((Integer) it2.next()).intValue();
                            i15++;
                        }
                        bVar3.f16689c = iArr2;
                    }
                    arrayList.add(c1953sa.a(kVar));
                }
            }
        }
        c2042vj.b(arrayList);
    }
}
