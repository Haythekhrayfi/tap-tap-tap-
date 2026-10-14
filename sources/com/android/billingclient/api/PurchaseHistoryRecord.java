package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PurchaseHistoryRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f3753c;

    public PurchaseHistoryRecord(String str, String str2) throws JSONException {
        this.f3751a = str;
        this.f3752b = str2;
        this.f3753c = new JSONObject(str);
    }

    public long a() {
        return this.f3753c.optLong("purchaseTime");
    }

    public String b() {
        JSONObject jSONObject = this.f3753c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    @Deprecated
    public ArrayList<String> c() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f3753c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f3753c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (this.f3753c.has("productId")) {
            arrayList.add(this.f3753c.optString("productId"));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f3751a, purchaseHistoryRecord.f3751a) && TextUtils.equals(this.f3752b, purchaseHistoryRecord.f3752b);
    }

    public int hashCode() {
        return this.f3751a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f3751a));
    }
}
