package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class o4 {
    public static final n4 a(JSONObject jSONObject) {
        fd.j0.i(jSONObject, "adPodInfo");
        return new n4(jSONObject.optLong("timer_value"), jSONObject.optLong("show_pack_shot_delay"), jSONObject.optLong("show_image_delay"), jSONObject.has("close_button_delay") ? Long.valueOf(jSONObject.optLong("close_button_delay")) : null);
    }
}
