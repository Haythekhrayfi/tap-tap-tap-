package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1421aU implements InterfaceC05170o, InterfaceC05321d {
    public static byte[] A0B;
    public static String[] A0C = {"PgLDGrk3t3a26fQCrT3IpIrRB5PMNBKm", "uls9HIPpriPjzjIXJVTR7HWmS4IMGzWu", "f2YRmtND2fanruA3kJYGXgN9aGwgjawI", "EZdssni07U2TMPMup9RmA63S0tAhTBNo", "xilKUxawUAlWzUTJOedtCKHAHwNBDRxA", "SxIuirRfQS0L7ik0LzQXw", "dF8CYh", "NQmOIXzIEfwTEqDrM9Z7TuMEUTKSiMNX"};
    public long A00;
    public RewardData A01;
    public InterfaceC05270y A02;
    public C05280z A03;
    public C05331e A04;
    public C1337Xw A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public final String A0A = UUID.randomUUID().toString();

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        byte[] bArr = {78, 108, 99, 42, 121, 45, 126, 121, 108, Ascii.DEL, 121, 45, 76, 120, 105, 100, 104, 99, 110, 104, 67, 104, 121, 122, 98, Ascii.DEL, 102, 76, 110, 121, 100, 123, 100, 121, 116, 35, 45, 64, 108, 102, 104, 45, 126, 120, Ascii.DEL, 104, 45, 121, 101, 108, 121, 45, 100, 121, 42, 126, 45, 100, 99, 45, 116, 98, 120, Ascii.DEL, 45, 76, 99, 105, Ascii.DEL, 98, 100, 105, 64, 108, 99, 100, 107, 104, 126, 121, 35, 117, 96, 97, 45, 107, 100, 97, 104, 35, 73, 77, 78, 122, 107, 102, 106, 97, 108, 106, 65, 106, 123, 120, 96, 125, 100, 68, 37, 42, Ascii.ESC, 37, 39, 48, 45, 50, 45, 48, 61, 83, 91, 90, 87, 95, 74, 87, 81, 80, 122, 95, 74, 95, 12, 16, Ascii.GS, Ascii.US, Ascii.EM, 17, Ascii.EM, 18, 8, 53, Ascii.CAN, 52, 54, 33, 32, 33, 34, 45, 42, 33, 32, 11, 54, 45, 33, 42, 48, 37, 48, 45, 43, 42, 15, 33, 61, 6, 17, 5, 1, 17, 7, 0, 32, Ascii.GS, Ascii.EM, 17, 114, 105, 110, 118, 114, 98, 78, 99, Ascii.RS, 1, 13, Ascii.US, 60, 17, Ascii.CAN, 13, 39, 57, 62, 52, 63, 39};
        if (A0C[1].charAt(29) == 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "6qgGoSyjmuhDFT94hunOHzgd3UUS7LMQ";
        strArr[0] = "q1PjRK7gg6WFD8n4pAFO870HLaNMi7ir";
        A0B = bArr;
    }

    static {
        A05();
    }

    private int A00() {
        WindowManager windowManager = (WindowManager) this.A05.getSystemService(A03(194, 6, 88));
        int rotation = windowManager.getDefaultDisplay().getRotation();
        NH nhA02 = A02();
        if (nhA02 == NH.A06) {
            return -1;
        }
        if (nhA02 == NH.A04) {
            switch (rotation) {
                case 2:
                case 3:
                    return 8;
                default:
                    return 0;
            }
        }
        switch (rotation) {
            case 2:
                return 9;
            default:
                String[] strArr = A0C;
                String str = strArr[3];
                String str2 = strArr[7];
                int rotation2 = str.charAt(11);
                if (rotation2 != str2.charAt(11)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0C;
                strArr2[3] = "CZdwi0h9oyeTk4ywD5LtkOxTOpQ29Yc4";
                strArr2[7] = "yy96Y2PoNFwTE84mLwUlYETryPZgGhEq";
                return 1;
        }
    }

    private final EnumC0970Jm A01() {
        return this.A04.A0E();
    }

    private NH A02() {
        return this.A04.A0F();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A06(Intent intent) {
        C05331e c05331e = this.A04;
        RewardData rewardData = this.A01;
        c05331e.A0I(intent, rewardData, PK.A03(rewardData, this.A0A, this.A06));
    }

    private final void A07(C1337Xw c1337Xw, InterfaceC05270y interfaceC05270y, C05461r c05461r, EnumSet<CacheFlag> enumSet, String str) {
        C05331e c05331e = new C05331e(c1337Xw, c05461r, this, str);
        C1C c1cA0D = c05331e.A0D();
        if (IN.A0r(c1337Xw)) {
            boolean z10 = c1cA0D instanceof AbstractC1404aD;
            String[] strArr = A0C;
            if (strArr[3].charAt(11) == strArr[7].charAt(11)) {
                A0C[2] = "TkuXboGIr4gI6uBXxoSPLVsF8oObr4N9";
                if (z10 && C05140k.A06(this.A05, C05140k.A01(c1337Xw, c05461r.A03(), ((AbstractC1404aD) c1cA0D).A0s()), c1337Xw.A09())) {
                    this.A05.A0E().A4G();
                    this.A02.ABU(this, AdError.NO_FILL);
                    String[] strArr2 = A0C;
                    if (strArr2[3].charAt(11) == strArr2[7].charAt(11)) {
                        A0C[1] = "78EqxHXjdVB4uq4fqkQnSqdXUgUnX7wU";
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        this.A04 = c05331e;
        A08(c05331e.A0E());
        c05331e.A0J(c1337Xw, enumSet);
    }

    private void A08(EnumC0970Jm enumC0970Jm) {
        if (enumC0970Jm.equals(EnumC0970Jm.A03)) {
            this.A05.A0E().AFK(EnumC05070d.A04);
            return;
        }
        if (enumC0970Jm.equals(EnumC0970Jm.A09)) {
            this.A05.A0E().AFK(EnumC05070d.A03);
            return;
        }
        if (enumC0970Jm.equals(EnumC0970Jm.A0A)) {
            this.A05.A0E().AFK(EnumC05070d.A0A);
            return;
        }
        if (enumC0970Jm.equals(EnumC0970Jm.A0C)) {
            this.A05.A0E().AFK(EnumC05070d.A0C);
            return;
        }
        if (enumC0970Jm.equals(EnumC0970Jm.A0B)) {
            this.A05.A0E().AFK(EnumC05070d.A0B);
            return;
        }
        boolean zEquals = enumC0970Jm.equals(EnumC0970Jm.A05);
        String[] strArr = A0C;
        if (strArr[5].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A0C[2] = "SZ1DhKHJxqFOmux8c4F7iNiG5ZFRRvjL";
        if (!zEquals) {
            return;
        }
        if (this.A04.A0K()) {
            this.A05.A0E().AFK(EnumC05070d.A07);
        } else if ((A09() instanceof AbstractC1404aD) && this.A04.A0L((AbstractC1404aD) A09())) {
            this.A05.A0E().AFK(EnumC05070d.A09);
        } else {
            this.A05.A0E().AFK(EnumC05070d.A08);
        }
    }

    public final C1C A09() {
        return this.A04.A0D();
    }

    public final void A0A(C1337Xw c1337Xw, InterfaceC05270y interfaceC05270y, C05461r c05461r, EnumSet<CacheFlag> enumSet, String str, String str2, RewardData rewardData) {
        this.A05 = c1337Xw;
        this.A02 = interfaceC05270y;
        String strA02 = c05461r.A02();
        this.A08 = strA02;
        this.A06 = strA02 != null ? strA02.split(A03(107, 1, 19))[0] : A03(0, 0, 5);
        this.A00 = c05461r.A00();
        this.A07 = str2;
        this.A01 = rewardData;
        A07(c1337Xw, interfaceC05270y, c05461r, enumSet, str);
    }

    public final boolean A0B() {
        if (!this.A09) {
            InterfaceC05270y interfaceC05270y = this.A02;
            if (interfaceC05270y != null) {
                interfaceC05270y.ABU(this, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        AdActivityIntent adActivityIntentA04 = KJ.A04(this.A05);
        adActivityIntentA04.putExtra(A03(143, 24, 76), A00());
        adActivityIntentA04.putExtra(A03(178, 8, 15), this.A0A);
        adActivityIntentA04.putExtra(A03(132, 11, 116), this.A08);
        adActivityIntentA04.putExtra(A03(167, 11, 124), this.A00);
        EnumC0970Jm enumC0970JmA01 = A01();
        A08(enumC0970JmA01);
        adActivityIntentA04.putExtra(A03(186, 8, 96), enumC0970JmA01);
        String str = this.A07;
        if (str != null) {
            adActivityIntentA04.putExtra(A03(119, 13, 54), str);
        }
        A06(adActivityIntentA04);
        adActivityIntentA04.addFlags(268435456);
        try {
            ActivityUtils.A03(this.A05);
            KJ.A09(this.A05, adActivityIntentA04);
            return true;
        } catch (KH e10) {
            Throwable cause = e10.getCause();
            KH cause2 = e10;
            if (cause != null) {
                cause2 = e10.getCause();
            }
            this.A05.A07().A9K(A03(108, 11, 76), C06937v.A0D, new C06947w(cause2));
            Log.e(A03(90, 17, 7), A03(0, 90, 5), cause2);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05170o
    public final String A6M() {
        return this.A04.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05170o
    public final AdPlacementType A7V() {
        return AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05321d
    public final void AAE(AdError adError) {
        InterfaceC05270y interfaceC05270y = this.A02;
        if (interfaceC05270y != null) {
            interfaceC05270y.ABU(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05321d
    public final void AAF() {
        A04();
        this.A02.ABT(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05321d
    public final void AEA() {
        C05280z c05280z = new C05280z(this.A05, this.A0A, this, this.A02);
        this.A03 = c05280z;
        c05280z.A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05170o
    public final boolean AFh() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05321d
    public final void AFq() {
        C05280z c05280z = this.A03;
        if (c05280z != null) {
            c05280z.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05170o
    public final void onDestroy() {
        C05331e c05331e = this.A04;
        if (c05331e != null) {
            c05331e.A0H();
        }
    }
}
