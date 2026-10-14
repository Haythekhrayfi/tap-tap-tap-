package com.facebook.ads.redexgen.X;

import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1370Ze extends AbstractC05180p {
    public static byte[] A01;
    public static String[] A02 = {"", "lR4UvBki6PSdVcLREjEHAbqRd1OmLUQf", "DjKPGQUWmMf7x", "ODfaPUPPzX7KhktdCz15RADFZIjUcUTH", "SOtQhTlfKwNvvZXzwoqU2I3z2iEV30z7", "BHtVd6ktyCMEATMZK8J5wjGrCvXYI9tG", "P8UTzFKpwpJ94", "IxNcf87J3g"};
    public final /* synthetic */ C1368Zc A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{99, 114, 107, Ascii.GS, 17, 16, 10, 12, 17, 18, 18, Ascii.ESC, 12, 94, 23, 13, 94, 16, 11, 18, 18};
    }

    static {
        A01();
    }

    public C1370Ze(C1368Zc c1368Zc) {
        this.A00 = c1368Zc;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A02() {
        if (this.A00.A01 == null) {
            this.A00.A06 = false;
            this.A00.A09.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A04() {
        if (this.A00.A01 != null) {
            this.A00.A01.show();
            return;
        }
        this.A00.A06 = false;
        if (this.A00.A03 != null) {
            this.A00.A03.A0O(new Zf(this));
            this.A00.A03.A0J();
            this.A00.A03 = null;
        }
        this.A00.A09.onInterstitialDismissed(this.A00.A0A.A01());
        this.A00.A05.A05();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A05() {
        this.A00.A09.onInterstitialDisplayed(this.A00.A0A.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A06() {
        this.A00.A09.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A07() {
        this.A00.A09.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A08() {
        this.A00.A09.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0C() {
        this.A00.A08.A0E().A2e();
        this.A00.A09.onAdClicked(this.A00.A0A.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0D() {
        this.A00.A09.onLoggingImpression(this.A00.A0A.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0E(View view) {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0098  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:24:0x0137  */
    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0F(InterfaceC05170o interfaceC05170o) {
        KX kx;
        if (this.A00.A03 != null) {
            this.A00.A07 = true;
            C1368Zc c1368Zc = this.A00;
            c1368Zc.A02 = c1368Zc.A03.A0F();
            boolean z10 = this.A00.A02 instanceof AbstractC1404aD;
            String[] strArr = A02;
            if (strArr[6].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "VeASnUkJuhfeOmGjJqk9CbDFf3FFhRFx";
            strArr2[5] = "TZLIDWk0RuIbUDThQePy8NEYvQ7OtG1H";
            if (z10) {
                final AbstractC1404aD abstractC1404aD = (AbstractC1404aD) this.A00.A02;
                int iA0l = abstractC1404aD.A0l();
                String[] strArr3 = A02;
                if (strArr3[0].length() != strArr3[3].length()) {
                    String[] strArr4 = A02;
                    strArr4[6] = "g2LThTD3HDKTh";
                    strArr4[2] = "DwNNkt8z8VoEk";
                    if (iA0l > 0) {
                        kx = new KX();
                        if (kx.A09(this.A00.A08, this.A00.A0A.A07(), abstractC1404aD.A0l())) {
                            kx.A08(this.A00.A08, true);
                            C1368Zc c1368Zc2 = this.A00;
                            c1368Zc2.A01 = kx.A06(c1368Zc2.A08, this.A00.A0A.A09(), this.A00.A0A.A07());
                        } else {
                            kx.A08(this.A00.A08, false);
                        }
                    }
                } else if (iA0l > 0) {
                    kx = new KX();
                    if (kx.A09(this.A00.A08, this.A00.A0A.A07(), abstractC1404aD.A0l())) {
                        kx.A08(this.A00.A08, true);
                        C1368Zc c1368Zc3 = this.A00;
                        c1368Zc3.A01 = kx.A06(c1368Zc3.A08, this.A00.A0A.A09(), this.A00.A0A.A07());
                    } else {
                        kx.A08(this.A00.A08, false);
                    }
                }
                if (this.A00.A01 == null) {
                    this.A00.A09.onAdLoaded(this.A00.A0A.A01());
                    return;
                }
                abstractC1404aD.A0x(true);
                InterstitialAd.InterstitialLoadAdConfig loadAdConfig = this.A00.A01.buildLoadAdConfig().withAdListener(new InterstitialAdListener() { // from class: com.facebook.ads.redexgen.X.1z
                    @Override // com.facebook.ads.AdListener
                    public final void onAdClicked(com.facebook.ads.Ad ad2) {
                    }

                    @Override // com.facebook.ads.AdListener
                    public final void onAdLoaded(com.facebook.ads.Ad ad2) {
                        this.A01.A00.A09.onAdLoaded(this.A01.A00.A0A.A01());
                    }

                    @Override // com.facebook.ads.AdListener
                    public final void onError(com.facebook.ads.Ad ad2, AdError adError) {
                        this.A01.A00.A01 = null;
                        abstractC1404aD.A0x(false);
                        this.A01.A00.A09.onAdLoaded(this.A01.A00.A0A.A01());
                    }

                    @Override // com.facebook.ads.InterstitialAdListener
                    public final void onInterstitialDismissed(com.facebook.ads.Ad ad2) {
                        this.A01.A00.A06 = false;
                        if (this.A01.A00.A03 != null) {
                            this.A01.A00.A03.A0O(new C1371Zg(this));
                            this.A01.A00.A03.A0J();
                            this.A01.A00.A03 = null;
                        }
                        this.A01.A00.A09.onInterstitialDismissed(this.A01.A00.A0A.A01());
                        this.A01.A00.A05.A05();
                    }

                    @Override // com.facebook.ads.InterstitialAdListener
                    public final void onInterstitialDisplayed(com.facebook.ads.Ad ad2) {
                    }

                    @Override // com.facebook.ads.AdListener
                    public final void onLoggingImpression(com.facebook.ads.Ad ad2) {
                    }
                }).withCacheFlags(this.A00.A0A.A0A()).withRewardData(this.A00.A0A.A03()).build();
                this.A00.A01.loadAd(loadAdConfig);
                return;
            }
            this.A00.A09.onAdLoaded(this.A00.A0A.A01());
            return;
        }
        this.A00.A08.A07().A9K(A00(0, 3, 124), C06937v.A0N, new C06947w(A00(3, 18, 0)));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0G(JD jd2) {
        this.A00.A08.A0E().A2h(LF.A01(this.A00.A00), jd2.A03().getErrorCode(), jd2.A04());
        this.A00.A09.onError(this.A00.A0A.A01(), KZ.A00(jd2));
    }
}
