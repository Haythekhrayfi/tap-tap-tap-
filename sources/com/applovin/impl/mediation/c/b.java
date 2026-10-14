package com.applovin.impl.mediation.c;

import android.content.Context;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.impl.sdk.e.ac;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.s;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.applovin.impl.sdk.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static JSONObject f9281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f9282b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Set<String>> f9283c = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MaxAdFormat f9285e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, Object> f9286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f9287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a f9288k;

    public interface a {
        void a(JSONArray jSONArray);
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.c.b$b, reason: collision with other inner class name */
    public static class RunnableC0125b implements com.applovin.impl.mediation.a.g.a, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f9292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f9293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f9295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Collection<com.applovin.impl.mediation.a.g> f9296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final o f9297f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final y f9298g;

        private RunnableC0125b(int i10, a aVar, o oVar) {
            this.f9294c = i10;
            this.f9292a = aVar;
            this.f9297f = oVar;
            this.f9298g = oVar.F();
            this.f9293b = new Object();
            this.f9296e = new ArrayList(i10);
            this.f9295d = new AtomicBoolean();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            ArrayList<com.applovin.impl.mediation.a.g> arrayList;
            String str;
            String strD;
            synchronized (this.f9293b) {
                arrayList = new ArrayList(this.f9296e);
            }
            JSONArray jSONArray = new JSONArray();
            for (com.applovin.impl.mediation.a.g gVar : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    com.applovin.impl.mediation.a.h hVarA = gVar.a();
                    jSONObject.put("name", hVarA.ac());
                    jSONObject.put(Action.CLASS_ATTRIBUTE, hVarA.ab());
                    jSONObject.put("adapter_version", gVar.c());
                    jSONObject.put("sdk_version", gVar.b());
                    JSONObject jSONObject2 = new JSONObject();
                    if (StringUtils.isValidString(gVar.e())) {
                        str = "error_message";
                        strD = gVar.e();
                    } else {
                        str = "signal";
                        strD = gVar.d();
                    }
                    jSONObject2.put(str, strD);
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (y.a()) {
                        this.f9298g.b("TaskCollectSignals", "Collected signal from " + hVarA);
                    }
                } catch (JSONException e10) {
                    if (y.a()) {
                        this.f9298g.b("TaskCollectSignals", "Failed to create signal data", e10);
                    }
                    this.f9297f.ag().a("TaskCollectSignals", "createSignalsData", e10);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            a aVar = this.f9292a;
            if (aVar != null) {
                aVar.a(jSONArray);
            }
        }

        @Override // com.applovin.impl.mediation.a.g.a
        public void a(com.applovin.impl.mediation.a.g gVar) {
            boolean z10;
            synchronized (this.f9293b) {
                this.f9296e.add(gVar);
                int i10 = this.f9294c - 1;
                this.f9294c = i10;
                z10 = i10 < 1;
            }
            if (z10 && this.f9295d.compareAndSet(false, true)) {
                if (w.b() && ((Boolean) this.f9297f.a(com.applovin.impl.sdk.c.b.gD)).booleanValue()) {
                    this.f9297f.G().a(new ac(this.f9297f, "handleSignalCollectionCompleted", new Runnable() { // from class: com.applovin.impl.mediation.c.b.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            RunnableC0125b.this.a();
                        }
                    }), r.b.MEDIATION_MAIN);
                } else {
                    a();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9295d.compareAndSet(false, true)) {
                a();
            }
        }
    }

    public b(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, Context context, o oVar, a aVar) {
        super("TaskCollectSignals", oVar);
        this.f9284d = str;
        this.f9285e = maxAdFormat;
        this.f9286i = map;
        this.f9287j = context;
        this.f9288k = aVar;
    }

    private void a(final com.applovin.impl.mediation.a.h hVar, final com.applovin.impl.mediation.a.g.a aVar) {
        if (hVar.aj()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.c.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.f10534f.am().collectSignal(b.this.f9284d, b.this.f9285e, hVar, b.this.f9287j, aVar);
                }
            });
        } else {
            this.f10534f.am().collectSignal(this.f9284d, this.f9285e, hVar, this.f9287j, aVar);
        }
    }

    private void a(String str, Throwable th) {
        if (y.a()) {
            this.f10536h.b(this.f10535g, "No signals collected: " + str, th);
        }
        a aVar = this.f9288k;
        if (aVar != null) {
            aVar.a(new JSONArray());
        }
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException, InterruptedException {
        RunnableC0125b runnableC0125b = new RunnableC0125b(jSONArray.length(), this.f9288k, this.f10534f);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(new com.applovin.impl.mediation.a.h(this.f9286i, jSONArray.getJSONObject(i10), jSONObject, this.f10534f), runnableC0125b);
        }
        this.f10534f.G().a(new ac(this.f10534f, "timeoutCollectSignal", runnableC0125b), r.b.MAIN, ((Long) this.f10534f.a(com.applovin.impl.sdk.c.a.f10325j)).longValue());
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f9282b) {
            f9281a = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, o oVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f9283c.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e10) {
            y.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e10);
            oVar.ag().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e10);
        }
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) throws JSONException, InterruptedException {
        Set<String> set = f9283c.get(this.f9284d);
        if (set == null || set.isEmpty()) {
            StringBuilder sbA = defpackage.a.a("No signal providers found for ad unit: ");
            sbA.append(this.f9284d);
            a(sbA.toString(), (Throwable) null);
            return;
        }
        RunnableC0125b runnableC0125b = new RunnableC0125b(set.size(), this.f9288k, this.f10534f);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                a(new com.applovin.impl.mediation.a.h(this.f9286i, jSONObject2, jSONObject, this.f10534f), runnableC0125b);
            }
        }
        this.f10534f.G().a(new ac(this.f10534f, "timeoutCollectSignal", runnableC0125b), r.b.MAIN, ((Long) this.f10534f.a(com.applovin.impl.sdk.c.a.f10325j)).longValue());
    }

    @Override // java.lang.Runnable
    public void run() {
        s sVarAg;
        String str;
        String str2;
        JSONArray jSONArray;
        try {
            synchronized (f9282b) {
                jSONArray = JsonUtils.getJSONArray(f9281a, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (f9283c.size() > 0) {
                    b(jSONArray, f9281a);
                    return;
                } else {
                    a(jSONArray, f9281a);
                    return;
                }
            }
            if (y.a()) {
                this.f10536h.d(this.f10535g, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f10534f.b(com.applovin.impl.sdk.c.d.L, "{}"));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f9283c.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e10) {
            e = e10;
            a("Failed to wait for signals", e);
            sVarAg = this.f10534f.ag();
            str = "TaskCollectSignals";
            str2 = "waitForSignals";
            sVarAg.a(str, str2, e);
        } catch (JSONException e11) {
            e = e11;
            a("Failed to parse signals JSON", e);
            sVarAg = this.f10534f.ag();
            str = "TaskCollectSignals";
            str2 = "parseSignalsJSON";
            sVarAg.a(str, str2, e);
        } catch (Throwable th) {
            e = th;
            a("Failed to collect signals", e);
            sVarAg = this.f10534f.ag();
            str = "TaskCollectSignals";
            str2 = "collectSignals";
            sVarAg.a(str, str2, e);
        }
    }
}
