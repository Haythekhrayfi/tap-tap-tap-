package com.applovin.impl.sdk.ad;

import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.adview.j;
import com.applovin.impl.adview.u;
import com.applovin.impl.adview.y;
import com.applovin.impl.sdk.af;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.developer.filepicker.model.DialogConfigs;
import com.google.android.gms.common.internal.ImagesContract;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends AppLovinAdImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Uri> f10218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f10219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f10220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference<com.applovin.impl.sdk.b.c> f10221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<com.applovin.impl.sdk.d.a> f10222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<com.applovin.impl.sdk.d.a> f10223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<com.applovin.impl.sdk.d.a> f10224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<com.applovin.impl.sdk.d.a> f10225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f10226i;

    public enum a {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    public enum b {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f10239e;

        private c() {
            this.f10235a = AppLovinSdkUtils.dpToPx(o.au(), e.this.ad());
            this.f10236b = AppLovinSdkUtils.dpToPx(o.au(), e.this.ae());
            this.f10237c = AppLovinSdkUtils.dpToPx(o.au(), e.this.af());
            this.f10238d = AppLovinSdkUtils.dpToPx(o.au(), ((Integer) e.this.sdk.a(com.applovin.impl.sdk.c.b.bY)).intValue());
            this.f10239e = AppLovinSdkUtils.dpToPx(o.au(), ((Integer) e.this.sdk.a(com.applovin.impl.sdk.c.b.bX)).intValue());
        }
    }

    public enum d {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public e(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, o oVar) {
        super(jSONObject, jSONObject2, bVar, oVar);
        this.f10218a = CollectionUtils.synchronizedList();
        this.f10219b = new AtomicBoolean();
        this.f10220c = new AtomicBoolean();
        this.f10221d = new AtomicReference<>();
    }

    private j.a b(boolean z10) {
        return z10 ? j.a.WHITE_ON_TRANSPARENT : j.a.WHITE_ON_BLACK;
    }

    private String b(PointF pointF, boolean z10, boolean z11) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map<String, String> mapC = c(pointF, z10, z11);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, mapC);
        }
        return null;
    }

    private List<Integer> b() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    private String c() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    private Map<String, String> c(PointF pointF, boolean z10, boolean z11) {
        Point pointA = com.applovin.impl.sdk.utils.h.a(o.au());
        HashMap map = new HashMap(7);
        map.put("{CLCODE}", getClCode());
        map.put("{CLICK_X}", String.valueOf(pointF.x));
        map.put("{CLICK_Y}", String.valueOf(pointF.y));
        map.put("{SCREEN_WIDTH}", String.valueOf(pointA.x));
        map.put("{SCREEN_HEIGHT}", String.valueOf(pointA.y));
        map.put("{IS_VIDEO_CLICK}", String.valueOf(z10));
        map.put("{IS_INSTALL}", String.valueOf(z11));
        return map;
    }

    public boolean A() {
        return getBooleanFromAdObject("html_resources_cached", Boolean.FALSE);
    }

    public List<Uri> B() {
        return this.f10218a;
    }

    public String C() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("video_button_properties", null);
        return jsonObjectFromAdObject != null ? JsonUtils.getString(jsonObjectFromAdObject, "video_button_html", "") : "";
    }

    public u D() {
        return new u(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    public boolean E() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    public boolean F() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public boolean G() {
        return getBooleanFromAdObject("bvde", (Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.gv));
    }

    public int H() {
        return getIntFromAdObject("countdown_length", 0);
    }

    public int I() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    public a J() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return a.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return a.DO_NOT_DISMISS;
            }
        }
        return a.UNSPECIFIED;
    }

    public List<String> K() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public List<String> L() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : this.sdk.b(com.applovin.impl.sdk.c.b.bE);
    }

    public boolean M() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    public boolean N() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    public String O() {
        return getStringFromAdObject("cache_prefix", null);
    }

    public boolean P() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    public String Q() {
        return getStringFromFullResponse("event_id", null);
    }

    public boolean R() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public int S() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public int T() {
        int iA;
        synchronized (this.adObjectLock) {
            iA = w.a(this.adObject);
        }
        return iA;
    }

    public int U() {
        synchronized (this.adObjectLock) {
            int i10 = JsonUtils.getInt(this.adObject, "graphic_completion_percent", -1);
            if (i10 < 0 || i10 > 100) {
                return 90;
            }
            return i10;
        }
    }

    public int V() {
        return getColorFromAdObject("postitial_progress_bar_color", -922746881);
    }

    public long W() {
        return getLongFromAdObject("postitial_progress_bar_total_ms", -1L);
    }

    public int X() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public int Y() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public boolean Z() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public j.a a(int i10) {
        if (i10 == 1) {
            return j.a.WHITE_ON_TRANSPARENT;
        }
        if (i10 == 2) {
            return j.a.INVISIBLE;
        }
        return i10 == 3 ? j.a.TRANSPARENT_SKIP : j.a.WHITE_ON_BLACK;
    }

    public List<com.applovin.impl.sdk.d.a> a(PointF pointF, boolean z10) {
        List<com.applovin.impl.sdk.d.a> listA;
        synchronized (this.adObjectLock) {
            listA = w.a("video_click_tracking_urls", this.adObject, c(pointF, true, z10), null, az(), z(), this.sdk);
        }
        return listA.isEmpty() ? a(pointF, true, z10) : listA;
    }

    public List<com.applovin.impl.sdk.d.a> a(PointF pointF, boolean z10, boolean z11) {
        List<com.applovin.impl.sdk.d.a> listA;
        synchronized (this.adObjectLock) {
            listA = w.a("click_tracking_urls", this.adObject, c(pointF, z10, z11), b(pointF, z10, z11), az(), z(), this.sdk);
        }
        return listA;
    }

    public abstract void a();

    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.f10221d.set(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.adObjectLock     // Catch: java.lang.Throwable -> Lf
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Lf
            org.json.JSONObject r1 = r3.adObject     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = "html_resources_cached"
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            goto Lf
        Lc:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r4     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.ad.e.a(boolean):void");
    }

    public boolean aA() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public String aB() {
        String stringFromAdObject = getStringFromAdObject("base_url", DialogConfigs.DIRECTORY_SEPERATOR);
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    public boolean aC() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.valueOf("com.applovin.apps.test.playables".equals(o.au().getPackageName())));
    }

    public y aD() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new y(jsonObjectFromAdObject);
        }
        return null;
    }

    public int aE() {
        int i10;
        if (w.a(getSize())) {
            i10 = 1;
        } else {
            i10 = ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.gn)).booleanValue() ? 0 : -1;
        }
        return getIntFromAdObject("whalt", i10);
    }

    public List<String> aF() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public List<String> aG() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public Uri aH() {
        String stringFromAdObject = getStringFromAdObject("play_image", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public Uri aI() {
        String stringFromAdObject = getStringFromAdObject("pause_image", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public Uri aJ() {
        String stringFromAdObject = getStringFromAdObject("mute_image", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public Uri aK() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean aL() {
        return this.f10220c.get();
    }

    public void aM() {
        this.f10220c.set(true);
    }

    public com.applovin.impl.sdk.b.c aN() {
        return this.f10221d.getAndSet(null);
    }

    public boolean aO() {
        String str = this.sdk.ay().getExtraParameters().get(AppLovinSdkExtraParameterKey.SHOULD_USE_EXOPLAYER);
        return StringUtils.isValidString(str) ? Boolean.parseBoolean(str) : getBooleanFromAdObject("suep", Boolean.FALSE);
    }

    public boolean aP() {
        return getBooleanFromAdObject("rwvbv", Boolean.FALSE);
    }

    public boolean aQ() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public boolean aR() {
        return getBooleanFromAdObject("web_video", Boolean.FALSE);
    }

    public d aS() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        if ("top".equals(stringFromAdObject)) {
            return d.TOP;
        }
        if ("bottom".equals(stringFromAdObject)) {
            return d.BOTTOM;
        }
        if ("left".equals(stringFromAdObject)) {
            return d.LEFT;
        }
        return "right".equals(stringFromAdObject) ? d.RIGHT : d.RESIZE_ASPECT;
    }

    public boolean aa() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public boolean ab() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    public c ac() {
        if (this.f10226i == null) {
            this.f10226i = new c();
        }
        return this.f10226i;
    }

    public int ad() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cB)).intValue());
    }

    public int ae() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cC)).intValue());
    }

    public int af() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cA)).intValue());
    }

    public boolean ag() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.cz));
    }

    public boolean ah() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.cM));
    }

    public long ai() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public int aj() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean ak() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public AtomicBoolean al() {
        return this.f10219b;
    }

    public boolean am() {
        return getBooleanFromAdObject("show_nia", Boolean.FALSE);
    }

    public String an() {
        return getStringFromAdObject("nia_title", "");
    }

    public String ao() {
        return getStringFromAdObject("nia_message", "");
    }

    public String ap() {
        return getStringFromAdObject("nia_button_title", "");
    }

    public boolean aq() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    public boolean ar() {
        return getBooleanFromAdObject("show_rewarded_interstitial_overlay_alert", Boolean.valueOf(AppLovinAdType.AUTO_INCENTIVIZED == getType()));
    }

    public String as() {
        return getStringFromAdObject("text_rewarded_inter_alert_title", "Watch a video to earn a reward!");
    }

    public String at() {
        return getStringFromAdObject("text_rewarded_inter_alert_body", "");
    }

    public String au() {
        return getStringFromAdObject("text_rewarded_inter_alert_ok_action", "OK!");
    }

    public List<com.applovin.impl.sdk.d.a> av() {
        List<com.applovin.impl.sdk.d.a> listA;
        List<com.applovin.impl.sdk.d.a> list = this.f10222e;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            listA = w.a("video_end_urls", this.adObject, getClCode(), c(), this.sdk);
            this.f10222e = listA;
        }
        return listA;
    }

    public List<com.applovin.impl.sdk.d.a> aw() {
        List<com.applovin.impl.sdk.d.a> listA;
        List<com.applovin.impl.sdk.d.a> list = this.f10223f;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            listA = w.a("ad_closed_urls", this.adObject, getClCode(), null, this.sdk);
            this.f10223f = listA;
        }
        return listA;
    }

    public List<com.applovin.impl.sdk.d.a> ax() {
        List<com.applovin.impl.sdk.d.a> listA;
        List<com.applovin.impl.sdk.d.a> list = this.f10224g;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            listA = w.a("app_killed_urls", this.adObject, getClCode(), null, this.sdk);
            this.f10224g = listA;
        }
        return listA;
    }

    public List<com.applovin.impl.sdk.d.a> ay() {
        List<com.applovin.impl.sdk.d.a> listA;
        List<com.applovin.impl.sdk.d.a> list = this.f10225h;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            listA = w.a("imp_urls", this.adObject, getClCode(), null, null, az(), z(), this.sdk);
            this.f10225h = listA;
        }
        return listA;
    }

    public Map<String, String> az() {
        HashMap map = new HashMap();
        try {
            map.putAll(JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject())));
        } catch (JSONException e10) {
            this.sdk.F();
            if (com.applovin.impl.sdk.y.a()) {
                this.sdk.F().b("DirectAd", "Failed to retrieve http headers forx postbacks", e10);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            map.put("User-Agent", af.a());
        }
        return map;
    }

    public void b(Uri uri) {
        this.f10218a.add(uri);
    }

    public void c(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "play_image", uri.toString());
        }
    }

    public abstract String d();

    public void d(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "pause_image", uri.toString());
        }
    }

    public void e(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "mute_image", uri.toString());
        }
    }

    public void f(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "unmute_image", uri);
        }
    }

    public boolean f() {
        this.sdk.F();
        if (!com.applovin.impl.sdk.y.a()) {
            return false;
        }
        this.sdk.F().e("DirectAd", "Attempting to invoke isVideoStream() from base ad class");
        return false;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("ah_parameters", null);
        if (jsonObjectFromAdObject != null) {
            return JsonUtils.toBundle(jsonObjectFromAdObject);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", null);
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.a.a
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.adObjectLock) {
            JSONArray jSONArray = JsonUtils.getJSONArray(this.adObject, "omid_verification_script_resources", null);
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
                    try {
                        URL url = new URL(JsonUtils.getString(jSONObject, ImagesContract.URL, null));
                        String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                        String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                        arrayList.add((StringUtils.isValidString(string) && StringUtils.isValidString(string2)) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                    } catch (Throwable th) {
                        this.sdk.F();
                        if (com.applovin.impl.sdk.y.a()) {
                            this.sdk.F().b("DirectAd", "Failed to parse OMID verification script resource", th);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public Uri h() {
        this.sdk.F();
        if (!com.applovin.impl.sdk.y.a()) {
            return null;
        }
        this.sdk.F().e("DirectAd", "Attempting to invoke getVideoUri() from base ad class");
        return null;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.a.a
    public abstract boolean isOpenMeasurementEnabled();

    public Uri j() {
        this.sdk.F();
        if (!com.applovin.impl.sdk.y.a()) {
            return null;
        }
        this.sdk.F().e("DirectAd", "Attempting to invoke getClickDestinationUri() from base ad class");
        return null;
    }

    public Uri k() {
        this.sdk.F();
        if (!com.applovin.impl.sdk.y.a()) {
            return null;
        }
        this.sdk.F().e("DirectAd", "Attempting to invoke getVideoClickDestinationUri() from base ad class");
        return null;
    }

    public abstract com.applovin.impl.sdk.a.b o();

    public b p() {
        b bVar = b.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", bVar.toString()).toUpperCase(Locale.ENGLISH);
        if ("ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase)) {
            return b.ACTIVITY_PORTRAIT;
        }
        return "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? b.ACTIVITY_LANDSCAPE : bVar;
    }

    public boolean q() {
        return getBooleanFromAdObject("iopmsdc", Boolean.FALSE);
    }

    public long r() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public long s() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    public long t() {
        List<Integer> listU = u();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (listU == null || listU.size() <= 0) ? 0L : listU.get(0).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    public List<Integer> u() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public j.a v() {
        List<Integer> listB = b();
        int intFromAdObject = getIntFromAdObject("close_style", (listB == null || listB.size() <= 0) ? -1 : listB.get(0).intValue());
        return intFromAdObject == -1 ? b(hasVideoUrl()) : a(intFromAdObject);
    }

    public List<j.a> w() {
        List<Integer> listB = b();
        if (listB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        Iterator<Integer> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next().intValue()));
        }
        return arrayList;
    }

    public j.a x() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? v() : a(intFromAdObject);
    }

    public boolean y() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public boolean z() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }
}
