package com.yandex.metrica.impl.ob;

import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.hj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1689hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1729ja f16307a;

    public C1689hj() {
        this(new C1729ja());
    }

    public C1689hj(C1729ja c1729ja) {
        this.f16307a = c1729ja;
    }

    public final void a(C2042vj c2042vj, JSONObject jSONObject) {
        C1760kg.h hVar = new C1760kg.h();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("egress");
        if (jSONObjectOptJSONObject != null) {
            hVar.f16626b = jSONObjectOptJSONObject.optString(ImagesContract.URL, hVar.f16626b);
            hVar.f16627c = jSONObjectOptJSONObject.optInt("repeated_delay", hVar.f16627c);
            hVar.f16628d = jSONObjectOptJSONObject.optInt("random_delay_window", hVar.f16628d);
            hVar.f16629e = jSONObjectOptJSONObject.optBoolean("background_allowed", hVar.f16629e);
            hVar.f16630f = jSONObjectOptJSONObject.optBoolean("diagnostic_enabled", hVar.f16630f);
        }
        c2042vj.a(this.f16307a.a(hVar));
    }
}
