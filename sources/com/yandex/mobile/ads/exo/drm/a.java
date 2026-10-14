package com.yandex.mobile.ads.exo.drm;

import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.p90;
import com.yandex.mobile.ads.impl.v60;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class a {
    public static byte[] a(byte[] bArr) {
        if (da1.f19803a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(da1.a(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(jSONObject2.getString("k").replace(CoreConstants.DASH_CHAR, '+').replace('_', '/'));
                sb2.append("\",\"kid\":\"");
                sb2.append(jSONObject2.getString("kid").replace(CoreConstants.DASH_CHAR, '+').replace('_', '/'));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return da1.b(sb2.toString());
        } catch (JSONException e10) {
            StringBuilder sbA = v60.a("Failed to adjust response data: ");
            sbA.append(da1.a(bArr));
            p90.a("ClearKeyUtil", sbA.toString(), e10);
            return bArr;
        }
    }
}
