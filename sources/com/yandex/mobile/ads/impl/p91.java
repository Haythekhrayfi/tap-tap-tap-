package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class p91 {
    public static String a(String str, JSONObject jSONObject) throws JSONException, zi0 {
        String strA = jk0.a(str, jSONObject);
        if (TextUtils.isEmpty(strA)) {
            throw new zi0("Native Ad json has not required attributes");
        }
        return strA;
    }
}
