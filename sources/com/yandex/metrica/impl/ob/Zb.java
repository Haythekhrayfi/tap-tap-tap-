package com.yandex.metrica.impl.ob;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f15649c;

    public Zb(String str, int i10, boolean z10) {
        this.f15647a = str;
        this.f15648b = i10;
        this.f15649c = z10;
    }

    public Zb(JSONObject jSONObject) throws JSONException {
        this.f15647a = jSONObject.getString("name");
        this.f15649c = jSONObject.getBoolean("required");
        this.f15648b = jSONObject.optInt("version", -1);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("name", this.f15647a).put("required", this.f15649c);
        int i10 = this.f15648b;
        if (i10 != -1) {
            jSONObjectPut.put("version", i10);
        }
        return jSONObjectPut;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Zb.class != obj.getClass()) {
            return false;
        }
        Zb zb2 = (Zb) obj;
        if (this.f15648b != zb2.f15648b || this.f15649c != zb2.f15649c) {
            return false;
        }
        String str = this.f15647a;
        String str2 = zb2.f15647a;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        String str = this.f15647a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f15648b) * 31) + (this.f15649c ? 1 : 0);
    }
}
