package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ui implements cb<ti> {
    @Override // com.yandex.mobile.ads.impl.cb
    public final ti a(JSONObject jSONObject) throws JSONException, zi0 {
        return (jSONObject.has("value") && jSONObject.isNull("value")) ? new ti(2, null) : new ti(1, jk0.a("value", jSONObject));
    }
}
