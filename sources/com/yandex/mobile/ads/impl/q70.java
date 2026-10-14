package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.joran.action.Action;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class q70 {
    public static HashMap a(JSONObject jSONObject) {
        fd.j0.i(jSONObject, "jsonObject");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        fd.j0.h(itKeys, "keys");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            fd.j0.h(next, Action.KEY_ATTRIBUTE);
            Object objA = az0.a(next, jSONObject);
            if (objA != null) {
                if (objA instanceof JSONObject) {
                    objA = a((JSONObject) objA);
                }
                map.put(next, objA);
            }
        }
        return map;
    }
}
