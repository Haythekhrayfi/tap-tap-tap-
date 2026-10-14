package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1377Zm implements AnonymousClass15 {
    public static byte[] A02;
    public static String[] A03 = {"gOGPE1XGqnroAJihU7XGAfTAdWa21jWC", "Kcs30m2Uc1eFMAQARd2pOhOOSRswugkg", "xkwB", "vFLx4ryI8nKhSFQKGVnAMH5qObxMihWN", "NnwKyO2XMzRH0BXfVduboZ9DAJ5a5svW", "U3uRLxNZuwH", "U9y6Wp3Jad2LD1", "sOAhAPVwmiqriGnbgM61Uai8lTIQh97W"};
    public final /* synthetic */ ET A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{94, 95, 3, 85, 83, 7, 82, 112, 71, 85, 67, 80, 70, 71, 70, 2, 116, 75, 70, 71, 77, 2, 75, 79, 82, 80, 71, 81, 81, 75, 77, 76, 2, 68, 75, 80, 71, 70, 70, 71, 123, 76, 94, 72, 91, 77, 76, 77, Ascii.DEL, 64, 77, 76, 70, 104, 77, 101, 70, 78, 78, 64, 71, 78, 96, 68, 89, 91, 76, 90, 90, 64, 70, 71};
    }

    static {
        A01();
    }

    public C1377Zm(ET et, Runnable runnable) {
        this.A00 = et;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void ACZ(AbstractC1408aH abstractC1408aH) {
        this.A00.A06.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void ACa(AbstractC1408aH abstractC1408aH) {
        this.A00.A06.A07();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void ACb(AbstractC1408aH abstractC1408aH) {
        this.A00.A06.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void ACc(AbstractC1408aH abstractC1408aH) {
        this.A00.A0E().removeCallbacks(this.A01);
        this.A00.A01 = abstractC1408aH;
        this.A00.A0H();
        this.A00.A06.A0F(abstractC1408aH);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void ACd(AbstractC1408aH abstractC1408aH) {
        JR.A05(A00(38, 34, 72), A00(7, 31, 67), A00(0, 7, 7));
        this.A00.A06.A0D();
        this.A00.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void ACe(AbstractC1408aH abstractC1408aH) {
        this.A00.A06.A08();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void ACf(AbstractC1408aH abstractC1408aH, AdError adError) {
        this.A00.A0E().removeCallbacks(this.A01);
        this.A00.A0B.A0E().A4o(adError.getErrorCode(), adError.getErrorMessage());
        if (AdError.AD_PRESENTATION_ERROR.equals(adError) && IN.A1V(this.A00.A0B)) {
            this.A00.A06.A0G(JD.A00(AdErrorType.AD_PRESENTATION_ERROR));
        } else {
            AdError adError2 = AdError.NO_FILL;
            if (A03[2].length() != 4) {
                throw new RuntimeException();
            }
            A03[2] = "s57s";
            if (adError2.equals(adError)) {
                this.A00.A06.A0G(JD.A00(AdErrorType.NO_FILL));
            } else {
                this.A00.A06.A0G(JD.A00(AdErrorType.INTERNAL_ERROR));
            }
        }
        this.A00.A0M(abstractC1408aH);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void onRewardedVideoActivityDestroyed() {
        this.A00.A06.A09();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass15
    public final void onRewardedVideoClosed() {
        this.A00.A06.A0A();
    }
}
