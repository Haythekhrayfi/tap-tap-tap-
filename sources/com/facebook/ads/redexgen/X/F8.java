package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class F8 extends AbstractC1408aH {
    public static C6O A0D;
    public static byte[] A0E;
    public static String[] A0F = {"YJVWhBFSVFKs7NrWmWULGh", "0GvTyPfIpVaCupDTXIuhVv", "vKmpQ0k2zgunQxdAFsx7Wlk6dmYtSCUc", "dqRYVPDeGy45RCRFCWIUPRHRtp9NBigI", "NSweCua6lZ8ChPFZ3cKnaOBscLcsrWLc", "HenZyTRrHhMHTWT00jKprDJGPW9d4C4V", "lvvcgtkpn6JHhS0LrJ19j3FN0lJsZZOv", "GmBDkEWrzwPugE8SLtTHysECIxUFQGpg"};
    public long A00;
    public AnonymousClass15 A01;
    public AnonymousClass16 A02;
    public C1C A03;
    public C1337Xw A04;
    public EnumC0970Jm A05;
    public OX A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public final String A0B = UUID.randomUUID().toString();
    public final AtomicBoolean A0C = new AtomicBoolean();

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{56, 52, 54, 54, 48, 57, 48, 39, 58, 56, 48, 33, 48, 39, 10, 39, 58, 33, 52, 33, 60, 58, 59, 108, 99, 82, 108, 110, 121, 100, 123, 100, 121, 116, 9, 2, 11, 3, 4, 15, 14, 43, 14, 46, 11, Ascii.RS, 11, 40, Ascii.US, 4, 14, 6, 15, 68, 76, 77, 64, 72, 93, 64, 70, 71, 109, 72, 93, 72, 12, 16, Ascii.GS, Ascii.US, Ascii.EM, 17, Ascii.EM, 18, 8, 53, Ascii.CAN, 87, 85, 66, 67, 66, 65, 78, 73, 66, 67, 104, 85, 78, 66, 73, 83, 70, 83, 78, 72, 73, 108, 66, 94, 4, 19, 7, 3, 19, 5, 2, 34, Ascii.US, Ascii.ESC, 19, 104, Ascii.DEL, 109, 123, 104, 126, 73, Ascii.DEL, 104, 108, Ascii.DEL, 104, 79, 72, 86, Ascii.EM, 14, Ascii.FS, 10, Ascii.EM, 15, 14, 15, 61, 2, 15, 14, 4, 42, 15, 47, 10, Ascii.US, 10, 41, Ascii.RS, 5, 15, 7, 14, 87, 64, 82, 68, 87, 65, 64, 65, 122, 83, 76, 65, 64, 74, 124, 103, 96, 120, 124, 108, 64, 109, 83, 76, 64, 82, 113, 92, 85, 64};
    }

    static {
        A08();
    }

    private void A06() {
        C05552a c05552aA00 = C05552a.A00(this.A04);
        AnonymousClass16 anonymousClass16 = this.A02;
        c05552aA00.A06(anonymousClass16, anonymousClass16.A00());
    }

    private void A07() {
        if (this.A02 != null) {
            try {
                C05552a.A00(this.A04).A05(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A09(Intent intent) {
        int i10 = super.A00;
        String strA04 = A04(77, 24, 89);
        if (i10 != -1) {
            ContentResolver contentResolver = this.A04.getContentResolver();
            if (A0F[3].charAt(29) != 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[7] = "ryaiaZaF8EzuUPZd67FeoIG9jUALGHZG";
            strArr[6] = "XITZtpYy2wf6QHmOozCOnY6Xlkm3ca51";
            if (Settings.System.getInt(contentResolver, A04(1, 22, 43), 0) != 1) {
                int i11 = super.A00;
                if (A0F[2].charAt(2) != 'm') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0F;
                strArr2[1] = "mo2n49jFbf8CHvb7nubztA";
                strArr2[0] = "3h0LYrxRFByrgEG7Z48zJG";
                intent.putExtra(strA04, i11);
                return;
            }
        }
        if (!IN.A0g(this.A04)) {
            intent.putExtra(strA04, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B(C1337Xw c1337Xw, C1402aB c1402aB, int i10) {
        if (i10 >= c1402aB.A0i()) {
            return;
        }
        C0855Ew c0855Ew = (C0855Ew) c1402aB.A0l(i10);
        C6O c6o = new C6O(c1337Xw);
        A0D = c6o;
        c6o.A0d(new C0945Il(c0855Ew.A0s(), c1337Xw.A09()));
        C05441p.A02(c1337Xw, A0D, c0855Ew);
        A0D.A0W(new F9(this, i10 == 0, c1337Xw, c0855Ew, c1402aB, i10), new C6H(c0855Ew.A0M(), A04(SyslogConstants.LOG_LOCAL3, 14, 91), i10));
    }

    private void A0C(boolean z10) {
        if (this.A05 == EnumC0970Jm.A0D) {
            A0E(z10);
            return;
        }
        EnumC0970Jm enumC0970Jm = this.A05;
        String[] strArr = A0F;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[4] = "1yOiFacRiwJanRzqDJ6A5hJ77lYfziAe";
        strArr2[5] = "McEelBumOV7dKb1zb6BdvUT5HG6VvrgI";
        if (enumC0970Jm == EnumC0970Jm.A0F) {
            A0F(z10);
        } else if (this.A05 == EnumC0970Jm.A0E) {
            A0D(z10);
        } else {
            A0F(z10);
        }
    }

    private void A0D(boolean z10) {
        C6O c6o = new C6O(this.A04);
        boolean z11 = IN.A1i(this.A04) && C06445o.A0A(this.A03.A0O());
        if (z11) {
            C06445o unifiedAssetsLoader = new C06445o(c6o, this.A03.A0O(), this.A03.A0K(), this.A03.A0M(), z11, new C1414aN(this));
            c6o.A0d(new C0945Il(((AbstractC1404aD) this.A03).A0s(), this.A04.A09()));
            unifiedAssetsLoader.A0B();
            return;
        }
        C05431o.A02(this.A04, (AbstractC1404aD) this.A03, z10, new C1413aM(this));
    }

    private void A0E(boolean z10) {
        C6O c6o = new C6O(this.A04);
        c6o.A0d(new C0945Il(((AbstractC1404aD) this.A03).A0s(), this.A04.A09()));
        C05441p.A03(this.A04, c6o, (C0855Ew) this.A03);
        c6o.A0W(new C1418aR(this), new C6H(this.A03.A0M(), A04(SyslogConstants.LOG_LOCAL3, 14, 91)));
    }

    private void A0F(boolean z10) {
        boolean z11 = false;
        if (this.A03.A0b()) {
            C1402aB c1402aB = (C1402aB) this.A03;
            for (int i10 = 0; i10 < c1402aB.A0i(); i10++) {
                if (TextUtils.isEmpty(c1402aB.A0l(i10).A0n().A0D().A08())) {
                    this.A01.ACf(this, AdError.INTERNAL_ERROR);
                    return;
                }
            }
            A0B(this.A04, c1402aB, 0);
            return;
        }
        C6O c6o = new C6O(this.A04);
        c6o.A0d(new C0945Il(((AbstractC1404aD) this.A03).A0s(), this.A04.A09()));
        if (IN.A1i(this.A04) && C06445o.A0A(this.A03.A0O())) {
            z11 = true;
        }
        boolean zA0c = this.A03.A0c();
        if (z11) {
            C06445o unifiedAssetsLoader = new C06445o(c6o, this.A03.A0O(), this.A03.A0K(), this.A03.A0M(), z11, new C1416aP(this, zA0c));
            unifiedAssetsLoader.A0B();
            return;
        }
        C0855Ew c0855Ew = (C0855Ew) this.A03;
        if (TextUtils.isEmpty(c0855Ew.A0n().A0D().A08())) {
            this.A01.ACf(this, AdError.INTERNAL_ERROR);
        } else {
            C05441p.A02(this.A04, c6o, c0855Ew);
            c6o.A0W(new FA(this, z10, zA0c, c0855Ew, this), new C6H(c0855Ew.A0M(), A04(SyslogConstants.LOG_LOCAL3, 14, 91)));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1408aH
    public final int A0G() {
        C1C c1c = this.A03;
        if (c1c != null) {
            return c1c.A0D();
        }
        String[] strArr = A0F;
        if (strArr[4].charAt(5) == strArr[5].charAt(5)) {
            throw new RuntimeException();
        }
        A0F[3] = "zy8kAWNFspHhc9OUOOhBHMIK4AaCMilm";
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1408aH
    public final C1C A0H() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1408aH
    public final boolean A0I() {
        if (!this.A0C.get()) {
            return false;
        }
        this.A03.A0Q(super.A01);
        String strA03 = PK.A03(super.A02, this.A0B, this.A07);
        this.A03.A0R(super.A02);
        this.A03.A0U(strA03);
        AdActivityIntent adActivityIntentA04 = KJ.A04(this.A04);
        adActivityIntentA04.putExtra(A04(174, 8, 91), this.A05);
        adActivityIntentA04.putExtra(A04(127, 25, 21), this.A03);
        adActivityIntentA04.putExtra(A04(34, 19, 20), this.A03);
        adActivityIntentA04.putExtra(A04(166, 8, 119), this.A0B);
        if (strA03 != null) {
            adActivityIntentA04.putExtra(A04(112, 15, 100), strA03);
        }
        adActivityIntentA04.putExtra(A04(66, 11, 2), this.A0A);
        adActivityIntentA04.putExtra(A04(101, 11, 8), this.A00);
        String str = this.A09;
        if (str != null) {
            adActivityIntentA04.putExtra(A04(53, 13, 87), str);
        }
        A09(adActivityIntentA04);
        adActivityIntentA04.setFlags(adActivityIntentA04.getFlags() | 268435456);
        ActivityUtils.A03(this.A04);
        try {
            KJ.A09(this.A04, adActivityIntentA04);
        } catch (KH e10) {
            Throwable cause = e10.getCause();
            KH cause2 = e10;
            if (cause != null) {
                cause2 = e10.getCause();
            }
            this.A04.A07().A9K(A04(23, 11, 115), C06937v.A01, new C06947w(cause2));
        }
        String[] strArr = A0F;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[1] = "L0ou65zbaEHIK9W1EiRqjH";
        strArr2[0] = "MlzKsAmmQguOmiSj0COpPP";
        return true;
    }

    public final void A0J(C1337Xw c1337Xw, AnonymousClass15 anonymousClass15, C05461r c05461r, boolean z10, String str, String str2) {
        this.A0C.set(false);
        this.A04 = c1337Xw;
        this.A01 = anonymousClass15;
        this.A0A = c05461r.A02();
        this.A00 = c05461r.A00();
        this.A09 = str2;
        String str3 = this.A0A;
        this.A07 = str3 != null ? str3.split(A04(0, 1, 25))[0] : A04(0, 0, 20);
        C1C c1cA00 = C1C.A00(c05461r.A03(), this.A04);
        this.A03 = c1cA00;
        c1cA00.A0S(str);
        this.A03.A0P(c05461r.A01().A06());
        if (this.A03.A0b()) {
            this.A08 = ((C1402aB) this.A03).A0n();
        } else {
            AbstractC1404aD abstractC1404aD = (AbstractC1404aD) this.A03;
            String[] strArr = A0F;
            String str4 = strArr[7];
            String str5 = strArr[6];
            int experienceType = str4.charAt(31);
            if (experienceType != str5.charAt(31)) {
                String[] strArr2 = A0F;
                strArr2[7] = "FFkeuuVk1meHqgTyMiNT7tgr8739x7mc";
                strArr2[6] = "JwuXN3bqyC9CcnquHiHDyzq7R0rb3kLZ";
                this.A08 = abstractC1404aD.A0s();
            } else {
                String[] strArr3 = A0F;
                strArr3[7] = "QuYSy7nqZhyT9avsyztjWhd8F7hW1wjU";
                strArr3[6] = "5b6UXiMlNaCol2aZqv4zpvCfEMtgCuxD";
                this.A08 = abstractC1404aD.A0s();
            }
        }
        boolean zA0c = this.A03.A0c();
        String[] strArr4 = A0F;
        if (strArr4[7].charAt(31) == strArr4[6].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr5 = A0F;
        strArr5[7] = "T6UzDEu82kzY1KsvV3iHB7OkWnIxnMBs";
        strArr5[6] = "PWXGgNcAlDXPEXP1mMx0dPQCA8p68UI5";
        if (zA0c) {
            this.A05 = EnumC0970Jm.A07;
            if (this.A03.A0Y()) {
                this.A04.A0E().AFK(EnumC05070d.A07);
            } else {
                this.A04.A0E().AFK(EnumC05070d.A09);
            }
        } else {
            switch (this.A03.A0C()) {
                case 0:
                    this.A05 = EnumC0970Jm.A0F;
                    C0S c0sA0E = this.A04.A0E();
                    int experienceType2 = A0F[3].charAt(29);
                    if (experienceType2 != 105) {
                        A0F[3] = "i1vVIMuEE2CogviWDEosGc55NgD83ibP";
                        c0sA0E.AFK(EnumC05070d.A0C);
                    } else {
                        A0F[2] = "e7mQJdX4ST7JevLzoIctPRomcGPYY6Su";
                        c0sA0E.AFK(EnumC05070d.A0C);
                    }
                    break;
                case 1:
                    this.A05 = EnumC0970Jm.A0E;
                    this.A04.A0E().AFK(EnumC05070d.A0B);
                    break;
                case 2:
                    this.A05 = EnumC0970Jm.A04;
                    this.A04.A0E().AFK(EnumC05070d.A04);
                    break;
                case 3:
                    this.A05 = EnumC0970Jm.A0D;
                    this.A04.A0E().AFK(EnumC05070d.A03);
                    break;
            }
        }
        if (IN.A0r(c1337Xw)) {
            if (this.A03.A0b()) {
                C1402aB c1402aB = (C1402aB) this.A03;
                for (int iA0i = c1402aB.A0i() - 1; iA0i >= 0; iA0i--) {
                    AbstractC1404aD abstractC1404aDA0l = c1402aB.A0l(iA0i);
                    if (C05140k.A06(this.A04, C05140k.A01(c1337Xw, abstractC1404aDA0l.A0O(), abstractC1404aDA0l.A0s()), c1337Xw.A09())) {
                        this.A04.A0E().A4G();
                        c1402aB.A0p(iA0i);
                        return;
                    }
                }
                if (c1402aB.A0i() == 0) {
                    this.A01.ACf(this, AdError.NO_FILL);
                    return;
                }
            } else if (C05140k.A06(this.A04, C05140k.A01(c1337Xw, c05461r.A03(), ((AbstractC1404aD) this.A03).A0s()), c1337Xw.A09())) {
                this.A04.A0E().A4G();
                this.A01.ACf(this, AdError.NO_FILL);
                return;
            }
        }
        this.A02 = new AnonymousClass16(this.A0B, this, anonymousClass15);
        A06();
        A0C(z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05170o
    public final String A6M() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05170o
    public final boolean AFh() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05170o
    public final void onDestroy() {
        A07();
    }
}
