package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f9473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f9474f;

    public f(JSONObject jSONObject) {
        this.f9469a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f9470b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.f9471c = JsonUtils.getString(jSONObject, "min_age", null);
        this.f9472d = JsonUtils.getString(jSONObject, "max_age", null);
        this.f9473e = JsonUtils.getList(jSONObject, "gender", null);
        this.f9474f = JsonUtils.getList(jSONObject, "keywords", null);
    }

    public String a() {
        return this.f9469a;
    }

    public String b() {
        return this.f9470b;
    }

    public String c() {
        return this.f9471c;
    }

    public String d() {
        return this.f9472d;
    }

    public List<String> e() {
        return this.f9473e;
    }

    public List<String> f() {
        return this.f9474f;
    }
}
