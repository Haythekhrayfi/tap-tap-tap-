package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdSettings;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05451q {
    public static String[] A0D = {"erlsxJKV5RGKo0fyhsjft4C8myFkBTFD", "xxCOSS58nTJL4g358MAx2boWparhVsnt", "50HA7KO7TX73z1", "kwTSvTyvqMkAeNvnsZNufhK8xoNKpC5A", "CvvJJ5wn5WoPjh", "PJeUG8MSArG13FCqdbuWaTyquTMQa3YW", "KbVXHt7uQSAfPtAdYM2eE220TAgmiqZ3", "QWgxf2msfb1fWKXeTjGnwNJbVHOPLzwf"};
    public int A00;
    public long A01;
    public RewardData A02;
    public EnumC0955Iv A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final JG A07;
    public final JI A08;
    public final String A09;
    public final EnumSet<CacheFlag> A0A;
    public final int A0B;
    public final AdPlacementType A0C;

    public C05451q(String str, JI ji, AdPlacementType adPlacementType, JG jg, int i10) {
        this(str, ji, adPlacementType, jg, i10, EnumSet.of(CacheFlag.NONE));
    }

    public C05451q(String str, JI ji, AdPlacementType adPlacementType, JG jg, int i10, EnumSet<CacheFlag> cacheFlags) {
        this.A09 = str;
        this.A0C = adPlacementType;
        this.A07 = jg;
        this.A0B = i10;
        this.A0A = cacheFlags;
        this.A08 = ji;
        this.A00 = -1;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0C;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        JG jg = this.A07;
        if (jg == null) {
            return AdPlacementType.NATIVE;
        }
        if (jg == JG.A07) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final C0962Jd A01(C1337Xw c1337Xw, JN jn, AdExperienceType adExperienceType) {
        L0 l10;
        String adTypeString;
        String str = this.A09;
        JG jg = this.A07;
        if (jg != null) {
            l10 = new L0(jg.A03(), this.A07.A02());
        } else {
            l10 = null;
        }
        JI ji = this.A08;
        if (AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT) {
            adTypeString = AdSettings.getTestAdType().getAdTypeString();
        } else {
            adTypeString = null;
        }
        C0962Jd c0962Jd = new C0962Jd(c1337Xw, str, l10, ji, adTypeString, this.A0B, AdSettings.isTestMode(c1337Xw), AdSettings.isMixedAudience(), jn, L6.A01(IN.A0J(c1337Xw)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null);
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[0] = "1YKhexqCB6oyofjWexJTrFb8PReFz0lW";
        strArr2[3] = "PDYLpd11u8hpbIrKg4rw9QV8MRNrtAlX";
        return c0962Jd;
    }

    public final void A02(int i10) {
        this.A00 = i10;
    }

    public final void A03(long j10) {
        this.A01 = j10;
    }

    public final void A04(RewardData rewardData) {
        this.A02 = rewardData;
    }

    public final void A05(EnumC0955Iv enumC0955Iv) {
        this.A03 = enumC0955Iv;
    }

    public final void A06(String str) {
        this.A04 = str;
    }

    public final void A07(String str) {
        this.A05 = str;
    }

    public final void A08(boolean z10) {
        this.A06 = z10;
    }
}
