package com.applovin.impl.sdk.d;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f10485v;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Set<String> f10483u = new HashSet(32);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Set<f> f10484w = new HashSet(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f10463a = a("ad_req");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f10464b = a("ad_imp");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f10465c = a("max_ad_imp");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f10466d = a("ad_session_start");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f10467e = a("ad_imp_session");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f10468f = a("max_ad_imp_session");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f10469g = a("cached_files_expired");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f10470h = a("cache_drop_count");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f10471i = a("sdk_reset_state_count", true);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f10472j = a("ad_response_process_failures", true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f10473k = a("response_process_failures", true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f10474l = a("incent_failed_to_display_count", true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f10475m = a("app_paused_and_resumed");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f10476n = a("ad_rendered_with_mismatched_sdk_key", true);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f10477o = a("ad_shown_outside_app_count");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f10478p = a("med_ad_req");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f f10479q = a("med_ad_response_process_failures", true);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f10480r = a("med_waterfall_ad_no_fill", true);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f10481s = a("med_waterfall_ad_adapter_load_failed", true);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f10482t = a("med_waterfall_ad_invalid_response", true);

    static {
        a("fullscreen_ad_nil_vc_count");
        a("applovin_bundle_missing");
    }

    private f(String str) {
        this.f10485v = str;
    }

    private static f a(String str) {
        return a(str, false);
    }

    private static f a(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        }
        Set<String> set = f10483u;
        if (set.contains(str)) {
            throw new IllegalArgumentException(i.f.a("Key has already been used: ", str));
        }
        set.add(str);
        f fVar = new f(str);
        if (z10) {
            f10484w.add(fVar);
        }
        return fVar;
    }

    public static Set<f> b() {
        return f10484w;
    }

    public String a() {
        return this.f10485v;
    }
}
