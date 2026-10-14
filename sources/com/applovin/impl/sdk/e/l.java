package com.applovin.impl.sdk.e;

import android.app.ActivityManager;
import ch.qos.logback.classic.joran.action.ConfigurationAction;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.security.ProviderInstaller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f10584a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f10587d;

    public interface a {
        void a(JSONObject jSONObject);
    }

    public class b extends d {
        public b(com.applovin.impl.sdk.o oVar) {
            super("TaskTimeoutFetchBasicSettings", oVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l.this.f10587d != null) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f10536h.e(this.f10535g, "Timing out fetch basic settings...");
                }
                l.this.a(new JSONObject());
            }
        }
    }

    public l(int i10, com.applovin.impl.sdk.o oVar, a aVar) {
        super("TaskFetchBasicSettings", oVar, true);
        this.f10586c = new Object();
        this.f10585b = i10;
        this.f10587d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        a aVar;
        synchronized (this.f10586c) {
            aVar = this.f10587d;
            this.f10587d = null;
        }
        if (aVar != null) {
            aVar.a(jSONObject);
        }
    }

    private String c() {
        return com.applovin.impl.sdk.utils.i.a((String) this.f10534f.a(com.applovin.impl.sdk.c.b.bf), "5.0/i", d());
    }

    private String h() {
        return com.applovin.impl.sdk.utils.i.a((String) this.f10534f.a(com.applovin.impl.sdk.c.b.bg), "5.0/i", d());
    }

    public Map<String, String> a() {
        HashMap map = new HashMap();
        if (!((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fM)).booleanValue() && !((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fL)).booleanValue()) {
            map.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fx)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f10534f.ax());
        }
        Boolean boolA = com.applovin.impl.b.a.b().a(f());
        if (boolA != null) {
            map.put(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, boolA.toString());
        }
        Boolean boolA2 = com.applovin.impl.b.a.a().a(f());
        if (boolA2 != null) {
            map.put(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, boolA2.toString());
        }
        Boolean boolA3 = com.applovin.impl.b.a.c().a(f());
        if (boolA3 != null) {
            map.put(AppLovinSdkExtraParameterKey.DO_NOT_SELL, boolA3.toString());
        }
        return map;
    }

    public JSONObject b() {
        String str;
        int iB;
        JSONObject jSONObject = new JSONObject();
        try {
            com.applovin.impl.sdk.o oVar = this.f10534f;
            com.applovin.impl.sdk.c.b<Boolean> bVar = com.applovin.impl.sdk.c.b.fL;
            if (((Boolean) oVar.a(bVar)).booleanValue() || ((Boolean) this.f10534f.a(bVar)).booleanValue()) {
                jSONObject.put("rid", UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            jSONObject.put("is_cross_promo", this.f10534f.e());
            jSONObject.put("init_count", this.f10585b);
            jSONObject.put("server_installed_at", this.f10534f.a(com.applovin.impl.sdk.c.b.am));
            if (this.f10534f.aB()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f10534f.C()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.f10534f.a(com.applovin.impl.sdk.c.b.eo));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f10534f.u());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.f10534f.aC());
            jSONObject.put("installed_mediation_adapters", com.applovin.impl.mediation.d.c.a(this.f10534f));
            Map<String, Object> mapE = this.f10534f.M() != null ? this.f10534f.M().e() : this.f10534f.K().h();
            jSONObject.put("package_name", mapE.get("package_name"));
            jSONObject.put("app_version", mapE.get("app_version"));
            jSONObject.put("test_ads", mapE.get("test_ads"));
            jSONObject.put(ConfigurationAction.INTERNAL_DEBUG_ATTR, mapE.get(ConfigurationAction.INTERNAL_DEBUG_ATTR));
            jSONObject.put("tg", mapE.get("tg"));
            jSONObject.put("target_sdk", mapE.get("target_sdk"));
            List<String> initializationAdUnitIds = this.f10534f.ay().getInitializationAdUnitIds();
            if (initializationAdUnitIds != null && initializationAdUnitIds.size() > 0) {
                List<String> listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(initializationAdUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(listRemoveTrimmedEmptyStrings, listRemoveTrimmedEmptyStrings.size()));
            }
            jSONObject.put("IABTCF_TCString", mapE.get("IABTCF_TCString"));
            jSONObject.put("IABTCF_gdprApplies", mapE.get("IABTCF_gdprApplies"));
            Object obj = mapE.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.f10534f.aa().i());
            Map<String, Object> mapG = this.f10534f.M() != null ? this.f10534f.M().g() : this.f10534f.K().b();
            jSONObject.put("platform", mapG.get("platform"));
            jSONObject.put("os", mapG.get("os"));
            jSONObject.put("locale", mapG.get("locale"));
            jSONObject.put("brand", mapG.get("brand"));
            jSONObject.put("brand_name", mapG.get("brand_name"));
            jSONObject.put("hardware", mapG.get("hardware"));
            jSONObject.put("model", mapG.get("model"));
            jSONObject.put("revision", mapG.get("revision"));
            jSONObject.put("is_tablet", mapG.get("is_tablet"));
            jSONObject.put("screen_size_in", mapG.get("screen_size_in"));
            if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.ex)).booleanValue()) {
                jSONObject.put("mtl", this.f10534f.U().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.applovin.impl.sdk.o.au().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            Map<String, String> allData = this.f10534f.t().getAllData();
            if (!allData.isEmpty()) {
                jSONObject.put("targeting_data", new JSONObject(allData));
            }
            if (this.f10534f.M() != null) {
                com.applovin.impl.sdk.utils.d.a aVarD = this.f10534f.L().d();
                jSONObject.put("dnt", aVarD.a());
                jSONObject.put("dnt_code", aVarD.c().a());
                Boolean boolA = com.applovin.impl.b.a.a().a(f());
                if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.ek)).booleanValue() && StringUtils.isValidString(aVarD.b()) && !Boolean.TRUE.equals(boolA)) {
                    jSONObject.put("idfa", aVarD.b());
                }
                com.applovin.impl.sdk.r.b bVarA = this.f10534f.L().a();
                if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.f10366ed)).booleanValue() && bVarA != null && !Boolean.TRUE.equals(boolA)) {
                    jSONObject.put("idfv", bVarA.a());
                    str = "idfv_scope";
                    iB = bVarA.b();
                    jSONObject.put(str, iB);
                }
                return jSONObject;
            }
            com.applovin.impl.sdk.utils.d.a aVarL = this.f10534f.K().l();
            jSONObject.put("dnt", aVarL.a());
            jSONObject.put("dnt_code", aVarL.c().a());
            Boolean boolA2 = com.applovin.impl.b.a.a().a(f());
            if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.ek)).booleanValue() && StringUtils.isValidString(aVarL.b()) && !Boolean.TRUE.equals(boolA2)) {
                jSONObject.put("idfa", aVarL.b());
            }
            com.applovin.impl.sdk.p.a aVarM = this.f10534f.K().m();
            if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.f10366ed)).booleanValue() && aVarM != null && !Boolean.TRUE.equals(boolA2)) {
                jSONObject.put("idfv", aVarM.f11051a);
                str = "idfv_scope";
                iB = aVarM.f11052b;
                jSONObject.put(str, iB);
            }
            return jSONObject;
            String name = this.f10534f.az().getName();
            if (StringUtils.isValidString(name)) {
                jSONObject.put("user_segment_name", StringUtils.encodeUriString(name));
            }
            if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.eg)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f10534f.r());
            }
            if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.ei)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f10534f.s());
            }
            if (this.f10534f.as().a()) {
                jSONObject.put("test_mode", true);
            }
            String strC = this.f10534f.as().c();
            if (StringUtils.isValidString(strC)) {
                jSONObject.put("test_mode_network", strC);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f10534f.ay().getExtraParameters()));
            if (this.f10585b > 1) {
                ArrayService arrayServiceAf = this.f10534f.af();
                if (arrayServiceAf.getIsDirectDownloadEnabled() != null) {
                    jSONObject.put("ah_dd_enabled", arrayServiceAf.getIsDirectDownloadEnabled());
                }
                jSONObject.put("ah_sdk_version_code", arrayServiceAf.getAppHubVersionCode());
                jSONObject.put("ah_random_user_token", StringUtils.emptyIfNull(arrayServiceAf.getRandomUserToken()));
                jSONObject.put("ah_sdk_package_name", StringUtils.emptyIfNull(arrayServiceAf.getAppHubPackageName()));
            }
        } catch (JSONException e10) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "Failed to create JSON body", e10);
            }
            this.f10534f.ag().a(this.f10535g, "createJSONBody", e10);
        }
        return jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!com.applovin.impl.sdk.utils.h.i() && f10584a.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.o.au());
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f10536h.b(this.f10535g, "Cannot update security provider", th);
                }
            }
        }
        Map<String, String> mapA = a();
        com.applovin.impl.sdk.network.c.a aVarC = com.applovin.impl.sdk.network.c.a(this.f10534f).a(c()).c(h()).a(mapA).a(b()).f(((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fX)).booleanValue()).b("POST").a(new JSONObject()).a(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.dF)).intValue()).c(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.dI)).intValue());
        com.applovin.impl.sdk.o oVar = this.f10534f;
        com.applovin.impl.sdk.c.b<Integer> bVar = com.applovin.impl.sdk.c.b.dE;
        com.applovin.impl.sdk.network.c cVarA = aVarC.b(((Integer) oVar.a(bVar)).intValue()).c(((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.dS)).booleanValue()).a(com.applovin.impl.sdk.utils.r.a.a(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.fC)).intValue())).e(true).a();
        this.f10534f.G().a(new b(this.f10534f), r.b.TIMEOUT, ((long) ((Integer) this.f10534f.a(bVar)).intValue()) + 250);
        x<JSONObject> xVar = new x<JSONObject>(cVarA, this.f10534f, g()) { // from class: com.applovin.impl.sdk.e.l.1
            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(int i10, String str, JSONObject jSONObject) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f10536h.e(this.f10535g, "Unable to fetch basic SDK settings: server returned " + i10);
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                l.this.a(jSONObject);
            }

            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(JSONObject jSONObject, int i10) {
                l.this.a(jSONObject);
            }
        };
        xVar.a(com.applovin.impl.sdk.c.b.bf);
        xVar.b(com.applovin.impl.sdk.c.b.bg);
        this.f10534f.G().a((d) xVar);
    }
}
