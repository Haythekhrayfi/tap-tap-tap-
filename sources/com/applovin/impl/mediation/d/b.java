package com.applovin.impl.mediation.d;

import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f9408a = {"ads", "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters", "ad_unit_signal_providers"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f9409b = {"ads", "settings", "signal_providers", "ad_unit_signal_providers"};

    public static String a(o oVar) {
        return i.a((String) oVar.a(com.applovin.impl.sdk.c.a.f10318c), "1.0/mediate", oVar);
    }

    public static void a(JSONObject jSONObject) {
    }

    public static void a(JSONObject jSONObject, o oVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f9408a);
            oVar.a(d.L, jSONObjectShallowCopy.toString());
            com.applovin.impl.mediation.c.b.a(jSONObjectShallowCopy);
        }
    }

    public static String b(o oVar) {
        return i.a((String) oVar.a(com.applovin.impl.sdk.c.a.f10319d), "1.0/mediate", oVar);
    }

    public static void b(JSONObject jSONObject, o oVar) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers")) {
            com.applovin.impl.mediation.c.b.a(jSONObject, oVar);
        }
    }

    public static String c(o oVar) {
        return i.a((String) oVar.a(com.applovin.impl.sdk.c.a.f10318c), "1.0/mediate_debug", oVar);
    }

    public static void c(JSONObject jSONObject, o oVar) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            oVar.b(d.M);
            return;
        }
        JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
        JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f9409b);
        oVar.a(d.M, jSONObjectShallowCopy.toString());
    }

    public static String d(o oVar) {
        return i.a((String) oVar.a(com.applovin.impl.sdk.c.a.f10319d), "1.0/mediate_debug", oVar);
    }
}
