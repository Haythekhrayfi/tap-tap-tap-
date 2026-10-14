package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YE extends K4 {
    public static byte[] A01;
    public final /* synthetic */ C06445o A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{62, 44, 44, 58, 43, 44};
    }

    public YE(C06445o c06445o) {
        this.A00 = c06445o;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        try {
            JSONArray jSONArray = this.A00.A05.getJSONArray(A00(0, 6, 77));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                C06425m assetData = C06425m.A00(jSONArray.getJSONObject(i10));
                this.A00.A09(assetData.A04, assetData);
            }
            this.A00.A02.A0W(new YG(this), new C6H(this.A00.A04, this.A00.A03));
        } catch (JSONException unused) {
            this.A00.A00.post(new YF(this));
        }
    }
}
