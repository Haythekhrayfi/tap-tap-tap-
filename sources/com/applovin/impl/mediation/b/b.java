package com.applovin.impl.mediation.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.adview.a0;
import com.applovin.impl.sdk.c.e;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static JSONObject f9219d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f9220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f9222c = PreferenceManager.getDefaultSharedPreferences(o.au());

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f9223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JSONObject f9224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final JSONObject f9225c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final JSONObject f9226d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final JSONObject f9227e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final JSONObject f9228f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final JSONObject f9229g;

        /* JADX INFO: renamed from: com.applovin.impl.mediation.b.b$a$a, reason: collision with other inner class name */
        public static class C0123a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private JSONObject f9230a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private JSONObject f9231b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private JSONObject f9232c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private JSONObject f9233d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private JSONObject f9234e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private JSONObject f9235f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private JSONObject f9236g;

            public C0123a a(JSONObject jSONObject) {
                this.f9230a = jSONObject;
                return this;
            }

            public a a() {
                return new a(this.f9230a, this.f9231b, this.f9232c, this.f9233d, this.f9234e, this.f9235f, this.f9236g);
            }

            public C0123a b(JSONObject jSONObject) {
                this.f9231b = jSONObject;
                return this;
            }

            public C0123a c(JSONObject jSONObject) {
                this.f9234e = jSONObject;
                return this;
            }

            public C0123a d(JSONObject jSONObject) {
                this.f9236g = jSONObject;
                return this;
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("S2SApiService.Extensions.Builder(bidRequestExtObject=");
                sbA.append(this.f9230a);
                sbA.append(", impExtObject=");
                sbA.append(this.f9231b);
                sbA.append(", appExtObject=");
                sbA.append(this.f9232c);
                sbA.append(", deviceExtObject=");
                sbA.append(this.f9233d);
                sbA.append(", userExtObject=");
                sbA.append(this.f9234e);
                sbA.append(", sourceExtObject=");
                sbA.append(this.f9235f);
                sbA.append(", regsExtObject=");
                sbA.append(this.f9236g);
                sbA.append(")");
                return sbA.toString();
            }
        }

        public a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, JSONObject jSONObject6, JSONObject jSONObject7) {
            this.f9223a = jSONObject;
            this.f9224b = jSONObject2;
            this.f9225c = jSONObject3;
            this.f9226d = jSONObject4;
            this.f9227e = jSONObject5;
            this.f9228f = jSONObject6;
            this.f9229g = jSONObject7;
        }

        public static C0123a a() {
            return new C0123a();
        }
    }

    public b(String str, o oVar) {
        this.f9221b = str;
        this.f9220a = oVar;
    }

    private JSONArray a(Bundle bundle, MaxAdFormat maxAdFormat, JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putDouble(jSONObject2, "bidfloor", bundle.getDouble("bidfloor", 0.0d));
        if (maxAdFormat.isAdViewAd()) {
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putInt(jSONObject3, "w", bundle.getInt("width", maxAdFormat.getSize().getWidth()));
            JsonUtils.putInt(jSONObject3, "h", bundle.getInt("height", maxAdFormat.getSize().getHeight()));
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(3);
            jSONArray2.put(5);
            jSONArray2.put(6);
            JsonUtils.putJsonArray(jSONObject3, "api", jSONArray2);
            JsonUtils.putJSONObject(jSONObject2, "banner", jSONObject3);
        }
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        jSONArray.put(jSONObject2);
        return jSONArray;
    }

    private static JSONObject a(Context context) {
        JSONObject jSONObject = f9219d;
        if (jSONObject != null) {
            return jSONObject;
        }
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        PackageInfo packageInfo = null;
        try {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "name", packageManager.getApplicationLabel(applicationInfo).toString());
        JsonUtils.putString(jSONObject2, "bundle", applicationInfo.packageName);
        JsonUtils.putString(jSONObject2, "ver", packageInfo != null ? packageInfo.versionName : "");
        f9219d = jSONObject2;
        return jSONObject2;
    }

    private JSONObject a(Bundle bundle, JSONObject jSONObject, Context context) {
        JSONObject jSONObjectA = a(context);
        JsonUtils.putString(jSONObjectA, "domain", bundle.getString("domain", ""));
        JsonUtils.putString(jSONObjectA, "storeurl", bundle.getString("storeurl", ""));
        JsonUtils.putJSONObjectIfValid(jSONObjectA, "ext", jSONObject);
        return jSONObjectA;
    }

    private JSONObject a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "w", ((Integer) map.get("dx")).intValue());
        JsonUtils.putInt(jSONObject, "h", ((Integer) map.get("dy")).intValue());
        return jSONObject;
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject, Context context) {
        JSONObject jSONObject2 = new JSONObject();
        Boolean boolA = com.applovin.impl.b.a.a().a(context);
        if (boolA != null) {
            JsonUtils.putBoolean(jSONObject2, "coppa", boolA.booleanValue());
        }
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject, Map<String, Object> map, o oVar) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "ua", String.valueOf(map.get("ua")));
        JsonUtils.putBoolean(jSONObject2, "dnt", ((Boolean) map.get("dnt")).booleanValue());
        JsonUtils.putBoolean(jSONObject2, "lmt", ((Boolean) map.get("dnt")).booleanValue());
        JsonUtils.putString(jSONObject2, "ifa", String.valueOf(map.get("idfa")));
        JsonUtils.putString(jSONObject2, "make", String.valueOf(map.get("brand_name")));
        JsonUtils.putString(jSONObject2, "model", String.valueOf(map.get("model")));
        JsonUtils.putString(jSONObject2, "os", "android");
        JsonUtils.putString(jSONObject2, "osv", String.valueOf(map.get("os")));
        JsonUtils.putInt(jSONObject2, "devicetype", 1);
        JsonUtils.putInt(jSONObject2, "connectiontype", i.g(oVar));
        JsonUtils.putInt(jSONObject2, "w", ((Integer) map.get("dx")).intValue());
        JsonUtils.putInt(jSONObject2, "h", ((Integer) map.get("dy")).intValue());
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject b(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    public com.applovin.impl.sdk.network.c a(String str, String str2, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, a aVar, Map<String, String> map, boolean z10, o oVar) {
        oVar.F();
        if (y.a()) {
            a0.a("Creating OpenRTB request with ", str2, oVar.F(), this.f9221b);
        }
        Bundle customParameters = maxAdapterResponseParameters.getCustomParameters();
        Context contextAu = o.au();
        Map<String, Object> mapB = oVar.M() != null ? oVar.M().b() : oVar.K().a(false);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, FacebookMediationAdapter.KEY_ID, str2);
        JsonUtils.putBoolean(jSONObject, "test", maxAdapterResponseParameters.isTesting());
        JsonUtils.putJsonArrayIfValid(jSONObject, "imp", a(customParameters, maxAdFormat, aVar.f9224b));
        JsonUtils.putJSONObjectIfValid(jSONObject, "app", a(customParameters, aVar.f9225c, contextAu));
        JsonUtils.putJSONObjectIfValid(jSONObject, "device", a(aVar.f9226d, mapB, oVar));
        JsonUtils.putJSONObjectIfValid(jSONObject, "user", a(aVar.f9227e));
        JsonUtils.putJSONObjectIfValid(jSONObject, "source", b(aVar.f9228f));
        JsonUtils.putJSONObjectIfValid(jSONObject, "regs", a(aVar.f9229g, contextAu));
        JsonUtils.putJSONObjectIfValid(jSONObject, "format", a(mapB));
        JsonUtils.putJSONObjectIfValid(jSONObject, "ext", aVar.f9223a);
        return com.applovin.impl.sdk.network.c.a(oVar).a(str).b("POST").b(map).a(jSONObject).a(new JSONObject()).d(false).f(z10).a();
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putObject(jSONObject, "gdpr", (this.f9220a.M() != null ? this.f9220a.M().e() : this.f9220a.K().h()).get("IABTCF_gdprApplies"));
        Boolean boolA = com.applovin.impl.b.a.c().a(o.au());
        if (boolA != null) {
            JsonUtils.putString(jSONObject, "us_privacy", boolA.booleanValue() ? "1YY-" : "1YN-");
        }
        return jSONObject;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        Boolean boolC = c();
        if (boolC != null && boolC.booleanValue()) {
            JsonUtils.putBoolean(jSONObject, "did_consent", com.applovin.impl.b.a.b().a(o.au()).booleanValue());
            JsonUtils.putString(jSONObject, "consent", this.f9220a.M() != null ? this.f9220a.L().C().a() : String.valueOf(this.f9220a.K().h().get("IABTCF_TCString")));
        }
        return jSONObject;
    }

    public Boolean c() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(o.au());
        String strA = com.applovin.impl.sdk.c.d.f10407y.a();
        if (!defaultSharedPreferences.contains(strA)) {
            return null;
        }
        String str = (String) e.a(strA, "", String.class, defaultSharedPreferences, false);
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str.equals("1") || str.equalsIgnoreCase("true"));
        }
        Integer num = (Integer) e.a(strA, Integer.MAX_VALUE, Integer.class, defaultSharedPreferences, false);
        if (num != null && num.intValue() != Integer.MAX_VALUE) {
            return Boolean.valueOf(num.intValue() > 0);
        }
        Long l10 = (Long) e.a(strA, Long.valueOf(RecyclerView.FOREVER_NS), Long.class, defaultSharedPreferences, false);
        if (l10 == null || l10.longValue() == RecyclerView.FOREVER_NS) {
            return (Boolean) e.a(strA, Boolean.FALSE, Boolean.class, defaultSharedPreferences, false);
        }
        return Boolean.valueOf(l10.longValue() > 0);
    }
}
