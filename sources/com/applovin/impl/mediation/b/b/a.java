package com.applovin.impl.mediation.b.b;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.e.d;
import com.applovin.impl.sdk.e.x;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.b.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Uri f9237d = Uri.parse("https://api.taboola.com/");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f9238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f9239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, Object> f9240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f9241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f9242i;

    public a(String str, String str2, String str3, o oVar) {
        super("TaboolaApiService", oVar);
        this.f9241h = "init";
        this.f9242i = "";
        this.f9238e = str;
        this.f9239f = Uri.withAppendedPath(URLUtil.isValidUrl(str3) ? Uri.parse(str3) : f9237d, "2.0/json/" + str2);
        HashMap map = new HashMap(3);
        this.f9240g = map;
        map.put("type", "mobile");
        map.put("apiKey", str);
        map.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "SERVER");
    }

    private Integer a(MaxAdapterResponseParameters maxAdapterResponseParameters, String str, Integer num) {
        if (maxAdapterResponseParameters.getLocalExtraParameters().containsKey(str)) {
            Object obj = maxAdapterResponseParameters.getLocalExtraParameters().get(str);
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
        }
        return Integer.valueOf(maxAdapterResponseParameters.getCustomParameters().getInt(str, num.intValue()));
    }

    private String a(MaxAdapterResponseParameters maxAdapterResponseParameters, String str, String str2) {
        if (maxAdapterResponseParameters.getLocalExtraParameters().containsKey(str)) {
            Object obj = maxAdapterResponseParameters.getLocalExtraParameters().get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return maxAdapterResponseParameters.getCustomParameters().getString(str, str2);
    }

    private JSONObject a(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Map<String, Object> mapB = this.f9220a.M() != null ? this.f9220a.M().b() : this.f9220a.K().d();
        String strValueOf = String.valueOf(mapB.get("ua"));
        String strValueOf2 = String.valueOf(mapB.get("idfa"));
        String str = this.f9241h;
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        if (localExtraParameters.containsKey("taboola_session")) {
            Object obj = localExtraParameters.get("taboola_session");
            if (obj instanceof String) {
                str = (String) obj;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "session", str);
        JsonUtils.putString(jSONObject, "agent", strValueOf);
        JsonUtils.putString(jSONObject, "device", strValueOf2);
        JsonUtils.putString(jSONObject, FacebookMediationAdapter.KEY_ID, this.f9242i);
        JsonUtils.putString(jSONObject, "realip", maxAdapterResponseParameters.getServerParameters().getString("s2s_ip", ""));
        return jSONObject;
    }

    private void a(final b bVar) {
        HashMap map = new HashMap(2);
        map.put("app.type", "mobile");
        map.put("app.apikey", this.f9238e);
        this.f9220a.G().a((d) new x<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f9220a).a(this.f9239f.toString() + "/user.sync").b("GET").a((Map<String, String>) map).a(new JSONObject()).d(false).f(false).a(), this.f9220a) { // from class: com.applovin.impl.mediation.b.b.a.2
            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(int i10, String str, JSONObject jSONObject) {
                if (y.a()) {
                    this.f10536h.e(this.f10535g, "Unable to fetch user id. Server returned " + i10);
                }
                bVar.onInitialized(false, str);
            }

            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(JSONObject jSONObject, int i10) {
                if (i10 != 200 || jSONObject == null) {
                    String strA = android.support.v4.media.a.a("Unable to fetch user id. Server returned ", i10);
                    if (y.a()) {
                        this.f10536h.e(this.f10535g, strA);
                    }
                    bVar.onInitialized(false, strA);
                    return;
                }
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "user", new JSONObject());
                a.this.f9242i = JsonUtils.getString(jSONObject2, FacebookMediationAdapter.KEY_ID, "");
                this.f10534f.a(com.applovin.impl.mediation.b.c.f9254a, a.this.f9242i, a.this.f9222c);
                this.f10534f.a(com.applovin.impl.mediation.b.c.f9255b, Long.valueOf(System.currentTimeMillis()), a.this.f9222c);
                bVar.onInitialized(true, null);
            }
        });
    }

    private JSONObject b(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "type", maxAdapterResponseParameters.getCustomParameters().getString("source_type", ""));
        JsonUtils.putString(jSONObject, FacebookMediationAdapter.KEY_ID, maxAdapterResponseParameters.getCustomParameters().getString("source_id", ""));
        JsonUtils.putString(jSONObject, ImagesContract.URL, maxAdapterResponseParameters.getCustomParameters().getString("source_url", ""));
        return jSONObject;
    }

    private JSONObject c(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, FacebookMediationAdapter.KEY_ID, a(maxAdapterResponseParameters, "taboola_view_id", ""));
        return jSONObject;
    }

    private JSONArray d(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        JsonUtils.putInt(jSONObject, "recCount", 1);
        JsonUtils.putString(jSONObject, "organicType", maxAdapterResponseParameters.getCustomParameters().getString("placement_type", "MIX"));
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        if (localExtraParameters.containsKey("taboola_thumbnail_height") && localExtraParameters.containsKey("taboola_thumbnail_width")) {
            Integer numA = a(maxAdapterResponseParameters, "taboola_thumbnail_height", (Integer) 0);
            Integer numA2 = a(maxAdapterResponseParameters, "taboola_thumbnail_width", (Integer) 0);
            if (numA.intValue() > 0 && numA2.intValue() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                JsonUtils.putInt(jSONObject2, "width", numA.intValue());
                JsonUtils.putInt(jSONObject2, "height", numA2.intValue());
                JsonUtils.putJSONObject(jSONObject, "thumbnail", jSONObject2);
            }
        }
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    private JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        Map<String, Object> mapE = this.f9220a.M() != null ? this.f9220a.M().e() : this.f9220a.K().h();
        Object obj = mapE.get("IABTCF_gdprApplies");
        if (obj != null) {
            JsonUtils.putObject(jSONObject, "gdpr_applies", obj);
            JsonUtils.putString(jSONObject, "daisyBit", String.valueOf(mapE.get("IABTCF_TCString")));
        }
        return jSONObject;
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, b bVar) {
        String str = (String) this.f9220a.b(com.applovin.impl.mediation.b.c.f9254a, null, this.f9222c);
        Long l10 = (Long) this.f9220a.b(com.applovin.impl.mediation.b.c.f9255b, null, this.f9222c);
        if (!StringUtils.isValidString(str) || l10 == null || maxAdapterInitializationParameters.getServerParameters().getLong("user_id_expiration_millis", TimeUnit.DAYS.toMillis(30L)) - (System.currentTimeMillis() - l10.longValue()) <= TimeUnit.HOURS.toMillis(1L)) {
            a(bVar);
        } else {
            this.f9242i = str;
            bVar.onInitialized(true, null);
        }
    }

    public void a(final MaxAdapterResponseParameters maxAdapterResponseParameters, final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJSONObject(jSONObject, "app", new JSONObject(this.f9240g));
        JsonUtils.putJSONObject(jSONObject, "consent", d());
        JsonUtils.putJSONObject(jSONObject, "user", a(maxAdapterResponseParameters));
        JsonUtils.putJSONObject(jSONObject, "source", b(maxAdapterResponseParameters));
        JsonUtils.putJSONObject(jSONObject, "view", c(maxAdapterResponseParameters));
        JsonUtils.putJsonArray(jSONObject, "placements", d(maxAdapterResponseParameters));
        this.f9220a.G().a((d) new x<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f9220a).a(this.f9239f.toString() + "/recommendations.get").b("POST").a(jSONObject).a(new JSONObject()).d(false).f(false).a(), this.f9220a) { // from class: com.applovin.impl.mediation.b.b.a.1
            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(int i10, String str, JSONObject jSONObject2) {
                if (y.a()) {
                    y yVar = this.f10536h;
                    String str2 = this.f10535g;
                    StringBuilder sbA = defpackage.a.a("Unable to fetch ");
                    sbA.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
                    sbA.append(" Taboola ad: server returned ");
                    sbA.append(i10);
                    yVar.e(str2, sbA.toString());
                }
                appLovinNativeAdLoadListener.onNativeAdLoadFailed(new AppLovinError(i10, "Taboola server returned with code: " + jSONObject2));
            }

            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(JSONObject jSONObject2, int i10) {
                if (i10 == 200 && jSONObject2 != null) {
                    a.this.f9241h = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject2, "user", new JSONObject()), "session", "");
                    this.f10534f.G().a((d) new c(jSONObject2, maxAdapterResponseParameters, MaxAdFormat.NATIVE, appLovinNativeAdLoadListener, this.f10534f));
                    return;
                }
                if (y.a()) {
                    y yVar = this.f10536h;
                    String str = this.f10535g;
                    StringBuilder sbA = defpackage.a.a("Unable to fetch ");
                    sbA.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
                    sbA.append(" Taboola ad: server returned ");
                    sbA.append(i10);
                    yVar.e(str, sbA.toString());
                }
                appLovinNativeAdLoadListener.onNativeAdLoadFailed(new AppLovinError(i10, "Taboola server returned with code: " + jSONObject2));
            }
        });
    }
}
