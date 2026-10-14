package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class Aj {
    public C1760kg.x[] a(JSONArray jSONArray) {
        Integer numValueOf;
        if (jSONArray == null) {
            return new C1760kg.x[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                Integer numC = C2120ym.c(jSONObject, "type");
                if (numC != null) {
                    int iIntValue = numC.intValue();
                    if (iIntValue != 0) {
                        int i11 = 1;
                        if (iIntValue != 1) {
                            i11 = 2;
                            if (iIntValue != 2) {
                                i11 = 3;
                                if (iIntValue != 3) {
                                }
                            }
                        }
                        numValueOf = Integer.valueOf(i11);
                    } else {
                        numValueOf = 0;
                    }
                    String strE = C2120ym.e(jSONObject, "value");
                    if (numValueOf == null && strE != null) {
                        C1760kg.x xVar = new C1760kg.x();
                        xVar.f16752b = numValueOf.intValue();
                        xVar.f16753c = strE;
                        arrayList.add(xVar);
                    }
                }
                numValueOf = null;
                String strE2 = C2120ym.e(jSONObject, "value");
                if (numValueOf == null) {
                }
            } catch (Throwable unused) {
            }
        }
        return (C1760kg.x[]) arrayList.toArray(new C1760kg.x[0]);
    }
}
