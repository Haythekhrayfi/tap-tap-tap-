package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1085Oa {
    public static byte[] A00;
    public static String[] A01 = {"CXRchRuqobcH0303RF", "0PvsG2xJSmQLgGTcWH9EYe7sEgRs7pRt", "Ep2muPcKb5OPprn584rkOKVS7ZwPor7u", "ESdTFl6hgzo0PrNou", "ifIc3126Iu24LMQAqXU9MKX3mrrg1qWL", "gYyPZy3RrUjZ7", "cRp6DEQTFSLuVCLvwOm8", "Iag0U1Rq9Q0ZydVPffrz8fjunI2ky4CH"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static WebResourceResponse A00(C1337Xw c1337Xw, WebResourceRequest webResourceRequest, Uri uri, String str, HashMap<String, String> map) throws IOException {
        String strA02;
        String strA03 = A02(85, 5, 49);
        C1251Ul c1251UlA0F = QD.A05(c1337Xw.A01()).A0F(c1337Xw);
        C6O.A0H(c1337Xw, uri.toString());
        try {
            C1086Ob c1086Ob = new C1086Ob(c1337Xw.A01(), uri, c1251UlA0F);
            int iAvailable = c1086Ob.available();
            if (iAvailable <= 0) {
                A05(c1337Xw, 1, new Pair[]{new Pair(A02(61, 9, 77), String.valueOf(iAvailable))});
                return null;
            }
            String strA04 = A03(webResourceRequest.getRequestHeaders());
            if (strA04 == null) {
                c1337Xw.A0E().A5I();
                A06(map, iAvailable);
                return new WebResourceResponse(str, null, 200, A02(44, 2, 15), map, c1086Ob);
            }
            try {
                OZ ozA01 = A01(strA04);
                if (ozA01.A03) {
                    int i10 = ozA01.A01;
                    int i11 = ozA01.A00 == -1 ? iAvailable - 1 : ozA01.A00;
                    A06(map, iAvailable);
                    map.put(A02(31, 13, 81), A02(75, 6, 17) + i10 + A02(1, 1, 52) + i11 + A02(2, 1, 110) + iAvailable);
                    c1337Xw.A0E().A5I();
                    return new WebResourceResponse(str, null, 206, A02(46, 15, 36), map, c1086Ob);
                }
                Pair[] pairArr = new Pair[1];
                if (ozA01.A02 != null) {
                    strA02 = ozA01.A02;
                } else {
                    if (A01[2].charAt(11) != 'P') {
                        throw new RuntimeException();
                    }
                    A01[0] = "OMRpqA07uUbGIz9l3e";
                    strA02 = A02(90, 4, 76);
                }
                pairArr[0] = new Pair(A02(94, 5, 44), strA02);
                A05(c1337Xw, 0, pairArr);
                return null;
            } catch (NumberFormatException e10) {
                A05(c1337Xw, 3, new Pair[]{new Pair(strA03, e10.toString())});
                return null;
            }
        } catch (IOException e11) {
            A05(c1337Xw, 2, new Pair[]{new Pair(strA03, e11.toString())});
            return null;
        }
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-119, -68, -8, -14, -50, -16, -16, -14, -3, 1, -70, -33, -18, -5, -12, -14, 0, -46, -2, -3, 3, -12, -3, 3, -68, -37, -12, -3, -10, 3, -9, -17, Ascii.ESC, Ascii.SUB, 32, 17, Ascii.SUB, 32, -39, -2, 13, Ascii.SUB, 19, 17, -71, -75, -49, -32, -15, -13, -24, -32, -21, -97, -62, -18, -19, -13, -28, -19, -13, 9, Ascii.RS, 9, 17, 20, 9, 10, 20, 13, -7, 16, 11, -4, 10, -50, -27, -32, -47, -33, -116, 4, 16, 5, 6, -15, -2, -2, -5, -2, 21, Ascii.FS, 19, 19, -7, -24, -11, -18, -20};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A05(C1337Xw c1337Xw, int i10, Pair<String, String>[] pairArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(81, 4, 70), i10);
            for (Pair<String, String> pair : pairArr) {
                jSONObject.put((String) pair.first, pair.second);
            }
        } catch (JSONException unused) {
        }
        c1337Xw.A0E().A5H(jSONObject.toString());
    }

    static {
        A04();
    }

    public static OZ A01(String str) {
        if (str == null) {
            OZ parseResult = new OZ();
            parseResult.A03 = false;
            parseResult.A02 = null;
            return parseResult;
        }
        String[] strArrSplit = str.split(A02(3, 1, 90));
        if (strArrSplit.length >= 2) {
            if (A02(70, 5, 60).equals(strArrSplit[0].toLowerCase(Locale.US).trim())) {
                if (strArrSplit[1].trim().split(A02(0, 1, 2)).length != 1) {
                    OZ oz = new OZ();
                    oz.A03 = false;
                    oz.A02 = str;
                    return oz;
                }
                String[] ranges = strArrSplit[1].trim().split(A02(1, 1, 52));
                OZ oz2 = new OZ();
                oz2.A03 = true;
                oz2.A02 = str;
                oz2.A01 = TextUtils.isEmpty(ranges[0]) ? 0 : Integer.parseInt(ranges[0]);
                if (ranges.length > 1) {
                    oz2.A00 = TextUtils.isEmpty(ranges[1]) ? -1 : Integer.parseInt(ranges[1]);
                } else {
                    oz2.A00 = -1;
                }
                return oz2;
            }
        }
        OZ oz3 = new OZ();
        oz3.A03 = false;
        oz3.A02 = str;
        return oz3;
    }

    public static String A03(Map<String, String> map) {
        for (String str : map.keySet()) {
            if (A02(94, 5, 44).equals(str.toLowerCase(Locale.US))) {
                return map.get(str);
            }
        }
        return null;
    }

    public static void A06(HashMap<String, String> map, int i10) {
        map.put(A02(4, 13, 50), A02(70, 5, 60));
        map.put(A02(17, 14, 52), String.valueOf(i10));
    }
}
