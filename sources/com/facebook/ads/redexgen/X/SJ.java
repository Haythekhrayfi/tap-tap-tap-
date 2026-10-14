package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SJ extends QQ {
    public static byte[] A01;
    public final /* synthetic */ AbstractC1097Om A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{90, 81, 88, 80, 87, 92, 93, 102, 88, 93, 102, 80, 87, 93, 92, 65};
    }

    public SJ(AbstractC1097Om abstractC1097Om) {
        this.A00 = abstractC1097Om;
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final void A03() {
        if (!this.A00.A06.A07()) {
            this.A00.A06.A05();
            if (!TextUtils.isEmpty(this.A00.A03.A0s())) {
                Map<String, String> mapA05 = new ND().A03(this.A00.A09).A02(this.A00.A06).A04(this.A00.A03.A0J()).A05();
                mapA05.put(A00(0, 16, 10), A00(0, 0, 11) + this.A00.A01);
                this.A00.A05.A9P(this.A00.A03.A0s(), mapA05);
                this.A00.A04.A0E().A2f();
                C2A.A00(this.A00.A03.A0I());
                this.A00.A07.A3y(this.A00.A08.A73());
            }
        }
    }
}
