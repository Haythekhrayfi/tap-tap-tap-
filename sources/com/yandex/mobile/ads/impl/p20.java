package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class p20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f20 f23956a = new f20(new p91());

    public final ArrayList a(JSONArray jSONArray) throws JSONException, zi0 {
        fd.j0.i(jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            j20 j20VarA = this.f23956a.a(jSONArray.getJSONObject(i10));
            fd.j0.h(j20VarA, "imageParser.parseValue(jsonArray.getJSONObject(i))");
            arrayList.add(j20VarA);
        }
        return arrayList;
    }
}
