package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAdListener;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.25, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass25 {
    public static String[] A0D = {"pQFQWrff5apwgeDCfICDjWO2FINXUEGY", "Zrlf7mbphLj9aknW7PcFFQ", "n3KJlhWP5Ju2JP4ez23sn5JFnk3TGtqs", "LKe9A2", "QZ6oU5eByjCJaazPOJhmSAWWHc", "bIzEhjdis4s2Gtu6NLj44xIWpvJeHb48", "cSwbeF06gtlZkK5ZI0p5Ev", "223A19fPLhE6SS6l"};
    public int A00 = -1;
    public long A01 = -1;
    public AdExperienceType A02;
    public RewardData A03;
    public RewardedVideoAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public com.facebook.ads.Ad A09;
    public WeakReference<com.facebook.ads.Ad> A0A;
    public final C1337Xw A0B;
    public final String A0C;

    public AnonymousClass25(C1337Xw c1337Xw, String str, com.facebook.ads.Ad ad2) {
        this.A0B = c1337Xw;
        this.A0C = str;
        this.A09 = ad2;
        this.A0A = new WeakReference<>(ad2);
    }

    public final com.facebook.ads.Ad A00() {
        com.facebook.ads.Ad ad2 = this.A09;
        return ad2 != null ? ad2 : this.A0A.get();
    }

    public final void A01(com.facebook.ads.Ad ad2) {
        if (ad2 == null) {
            C1337Xw c1337Xw = this.A0B;
            String[] strArr = A0D;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A0D[4] = "e0pPDU8i87wGcMU5DIxBijYJQd";
            if (!IN.A0q(c1337Xw)) {
                return;
            }
        }
        this.A09 = ad2;
    }
}
