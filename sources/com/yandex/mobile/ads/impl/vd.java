package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final td f25965a = new td();

    public final String a(String str, JSONObject jSONObject) throws JSONException, zi0 {
        String strA = jk0.a(str, jSONObject);
        Objects.requireNonNull(this.f25965a);
        String strA2 = td.a(strA);
        if (TextUtils.isEmpty(strA2)) {
            throw new zi0("Native Ad json has attribute with broken base64 encoding");
        }
        return strA2;
    }
}
