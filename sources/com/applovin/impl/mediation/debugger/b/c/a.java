package com.applovin.impl.mediation.debugger.b.c;

import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.w;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9486c;

    public a(JSONObject jSONObject, o oVar) {
        this.f9484a = JsonUtils.getString(jSONObject, "name", "");
        this.f9485b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        this.f9486c = list != null ? w.a((List<String>) list) : w.b(JsonUtils.getString(jSONObject, "existence_class", ""));
    }

    public static boolean a(String str, String str2, String str3) {
        if (str == null) {
            return true;
        }
        if (str2 == null || w.b(str2, str) != 1) {
            return str3 == null || w.b(str3, str) != -1;
        }
        return false;
    }

    public String a() {
        return this.f9484a;
    }

    public String b() {
        return this.f9485b;
    }

    public boolean c() {
        return this.f9486c;
    }
}
