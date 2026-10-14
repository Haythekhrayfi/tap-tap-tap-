package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1239Tz extends K4 {
    public static byte[] A02;
    public static String[] A03 = {"jAsZfZwQ15YE1xm95Uum6vWOaDH1Az8A", "fi77qJmjg5Rwb", "EORDPJJatEjTyV", "9q4WoxWSHvvys", "ZnqFv4LDFQ916SUcrxzb43hFVVFJOLFp", "nu1Fhr1q5Uq1RKDrD4GP42DLl0Uj", "wJhiR1cxoop1phUk5wYOXEGX7ooerIC3", "cvoiCCK"};
    public final /* synthetic */ C0962Jd A00;
    public final /* synthetic */ C0964Jg A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 119);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 75, 89, 68, 71, 72, 72, 67, 84, 89, 77, 67, 95, 101, 68, 11, 69, 78, 95, 92, 68, 89, 64, 11, 72, 68, 69, 69, 78, 72, 95, 66, 68, 69};
    }

    static {
        A02();
    }

    public C1239Tz(C0964Jg c0964Jg, C0962Jd c0962Jd) {
        this.A01 = c0964Jg;
        this.A00 = c0962Jd;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        if (LD.A00(this.A01.A04) != LC.A07) {
            AnonymousClass84.A08(this.A01.A04);
            AnonymousClass60.A07(this.A01.A04);
            boolean z10 = true;
            Map<String, String> mapA08 = this.A00.A08(C8Q.A00().A01(this.A01.A04, true).A0C());
            this.A01.A02 = mapA08;
            try {
                PackageManager packageManager = this.A01.A04.getPackageManager();
                if (packageManager != null) {
                    mapA08.put(A00(1, 12, 113), new String(Base64.encode((this.A01.A04.getPackageName() + A00(0, 1, 93) + packageManager.getInstallerPackageName(this.A01.A04.getPackageName())).getBytes(), 2)));
                }
            } catch (Exception unused) {
            }
            try {
                if (this.A00.A05() != JI.A03 && this.A00.A05() != JI.A05 && this.A00.A05() != JI.A04 && this.A00.A05() != null) {
                    z10 = false;
                }
                QX qxA02 = C1152Qp.A02(z10, this.A01.A04);
                String str = this.A01.A06;
                C1148Ql c1148Ql = new C1148Ql();
                Map<String, String> adRequestParameters = this.A01.A02;
                qxA02.ADf(str, c1148Ql.A05(adRequestParameters).A08(), this.A01.A02(LF.A00(), this.A00));
                return;
            } catch (Exception e10) {
                AdErrorType adRequestFailed = AdErrorType.AD_REQUEST_FAILED;
                String message = e10.getMessage();
                C0S c0sA0E = this.A01.A04.A0E();
                if (A03[5].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[3] = "KP51TgwZ8p9oo";
                strArr[2] = "i0Q8y5VFLDaPT7";
                c0sA0E.A2q(LF.A01(this.A01.A00), adRequestFailed.getErrorCode(), message, adRequestFailed.isPublicError());
                this.A01.A0D(JD.A01(adRequestFailed, message));
                return;
            }
        }
        this.A01.A09();
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = A00(13, 21, 92);
        this.A01.A04.A0E().A2q(LF.A01(this.A01.A00), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A01.A0D(new JD(adErrorType, errorMessage));
    }
}
