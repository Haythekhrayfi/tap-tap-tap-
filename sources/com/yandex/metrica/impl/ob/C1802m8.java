package com.yandex.metrica.impl.ob;

import android.util.Base64;
import com.yandex.metrica.CounterConfiguration;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1802m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String[] f16884a = {"arg_ak", "arg_pn", "arg_pd", "arg_ps", "arg_rt"};

    private C4 a(JSONObject jSONObject) {
        try {
            for (String str : f16884a) {
                if (!jSONObject.has(str)) {
                    return null;
                }
            }
            int i10 = jSONObject.getInt("arg_pd");
            if (i10 == 0) {
                i10 = Integer.parseInt(jSONObject.getString("arg_pd"));
            }
            return new C4(jSONObject.getString("arg_ak"), jSONObject.getString("arg_pn"), Integer.valueOf(i10), jSONObject.getString("arg_ps"), CounterConfiguration.b.a(jSONObject.getString("arg_rt")));
        } catch (Exception unused) {
            return null;
        }
    }

    public C4 a(String str) {
        try {
            return a(new JSONObject(new String(Base64.decode(str, 0))).getJSONObject("arg_cd"));
        } catch (Exception unused) {
            return null;
        }
    }
}
