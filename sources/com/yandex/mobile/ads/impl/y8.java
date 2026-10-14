package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.joran.action.Action;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class y8 {
    public static HashMap a(String str) {
        fd.j0.i(str, "analyticsParametersValue");
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                fd.j0.h(next, Action.KEY_ATTRIBUTE);
                map.put(next, obj);
            }
        } catch (Throwable unused) {
        }
        return map;
    }
}
