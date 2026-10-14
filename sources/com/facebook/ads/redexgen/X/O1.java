package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class O1 implements View.OnTouchListener {
    public static byte[] A01;
    public static String[] A02 = {"UPn8XPbwEALUh69UMVXoUiPqGt8R4kTd", "xdZVJjkszNZsmCCeX5Z25YrBhtN0pwn3", "FeQmPyEiHax0mF5hQMzTPI1Ffvx0tG7b", "fvmioVuVICVgRcdenOF4sg60aa8ahOYc", "VSPkGqnnwW3mFwqMeREhEXKooJI9EmdX", "BoeGFpZQYNsfmUsiS6UyLTqqNWCMa5Si", "RMRc2", "QDt69ZTuQHjtvDaFmv1xWY1HLwI8P5x9"};
    public final /* synthetic */ C1190Sb A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{2, 0, -14, -1, -20, -16, -7, -10, -16, -8, -20, -10, -18, -17, 7, 5, -9, 4, -15, -3, -9, 11, 2, -13, -10, -15, -11, -2, -5, -11, -3, -15, -5, -13, -12};
    }

    static {
        A01();
    }

    public O1(C1190Sb c1190Sb) {
        this.A00 = c1190Sb;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (this.A00.A0R || this.A00.A0A == null) {
                    return false;
                }
                C1190Sb c1190Sb = this.A00;
                String[] strArr = A02;
                if (strArr[7].charAt(29) != strArr[5].charAt(29)) {
                    throw new RuntimeException();
                }
                A02[4] = "HA2nBWnpE72gRuw6NFG92ce7G5X4x4I2";
                if (!c1190Sb.A0A.isAcceptingText()) {
                    return false;
                }
                this.A00.A0R = true;
                this.A00.A0Z(A00(14, 21, 60));
                return false;
            case 1:
                C1190Sb.A05(this.A00);
                if (this.A00.A0Q || this.A00.A08 < 5) {
                    return false;
                }
                this.A00.A0Q = true;
                this.A00.A0Z(A00(0, 14, 55));
                return false;
            default:
                return false;
        }
    }
}
