package com.applovin.impl.mediation.b.a;

import android.text.TextUtils;
import com.applovin.impl.mediation.b.d;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.e.v;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b extends d implements AppLovinAdLoadListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f9213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f9214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f9215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JSONObject f9216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private JSONObject f9217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f9218n;

    public b(JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, String str, AppLovinAdLoadListener appLovinAdLoadListener, o oVar) {
        super("TaskProcessNimbusAd", jSONObject, maxAdapterResponseParameters, maxAdFormat, oVar);
        this.f9213i = str;
        this.f9214j = appLovinAdLoadListener;
    }

    private JSONObject a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                String string = jSONArray.getString(i10);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(string, "");
                }
            } catch (JSONException e10) {
                this.f9263d.F();
                if (y.a()) {
                    this.f9263d.F().b(this.f10535g, "Failed to retrieve tracking url with a non-String value.", e10);
                }
            }
        }
        return jSONObject;
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "Nimbus-Session-Id", this.f9213i);
        return jSONObject;
    }

    @Override // com.applovin.impl.mediation.b.d
    public JSONObject a() {
        JSONObject jSONObjectA = a(this.f9215k, this.f9217m, this.f9216l);
        JsonUtils.putString(jSONObjectA, "cache_prefix", "nimbus");
        JsonUtils.putString(jSONObjectA, "type", "nimbus");
        JsonUtils.putJSONObject(jSONObjectA, "http_headers_for_postbacks", b());
        return jSONObjectA;
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        ((AppLovinAdImpl) appLovinAd).setMaxAdValue("creative_id", this.f9218n);
        this.f9214j.adReceived(appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        this.f9214j.failedToReceiveAd(i10);
    }

    @Override // java.lang.Runnable
    public void run() {
        String string = JsonUtils.getString(((d) this).f9260a, "markup", "");
        this.f9215k = string;
        if (TextUtils.isEmpty(string)) {
            this.f9214j.failedToReceiveAd(204);
            return;
        }
        String string2 = JsonUtils.getString(((d) this).f9260a, "position", "");
        String string3 = JsonUtils.getString(((d) this).f9260a, FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, "");
        String string4 = JsonUtils.getString(((d) this).f9260a, "auction_id", "");
        if (y.a()) {
            y yVar = this.f10536h;
            StringBuilder sbA = q2.a.a("Processing Nimbus ad (", string2, ") for placement: ", string3, " with auction id: ");
            sbA.append(string4);
            sbA.append("...");
            yVar.b("TaskProcessNimbusAd", sbA.toString());
        }
        this.f9264e = JsonUtils.getString(((d) this).f9260a, "network", "");
        this.f9218n = JsonUtils.getString(((d) this).f9260a, "crid", null);
        JSONObject jSONObject = JsonUtils.getJSONObject(((d) this).f9260a, "trackers", new JSONObject());
        this.f9217m = a(JsonUtils.getJSONArray(jSONObject, "click_trackers", null));
        this.f9216l = a(JsonUtils.getJSONArray(jSONObject, "impression_trackers", null));
        JSONObject jSONObjectA = a();
        JSONObject jSONObjectA2 = a(jSONObjectA);
        if (y.a()) {
            this.f10536h.b("TaskProcessNimbusAd", "Starting render task for Nimbus ad: " + string2 + "...");
        }
        this.f9263d.G().a(new v(jSONObjectA, jSONObjectA2, com.applovin.impl.sdk.ad.b.UNKNOWN, this.f9214j, this.f9263d), r.b.MAIN);
    }
}
