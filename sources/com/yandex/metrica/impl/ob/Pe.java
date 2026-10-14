package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.PreloadInfo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Le f14720a;

    public Pe(PreloadInfo preloadInfo, Im im, boolean z10) {
        if (preloadInfo != null) {
            if (!TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                this.f14720a = new Le(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z10, E0.APP);
            } else if (im.c()) {
                im.a("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.");
            }
        }
    }

    public JSONObject a(JSONObject jSONObject) {
        Le le2 = this.f14720a;
        if (le2 != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("trackingId", le2.f14405a);
                    jSONObject2.put("additionalParams", le2.f14406b);
                    jSONObject2.put("wasSet", le2.f14407c);
                    jSONObject2.put("autoTracking", le2.f14408d);
                    jSONObject2.put("source", le2.f14409e.a());
                } catch (Throwable unused) {
                }
                jSONObject.put("preloadInfo", jSONObject2);
            } catch (Throwable unused2) {
            }
        }
        return jSONObject;
    }
}
