package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SkuDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f3755b;

    public SkuDetails(String str) throws JSONException {
        this.f3754a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f3755b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public String a() {
        return this.f3755b.optString("freeTrialPeriod");
    }

    public int b() {
        return this.f3755b.optInt("introductoryPriceCycles");
    }

    public String c() {
        return this.f3755b.has("original_price") ? this.f3755b.optString("original_price") : d();
    }

    public String d() {
        return this.f3755b.optString("price");
    }

    public String e() {
        return this.f3755b.optString("productId");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f3754a, ((SkuDetails) obj).f3754a);
        }
        return false;
    }

    public String f() {
        return this.f3755b.optString("type");
    }

    public final String g() {
        return this.f3755b.optString("packageName");
    }

    public int hashCode() {
        return this.f3754a.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f3754a));
    }
}
