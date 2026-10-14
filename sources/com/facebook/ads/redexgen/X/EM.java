package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EM extends AbstractC1373Zi {
    public static String[] A02 = {"6CKGqR2K2MH05agWbJN3ka4F1ij3xhtD", "25gFyXHUhXKi43K8KJ4chgoS7w07JQQZ", "vjdmG7Wc53PSGoj25veSMfUO8xL7SxfR", "TQa00i6LjIP9KGMZzj8Rx2HUQjG1dRa1", "ap4e45gngLG", "PTi4Abr85pNMPfkRgyZo1NxbOs1aDg0f", "O7pu2EfbMgektne8Y3vUNLOEHbflJ4Uv", "IlEhKaiOmMN"};
    public ZZ A00;
    public final AnonymousClass25 A01;

    public EM(AnonymousClass25 anonymousClass25) {
        super(anonymousClass25.A0B, A00(anonymousClass25));
        this.A01 = anonymousClass25;
    }

    public static ZU A00(AnonymousClass25 anonymousClass25) {
        return new ZU(anonymousClass25);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1373Zi
    public final void A05() {
        ZZ zz = this.A00;
        if (zz != null) {
            zz.A0H();
        }
        super.A00.AF1(EnumC05501v.A04);
    }

    public final ZZ A07() {
        return this.A00;
    }

    public final void A08() {
        ZZ zz = new ZZ(this.A01, this, this.A02);
        this.A00 = zz;
        zz.A0L(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    public final void A09(com.facebook.ads.Ad ad2, String str, AdExperienceType adExperienceType, boolean z10) {
        if (super.A00.A5X()) {
            return;
        }
        this.A01.A01(ad2);
        ZZ zz = this.A00;
        if (zz != null) {
            zz.A0L(str, adExperienceType, z10);
            String[] strArr = A02;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "snzzAybKLkKRz85P4BzzU6VwJ24uwEo8";
            strArr2[1] = "iwkpZYLOXs3iYxZlCgOD0Nxy0vDnSGoK";
            return;
        }
        this.A01.A05 = str;
        this.A01.A02 = adExperienceType;
        this.A01.A08 = z10;
        A08();
    }

    public final void A0A(RewardData rewardData) {
        this.A01.A03 = rewardData;
        ZZ zz = this.A00;
        if (zz != null) {
            zz.A0J(rewardData);
        }
    }

    public final boolean A0B() {
        ZZ zz = this.A00;
        if (zz != null) {
            return zz.A0M();
        }
        return this.A01.A01 > 0 && LF.A00() > this.A01.A01;
    }

    public final boolean A0C() {
        ZZ zz = this.A00;
        if (zz != null) {
            return zz.A0N();
        }
        return super.A00.A5q() == EnumC05501v.A06;
    }

    public final boolean A0D(com.facebook.ads.Ad ad2, RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int iA00 = ((C06415l) rewardedVideoShowAdConfig).A00();
        long jA01 = ((C06415l) rewardedVideoShowAdConfig).A01();
        if (super.A00.A5Y()) {
            return false;
        }
        this.A01.A01(ad2);
        ZZ zz = this.A00;
        if (zz != null) {
            return zz.A0O(iA00, jA01);
        }
        ZZ zz2 = new ZZ(this.A01, this, this.A02);
        this.A00 = zz2;
        zz2.A0O(iA00, jA01);
        return false;
    }
}
