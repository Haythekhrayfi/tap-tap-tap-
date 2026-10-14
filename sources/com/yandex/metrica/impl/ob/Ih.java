package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Ih {
    public List<Hh> a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new C2120ym.a(str).optJSONArray("sdk_list");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i10);
                    String strOptString = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(strOptString)) {
                        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("classes");
                        ArrayList arrayList2 = new ArrayList();
                        if (jSONArrayOptJSONArray2 != null) {
                            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                                try {
                                    String strOptString2 = jSONArrayOptJSONArray2.getJSONObject(i11).optString("name");
                                    if (!TextUtils.isEmpty(strOptString2)) {
                                        arrayList2.add(strOptString2);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        if (!U2.b(arrayList2)) {
                            arrayList.add(new Hh(strOptString, arrayList2));
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }
}
