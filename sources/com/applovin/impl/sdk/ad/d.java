package com.applovin.impl.sdk.ad;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, d> f10212a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f10213b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f10214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f10215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AppLovinAdSize f10216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AppLovinAdType f10217f;

    private d(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        String strTrim;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f10216e = appLovinAdSize;
        this.f10217f = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            strTrim = str.trim();
        } else {
            strTrim = appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel();
        }
        String lowerCase = strTrim.toLowerCase(Locale.ENGLISH);
        lowerCase = z10 ? i.f.a(lowerCase, "_bidding") : lowerCase;
        this.f10215d = z11 ? i.f.a(lowerCase, "_direct_sold") : lowerCase;
    }

    public static d a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static d a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    public static d a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        d dVar = new d(appLovinAdSize, appLovinAdType, str, z10, z11);
        synchronized (f10213b) {
            String str2 = dVar.f10215d;
            Map<String, d> map = f10212a;
            if (map.containsKey(str2)) {
                dVar = map.get(str2);
            } else {
                map.put(str2, dVar);
            }
        }
        return dVar;
    }

    public static d a(String str) {
        return a(null, null, str);
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f10213b) {
                d dVar = f10212a.get(JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, ""));
                if (dVar != null) {
                    dVar.f10216e = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                    dVar.f10217f = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                }
            }
        }
    }

    public static d b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static Collection<d> f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, g(), h(), i(), j(), k(), l(), m());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static d g() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static d h() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static d i() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static d j() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public static d k() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static d l() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static d m() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public String a() {
        return this.f10215d;
    }

    public MaxAdFormat b() {
        AppLovinAdSize appLovinAdSizeC = c();
        if (appLovinAdSizeC == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (appLovinAdSizeC == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (appLovinAdSizeC == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (appLovinAdSizeC == AppLovinAdSize.CROSS_PROMO) {
            return MaxAdFormat.CROSS_PROMO;
        }
        if (appLovinAdSizeC != AppLovinAdSize.INTERSTITIAL) {
            if (appLovinAdSizeC == AppLovinAdSize.NATIVE) {
                return MaxAdFormat.NATIVE;
            }
            return null;
        }
        if (d() == AppLovinAdType.REGULAR) {
            return MaxAdFormat.INTERSTITIAL;
        }
        if (d() == AppLovinAdType.APP_OPEN) {
            return MaxAdFormat.APP_OPEN;
        }
        if (d() == AppLovinAdType.INCENTIVIZED) {
            return MaxAdFormat.REWARDED;
        }
        if (d() == AppLovinAdType.AUTO_INCENTIVIZED) {
            return MaxAdFormat.REWARDED_INTERSTITIAL;
        }
        return null;
    }

    public AppLovinAdSize c() {
        if (this.f10216e == null && JsonUtils.valueExists(this.f10214c, "ad_size")) {
            this.f10216e = AppLovinAdSize.fromString(JsonUtils.getString(this.f10214c, "ad_size", null));
        }
        return this.f10216e;
    }

    public AppLovinAdType d() {
        if (this.f10217f == null && JsonUtils.valueExists(this.f10214c, "ad_type")) {
            this.f10217f = AppLovinAdType.fromString(JsonUtils.getString(this.f10214c, "ad_type", null));
        }
        return this.f10217f;
    }

    public boolean e() {
        return f().contains(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f10215d.equalsIgnoreCase(((d) obj).f10215d);
    }

    public int hashCode() {
        return this.f10215d.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AdZone{id=");
        sbA.append(this.f10215d);
        sbA.append(", zoneObject=");
        sbA.append(this.f10214c);
        sbA.append('}');
        return sbA.toString();
    }
}
