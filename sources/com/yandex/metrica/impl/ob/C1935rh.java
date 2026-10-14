package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.rh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1935rh implements InterfaceC1836nh<C1761kh> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1711ih f17247a;

    public C1935rh(C1711ih c1711ih) {
        this.f17247a = c1711ih;
    }

    private void a(Uri.Builder builder, C1532bc c1532bc, String str) {
        if (c1532bc.a()) {
            builder.appendQueryParameter(this.f17247a.a(str), c1532bc.f15827a.f15739b);
        } else {
            builder.appendQueryParameter(this.f17247a.a(str), "");
        }
    }

    public void a(Uri.Builder builder, C1761kh c1761kh) {
        String str;
        Fg fgA;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f17247a.a("deviceid"), c1761kh.g());
        builder.appendQueryParameter(this.f17247a.a("deviceid2"), c1761kh.h());
        M2 m2V = P0.i().v();
        C1657gc c1657gcA = c1761kh.a();
        if (m2V.c()) {
            builder.appendQueryParameter(this.f17247a.a("adv_id"), "");
            builder.appendQueryParameter(this.f17247a.a("oaid"), "");
            builder.appendQueryParameter(this.f17247a.a("yandex_adv_id"), "");
        } else {
            a(builder, c1657gcA.a(), "adv_id");
            a(builder, c1657gcA.b(), "oaid");
            a(builder, c1657gcA.c(), "yandex_adv_id");
        }
        builder.appendQueryParameter(this.f17247a.a("app_set_id"), c1761kh.d());
        builder.appendQueryParameter(this.f17247a.a("app_set_id_scope"), c1761kh.e());
        builder.appendQueryParameter(this.f17247a.a("app_platform"), "android");
        builder.appendQueryParameter(this.f17247a.a("protocol_version"), "2");
        builder.appendQueryParameter(this.f17247a.a("analytics_sdk_version_name"), "5.0.0");
        builder.appendQueryParameter(this.f17247a.a("model"), c1761kh.n());
        builder.appendQueryParameter(this.f17247a.a("manufacturer"), c1761kh.m());
        builder.appendQueryParameter(this.f17247a.a("os_version"), c1761kh.p());
        builder.appendQueryParameter(this.f17247a.a("screen_width"), String.valueOf(c1761kh.v()));
        builder.appendQueryParameter(this.f17247a.a("screen_height"), String.valueOf(c1761kh.u()));
        builder.appendQueryParameter(this.f17247a.a("screen_dpi"), String.valueOf(c1761kh.t()));
        builder.appendQueryParameter(this.f17247a.a("scalefactor"), String.valueOf(c1761kh.s()));
        builder.appendQueryParameter(this.f17247a.a("locale"), c1761kh.l());
        builder.appendQueryParameter(this.f17247a.a("device_type"), c1761kh.j());
        builder.appendQueryParameter(this.f17247a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("query_hosts"), String.valueOf(2));
        String strA = this.f17247a.a("features");
        String[] strArr = {this.f17247a.a("easy_collecting"), this.f17247a.a("egress"), this.f17247a.a("package_info"), this.f17247a.a("socket"), this.f17247a.a("permissions_collecting"), this.f17247a.a("features_collecting"), this.f17247a.a("location_collecting"), this.f17247a.a("wakeup"), this.f17247a.a("lbs_collecting"), this.f17247a.a("google_aid"), this.f17247a.a("huawei_oaid"), this.f17247a.a("throttling"), this.f17247a.a("wifi_around"), this.f17247a.a("wifi_connected"), this.f17247a.a("cells_around"), this.f17247a.a("sim_info"), this.f17247a.a("sdk_list"), this.f17247a.a("identity_light_collecting"), this.f17247a.a("gpl_collecting"), this.f17247a.a("ui_parsing"), this.f17247a.a("ui_collecting_for_bridge"), this.f17247a.a("ui_event_sending"), this.f17247a.a("ui_raw_event_sending"), this.f17247a.a("cell_additional_info"), this.f17247a.a("cell_additional_info_connected_only"), this.f17247a.a("ssl_pinning")};
        int i10 = O2.f14603a;
        builder.appendQueryParameter(strA, TextUtils.join(",", strArr));
        builder.appendQueryParameter(this.f17247a.a("socket"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("app_id"), c1761kh.q());
        builder.appendQueryParameter(this.f17247a.a("location_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("app_debuggable"), c1761kh.A());
        builder.appendQueryParameter(this.f17247a.a("sdk_list"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("wakeup"), String.valueOf(1));
        if (c1761kh.M()) {
            String strE = c1761kh.E();
            if (!TextUtils.isEmpty(strE)) {
                builder.appendQueryParameter(this.f17247a.a("country_init"), strE);
            }
        } else {
            builder.appendQueryParameter(this.f17247a.a("detect_locale"), String.valueOf(1));
        }
        P3.a aVarC = c1761kh.C();
        if (!U2.b(aVarC.b())) {
            builder.appendQueryParameter(this.f17247a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f17247a.a("clids_set"), C2120ym.c(aVarC.b()));
            int iOrdinal = aVarC.a().ordinal();
            if (iOrdinal == 1) {
                str = "api";
            } else if (iOrdinal != 2) {
                str = iOrdinal != 3 ? "" : "retail";
            } else {
                str = "satellite";
            }
            builder.appendQueryParameter(this.f17247a.a("clids_set_source"), str);
            String strF = c1761kh.F();
            String strG = c1761kh.G();
            if (TextUtils.isEmpty(strF) && (fgA = c1761kh.I().a()) != null) {
                strF = fgA.f14000a;
                strG = fgA.f14003d.f14008a;
            }
            if (!TextUtils.isEmpty(strF)) {
                builder.appendQueryParameter(this.f17247a.a("install_referrer"), strF);
                if (strG == null) {
                    strG = "null";
                }
                builder.appendQueryParameter(this.f17247a.a("install_referrer_source"), strG);
            }
        }
        String strX = c1761kh.x();
        if (!TextUtils.isEmpty(strX)) {
            builder.appendQueryParameter(this.f17247a.a("uuid"), strX);
        }
        builder.appendQueryParameter(this.f17247a.a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("requests"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("permissions"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("identity_light_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("ui_parsing"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("ui_collecting_for_bridge"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("ui_event_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("ui_raw_event_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("throttling"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("mediascope_api_keys"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("diagnostics"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("app_system_flag"), c1761kh.B());
        builder.appendQueryParameter(this.f17247a.a("auto_inapp_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("easy_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("egress"), String.valueOf(1));
        builder.appendQueryParameter(this.f17247a.a("startup_update"), String.valueOf(1));
    }
}
