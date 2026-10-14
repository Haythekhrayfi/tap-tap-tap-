package com.applovin.impl.b.a;

import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e extends d {
    public e(JSONObject jSONObject, o oVar) {
        super(jSONObject, oVar);
    }

    public String e() {
        return a("title");
    }

    public String f() {
        return a("message");
    }

    public List<f> g() {
        f fVarA;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f8685b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject != null && (fVarA = f.a(jSONObject, this.f8684a)) != null) {
                arrayList.add(fVarA);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.b.a.d
    public String toString() {
        StringBuilder sbA = defpackage.a.a("ConsentFlowState{id=");
        sbA.append(a());
        sbA.append("type=");
        sbA.append(b());
        sbA.append("isInitialState=");
        sbA.append(c());
        sbA.append("title=");
        sbA.append(e());
        sbA.append("message=");
        sbA.append(f());
        sbA.append("actions=");
        sbA.append(g());
        sbA.append("}");
        return sbA.toString();
    }
}
