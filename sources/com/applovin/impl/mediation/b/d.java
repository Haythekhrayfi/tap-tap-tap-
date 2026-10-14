package com.applovin.impl.mediation.b;

import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import com.yandex.metrica.plugins.PluginErrorDetails;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends com.applovin.impl.sdk.e.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static JSONObject f9257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static JSONObject f9258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static JSONObject f9259k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f9260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaxAdapterResponseParameters f9261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaxAdFormat f9262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f9263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f9264e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AppLovinAdSize f9265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AppLovinAdType f9266m;

    public d(String str, JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, o oVar) {
        super(str, oVar);
        this.f9260a = jSONObject;
        this.f9261b = maxAdapterResponseParameters;
        this.f9262c = maxAdFormat;
        this.f9263d = oVar;
        this.f9265l = a(maxAdFormat);
        this.f9266m = b(maxAdFormat);
    }

    private static AppLovinAdSize a(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isFullscreenAd()) {
            return AppLovinAdSize.INTERSTITIAL;
        }
        if (MaxAdFormat.BANNER == maxAdFormat) {
            return AppLovinAdSize.BANNER;
        }
        if (MaxAdFormat.LEADER == maxAdFormat) {
            return AppLovinAdSize.LEADER;
        }
        if (MaxAdFormat.MREC == maxAdFormat) {
            return AppLovinAdSize.MREC;
        }
        if (MaxAdFormat.NATIVE == maxAdFormat) {
            return AppLovinAdSize.NATIVE;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private static AppLovinAdType b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd() || MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            return AppLovinAdType.REGULAR;
        }
        if (MaxAdFormat.NATIVE == maxAdFormat) {
            return AppLovinAdType.NATIVE;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            return AppLovinAdType.INCENTIVIZED;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            return AppLovinAdType.AUTO_INCENTIVIZED;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            return AppLovinAdType.APP_OPEN;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private JSONObject b() {
        JSONObject jSONObject = f9257i;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putInt(jSONObject2, "ad_id", 0);
        JsonUtils.putString(jSONObject2, "base_url", "file://");
        JsonUtils.putString(jSONObject2, "graphic_background_color", "#000000");
        JsonUtils.putBoolean(jSONObject2, "lock_current_orientation", true);
        JsonUtils.putBoolean(jSONObject2, "omsdk_enabled", false);
        JsonUtils.putBoolean(jSONObject2, "playback_requires_user_action", true);
        JsonUtils.putString(jSONObject2, "presentation_mode", "activity");
        JsonUtils.putBoolean(jSONObject2, "unhide_adview_on_render", true);
        JsonUtils.putJSONObject(jSONObject2, "web_view_settings", h());
        f9257i = jSONObject2;
        return jSONObject2;
    }

    private JSONObject b(a aVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArray(jSONObject, "assets", c(aVar));
        JsonUtils.putJSONObject(jSONObject, "link", d(aVar));
        JsonUtils.putJsonArray(jSONObject, "eventtrackers", e(aVar));
        JsonUtils.putString(jSONObject, "ver", aVar.b());
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObject(jSONObject2, PluginErrorDetails.Platform.NATIVE, jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        JsonUtils.putString(jSONObject3, "version", aVar.b());
        JsonUtils.putJSONObject(jSONObject3, "value", jSONObject2);
        return jSONObject3;
    }

    private JSONArray c(a aVar) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, FacebookMediationAdapter.KEY_ID, 1);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "text", aVar.c());
        JsonUtils.putJSONObject(jSONObject, "title", jSONObject2);
        jSONArray.put(jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        JsonUtils.putInt(jSONObject3, FacebookMediationAdapter.KEY_ID, 8);
        JSONObject jSONObject4 = new JSONObject();
        JsonUtils.putString(jSONObject4, "value", aVar.d());
        JsonUtils.putJSONObject(jSONObject3, "data", jSONObject4);
        jSONArray.put(jSONObject3);
        JSONObject jSONObject5 = new JSONObject();
        JsonUtils.putInt(jSONObject5, FacebookMediationAdapter.KEY_ID, 4);
        JSONObject jSONObject6 = new JSONObject();
        JsonUtils.putString(jSONObject6, "value", aVar.e());
        JsonUtils.putJSONObject(jSONObject5, "data", jSONObject6);
        jSONArray.put(jSONObject5);
        if (StringUtils.isValidString(aVar.f())) {
            JSONObject jSONObject7 = new JSONObject();
            JsonUtils.putInt(jSONObject7, FacebookMediationAdapter.KEY_ID, 2);
            JSONObject jSONObject8 = new JSONObject();
            JsonUtils.putString(jSONObject8, ImagesContract.URL, aVar.f());
            JsonUtils.putInt(jSONObject8, "w", aVar.g());
            JsonUtils.putInt(jSONObject8, "h", aVar.h());
            JsonUtils.putJSONObject(jSONObject7, "img", jSONObject8);
            jSONArray.put(jSONObject7);
        }
        return jSONArray;
    }

    private JSONObject c() {
        JSONObject jSONObject = f9258j;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putInt(jSONObject2, "ad_id", 0);
        JsonUtils.putBoolean(jSONObject2, "uerp", true);
        JsonUtils.putString(jSONObject2, "presentation_mode", "activity");
        JsonUtils.putJSONObject(jSONObject2, "web_view_settings", h());
        f9258j = jSONObject2;
        return jSONObject2;
    }

    private JSONObject d(a aVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, ImagesContract.URL, aVar.i());
        JsonUtils.putJsonArray(jSONObject, "clicktrackers", aVar.j());
        return jSONObject;
    }

    private JSONArray e(a aVar) {
        JSONArray jSONArray = new JSONArray();
        for (String str : aVar.l()) {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, ImagesContract.URL, str);
            JsonUtils.putInt(jSONObject, "event", 1);
            JsonUtils.putInt(jSONObject, "method", 1);
            jSONArray.put(jSONObject);
        }
        for (String str2 : aVar.k()) {
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, ImagesContract.URL, str2);
            JsonUtils.putInt(jSONObject2, "type", 1);
            JsonUtils.putInt(jSONObject2, "method", 2);
            jSONArray.put(jSONObject2);
        }
        return jSONArray;
    }

    private static JSONObject h() {
        JSONObject jSONObject = f9259k;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putBoolean(jSONObject2, "allow_file_access", true);
        f9259k = jSONObject2;
        return jSONObject2;
    }

    public abstract JSONObject a();

    public JSONObject a(a aVar) {
        JSONObject jSONObjectC = c();
        JsonUtils.putAll(jSONObjectC, JsonUtils.deserialize(this.f9261b.getServerParameters().getString("ad_object")));
        JsonUtils.putJSONObject(jSONObjectC, "ortb_response", b(aVar));
        return jSONObjectC;
    }

    public JSONObject a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectB = b();
        JsonUtils.putAll(jSONObjectB, JsonUtils.deserialize(this.f9261b.getServerParameters().getString("ad_object")));
        JsonUtils.putString(jSONObjectB, "html", str);
        JsonUtils.putJSONObject(jSONObjectB, "click_tracking_urls", jSONObject);
        JsonUtils.putJSONObject(jSONObjectB, "imp_urls", jSONObject2);
        return jSONObjectB;
    }

    public JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "ad_size", this.f9265l.toString());
        JsonUtils.putString(jSONObject2, "ad_type", this.f9266m.toString());
        JsonUtils.putString(jSONObject2, "dsp_name", this.f9264e);
        JsonUtils.putInt(jSONObject2, "status", 200);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        JsonUtils.putJsonArray(jSONObject2, "ads", jSONArray);
        return jSONObject2;
    }
}
