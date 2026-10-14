package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.BuildConfigFieldProvider;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class yz0 implements qx0<nz0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z41 f27163a = new z41();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r51 f27164b = new r51();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ur f27165c = new ur();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final xe f27166d = new xe();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h3 f27167e = new h3(new gz());

    /* JADX WARN: Code duplicated, block: B:65:0x01ee  */
    @Override // com.yandex.mobile.ads.impl.qx0
    public final nz0 a(fx0 fx0Var) {
        nz0 nz0Var;
        int i10;
        Long lValueOf;
        Boolean boolValueOf;
        Integer numValueOf;
        Integer numValueOf2;
        tr trVar;
        JSONObject jSONObjectOptJSONObject;
        Integer numValueOf3;
        Object objOpt;
        String string;
        String str = (String) this.f27163a.a(fx0Var);
        nz0 nz0Var2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("ad_blocker_status_validity_duration") || (objOpt = jSONObject.opt("ad_blocker_status_validity_duration")) == null || (string = objOpt.toString()) == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(string);
                } catch (NumberFormatException unused) {
                    lValueOf = null;
                }
            }
            Long lValueOf2 = lValueOf != null ? Long.valueOf(lValueOf.longValue() * 1000) : null;
            boolean zOptBoolean = jSONObject.optBoolean("aab_disabled");
            boolean zOptBoolean2 = jSONObject.optBoolean("autograb_enabled");
            boolean zOptBoolean3 = jSONObject.optBoolean("custom_click_handling_enabled");
            boolean zOptBoolean4 = jSONObject.optBoolean("legacy_visibility_logic_enabled");
            boolean zOptBoolean5 = jSONObject.optBoolean("legacy_vast_tracking_enabled");
            boolean zOptBoolean6 = jSONObject.optBoolean("overlapping_view_tracking_enabled");
            boolean zOptBoolean7 = jSONObject.optBoolean("overlapping_window_tracking_enabled");
            boolean zOptBoolean8 = jSONObject.optBoolean("open_measurement_sdk_disabled");
            boolean zOptBoolean9 = jSONObject.optBoolean("multibanner_arrow_controls_disabled");
            Boolean boolValueOf2 = jSONObject.has("visibility_error_indicator_enabled") ? Boolean.valueOf(jSONObject.optBoolean("visibility_error_indicator_enabled")) : null;
            String strOptString = jSONObject.optString("mraid_controller", null);
            String strOptString2 = jSONObject.optString("open_measurement_sdk_controller", null);
            String strOptString3 = jSONObject.optString("click_handler_type", null);
            try {
                String strA = this.f27167e.a(jSONObject);
                nz0Var2 = null;
                String strOptString4 = jSONObject.optString("divkit_font", null);
                String strOptString5 = jSONObject.optString("dev_instream_design", null);
                boolean zOptBoolean10 = jSONObject.optBoolean("sensitive_mode_disabled");
                boolean zOptBoolean11 = jSONObject.optBoolean("hard_sensitive_mode_enabled");
                boolean zOptBoolean12 = jSONObject.optBoolean("encrypted_requests_enabled");
                if (jSONObject.has("mediation_sensitive_mode_disabled")) {
                    try {
                        boolValueOf = Boolean.valueOf(jSONObject.optBoolean("mediation_sensitive_mode_disabled"));
                    } catch (JSONException unused2) {
                        i10 = 0;
                        nz0Var = null;
                        x60.c("Can't parse sdk configuration response", new Object[i10]);
                        return nz0Var;
                    }
                } else {
                    boolValueOf = null;
                }
                boolean zOptBoolean13 = jSONObject.optBoolean("custom_user_agent_enabled");
                boolean zOptBoolean14 = jSONObject.optBoolean("fused_location_provider_disabled");
                boolean zOptBoolean15 = jSONObject.optBoolean("lock_screen_enabled");
                boolean zOptBoolean16 = jSONObject.optBoolean("impression_validation_on_click_enabled");
                boolean zOptBoolean17 = jSONObject.optBoolean("legacy_slider_impression_enabled");
                long jOptLong = jSONObject.optLong("reload_timeout");
                Objects.requireNonNull(this.f27164b);
                long jCurrentTimeMillis = System.currentTimeMillis() + (jOptLong > 0 ? jOptLong * 1000 : 86400000L);
                int iOptInt = jSONObject.optInt("ad_ids_storage_size");
                int iOptInt2 = jSONObject.optInt("native_web_view_pool_size");
                try {
                    numValueOf = Integer.valueOf(jSONObject.getInt("ad_request_max_retries"));
                } catch (Exception unused3) {
                    numValueOf = null;
                }
                try {
                    numValueOf2 = Integer.valueOf(jSONObject.getInt("ping_request_max_retries"));
                } catch (Exception unused4) {
                    numValueOf2 = null;
                }
                Boolean bool = boolValueOf2;
                int i11 = 0;
                try {
                    boolean zOptBoolean18 = jSONObject.optBoolean("show_version_validation_error_log", false);
                    boolean zOptBoolean19 = jSONObject.optBoolean("show_version_validation_error_indicator", false);
                    boolean zOptBoolean20 = jSONObject.optBoolean("fullscreen_back_button_enabled", false);
                    boolean zOptBoolean21 = jSONObject.optBoolean("divkit_disabled", false);
                    boolean zOptBoolean22 = jSONObject.optBoolean("use_okhttp_network_stack", false);
                    boolean zOptBoolean23 = jSONObject.optBoolean("location_consent", false);
                    boolean zOptBoolean24 = jSONObject.optBoolean("libssl_enabled", false);
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("bidding_settings");
                    BiddingSettings biddingSettingsB = jSONObjectOptJSONObject2 != null ? this.f27166d.b(jSONObjectOptJSONObject2) : null;
                    JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("encryption");
                    BiddingSettings biddingSettings = biddingSettingsB;
                    Objects.requireNonNull(this.f27165c);
                    if (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("rsa")) == null) {
                        trVar = null;
                    } else {
                        String strOptString6 = jSONObjectOptJSONObject.optString("public_key", "");
                        try {
                            numValueOf3 = Integer.valueOf(jSONObjectOptJSONObject.getInt("version"));
                        } catch (Exception unused5) {
                            numValueOf3 = null;
                        }
                        if (TextUtils.isEmpty(strOptString6) || numValueOf3 == null) {
                            trVar = null;
                        } else {
                            trVar = new tr(numValueOf3.intValue(), strOptString6);
                        }
                    }
                    i11 = 0;
                    boolean zOptBoolean25 = jSONObject.optBoolean("legacy_render_tracking_enabled", false);
                    tr trVar2 = trVar;
                    boolean zOptBoolean26 = jSONObject.optBoolean("legacy_impression_callback_enabled", false);
                    boolean zOptBoolean27 = jSONObject.optBoolean("close_fullscreen_with_adtune_disabled", false);
                    boolean zOptBoolean28 = jSONObject.optBoolean("render_asset_validation_enabled", false);
                    boolean zOptBoolean29 = jSONObject.optBoolean("automatic_sdk_initialization_delay_enabled", false);
                    boolean zOptBoolean30 = jSONObject.optBoolean("fullscreen_preloading_enabled", false);
                    int iOptInt3 = jSONObject.optInt("fullscreen_cache_lifetime_millis", 0);
                    boolean zOptBoolean31 = jSONObject.optBoolean("native_banner_enabled", false);
                    nz0Var = null;
                    try {
                        return new nz0.a().a(numValueOf).b(numValueOf2).a(lValueOf2).a(zOptBoolean).b(zOptBoolean2).a(iOptInt).b(iOptInt2).a(jCurrentTimeMillis).f(strOptString).g(strOptString2).f(zOptBoolean3).b(jSONObject.optString("banner_size_calculation_type", null)).d(bool).h(BuildConfigFieldProvider.getVersion()).u(zOptBoolean15).b(boolValueOf).B(zOptBoolean10).m(zOptBoolean11).g(zOptBoolean13).l(zOptBoolean14).c(i01.b().g()).a(i01.b().d()).r(zOptBoolean4).d(zOptBoolean27).q(zOptBoolean5).y(zOptBoolean6).z(zOptBoolean7).x(zOptBoolean8).v(zOptBoolean9).n(zOptBoolean16).p(zOptBoolean17).o(zOptBoolean25).D(zOptBoolean18).C(zOptBoolean19).e(strOptString5).j(zOptBoolean20).a(biddingSettings).a(trVar2).e(zOptBoolean26).h(zOptBoolean21).G(zOptBoolean22).t(zOptBoolean23).s(zOptBoolean24).a(strA).d(strOptString4).i(zOptBoolean12).A(zOptBoolean28).c(strOptString3).c(zOptBoolean29).k(zOptBoolean30).w(zOptBoolean31).F(jSONObject.optBoolean("use_new_binding_api_for_divkit", false)).E(jSONObject.optBoolean("use_divkit_close_action_instead_system_click", false)).b(iOptInt3).c(jSONObject.optLong("html_rendering_timeout_millis", 0L)).i(jSONObject.optString("startup_version", null)).a();
                    } catch (JSONException unused6) {
                        i10 = 0;
                        x60.c("Can't parse sdk configuration response", new Object[i10]);
                        return nz0Var;
                    }
                } catch (JSONException unused7) {
                    nz0Var = null;
                    i10 = i11;
                    x60.c("Can't parse sdk configuration response", new Object[i10]);
                    return nz0Var;
                }
            } catch (JSONException unused8) {
                nz0Var = null;
            }
        } catch (JSONException unused9) {
            nz0Var = nz0Var2;
        }
    }
}
