package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class vu implements cb<uu> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m20 f26085a;

    public vu(m20 m20Var) {
        this.f26085a = m20Var;
    }

    @Override // com.yandex.mobile.ads.impl.cb
    public final uu a(JSONObject jSONObject) throws JSONException, zi0 {
        if (jSONObject.has("value")) {
            return new uu(jSONObject.isNull("value") ? null : this.f26085a.a(jSONObject));
        }
        x60.c("FeedbackValue asset has not value", new Object[0]);
        throw new zi0("Native Ad json has not required attributes");
    }
}
