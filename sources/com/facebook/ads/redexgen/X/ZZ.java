package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZZ implements InterfaceC05531y {
    public static byte[] A0C;
    public static String[] A0D = {"gd6Snq8TqC5qGLc", "5Vo8FrFWo5Fl4YG5W1yHT6ZfMsOXSACT", "HYpFHiAeuVvng5d4eXQK0awgijL0SEef", "zgL9OdntC9Jt", "c4pha1QVXZPHNWU", "oPtBq8V8zceab2K03f0YSkruz1vfGvQp", "tGZii7gSURWSZ1CI0FSKqsks", "YmWpveYB3lCv"};
    public static final String A0E;
    public long A02;
    public RewardedVideoAd A03;
    public C1C A04;
    public ET A05;
    public C1348Yh A06;
    public final C1337Xw A09;
    public final S2SRewardedVideoAdExtendedListener A0A;
    public final AnonymousClass25 A0B;
    public int A00 = 0;
    public boolean A08 = false;
    public long A01 = -1;
    public LG A07 = new LG();

    public static String A0A(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0C = new byte[]{120, 87, Ascii.EM, 88, 93, Ascii.EM, 85, 86, 88, 93, Ascii.EM, 80, 74, Ascii.EM, 88, 85, 75, 92, 88, 93, 64, Ascii.EM, 80, 87, Ascii.EM, 73, 75, 86, 94, 75, 92, 74, 74, 23, Ascii.EM, 96, 86, 76, Ascii.EM, 74, 81, 86, 76, 85, 93, Ascii.EM, 78, 88, 80, 77, Ascii.EM, 95, 86, 75, Ascii.EM, 88, 93, 117, 86, 88, 93, 92, 93, 17, 16, Ascii.EM, 77, 86, Ascii.EM, 91, 92, Ascii.EM, 90, 88, 85, 85, 92, 93, 47, Ascii.CAN, Ascii.CAN, 5, Ascii.CAN, 74, 6, 5, 11, 14, 3, 4, 13, 74, Ascii.CAN, 15, Ascii.GS, 11, Ascii.CAN, 14, 15, 14, 74, Ascii.FS, 3, 14, 15, 5, 74, 11, 14, 92, 77, 84};
        if (A0D[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[4] = "OGOVhUIoezz1oHK";
        strArr[0] = "xl2MkcRK0CWEWUY";
    }

    static {
        A0B();
        A0E = ZZ.class.getSimpleName();
    }

    public ZZ(AnonymousClass25 anonymousClass25, AnonymousClass28 anonymousClass28, String str) {
        this.A0B = anonymousClass25;
        this.A09 = anonymousClass25.A0B;
        this.A0A = new ZS(str, anonymousClass28, this, anonymousClass25);
    }

    private void A0D(String str, AdExperienceType adExperienceType, boolean z10) {
        String strA02;
        if (!this.A08 && this.A05 != null) {
            Log.w(A0E, A0A(0, 78, 100));
        }
        A0E(false);
        this.A08 = false;
        C05451q c05451q = new C05451q(this.A0B.A0C, JI.A06, AdPlacementType.REWARDED_VIDEO, JG.A07, 1);
        c05451q.A08(z10);
        if (IN.A23(this.A09) && (strA02 = KX.A02(this.A09, this.A0B.A06)) != null) {
            AnonymousClass25 anonymousClass25 = this.A0B;
            String[] strArr = A0D;
            String extraHints = strArr[2];
            if (extraHints.charAt(28) != strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            A0D[6] = "NRWBzlFLQPOGySbiiYXSLDN6";
            anonymousClass25.A06 = strA02;
        }
        c05451q.A06(this.A0B.A06);
        c05451q.A07(this.A0B.A07);
        ET et = new ET(this.A0B.A0B, c05451q);
        this.A05 = et;
        et.A0O(new C1367Zb(this));
        this.A05.A0S(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(boolean z10) {
        ET et = this.A05;
        if (et != null) {
            et.A0O(new C1366Za(this));
            this.A05.A0T(z10);
            this.A05 = null;
        }
    }

    public final long A0G() {
        ET et = this.A05;
        if (et != null) {
            return et.A0D();
        }
        return -1L;
    }

    public final void A0H() {
        A0E(true);
    }

    public final void A0I() {
        C1348Yh c1348Yh = this.A06;
        if (c1348Yh != null) {
            c1348Yh.A02();
        }
    }

    public final void A0J(RewardData rewardData) {
        ET et;
        this.A0B.A03 = rewardData;
        if (this.A08 && (et = this.A05) != null) {
            et.A0V(rewardData);
        }
    }

    public final void A0K(AdCompanionView adCompanionView) {
        C1C c1c;
        C1348Yh c1348Yh = (C1348Yh) adCompanionView.getAdCompanionViewApi();
        this.A06 = c1348Yh;
        C1337Xw c1337Xw = this.A09;
        if (c1337Xw != null && (c1c = this.A04) != null) {
            c1348Yh.A03(c1337Xw, (AbstractC1404aD) c1c);
        }
    }

    public final void A0L(String str, AdExperienceType adExperienceType, boolean z10) {
        this.A01 = System.currentTimeMillis();
        try {
            A0D(str, adExperienceType, z10);
        } catch (Exception e10) {
            Log.e(A0E, A0A(78, 31, 55), e10);
            this.A0B.A0B.A07().A9K(A0A(109, 3, 96), C06937v.A0b, new C06947w(e10));
            AdError adErrorInternalError = AdError.internalError(AdError.INTERNAL_ERROR_2004);
            this.A0B.A0B.A0E().A2h(LF.A01(this.A01), adErrorInternalError.getErrorCode(), adErrorInternalError.getErrorMessage());
            this.A0A.onError(this.A0B.A00(), adErrorInternalError);
        }
    }

    public final boolean A0M() {
        ET et = this.A05;
        return et == null || et.A0U();
    }

    public final boolean A0N() {
        return this.A08;
    }

    public final boolean A0O(int i10, long j10) {
        if (!this.A08) {
            this.A0A.onError(this.A0B.A00(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        }
        if (this.A05 != null) {
            this.A02 = System.currentTimeMillis();
            this.A05.A07.A02(i10);
            this.A05.A07.A03(j10);
            this.A05.A0I();
            this.A08 = false;
            return true;
        }
        this.A08 = false;
        return false;
    }
}
