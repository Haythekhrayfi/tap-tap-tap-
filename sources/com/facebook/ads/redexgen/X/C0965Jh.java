package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0965Jh {
    public static C0965Jh A00;
    public static byte[] A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C1235Tu A01(C1337Xw c1337Xw, JSONObject jSONObject, long j10) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONArray(A04(SyslogConstants.LOG_LOCAL1, 10, 21)).getJSONObject(0);
        C8D c8d = new C8D(C8E.A00(jSONObject2.getJSONObject(A04(100, 10, 87))), jSONObject2.optString(A04(115, 14, 88)), jSONObject2.optString(A04(0, 19, 98)));
        String strA04 = A04(26, 3, 57);
        if (jSONObject2.has(strA04)) {
            JSONArray jSONArray = jSONObject2.getJSONArray(strA04);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                C0947In.A06(c1337Xw, jSONObject3, j10, null);
                String strOptString = jSONObject3.optString(A04(19, 7, 39));
                String strOptString2 = jSONObject3.optString(A04(85, 15, 63));
                JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject(A04(63, 4, 116));
                JSONArray jSONArrayOptJSONArray = jSONObject3.optJSONArray(A04(146, 8, 78));
                if (jSONObjectOptJSONObject != null) {
                    c8d.A0A(new C8B(strOptString, strOptString2, jSONObjectOptJSONObject, jSONArrayOptJSONArray));
                } else {
                    c1337Xw.A0E().A4o(AdErrorType.UNKNOWN_ERROR.getErrorCode(), A04(67, 18, 82));
                }
            }
        }
        String strA05 = A04(47, 12, 116);
        if (jSONObject2.has(strA05)) {
            c8d.A0B(jSONObject2.getJSONObject(strA05));
        }
        return new C1235Tu(c8d, jSONObject.optString(A04(29, 18, 1)));
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 119);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{116, 113, 74, 103, 112, 101, 122, 103, 97, 124, 123, 114, 74, 118, 122, 123, 115, 124, 114, 49, 52, 49, 32, 36, 53, 34, 47, 42, 61, 23, Ascii.CAN, 41, 0, 23, Ascii.SUB, Ascii.US, 18, 23, 2, Ascii.US, Ascii.EM, Ascii.CAN, 41, 3, 3, Ascii.US, 18, 96, 107, 98, 106, 109, 92, 115, 98, 113, 98, 110, 112, 23, Ascii.ESC, 16, 17, 103, 98, 119, 98, 65, 68, 81, 68, 106, 71, 79, 64, 70, 81, 5, 76, 86, 5, 75, 80, 73, 73, 44, 41, 60, 41, 23, 37, 39, 44, 45, 36, 23, 60, 49, 56, 45, 68, 69, 70, 73, 78, 73, 84, 73, 79, 78, 84, 67, 67, 94, 67, 73, 74, 78, 91, 90, 93, 74, 112, 76, 64, 65, 73, 70, 72, 8, 0, 22, 22, 4, 2, 0, 18, 14, 3, 1, 7, 15, 7, 12, 22, 17, 77, 75, 88, 90, 82, 92, 75, 74, 89, 84, 93, 72};
    }

    static {
        A05();
        A00 = new C0965Jh();
    }

    public static synchronized C0965Jh A00() {
        return A00;
    }

    private C1234Tt A02(JSONObject jSONObject) {
        return new C1234Tt(jSONObject.optString(A04(129, 7, 18), A04(0, 0, 87)), jSONObject.optInt(A04(59, 4, 3), 0), null);
    }

    private C1234Tt A03(JSONObject jSONObject) {
        try {
            JSONArray placements = jSONObject.getJSONArray(A04(SyslogConstants.LOG_LOCAL1, 10, 21));
            JSONObject definition = placements.getJSONObject(0);
            C8E c8eA00 = C8E.A00(definition.getJSONObject(A04(100, 10, 87)));
            String featureConfig = definition.optString(A04(115, 14, 88));
            return new C1234Tt(jSONObject.optString(A04(129, 7, 18), A04(0, 0, 87)), jSONObject.optInt(A04(59, 4, 3), 0), new C8D(c8eA00, featureConfig, definition.optString(A04(0, 19, 98))));
        } catch (JSONException unused) {
            return A02(jSONObject);
        }
    }

    public final C0967Jj A06(C1337Xw c1337Xw, String str, long j10) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(A04(154, 4, 90));
            byte b10 = -1;
            int iHashCode = strOptString.hashCode();
            String strA04 = A04(110, 5, 70);
            switch (iHashCode) {
                case 96432:
                    if (strOptString.equals(A04(26, 3, 57))) {
                        b10 = 0;
                    }
                    break;
                case 96784904:
                    if (strOptString.equals(strA04)) {
                        b10 = 1;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    return A01(c1337Xw, jSONObject, j10);
                case 1:
                    return A03(jSONObject);
                default:
                    JSONObject jsonResponse = jSONObject.optJSONObject(strA04);
                    if (jsonResponse != null) {
                        return A02(jsonResponse);
                    }
                    break;
            }
        }
        return new C0967Jj(EnumC0966Ji.A04);
    }
}
