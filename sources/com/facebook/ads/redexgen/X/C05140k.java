package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05140k {
    public static byte[] A00;
    public static String[] A01 = {"4Fi3cRKjKwjo", "pfwDmZC0EgnSHGG3akphHDiSxRpjxWfc", "OwKyFlCBYoW0NHpoiuFf2exuC", "FTixXnraWBf7yQ9sseM6khJqknPB2", "87lno6sBf8EnLpq9v2WrftgOrdI4V", "hcLSbPhFObKmfxN2jEGb0Jf71EM4", "MV7VLhl", "AE1L1nhQpeYYJvXkfFkincgpQRIdvuit"};

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{101, 64, 4, 77, 87, 4, 77, 74, 82, 69, 72, 77, 64, 69, 80, 65, 64, 4, 83, 77, 80, 76, 75, 81, 80, 4, 80, 75, 79, 65, 74, 10, 10, Ascii.ESC, 2, 39, 38, 55, 38, 32, 55, 42, 44, 45, Ascii.FS, 48, 55, 49, 42, 45, 36, 48, 35, 36, 60, 43, 38, 35, 46, 43, 62, 35, 37, 36, 21, 40, 47, 34, 43, 60, 35, 37, 56, 98, 115, 96, 97, 123, 124, 117};
    }

    static {
        A05();
    }

    public static EnumC05120i A00(JSONObject jSONObject) {
        return EnumC05120i.A00(jSONObject.optString(A02(52, 21, 114)));
    }

    public static C1435ai A01(C1337Xw c1337Xw, JSONObject jSONObject, String str) {
        return new C1435ai(jSONObject, c1337Xw, str);
    }

    public static Collection<String> A03(C1337Xw c1337Xw, JSONObject jSONObject) {
        JSONArray jSONArray = null;
        try {
            String detectionStringJSON = jSONObject.optString(A02(35, 17, 123));
            if (!TextUtils.isEmpty(detectionStringJSON)) {
                JSONArray detectionStringsArray = new JSONArray(detectionStringJSON);
                jSONArray = detectionStringsArray;
            }
        } catch (JSONException e10) {
            c1337Xw.A07().A9K(A02(73, 7, 42), C06937v.A2B, new C06947w(e10));
        }
        return A04(jSONArray);
    }

    public static Collection<String> A04(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            hashSet.add(jSONArray.optString(i10));
        }
        return hashSet;
    }

    public static boolean A06(C1337Xw c1337Xw, InterfaceC05130j interfaceC05130j, InterfaceC0937Id interfaceC0937Id) {
        EnumC05120i enumC05120iA76 = interfaceC05130j.A76();
        if (enumC05120iA76 != null) {
            EnumC05120i invalidationBehavior = EnumC05120i.A03;
            if (enumC05120iA76 != invalidationBehavior) {
                boolean packageInstalled = false;
                Collection<String> collectionA6f = interfaceC05130j.A6f();
                if (collectionA6f == null || collectionA6f.isEmpty()) {
                    return false;
                }
                Iterator<String> it = collectionA6f.iterator();
                while (it.hasNext()) {
                    if (C1003Kw.A04(c1337Xw, it.next())) {
                        packageInstalled = true;
                        break;
                    }
                }
                EnumC05120i invalidationBehavior2 = EnumC05120i.A02;
                if (packageInstalled != (enumC05120iA76 == invalidationBehavior2)) {
                    return false;
                }
                String strA6M = interfaceC05130j.A6M();
                boolean zIsEmpty = TextUtils.isEmpty(strA6M);
                String[] strArr = A01;
                String clientToken = strArr[7];
                if (clientToken.charAt(25) != strArr[1].charAt(25)) {
                    throw new RuntimeException();
                }
                A01[2] = "Y0XUyINdugWnNFuKX72emGLWk";
                if (!zIsEmpty) {
                    interfaceC0937Id.A9Q(strA6M, null);
                    return true;
                }
                c1337Xw.A07().A9K(A02(32, 3, 83), C06937v.A0Z, new C06947w(A02(0, 32, 28)));
                return true;
            }
        }
        return false;
    }
}
