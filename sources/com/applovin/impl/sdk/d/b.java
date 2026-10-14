package com.applovin.impl.sdk.d;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final b A;
    public static final b B;
    public static final b C;
    private static final Set<String> F = new HashSet(32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f10424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f10425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f10426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f10427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f10428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f10429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f10430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f10431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f10432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f10433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f10434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f10435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f10436m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f10437n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f10438o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f10439p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f10440q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f10441r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f10442s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f10443t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f10444u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f10445v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f10446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f10447x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f10448y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f10449z;
    private final String D;
    private final String E;

    static {
        a("sisw", "IS_STREAMING_WEBKIT");
        a("surw", "UNABLE_TO_RETRIEVE_WEBKIT_HTML_STRING");
        a("surp", "UNABLE_TO_PERSIST_WEBKIT_HTML_PLACEMENT_REPLACED_STRING");
        a("swhp", "SUCCESSFULLY_PERSISTED_WEBKIT_HTML_STRING");
        a("skr", "STOREKIT_REDIRECTED");
        a("sklf", "STOREKIT_LOAD_FAILURE");
        a("skps", "STOREKIT_PRELOAD_SKIPPED");
        f10424a = a("sas", "AD_SOURCE");
        f10425b = a("srt", "AD_RENDER_TIME");
        f10426c = a("sft", "AD_FETCH_TIME");
        f10427d = a("sfs", "AD_FETCH_SIZE");
        f10428e = a("sadb", "AD_DOWNLOADED_BYTES");
        f10429f = a("sacb", "AD_CACHED_BYTES");
        f10430g = a("stdl", "TIME_TO_DISPLAY_FROM_LOAD");
        f10431h = a("stdi", "TIME_TO_DISPLAY_FROM_INIT");
        f10432i = a("snas", "AD_NUMBER_IN_SESSION");
        f10433j = a("snat", "AD_NUMBER_TOTAL");
        f10434k = a("stah", "TIME_AD_HIDDEN_FROM_SHOW");
        f10435l = a("stas", "TIME_TO_SKIP_FROM_SHOW");
        f10436m = a("stac", "TIME_TO_CLICK_FROM_SHOW");
        f10437n = a("stbe", "TIME_TO_EXPAND_FROM_SHOW");
        f10438o = a("stbc", "TIME_TO_CONTRACT_FROM_SHOW");
        f10439p = a("suvs", "INTERSTITIAL_USED_VIDEO_STREAM");
        f10440q = a("sugs", "AD_USED_GRAPHIC_STREAM");
        f10441r = a("svpv", "INTERSTITIAL_VIDEO_PERCENT_VIEWED");
        f10442s = a("stpd", "INTERSTITIAL_PAUSED_DURATION");
        f10443t = a("shsc", "HTML_RESOURCE_CACHE_SUCCESS_COUNT");
        f10444u = a("shfc", "HTML_RESOURCE_CACHE_FAILURE_COUNT");
        f10445v = a("schc", "AD_CANCELLED_HTML_CACHING");
        f10446w = a("smwm", "AD_SHOWN_IN_MULTIWINDOW_MODE");
        f10447x = a("vssc", "VIDEO_STREAM_STALLED_COUNT");
        f10448y = a("wvem", "WEB_VIEW_ERROR_MESSAGES");
        f10449z = a("wvhec", "WEB_VIEW_HTTP_ERROR_COUNT");
        A = a("wvrec", "WEB_VIEW_RENDER_ERROR_COUNT");
        B = a("wvsem", "WEB_VIEW_SSL_ERROR_MESSAGES");
        C = a("wvruc", "WEB_VIEW_RENDERER_UNRESPONSIVE_COUNT");
    }

    private b(String str, String str2) {
        this.D = str;
        this.E = str2;
    }

    private static b a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        }
        Set<String> set = F;
        if (set.contains(str)) {
            throw new IllegalArgumentException(i.f.a("Key has already been used: ", str));
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("No debug name specified");
        }
        set.add(str);
        return new b(str, str2);
    }
}
