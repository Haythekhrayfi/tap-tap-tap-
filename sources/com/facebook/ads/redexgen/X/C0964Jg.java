package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0964Jg {
    public static byte[] A07;
    public static final LR A08;
    public static final Executor A09;
    public long A00;
    public Jf A01;
    public Map<String, String> A02;
    public final C2E A03;
    public final C1337Xw A04;
    public final C0965Jh A05;
    public final String A06;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{57, 111, 56, 107, 105, 62, 59, 110, 122, 105, 107, 119, 117, 78, 65, 68, 72, 67, 89, 82, 95, 72, 92, 88, 72, 94, 89, 82, 68, 73, 98, 88, 11, 121, 101, 17, 11, 100, 101, 10, 108, 99, 102, 102, 10, 88, 79, 73, 79, 67, 92, 79, 78, 20, 53, 122, Ascii.FS, 51, 54, 54, 122, 63, 40, 40, 53, 40, 122, 57, 53, 62, 63, 122, 1, Ascii.DEL, 41, 7, 122, Ascii.DEL, 41, 15, 13, 6, 13, Ascii.SUB, 1, 11, 81, 90, 75, 72, 80, 77, 84, 40, 41, 0, 47, 42, 42, 14, 41, 41, 45};
    }

    static {
        A0A();
        LR lr = new LR();
        A08 = lr;
        A09 = Executors.newCachedThreadPool(lr);
    }

    public C0964Jg(C1337Xw c1337Xw) {
        this(c1337Xw, C2F.A00(c1337Xw.A01()));
    }

    public C0964Jg(C1337Xw c1337Xw, C2E c2e) {
        this.A00 = -1L;
        this.A04 = c1337Xw;
        this.A05 = C0965Jh.A00();
        this.A06 = C0968Jk.A01(c1337Xw);
        this.A03 = c2e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1237Tx A02(long j10, C0962Jd c0962Jd) {
        return new C1237Tx(this, c0962Jd, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        C1337Xw c1337Xw = this.A04;
        if (c1337Xw == null || !C1152Qp.A0A(c1337Xw)) {
            return;
        }
        C06947w c06947w = new C06947w(A05(8, 5, 107));
        c06947w.A03(1);
        this.A04.A07().A9K(A05(86, 7, 111), C06937v.A1w, c06947w);
    }

    private void A0B(int i10, String str) {
        String strA05 = A05(93, 10, 22);
        JR.A05(strA05, A05(37, 16, 122), A05(0, 8, 90));
        JR.A04(strA05, String.format(Locale.US, A05(53, 26, 10), Integer.valueOf(i10), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(JD jd2) {
        Jf jf = this.A01;
        if (jf != null) {
            jf.AB6(jd2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(JD jd2) {
        LI.A00(new C1236Tv(this, jd2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(C1235Tu c1235Tu) {
        Jf jf = this.A01;
        if (jf != null) {
            jf.ACu(c1235Tu);
        }
    }

    private void A0L(C1235Tu c1235Tu) {
        C7W syncModule;
        LI.A00(new Tw(this, c1235Tu));
        if (IN.A21(this.A04) && (syncModule = this.A04.A05()) != null) {
            syncModule.A5h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(String str, long j10, C0962Jd c0962Jd) {
        String str2;
        try {
            try {
                C0967Jj c0967JjA06 = this.A05.A06(this.A04, str, j10);
                C8D c8dA00 = c0967JjA06.A00();
                if (c8dA00 != null) {
                    IN.A0Q(this.A04).A2R(c8dA00.A08());
                    this.A04.A07().A9q();
                    this.A03.A0N(c8dA00.A06());
                    Jc.A05(c8dA00.A05().A0B(), c0962Jd);
                    C1009Lc.A01(this.A04, A09, c8dA00);
                    C06947w c06947w = new C06947w(A05(30, 7, 123) + C0995Ko.A02());
                    c06947w.A04(1);
                    c06947w.A08(false);
                    this.A04.A07().A9k(A05(79, 7, 56), C06937v.A1W, c06947w);
                }
                switch (C0963Je.A00[c0967JjA06.A01().ordinal()]) {
                    case 1:
                        C1235Tu c1235Tu = (C1235Tu) c0967JjA06;
                        if (c8dA00 != null) {
                            if (c8dA00.A05().A0E()) {
                                Jc.A07(str, c0962Jd);
                            }
                            Map<String, String> map = this.A02;
                            if (map != null) {
                                str2 = map.get(A05(13, 17, 93));
                            } else {
                                str2 = null;
                            }
                            if (!TextUtils.isEmpty(c0967JjA06.A02()) && !TextUtils.isEmpty(str2)) {
                                this.A04.A02().AEa(this.A04, str2, c0967JjA06.A02());
                            }
                        }
                        this.A04.A0E().A2r(LF.A01(this.A00));
                        A0L(c1235Tu);
                        break;
                    case 2:
                        C1234Tt c1234Tt = (C1234Tt) c0967JjA06;
                        String strA04 = c1234Tt.A04();
                        AdErrorType adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1234Tt.A03(), AdErrorType.ERROR_MESSAGE);
                        A0B(c1234Tt.A03(), strA04);
                        if (strA04 == null) {
                            strA04 = str;
                        }
                        this.A04.A0E().A2q(LF.A01(this.A00), adErrorTypeAdErrorTypeFromCode.getErrorCode(), strA04, adErrorTypeAdErrorTypeFromCode.isPublicError());
                        A0D(JD.A01(adErrorTypeAdErrorTypeFromCode, strA04));
                        break;
                    default:
                        AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                        this.A04.A0E().A2q(LF.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                        A0D(JD.A01(adErrorType, str));
                        break;
                }
            } catch (Exception e10) {
                e = e10;
                String message = e.getMessage();
                AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
                this.A04.A0E().A2q(LF.A01(this.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
                A0D(JD.A01(adErrorType2, message));
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j10, C0962Jd c0962Jd) {
        A09.execute(new C1238Ty(this, str, j10, c0962Jd));
    }

    public final void A0O(C0962Jd c0962Jd) {
        this.A00 = System.currentTimeMillis();
        AnonymousClass84.A0B(this.A04);
        if (Jc.A08(c0962Jd)) {
            LT.A06.execute(new U0(this));
            String strA02 = Jc.A02(c0962Jd);
            if (strA02 != null) {
                this.A04.A0E().AFx();
                A0N(strA02, 0L, c0962Jd);
                return;
            } else {
                AdErrorType adErrorType = AdErrorType.LOAD_TOO_FREQUENTLY;
                this.A04.A0E().A2q(LF.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage(), adErrorType.isPublicError());
                A0D(JD.A01(adErrorType, null));
                return;
            }
        }
        A09.execute(new C1239Tz(this, c0962Jd));
    }

    public final void A0P(Jf jf) {
        this.A01 = jf;
    }
}
