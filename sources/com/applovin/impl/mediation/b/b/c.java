package com.applovin.impl.mediation.b.b;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.adview.a0;
import com.applovin.impl.b.a.k;
import com.applovin.impl.mediation.b.d;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f9248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.mediation.b.a.C0122a f9249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f9250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f9251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f9252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f9253n;

    public c(JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, o oVar) {
        super("TaskProcessTaboolaAd", jSONObject, maxAdapterResponseParameters, maxAdFormat, oVar);
        this.f9249j = com.applovin.impl.mediation.b.a.a();
        this.f9250k = "";
        this.f9251l = "";
        this.f9252m = "";
        this.f9253n = null;
        this.f9248i = appLovinNativeAdLoadListener;
    }

    private String a(Object obj, String str, String str2) {
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonUtils.getString(jSONObject, "onEvent", "");
        String string2 = JsonUtils.getString(jSONObject, "type", "");
        if (StringUtils.isValidString(str) && !str.equalsIgnoreCase(string)) {
            return null;
        }
        if (!StringUtils.isValidString(str2) || str2.equalsIgnoreCase(string2)) {
            return JsonUtils.getString(jSONObject, "value", null);
        }
        return null;
    }

    private List<String> a(JSONArray jSONArray, JSONArray jSONArray2) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strA = a(JsonUtils.getObjectAtIndex(jSONArray, i10, null), (String) null, "script");
                if (!TextUtils.isEmpty(strA)) {
                    arrayList.add(Uri.decode(strA));
                }
            }
        }
        if (jSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String strA2 = a(JsonUtils.getObjectAtIndex(jSONArray2, i11, null), (String) null, "script");
                if (!TextUtils.isEmpty(strA2)) {
                    arrayList.add(Uri.decode(strA2));
                }
            }
        }
        return arrayList;
    }

    private List<String> a(JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2) {
        ArrayList arrayList = new ArrayList();
        String string = JsonUtils.getString(jSONObject, "available", null);
        if (StringUtils.isValidString(string)) {
            if (y.a()) {
                a0.a("Processed impression URL: ", string, this.f10536h, "TaskProcessTaboolaAd");
            }
            arrayList.add(string);
        }
        String string2 = JsonUtils.getString(jSONObject, "visible", null);
        if (StringUtils.isValidString(string2)) {
            if (y.a()) {
                a0.a("Processed impression URL: ", string2, this.f10536h, "TaskProcessTaboolaAd");
            }
            arrayList.add(string2);
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i10, null);
                String strA = a(objectAtIndex, "available", "pixel");
                if (!StringUtils.isValidString(strA)) {
                    strA = a(objectAtIndex, "visible", "pixel");
                }
                if (!TextUtils.isEmpty(strA)) {
                    if (y.a()) {
                        a0.a("Processed impression URL: ", strA, this.f10536h, "TaskProcessTaboolaAd");
                    }
                    arrayList.add(strA);
                }
            }
        }
        if (jSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String strA2 = a(JsonUtils.getObjectAtIndex(jSONArray2, i11, null), (String) null, "pixel");
                if (!TextUtils.isEmpty(strA2)) {
                    if (y.a()) {
                        a0.a("Processed impression URL: ", strA2, this.f10536h, "TaskProcessTaboolaAd");
                    }
                    arrayList.add(strA2);
                }
            }
        }
        return arrayList;
    }

    private JSONArray a(JSONObject jSONObject, JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        String string = JsonUtils.getString(jSONObject, "click", null);
        if (StringUtils.isValidString(string)) {
            if (y.a()) {
                a0.a("Processed click tracking URL: ", string, this.f10536h, "TaskProcessTaboolaAd");
            }
            jSONArray2.put(string);
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strA = a(JsonUtils.getObjectAtIndex(jSONArray, i10, null), "click", "pixel");
                if (!TextUtils.isEmpty(strA)) {
                    if (y.a()) {
                        a0.a("Processed click tracking URL: ", strA, this.f10536h, "TaskProcessTaboolaAd");
                    }
                    jSONArray2.put(strA);
                }
            }
        }
        return jSONArray2;
    }

    @Override // com.applovin.impl.mediation.b.d
    public JSONObject a() {
        JSONObject jSONObjectA = a(this.f9249j.a());
        JsonUtils.putString(jSONObjectA, "cache_prefix", "taboola_");
        JsonUtils.putString(jSONObjectA, "type", "taboola");
        JsonUtils.putString(jSONObjectA, "privacy_url", this.f9253n);
        return jSONObjectA;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayA = k.a(((d) this).f9260a, "placements");
        if (jSONArrayA.length() == 0) {
            if (y.a()) {
                this.f10536h.d("TaskProcessTaboolaAd", "No ads were returned from the server");
            }
            this.f9248i.onNativeAdLoadFailed(AppLovinError.NO_FILL);
            return;
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(jSONArrayA, 0, new JSONObject());
        JSONArray jSONArrayA2 = k.a(jSONObject, "list");
        String string = JsonUtils.getString(jSONObject, "name", "");
        if (jSONArrayA2.length() == 0) {
            if (y.a()) {
                this.f10536h.d("TaskProcessTaboolaAd", "No ads were returned from the server");
            }
            this.f9248i.onNativeAdLoadFailed(AppLovinError.NO_FILL);
            return;
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayA2, 0, new JSONObject());
        this.f9250k = JsonUtils.getString(jSONObject2, FacebookMediationAdapter.KEY_ID, "");
        if (y.a()) {
            this.f10536h.b("TaskProcessTaboolaAd", w0.a.a(defpackage.a.a("Processing Taboola ad ("), this.f9250k, ") for placement: ", string, "..."));
        }
        this.f9251l = JsonUtils.getString(jSONObject2, "type", "");
        this.f9252m = JsonUtils.getString(jSONObject2, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "");
        this.f9253n = JsonUtils.getString(jSONObject2, "discloser", null);
        this.f9249j.a("Taboola_2.0");
        this.f9249j.b(JsonUtils.getString(jSONObject2, "name", ""));
        this.f9249j.c(JsonUtils.getString(jSONObject2, "branding", ""));
        this.f9249j.d(JsonUtils.getString(jSONObject2, "description", ""));
        this.f9249j.f(JsonUtils.getString(jSONObject2, ImagesContract.URL, null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject2, "thumbnail", new JSONArray());
        if (jSONArray.length() > 0 && (jSONObjectOptJSONObject = jSONArray.optJSONObject(0)) != null) {
            this.f9249j.e(JsonUtils.getString(jSONObjectOptJSONObject, ImagesContract.URL, null));
            this.f9249j.a(JsonUtils.getInt(jSONObjectOptJSONObject, "width", 0));
            this.f9249j.b(JsonUtils.getInt(jSONObjectOptJSONObject, "height", 0));
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject2, "beacons", null);
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject, "events", (JSONObject) null);
        JSONArray jSONArray3 = JsonUtils.getJSONArray(JsonUtils.getJSONObject(((d) this).f9260a, "user", (JSONObject) null), "beacons", null);
        this.f9249j.a(a(jSONObject3, jSONArray2));
        this.f9249j.a(a(jSONArray2, jSONArray3));
        this.f9249j.b(a(jSONObject3, jSONArray2, jSONArray3));
        JSONObject jSONObjectA = a(a());
        if (y.a()) {
            this.f10536h.b("TaskProcessTaboolaAd", "Starting render task for Taboola ad: " + string + "...");
        }
        this.f9263d.G().a(new com.applovin.impl.sdk.nativeAd.d(jSONObjectA, this.f9248i, this.f9263d), r.b.MAIN);
    }
}
