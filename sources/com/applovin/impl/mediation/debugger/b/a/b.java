package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.b.a.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f9456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<e> f9457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<e> f9458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9459f = false;

    public b(JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.b.c.b> map, MaxAdFormat maxAdFormat, o oVar) {
        this.f9454a = JsonUtils.getString(jSONObject, "name", "");
        this.f9455b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f9456c = a(jSONObject);
        this.f9457d = a("bidders", jSONObject, map, maxAdFormat, oVar);
        this.f9458e = a("waterfall", jSONObject, map, maxAdFormat, oVar);
    }

    private f a(JSONObject jSONObject) {
        return new f(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }

    private List<e> a(String str, JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.b.c.b> map, MaxAdFormat maxAdFormat, o oVar) {
        com.applovin.impl.mediation.debugger.b.c.b bVar;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayA = k.a(jSONObject, str);
        for (int i10 = 0; i10 < jSONArrayA.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayA, i10, (JSONObject) null);
            if (jSONObject2 != null && (bVar = map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (bVar.A()) {
                    this.f9459f = true;
                }
                arrayList.add(new e(jSONObject2, maxAdFormat, bVar, oVar));
            }
        }
        return arrayList;
    }

    public String a() {
        return this.f9454a;
    }

    public String b() {
        return this.f9455b;
    }

    public f c() {
        return this.f9456c;
    }

    public List<e> d() {
        return this.f9457d;
    }

    public List<e> e() {
        return this.f9458e;
    }

    public boolean f() {
        return this.f9459f;
    }
}
