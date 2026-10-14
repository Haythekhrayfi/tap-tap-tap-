package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f3750c;

    public Purchase(String str, String str2) throws JSONException {
        this.f3748a = str;
        this.f3749b = str2;
        this.f3750c = new JSONObject(str);
    }

    public String a() {
        JSONObject jSONObject = this.f3750c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    @Deprecated
    public ArrayList<String> b() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f3750c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f3750c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (this.f3750c.has("productId")) {
            arrayList.add(this.f3750c.optString("productId"));
        }
        return arrayList;
    }

    public boolean c() {
        return this.f3750c.optBoolean("autoRenewing");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f3748a, purchase.f3748a) && TextUtils.equals(this.f3749b, purchase.f3749b);
    }

    public int hashCode() {
        return this.f3748a.hashCode();
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f3748a));
    }
}
