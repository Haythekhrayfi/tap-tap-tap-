package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC0957Ix implements DialogInterface.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ U9 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{7, 17, -3, 18, 21, 13, -3, 17, 18, 3, 14, -12, -14, -11, -27};
    }

    public DialogInterfaceOnClickListenerC0957Ix(U9 u10) {
        this.A00 = u10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Map mapA01 = this.A00.A01();
        mapA01.put(A00(0, 11, 119), A00(11, 4, 89));
        this.A00.A05(mapA01);
    }
}
