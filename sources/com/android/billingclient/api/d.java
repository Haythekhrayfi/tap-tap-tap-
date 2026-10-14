package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f3763c;

        public /* synthetic */ a(JSONObject jSONObject) {
            this.f3761a = jSONObject.optString("productId");
            this.f3762b = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.f3763c = true == strOptString.isEmpty() ? null : strOptString;
        }

        public final boolean equals(Object obj) {
            String str;
            String str2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3761a.equals(aVar.f3761a) && this.f3762b.equals(aVar.f3762b) && ((str = this.f3763c) == (str2 = aVar.f3763c) || (str != null && str.equals(str2)));
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f3761a, this.f3762b, this.f3763c});
        }

        public final String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f3761a, this.f3762b, this.f3763c);
        }
    }

    public d(String str) throws JSONException {
        JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new a(jSONObjectOptJSONObject));
                }
            }
        }
    }
}
