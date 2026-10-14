package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1367Zb extends AbstractC05180p {
    public static byte[] A01;
    public static String[] A02 = {"7kSkrPID5YMo1WnvaMIgpKB6WIhQPZTc", "kYnVnFR0h3Yv", "", "4OZGrpocgzJPR2XOpe36kiptmUtlR1IY", "AELVZqmE3v", "ezzX0t3o6v3ClFiCUOYeN27kq8G", "mBbxV2ZqaJcWXY", "eL94qTtIFL"};
    public final /* synthetic */ ZZ A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-28, -13, -20, -53, -41, -42, -36, -38, -41, -44, -44, -51, -38, -120, -47, -37, -120, -42, -35, -44, -44};
    }

    static {
        A01();
    }

    public C1367Zb(ZZ zz) {
        this.A00 = zz;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A06() {
        this.A00.A0A.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A07() {
        this.A00.A0A.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A08() {
        if (this.A00.A03 == null) {
            this.A00.A0A.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A09() {
        if (this.A00.A03 == null) {
            this.A00.A0A.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0A() {
        if (this.A00.A03 != null) {
            C06415l c06415l = (C06415l) this.A00.A03.buildShowAdConfig();
            c06415l.A02(System.currentTimeMillis() - this.A00.A02);
            this.A00.A03.show(c06415l.build());
        } else {
            this.A00.A0A.onRewardedVideoClosed();
            this.A00.A07.A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0C() {
        this.A00.A09.A0E().A2e();
        this.A00.A0A.onAdClicked(this.A00.A0B.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0D() {
        this.A00.A0A.onLoggingImpression(this.A00.A0B.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0F(InterfaceC05170o interfaceC05170o) {
        if (this.A00.A05 == null) {
            this.A00.A09.A07().A9K(A00(0, 3, 70), C06937v.A0N, new C06947w(A00(3, 18, 43)));
            return;
        }
        AbstractC1408aH abstractC1408aH = (AbstractC1408aH) interfaceC05170o;
        if (this.A00.A0B.A03 != null) {
            abstractC1408aH.A02(this.A00.A0B.A03);
        }
        AnonymousClass25 anonymousClass25 = this.A00.A0B;
        int iA0G = abstractC1408aH.A0G();
        String[] strArr = A02;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "61YjDYRNNN";
        strArr2[7] = "vT3ubuaNP5";
        anonymousClass25.A00 = iA0G;
        this.A00.A08 = true;
        ZZ zz = this.A00;
        zz.A04 = zz.A05.A0F();
        if (this.A00.A04 != null) {
            int iA0l = 0;
            if (!this.A00.A04.A0b()) {
                iA0l = ((AbstractC1404aD) this.A00.A04).A0l();
            }
            if (iA0l > 0) {
                KX chainer = new KX();
                if (chainer.A09(this.A00.A09, this.A00.A0B.A06, iA0l)) {
                    chainer.A08(this.A00.A09, true);
                    ZZ zz2 = this.A00;
                    zz2.A03 = chainer.A07(zz2.A09, this.A00.A0B.A0C, this.A00.A0B.A06);
                } else {
                    ZZ zz3 = this.A00;
                    String[] strArr3 = A02;
                    if (strArr3[4].length() != strArr3[7].length()) {
                        String[] strArr4 = A02;
                        strArr4[4] = "df15N9yr5s";
                        strArr4[7] = "rrfEFjVt4q";
                        chainer.A08(zz3.A09, false);
                    } else {
                        String[] strArr5 = A02;
                        strArr5[1] = "7AaEv1vCH3bw";
                        strArr5[5] = "Y1uo0lYkjhkOAjcvNvodbhiOq3C";
                        chainer.A08(zz3.A09, false);
                    }
                }
            }
        }
        if (this.A00.A03 != null) {
            ((AbstractC1404aD) this.A00.A04).A0x(true);
            RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = this.A00.A03.buildLoadAdConfig().withFailOnCacheFailureEnabled(true).withRewardData(this.A00.A04.A0F()).withAdExperience(this.A00.A0B.A02).withAdListener(new RewardedVideoAdListener() { // from class: com.facebook.ads.redexgen.X.20
                @Override // com.facebook.ads.AdListener
                public final void onAdClicked(com.facebook.ads.Ad ad2) {
                }

                @Override // com.facebook.ads.AdListener
                public final void onAdLoaded(com.facebook.ads.Ad ad2) {
                    this.A00.A00.A0A.onAdLoaded(this.A00.A00.A0B.A00());
                }

                @Override // com.facebook.ads.AdListener
                public final void onError(com.facebook.ads.Ad ad2, AdError adError) {
                    this.A00.A00.A03 = null;
                    ((AbstractC1404aD) this.A00.A00.A04).A0x(false);
                    this.A00.A00.A0A.onAdLoaded(this.A00.A00.A0B.A00());
                }

                @Override // com.facebook.ads.AdListener
                public final void onLoggingImpression(com.facebook.ads.Ad ad2) {
                }

                @Override // com.facebook.ads.RewardedVideoAdListener
                public final void onRewardedVideoClosed() {
                    this.A00.A00.A0A.onRewardedVideoClosed();
                    this.A00.A00.A07.A05();
                }

                @Override // com.facebook.ads.RewardedVideoAdListener
                public final void onRewardedVideoCompleted() {
                    this.A00.A00.A0A.onRewardedVideoCompleted();
                }
            }).build();
            this.A00.A03.loadAd(loadAdConfig);
            return;
        }
        this.A00.A0A.onAdLoaded(this.A00.A0B.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0G(JD jd2) {
        this.A00.A0E(true);
        this.A00.A0B.A0B.A0E().A2h(LF.A01(this.A00.A01), jd2.A03().getErrorCode(), jd2.A04());
        this.A00.A0A.onError(this.A00.A0B.A00(), KZ.A00(jd2));
    }
}
