package com.applovin.impl.mediation.c;

import android.content.Context;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.e.x;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.impl.sdk.z;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.applovin.impl.sdk.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxAdFormat f9301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f9302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f9303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, Object> f9304e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final JSONArray f9305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f9306j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.applovin.impl.mediation.ads.a.InterfaceC0121a f9307k;

    public c(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, JSONArray jSONArray, Context context, o oVar, com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
        super("TaskFetchMediatedAd", oVar, str);
        this.f9300a = str;
        this.f9301b = maxAdFormat;
        this.f9302c = map;
        this.f9303d = map2;
        this.f9304e = map3;
        this.f9305i = jSONArray;
        this.f9306j = context;
        this.f9307k = interfaceC0121a;
    }

    private String a() {
        return com.applovin.impl.mediation.d.b.a(this.f10534f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        MaxErrorImpl maxErrorImpl;
        if (y.a()) {
            y yVar = this.f10536h;
            String str2 = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Unable to fetch ad for ad unit ");
            sbA.append(this.f9300a);
            sbA.append(": server returned ");
            sbA.append(i10);
            yVar.e(str2, sbA.toString());
        }
        if (i10 == -800) {
            this.f10534f.J().a(com.applovin.impl.sdk.d.f.f10479q);
        }
        if (i10 == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str);
        } else if (i10 == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str);
        } else {
            maxErrorImpl = StringUtils.isValidString(str) ? new MaxErrorImpl(MaxErrorCode.NETWORK_ERROR, str) : new MaxErrorImpl(-1);
        }
        com.applovin.impl.sdk.utils.o.a(this.f9307k, this.f9300a, maxErrorImpl);
    }

    private void a(com.applovin.impl.sdk.d.g gVar) {
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f10466d;
        long jB = gVar.b(fVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jB > TimeUnit.MINUTES.toMillis(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.dV)).intValue())) {
            gVar.b(fVar, jCurrentTimeMillis);
            gVar.c(com.applovin.impl.sdk.d.f.f10467e);
            gVar.c(com.applovin.impl.sdk.d.f.f10468f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            i.e(jSONObject, this.f10534f);
            i.d(jSONObject, this.f10534f);
            i.f(jSONObject, this.f10534f);
            i.g(jSONObject, this.f10534f);
            com.applovin.impl.mediation.d.b.a(jSONObject, this.f10534f);
            com.applovin.impl.mediation.d.b.b(jSONObject, this.f10534f);
            com.applovin.impl.mediation.d.b.c(jSONObject, this.f10534f);
            com.applovin.impl.mediation.d.b.a(jSONObject);
            com.applovin.impl.sdk.g.a(this.f10534f);
            MaxAdFormat fromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            if (this.f9301b != fromString) {
                String label = fromString != null ? fromString.getLabel() : "UNKNOWN";
                y.j(this.f10535g, "Ad format requested (" + this.f9301b.getLabel() + ") does not match ad format for ad unit id " + this.f9300a + " (" + label + ")");
            }
            this.f10534f.G().a(b(jSONObject));
        } catch (Throwable th) {
            if (y.a()) {
                y yVar = this.f10536h;
                String str = this.f10535g;
                StringBuilder sbA = defpackage.a.a("Unable to process mediated ad response for ad unit ");
                sbA.append(this.f9300a);
                yVar.b(str, sbA.toString(), th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private com.applovin.impl.sdk.e.d b(JSONObject jSONObject) {
        return this.f10534f.a(com.applovin.impl.sdk.c.a.W, this.f9301b) ? new e(this.f9300a, this.f9301b, this.f9302c, jSONObject, this.f9306j, this.f10534f, this.f9307k) : new f(this.f9300a, this.f9301b, this.f9302c, jSONObject, this.f9306j, this.f10534f, this.f9307k);
    }

    private String b() {
        return com.applovin.impl.mediation.d.b.b(this.f10534f);
    }

    private Map<String, String> c() {
        HashMap map = new HashMap(2);
        map.put("AppLovin-Ad-Unit-Id", this.f9300a);
        map.put("AppLovin-Ad-Format", this.f9301b.getLabel());
        return map;
    }

    private void c(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray((Collection) this.f10534f.ak().c()));
            jSONObject2.put("installed", com.applovin.impl.mediation.d.c.a(this.f10534f));
            jSONObject2.put("initialized", this.f10534f.al().c());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f10534f.al().b().keySet()));
            jSONObject2.put("loaded_classnames", new JSONArray((Collection) this.f10534f.ak().a()));
            jSONObject2.put("failed_classnames", new JSONArray((Collection) this.f10534f.ak().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e10) {
            if (y.a()) {
                this.f10536h.b(this.f10535g, "Failed to populate adapter classNames", e10);
            }
            throw new RuntimeException("Failed to populate classNames: " + e10);
        }
    }

    private void d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f9305i;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.f9300a);
        jSONObject2.put("ad_format", this.f9301b.getLabel());
        Map map = CollectionUtils.map(this.f9303d);
        z.a aVarA = this.f10534f.aq().a(this.f9300a);
        if (aVarA != null) {
            if (Boolean.parseBoolean(this.f10534f.ay().getExtraParameters().get(AppLovinSdkExtraParameterKey.ENABLE_SEQUENTIAL_CACHING))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", aVarA.b());
                map.put("previous_winning_network_name", aVarA.c());
                CollectionUtils.putStringIfValid("second_previous_winning_network", aVarA.d(), map);
                CollectionUtils.putStringIfValid("second_previous_winning_network_name", aVarA.e(), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f10534f.am().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !w.g(o.au())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f10534f.ay().getExtraParameters()));
    }

    private JSONObject h() throws JSONException {
        Map<String, Object> mapA = this.f10534f.M() != null ? this.f10534f.M().a(null, false, true) : this.f10534f.K().a(null, false, true);
        mapA.putAll(this.f9304e);
        JSONObject jSONObject = new JSONObject(mapA);
        e(jSONObject);
        d(jSONObject);
        c(jSONObject);
        f(jSONObject);
        g(jSONObject);
        return jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (y.a()) {
            y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Fetching next ad for ");
            sbA.append(this.f9301b.getLabel());
            sbA.append(" ad unit ");
            sbA.append(this.f9300a);
            yVar.b(str, sbA.toString());
        }
        com.applovin.impl.sdk.w.a();
        if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.eu)).booleanValue() && w.d() && y.a()) {
            this.f10536h.b(this.f10535g, "User is connected to a VPN");
        }
        com.applovin.impl.sdk.d.g gVarJ = this.f10534f.J();
        gVarJ.a(com.applovin.impl.sdk.d.f.f10478p);
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f10466d;
        if (gVarJ.b(fVar) == 0) {
            gVarJ.b(fVar, System.currentTimeMillis());
        }
        try {
            JSONObject jSONObjectH = h();
            HashMap map = new HashMap();
            if (!((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fN)).booleanValue() && !((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fL)).booleanValue()) {
                map.put("rid", UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fx)).booleanValue()) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f10534f.ax());
            }
            if (this.f10534f.as().a()) {
                map.put("test_mode", "1");
            }
            String strC = this.f10534f.as().c();
            String str2 = this.f10534f.ay().getExtraParameters().get(AppLovinSdkExtraParameterKey.FILTER_AD_NETWORK);
            if (StringUtils.isValidString(strC)) {
                map.put("filter_ad_network", strC);
                if (!this.f10534f.as().a()) {
                    map.put("fhkZsVqYC7", "1");
                }
                if (this.f10534f.as().b()) {
                    map.put("force_ad_network", strC);
                }
            } else if (StringUtils.isValidString(str2)) {
                map.put("filter_ad_network", str2);
            }
            a(gVarJ);
            x<JSONObject> xVar = new x<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f10534f).b("POST").b(c()).a(a()).c(b()).a((Map<String, String>) map).a(jSONObjectH).f(((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.a.f10315aa)).booleanValue()).a(new JSONObject()).b(((Long) this.f10534f.a(com.applovin.impl.sdk.c.a.f10321f)).intValue()).a(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.dz)).intValue()).c(((Long) this.f10534f.a(com.applovin.impl.sdk.c.a.f10320e)).intValue()).a(r.a.a(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.fD)).intValue())).e(true).a(), this.f10534f) { // from class: com.applovin.impl.mediation.c.c.1
                @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
                public void a(int i10, String str3, JSONObject jSONObject) {
                    c.this.a(i10, str3);
                }

                @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
                public void a(JSONObject jSONObject, int i10) {
                    if (i10 != 200) {
                        c.this.a(i10, (String) null);
                        return;
                    }
                    JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f10669e.a());
                    JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f10669e.b());
                    c.this.a(jSONObject);
                }
            };
            xVar.a(com.applovin.impl.sdk.c.a.f10318c);
            xVar.b(com.applovin.impl.sdk.c.a.f10319d);
            this.f10534f.G().a((com.applovin.impl.sdk.e.d) xVar);
        } catch (Throwable th) {
            if (y.a()) {
                y yVar2 = this.f10536h;
                String str3 = this.f10535g;
                StringBuilder sbA2 = defpackage.a.a("Unable to fetch ad for ad unit ");
                sbA2.append(this.f9300a);
                yVar2.b(str3, sbA2.toString(), th);
            }
            throw new RuntimeException("Unable to fetch ad: " + th);
        }
    }
}
