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
public class a implements Comparable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f9451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f9452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<b> f9453e;

    public a(JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.b.c.b> map, o oVar) {
        this.f9449a = JsonUtils.getString(jSONObject, "name", "");
        this.f9450b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f9451c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArrayA = k.a(jSONObject, "waterfalls");
        this.f9453e = new ArrayList(jSONArrayA.length());
        for (int i10 = 0; i10 < jSONArrayA.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayA, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f9453e.add(new b(jSONObject2, map, this.f9451c, oVar));
            }
        }
        this.f9452d = this.f9453e.isEmpty() ? null : this.f9453e.get(0);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        return this.f9450b.compareToIgnoreCase(aVar.f9450b);
    }

    public String a() {
        return this.f9449a;
    }

    public String b() {
        return this.f9450b;
    }

    public String c() {
        MaxAdFormat maxAdFormat = this.f9451c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public MaxAdFormat d() {
        return this.f9451c;
    }

    public b e() {
        return this.f9452d;
    }

    public List<b> f() {
        return this.f9453e;
    }

    public String g() {
        StringBuilder sbA = defpackage.a.a("\n---------- ");
        v.e.a(sbA, this.f9450b, " ----------", "\nIdentifier - ");
        sbA.append(this.f9449a);
        sbA.append("\nFormat     - ");
        sbA.append(c());
        return sbA.toString();
    }
}
