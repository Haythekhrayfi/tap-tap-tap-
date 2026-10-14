package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05110h {
    public static byte[] A00;
    public static final String A01;

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0118  */
    /* JADX WARN: Code duplicated, block: B:51:0x011e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0124  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static AbstractC05100g A01(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, String str, Uri uri, Map<String, String> map, boolean z10, boolean z11) {
        C05160n c05160nA00;
        byte b10;
        if (uri == null || uri.getAuthority() == null) {
            return null;
        }
        String authority = uri.getAuthority();
        String queryParameter = uri.getQueryParameter(A02(113, 9, 44));
        String queryParameter2 = uri.getQueryParameter(A02(45, 4, 86));
        if (queryParameter2 != null && !TextUtils.isEmpty(queryParameter2)) {
            try {
                JSONObject jSONObject = new JSONObject(queryParameter2);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObject.getString(next));
                    } catch (JSONException e10) {
                        e = e10;
                        c1337Xw.A07().A9K(A02(64, 7, 51), C06937v.A22, new C06947w(e));
                        Log.w(A01, A02(0, 45, 27), e);
                        c05160nA00 = C05160n.A00(interfaceC0937Id, ActivityUtils.A00());
                        b10 = -1;
                        switch (authority.hashCode()) {
                            case -1458789996:
                                if (authority.equals(A02(71, 11, 74))) {
                                    b10 = 2;
                                }
                                break;
                            case 109770977:
                                if (authority.equals(A02(82, 5, 117))) {
                                    b10 = 0;
                                }
                                break;
                            case 1546100943:
                                if (authority.equals(A02(55, 9, 15))) {
                                    b10 = 1;
                                }
                                break;
                        }
                        switch (b10) {
                            case 0:
                                if (queryParameter != null) {
                                    return null;
                                }
                                if (z11) {
                                }
                                break;
                            case 1:
                                if (A02(109, 4, 100).equals(uri.getQueryParameter(A02(49, 6, 28)))) {
                                    return new FD(c1337Xw, interfaceC0937Id, str, uri, map, c05160nA00, z10);
                                }
                                return z11 ? new FF(c1337Xw, interfaceC0937Id, str, uri, map) : new FE(c1337Xw, interfaceC0937Id, str, uri, map, c05160nA00, z10);
                            case 2:
                                return new C1433ag(c1337Xw, interfaceC0937Id, str, uri, map);
                            default:
                                return new C1432af(c1337Xw, interfaceC0937Id, str, uri);
                        }
                    }
                }
            } catch (JSONException e11) {
                e = e11;
            }
        }
        c05160nA00 = C05160n.A00(interfaceC0937Id, ActivityUtils.A00());
        b10 = -1;
        switch (authority.hashCode()) {
            case -1458789996:
                if (authority.equals(A02(71, 11, 74))) {
                    b10 = 2;
                }
                break;
            case 109770977:
                if (authority.equals(A02(82, 5, 117))) {
                    b10 = 0;
                }
                break;
            case 1546100943:
                if (authority.equals(A02(55, 9, 15))) {
                    b10 = 1;
                }
                break;
        }
        switch (b10) {
            case 0:
                if (queryParameter != null) {
                    return null;
                }
                return (z11 || TextUtils.isEmpty(uri.getQueryParameter(A02(87, 22, 122)))) ? new FG(c1337Xw, interfaceC0937Id, str, uri, map, c05160nA00, z10) : new FF(c1337Xw, interfaceC0937Id, str, uri, map, true);
            case 1:
                if (A02(109, 4, 100).equals(uri.getQueryParameter(A02(49, 6, 28)))) {
                    return new FD(c1337Xw, interfaceC0937Id, str, uri, map, c05160nA00, z10);
                }
                if (z11) {
                }
            case 2:
                return new C1433ag(c1337Xw, interfaceC0937Id, str, uri, map);
            default:
                return new C1432af(c1337Xw, interfaceC0937Id, str, uri);
        }
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{111, 84, 91, 88, 86, 95, Ascii.SUB, 78, 85, Ascii.SUB, 74, 91, 72, 73, 95, Ascii.SUB, 80, 73, 85, 84, Ascii.SUB, 94, 91, 78, 91, Ascii.SUB, 83, 84, Ascii.SUB, 123, 94, 123, 89, 78, 83, 85, 84, 124, 91, 89, 78, 85, 72, 67, 20, 19, 22, 3, 22, 82, 83, 78, 84, 73, 88, 65, 94, 75, 64, 113, 66, 71, 64, 69, 98, 115, 96, 97, 123, 124, 117, Ascii.ESC, 10, Ascii.CAN, Ascii.CAN, Ascii.US, 3, Ascii.EM, 4, Ascii.RS, 12, 3, 39, 32, 59, 38, 49, 40, 47, 52, 41, 62, 4, 46, 41, 55, 4, 44, 62, 57, 4, 61, 58, 55, 55, 57, 58, 56, 48, 49, 55, 48, 32, 123, 100, 105, 104, 98, 82, 120, Ascii.DEL, 97};
    }

    static {
        A03();
        A01 = C05110h.class.getSimpleName();
    }

    public static AbstractC05100g A00(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, String str, Uri uri, Map<String, String> extraData) {
        return A01(c1337Xw, interfaceC0937Id, str, uri, extraData, true, false);
    }

    public static boolean A04(String str) {
        return A02(82, 5, 117).equalsIgnoreCase(str) || A02(55, 9, 15).equalsIgnoreCase(str);
    }
}
