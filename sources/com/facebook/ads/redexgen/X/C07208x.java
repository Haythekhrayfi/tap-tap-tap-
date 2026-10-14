package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C07208x extends AbstractC1064Nf {
    public static byte[] A01;
    public final /* synthetic */ OP A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-78, -65, -65, -68, -65};
    }

    public C07208x(OP op) {
        this.A00 = op;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8Y
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(OA oa2) {
        new Handler(Looper.getMainLooper()).post(new ON(this));
        this.A00.A0B.ADD(A00(0, 5, 60), this.A00.A03());
    }
}
