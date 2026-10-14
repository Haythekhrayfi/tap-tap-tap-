package com.applovin.impl.b.a;

import ch.qos.logback.core.joran.action.Action;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f8684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f8685b;

    public enum a {
        ALERT,
        GDPR_ALERT,
        EVENT,
        TERMS_OF_SERVICE,
        PRIVACY_POLICY,
        HAS_USER_CONSENT,
        REINIT
    }

    public d(JSONObject jSONObject, o oVar) {
        this.f8684a = oVar;
        this.f8685b = jSONObject;
    }

    public static d a(JSONObject jSONObject, o oVar) {
        a aVarB = b(JsonUtils.getString(jSONObject, "type", null));
        if (aVarB == a.ALERT) {
            return new e(jSONObject, oVar);
        }
        if (aVarB == a.GDPR_ALERT) {
            return new h(jSONObject, oVar);
        }
        return aVarB == a.EVENT ? new g(jSONObject, oVar) : new d(jSONObject, oVar);
    }

    private static a b(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return a.ALERT;
        }
        if ("gdpr_alert".equalsIgnoreCase(str)) {
            return a.GDPR_ALERT;
        }
        if ("event".equalsIgnoreCase(str)) {
            return a.EVENT;
        }
        if ("tos".equalsIgnoreCase(str)) {
            return a.TERMS_OF_SERVICE;
        }
        if ("pp".equalsIgnoreCase(str)) {
            return a.PRIVACY_POLICY;
        }
        if (AppLovinSdkExtraParameterKey.HAS_USER_CONSENT.equalsIgnoreCase(str)) {
            return a.HAS_USER_CONSENT;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return a.REINIT;
        }
        throw new IllegalArgumentException(i.f.a("Invalid type provided: ", str));
    }

    public String a() {
        return JsonUtils.getString(this.f8685b, FacebookMediationAdapter.KEY_ID, null);
    }

    public String a(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f8685b, str, (JSONObject) null);
        JSONArray jSONArrayA = k.a(jSONObject, "replacements");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayA.length(); i10++) {
            String string = JsonUtils.getObjectAtIndex(jSONArrayA, i10, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(string)) {
                string = this.f8684a.M() != null ? this.f8684a.L().B().b() : (String) this.f8684a.K().c().get("app_name");
                if (!StringUtils.isValidString(string)) {
                    string = o.a("THIS_APP");
                }
            }
            arrayList.add(string);
        }
        return o.a(JsonUtils.getString(jSONObject, Action.KEY_ATTRIBUTE, null), arrayList);
    }

    public a b() {
        return b(JsonUtils.getString(this.f8685b, "type", null));
    }

    public boolean c() {
        return JsonUtils.getBoolean(this.f8685b, "is_initial_state", Boolean.FALSE).booleanValue();
    }

    public String d() {
        return JsonUtils.getString(this.f8685b, "destination_state_id", null);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ConsentFlowState{id=");
        sbA.append(a());
        sbA.append("type=");
        sbA.append(b());
        sbA.append("isInitialState=");
        sbA.append(c());
        sbA.append("destinationStateId=");
        sbA.append(d());
        sbA.append("}");
        return sbA.toString();
    }
}
