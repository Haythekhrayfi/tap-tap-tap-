package com.applovin.impl.mediation.debugger;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.b.a.k;
import com.applovin.impl.mediation.debugger.c.c;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b implements com.applovin.impl.sdk.network.b.d<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference<MaxDebuggerActivity> f9432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f9433b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f9434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y f9435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f9436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.ui.b.b f9437f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9440i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f9442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, List<?>> f9443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a f9444m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, com.applovin.impl.mediation.debugger.b.c.b> f9438g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f9439h = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f9441j = 2;

    public b(o oVar) {
        this.f9434c = oVar;
        this.f9435d = oVar.F();
        Context contextAu = o.au();
        this.f9436e = contextAu;
        com.applovin.impl.mediation.debugger.ui.b.b bVar = new com.applovin.impl.mediation.debugger.ui.b.b(contextAu);
        this.f9437f = bVar;
        this.f9444m = new a(oVar, bVar);
    }

    private List<com.applovin.impl.mediation.debugger.b.a.a> a(List<com.applovin.impl.mediation.debugger.b.a.a> list, o oVar) {
        List<String> initializationAdUnitIds = oVar.ay().getInitializationAdUnitIds();
        if (initializationAdUnitIds == null || initializationAdUnitIds.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(initializationAdUnitIds.size());
        for (com.applovin.impl.mediation.debugger.b.a.a aVar : list) {
            if (initializationAdUnitIds.contains(aVar.a())) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.b.b.b> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            com.applovin.impl.mediation.debugger.b.b.b bVar = new com.applovin.impl.mediation.debugger.b.b.b(str);
            if (bVar.h()) {
                arrayList.add(bVar);
            } else if (y.a()) {
                this.f9435d.e("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.b.c.b> a(JSONObject jSONObject, o oVar) {
        JSONArray jSONArrayA = k.a(jSONObject, "networks");
        ArrayList arrayList = new ArrayList(jSONArrayA.length());
        for (int i10 = 0; i10 < jSONArrayA.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayA, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                com.applovin.impl.mediation.debugger.b.c.b bVar = new com.applovin.impl.mediation.debugger.b.c.b(jSONObject2, oVar);
                arrayList.add(bVar);
                this.f9438g.put(bVar.m(), bVar);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.b.a.a> a(JSONObject jSONObject, List<com.applovin.impl.mediation.debugger.b.c.b> list, o oVar) {
        JSONArray jSONArrayA = k.a(jSONObject, "ad_units");
        ArrayList arrayList = new ArrayList(jSONArrayA.length());
        for (int i10 = 0; i10 < jSONArrayA.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayA, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new com.applovin.impl.mediation.debugger.b.a.a(jSONObject2, this.f9438g, oVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private void a(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        boolean z10;
        Iterator<com.applovin.impl.mediation.debugger.b.c.b> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            com.applovin.impl.mediation.debugger.b.c.b next = it.next();
            if (next.e() && next.a() == com.applovin.impl.mediation.debugger.b.c.b.a.INVALID_INTEGRATION) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.debugger.b.2
                @Override // java.lang.Runnable
                public void run() {
                    Activity activityAt = b.this.f9434c.at();
                    if (activityAt == null || activityAt.isFinishing()) {
                        y.j("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
                    } else {
                        new AlertDialog.Builder(activityAt).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.b.2.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i10) {
                                b.this.c();
                            }
                        }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
                    }
                }
            }, TimeUnit.SECONDS.toMillis(2L));
        }
    }

    private void f() {
        this.f9434c.E().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.mediation.debugger.b.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MaxDebuggerActivity) {
                    y.f("AppLovinSdk", "Started mediation debugger");
                    if (!b.this.g() || b.f9432a.get() != activity) {
                        MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                        WeakReference unused = b.f9432a = new WeakReference(maxDebuggerActivity);
                        maxDebuggerActivity.setListAdapter(b.this.f9437f, b.this.f9434c.E());
                    }
                    b.f9433b.set(false);
                }
            }

            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxDebuggerActivity) {
                    y.f("AppLovinSdk", "Mediation debugger destroyed");
                    WeakReference unused = b.f9432a = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        WeakReference<MaxDebuggerActivity> weakReference = f9432a;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public List<?> a(String str) {
        Map<String, List<?>> map = this.f9443l;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.f9443l.get(str);
    }

    public void a() {
        if (this.f9439h.compareAndSet(false, true)) {
            this.f9434c.G().a(new c(this, this.f9434c), r.b.MEDIATION_MAIN);
        }
    }

    @Override // com.applovin.impl.sdk.network.b.d
    public void a(int i10, String str, JSONObject jSONObject) {
        if (y.a()) {
            this.f9435d.e("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i10);
        }
        y.j("AppLovinSdk", "Unable to show mediation debugger.");
        this.f9437f.a(null, null, null, null, null, null, null, null, this.f9434c);
        this.f9439h.set(false);
    }

    public void a(Map<String, List<?>> map) {
        this.f9443l = map;
        a();
        if (g() || !f9433b.compareAndSet(false, true)) {
            y.j("AppLovinSdk", "Mediation debugger is already showing");
            return;
        }
        if (!this.f9442k) {
            f();
            this.f9442k = true;
        }
        Intent intent = new Intent(this.f9436e, (Class<?>) MaxDebuggerActivity.class);
        intent.setFlags(268435456);
        y.f("AppLovinSdk", "Starting mediation debugger...");
        this.f9436e.startActivity(intent);
    }

    @Override // com.applovin.impl.sdk.network.b.d
    public void a(JSONObject jSONObject, int i10) {
        List<com.applovin.impl.mediation.debugger.b.c.b> listA = a(jSONObject, this.f9434c);
        List<com.applovin.impl.mediation.debugger.b.a.a> listA2 = a(jSONObject, listA, this.f9434c);
        List<com.applovin.impl.mediation.debugger.b.a.a> listA3 = a(listA2, this.f9434c);
        List<com.applovin.impl.mediation.debugger.b.b.b> listA4 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f9437f.a(listA, listA2, listA3, listA4, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, "message", null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "complies_with_google_families_policy", null), this.f9434c);
        if (!listA4.isEmpty()) {
            this.f9444m.a();
        }
        if (b()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.debugger.b.3
                @Override // java.lang.Runnable
                public void run() {
                    b.this.c();
                }
            }, TimeUnit.SECONDS.toMillis(this.f9441j));
        } else {
            a(listA);
        }
    }

    public void a(boolean z10, int i10) {
        this.f9440i = z10;
        this.f9441j = i10;
    }

    public boolean b() {
        return this.f9440i;
    }

    public void c() {
        a((Map<String, List<?>>) null);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("MediationDebuggerService{, listAdapter=");
        sbA.append(this.f9437f);
        sbA.append("}");
        return sbA.toString();
    }
}
