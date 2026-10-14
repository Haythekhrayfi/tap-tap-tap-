package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class kk0 {
    public static boolean a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                return false;
            }
        }
        return true;
    }
}
