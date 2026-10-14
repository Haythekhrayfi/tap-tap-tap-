package com.yandex.mobile.ads.impl;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gz f21292a;

    public h3(gz gzVar) {
        fd.j0.i(gzVar, "hostValidator");
        this.f21292a = gzVar;
    }

    public final String a(JSONObject jSONObject) {
        fd.j0.i(jSONObject, "jsonObject");
        String strOptString = jSONObject.optString("dev_ad_host", null);
        Objects.requireNonNull(this.f21292a);
        if (gz.a(strOptString)) {
            return strOptString;
        }
        return null;
    }
}
