package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.ads.AdError;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class s extends d implements com.applovin.impl.sdk.ad.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f10645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.d f10646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f10647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AppLovinAdLoadListener f10648d;

    public s(JSONObject jSONObject, com.applovin.impl.sdk.ad.d dVar, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.o oVar) {
        super("TaskProcessAdResponse", oVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.f10645a = jSONObject;
        this.f10646b = dVar;
        this.f10647c = bVar;
        this.f10648d = appLovinAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        d tVar;
        String string = JsonUtils.getString(jSONObject, "type", AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "Starting task for AppLovin ad...");
            }
            tVar = new v(jSONObject, this.f10645a, this.f10647c, this, this.f10534f);
        } else {
            if ("vast".equalsIgnoreCase(string)) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f10536h.b(this.f10535g, "Starting task for VAST ad...");
                }
                this.f10534f.G().a((d) u.a(jSONObject, this.f10645a, this.f10647c, this, this.f10534f));
                return;
            }
            if (!"js_tag".equalsIgnoreCase(string)) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f10536h.e(this.f10535g, "Unable to process ad of unknown type: " + string);
                }
                failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, i.f.a("Unknown ad type: ", string)));
                return;
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "Starting task for JS tag ad...");
            }
            tVar = new t(jSONObject, this.f10645a, this.f10647c, this, this.f10534f);
        }
        this.f10534f.G().a(tVar);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f10648d;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        failedToReceiveAdV2(new AppLovinError(i10, ""));
    }

    @Override // com.applovin.impl.sdk.ad.i
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f10648d;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof com.applovin.impl.sdk.ad.i) {
            ((com.applovin.impl.sdk.ad.i) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArrayA = com.applovin.impl.b.a.k.a(this.f10645a, "ads");
        if (jSONArrayA.length() > 0) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArrayA, 0, new JSONObject()));
        } else {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.d(this.f10535g, "No ads were returned from the server");
            }
            com.applovin.impl.sdk.utils.w.a(this.f10646b.a(), this.f10646b.b(), this.f10645a, this.f10534f);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }
}
