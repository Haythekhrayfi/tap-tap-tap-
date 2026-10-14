package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzbzr;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class RequestConfiguration {
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    private final int zzb;
    private final int zzc;

    @Nullable
    private final String zzd;
    private final List zze;
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final List zza = Arrays.asList(MAX_AD_CONTENT_RATING_MA, MAX_AD_CONTENT_RATING_T, MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G);

    public static class Builder {
        private int zza = -1;
        private int zzb = -1;

        @Nullable
        private String zzc = null;
        private final List zzd = new ArrayList();

        public RequestConfiguration build() {
            return new RequestConfiguration(this.zza, this.zzb, this.zzc, this.zzd, null);
        }

        public Builder setMaxAdContentRating(@Nullable String str) {
            if (str != null && !"".equals(str)) {
                if (!RequestConfiguration.MAX_AD_CONTENT_RATING_G.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_T.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                    zzbzr.zzj("Invalid value passed to setMaxAdContentRating: ".concat(str));
                }
                return this;
            }
            str = null;
            this.zzc = str;
            return this;
        }

        public Builder setTagForChildDirectedTreatment(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.zza = i10;
            } else {
                zzbzr.zzj("Invalid value passed to setTagForChildDirectedTreatment: " + i10);
            }
            return this;
        }

        public Builder setTagForUnderAgeOfConsent(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.zzb = i10;
            } else {
                zzbzr.zzj("Invalid value passed to setTagForUnderAgeOfConsent: " + i10);
            }
            return this;
        }

        public Builder setTestDeviceIds(@Nullable List<String> list) {
            this.zzd.clear();
            if (list != null) {
                this.zzd.addAll(list);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForUnderAgeOfConsent {
    }

    public /* synthetic */ RequestConfiguration(int i10, int i11, String str, List list, zzh zzhVar) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = str;
        this.zze = list;
    }

    public String getMaxAdContentRating() {
        String str = this.zzd;
        return str == null ? "" : str;
    }

    public int getTagForChildDirectedTreatment() {
        return this.zzb;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.zzc;
    }

    public List<String> getTestDeviceIds() {
        return new ArrayList(this.zze);
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setTagForChildDirectedTreatment(this.zzb);
        builder.setTagForUnderAgeOfConsent(this.zzc);
        builder.setMaxAdContentRating(this.zzd);
        builder.setTestDeviceIds(this.zze);
        return builder;
    }
}
