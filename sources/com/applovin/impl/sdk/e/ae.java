package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class ae extends ab {
    public ae(String str, com.applovin.impl.sdk.o oVar) {
        super(str, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.b.c cVarC = c(jSONObject);
        a(cVarC);
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "Pending reward handled: " + cVarC);
        }
    }

    private com.applovin.impl.sdk.b.c c(JSONObject jSONObject) {
        Map<String, String> mapEmptyMap;
        String string;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(com.applovin.impl.b.a.k.a(jSONObject, "results"), 0, new JSONObject());
        com.applovin.impl.sdk.utils.i.e(jSONObject2, this.f10534f);
        com.applovin.impl.sdk.utils.i.d(jSONObject, this.f10534f);
        com.applovin.impl.sdk.utils.i.f(jSONObject, this.f10534f);
        try {
            mapEmptyMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            mapEmptyMap = Collections.emptyMap();
        }
        try {
            string = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            string = "network_timeout";
        }
        return com.applovin.impl.sdk.b.c.a(string, mapEmptyMap);
    }

    public abstract void a(com.applovin.impl.sdk.b.c cVar);

    public abstract boolean b();

    @Override // com.applovin.impl.sdk.e.ab
    public int h() {
        return ((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.bL)).intValue();
    }

    @Override // java.lang.Runnable
    public void run() {
        a(i(), new com.applovin.impl.sdk.network.b.d<JSONObject>() { // from class: com.applovin.impl.sdk.e.ae.1
            @Override // com.applovin.impl.sdk.network.b.d
            public void a(int i10, String str, JSONObject jSONObject) {
                if (ae.this.b()) {
                    com.applovin.impl.sdk.y yVar = ae.this.f10536h;
                    if (com.applovin.impl.sdk.y.a()) {
                        ae aeVar = ae.this;
                        aeVar.f10536h.e(aeVar.f10535g, "Reward validation failed with error code " + i10 + " but task was cancelled already");
                        return;
                    }
                    return;
                }
                com.applovin.impl.sdk.y yVar2 = ae.this.f10536h;
                if (com.applovin.impl.sdk.y.a()) {
                    ae aeVar2 = ae.this;
                    aeVar2.f10536h.e(aeVar2.f10535g, "Reward validation failed with code " + i10 + " and error: " + str);
                }
                ae.this.a(i10);
            }

            @Override // com.applovin.impl.sdk.network.b.d
            public void a(JSONObject jSONObject, int i10) {
                if (!ae.this.b()) {
                    com.applovin.impl.sdk.y yVar = ae.this.f10536h;
                    if (com.applovin.impl.sdk.y.a()) {
                        ae aeVar = ae.this;
                        aeVar.f10536h.b(aeVar.f10535g, "Reward validation succeeded with code " + i10 + " and response: " + jSONObject);
                    }
                    ae.this.b(jSONObject);
                    return;
                }
                com.applovin.impl.sdk.y yVar2 = ae.this.f10536h;
                if (com.applovin.impl.sdk.y.a()) {
                    ae aeVar2 = ae.this;
                    aeVar2.f10536h.e(aeVar2.f10535g, "Reward validation succeeded with code " + i10 + " but task was cancelled already");
                }
                com.applovin.impl.sdk.y yVar3 = ae.this.f10536h;
                if (com.applovin.impl.sdk.y.a()) {
                    ae aeVar3 = ae.this;
                    aeVar3.f10536h.e(aeVar3.f10535g, "Response: " + jSONObject);
                }
            }
        });
    }
}
