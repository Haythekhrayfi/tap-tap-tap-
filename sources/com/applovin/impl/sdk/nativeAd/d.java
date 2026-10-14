package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.b.a.k;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.applovin.impl.sdk.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f10791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f10792b;

    public d(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, o oVar) {
        super("TaskProcessNativeAdResponse", oVar);
        this.f10791a = jSONObject;
        this.f10792b = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArrayA = k.a(this.f10791a, "ads");
        if (jSONArrayA.length() > 0) {
            if (y.a()) {
                this.f10536h.b(this.f10535g, "Processing ad...");
            }
            this.f10534f.G().a((com.applovin.impl.sdk.e.d) new e(JsonUtils.getJSONObject(jSONArrayA, 0, new JSONObject()), this.f10791a, this.f10792b, this.f10534f));
            return;
        }
        if (y.a()) {
            this.f10536h.d(this.f10535g, "No ads were returned from the server");
        }
        w.a("native_native", MaxAdFormat.NATIVE, this.f10791a, this.f10534f);
        this.f10792b.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
