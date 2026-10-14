package com.yandex.mobile.ads.impl;

import android.os.Build;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class hm1 {
    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        rm1.a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        rm1.a(jSONObject, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        rm1.a(jSONObject, "os", "Android");
        return jSONObject;
    }
}
