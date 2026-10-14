package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FD extends AbstractC1434ah {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, Ascii.FS, 72, 83, Ascii.FS, 83, 76, 89, 82, Ascii.FS, 80, 85, 82, 87, Ascii.FS, 73, 78, 80, 6, Ascii.FS, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = FD.class.getSimpleName();
    }

    public FD(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, String str, Uri uri, Map<String, String> mExtraData, C05160n c05160n, boolean z10) {
        super(c1337Xw, interfaceC0937Id, str, c05160n, z10);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05100g
    public final EnumC05090f A0A() {
        try {
            KV.A0B(new KV(), ((AbstractC05100g) this).A00, KW.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC05100g) this).A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
            return EnumC05090f.A02;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1434ah
    public final void A0D() {
        EnumC05090f enumC05090fA0A = null;
        if (((AbstractC1434ah) this).A02) {
            enumC05090fA0A = A0A();
        }
        A0E(this.A01, enumC05090fA0A);
    }
}
