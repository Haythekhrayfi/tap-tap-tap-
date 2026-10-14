package com.applovin.impl.b.a;

import android.text.TextUtils;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private static List<d> a(int i10, o oVar) {
        String strA = w.a(i10, o.au(), oVar);
        if (TextUtils.isEmpty(strA)) {
            throw new IllegalStateException("Unable to retrieve consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(strA, null);
        if (jSONObjectJsonObjectFromJsonString == null) {
            throw new IllegalStateException("Unable to parse consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        JSONArray jSONArrayA = k.a(jSONObjectJsonObjectFromJsonString, "states");
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArrayA.length(); i11++) {
            arrayList.add(d.a(JsonUtils.getJSONObject(jSONArrayA, i11, new JSONObject()), oVar));
        }
        return arrayList;
    }

    public static List<d> a(o oVar) {
        return a(R.raw.applovin_consent_flow_privacy_policy, oVar);
    }

    public static List<d> b(o oVar) {
        return a(R.raw.applovin_consent_flow_terms_of_service_and_privacy_policy, oVar);
    }

    public static List<d> c(o oVar) {
        return a(R.raw.applovin_consent_flow_gdpr, oVar);
    }
}
