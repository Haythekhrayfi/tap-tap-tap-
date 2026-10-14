package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NT implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"l4N2Kcxoefptdq", "", "xCyGfauY8Cv8y6z1j6nB0", "I2vrbV9C0ptJWrRodxY1O", "AmZ6eVz7znw", "py", "GJkVNgHUEop", "nCT0hemhHj6ffYmr5ag1r7dDnEHHnadR"};
    public final /* synthetic */ C9E A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A02[7].charAt(24) != 'n') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "onCZLFvGkKiXvi8omTZne";
        strArr[3] = "abRPxd6rYbi4uG3hrN9CP";
        A01 = new byte[]{70, 66, 78, 72, 74};
    }

    static {
        A01();
    }

    public NT(C9E c9e) {
        this.A00 = c9e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 74));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            if (A02[0].length() == 28) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[6] = "DOCXsrSX8m5";
            strArr[1] = "";
        }
    }
}
