package com.applovin.impl.sdk.c;

import ch.qos.logback.core.CoreConstants;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<T> f10410b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d<String> f10386d = new d<>("com.applovin.sdk.impl.isFirstRun", String.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d<Boolean> f10387e = new d<>("com.applovin.sdk.launched_before", Boolean.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d<String> f10388f = new d<>("com.applovin.sdk.latest_installed_version", String.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d<Long> f10389g = new d<>("com.applovin.sdk.install_date", Long.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d<String> f10390h = new d<>("com.applovin.sdk.user_id", String.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d<String> f10391i = new d<>("com.applovin.sdk.compass_id", String.class);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d<String> f10392j = new d<>("com.applovin.sdk.compass_random_token", String.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d<String> f10393k = new d<>("com.applovin.sdk.applovin_random_token", String.class);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d<String> f10394l = new d<>("com.applovin.sdk.device_test_group", String.class);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d<String> f10395m = new d<>("com.applovin.sdk.variables", String.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d<Boolean> f10396n = new d<>("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d<Boolean> f10397o = new d<>("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d<Boolean> f10398p = new d<>("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d<Boolean> f10399q = new d<>("com.applovin.sdk.is_pending_unified_flow_generation", Boolean.class);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d<Boolean> f10400r = new d<>("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d<Boolean> f10401s = new d<>("com.applovin.sdk.been_in_gdpr_region", Boolean.class);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d<Boolean> f10402t = new d<>("com.applovin.sdk.gdpr_flow_advertising_partners_accepted", Boolean.class);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d<Boolean> f10403u = new d<>("com.applovin.sdk.gdpr_flow_analytics_partners_accepted", Boolean.class);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d<Boolean> f10404v = new d<>("com.applovin.sdk.gdpr_flow_privacy_policy_accepted", Boolean.class);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d<Integer> f10405w = new d<>("IABTCF_CmpSdkID", Integer.class);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d<String> f10406x = new d<>("IABTCF_TCString", String.class);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d<?> f10407y = new d<>("IABTCF_gdprApplies", Object.class);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final d<String> f10408z = new d<>("IABTCF_AddtlConsent", String.class);
    public static final d<String> A = new d<>("IABTCF_VendorConsents", String.class);
    public static final d<String> B = new d<>("IABTCF_VendorLegitimateInterests", String.class);
    public static final d<String> C = new d<>("IABTCF_PurposeConsents", String.class);
    public static final d<String> D = new d<>("IABTCF_PurposeLegitimateInterests", String.class);
    public static final d<String> E = new d<>("com.applovin.sdk.stats", String.class);
    public static final d<HashSet> F = new d<>("com.applovin.sdk.task.stats", HashSet.class);
    public static final d<String> G = new d<>("com.applovin.sdk.network_response_code_mapping", String.class);
    public static final d<String> H = new d<>("com.applovin.sdk.event_tracking.super_properties", String.class);
    public static final d<HashSet> I = new d<>("com.applovin.sdk.ad.stats", HashSet.class);
    public static final d<Integer> J = new d<>("com.applovin.sdk.last_video_position", Integer.class);
    public static final d<Boolean> K = new d<>("com.applovin.sdk.should_resume_video", Boolean.class);
    public static final d<String> L = new d<>("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final d<String> M = new d<>("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final d<String> N = new d<>("com.applovin.sdk.persisted_data", String.class);
    public static final d<String> O = new d<>("com.applovin.sdk.mediation_provider", String.class);
    public static final d<Boolean> P = new d<>("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);
    public static final d<String> Q = new d<>("com.applovin.sdk.user_agent", String.class);
    public static final d<String> R = new d<>("com.applovin.sdk.last_os_version_user_agent_collected_for", String.class);
    public static final d<String> S = new d<>("com.taboola.api.user_id", String.class);
    public static final d<Long> T = new d<>("com.taboola.api.user_id_creation_date", Long.class);
    public static final d<Boolean> U = new d<>("com.applovin.impl.sdk.utils.enable_java_8_lambda_expression_feature_test", Boolean.class);
    public static final d<Boolean> V = new d<>("com.applovin.impl.sdk.utils.enable_java_8_method_reference_feature_test", Boolean.class);
    public static final d<Boolean> W = new d<>("com.applovin.impl.sdk.utils.enable_java_8_default_methods_feature_test", Boolean.class);

    public d(String str, Class<T> cls) {
        this.f10409a = str;
        this.f10410b = cls;
    }

    public String a() {
        return this.f10409a;
    }

    public Class<T> b() {
        return this.f10410b;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Key{name='");
        l1.c.a(sbA, this.f10409a, CoreConstants.SINGLE_QUOTE_CHAR, ", type=");
        sbA.append(this.f10410b);
        sbA.append('}');
        return sbA.toString();
    }
}
