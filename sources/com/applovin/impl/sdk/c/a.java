package com.applovin.impl.sdk.c;

import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.w;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class a<T> extends b<T> {
    public static final b<Boolean> A;
    public static final b<Boolean> B;
    public static final b<Long> C;
    public static final b<Long> D;
    public static final b<Boolean> E;
    public static final b<Long> F;
    public static final b<Long> G;
    public static final b<Boolean> H;
    public static final b<Long> I;
    public static final b<Boolean> J;
    public static final b<Integer> K;
    public static final b<String> L;
    public static final b<String> M;
    public static final b<Integer> N;
    public static final b<String> O;
    public static final b<Boolean> P;
    public static final b<Boolean> Q;
    public static final b<Boolean> R;
    public static final b<Boolean> S;
    public static final b<Boolean> T;
    public static final b<Boolean> U;
    public static final b<Boolean> V;
    public static final b<String> W;
    public static final b<Long> X;
    public static final b<Long> Y;
    public static final b<Long> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b<String> f10314a = b.a("afi", "");

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    public static final b<Boolean> f10315aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final b<Boolean> f10316ab;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b<Long> f10317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b<String> f10318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b<String> f10319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b<Long> f10320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b<Long> f10321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b<Long> f10322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b<Boolean> f10323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b<String> f10324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b<Long> f10325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b<Long> f10326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b<Long> f10327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b<Long> f10328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b<String> f10329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b<Long> f10330o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b<Boolean> f10331p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b<Boolean> f10332q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b<Boolean> f10333r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b<Boolean> f10334s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b<Boolean> f10335t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b<Long> f10336u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b<Boolean> f10337v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b<Long> f10338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b<Long> f10339x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b<Boolean> f10340y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b<Boolean> f10341z;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f10317b = f.a(timeUnit, 5L, "afi_ms");
        f10318c = b.a("mediation_endpoint", "https://ms.applovin.com/");
        f10319d = b.a("mediation_backup_endpoint", "https://ms.applvn.com/");
        f10320e = f.a(timeUnit, 2L, "fetch_next_ad_retry_delay_ms");
        f10321f = f.a(timeUnit, 5L, "fetch_next_ad_timeout_ms");
        f10322g = f.a(timeUnit, 7L, "fetch_mediation_debugger_info_timeout_ms");
        Boolean bool = Boolean.TRUE;
        f10323h = b.a("auto_init_mediation_debugger", bool);
        f10324i = b.a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");
        f10325j = f.a(timeUnit, 30L, "max_signal_provider_latency_ms");
        f10326k = f.a(timeUnit, 10L, "default_adapter_timeout_ms");
        f10327l = f.a(timeUnit, 30L, "ad_refresh_ms");
        f10328m = f.a(timeUnit, 30L, "ad_load_failure_refresh_ms");
        f10329n = b.a("ad_load_failure_refresh_ignore_error_codes", "204");
        f10330o = b.a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
        f10331p = b.a("refresh_ad_view_timer_responds_to_background", bool);
        f10332q = b.a("refresh_ad_view_timer_responds_to_store_kit", bool);
        Boolean bool2 = Boolean.FALSE;
        f10333r = b.a("refresh_ad_view_timer_responds_to_window_visibility_changed", bool2);
        f10334s = b.a("avrsponse", bool2);
        f10335t = b.a(AppLovinSdkExtraParameterKey.ALLOW_IMMEDIATE_AUTO_REFRESH_PAUSE, bool2);
        f10336u = b.a("fullscreen_display_delay_ms", 600L);
        f10337v = b.a("susaode", bool2);
        f10338w = b.a("ahdm", 500L);
        f10339x = b.a("ad_view_refresh_precache_request_viewability_undesired_flags", 246L);
        f10340y = b.a("ad_view_refresh_precache_request_enabled", bool);
        f10341z = b.a("fullscreen_ads_block_publisher_load_if_another_showing", bool);
        A = b.a("fabsina", bool2);
        B = b.a("fabsiaif", bool2);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        C = f.a(timeUnit2, 4L, "ad_expiration_ms");
        D = f.a(timeUnit2, 4L, "native_ad_expiration_ms");
        E = b.a("rena", bool);
        F = b.a("fullscreen_ad_displayed_timeout_ms", -1L);
        G = b.a("ad_hidden_timeout_ms", -1L);
        H = b.a("schedule_ad_hidden_on_ad_dismiss", bool2);
        I = f.a(timeUnit, 1L, "ad_hidden_on_ad_dismiss_callback_delay_ms");
        J = b.a("proe", bool2);
        K = b.a("mute_state", 2);
        L = b.a("saf", "");
        M = b.a("saui", "");
        N = b.a("mra", -1);
        O = b.a("mra_af", "INTER,REWARDED,REWARDED_INTER,BANNER,LEADER,MREC");
        P = b.a("sai", bool2);
        Q = b.a("init_adapter_for_sc", bool);
        R = b.a("init_adapter_for_al", bool);
        S = b.a("fadiafase", bool);
        T = b.a("fadwvcv", bool);
        U = b.a("bfarud", bool2);
        V = b.a("inacc", Boolean.valueOf(w.b((List<String>) Arrays.asList("com.textmeinc.textme", "com.textmeinc.freetone", "com.textmeinc.textme3", "com.jaumo", "com.jaumo.casual", "com.pinkapp", "com.jaumo.mature", "com.jaumo.prime", "com.jaumo.gay", "com.jaumo.lesbian"))));
        W = b.a("pbataipaf", "");
        X = f.a(timeUnit, 30L, "bwt_ms");
        Y = f.a(timeUnit, 30L, "twt_ms");
        Z = b.a("adiets_sec", Long.valueOf(TimeUnit.MINUTES.toSeconds(1L)));
        f10315aa = b.a("fetch_mediated_ad_gzip", bool2);
        f10316ab = b.a("max_postback_gzip", bool2);
    }
}
