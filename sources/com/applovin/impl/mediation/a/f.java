package com.applovin.impl.mediation.a;

import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f9048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f9049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f9050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f9051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9052e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f9053f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f9054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f9055h;

    public f(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, o oVar) {
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.f9049b = oVar;
        this.f9048a = jSONObject2;
        this.f9050c = jSONObject;
        this.f9051d = map;
    }

    private int a() {
        return b("mute_state", a("mute_state", ((Integer) this.f9049b.a(com.applovin.impl.sdk.c.a.K)).intValue()));
    }

    public JSONObject Z() {
        JSONObject jSONObject;
        synchronized (this.f9053f) {
            jSONObject = this.f9048a;
        }
        return jSONObject;
    }

    public float a(String str, float f10) {
        float f11;
        synchronized (this.f9052e) {
            f11 = JsonUtils.getFloat(this.f9050c, str, f10);
        }
        return f11;
    }

    public int a(String str, int i10) {
        int i11;
        synchronized (this.f9053f) {
            i11 = JsonUtils.getInt(this.f9048a, str, i10);
        }
        return i11;
    }

    public long a(String str, long j10) {
        long j11;
        synchronized (this.f9053f) {
            j11 = JsonUtils.getLong(this.f9048a, str, j10);
        }
        return j11;
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f9053f) {
            bool2 = JsonUtils.getBoolean(this.f9048a, str, bool);
        }
        return bool2;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f9053f) {
            string = JsonUtils.getString(this.f9048a, str, str2);
        }
        return string;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f9053f) {
            jSONArray2 = JsonUtils.getJSONArray(this.f9048a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f9052e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f9050c, str, jSONObject);
        }
        return jSONObject2;
    }

    public void a(String str, Object obj) {
        synchronized (this.f9052e) {
            JsonUtils.putObject(this.f9050c, str, obj);
        }
    }

    public JSONObject aa() {
        JSONObject jSONObject;
        synchronized (this.f9052e) {
            jSONObject = this.f9050c;
        }
        return jSONObject;
    }

    public String ab() {
        return b(Action.CLASS_ATTRIBUTE, (String) null);
    }

    public String ac() {
        return b("name", (String) null);
    }

    public String ad() {
        return ac().split("_")[0];
    }

    public boolean ae() {
        return b("is_testing", Boolean.FALSE).booleanValue();
    }

    public Boolean af() {
        String str = this.f9049b.ay().getExtraParameters().get(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT);
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        return c(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT) ? b(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, Boolean.FALSE) : a(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, (Boolean) null);
    }

    public Boolean ag() {
        String str = this.f9049b.ay().getExtraParameters().get(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER);
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        return c(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER) ? b(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, Boolean.FALSE) : a(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, (Boolean) null);
    }

    public Boolean ah() {
        String str = this.f9049b.ay().getExtraParameters().get(AppLovinSdkExtraParameterKey.DO_NOT_SELL);
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        return c(AppLovinSdkExtraParameterKey.DO_NOT_SELL) ? b(AppLovinSdkExtraParameterKey.DO_NOT_SELL, Boolean.FALSE) : a(AppLovinSdkExtraParameterKey.DO_NOT_SELL, (Boolean) null);
    }

    public String ai() {
        return c("consent_string") ? b("consent_string", (String) null) : a("consent_string", (String) null);
    }

    public boolean aj() {
        return b("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public Map<String, Object> ak() {
        return this.f9051d;
    }

    public Bundle al() {
        boolean zIsMuted;
        Bundle bundle = d("server_parameters") instanceof JSONObject ? JsonUtils.toBundle(a("server_parameters", (JSONObject) null)) : new Bundle();
        int iA = a();
        if (iA != -1) {
            if (iA == 2) {
                zIsMuted = this.f9049b.ay().isMuted();
            } else {
                zIsMuted = iA == 0;
            }
            bundle.putBoolean("is_muted", zIsMuted);
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_AMOUNT)) {
            bundle.putLong(AppLovinEventParameters.REVENUE_AMOUNT, a(AppLovinEventParameters.REVENUE_AMOUNT, 0L));
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_CURRENCY)) {
            bundle.putString(AppLovinEventParameters.REVENUE_CURRENCY, a(AppLovinEventParameters.REVENUE_CURRENCY, ""));
        }
        return bundle;
    }

    public Bundle am() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), al());
    }

    public long an() {
        return b("adapter_timeout_ms", ((Long) this.f9049b.a(com.applovin.impl.sdk.c.a.f10326k)).longValue());
    }

    public long ao() {
        return b("init_completion_delay_ms", -1L);
    }

    public long ap() {
        return b("auto_init_delay_ms", 0L);
    }

    public String aq() {
        return this.f9055h;
    }

    public double b(String str, float f10) {
        double d10;
        synchronized (this.f9052e) {
            d10 = JsonUtils.getDouble(this.f9050c, str, f10);
        }
        return d10;
    }

    public int b(String str, int i10) {
        int i11;
        synchronized (this.f9052e) {
            i11 = JsonUtils.getInt(this.f9050c, str, i10);
        }
        return i11;
    }

    public long b(String str, long j10) {
        long j11;
        synchronized (this.f9052e) {
            j11 = JsonUtils.getLong(this.f9050c, str, j10);
        }
        return j11;
    }

    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f9052e) {
            bool2 = JsonUtils.getBoolean(this.f9050c, str, bool);
        }
        return bool2;
    }

    public String b(String str, String str2) {
        String string;
        synchronized (this.f9052e) {
            string = JsonUtils.getString(this.f9050c, str, str2);
        }
        return string;
    }

    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f9052e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f9050c, str, jSONArray);
        }
        return jSONArray2;
    }

    public void c(String str, int i10) {
        synchronized (this.f9052e) {
            JsonUtils.putInt(this.f9050c, str, i10);
        }
    }

    public void c(String str, long j10) {
        synchronized (this.f9052e) {
            JsonUtils.putLong(this.f9050c, str, j10);
        }
    }

    public void c(String str, String str2) {
        synchronized (this.f9052e) {
            JsonUtils.putString(this.f9050c, str, str2);
        }
    }

    public boolean c(String str) {
        boolean zHas;
        synchronized (this.f9052e) {
            zHas = this.f9050c.has(str);
        }
        return zHas;
    }

    public Object d(String str) {
        Object objOpt;
        synchronized (this.f9052e) {
            objOpt = this.f9050c.opt(str);
        }
        return objOpt;
    }

    public void e(String str) {
        this.f9054g = str;
    }

    public void f(String str) {
        this.f9055h = str;
    }

    public List<String> g(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        JSONArray jSONArrayA = a(str, new JSONArray());
        List list = Collections.EMPTY_LIST;
        List listOptList = JsonUtils.optList(jSONArrayA, list);
        List listOptList2 = JsonUtils.optList(b(str, new JSONArray()), list);
        ArrayList arrayList = new ArrayList(listOptList2.size() + listOptList.size());
        arrayList.addAll(listOptList);
        arrayList.addAll(listOptList2);
        return arrayList;
    }

    public String getAdUnitId() {
        return a("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f9054g;
    }

    public String h(String str) {
        String strB = b(str, "");
        return StringUtils.isValidString(strB) ? strB : a(str, "");
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("MediationAdapterSpec{adapterClass='");
        sbA.append(ab());
        sbA.append("', adapterName='");
        sbA.append(ac());
        sbA.append("', isTesting=");
        sbA.append(ae());
        sbA.append('}');
        return sbA.toString();
    }
}
