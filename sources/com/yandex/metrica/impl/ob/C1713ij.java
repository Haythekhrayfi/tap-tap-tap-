package com.yandex.metrica.impl.ob;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1713ij {
    private boolean a(JSONObject jSONObject, String str, boolean z10) throws JSONException {
        Boolean boolValueOf = jSONObject.has(str) ? Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean("enabled")) : null;
        Boolean boolValueOf2 = Boolean.valueOf(z10);
        if (boolValueOf == null) {
            boolValueOf = boolValueOf2;
        }
        return boolValueOf.booleanValue();
    }

    public void a(C2042vj c2042vj, C2120ym.a aVar) {
        C1760kg.i iVar = new C1760kg.i();
        try {
            Object jSONObject = new JSONObject();
            try {
                jSONObject = aVar.get("features");
            } catch (Throwable unused) {
            }
            JSONObject jSONObjectOptJSONObject = ((JSONObject) jSONObject).optJSONObject("list");
            if (jSONObjectOptJSONObject != null) {
                C1961si c1961si = new C1961si(new C1961si.a().d(a(jSONObjectOptJSONObject, "easy_collecting", iVar.f16631b)).e(a(jSONObjectOptJSONObject, "egress", iVar.f16654y)).m(a(jSONObjectOptJSONObject, "package_info", iVar.f16632c)).n(a(jSONObjectOptJSONObject, "permissions_collecting", iVar.f16633d)).f(a(jSONObjectOptJSONObject, "features_collecting", iVar.f16634e)).o(a(jSONObjectOptJSONObject, "sdk_list", iVar.f16640k)).g(a(jSONObjectOptJSONObject, "google_aid", iVar.f16635f)).q(a(jSONObjectOptJSONObject, "throttling", iVar.f16649t)).w(a(jSONObjectOptJSONObject, "wifi_around", iVar.f16636g)).x(a(jSONObjectOptJSONObject, "wifi_connected", iVar.f16637h)).c(a(jSONObjectOptJSONObject, "cells_around", iVar.f16638i)).p(a(jSONObjectOptJSONObject, "sim_info", iVar.f16639j)).j(a(jSONObjectOptJSONObject, "identity_light_collecting", iVar.f16641l)).l(a(jSONObjectOptJSONObject, "location_collecting", iVar.f16642m)).k(a(jSONObjectOptJSONObject, "lbs_collecting", iVar.f16643n)).h(a(jSONObjectOptJSONObject, "gpl_collecting", iVar.f16645p)).v(a(jSONObjectOptJSONObject, "wakeup", iVar.f16644o)).t(a(jSONObjectOptJSONObject, "ui_parsing", iVar.f16646q)).s(a(jSONObjectOptJSONObject, "ui_event_sending", iVar.f16647r)).u(a(jSONObjectOptJSONObject, "ui_raw_event_sending", iVar.f16647r)).r(a(jSONObjectOptJSONObject, "ui_collecting_for_bridge", iVar.f16648s)).a(a(jSONObjectOptJSONObject, "cell_additional_info", iVar.f16650u)).b(a(jSONObjectOptJSONObject, "cell_additional_info_connected_only", iVar.f16651v)).i(a(jSONObjectOptJSONObject, "huawei_oaid", iVar.f16653x)).a(jSONObjectOptJSONObject.has("ssl_pinning") ? Boolean.valueOf(jSONObjectOptJSONObject.getJSONObject("ssl_pinning").getBoolean("enabled")) : null));
                c2042vj.a(a(jSONObjectOptJSONObject, "socket", false));
                c2042vj.a(c1961si);
            }
        } catch (Throwable unused2) {
        }
    }
}
