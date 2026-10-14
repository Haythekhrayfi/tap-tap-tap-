package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1284Vv implements InterfaceC0799Cm {
    public static byte[] A03;
    public InterfaceC0782Bk A00;
    public C0926Hr A01;
    public boolean A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{90, 75, 75, 87, 82, 88, 90, 79, 82, 84, 85, 20, 67, 22, 72, 88, 79, 94, 8, 14};
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Cm
    public final void A4N(C0914Hf c0914Hf) {
        if (!this.A02) {
            if (this.A01.A05() == -9223372036854775807L) {
                return;
            }
            this.A00.A5i(Format.A02(null, A00(0, 20, 99), this.A01.A05()));
            this.A02 = true;
        }
        int iA04 = c0914Hf.A04();
        this.A00.AEg(c0914Hf, iA04);
        this.A00.AEh(this.A01.A04(), 1, iA04, 0, null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Cm
    public final void A8f(C0926Hr c0926Hr, InterfaceC0774Ba interfaceC0774Ba, C0804Cs c0804Cs) {
        this.A01 = c0926Hr;
        c0804Cs.A05();
        InterfaceC0782Bk interfaceC0782BkAFm = interfaceC0774Ba.AFm(c0804Cs.A03(), 4);
        this.A00 = interfaceC0782BkAFm;
        interfaceC0782BkAFm.A5i(Format.A0B(c0804Cs.A04(), A00(0, 20, 99), null, -1, null));
    }
}
