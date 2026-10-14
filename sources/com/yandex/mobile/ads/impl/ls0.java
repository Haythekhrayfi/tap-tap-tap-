package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class ls0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zt f22775a = new zt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p91 f22776b;

    public ls0(p91 p91Var) {
        this.f22776b = p91Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    public final js0 a(JSONObject jSONObject) throws JSONException, zi0 {
        HashMap map;
        String strA = jk0.a("package", jSONObject);
        Objects.requireNonNull(this.f22776b);
        String strA2 = p91.a(ImagesContract.URL, jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extras");
        Objects.requireNonNull(this.f22775a);
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            if (itKeys.hasNext()) {
                map = new HashMap();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObjectOptJSONObject.isNull(next)) {
                        map.put(next, jSONObjectOptJSONObject.get(next));
                    }
                }
            } else {
                map = null;
            }
        } else {
            map = null;
        }
        return new js0(strA, strA2, map);
    }
}
