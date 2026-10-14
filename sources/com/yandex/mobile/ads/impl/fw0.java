package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.BuildConfigFieldProvider;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class fw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f20874b;

    public interface a {
        Map<String, Object> a();
    }

    public enum b {
        f20875b("ad_loading_result"),
        f20876c("ad_rendering_result"),
        f20877d("adapter_auto_refresh"),
        f20878e("adapter_invalid"),
        f20879f("adapter_request"),
        f20880g("adapter_response"),
        f20881h("adapter_bidder_token_request"),
        f20882i("adtune"),
        f20883j("ad_request"),
        f20884k("ad_response"),
        f20885l("vast_request"),
        f20886m("vast_response"),
        f20887n("vast_wrapper_request"),
        f20888o("vast_wrapper_response"),
        f20889p("video_ad_start"),
        f20890q("video_ad_complete"),
        f20891r("video_ad_player_error"),
        f20892s("vmap_request"),
        f20893t("vmap_response"),
        f20894u("rendering_start"),
        f20895v("impression_tracking_start"),
        f20896w("impression_tracking_success"),
        f20897x("impression_tracking_failure"),
        f20898y("forced_impression_tracking_failure"),
        f20899z("adapter_action"),
        A("click"),
        B("close"),
        C("feedback"),
        D("deeplink"),
        E("show_social_actions"),
        F("bound_assets"),
        G("rendered_assets"),
        H("rebind"),
        I("binding_failure"),
        J("expected_view_missing"),
        K("returned_to_app"),
        L("reward"),
        /* JADX INFO: Fake field, exist only in values array */
        EF1("js_error"),
        M("video_ad_rendering_result"),
        N("multibanner_event"),
        O("ad_view_size_info"),
        P("ad_unit_impression_tracking_start"),
        Q("ad_unit_impression_tracking_success"),
        R("ad_unit_impression_tracking_failure"),
        S("forced_ad_unit_impression_tracking_failure"),
        T("log");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f20900a;

        b(String str) {
            this.f20900a = str;
        }

        public final String a() {
            return this.f20900a;
        }
    }

    public enum c {
        f20901b("success"),
        f20902c("error"),
        f20903d("no_ads"),
        /* JADX INFO: Fake field, exist only in values array */
        EF43("filtered");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f20905a;

        c(String str) {
            this.f20905a = str;
        }

        public final String a() {
            return this.f20905a;
        }
    }

    public fw0(b bVar, Map<String, Object> map) {
        this(bVar.a(), map);
    }

    public fw0(String str, Map<String, Object> map) {
        map.put("sdk_version", BuildConfigFieldProvider.getVersion());
        this.f20874b = map;
        this.f20873a = str;
    }

    public final Map<String, Object> a() {
        return this.f20874b;
    }

    public final String b() {
        return this.f20873a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fw0.class != obj.getClass()) {
            return false;
        }
        fw0 fw0Var = (fw0) obj;
        if (this.f20873a.equals(fw0Var.f20873a)) {
            return this.f20874b.equals(fw0Var.f20874b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20874b.hashCode() + (this.f20873a.hashCode() * 31);
    }
}
