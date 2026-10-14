package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class z extends ab {
    public z(String str, com.applovin.impl.sdk.o oVar) {
        super(str, oVar);
    }

    private JSONObject a(com.applovin.impl.sdk.b.c cVar) {
        JSONObject jSONObjectI = i();
        JsonUtils.putString(jSONObjectI, "result", cVar.b());
        Map<String, String> mapA = cVar.a();
        if (mapA != null) {
            JsonUtils.putJSONObject(jSONObjectI, "params", new JSONObject(mapA));
        }
        return jSONObjectI;
    }

    public abstract com.applovin.impl.sdk.b.c b();

    public abstract void b(JSONObject jSONObject);

    public abstract void c();

    @Override // com.applovin.impl.sdk.e.ab
    public int h() {
        return ((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.bM)).intValue();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.b.c cVarB = b();
        if (cVarB == null) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.e(this.f10535g, "Pending reward not found");
            }
            c();
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "Reporting pending reward: " + cVarB + "...");
        }
        a(a(cVarB), new com.applovin.impl.sdk.network.b.d<JSONObject>() { // from class: com.applovin.impl.sdk.e.z.1
            @Override // com.applovin.impl.sdk.network.b.d
            public void a(int i10, String str, JSONObject jSONObject) {
                z.this.a(i10);
            }

            @Override // com.applovin.impl.sdk.network.b.d
            public void a(JSONObject jSONObject, int i10) {
                z.this.b(jSONObject);
            }
        });
    }
}
