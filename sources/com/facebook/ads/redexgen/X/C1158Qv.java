package com.facebook.ads.redexgen.X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1158Qv {
    public static boolean A00(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < i; i10++) {
            EnumC1157Qu t10 = EnumC1157Qu.A00(jSONArray, i10);
            if (t10 != EnumC1157Qu.A00(jSONArray2, i10) || !t10.A05(jSONArray, jSONArray2, i10)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A02(JSONObject jSONObject, JSONObject jSONObject2) {
        EnumC1157Qu enumC1157QuA01;
        if (jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next) || (enumC1157QuA01 = EnumC1157Qu.A01(jSONObject, next)) != EnumC1157Qu.A01(jSONObject2, next) || !enumC1157QuA01.A07(jSONObject, jSONObject2, next)) {
                return false;
            }
        }
        return true;
    }
}
