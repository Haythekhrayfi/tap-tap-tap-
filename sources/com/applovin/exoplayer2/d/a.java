package com.applovin.exoplayer2.d;

import ch.qos.logback.core.CoreConstants;
import com.applovin.exoplayer2.l.ai;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class a {
    private static String a(String str) {
        return str.replace('+', CoreConstants.DASH_CHAR).replace('/', '_');
    }

    public static byte[] a(byte[] bArr) {
        return ai.f7595a >= 27 ? bArr : ai.c(a(ai.a(bArr)));
    }

    private static String b(String str) {
        return str.replace(CoreConstants.DASH_CHAR, '+').replace('_', '/');
    }

    public static byte[] b(byte[] bArr) {
        if (ai.f7595a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(ai.a(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(b(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(b(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return ai.c(sb2.toString());
        } catch (JSONException e10) {
            StringBuilder sbA = defpackage.a.a("Failed to adjust response data: ");
            sbA.append(ai.a(bArr));
            com.applovin.exoplayer2.l.q.c("ClearKeyUtil", sbA.toString(), e10);
            return bArr;
        }
    }
}
