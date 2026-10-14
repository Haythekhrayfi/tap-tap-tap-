package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class z21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x21 f27195a = new x21();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zc f27196b = new zc();

    public final y21 a(JSONObject jSONObject) throws JSONException {
        q21 q21VarA;
        yc ycVarA;
        fd.j0.i(jSONObject, "jsonValue");
        Object objOpt = jSONObject.opt("ColorWizButton");
        ArrayList arrayList = null;
        String str = objOpt instanceof String ? (String) objOpt : null;
        Object objOpt2 = jSONObject.opt("ColorWizButtonText");
        String str2 = objOpt2 instanceof String ? (String) objOpt2 : null;
        Object objOpt3 = jSONObject.opt("ColorWizBack");
        String str3 = objOpt3 instanceof String ? (String) objOpt3 : null;
        Object objOpt4 = jSONObject.opt("ColorWizBackRight");
        String str4 = objOpt4 instanceof String ? (String) objOpt4 : null;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("backgroundColors");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("smart-center");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("smart-centers");
        if (jSONObjectOptJSONObject2 != null) {
            Objects.requireNonNull(this.f27195a);
            q21VarA = x21.a(jSONObjectOptJSONObject2);
        } else {
            q21VarA = null;
        }
        if (jSONObjectOptJSONObject != null) {
            Objects.requireNonNull(this.f27196b);
            ycVarA = zc.a(jSONObjectOptJSONObject);
        } else {
            ycVarA = null;
        }
        if (jSONArrayOptJSONArray != null) {
            bd.c cVarH = bd.e.h(0, jSONArrayOptJSONArray.length());
            arrayList = new ArrayList(kc.m.j(cVarH, 10));
            Iterator<Integer> it = cVarH.iterator();
            while (it.hasNext()) {
                int iA = ((kc.c0) it).a();
                x21 x21Var = this.f27195a;
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(iA);
                fd.j0.h(jSONObjectOptJSONObject3, "smartCentersJsonArray.optJSONObject(index)");
                Objects.requireNonNull(x21Var);
                arrayList.add(x21.a(jSONObjectOptJSONObject3));
            }
        }
        return new y21(str, str2, str3, str4, ycVarA, q21VarA, arrayList);
    }
}
