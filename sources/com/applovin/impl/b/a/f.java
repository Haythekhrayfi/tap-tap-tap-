package com.applovin.impl.b.a;

import ch.qos.logback.core.joran.action.Action;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f8694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f8695b;

    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    private f(JSONObject jSONObject, o oVar) {
        this.f8694a = oVar;
        this.f8695b = jSONObject;
    }

    public static f a(JSONObject jSONObject, o oVar) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "title", (JSONObject) null), Action.KEY_ATTRIBUTE, null);
        if ("TOS".equalsIgnoreCase(string) && oVar.aa().e() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && oVar.aa().d() == null) {
            return null;
        }
        return new f(jSONObject, oVar);
    }

    public String a() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f8695b, "title", (JSONObject) null);
        return o.a(JsonUtils.getString(jSONObject, Action.KEY_ATTRIBUTE, ""), (List<String>) JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public a b() {
        String string = JsonUtils.getString(this.f8695b, "style", null);
        if ("default".equalsIgnoreCase(string)) {
            return a.POSITIVE;
        }
        return ("destructive".equalsIgnoreCase(string) || "cancel".equalsIgnoreCase(string)) ? a.NEGATIVE : a.NEUTRAL;
    }

    public String c() {
        return JsonUtils.getString(this.f8695b, "destination_state_id", null);
    }

    public String d() {
        return JsonUtils.getString(this.f8695b, "event", null);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ConsentFlowStateAlertAction{title=");
        sbA.append(a());
        sbA.append("destinationStateId=");
        sbA.append(c());
        sbA.append("event=");
        sbA.append(d());
        sbA.append("}");
        return sbA.toString();
    }
}
