package com.applovin.impl.mediation.a;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends f implements MaxAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.applovin.impl.mediation.g f9031a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f9033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f9034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f9035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxAdWaterfallInfo f9036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f9038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f9039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.applovin.mediation.hybridAds.c f9040k;

    public a(int i10, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, o oVar) {
        super(map, jSONObject, jSONObject2, oVar);
        this.f9033d = new AtomicBoolean();
        this.f9034e = new AtomicBoolean();
        this.f9032c = i10;
        this.f9031a = gVar;
        this.f9035f = gVar != null ? gVar.i() : null;
    }

    private long I() {
        return b("load_started_time_ms", 0L);
    }

    public static a a(int i10, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, o oVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat fromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(fromString, "Invalid ad format for string: " + string);
        if (fromString.isAdViewAd()) {
            return new b(i10, map, jSONObject, jSONObject2, oVar);
        }
        if (fromString == MaxAdFormat.NATIVE) {
            return new d(i10, map, jSONObject, jSONObject2, oVar);
        }
        if (fromString.isFullscreenAd()) {
            return new c(i10, map, jSONObject, jSONObject2, oVar);
        }
        throw new IllegalArgumentException(i.f.a("Unsupported ad format: ", string));
    }

    public long A() {
        if (I() > 0) {
            return C() - I();
        }
        return -1L;
    }

    public void B() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public long C() {
        return b("load_completed_time_ms", 0L);
    }

    public void D() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public AtomicBoolean E() {
        return this.f9033d;
    }

    public AtomicBoolean F() {
        return this.f9034e;
    }

    public void G() {
        this.f9031a = null;
        this.f9036g = null;
    }

    public int H() {
        return this.f9032c;
    }

    public abstract a a(com.applovin.impl.mediation.g gVar);

    public String a() {
        return b("bcode", "");
    }

    public void a(long j10) {
        this.f9037h = j10;
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("ad_values")) {
            a(BundleUtils.toJSONObject(bundle.getBundle("ad_values")));
        }
        if (bundle.containsKey("creative_id") && !c("creative_id")) {
            c("creative_id", BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i10 = BundleUtils.getInt("ad_width", bundle);
            int i11 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i10);
            c("ad_height", i11);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            b(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f9036g = maxAdWaterfallInfo;
    }

    public void a(String str) {
        this.f9038i = str;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectF = f();
        JsonUtils.putAll(jSONObjectF, jSONObject);
        a("ad_values", (Object) jSONObjectF);
    }

    public long b() {
        return b("bwt_ms", ((Long) this.f9049b.a(com.applovin.impl.sdk.c.a.X)).longValue());
    }

    public void b(String str) {
        this.f9039j = str;
    }

    public void b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectG = g();
        JsonUtils.putAll(jSONObjectG, jSONObject);
        a("publisher_extra_info", (Object) jSONObjectG);
    }

    public long c() {
        return b("twt_ms", ((Long) this.f9049b.a(com.applovin.impl.sdk.c.a.Y)).longValue());
    }

    public String d() {
        return this.f9038i;
    }

    public double e() {
        return b("price", -1.0f);
    }

    public JSONObject f() {
        return a("ad_values", new JSONObject());
    }

    public JSONObject g() {
        return a("publisher_extra_info", new JSONObject());
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.f9039j;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject jSONObjectF = f();
        if (jSONObjectF.has(str)) {
            return JsonUtils.getString(jSONObjectF, str, str2);
        }
        Bundle bundleAl = al();
        if (bundleAl.containsKey(str)) {
            return bundleAl.getString(str);
        }
        JSONObject jSONObjectG = g();
        return jSONObjectG.has(str) ? JsonUtils.getString(jSONObjectG, str, str2) : b(str, str2);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return b("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return b("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return b("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(b("ad_format", a("ad_format", (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.g gVar = this.f9031a;
        if (gVar != null) {
            return gVar.b();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return b("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(x());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.f9037h;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (!((Boolean) this.f9049b.a(com.applovin.impl.sdk.c.a.U)).booleanValue() || !getFormat().isFullscreenAd() || E().get()) {
            return JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.f9049b.F();
        if (!y.a()) {
            return 0.0d;
        }
        this.f9049b.F().e("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return 0.0d;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        return JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int iB = b("ad_width", -3);
        int iB2 = b("ad_height", -3);
        return (iB == -3 || iB2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(iB, iB2);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f9036g;
    }

    public JSONObject h() {
        return a("revenue_parameters", new JSONObject());
    }

    public String i() {
        return JsonUtils.getString(h(), "revenue_event", "");
    }

    public String j() {
        return a("event_id", "");
    }

    public String k() {
        return b("adomain", (String) null);
    }

    public boolean l() {
        com.applovin.impl.mediation.g gVar = this.f9031a;
        return gVar != null && gVar.f() && this.f9031a.g();
    }

    public com.applovin.impl.mediation.g m() {
        return this.f9031a;
    }

    public String n() {
        return this.f9035f;
    }

    public Bundle o() {
        JSONObject jSONObjectA;
        if (c("credentials")) {
            jSONObjectA = a("credentials", new JSONObject());
        } else {
            jSONObjectA = a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectA, FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, x());
        }
        return JsonUtils.toBundle(jSONObjectA);
    }

    public String p() {
        return b("bid_response", (String) null);
    }

    public boolean q() {
        return StringUtils.isValidString(p());
    }

    public long r() {
        return b("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, al()));
    }

    public boolean s() {
        return b("is_js_tag_ad", Boolean.FALSE).booleanValue();
    }

    public MaxAdFormat t() {
        String strB = b("haf", (String) null);
        if (StringUtils.isValidString(strB)) {
            return MaxAdFormat.formatFromString(strB);
        }
        return null;
    }

    @Override // com.applovin.impl.mediation.a.f
    public String toString() {
        StringBuilder sbA = defpackage.a.a("MediatedAd{thirdPartyAdPlacementId=");
        sbA.append(x());
        sbA.append(", adUnitId=");
        sbA.append(getAdUnitId());
        sbA.append(", format=");
        sbA.append(getFormat().getLabel());
        sbA.append(", networkName='");
        sbA.append(getNetworkName());
        sbA.append("'}");
        return sbA.toString();
    }

    public boolean u() {
        return t() != null;
    }

    public com.applovin.mediation.hybridAds.c v() {
        com.applovin.mediation.hybridAds.c cVar = this.f9040k;
        if (cVar != null) {
            return cVar;
        }
        com.applovin.mediation.hybridAds.c cVar2 = new com.applovin.mediation.hybridAds.c(a("hybrid_ad_config", (JSONObject) null));
        this.f9040k = cVar2;
        return cVar2;
    }

    public View w() {
        com.applovin.impl.mediation.g gVar;
        if (!l() || (gVar = this.f9031a) == null) {
            return null;
        }
        return gVar.a();
    }

    public String x() {
        return b("third_party_ad_placement_id", (String) null);
    }

    public String y() {
        return a("waterfall_name", "");
    }

    public String z() {
        return a("waterfall_test_name", "");
    }
}
