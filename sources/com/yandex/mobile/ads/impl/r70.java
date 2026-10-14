package com.yandex.mobile.ads.impl;

import android.text.Html;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r70 {
    public static String a(String str, JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString(str);
        if (TextUtils.isEmpty(string) || "null".equals(string)) {
            throw new JSONException("Json has not required attributes");
        }
        return string;
    }

    public static HashMap a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("bidding_info");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObjectOptJSONObject.optString(next);
            if ((TextUtils.isEmpty(strOptString) || "null".equals(strOptString)) ? false : true) {
                map.put(next, strOptString);
            }
        }
        return map;
    }

    public static String b(String str, JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString(str);
        if ((TextUtils.isEmpty(string) || "null".equals(string)) ? false : true) {
            return String.valueOf(Html.fromHtml(string));
        }
        throw new JSONException("Json value can not be null or empty");
    }

    public static ArrayList c(String str, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            String strOptString = jSONArrayOptJSONArray.optString(i10);
            if ((TextUtils.isEmpty(strOptString) || "null".equals(strOptString)) ? false : true) {
                arrayList.add(jSONArrayOptJSONArray.optString(i10));
            }
        }
        return arrayList;
    }
}
