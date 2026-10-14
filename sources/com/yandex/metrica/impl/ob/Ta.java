package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Ta implements Ya<YandexMetricaConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Hm f15074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1606eb f15075b;

    public Ta(Hm hm2, C1606eb c1606eb) {
        this.f15074a = hm2;
        this.f15075b = c1606eb;
    }

    private JSONObject a(Location location) throws JSONException {
        if (location == null) {
            return null;
        }
        return new JSONObject().putOpt("provider", location.getProvider()).put("timestamp", location.getTime()).put("precision", location.getAccuracy()).put("altitude", location.getAltitude()).put("lon", location.getLongitude()).put("lat", location.getLatitude()).put("direction", location.getBearing()).put("speed", location.getSpeed());
    }

    @Override // com.yandex.metrica.impl.ob.Ya
    public JSONObject a(YandexMetricaConfig yandexMetricaConfig) {
        JSONArray jSONArray;
        YandexMetricaConfig yandexMetricaConfig2 = yandexMetricaConfig;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (yandexMetricaConfig2 != null) {
                JSONObject jSONObjectPutOpt = jSONObject2.put("api_key", yandexMetricaConfig2.apiKey).putOpt("app_version", yandexMetricaConfig2.appVersion).putOpt("session_timeout", yandexMetricaConfig2.sessionTimeout).putOpt("crash_reporting", yandexMetricaConfig2.crashReporting).putOpt("native_crash_reporting", yandexMetricaConfig2.nativeCrashReporting).putOpt("location", a(yandexMetricaConfig2.location)).putOpt("location_tracking", yandexMetricaConfig2.locationTracking).putOpt("logs", yandexMetricaConfig2.logs);
                PreloadInfo preloadInfo = yandexMetricaConfig2.preloadInfo;
                jSONObjectPutOpt.putOpt("preload_info", preloadInfo == null ? null : new JSONObject().putOpt("tracking_id", preloadInfo.getTrackingId()).putOpt("additional_parameters", C2120ym.f(preloadInfo.getAdditionalParams()))).putOpt("first_activation_as_update", yandexMetricaConfig2.firstActivationAsUpdate).putOpt("statistics_sending", yandexMetricaConfig2.statisticsSending).putOpt("max_reports_in_database_count", yandexMetricaConfig2.maxReportsInDatabaseCount).putOpt("error_environment", C2120ym.f(yandexMetricaConfig2.errorEnvironment)).putOpt("user_profile_id", yandexMetricaConfig2.userProfileID).putOpt("revenue_auto_tracking_enabled", yandexMetricaConfig2.revenueAutoTrackingEnabled).putOpt("sessions_auto_tracking_enabled", yandexMetricaConfig2.sessionsAutoTrackingEnabled).putOpt("app_open_tracking_enabled", yandexMetricaConfig2.appOpenTrackingEnabled);
                if (yandexMetricaConfig2 instanceof com.yandex.metrica.j) {
                    com.yandex.metrica.j jVar = (com.yandex.metrica.j) yandexMetricaConfig2;
                    JSONObject jSONObjectPutOpt2 = jSONObject2.putOpt("device_type", jVar.f18066a).putOpt("clids", C2120ym.f(jVar.f18067b)).putOpt("distribution_referrer", jVar.f18068c);
                    List<String> list = jVar.f18069d;
                    if (list == null) {
                        jSONArray = null;
                    } else {
                        jSONArray = list.isEmpty() ? new JSONArray() : C2120ym.b((List<?>) list);
                    }
                    JSONObject jSONObjectPutOpt3 = jSONObjectPutOpt2.putOpt("custom_hosts", jSONArray).putOpt("app_build_number", jVar.f18070e).putOpt("dispatch_period_seconds", jVar.f18071f).putOpt("max_reports_count", jVar.f18072g).putOpt("app_environment", C2120ym.f(jVar.f18073h)).putOpt("preload_info_auto_tracking", jVar.f18074i).putOpt("permissions_collection", jVar.f18075j).putOpt("anr_monitoring", jVar.f18076k);
                    Objects.requireNonNull(this.f15075b);
                    jSONObjectPutOpt3.putOpt("pulse_config", null).putOpt("rtm_config", null).put("crash_transformer_set", jVar.f18077l != null);
                }
            }
            jSONObject.putOpt("config", jSONObject2).putOpt("process_name", ((Dm) this.f15074a).b());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
