package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1237Tx implements QY {
    public static byte[] A03;
    public final /* synthetic */ long A00;
    public final /* synthetic */ C0962Jd A01;
    public final /* synthetic */ C0964Jg A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{97, 51, 52, 100, 52, 104, 97, 49, 17, 65, 16, 17, 17, 69, 67, 23, 1, Ascii.CAN, 4, 5, 14, 51, 40, 46, 59, 63, 34, 36, 37, 113, 107, 108, 90, 77, 73, 90, 77, Ascii.US, 90, 77, 77, 80, 77, Ascii.US, 80, 92, 92, 74, 77, 77, 90, 91, 75, 125, 106, 110, 125, 106, 56, 106, 125, 104, 116, 113, 125, 124, 56, 107, 109, 123, 123, 125, 107, 107, 126, 109, 116, 116, 97, 75, 74, 103, 75, 73, 84, 72, 65, 80, 65, 95, 94, 117, 66, 66, 95, 66};
    }

    public C1237Tx(C0964Jg c0964Jg, C0962Jd c0962Jd, long j10) {
        this.A02 = c0964Jg;
        this.A01 = c0962Jd;
        this.A00 = j10;
    }

    private final void A02(C1147Qk c1147Qk) {
        Jc.A06(this.A01);
        try {
            QW response = c1147Qk.A00();
            if (response != null) {
                String strA63 = response.A63();
                C0967Jj serverResponse = this.A02.A05.A06(this.A02.A04, strA63, this.A00);
                if (serverResponse.A01() == EnumC0966Ji.A03) {
                    C1234Tt c1234Tt = (C1234Tt) serverResponse;
                    String strA04 = c1234Tt.A04();
                    AdErrorType adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1234Tt.A03(), AdErrorType.ERROR_MESSAGE);
                    if (strA04 != null) {
                        strA63 = strA04;
                    }
                    this.A02.A04.A0E().A2q(LF.A01(this.A02.A00), adErrorTypeAdErrorTypeFromCode.getErrorCode(), strA63, adErrorTypeAdErrorTypeFromCode.isPublicError());
                    this.A02.A0D(JD.A01(adErrorTypeAdErrorTypeFromCode, strA63));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String errorMessage = c1147Qk.getMessage();
            this.A02.A04.A0E().A2q(LF.A01(this.A02.A00), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
            this.A02.A0D(JD.A01(adErrorType, errorMessage));
        } catch (JSONException e10) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String errorMessage2 = c1147Qk.getMessage();
            this.A02.A04.A0E().A2q(LF.A01(this.A02.A00), adErrorType2.getErrorCode(), A00(16, 15, 65) + e10.getMessage(), adErrorType2.isPublicError());
            this.A02.A0D(JD.A01(adErrorType2, errorMessage2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.QY
    public final void AAj(QW qw) {
        JR.A05(A00(79, 10, 46), A00(52, 27, 18), A00(8, 8, 45));
        if (qw != null) {
            String strA63 = qw.A63();
            Jc.A06(this.A01);
            this.A02.A0N(strA63, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QY
    public final void AB7(Exception exc) {
        JR.A05(A00(89, 7, 58), A00(31, 21, 53), A00(0, 8, 90));
        if (C1147Qk.class.equals(exc.getClass())) {
            A02((C1147Qk) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        this.A02.A04.A0E().A2q(LF.A01(this.A02.A00), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0D(JD.A01(adErrorType, errorMessage));
    }
}
