package com.facebook.ads.redexgen.X;

import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class O6 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1190Sb A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.US, 34, 34, 35, 50, Ascii.US, 39, 42, 49};
    }

    public O6(C1190Sb c1190Sb) {
        this.A00 = c1190Sb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0N) {
                return;
            }
            this.A00.A0L.A02(A00(0, 9, 76));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
