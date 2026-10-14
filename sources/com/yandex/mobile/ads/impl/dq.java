package com.yandex.mobile.ads.impl;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class dq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final td f19969a = new td();

    public final yp a(xo xoVar) {
        if ("divkit".equals(xoVar.d())) {
            try {
                String strC = xoVar.c();
                String strB = xoVar.b();
                Objects.requireNonNull(this.f19969a);
                JSONObject jSONObject = new JSONObject(td.a(strB.getBytes()));
                return new yp(strC, jSONObject.getJSONObject("card"), jSONObject.has("templates") ? jSONObject.getJSONObject("templates") : null, xoVar.a());
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
