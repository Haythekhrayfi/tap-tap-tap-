package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6D, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6D {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C6E A00;
    public final C6F A01;
    public final C1336Xv A02;
    public final InterfaceC1159Qw A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{46, 56, 19, 41, 52, 56, 62, 45, 63};
    }

    static {
        A01();
        A06 = C6D.class.getSimpleName();
    }

    public C6D(C1336Xv c1336Xv, InterfaceC0887Gc interfaceC0887Gc, C6E c6e, C6F c6f) {
        this.A02 = c1336Xv;
        InterfaceC1159Qw interfaceC1159QwA4d = interfaceC0887Gc.A4d(EnumC1160Qx.A06);
        this.A03 = interfaceC1159QwA4d;
        this.A00 = c6e;
        this.A01 = c6f;
        interfaceC1159QwA4d.A3M(new Y4(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            if (!this.A03.A8z()) {
                this.A02.A04().A8n();
                return;
            }
            String btExtras = this.A03.A6a().optString(A00(0, 9, 62));
            if (!TextUtils.isEmpty(btExtras)) {
                this.A00.A04(this.A02, btExtras);
                if (!A04 || IN.A0i(this.A02)) {
                    A04 = true;
                    this.A01.A07();
                }
            }
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
