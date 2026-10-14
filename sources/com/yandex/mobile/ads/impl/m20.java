package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class m20 implements cb<j20> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p91 f22885a = new p91();

    @Override // com.yandex.mobile.ads.impl.cb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j20 a(JSONObject jSONObject) throws JSONException, zi0 {
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            x60.c("Image asset has not value", new Object[0]);
            throw new zi0("Native Ad json has not required attributes");
        }
        j20 j20Var = new j20();
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        Objects.requireNonNull(this.f22885a);
        j20Var.b(p91.a(ImagesContract.URL, jSONObject2));
        j20Var.b(jSONObject2.getInt("w"));
        j20Var.a(jSONObject2.getInt("h"));
        String strOptString = jSONObject2.optString("sizeType");
        if (!TextUtils.isEmpty(strOptString)) {
            j20Var.a(strOptString);
        }
        return j20Var;
    }
}
