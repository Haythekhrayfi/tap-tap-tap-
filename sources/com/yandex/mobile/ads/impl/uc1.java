package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class uc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoAd f25597a;

    public uc1(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        this.f25597a = videoAd;
    }

    public final String a() {
        JSONObject jSONObjectA;
        VideoAd videoAd = this.f25597a;
        u50 u50Var = videoAd instanceof u50 ? (u50) videoAd : null;
        String strOptString = (u50Var == null || (jSONObjectA = u50Var.a()) == null) ? null : jSONObjectA.optString("productType");
        boolean z10 = false;
        if (strOptString != null) {
            if (strOptString.length() > 0) {
                z10 = true;
            }
        }
        if (z10) {
            return strOptString;
        }
        return null;
    }
}
