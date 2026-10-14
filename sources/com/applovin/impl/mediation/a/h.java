package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.o;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h extends f {
    public h(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, o oVar) {
        super(map, jSONObject, jSONObject2, oVar);
    }

    public boolean a() {
        return b("only_collect_signal_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean b() {
        return b("use_cached_adapter", Boolean.TRUE).booleanValue();
    }

    @Override // com.applovin.impl.mediation.a.f
    public String toString() {
        StringBuilder sbA = defpackage.a.a("SignalProviderSpec{adObject=");
        sbA.append(aa());
        sbA.append('}');
        return sbA.toString();
    }
}
