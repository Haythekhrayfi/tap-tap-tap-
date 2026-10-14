package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class f20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p91 f20502a;

    public f20(p91 p91Var) {
        this.f20502a = p91Var;
    }

    public final j20 a(JSONObject jSONObject) throws JSONException, zi0 {
        j20 j20Var = new j20();
        Objects.requireNonNull(this.f20502a);
        j20Var.b(p91.a(ImagesContract.URL, jSONObject));
        j20Var.b(jSONObject.getInt("w"));
        j20Var.a(jSONObject.getInt("h"));
        if (jSONObject.has("smartCenterSettings")) {
            j20Var.a(new z21().a(jSONObject.getJSONObject("smartCenterSettings")));
        }
        String strOptString = jSONObject.optString("sizeType");
        if (!TextUtils.isEmpty(strOptString)) {
            j20Var.a(strOptString);
        }
        return j20Var;
    }
}
