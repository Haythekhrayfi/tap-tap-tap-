package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1430ad extends K4 {
    public static byte[] A02;
    public final /* synthetic */ C05240v A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{7, 19, 4, 16, 20, 4, 15, 2, Ascii.CAN, 62, 2, 0, 17, 17, 8, 15, 6};
    }

    public C1430ad(C05240v c05240v, JSONObject jSONObject) {
        this.A00 = c05240v;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        try {
            this.A00.A05.await();
            synchronized (this.A00.A02) {
                try {
                    this.A00.A02.A0B(this.A01);
                    this.A00.A06.countDown();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException e10) {
            this.A00.A03.A07().A9K(A00(0, 17, 116), C06937v.A1B, new C06947w(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            this.A00.A03.A07().A9K(A00(0, 17, 116), C06937v.A1A, new C06947w(e11));
        }
    }
}
