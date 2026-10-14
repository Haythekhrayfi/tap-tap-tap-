package com.applovin.impl.adview;

import android.annotation.TargetApi;
import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f8631a;

    public y(JSONObject jSONObject) {
        this.f8631a = jSONObject;
    }

    @TargetApi(21)
    public Integer a() {
        int i10;
        String string = JsonUtils.getString(this.f8631a, "mixed_content_mode", null);
        if (StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                i10 = 0;
            } else if ("never_allow".equalsIgnoreCase(string)) {
                i10 = 1;
            } else if ("compatibility_mode".equalsIgnoreCase(string)) {
                i10 = 2;
            }
            return Integer.valueOf(i10);
        }
        return null;
    }

    public WebSettings.PluginState b() {
        String string = JsonUtils.getString(this.f8631a, "plugin_state", null);
        if (StringUtils.isValidString(string)) {
            if ("on".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if ("off".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    public Boolean c() {
        return JsonUtils.getBoolean(this.f8631a, "allow_file_access", null);
    }

    public Boolean d() {
        return JsonUtils.getBoolean(this.f8631a, "load_with_overview_mode", null);
    }

    public Boolean e() {
        return JsonUtils.getBoolean(this.f8631a, "use_wide_view_port", null);
    }

    public Boolean f() {
        return JsonUtils.getBoolean(this.f8631a, "allow_content_access", null);
    }

    public Boolean g() {
        return JsonUtils.getBoolean(this.f8631a, "use_built_in_zoom_controls", null);
    }

    public Boolean h() {
        return JsonUtils.getBoolean(this.f8631a, "display_zoom_controls", null);
    }

    public Boolean i() {
        return JsonUtils.getBoolean(this.f8631a, "save_form_data", null);
    }

    public Boolean j() {
        return JsonUtils.getBoolean(this.f8631a, "geolocation_enabled", null);
    }

    public Boolean k() {
        return JsonUtils.getBoolean(this.f8631a, "need_initial_focus", null);
    }

    public Boolean l() {
        return JsonUtils.getBoolean(this.f8631a, "allow_file_access_from_file_urls", null);
    }

    public Boolean m() {
        return JsonUtils.getBoolean(this.f8631a, "allow_universal_access_from_file_urls", null);
    }

    public Boolean n() {
        return JsonUtils.getBoolean(this.f8631a, "offscreen_pre_raster", null);
    }
}
