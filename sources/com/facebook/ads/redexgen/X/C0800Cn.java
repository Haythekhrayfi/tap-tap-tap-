package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0800Cn {
    public static byte[] A02;
    public final List<Format> A00;
    public final InterfaceC0782Bk[] A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-107, -70, -62, -83, -72, -75, -80, 108, -81, -72, -69, -65, -79, -80, 108, -81, -83, -68, -64, -75, -69, -70, 108, -71, -75, -71, -79, 108, -64, -59, -68, -79, 108, -68, -66, -69, -62, -75, -80, -79, -80, -122, 108, -17, -2, -2, -6, -9, -15, -17, 2, -9, -3, -4, -67, -15, -13, -17, -69, -60, -66, -58, -4, 11, 11, 7, 4, -2, -4, 15, 4, 10, 9, -54, -2, 0, -4, -56, -46, -53, -45};
    }

    public C0800Cn(List<Format> closedCaptionFormats) {
        this.A00 = closedCaptionFormats;
        this.A01 = new InterfaceC0782Bk[closedCaptionFormats.size()];
    }

    public final void A02(long j10, C0914Hf c0914Hf) {
        C0863Fe.A03(j10, c0914Hf, this.A01);
    }

    public final void A03(InterfaceC0774Ba interfaceC0774Ba, C0804Cs c0804Cs) {
        for (int i10 = 0; i10 < i; i10++) {
            c0804Cs.A05();
            InterfaceC0782Bk output = interfaceC0774Ba.AFm(c0804Cs.A03(), 3);
            Format format = this.A00.get(i10);
            String str = format.A0O;
            HG.A05(A00(43, 19, 86).equals(str) || A00(62, 19, 99).equals(str), A00(0, 43, 20) + str);
            output.A5i(Format.A08(format.A0M != null ? format.A0M : c0804Cs.A04(), str, null, -1, format.A0D, format.A0N, format.A03, null));
            this.A01[i10] = output;
        }
    }
}
