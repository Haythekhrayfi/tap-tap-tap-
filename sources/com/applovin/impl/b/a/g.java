package com.applovin.impl.b.a;

import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f8700c;

    public g(JSONObject jSONObject, o oVar) {
        super(jSONObject, oVar);
    }

    public void a(Map<String, String> map) {
        this.f8700c = map;
    }

    public String e() {
        return JsonUtils.getString(this.f8685b, "name", null);
    }

    public Map<String, String> f() {
        return this.f8700c;
    }

    @Override // com.applovin.impl.b.a.d
    public String toString() {
        StringBuilder sbA = defpackage.a.a("ConsentFlowState{id=");
        sbA.append(a());
        sbA.append("type=");
        sbA.append(b());
        sbA.append("isInitialState=");
        sbA.append(c());
        sbA.append("name=");
        sbA.append(e());
        sbA.append("}");
        return sbA.toString();
    }
}
