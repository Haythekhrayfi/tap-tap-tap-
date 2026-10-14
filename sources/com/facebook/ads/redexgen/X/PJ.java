package com.facebook.ads.redexgen.X;

import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PJ implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ RY A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{21, Ascii.RS, 20, 19, 17, 34, 20, 35};
    }

    public PJ(RY ry) {
        this.A00 = ry;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02 == null) {
                return;
            }
            this.A00.A02.A09(A00(0, 8, 65));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
