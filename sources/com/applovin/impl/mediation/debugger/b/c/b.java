package com.applovin.impl.mediation.debugger.b.c;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.b.a.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import i.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public class b implements AppLovinCommunicatorSubscriber, Comparable<b> {
    private final boolean A;
    private final boolean B;
    private final String C;
    private final Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.b> D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f9487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f9488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f9490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f9491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f9492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f9493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f9494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f9495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f9496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f9497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f9498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f9499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f9500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f9501o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f9502p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f9503q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f9504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f9505s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f9506t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f9507u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List<MaxAdFormat> f9508v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List<c> f9509w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List<com.applovin.impl.mediation.debugger.b.c.a> f9510x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List<String> f9511y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Map<MaxAdFormat, String> f9512z;

    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f9518e;

        a(String str) {
            this.f9518e = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.f9518e;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.b.c.b$b, reason: collision with other inner class name */
    public enum EnumC0129b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f9525f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f9526g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f9527h;

        EnumC0129b(String str, int i10, String str2) {
            this.f9525f = str;
            this.f9526g = i10;
            this.f9527h = str2;
        }

        public String a() {
            return this.f9525f;
        }

        public int b() {
            return this.f9526g;
        }

        public String c() {
            return this.f9527h;
        }
    }

    public b(JSONObject jSONObject, o oVar) {
        String str;
        String str2;
        boolean zEquals;
        boolean z10;
        HashMap map;
        String string;
        String adapterVersion;
        String sdkVersion;
        List<MaxAdFormat> list;
        boolean zIsBeta;
        this.f9487a = oVar;
        this.f9500n = JsonUtils.getString(jSONObject, "name", "");
        this.f9501o = JsonUtils.getString(jSONObject, "display_name", "");
        this.f9502p = JsonUtils.getString(jSONObject, "adapter_class", "");
        this.f9505s = JsonUtils.getString(jSONObject, "latest_adapter_version", "");
        this.f9511y = a(jSONObject);
        Boolean bool = Boolean.FALSE;
        this.f9496j = JsonUtils.getBoolean(jSONObject, "hide_if_missing", bool).booleanValue();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "configuration", new JSONObject());
        this.f9509w = a(jSONObject2, oVar);
        this.f9499m = JsonUtils.getBoolean(jSONObject2, "java_8_required", bool).booleanValue();
        this.A = JsonUtils.getBoolean(jSONObject2, "hide_initialization_status", bool).booleanValue();
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "test_mode", new JSONObject());
        this.f9498l = JsonUtils.getBoolean(jSONObject3, "false_coppa_required", bool).booleanValue();
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject3, "network_names", (JSONObject) null);
        if (jSONObject4 == null || jSONObject4.length() <= 0) {
            this.f9512z = null;
        } else {
            HashMap map2 = new HashMap(jSONObject4.length());
            Iterator<String> itKeys = jSONObject4.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                MaxAdFormat fromString = MaxAdFormat.formatFromString(next);
                String string2 = JsonUtils.getString(jSONObject4, next, null);
                if (fromString != null && !TextUtils.isEmpty(string2)) {
                    map2.put(fromString, string2);
                }
            }
            this.f9512z = map2;
        }
        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject, "test_mode", new JSONObject());
        this.f9494h = JsonUtils.getBoolean(jSONObject5, "supported", Boolean.TRUE).booleanValue();
        this.f9495i = JsonUtils.getBoolean(jSONObject, "test_mode_requires_init", Boolean.FALSE).booleanValue();
        this.f9506t = JsonUtils.getString(jSONObject5, "message", null);
        List list2 = JsonUtils.getList(jSONObject, "existence_classes", null);
        this.f9490d = list2 != null ? w.a((List<String>) list2) : w.b(JsonUtils.getString(jSONObject, "existence_class", ""));
        List<MaxAdFormat> listEmptyList = Collections.emptyList();
        MaxAdapter maxAdapterB = com.applovin.impl.mediation.d.c.b(this.f9502p, oVar);
        if (maxAdapterB != null) {
            this.f9491e = true;
            try {
                adapterVersion = maxAdapterB.getAdapterVersion();
                try {
                    sdkVersion = maxAdapterB.getSdkVersion() != null ? maxAdapterB.getSdkVersion() : "";
                    try {
                        listEmptyList = a(maxAdapterB);
                        str2 = sdkVersion;
                        str = adapterVersion;
                        list = listEmptyList;
                        zIsBeta = maxAdapterB.isBeta();
                    } catch (Throwable th) {
                        th = th;
                        StringBuilder sbA = defpackage.a.a("Failed to load adapter for network ");
                        sbA.append(this.f9500n);
                        sbA.append(". Please check that you have a compatible network SDK integrated. Error: ");
                        sbA.append(th);
                        y.j("MediatedNetwork", sbA.toString());
                        str2 = sdkVersion;
                        str = adapterVersion;
                        list = listEmptyList;
                        zIsBeta = false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sdkVersion = "";
                }
            } catch (Throwable th3) {
                th = th3;
                adapterVersion = "";
                sdkVersion = adapterVersion;
            }
            try {
                Class<?> cls = Class.forName(this.f9502p);
                zEquals = cls.getMethod("loadNativeAd", MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls);
            } catch (Throwable th4) {
                oVar.F();
                if (y.a()) {
                    oVar.F().b("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", th4);
                }
                zEquals = false;
            }
            z10 = zIsBeta;
            listEmptyList = list;
        } else {
            this.f9491e = false;
            str = "";
            str2 = str;
            zEquals = false;
            z10 = false;
        }
        this.f9504r = str;
        this.f9503q = str2;
        this.f9508v = listEmptyList;
        this.f9497k = zEquals;
        this.f9510x = a(jSONObject2, str, oVar);
        this.f9493g = w.b(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
        this.f9488b = D();
        this.f9492f = (str.equals(this.f9505s) || z10) ? false : true;
        Context contextAu = o.au();
        int iLastIndexOf = this.f9500n.lastIndexOf("_");
        this.f9507u = contextAu.getResources().getIdentifier(f.a("applovin_ic_mediation_", iLastIndexOf != -1 ? this.f9500n.toLowerCase().substring(0, iLastIndexOf) : this.f9500n.toLowerCase()), "drawable", contextAu.getPackageName());
        this.f9489c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
        AppLovinCommunicator.getInstance(contextAu).subscribe(this, "adapter_initialization_status");
        LinkedHashMap<String, Integer> linkedHashMapB = oVar.al().b();
        if (linkedHashMapB.containsKey(this.f9502p)) {
            this.f9489c = linkedHashMapB.get(this.f9502p).intValue();
        }
        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject2, "amazon_marketplace", (JSONObject) null);
        if (jSONObject6 == null || !this.f9490d) {
            this.B = false;
            map = null;
            this.C = null;
        } else {
            this.B = true;
            this.C = JsonUtils.getString(jSONObject6, "test_mode_app_id", null);
            JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONObject6, "test_mode_slot_ids", new JSONObject());
            map = new HashMap(jSONObject7.length());
            Iterator<String> itKeys2 = jSONObject7.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                MaxAdFormat fromString2 = MaxAdFormat.formatFromString(next2);
                JSONObject jSONObject8 = JsonUtils.getJSONObject(jSONObject7, next2, (JSONObject) null);
                if (fromString2 != null && jSONObject8 != null && (string = JsonUtils.getString(jSONObject8, "uuid", null)) != null) {
                    map.put(fromString2, new com.applovin.impl.mediation.debugger.a.b(string, jSONObject8, fromString2));
                }
            }
        }
        this.D = map;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0014  */
    /* JADX WARN: Code duplicated, block: B:13:0x0017  */
    private a D() {
        a aVar;
        if (this.f9490d) {
            if (this.f9491e) {
                aVar = a.COMPLETE;
            } else if (this.f9493g) {
                aVar = a.MISSING;
            } else {
                aVar = a.INCOMPLETE_INTEGRATION;
            }
        } else if (this.f9491e) {
            aVar = a.INCOMPLETE_INTEGRATION;
        } else {
            aVar = a.MISSING;
        }
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator<c> it = this.f9509w.iterator();
        while (it.hasNext()) {
            if (!it.next().c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator<com.applovin.impl.mediation.debugger.b.c.a> it2 = this.f9510x.iterator();
        while (it2.hasNext()) {
            if (!it2.next().c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.f9499m || o.aw()) ? aVar : a.INVALID_INTEGRATION;
    }

    private List<MaxAdFormat> a(MaxAdapter maxAdapter) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxRewardedInterstitialAdapter) {
            arrayList.add(MaxAdFormat.REWARDED_INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            arrayList.add(MaxAdFormat.MREC);
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List<String> a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List<c> a(JSONObject jSONObject, o oVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f9502p.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            c cVar = new c("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", o.au());
            if (cVar.c()) {
                arrayList.add(cVar);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                arrayList.add(new c(next, jSONObject2.getString(next), o.au()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.b.c.a> a(JSONObject jSONObject, String str, o oVar) {
        JSONArray jSONArrayA = k.a(jSONObject, "dependencies");
        JSONArray jSONArrayA2 = k.a(jSONObject, "dependencies_v2");
        ArrayList arrayList = new ArrayList(jSONArrayA2.length() + jSONArrayA.length());
        for (int i10 = 0; i10 < jSONArrayA.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayA, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new com.applovin.impl.mediation.debugger.b.c.a(jSONObject2, oVar));
            }
        }
        for (int i11 = 0; i11 < jSONArrayA2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayA2, i11, (JSONObject) null);
            if (jSONObject3 != null && com.applovin.impl.mediation.debugger.b.c.a.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new com.applovin.impl.mediation.debugger.b.c.a(jSONObject3, oVar));
            }
        }
        return arrayList;
    }

    public boolean A() {
        return this.B;
    }

    public String B() {
        return this.C;
    }

    public Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.b> C() {
        return this.D;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        return this.f9501o.compareToIgnoreCase(bVar.f9501o);
    }

    public a a() {
        return this.f9488b;
    }

    public int b() {
        return this.f9489c;
    }

    public EnumC0129b c() {
        if (!this.f9494h) {
            return EnumC0129b.NOT_SUPPORTED;
        }
        a aVar = this.f9488b;
        if (aVar != a.COMPLETE && (aVar != a.INCOMPLETE_INTEGRATION || !d() || !e())) {
            return EnumC0129b.INVALID_INTEGRATION;
        }
        if (this.f9487a.as().a()) {
            return (this.f9495i && (this.f9489c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f9489c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? EnumC0129b.NOT_INITIALIZED : EnumC0129b.READY;
        }
        return EnumC0129b.DISABLED;
    }

    public boolean d() {
        return this.f9490d;
    }

    public boolean e() {
        return this.f9491e;
    }

    public boolean f() {
        return this.f9492f;
    }

    public boolean g() {
        return this.f9488b == a.MISSING && this.f9496j;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public String h() {
        return this.f9500n;
    }

    public String i() {
        return this.f9501o;
    }

    public String j() {
        return this.f9503q;
    }

    public String k() {
        return this.f9504r;
    }

    public String l() {
        return this.f9505s;
    }

    public String m() {
        return this.f9502p;
    }

    public List<String> n() {
        return this.f9511y;
    }

    public int o() {
        return this.f9507u;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f9502p.equals(string)) {
            this.f9489c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterB = com.applovin.impl.mediation.d.c.b(string, this.f9487a);
            if (maxAdapterB == null || this.f9503q.equals(maxAdapterB.getSdkVersion())) {
                return;
            }
            this.f9503q = maxAdapterB.getSdkVersion();
            this.f9487a.X().b(this.f9503q, string);
        }
    }

    public List<MaxAdFormat> p() {
        return this.f9508v;
    }

    public boolean q() {
        return this.f9497k;
    }

    public List<c> r() {
        return this.f9509w;
    }

    public List<com.applovin.impl.mediation.debugger.b.c.a> s() {
        return this.f9510x;
    }

    public boolean t() {
        return this.f9499m;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("MediatedNetwork{name=");
        sbA.append(this.f9500n);
        sbA.append(", displayName=");
        sbA.append(this.f9501o);
        sbA.append(", sdkAvailable=");
        sbA.append(this.f9490d);
        sbA.append(", sdkVersion=");
        sbA.append(this.f9503q);
        sbA.append(", adapterAvailable=");
        sbA.append(this.f9491e);
        sbA.append(", adapterVersion=");
        return androidx.activity.k.a(sbA, this.f9504r, "}");
    }

    public boolean u() {
        return this.A;
    }

    public Map<MaxAdFormat, String> v() {
        return this.f9512z;
    }

    public String w() {
        return this.f9506t;
    }

    public boolean x() {
        return this.f9498l;
    }

    public final o y() {
        return this.f9487a;
    }

    public final String z() {
        StringBuilder sbA = defpackage.a.a("\n---------- ");
        e.a(sbA, this.f9500n, " ----------", "\nStatus  - ");
        sbA.append(this.f9488b.a());
        sbA.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sbA.append((!this.f9490d || TextUtils.isEmpty(this.f9503q)) ? "UNAVAILABLE" : this.f9503q);
        sbA.append("\nAdapter - ");
        if (this.f9491e && !TextUtils.isEmpty(this.f9504r)) {
            str = this.f9504r;
        }
        sbA.append(str);
        for (c cVar : r()) {
            if (!cVar.c()) {
                sbA.append("\n* MISSING ");
                sbA.append(cVar.a());
                sbA.append(": ");
                sbA.append(cVar.b());
            }
        }
        for (com.applovin.impl.mediation.debugger.b.c.a aVar : s()) {
            if (!aVar.c()) {
                sbA.append("\n* MISSING ");
                sbA.append(aVar.a());
                sbA.append(": ");
                sbA.append(aVar.b());
            }
        }
        return sbA.toString();
    }
}
