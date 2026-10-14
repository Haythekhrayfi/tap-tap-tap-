package com.yandex.mobile.ads.impl;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class gc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vd f21007a = new vd();

    public final Object a(JSONObject jSONObject) throws JSONException, zi0 {
        String strA = this.f21007a.a("html", jSONObject);
        float f10 = (float) jSONObject.getDouble("aspectRatio");
        if (f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            f10 = 1.7777778f;
        }
        return new wa0(strA, f10);
    }
}
