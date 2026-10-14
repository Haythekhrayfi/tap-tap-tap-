package com.applovin.impl.mediation;

import android.app.Activity;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f9845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f9846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f9847c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONArray f9848d = new JSONArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashMap<String, Integer> f9849e = new LinkedHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f9850f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<com.applovin.impl.mediation.a.f> f9851g;

    public e(o oVar) {
        this.f9845a = oVar;
        this.f9846b = oVar.F();
    }

    private List<com.applovin.impl.mediation.a.f> a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(new com.applovin.impl.mediation.a.f(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, this.f9845a));
        }
        return arrayList;
    }

    public void a(Activity activity) {
        if (this.f9847c.compareAndSet(false, true)) {
            String str = (String) this.f9845a.a(com.applovin.impl.sdk.c.d.M);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<com.applovin.impl.mediation.a.f> listA = a(JsonUtils.getJSONArray(jSONObject, this.f9845a.as().a() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f9851g = listA;
                    long j10 = StringUtils.parseLong(this.f9845a.ay().getExtraParameters().get(AppLovinSdkExtraParameterKey.ADAPTER_INITIALIZATION_DELAY_MILLIS), -1L);
                    com.applovin.impl.mediation.c.a aVar = new com.applovin.impl.mediation.c.a(listA, activity, this.f9845a);
                    if (j10 > 0) {
                        this.f9845a.G().a(aVar, r.b.BACKGROUND, j10);
                    } else {
                        this.f9845a.G().a((com.applovin.impl.sdk.e.d) aVar);
                    }
                } catch (JSONException e10) {
                    if (y.a()) {
                        this.f9846b.b("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e10);
                    }
                }
            }
        }
    }

    public void a(com.applovin.impl.mediation.a.f fVar, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z10;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f9850f) {
            z10 = !a(fVar);
            if (z10) {
                this.f9849e.put(fVar.ab(), Integer.valueOf(initializationStatus.getCode()));
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putString(jSONObject, Action.CLASS_ATTRIBUTE, fVar.ab());
                JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                this.f9848d.put(jSONObject);
            }
        }
        if (z10) {
            this.f9845a.a(fVar);
            this.f9845a.am().processAdapterInitializationPostback(fVar, j10, initializationStatus, str);
            this.f9845a.X().a(initializationStatus, fVar.ab());
        }
    }

    public void a(com.applovin.impl.mediation.a.f fVar, Activity activity) {
        a(fVar, activity, null);
    }

    public void a(com.applovin.impl.mediation.a.f fVar, Activity activity, Runnable runnable) {
        List<com.applovin.impl.mediation.a.f> list;
        if (this.f9845a.as().a() && (list = this.f9851g) != null) {
            Iterator<com.applovin.impl.mediation.a.f> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                com.applovin.impl.mediation.a.f next = it.next();
                if (next.ab().equals(fVar.ab())) {
                    fVar = next;
                    break;
                }
            }
        }
        if (fVar == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        g gVarA = this.f9845a.ak().a(fVar);
        if (gVarA == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (y.a()) {
            this.f9846b.c("MediationAdapterInitializationManager", "Initializing adapter " + fVar);
        }
        gVarA.a(MaxAdapterParametersImpl.a(fVar), activity, runnable);
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f9850f) {
            this.f9849e.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f9845a.X().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }

    public boolean a() {
        return this.f9847c.get();
    }

    public boolean a(com.applovin.impl.mediation.a.f fVar) {
        boolean zContainsKey;
        synchronized (this.f9850f) {
            zContainsKey = this.f9849e.containsKey(fVar.ab());
        }
        return zContainsKey;
    }

    public LinkedHashMap<String, Integer> b() {
        LinkedHashMap<String, Integer> linkedHashMap;
        synchronized (this.f9850f) {
            linkedHashMap = this.f9849e;
        }
        return linkedHashMap;
    }

    public JSONArray c() {
        JSONArray jSONArray;
        synchronized (this.f9850f) {
            jSONArray = this.f9848d;
        }
        return jSONArray;
    }
}
