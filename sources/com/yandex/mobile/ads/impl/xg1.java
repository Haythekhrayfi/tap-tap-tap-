package com.yandex.mobile.ads.impl;

import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class xg1 {
    public static JSONObject a(wg1 wg1Var) throws JSONException {
        fd.j0.i(wg1Var, "viewSizeInfo");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", wg1Var.d().b());
        jSONObject2.put("height", wg1Var.d().a());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("width", wg1Var.b().b());
        jSONObject3.put("height", wg1Var.b().a());
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject4.put("value", wg1Var.c().b().b());
        String strName = wg1Var.c().b().a().name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        fd.j0.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        jSONObject4.put("mode", lowerCase);
        jSONObject5.put("value", wg1Var.c().a().b());
        String lowerCase2 = wg1Var.c().a().a().name().toLowerCase(locale);
        fd.j0.h(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        jSONObject5.put("mode", lowerCase2);
        jSONObject6.put("width", jSONObject4);
        jSONObject6.put("height", jSONObject5);
        JSONObject jSONObject7 = new JSONObject(wg1Var.a());
        jSONObject.put("view", jSONObject2);
        jSONObject.put("layout_params", jSONObject3);
        jSONObject.put("measured", jSONObject6);
        jSONObject.put("additional_info", jSONObject7);
        return jSONObject;
    }
}
