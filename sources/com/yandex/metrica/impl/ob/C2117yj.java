package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.yj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2117yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Ja f17936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Aj f17937b;

    public C2117yj() {
        this(new Ja(), new Aj());
    }

    public C2117yj(Ja ja2, Aj aj) {
        this.f17936a = ja2;
        this.f17937b = aj;
    }

    public Kl a(JSONObject jSONObject, String str, C1760kg.u uVar) {
        Ja ja2 = this.f17936a;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            uVar.f16725b = jSONObjectOptJSONObject.optBoolean("text_size_collecting", uVar.f16725b);
            uVar.f16726c = jSONObjectOptJSONObject.optBoolean("relative_text_size_collecting", uVar.f16726c);
            uVar.f16727d = jSONObjectOptJSONObject.optBoolean("text_visibility_collecting", uVar.f16727d);
            uVar.f16728e = jSONObjectOptJSONObject.optBoolean("text_style_collecting", uVar.f16728e);
            uVar.f16733j = jSONObjectOptJSONObject.optBoolean("info_collecting", uVar.f16733j);
            uVar.f16734k = jSONObjectOptJSONObject.optBoolean("non_content_view_collecting", uVar.f16734k);
            uVar.f16735l = jSONObjectOptJSONObject.optBoolean("text_length_collecting", uVar.f16735l);
            uVar.f16736m = jSONObjectOptJSONObject.optBoolean("view_hierarchical", uVar.f16736m);
            uVar.f16738o = jSONObjectOptJSONObject.optBoolean("ignore_filtered", uVar.f16738o);
            uVar.f16739p = jSONObjectOptJSONObject.optBoolean("web_view_urls_collecting", uVar.f16739p);
            uVar.f16729f = jSONObjectOptJSONObject.optInt("too_long_text_bound", uVar.f16729f);
            uVar.f16730g = jSONObjectOptJSONObject.optInt("truncated_text_bound", uVar.f16730g);
            uVar.f16731h = jSONObjectOptJSONObject.optInt("max_entities_count", uVar.f16731h);
            uVar.f16732i = jSONObjectOptJSONObject.optInt("max_full_content_length", uVar.f16732i);
            uVar.f16740q = jSONObjectOptJSONObject.optInt("web_view_url_limit", uVar.f16740q);
            uVar.f16737n = this.f17937b.a(jSONObjectOptJSONObject.optJSONArray("filters"));
        }
        return ja2.a(uVar);
    }
}
