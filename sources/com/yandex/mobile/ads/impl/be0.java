package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class be0 {
    public static AdImpressionData a(JSONObject jSONObject) {
        fd.j0.i(jSONObject, "jsonObject");
        try {
            String strA = r70.a("impression_data", jSONObject);
            fd.j0.h(strA, "getValidJsonString(jsonObject, attributeName)");
            return new AdImpressionData(strA);
        } catch (Exception e10) {
            x60.c(e10.getMessage(), new Object[0]);
            return null;
        }
    }
}
