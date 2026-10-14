package com.facebook.ads.redexgen.X;

import android.content.ActivityNotFoundException;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NO {
    public static byte[] A09;
    public NN A00;
    public boolean A01;
    public boolean A02;
    public final C1337Xw A03;
    public final InterfaceC0937Id A04;
    public final LG A05;
    public final InterfaceC1019Lm A06;
    public final QR A07;
    public final String A08;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A09 = new byte[]{Ascii.US, 8, Ascii.GS, Ascii.RS, 41, 40, 40, 51, 50, Ascii.US, 48, 53, 63, 55, 16, 53, 47, 40, 57, 50, 57, 46, 114, 69, 69, 88, 69, 23, 82, 79, 82, 84, 66, 67, 94, 89, 80, 23, 86, 84, 67, 94, 88, 89, 73, 126, 126, 99, 126, 44, 123, 100, 101, 96, 105, 44, 99, 124, 105, 98, 101, 98, 107, 44};
    }

    public NO(C1337Xw c1337Xw, String str, QR qr, LG lg, InterfaceC0937Id interfaceC0937Id) {
        this.A01 = true;
        this.A03 = c1337Xw;
        this.A08 = str;
        this.A07 = qr;
        this.A05 = lg;
        this.A04 = interfaceC0937Id;
        this.A06 = new C1208St(this);
    }

    public NO(C1337Xw c1337Xw, String str, QR qr, LG lg, InterfaceC0937Id interfaceC0937Id, InterfaceC1019Lm interfaceC1019Lm) {
        this.A01 = true;
        this.A03 = c1337Xw;
        this.A08 = str;
        this.A07 = qr;
        this.A05 = lg;
        this.A04 = interfaceC0937Id;
        this.A06 = interfaceC1019Lm;
    }

    public static void A03(C1337Xw c1337Xw, QR qr, LG lg, InterfaceC0937Id interfaceC0937Id, C1N c1n, String str) {
        AbstractC05100g abstractC05100gA01 = C05110h.A01(c1337Xw, interfaceC0937Id, str, KW.A00(c1n.A05()), new ND().A03(qr).A02(lg).A05(), false, false);
        if (abstractC05100gA01 != null) {
            abstractC05100gA01.A0A();
        }
    }

    private void A05(String str, String str2, Map<String, String> extraData) {
        this.A04.A9i(str, extraData);
        Km.A00(new NL(this, extraData, str, str2), new NM(this, str, extraData), ActivityUtils.A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(String str, String str2, Map<String, String> map) {
        String strA01 = A01(0, 22, 52);
        try {
            AbstractC05100g abstractC05100gA01 = C05110h.A01(this.A03, this.A04, str, KW.A00(str2), new ND(map).A03(this.A07).A02(this.A05).A05(), this.A01, this.A02);
            if (abstractC05100gA01 != null) {
                abstractC05100gA01.A0C();
            }
            NN nn = this.A00;
            if (nn != null) {
                nn.AAo();
            }
            this.A06.A3y(this.A08);
        } catch (ActivityNotFoundException e10) {
            Log.e(strA01, A01(44, 20, 100) + str2, e10);
        } catch (Exception e11) {
            Log.e(strA01, A01(22, 22, 95), e11);
        }
    }

    public final void A07(NN nn) {
        this.A00 = nn;
    }

    public final void A08(String str, String str2, Map<String, String> extraData) {
        new C0945Il(str, this.A04).A04(EnumC0944Ik.A0J, extraData);
        if (this.A05.A09(this.A03)) {
            this.A04.A9G(str, extraData);
        } else if (IN.A1H(this.A03)) {
            A05(str, str2, extraData);
        } else {
            A06(str, str2, extraData);
        }
    }

    public final void A09(boolean z10) {
        this.A02 = z10;
    }

    public final void A0A(boolean z10) {
        this.A01 = z10;
    }
}
