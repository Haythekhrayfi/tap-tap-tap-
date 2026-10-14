package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.b.a.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f9466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f9467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<d> f9468c;

    public e(JSONObject jSONObject, MaxAdFormat maxAdFormat, com.applovin.impl.mediation.debugger.b.c.b bVar, o oVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f9467b = new d(jSONObject2, oVar);
        } else {
            this.f9467b = null;
        }
        this.f9466a = new c(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, bVar);
        JSONArray jSONArrayA = k.a(jSONObject, "placements");
        this.f9468c = new ArrayList(jSONArrayA.length());
        for (int i10 = 0; i10 < jSONArrayA.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayA, i10, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f9468c.add(new d(jSONObject3, oVar));
            }
        }
    }

    public c a() {
        return this.f9466a;
    }

    public d b() {
        return this.f9467b;
    }

    public boolean c() {
        return this.f9467b != null;
    }

    public List<d> d() {
        return this.f9468c;
    }
}
