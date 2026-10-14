package com.yandex.metrica.impl.ob;

import android.util.Base64;
import com.yandex.metrica.CounterConfiguration;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class H7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f14124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<S.a, Integer> f14127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f14128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Integer f14129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f14130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f14131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CounterConfiguration.b f14132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f14133j;

    public H7(C1744k0 c1744k0, T3 t10, HashMap<S.a, Integer> map) {
        this.f14124a = c1744k0.q();
        this.f14125b = c1744k0.g();
        this.f14126c = c1744k0.d();
        this.f14127d = map == null ? new HashMap<>() : map;
        U3 u3A = t10.a();
        this.f14128e = u3A.f();
        this.f14129f = u3A.g();
        this.f14130g = u3A.h();
        CounterConfiguration counterConfigurationB = t10.b();
        this.f14131h = counterConfigurationB.c();
        this.f14132i = CounterConfiguration.b.a(counterConfigurationB.f13444c.getAsString("CFG_REPORTER_TYPE"));
        this.f14133j = c1744k0.h();
    }

    public H7(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f14124a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f14125b = jSONObject2.getString("name");
        this.f14126c = jSONObject2.getInt("bytes_truncated");
        this.f14133j = C2120ym.e(jSONObject2, "environment");
        String strOptString = jSONObject2.optString("trimmed_fields");
        this.f14127d = new HashMap<>();
        if (strOptString != null) {
            try {
                HashMap<String, String> mapD = C2120ym.d(strOptString);
                if (mapD != null) {
                    for (Map.Entry<String, String> entry : mapD.entrySet()) {
                        this.f14127d.put(S.a.valueOf(entry.getKey()), Integer.valueOf(Integer.parseInt(entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f14128e = jSONObject3.getString("package_name");
        this.f14129f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f14130g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f14131h = jSONObject4.getString("api_key");
        this.f14132i = a(jSONObject4);
    }

    @Deprecated
    private CounterConfiguration.b a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("reporter_type")) {
            return CounterConfiguration.b.a(jSONObject.getString("reporter_type"));
        }
        return jSONObject.getBoolean("is_commutation") ? CounterConfiguration.b.COMMUTATION : CounterConfiguration.b.MAIN;
    }

    public String a() {
        return this.f14131h;
    }

    public int b() {
        return this.f14126c;
    }

    public byte[] c() {
        return this.f14124a;
    }

    public String d() {
        return this.f14133j;
    }

    public String e() {
        return this.f14125b;
    }

    public String f() {
        return this.f14128e;
    }

    public Integer g() {
        return this.f14129f;
    }

    public String h() {
        return this.f14130g;
    }

    public CounterConfiguration.b i() {
        return this.f14132i;
    }

    public HashMap<S.a, Integer> j() {
        return this.f14127d;
    }

    public String k() throws JSONException {
        HashMap map = new HashMap();
        for (Map.Entry<S.a, Integer> entry : this.f14127d.entrySet()) {
            map.put(entry.getKey().name(), entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f14129f).put("psid", this.f14130g).put("package_name", this.f14128e)).put("reporter_configuration", new JSONObject().put("api_key", this.f14131h).put("reporter_type", this.f14132i.a())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f14124a, 0)).put("name", this.f14125b).put("bytes_truncated", this.f14126c).put("trimmed_fields", C2120ym.g(map)).putOpt("environment", this.f14133j)).toString();
    }
}
