package com.zipoapps.ads.config;

import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import fd.j0;
import java.util.List;
import l1.e;
import l1.f;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class AdManagerConfiguration {
    private final String banner;
    private final String bannerMRec;
    private final String exit_banner;
    private final String exit_native;
    private final String interstitial;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    private final String f1native;
    private final String rewarded;
    private final List<String> testAdvertisingIds;

    public static final class Builder {
        private String banner;
        private String bannerMRec;
        private String exit_banner;
        private String exit_native;
        private String interstitial;

        /* JADX INFO: renamed from: native, reason: not valid java name */
        private String f2native;
        private String rewarded;
        private List<String> testAdvertisingIds;

        public Builder() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        public Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list) {
            this.banner = str;
            this.bannerMRec = str2;
            this.interstitial = str3;
            this.f2native = str4;
            this.rewarded = str5;
            this.exit_banner = str6;
            this.exit_native = str7;
            this.testAdvertisingIds = list;
        }

        public /* synthetic */ Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i10, g gVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) == 0 ? list : null);
        }

        private final String component1() {
            return this.banner;
        }

        private final String component2() {
            return this.bannerMRec;
        }

        private final String component3() {
            return this.interstitial;
        }

        private final String component4() {
            return this.f2native;
        }

        private final String component5() {
            return this.rewarded;
        }

        private final String component6() {
            return this.exit_banner;
        }

        private final String component7() {
            return this.exit_native;
        }

        private final List<String> component8() {
            return this.testAdvertisingIds;
        }

        public final Builder bannerAd(String str) {
            j0.i(str, "bannerId");
            this.banner = str;
            return this;
        }

        public final Builder bannerMRecAd(String str) {
            j0.i(str, "mRecId");
            this.bannerMRec = str;
            return this;
        }

        public final AdManagerConfiguration build() {
            String str = this.interstitial;
            if (str == null) {
                throw new IllegalStateException("Interstitial unit Id is mandatory".toString());
            }
            String str2 = this.banner;
            if (str2 == null) {
                throw new IllegalStateException("Banner unit Id is mandatory".toString());
            }
            String str3 = this.f2native;
            if (str3 == null) {
                throw new IllegalStateException("Native unit Id is mandatory".toString());
            }
            String str4 = this.rewarded;
            if (str4 != null) {
                return new AdManagerConfiguration(str2, this.bannerMRec, str, str3, str4, this.exit_banner, this.exit_native, this.testAdvertisingIds);
            }
            throw new IllegalStateException("Rewarded unit Id is mandatory".toString());
        }

        public final Builder copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list) {
            return new Builder(str, str2, str3, str4, str5, str6, str7, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return j0.d(this.banner, builder.banner) && j0.d(this.bannerMRec, builder.bannerMRec) && j0.d(this.interstitial, builder.interstitial) && j0.d(this.f2native, builder.f2native) && j0.d(this.rewarded, builder.rewarded) && j0.d(this.exit_banner, builder.exit_banner) && j0.d(this.exit_native, builder.exit_native) && j0.d(this.testAdvertisingIds, builder.testAdvertisingIds);
        }

        public final Builder exitBannerAd(String str) {
            j0.i(str, "bannerId");
            this.exit_banner = str;
            return this;
        }

        public final Builder exitNativeAd(String str) {
            j0.i(str, "nativeId");
            this.exit_native = str;
            return this;
        }

        public int hashCode() {
            String str = this.banner;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bannerMRec;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.interstitial;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f2native;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.rewarded;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.exit_banner;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.exit_native;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            List<String> list = this.testAdvertisingIds;
            return iHashCode7 + (list != null ? list.hashCode() : 0);
        }

        public final Builder interstitialAd(String str) {
            j0.i(str, "interstitialId");
            this.interstitial = str;
            return this;
        }

        public final Builder nativeAd(String str) {
            j0.i(str, "nativeId");
            this.f2native = str;
            return this;
        }

        public final Builder rewardedAd(String str) {
            j0.i(str, "rewardedId");
            this.rewarded = str;
            return this;
        }

        public final Builder testAdvertisingIds(List<String> list) {
            j0.i(list, "ids");
            this.testAdvertisingIds = list;
            return this;
        }

        public String toString() {
            StringBuilder sbA = a.a("Builder(banner=");
            sbA.append(this.banner);
            sbA.append(", bannerMRec=");
            sbA.append(this.bannerMRec);
            sbA.append(", interstitial=");
            sbA.append(this.interstitial);
            sbA.append(", native=");
            sbA.append(this.f2native);
            sbA.append(", rewarded=");
            sbA.append(this.rewarded);
            sbA.append(", exit_banner=");
            sbA.append(this.exit_banner);
            sbA.append(", exit_native=");
            sbA.append(this.exit_native);
            sbA.append(", testAdvertisingIds=");
            return f.a(sbA, this.testAdvertisingIds, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public AdManagerConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list) {
        j0.i(str3, "interstitial");
        this.banner = str;
        this.bannerMRec = str2;
        this.interstitial = str3;
        this.f1native = str4;
        this.rewarded = str5;
        this.exit_banner = str6;
        this.exit_native = str7;
        this.testAdvertisingIds = list;
    }

    public /* synthetic */ AdManagerConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, list);
    }

    public final String component1() {
        return this.banner;
    }

    public final String component2() {
        return this.bannerMRec;
    }

    public final String component3() {
        return this.interstitial;
    }

    public final String component4() {
        return this.f1native;
    }

    public final String component5() {
        return this.rewarded;
    }

    public final String component6() {
        return this.exit_banner;
    }

    public final String component7() {
        return this.exit_native;
    }

    public final List<String> component8() {
        return this.testAdvertisingIds;
    }

    public final AdManagerConfiguration copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list) {
        j0.i(str3, "interstitial");
        return new AdManagerConfiguration(str, str2, str3, str4, str5, str6, str7, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdManagerConfiguration)) {
            return false;
        }
        AdManagerConfiguration adManagerConfiguration = (AdManagerConfiguration) obj;
        return j0.d(this.banner, adManagerConfiguration.banner) && j0.d(this.bannerMRec, adManagerConfiguration.bannerMRec) && j0.d(this.interstitial, adManagerConfiguration.interstitial) && j0.d(this.f1native, adManagerConfiguration.f1native) && j0.d(this.rewarded, adManagerConfiguration.rewarded) && j0.d(this.exit_banner, adManagerConfiguration.exit_banner) && j0.d(this.exit_native, adManagerConfiguration.exit_native) && j0.d(this.testAdvertisingIds, adManagerConfiguration.testAdvertisingIds);
    }

    public final String getBanner() {
        return this.banner;
    }

    public final String getBannerMRec() {
        return this.bannerMRec;
    }

    public final String getExit_banner() {
        return this.exit_banner;
    }

    public final String getExit_native() {
        return this.exit_native;
    }

    public final String getInterstitial() {
        return this.interstitial;
    }

    public final String getNative() {
        return this.f1native;
    }

    public final String getRewarded() {
        return this.rewarded;
    }

    public final List<String> getTestAdvertisingIds() {
        return this.testAdvertisingIds;
    }

    public int hashCode() {
        String str = this.banner;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bannerMRec;
        int iA = e.a(this.interstitial, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f1native;
        int iHashCode2 = (iA + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rewarded;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.exit_banner;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.exit_native;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.testAdvertisingIds;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = a.a("AdManagerConfiguration(banner=");
        sbA.append(this.banner);
        sbA.append(", bannerMRec=");
        sbA.append(this.bannerMRec);
        sbA.append(", interstitial=");
        sbA.append(this.interstitial);
        sbA.append(", native=");
        sbA.append(this.f1native);
        sbA.append(", rewarded=");
        sbA.append(this.rewarded);
        sbA.append(", exit_banner=");
        sbA.append(this.exit_banner);
        sbA.append(", exit_native=");
        sbA.append(this.exit_native);
        sbA.append(", testAdvertisingIds=");
        return f.a(sbA, this.testAdvertisingIds, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
