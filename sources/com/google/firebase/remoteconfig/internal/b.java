package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Date f12686f = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f12687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f12688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Date f12689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONArray f12690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JSONObject f12691e;

    public b(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f12688b = jSONObject;
        this.f12689c = date;
        this.f12690d = jSONArray;
        this.f12691e = jSONObject2;
        this.f12687a = jSONObject3;
    }

    public static b a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        return new b(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObjectOptJSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f12687a.toString().equals(((b) obj).toString());
        }
        return false;
    }

    public int hashCode() {
        return this.f12687a.hashCode();
    }

    public String toString() {
        return this.f12687a.toString();
    }
}
