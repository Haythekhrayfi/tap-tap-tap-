package com.yandex.metrica.impl.ob;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1639fj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1655ga f16143a;

    public C1639fj() {
        this(new C1655ga());
    }

    public C1639fj(C1655ga c1655ga) {
        this.f16143a = c1655ga;
    }

    public void a(C2042vj c2042vj, C2120ym.a aVar) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("diagnostics");
        if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("functionalities")) == null) {
            return;
        }
        Wa wa2 = null;
        Wa wa3 = null;
        Wa wa4 = null;
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i10);
                String string = jSONObject.getString("tag");
                C1655ga c1655ga = this.f16143a;
                C1760kg.e eVar = new C1760kg.e();
                eVar.f16620b = jSONObject.getLong("expiration_timestamp");
                eVar.f16621c = jSONObject.optInt("interval", eVar.f16621c);
                Wa waA = c1655ga.a(eVar);
                if ("activation".equals(string)) {
                    wa2 = waA;
                } else if ("clids_info".equals(string)) {
                    wa3 = waA;
                } else if ("preload_info".equals(string)) {
                    wa4 = waA;
                }
            } catch (Throwable unused) {
            }
        }
        c2042vj.a(new Xa(wa2, wa3, wa4));
    }
}
