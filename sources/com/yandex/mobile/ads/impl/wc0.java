package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class wc0 implements cb<vc0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cf1 f26248b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gc0 f26247a = new gc0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f20 f26249c = new f20(new p91());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p20 f26250d = new p20();

    public wc0(Context context) {
        this.f26248b = new cf1(context);
    }

    @Override // com.yandex.mobile.ads.impl.cb
    public final vc0 a(JSONObject jSONObject) throws JSONException, zi0 {
        if (!(jSONObject.has("value") && !jSONObject.isNull("value"))) {
            x60.c("Media asset has not value", new Object[0]);
            throw new zi0("Native Ad json has not required attributes");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        wa0 wa0Var = (wa0) (jSONObject2.has("media") && !jSONObject2.isNull("media") ? this.f26247a.a(jSONObject2.getJSONObject("media")) : null);
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("images");
        ArrayList arrayListA = jSONArrayOptJSONArray != null ? this.f26250d.a(jSONArrayOptJSONArray) : null;
        j20 j20VarA = jSONObject2.has("image") && !jSONObject2.isNull("image") ? this.f26249c.a(jSONObject2.getJSONObject("image")) : null;
        if ((arrayListA == null || arrayListA.isEmpty()) && j20VarA != null) {
            arrayListA = new ArrayList();
            arrayListA.add(j20VarA);
        }
        zb1 zb1Var = (zb1) (jSONObject2.has("video") && !jSONObject2.isNull("video") ? this.f26248b.a(jSONObject2.getJSONObject("video")) : null);
        if (wa0Var != null || ((arrayListA != null && !arrayListA.isEmpty()) || zb1Var != null)) {
            return new vc0(wa0Var, zb1Var, arrayListA);
        }
        x60.c("Media value has not sub values", new Object[0]);
        throw new zi0("Native Ad json has not required attributes");
    }
}
