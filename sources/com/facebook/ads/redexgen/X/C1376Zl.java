package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1376Zl implements InterfaceC05511w {
    public static byte[] A04;
    public static String[] A05 = {"iEaWyjzULIZCFnp1nESlU5XZjwcvRjHd", "KbGYZiX8Pduw0KfpYwrRe1NWFWC1OMxy", "fhu9engps4P6WEn4zln6smGq5lQXex4h", "tbT6PfDqIL055", "rKa5gX4b0", "TAsNWcfBygYGmj6nueBPL3we7Mc4FYi0", "mn5595Nd0", "gAb4cPpeQcskkpTdmUE6rt9G8rZq3FNo"};
    public EnumC05501v A00 = EnumC05501v.A03;
    public EnumC05501v A01 = EnumC05501v.A03;
    public final AbstractC1373Zi A02;
    public final C1337Xw A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A05;
            if (strArr[7].charAt(1) != strArr[5].charAt(1)) {
                throw new RuntimeException();
            }
            A05[0] = "d2XCtNqKB2PlkmIVLWNasBjUSsZJOiBr";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 29);
            i13++;
        }
    }

    public static void A01() {
        A04 = new byte[]{-73, 11, 6, -73, 118, 104, -95, -73, -67, 104, -85, -87, -74, 104, -85, -80, -87, -74, -81, -83, 104, -111, -74, -68, -83, -81, -70, -87, -68, -79, -73, -74, 104, -115, -70, -70, -73, -70, 104, -75, -73, -84, -83, 104, -86, -63, 104, -69, -83, -68, -68, -79, -74, -81, 104, -119, -84, -101, -83, -68, -68, -79, -74, -81, -69, 118, -69, -83, -68, -111, -74, -68, -83, -81, -70, -87, -68, -79, -73, -74, -115, -70, -70, -73, -70, -107, -73, -84, -83, 112, 113, 112, 108, 107, -97, -114, -109, -113, -104, -115, -113, 120, -113, -98, -95, -103, -100, -107, -103, -59, -62, -64, 115, -41, -14, -17, -18, -25, -96, -23, -18, -12, -27, -14, -18, -31, -20, -96, -12, -14, -31, -18, -13, -23, -12, -23, -17, -18, -82, -15, 0, -7, -67, -64, -78, -75, 121, 122, -63, -74, -67, -59, 118, 119, 15, 3, -4, 15, -69, 4, 14, -69, -4, 7, 13, 0, -4, -1, 20, -69, -25, -22, -36, -33, -28, -23, -30, -57, -69, -25, -22, -36, -33, -32, -33, -69, 10, 13, -69, -18, -29, -22, -14, -28, -23, -30, -45, -57, -64, -45, Ascii.DEL, -56, -46, Ascii.DEL, -64, -53, -47, -60, -64, -61, -40, Ascii.DEL, -78, -89, -82, -74, -88, -83, -90, -14, -26, -33, -14, -98, -25, -15, -98, -20, -19, -14, -98, -54, -51, -65, -62, -61, -62};
    }

    static {
        A01();
    }

    public C1376Zl(C1337Xw c1337Xw, AbstractC1373Zi abstractC1373Zi) {
        this.A03 = c1337Xw;
        this.A02 = abstractC1373Zi;
    }

    private void A02(EnumC05501v enumC05501v, EnumC05501v enumC05501v2) {
        String strA00 = A00(113, 26, 99);
        StringBuilder sb2 = new StringBuilder();
        String errorTitle = A00(108, 5, 54);
        StringBuilder sbAppend = sb2.append(errorTitle).append(enumC05501v);
        String errorTitle2 = A00(0, 4, 122);
        String string = sbAppend.append(errorTitle2).append(enumC05501v2).toString();
        InterfaceC06927u interfaceC06927uA07 = this.A03.A07();
        int i10 = C06937v.A0e;
        C06947w c06947w = new C06947w(strA00, string);
        String errorTitle3 = A00(139, 3, 115);
        interfaceC06927uA07.A9K(errorTitle3, i10, c06947w);
        String errorTitle4 = strA00 + ' ' + string;
        this.A03.A0E().AGM(errorTitle4);
    }

    private void A03(String str, String str2, boolean z10) {
        AdSettings.IntegrationErrorMode integrationErrorModeA00 = C05471s.A00(this.A03);
        String str3 = String.format(Locale.US, AdErrorType.INCORRECT_API_CALL_ERROR.getDefaultErrorMessage(), str, str2);
        String strA00 = A00(139, 3, 115);
        String strA01 = A00(91, 17, 13);
        if (!z10) {
            Log.e(strA01, str3);
            this.A03.A07().A9K(strA00, C06937v.A0c, new C06947w(str3));
            this.A03.A0E().AGL(str3);
            return;
        }
        switch (C05491u.A00[integrationErrorModeA00.ordinal()]) {
            case 1:
                String errorMessage = str3 + A00(4, 87, 43);
                throw new C05521x(errorMessage);
            case 2:
                this.A02.A05();
                this.A02.A06(10, AdErrorType.INCORRECT_STATE_ERROR, str3);
                this.A03.A0E().AGL(str3);
                Log.e(strA01, str3);
                this.A03.A07().A9K(strA00, C06937v.A0c, new C06947w(str3));
                break;
        }
        Log.e(strA01, str3);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05511w
    public final boolean A5X() {
        boolean z10 = (this.A00 == EnumC05501v.A03 || this.A00 == EnumC05501v.A05) && this.A01 != EnumC05501v.A08;
        if (z10) {
            this.A00 = EnumC05501v.A07;
        } else {
            A03(A00(142, 6, 52), A00(154, 42, 126), false);
        }
        return !z10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05511w
    public final boolean A5Y() {
        boolean z10 = this.A00 == EnumC05501v.A06 && (this.A01 != EnumC05501v.A08 || IN.A0h(this.A03));
        if (z10) {
            this.A00 = EnumC05501v.A03;
            this.A01 = EnumC05501v.A08;
        } else {
            EnumC05501v enumC05501v = this.A00;
            EnumC05501v enumC05501v2 = EnumC05501v.A06;
            String strA00 = A00(148, 6, 49);
            if (enumC05501v != enumC05501v2) {
                A03(strA00, A00(219, 18, 97), true);
            } else {
                A03(strA00, A00(196, 23, 66), false);
            }
        }
        return !z10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05511w
    public final EnumC05501v A5q() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05511w
    public final void AF1(EnumC05501v enumC05501v) {
        this.A00 = enumC05501v;
        this.A01 = enumC05501v;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05511w
    public final void AF5(AdError adError) {
        this.A00 = EnumC05501v.A05;
        this.A01 = EnumC05501v.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05511w
    public final void AF9() {
        if (this.A00 != EnumC05501v.A07) {
            A02(this.A00, EnumC05501v.A06);
        }
        this.A00 = EnumC05501v.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05511w
    public final void AFJ() {
        if (this.A01 != EnumC05501v.A08) {
            A02(this.A00, EnumC05501v.A09);
        }
        this.A01 = EnumC05501v.A09;
    }
}
