package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n80 f19156b;

    public bb(Context context, n80 n80Var) {
        this.f19155a = context.getApplicationContext();
        this.f19156b = n80Var;
    }

    public final qa a(JSONObject jSONObject) throws JSONException, zi0 {
        cb uiVar;
        if (!kk0.a(jSONObject, "name", "type", "clickable", "required", "value")) {
            throw new zi0("Native Ad json has not required attributes");
        }
        String strA = jk0.a("type", jSONObject);
        String strA2 = jk0.a("name", jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("link");
        m80 m80VarA = jSONObjectOptJSONObject != null ? this.f19156b.a(jSONObjectOptJSONObject) : null;
        Context context = this.f19155a;
        Objects.requireNonNull(strA2);
        if (strA2.equals("close_button")) {
            uiVar = new ui();
        } else if (strA2.equals("feedback")) {
            uiVar = new vu(new m20());
        } else {
            Objects.requireNonNull(strA);
            switch (strA) {
                case "number":
                    uiVar = new qn0();
                    break;
                case "string":
                    uiVar = new b51();
                    break;
                case "image":
                    uiVar = new m20();
                    break;
                case "media":
                    uiVar = new wc0(context);
                    break;
                default:
                    x60.c("Asset type doesn't supported", new Object[0]);
                    throw new zi0("Native Ad json has not required attributes");
            }
        }
        return new qa(strA2, strA, uiVar.a(jSONObject), m80VarA, jSONObject.getBoolean("clickable"), jSONObject.getBoolean("required"));
    }
}
