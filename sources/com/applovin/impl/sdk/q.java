package com.applovin.impl.sdk;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import ch.qos.logback.classic.joran.action.ConfigurationAction;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f11056a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f11058c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f11060e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f11062g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f11057b = o.au();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f11059d = j();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, Object> f11061f = l();

    public q(o oVar) {
        this.f11056a = oVar;
        this.f11058c = oVar.L();
    }

    private void a(Map<String, Object> map) {
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.eD)).booleanValue() && com.applovin.impl.sdk.utils.w.d(this.f11056a)) {
            af.b(this.f11056a);
        }
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.ev)).booleanValue() && !map.containsKey("af")) {
            CollectionUtils.putLongIfValid("af", Long.valueOf(this.f11058c.k()), map);
        }
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.ew)).booleanValue() && !map.containsKey("font")) {
            CollectionUtils.putFloatIfValid("font", Float.valueOf(this.f11058c.l()), map);
        }
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.eC)).booleanValue() && !map.containsKey("sua")) {
            CollectionUtils.putStringIfValid("sua", System.getProperty("http.agent"), map);
        }
        if (!((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.ey)).booleanValue() || map.containsKey("network_restricted")) {
            return;
        }
        CollectionUtils.putBooleanIfValid("network_restricted", Boolean.valueOf(this.f11058c.n()), map);
    }

    private Map<String, String> i() {
        return com.applovin.impl.sdk.utils.w.a(a(null, true, false));
    }

    private Map<String, Object> j() {
        HashMap map = new HashMap(36);
        CollectionUtils.putStringIfValid("kb", this.f11058c.z(), map);
        CollectionUtils.putBooleanIfValid("gy", Boolean.valueOf(this.f11058c.y()), map);
        CollectionUtils.putDoubleIfValid("tz_offset", Double.valueOf(this.f11058c.x()), map);
        CollectionUtils.putLongIfValid("tm", Long.valueOf(this.f11058c.u().d()), map);
        CollectionUtils.putLongIfValid("tds", Long.valueOf(this.f11058c.A()), map);
        CollectionUtils.putStringIfValid("country_code", this.f11058c.q().b(), map);
        CollectionUtils.putStringIfValid("carrier", this.f11058c.q().c(), map);
        CollectionUtils.putStringIfValid("mcc", this.f11058c.q().d(), map);
        CollectionUtils.putStringIfValid("mnc", this.f11058c.q().e(), map);
        CollectionUtils.putIntegerIfValid("adnsd", Integer.valueOf(this.f11058c.t().c()), map);
        CollectionUtils.putIntegerIfValid("dx", Integer.valueOf(this.f11058c.t().a()), map);
        CollectionUtils.putIntegerIfValid("dy", Integer.valueOf(this.f11058c.t().b()), map);
        CollectionUtils.putFloatIfValid("adns", Float.valueOf(this.f11058c.t().f()), map);
        CollectionUtils.putFloatIfValid("xdpi", Float.valueOf(this.f11058c.t().d()), map);
        CollectionUtils.putFloatIfValid("ydpi", Float.valueOf(this.f11058c.t().e()), map);
        CollectionUtils.putDoubleIfValid("screen_size_in", Double.valueOf(this.f11058c.t().g()), map);
        CollectionUtils.putStringIfValid("orientation_lock", this.f11058c.w(), map);
        CollectionUtils.putIntegerIfValid("api_level", Integer.valueOf(Build.VERSION.SDK_INT), map);
        CollectionUtils.putStringIfValid("brand", Build.MANUFACTURER, map);
        CollectionUtils.putStringIfValid("brand_name", Build.BRAND, map);
        CollectionUtils.putStringIfValid("hardware", Build.HARDWARE, map);
        CollectionUtils.putStringIfValid("locale", Locale.getDefault().toString(), map);
        CollectionUtils.putStringIfValid("model", Build.MODEL, map);
        CollectionUtils.putStringIfValid("os", Build.VERSION.RELEASE, map);
        CollectionUtils.putStringIfValid("revision", Build.DEVICE, map);
        CollectionUtils.putStringIfValid("platform", AppLovinSdkUtils.isFireOS(this.f11057b) ? "fireos" : "android", map);
        CollectionUtils.putBooleanIfValid("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()), map);
        CollectionUtils.putBooleanIfValid("aida", Boolean.valueOf(com.applovin.impl.sdk.utils.d.a()), map);
        CollectionUtils.putBooleanIfValid("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f11057b)), map);
        CollectionUtils.putBooleanIfValid("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f11057b)), map);
        CollectionUtils.putLongIfValid("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()), map);
        CollectionUtils.putIntegerIfValid("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()), map);
        a(map);
        return map;
    }

    private Map<String, Object> k() {
        if (!this.f11056a.ay().isLocationCollectionEnabled() || !((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.eU)).booleanValue()) {
            return null;
        }
        HashMap map = new HashMap(4);
        x xVarAe = this.f11056a.ae();
        boolean zB = xVarAe.b();
        CollectionUtils.putBooleanIfValid("loc_services_enabled", Boolean.valueOf(zB), map);
        if (!zB) {
            return map;
        }
        CollectionUtils.putBooleanIfValid("loc_auth", Boolean.valueOf(xVarAe.a()), map);
        if (!this.f11056a.ae().c()) {
            return map;
        }
        double d10 = xVarAe.d();
        o oVar = this.f11056a;
        com.applovin.impl.sdk.c.b<Integer> bVar = com.applovin.impl.sdk.c.b.eW;
        CollectionUtils.putStringIfValid("loc_lat", com.applovin.impl.sdk.utils.w.a(d10, ((Integer) oVar.a(bVar)).intValue()), map);
        CollectionUtils.putStringIfValid("loc_long", com.applovin.impl.sdk.utils.w.a(xVarAe.e(), ((Integer) this.f11056a.a(bVar)).intValue()), map);
        return map;
    }

    private Map<String, Object> l() {
        HashMap map = new HashMap(21);
        CollectionUtils.putStringIfValid("app_name", this.f11058c.B().b(), map);
        CollectionUtils.putStringIfValid("app_version", this.f11058c.B().c(), map);
        CollectionUtils.putStringIfValid("package_name", this.f11058c.B().d(), map);
        CollectionUtils.putStringIfValid("vz", this.f11058c.B().e(), map);
        CollectionUtils.putStringIfValid("installer_name", this.f11058c.B().f(), map);
        CollectionUtils.putIntegerIfValid("app_version_code", Integer.valueOf(this.f11058c.B().i()), map);
        CollectionUtils.putIntegerIfValid("target_sdk", Integer.valueOf(this.f11058c.B().j()), map);
        CollectionUtils.putLongIfValid("first_install_v3_ms", this.f11058c.B().g(), map);
        CollectionUtils.putLongIfValid("ia", Long.valueOf(this.f11058c.B().h()), map);
        CollectionUtils.putLongIfValid("ia_v2", this.f11058c.B().a(), map);
        CollectionUtils.putStringIfValid("tg", com.applovin.impl.sdk.utils.v.a(this.f11056a), map);
        CollectionUtils.putStringIfValid("sdk_version", AppLovinSdk.VERSION, map);
        CollectionUtils.putStringIfValid("omid_sdk_version", this.f11056a.ad().c(), map);
        CollectionUtils.putStringIfValid("api_did", (String) this.f11056a.a(com.applovin.impl.sdk.c.b.f10344ad), map);
        CollectionUtils.putBooleanIfValid(ConfigurationAction.INTERNAL_DEBUG_ATTR, Boolean.valueOf(com.applovin.impl.sdk.utils.w.a(this.f11057b, this.f11056a)), map);
        CollectionUtils.putBooleanIfValid("j8", Boolean.valueOf(o.aw()), map);
        CollectionUtils.putIntegerIfValid("epv", Integer.valueOf(com.applovin.impl.sdk.utils.w.g()), map);
        CollectionUtils.putLongIfValid("alts_ms", Long.valueOf(o.av()), map);
        return map;
    }

    public String a() {
        String strEncodeToString = Base64.encodeToString(new JSONObject(i()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.fz)).booleanValue() ? com.applovin.impl.sdk.utils.r.a(strEncodeToString, com.applovin.impl.sdk.utils.w.a(this.f11056a), com.applovin.impl.sdk.utils.r.a.a(((Integer) this.f11056a.a(com.applovin.impl.sdk.c.b.fA)).intValue()), this.f11056a.ax(), this.f11056a) : strEncodeToString;
    }

    public Map<String, Object> a(Map<String, String> map, boolean z10, boolean z11) {
        HashMap map2;
        Map<String, Object> mapA = a(z10);
        Map<String, Object> mapE = e();
        Map<String, Object> mapD = d();
        Map<String, Object> mapK = k();
        Map<String, String> allData = this.f11056a.t().getAllData();
        Map<String, Object> mapF = f();
        if (z11) {
            map2 = new HashMap(mapF.size() + 19);
            map2.put("device_info", mapA);
            map2.put("app_info", mapE);
            if (mapD != null) {
                map2.put("connection_info", mapD);
            }
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (mapK != null) {
                map2.put("location_info", mapK);
            }
            if (allData != null) {
                map2.put("targeting_data", allData);
            }
        } else {
            HashMap map3 = new HashMap(mapF.size() + allData.size() + mapE.size() + mapA.size() + 14 + (map != null ? map.size() : 0) + (mapK != null ? mapK.size() : 0));
            map3.putAll(mapA);
            map3.putAll(mapE);
            if (mapD != null) {
                map3.putAll(mapD);
            }
            if (map != null) {
                map3.putAll(map);
            }
            if (mapK != null) {
                map3.putAll(mapK);
            }
            if (!allData.isEmpty()) {
                map3.putAll(allData);
            }
            map2 = map3;
        }
        map2.putAll(mapF);
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f11056a.u(), map2);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f11056a.aC(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f11056a.a(com.applovin.impl.sdk.c.b.eo), map2);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f11056a.p()), map2);
        CollectionUtils.putStringIfValid("rid", UUID.randomUUID().toString(), map2);
        if (!((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.fx)).booleanValue()) {
            CollectionUtils.putStringIfValid(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f11056a.ax(), map2);
        }
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.eX)).booleanValue()) {
            com.applovin.impl.sdk.d.g gVarJ = this.f11056a.J();
            CollectionUtils.putLongIfValid("li", Long.valueOf(gVarJ.b(com.applovin.impl.sdk.d.f.f10464b)), map2);
            CollectionUtils.putLongIfValid("si", Long.valueOf(gVarJ.b(com.applovin.impl.sdk.d.f.f10467e)), map2);
            CollectionUtils.putLongIfValid("mad", Long.valueOf(gVarJ.b(com.applovin.impl.sdk.d.f.f10465c)), map2);
            CollectionUtils.putLongIfValid("msad", Long.valueOf(gVarJ.b(com.applovin.impl.sdk.d.f.f10468f)), map2);
            CollectionUtils.putLongIfValid("pf", Long.valueOf(gVarJ.b(com.applovin.impl.sdk.d.f.f10472j)), map2);
            CollectionUtils.putLongIfValid("mpf", Long.valueOf(gVarJ.b(com.applovin.impl.sdk.d.f.f10479q)), map2);
            CollectionUtils.putLongIfValid("gpf", Long.valueOf(gVarJ.b(com.applovin.impl.sdk.d.f.f10473k)), map2);
            CollectionUtils.putLongIfValid("asoac", Long.valueOf(gVarJ.b(com.applovin.impl.sdk.d.f.f10477o)), map2);
        }
        return map2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    public Map<String, Object> a(boolean z10) {
        Map<String, Object> map;
        com.applovin.impl.sdk.utils.d.a aVarD;
        synchronized (this.f11060e) {
            map = CollectionUtils.map(this.f11059d);
        }
        if (z10) {
            aVarD = this.f11058c.b();
            if (aVarD != null) {
                this.f11058c.e();
            } else if (com.applovin.impl.sdk.utils.w.b()) {
                aVarD = new com.applovin.impl.sdk.utils.d.a();
                map.put("inc", Boolean.TRUE);
            } else {
                aVarD = this.f11056a.L().d();
            }
        } else {
            aVarD = this.f11056a.L().d();
        }
        CollectionUtils.putBooleanIfValid(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, com.applovin.impl.b.a.b().a(this.f11057b), map);
        CollectionUtils.putBooleanIfValid(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, com.applovin.impl.b.a.a().a(this.f11057b), map);
        CollectionUtils.putBooleanIfValid(AppLovinSdkExtraParameterKey.DO_NOT_SELL, com.applovin.impl.b.a.c().a(this.f11057b), map);
        CollectionUtils.putBooleanIfValid("dnt", Boolean.valueOf(aVarD.a()), map);
        CollectionUtils.putStringIfValid("dnt_code", aVarD.c().a(), map);
        CollectionUtils.putStringIfValid("idfa", aVarD.b(), map);
        r.b bVarA = this.f11058c.a();
        if (bVarA != null) {
            CollectionUtils.putStringIfValid("idfv", bVarA.a(), map);
            CollectionUtils.putIntegerIfValid("idfv_scope", Integer.valueOf(bVarA.b()), map);
        }
        CollectionUtils.putIntegerIfValid("volume", z10 ? this.f11058c.c() : this.f11058c.r().b(), map);
        CollectionUtils.putIntegerIfValid("lpm", this.f11058c.p().a(), map);
        CollectionUtils.putIntegerIfValid("sb", this.f11058c.j(), map);
        CollectionUtils.putIntegerIfValid("mute_switch", Integer.valueOf(this.f11058c.r().a()), map);
        CollectionUtils.putLongIfValid("fs", this.f11058c.g(), map);
        CollectionUtils.putStringIfValid("network", this.f11058c.f(), map);
        CollectionUtils.putBooleanIfValid("ma", this.f11058c.r().d(), map);
        CollectionUtils.putBooleanIfValid("spo", this.f11058c.r().e(), map);
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.es)).booleanValue()) {
            CollectionUtils.putLongIfValid("fm", this.f11058c.u().a(), map);
            CollectionUtils.putLongIfValid("lmt", this.f11058c.u().b(), map);
            CollectionUtils.putBooleanIfValid("lm", this.f11058c.u().c(), map);
        }
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.et)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("rat", this.f11058c.q().a(), map);
        }
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.eq)).booleanValue()) {
            CollectionUtils.putStringIfValid("so", this.f11058c.r().c(), map);
        }
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.eu)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("vs", Boolean.valueOf(this.f11058c.m()), map);
        }
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.eE)).booleanValue()) {
            CollectionUtils.putFloatIfValid("da", this.f11058c.h(), map);
        }
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.eF)).booleanValue()) {
            CollectionUtils.putFloatIfValid("dm", this.f11058c.i(), map);
        }
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.ep)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("act", this.f11058c.s().b(), map);
            CollectionUtils.putIntegerIfValid("acm", this.f11058c.s().a(), map);
            CollectionUtils.putBooleanIfValid("sowpie", this.f11058c.s().c(), map);
        }
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.eA)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("adr", Boolean.valueOf(this.f11058c.o()), map);
        }
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.ex)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("mtl", Integer.valueOf(this.f11056a.U().getLastTrimMemoryLevel()), map);
        }
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.eD)).booleanValue() && com.applovin.impl.sdk.utils.w.d(this.f11056a)) {
            af.b(this.f11056a);
            CollectionUtils.putStringIfValid("ua", af.a(), map);
        }
        ArrayService arrayServiceAf = this.f11056a.af();
        if (arrayServiceAf.isAppHubInstalled()) {
            if (arrayServiceAf.getIsDirectDownloadEnabled() != null) {
                CollectionUtils.putBooleanIfValid("ah_dd_enabled", arrayServiceAf.getIsDirectDownloadEnabled(), map);
            }
            CollectionUtils.putLongIfValid("ah_sdk_version_code", Long.valueOf(arrayServiceAf.getAppHubVersionCode()), map);
            CollectionUtils.putStringIfValid("ah_random_user_token", StringUtils.emptyIfNull(arrayServiceAf.getRandomUserToken()), map);
            CollectionUtils.putStringIfValid("ah_sdk_package_name", StringUtils.emptyIfNull(arrayServiceAf.getAppHubPackageName()), map);
        }
        return map;
    }

    public Map<String, Object> b() {
        return a(false);
    }

    public void c() {
        synchronized (this.f11060e) {
            a(this.f11059d);
        }
    }

    public Map<String, Object> d() {
        com.applovin.impl.sdk.network.b.c cVarA = this.f11056a.I().a();
        if (cVarA == null) {
            return null;
        }
        HashMap map = new HashMap(4);
        map.put("lrm_ts_ms", String.valueOf(cVarA.a()));
        map.put("lrm_url", cVarA.b());
        map.put("lrm_ct_ms", String.valueOf(cVarA.d()));
        map.put("lrm_rs", String.valueOf(cVarA.c()));
        return map;
    }

    public Map<String, Object> e() {
        Map<String, Object> map;
        synchronized (this.f11062g) {
            map = CollectionUtils.map(this.f11061f);
        }
        CollectionUtils.putBooleanIfValid("first_install", Boolean.valueOf(this.f11056a.aB()), map);
        CollectionUtils.putBooleanIfValid("first_install_v2", Boolean.valueOf(!this.f11056a.C()), map);
        CollectionUtils.putBooleanIfValid("test_ads", Boolean.valueOf(this.f11058c.D()), map);
        CollectionUtils.putBooleanIfValid("muted", Boolean.valueOf(this.f11056a.ay().isMuted()), map);
        CollectionUtils.putStringIfValid("user_segment_name", this.f11056a.az().getName(), map);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.f11058c.C().a(), map);
        Object objB = this.f11058c.C().b();
        if (objB != null) {
            map.put("IABTCF_gdprApplies", objB);
        }
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f11058c.C().c(), map);
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.f10367ee)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f11056a.q(), map);
        }
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.eh)).booleanValue()) {
            CollectionUtils.putStringIfValid("compass_random_token", this.f11056a.r(), map);
        }
        if (((Boolean) this.f11056a.a(com.applovin.impl.sdk.c.b.ej)).booleanValue()) {
            CollectionUtils.putStringIfValid("applovin_random_token", this.f11056a.s(), map);
        }
        return map;
    }

    public Map<String, Object> f() {
        HashMap map = new HashMap(5);
        CollectionUtils.putStringIfValid("sc", (String) this.f11056a.a(com.applovin.impl.sdk.c.b.aj), map);
        CollectionUtils.putStringIfValid("sc2", (String) this.f11056a.a(com.applovin.impl.sdk.c.b.ak), map);
        CollectionUtils.putStringIfValid("sc3", (String) this.f11056a.a(com.applovin.impl.sdk.c.b.al), map);
        CollectionUtils.putStringIfValid("server_installed_at", (String) this.f11056a.a(com.applovin.impl.sdk.c.b.am), map);
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f11056a.a(com.applovin.impl.sdk.c.d.N), map);
        return map;
    }

    public Map<String, Object> g() {
        return this.f11059d;
    }

    public Map<String, Object> h() {
        return this.f11061f;
    }
}
