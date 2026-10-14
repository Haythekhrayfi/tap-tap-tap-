package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1368Zc implements InterfaceC05531y {
    public static byte[] A0B;
    public static String[] A0C = {"Q9RghtL5kPMxXUG2hlpmHrVaJwYYGwGq", "TIO3FaU0Mikock0w3rckrPhiuYRMfGhJ", "k6SAISDvmHdOF1rkjeEeymm6HvDlJVR0", "eDRhFd25R2oFsFg27vb0d5UADzs1KoZv", "MaVPWgska1IH7XOKtPwNB8GdxIWUIxDt", "dS1g8OO0fBonmOwqVSSlXi39LbvMIXQb", "JdFW5Fpsu4G", "QGzwgj8zvaLwI8"};
    public static final String A0D;
    public InterstitialAd A01;
    public C1C A02;
    public C0853Eu A03;
    public C1348Yh A04;
    public boolean A06;
    public boolean A07;
    public final C1337Xw A08;
    public final InterstitialAdExtendedListener A09;
    public final AnonymousClass21 A0A;
    public long A00 = -1;
    public LG A05 = new LG();

    public static String A0A(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 110);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0B = new byte[]{-59, -14, -92, -27, -24, -92, -16, -13, -27, -24, -92, -19, -9, -92, -27, -16, -10, -23, -27, -24, -3, -92, -19, -14, -92, -12, -10, -13, -21, -10, -23, -9, -9, -78, -92, -35, -13, -7, -92, -9, -20, -13, -7, -16, -24, -92, -5, -27, -19, -8, -92, -22, -13, -10, -92, -27, -24, -48, -13, -27, -24, -23, -24, -84, -83, -92, -8, -13, -92, -26, -23, -92, -25, -27, -16, -16, -23, -24, -4, 33, 39, Ascii.CAN, 37, 38, 39, Ascii.FS, 39, Ascii.FS, 20, Ascii.US, -45, Ascii.US, 34, 20, 23, -45, 22, 20, Ascii.US, Ascii.US, Ascii.CAN, 23, -45, 42, Ascii.ESC, Ascii.FS, Ascii.US, Ascii.CAN, -45, 38, Ascii.ESC, 34, 42, Ascii.FS, 33, Ascii.SUB, -45, Ascii.FS, 33, 39, Ascii.CAN, 37, 38, 39, Ascii.FS, 39, Ascii.FS, 20, Ascii.US, -31, 13, Ascii.FS, 21};
    }

    static {
        A0B();
        A0D = C1368Zc.class.getSimpleName();
    }

    public C1368Zc(AnonymousClass21 anonymousClass21, AnonymousClass28 anonymousClass28, String str) {
        this.A0A = anonymousClass21;
        this.A08 = anonymousClass21.A05();
        this.A09 = new ZT(str, anonymousClass28, this);
    }

    public final long A0E() {
        C0853Eu c0853Eu = this.A03;
        if (c0853Eu != null) {
            return c0853Eu.A0D();
        }
        return -1L;
    }

    public final void A0F() {
        C0853Eu c0853Eu = this.A03;
        if (c0853Eu != null) {
            c0853Eu.A0O(new C1369Zd(this));
            this.A03.A0T(true);
            this.A03 = null;
            this.A07 = false;
            this.A06 = false;
        }
    }

    public final void A0G() {
        C1348Yh c1348Yh = this.A04;
        if (c1348Yh != null) {
            c1348Yh.A02();
        }
    }

    public final void A0H(AdCompanionView adCompanionView) {
        C1C c1c;
        C1348Yh c1348Yh = (C1348Yh) adCompanionView.getAdCompanionViewApi();
        this.A04 = c1348Yh;
        C1337Xw c1337Xw = this.A08;
        if (c1337Xw != null && (c1c = this.A02) != null && (c1c instanceof AbstractC1404aD)) {
            c1348Yh.A03(c1337Xw, (AbstractC1404aD) c1c);
        }
    }

    public final void A0I(EnumSet<CacheFlag> enumSet, String str) {
        String strA02;
        this.A00 = System.currentTimeMillis();
        if (!this.A07 && this.A03 != null) {
            Log.w(A0D, A0A(0, 78, 22));
        }
        this.A07 = false;
        if (this.A06 && !IN.A0h(this.A08)) {
            this.A08.A07().A9K(A0A(130, 3, 62), C06937v.A0L, new C06947w(A0A(78, 52, 69)));
            AdErrorType adErrorType = AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD;
            this.A08.A0E().A2h(LF.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            this.A09.onError(this.A0A.A01(), new AdError(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage()));
            return;
        }
        C0853Eu c0853Eu = this.A03;
        if (c0853Eu != null) {
            c0853Eu.A0O(new C1372Zh(this));
            this.A03.A0J();
            this.A03 = null;
        }
        C05451q c05451q = new C05451q(this.A0A.A09(), JK.A00(this.A08.getResources().getDisplayMetrics()), AdPlacementType.INTERSTITIAL, JG.A07, 1, enumSet);
        if (IN.A23(this.A08) && (strA02 = KX.A02(this.A08, this.A0A.A07())) != null) {
            AnonymousClass21 anonymousClass21 = this.A0A;
            if (A0C[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "6YCA3PHZSlLj0jmN2b2hvaW99ZyRMwjh";
            strArr[5] = "7PoIPIeUN8KAt8vfreK3c69iBAU82q7R";
            anonymousClass21.A0H(strA02);
        }
        c05451q.A06(this.A0A.A07());
        c05451q.A07(this.A0A.A08());
        c05451q.A04(this.A0A.A03());
        C0853Eu c0853Eu2 = new C0853Eu(this.A08, c05451q);
        this.A03 = c0853Eu2;
        c0853Eu2.A0O(new C1370Ze(this));
        this.A03.A0R(str);
    }

    public final boolean A0J() {
        C0853Eu c0853Eu = this.A03;
        return c0853Eu == null || c0853Eu.A0U();
    }

    public final boolean A0K() {
        return this.A07;
    }

    public final boolean A0L() {
        AdError adError = AdError.SHOW_CALLED_BEFORE_LOAD_ERROR;
        if (!this.A07) {
            this.A08.A0E().A2h(LF.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A09.onError(this.A0A.A01(), adError);
            return false;
        }
        C0853Eu c0853Eu = this.A03;
        if (c0853Eu == null) {
            this.A08.A07().A9K(A0A(130, 3, 62), C06937v.A0S, new C06947w(AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL.getDefaultErrorMessage()));
            this.A08.A0E().A2h(LF.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A09.onError(this.A0A.A01(), adError);
            return false;
        }
        c0853Eu.A0I();
        this.A06 = true;
        this.A07 = false;
        return true;
    }
}
