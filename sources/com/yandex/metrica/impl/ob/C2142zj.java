package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2142zj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ka f18039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Aj f18040b;

    public C2142zj() {
        this(new Ka(), new Aj());
    }

    public C2142zj(Ka ka2, Aj aj) {
        this.f18039a = ka2;
        this.f18040b = aj;
    }

    public void a(C2042vj c2042vj, JSONObject jSONObject) {
        Ka ka2 = this.f18039a;
        C1760kg.v vVar = new C1760kg.v();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ui_parsing");
        if (jSONObjectOptJSONObject != null) {
            vVar.f16741b = jSONObjectOptJSONObject.optInt("too_long_text_bound", vVar.f16741b);
            vVar.f16742c = jSONObjectOptJSONObject.optInt("truncated_text_bound", vVar.f16742c);
            vVar.f16743d = jSONObjectOptJSONObject.optInt("max_visited_children_in_level", vVar.f16743d);
            vVar.f16744e = C2120ym.a(C2120ym.d(jSONObjectOptJSONObject, "after_create_timeout"), TimeUnit.SECONDS, vVar.f16744e);
            vVar.f16745f = jSONObjectOptJSONObject.optBoolean("relative_text_size_calculation", vVar.f16745f);
            vVar.f16746g = jSONObjectOptJSONObject.optBoolean("error_reporting", vVar.f16746g);
            vVar.f16747h = jSONObjectOptJSONObject.optBoolean("parsing_allowed_by_default", vVar.f16747h);
            vVar.f16748i = this.f18040b.a(jSONObjectOptJSONObject.optJSONArray("filters"));
        }
        c2042vj.a(ka2.a(vVar));
    }
}
